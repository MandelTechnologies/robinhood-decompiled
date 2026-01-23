package com.twilio.twilsock.client;

import com.twilio.twilsock.client.TwilsockMessage;
import com.twilio.util.InternalUtils3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: TwilsockMessage.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"TWILSOCK_PREFIX", "", "encode", "Lcom/twilio/twilsock/client/TwilsockMessage;", "encodeToByteArray", "", "parse", "Lcom/twilio/twilsock/client/TwilsockMessage$Companion;", "message", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.client.TwilsockMessageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TwilsockMessage5 {
    private static final String TWILSOCK_PREFIX = "TWILSOCK V3.0";

    /* compiled from: TwilsockMessage.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockMessageKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TwilsockMessage.Method.values().length];
            try {
                iArr[TwilsockMessage.Method.REPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TwilsockMessage.Method.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TwilsockMessage.Method.CLIENT_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TwilsockMessage.Method.NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TwilsockMessage.Method.PING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final byte[] encodeToByteArray(TwilsockMessage twilsockMessage) {
        Intrinsics.checkNotNullParameter(twilsockMessage, "<this>");
        byte[] rawMessage = twilsockMessage.getRawMessage();
        return rawMessage == null ? StringsKt.encodeToByteArray(encode(twilsockMessage)) : rawMessage;
    }

    public static final String encode(TwilsockMessage twilsockMessage) {
        Intrinsics.checkNotNullParameter(twilsockMessage, "<this>");
        TwilsockMessage.Method method = twilsockMessage.getMethod();
        String requestId = twilsockMessage.getRequestId();
        Integer numValueOf = Integer.valueOf(StringsKt.encodeToByteArray(twilsockMessage.getPayload()).length);
        if (twilsockMessage.getPayload().length() <= 0) {
            numValueOf = null;
        }
        TwilsockMessage.Headers headers = new TwilsockMessage.Headers(method, requestId, numValueOf, twilsockMessage.getPayload().length() > 0 ? twilsockMessage.getPayloadType() : null);
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        String string2 = new JsonElement6(MapsKt.plus(JsonElement3.getJsonObject(json.encodeToJsonElement(TwilsockMessage.Headers.INSTANCE.serializer(), headers)), twilsockMessage.getHeaders())).toString();
        return "TWILSOCK V3.0 " + StringsKt.encodeToByteArray(string2).length + "\r\n" + string2 + "\r\n" + twilsockMessage.getPayload() + (twilsockMessage.getPayload().length() == 0 ? "" : "\r\n");
    }

    public static final TwilsockMessage parse(TwilsockMessage.Companion companion, String message) throws Throwable {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!StringsKt.startsWith$default(message, TWILSOCK_PREFIX, false, 2, (Object) null)) {
            throw new IllegalArgumentException("Invalid twilsock prefix");
        }
        List listSplit$default = StringsKt.split$default((CharSequence) message, new String[]{"\r\n"}, false, 0, 6, (Object) null);
        String str = (String) listSplit$default.get(0);
        String str2 = (String) listSplit$default.get(1);
        String str3 = (String) listSplit$default.get(2);
        String str4 = (String) StringsKt.split$default((CharSequence) str, new char[]{' '}, false, 0, 6, (Object) null).get(2);
        int length = StringsKt.encodeToByteArray(str2).length;
        if (length != Integer.parseInt(str4)) {
            throw new IllegalArgumentException(("Invalid header size: expected = " + str4 + "; actual = " + length).toString());
        }
        JsonElement6 jsonObject = JsonElement3.getJsonObject(InternalUtils3.getJson().parseToJsonElement(str2));
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        TwilsockMessage.Headers headers = (TwilsockMessage.Headers) json.decodeFromJsonElement(TwilsockMessage.Headers.INSTANCE.serializer(), jsonObject);
        String payloadType = headers.getPayloadType();
        if (payloadType == null) {
            payloadType = "";
        }
        String str5 = payloadType;
        int i = WhenMappings.$EnumSwitchMapping$0[headers.getMethod().ordinal()];
        if (i == 1) {
            return new TwilsockMessage8(headers.getRequestId(), str2, jsonObject, str5, str3);
        }
        if (i == 2) {
            return new TwilsockMessage3(headers.getRequestId(), str2, jsonObject, str5, str3);
        }
        if (i == 3) {
            return new TwilsockMessage2(headers.getRequestId(), str2, jsonObject, str5, str3);
        }
        if (i == 4) {
            return new TwilsockMessage6(headers.getRequestId(), str2, jsonObject, str5, str3);
        }
        if (i == 5) {
            return new TwilsockMessage7(headers.getRequestId(), str2, jsonObject, str5, str3);
        }
        return new TwilsockMessage(headers.getRequestId(), headers.getMethod(), str2, jsonObject, str5, str3, null, 64, null);
    }
}
