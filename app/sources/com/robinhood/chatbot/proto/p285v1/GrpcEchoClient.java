package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcEchoClient.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GrpcEchoClient;", "Lcom/robinhood/chatbot/proto/v1/EchoClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "UnaryEcho", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/chatbot/proto/v1/EchoRequest;", "Lcom/robinhood/chatbot/proto/v1/EchoResponse;", "SampleDBRead", "Lcom/robinhood/chatbot/proto/v1/ReadRequest;", "Lcom/robinhood/chatbot/proto/v1/DBObject;", "SampleDBWrite", "Lcom/robinhood/chatbot/proto/v1/WriteRequest;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcEchoClient implements EchoClient {
    private final GrpcClient client;

    public GrpcEchoClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.chatbot.proto.p285v1.EchoClient
    public GrpcCall<EchoRequest, EchoResponse> UnaryEcho() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.Echo/UnaryEcho", EchoRequest.ADAPTER, EchoResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.EchoClient
    public GrpcCall<ReadRequest, DBObject> SampleDBRead() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.Echo/SampleDBRead", ReadRequest.ADAPTER, DBObject.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.EchoClient
    public GrpcCall<WriteRequest, DBObject> SampleDBWrite() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.Echo/SampleDBWrite", WriteRequest.ADAPTER, DBObject.ADAPTER));
    }
}
