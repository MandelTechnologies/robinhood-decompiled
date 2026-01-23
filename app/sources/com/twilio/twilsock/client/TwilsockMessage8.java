package com.twilio.twilsock.client;

import com.twilio.twilsock.client.TwilsockMessage;
import com.twilio.util.InternalUtils3;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: TwilsockMessage.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockReplyMessage;", "Lcom/twilio/twilsock/client/TwilsockMessage;", "requestId", "", "rawHeaders", "headers", "Lkotlinx/serialization/json/JsonObject;", "payloadType", "payload", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;)V", "replyHeaders", "Lcom/twilio/twilsock/client/ServerReplyHeaders;", "getReplyHeaders", "()Lcom/twilio/twilsock/client/ServerReplyHeaders;", "replyPayload", "Lcom/twilio/twilsock/client/ServerReplyPayload;", "getReplyPayload", "()Lcom/twilio/twilsock/client/ServerReplyPayload;", "replyPayload$delegate", "Lkotlin/Lazy;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.client.TwilsockReplyMessage, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockMessage8 extends TwilsockMessage {
    private final ServerReplyHeaders replyHeaders;

    /* renamed from: replyPayload$delegate, reason: from kotlin metadata */
    private final Lazy replyPayload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilsockMessage8(String requestId, String rawHeaders, JsonElement6 headers, String payloadType, final String payload) {
        super(requestId, TwilsockMessage.Method.REPLY, rawHeaders, headers, payloadType, payload, null, 64, null);
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(rawHeaders, "rawHeaders");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        this.replyHeaders = (ServerReplyHeaders) json.decodeFromJsonElement(ServerReplyHeaders.INSTANCE.serializer(), headers);
        this.replyPayload = LazyKt.lazy(new Function0<ServerReplyPayload>() { // from class: com.twilio.twilsock.client.TwilsockReplyMessage$replyPayload$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ServerReplyPayload invoke() {
                Object objM28550constructorimpl;
                String str = payload;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Json json2 = InternalUtils3.getJson();
                    json2.getSerializersModule();
                    objM28550constructorimpl = Result.m28550constructorimpl((ServerReplyPayload) json2.decodeFromString(ServerReplyPayload.INSTANCE.serializer(), str));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                    objM28550constructorimpl = new ServerReplyPayload((BackoffPolicy) null, 1, (DefaultConstructorMarker) null);
                }
                return (ServerReplyPayload) objM28550constructorimpl;
            }
        });
    }

    public final ServerReplyHeaders getReplyHeaders() {
        return this.replyHeaders;
    }

    public final ServerReplyPayload getReplyPayload() {
        return (ServerReplyPayload) this.replyPayload.getValue();
    }
}
