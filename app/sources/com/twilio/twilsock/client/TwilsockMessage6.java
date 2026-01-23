package com.twilio.twilsock.client;

import com.twilio.twilsock.client.TwilsockMessage;
import com.twilio.util.InternalUtils3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: TwilsockMessage.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockNotificationMessage;", "Lcom/twilio/twilsock/client/TwilsockMessage;", "requestId", "", "rawHeaders", "headers", "Lkotlinx/serialization/json/JsonObject;", "payloadType", "payload", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;)V", "messageType", "getMessageType", "()Ljava/lang/String;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.client.TwilsockNotificationMessage, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockMessage6 extends TwilsockMessage {
    private final String messageType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilsockMessage6(String requestId, String rawHeaders, JsonElement6 headers, String payloadType, String payload) {
        super(requestId, TwilsockMessage.Method.NOTIFICATION, rawHeaders, headers, payloadType, payload, null, 64, null);
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(rawHeaders, "rawHeaders");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        this.messageType = ((NotificationMessageHeaders) json.decodeFromJsonElement(NotificationMessageHeaders.INSTANCE.serializer(), headers)).getMessageType();
    }

    public final String getMessageType() {
        return this.messageType;
    }
}
