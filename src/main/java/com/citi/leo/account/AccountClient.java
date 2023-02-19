package com.citi.leo.account;

import com.citi.leo.account.proto.AccountProto;
import com.citi.leo.account.proto.AccountServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

/**
 * Client side streaming
 */
public class AccountClient {
    private AccountServiceGrpc.AccountServiceStub asyncStub = null;
    private static final String host = "localhost";
    private static final int serverPort = 9999;

    public static void main(String[] args) {
        AccountClient client = new AccountClient();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext().build();
        client.asyncStub = AccountServiceGrpc.newStub(channel);
        try {
            client.RegisterAccounts();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void RegisterAccounts() throws InterruptedException {
        StreamObserver<AccountProto.RegistrationRequest> requestObserver = asyncStub.registerAccount(responseObserver);

        for (int i = 0; i <= 9; i++) {
            AccountProto.RegistrationRequest request = AccountProto.RegistrationRequest.newBuilder().setPhoneNumber(
                    String.valueOf(1398888888 + i)).build();
            requestObserver.onNext(request);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                requestObserver.onError(e);
                throw e;
            }
        }
        requestObserver.onCompleted();
        Thread.sleep(2000);
    }

    /**
     * Listen response from server
     */
    StreamObserver<AccountProto.RegistrationResponse> responseObserver = new StreamObserver<AccountProto.RegistrationResponse>() {
        @Override
        public void onNext(AccountProto.RegistrationResponse registrationResponse) {
            System.out.println(registrationResponse.getResult());
        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onCompleted() {
            System.out.println("Registration done!");
        }
    };


}
