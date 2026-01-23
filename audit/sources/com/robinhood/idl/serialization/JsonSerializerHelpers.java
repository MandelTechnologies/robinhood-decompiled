package com.robinhood.idl.serialization;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement7;
import kotlinx.serialization.json.JsonEncoder;

/* compiled from: JsonSerializerHelpers.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\u0010\u0000(\u0000\u001a\u0019\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\u0010\u0000(\u0001\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0001H\u0000\u001a4\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\t0\f¢\u0006\u0002\b\rH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000eò\u0001\b\n\u00020\u0001\n\u00020\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m3636d2 = {"asJsonDecoder", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "asJsonEncoder", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "decodeJsonPrimitive", "Lkotlinx/serialization/json/JsonPrimitive;", "toNumber", "R", "", "convert", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.serialization.JsonSerializerHelpersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class JsonSerializerHelpers {
    public static final JsonDecoder asJsonDecoder(Decoding2 decoding2) {
        Intrinsics.checkNotNullParameter(decoding2, "<this>");
        JsonDecoder jsonDecoder = decoding2 instanceof JsonDecoder ? (JsonDecoder) decoding2 : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format. Expected Decoder to be JsonDecoder, was " + Reflection.getOrCreateKotlinClass(decoding2.getClass()));
    }

    public static final JsonEncoder asJsonEncoder(Encoding4 encoding4) {
        Intrinsics.checkNotNullParameter(encoding4, "<this>");
        JsonEncoder jsonEncoder = encoding4 instanceof JsonEncoder ? (JsonEncoder) encoding4 : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format. Expected Encoder to be JsonEncoder, was " + Reflection.getOrCreateKotlinClass(encoding4.getClass()));
    }

    public static final JsonElement7 decodeJsonPrimitive(JsonDecoder jsonDecoder) {
        Intrinsics.checkNotNullParameter(jsonDecoder, "<this>");
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        JsonElement7 jsonElement7 = jsonElementDecodeJsonElement instanceof JsonElement7 ? (JsonElement7) jsonElementDecodeJsonElement : null;
        if (jsonElement7 != null) {
            return jsonElement7;
        }
        throw new SerializationExceptions2("Expected element to be a JSON primitive, was " + Reflection.getOrCreateKotlinClass(jsonElementDecodeJsonElement.getClass()));
    }

    public static final <R> R toNumber(String str, Function1<? super String, ? extends R> convert) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(convert, "convert");
        try {
            return convert.invoke(str);
        } catch (ArithmeticException e) {
            throw new SerializationExceptions2("Decode failed: " + str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new SerializationExceptions2("Decode failed: " + str, e2);
        } catch (NumberFormatException e3) {
            throw new SerializationExceptions2("Decode failed: " + str, e3);
        }
    }
}
