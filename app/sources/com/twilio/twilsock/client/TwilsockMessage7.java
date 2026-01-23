package com.twilio.twilsock.client;

import com.twilio.twilsock.client.TwilsockMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: TwilsockMessage.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockPingMessage;", "Lcom/twilio/twilsock/client/TwilsockMessage;", "requestId", "", "rawHeaders", "headers", "Lkotlinx/serialization/json/JsonObject;", "payloadType", "payload", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;)V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.client.TwilsockPingMessage, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockMessage7 extends TwilsockMessage {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilsockMessage7(String requestId, String rawHeaders, JsonElement6 headers, String payloadType, String payload) {
        super(requestId, TwilsockMessage.Method.PING, rawHeaders, headers, payloadType, payload, null, 64, null);
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(rawHeaders, "rawHeaders");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        Intrinsics.checkNotNullParameter(payload, "payload");
    }
}
