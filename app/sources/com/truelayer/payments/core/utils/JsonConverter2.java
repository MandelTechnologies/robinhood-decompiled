package com.truelayer.payments.core.utils;

import android.util.Base64;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: JsonConverter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a3\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00070\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u001a3\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00070\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\r\u001a\u00020\u000bH\u0086\b\u001a8\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u000f\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\u0010\u001a8\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u000f\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\u0010\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0012"}, m3636d2 = {"JsonDefault", "Lkotlinx/serialization/json/Json;", "getJsonDefault", "()Lkotlinx/serialization/json/Json;", "fromBase64Json", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "T", "", "", "Lcom/truelayer/payments/core/utils/JsonConverter;", "base64json", "", "fromJson", "json", "intoBase64Json", "value", "(Lcom/truelayer/payments/core/utils/JsonConverter;Ljava/lang/Object;)Lcom/truelayer/payments/core/domain/utils/Outcome;", "intoJson", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.utils.JsonConverterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class JsonConverter2 {
    private static final Json JsonDefault = Json6.Json$default(null, new Function1<Json4, Unit>() { // from class: com.truelayer.payments.core.utils.JsonConverterKt$JsonDefault$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Json4 json4) {
            invoke2(json4);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Json4 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setCoerceInputValues(true);
            Json.setEncodeDefaults(true);
        }
    }, 1, null);

    public static final /* synthetic */ <T> Outcome<T, Throwable> fromJson(JsonConverter<T> jsonConverter, String json) {
        Intrinsics.checkNotNullParameter(jsonConverter, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Json jsonDefault = getJsonDefault();
            SerializersModule serializersModule = jsonDefault.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, "T");
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return new Ok(jsonDefault.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), json));
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    public static final /* synthetic */ <T> Outcome<String, Throwable> intoBase64Json(JsonConverter<T> jsonConverter, T value) {
        Outcome fail;
        String strEncodeToString;
        Intrinsics.checkNotNullParameter(jsonConverter, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            try {
                Json jsonDefault = getJsonDefault();
                SerializersModule serializersModule = jsonDefault.getSerializersModule();
                Intrinsics.reifiedOperationMarker(6, "T");
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                strEncodeToString = jsonDefault.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), value);
            } catch (Throwable th) {
                fail = new Fail(th);
            }
            if (strEncodeToString.length() == 0) {
                throw new IllegalStateException("Specified `value` was only able to be parsed into an empty string.");
            }
            fail = new Ok(strEncodeToString);
            byte[] bytes = ((String) Outcome.expect$default(fail, null, 1, null)).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String strEncodeToString2 = Base64.encodeToString(bytes, 0);
            if (strEncodeToString2 == null || strEncodeToString2.length() == 0) {
                throw new IllegalStateException("Failed to encode `value` into base64 string");
            }
            Intrinsics.checkNotNull(strEncodeToString2);
            return new Ok(strEncodeToString2);
        } catch (Throwable th2) {
            return new Fail(th2);
        }
    }

    public static final /* synthetic */ <T> Outcome<String, Throwable> intoJson(JsonConverter<T> jsonConverter, T value) {
        Intrinsics.checkNotNullParameter(jsonConverter, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Json jsonDefault = getJsonDefault();
            SerializersModule serializersModule = jsonDefault.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, "T");
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            String strEncodeToString = jsonDefault.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), value);
            if (strEncodeToString.length() == 0) {
                throw new IllegalStateException("Specified `value` was only able to be parsed into an empty string.");
            }
            return new Ok(strEncodeToString);
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    public static final /* synthetic */ <T> Outcome<T, Throwable> fromBase64Json(JsonConverter<T> jsonConverter, String base64json) {
        Outcome fail;
        Intrinsics.checkNotNullParameter(jsonConverter, "<this>");
        Intrinsics.checkNotNullParameter(base64json, "base64json");
        try {
            byte[] bArrDecode = Base64.decode(base64json, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String str = new String(bArrDecode, Charsets.UTF_8);
            if (str.length() != 0) {
                try {
                    Json jsonDefault = getJsonDefault();
                    SerializersModule serializersModule = jsonDefault.getSerializersModule();
                    Intrinsics.reifiedOperationMarker(6, "T");
                    MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                    fail = new Ok(jsonDefault.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), str));
                } catch (Throwable th) {
                    fail = new Fail(th);
                }
                return new Ok(Outcome.expect$default(fail, null, 1, null));
            }
            throw new IllegalStateException("Failed to decode `base64json` into a base64 value.");
        } catch (Throwable th2) {
            return new Fail(th2);
        }
    }

    public static final Json getJsonDefault() {
        return JsonDefault;
    }
}
