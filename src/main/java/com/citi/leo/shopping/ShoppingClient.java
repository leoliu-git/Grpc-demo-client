package com.citi.leo.shopping;

import com.citi.leo.shopping.proto.ShoppingProto;
import com.citi.leo.shopping.proto.ShoppingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class ShoppingClient {

    private static final String host = "localhost";
    private static final int serverPort = 9999;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext().build();
        try {
            ShoppingServiceGrpc.ShoppingServiceBlockingStub blockingStub = ShoppingServiceGrpc.newBlockingStub(channel);
            ShoppingProto.ShoppingRequest request = ShoppingProto.ShoppingRequest.newBuilder()
                    .setCommodityType("computer").build();
            ShoppingProto.ShoppingResponse response = blockingStub.search(request);
            List<ShoppingProto.Commodity> commodityList = response.getCommodityList();
            for (ShoppingProto.Commodity commodity : commodityList) {
                System.out.println(commodity.getBrand() + ": " + commodity.getPrice());
            }
        } finally {
            channel.shutdown();
        }
    }
}
