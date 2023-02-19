package com.citi.leo.news.proto;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class NewsClient {

    private static final String host = "localhost";
    private static final int serverPort = 9999;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext()
                .build();
        try {
            NewsServiceGrpc.NewsServiceBlockingStub blockingStub = NewsServiceGrpc.newBlockingStub(channel);
            NewsProto.NewsRequest request = NewsProto.NewsRequest.newBuilder().setDate("20230214").build();
            NewsProto.NewsResponse response = blockingStub.list(request);
            List<NewsProto.News> newsList = response.getNewsList();
            for (NewsProto.News news :
                    newsList) {
                System.out.println(news.getTitle() + ":" + news.getContent());
            }
        } finally {
            channel.shutdown();
        }
    }
}
