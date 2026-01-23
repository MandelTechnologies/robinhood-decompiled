package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcChatbotAdminClient.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GrpcChatbotAdminClient;", "Lcom/robinhood/chatbot/proto/v1/ChatbotAdminClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcChatbotAdminClient implements ChatbotAdminClient {
    private final GrpcClient client;

    public GrpcChatbotAdminClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }
}
