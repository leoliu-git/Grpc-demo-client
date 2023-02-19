package com.citi.leo.shopping;

import com.citi.leo.shopping.proto.ShoppingProto;
import com.citi.leo.shopping.proto.ShoppingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class ShoppingClient2 {
    private static final String host = "localhost";
    private static final int serverPort = 9999;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext().build();
        try {
            ShoppingServiceGrpc.ShoppingServiceBlockingStub blockingStub = ShoppingServiceGrpc.newBlockingStub(channel);
            Iterator<ShoppingProto.ShoppingResponse> iterator = blockingStub.list(
                    ShoppingProto.ShoppingRequests.newBuilder()
                            .addCommodityType("computer").addCommodityType("phone")
                            .addCommodityType("car").build());
            while (iterator.hasNext()){
                ShoppingProto.ShoppingResponse next = iterator.next();
                System.out.println(next.getCommodityList().toString());
                System.out.println("---------------------------");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            channel.shutdown();
        }
    }
}
