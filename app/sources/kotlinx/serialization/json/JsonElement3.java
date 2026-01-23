package kotlinx.serialization.json;

import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptor2;
import kotlinx.serialization.json.internal.JsonExceptions;
import kotlinx.serialization.json.internal.JsonExceptions2;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOps;

/* compiled from: JsonElement.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001e\u001a\u00020\u001b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010!\u001a\u0004\u0018\u00010\u001b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010%\u001a\u00020\"*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010)\u001a\u00020&*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010-\u001a\u00020**\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0017\u00100\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0017\u00103\u001a\u0004\u0018\u00010\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m3636d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "JsonPrimitive", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", "JsonUnquotedLiteral", "Lkotlinx/serialization/json/JsonElement;", "element", "", "error", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "", "getLong", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "float", "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.serialization.json.JsonElementKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonElement3 {
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptor2.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializers.serializer(StringCompanionObject.INSTANCE));

    public static final JsonElement7 JsonPrimitive(Boolean bool) {
        if (bool == null) {
            return JsonElement5.INSTANCE;
        }
        return new JsonElement4(bool, false, null, 4, null);
    }

    public static final JsonElement7 JsonPrimitive(Number number) {
        if (number == null) {
            return JsonElement5.INSTANCE;
        }
        return new JsonElement4(number, false, null, 4, null);
    }

    public static final JsonElement7 JsonPrimitive(String str) {
        if (str == null) {
            return JsonElement5.INSTANCE;
        }
        return new JsonElement4(str, true, null, 4, null);
    }

    public static final JsonElement7 JsonUnquotedLiteral(String str) {
        if (str == null) {
            return JsonElement5.INSTANCE;
        }
        if (Intrinsics.areEqual(str, JsonElement5.INSTANCE.getContent())) {
            throw new JsonExceptions2("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonElement4(str, false, jsonUnquotedLiteralDescriptor);
    }

    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static final JsonElement7 getJsonPrimitive(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonElement7 jsonElement7 = jsonElement instanceof JsonElement7 ? (JsonElement7) jsonElement : null;
        if (jsonElement7 != null) {
            return jsonElement7;
        }
        error(jsonElement, "JsonPrimitive");
        throw new ExceptionsH();
    }

    public static final JsonElement6 getJsonObject(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonElement6 jsonElement6 = jsonElement instanceof JsonElement6 ? (JsonElement6) jsonElement : null;
        if (jsonElement6 != null) {
            return jsonElement6;
        }
        error(jsonElement, "JsonObject");
        throw new ExceptionsH();
    }

    public static final int getInt(JsonElement7 jsonElement7) {
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        try {
            long jConsumeNumericLiteral = new StringJsonLexer(jsonElement7.getContent()).consumeNumericLiteral();
            if (-2147483648L <= jConsumeNumericLiteral && jConsumeNumericLiteral <= 2147483647L) {
                return (int) jConsumeNumericLiteral;
            }
            throw new NumberFormatException(jsonElement7.getContent() + " is not an Int");
        } catch (JsonExceptions e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer getIntOrNull(JsonElement7 jsonElement7) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        try {
            lValueOf = Long.valueOf(new StringJsonLexer(jsonElement7.getContent()).consumeNumericLiteral());
        } catch (JsonExceptions unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final long getLong(JsonElement7 jsonElement7) {
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        try {
            return new StringJsonLexer(jsonElement7.getContent()).consumeNumericLiteral();
        } catch (JsonExceptions e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final double getDouble(JsonElement7 jsonElement7) {
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        return Double.parseDouble(jsonElement7.getContent());
    }

    public static final float getFloat(JsonElement7 jsonElement7) {
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        return Float.parseFloat(jsonElement7.getContent());
    }

    public static final Boolean getBooleanOrNull(JsonElement7 jsonElement7) {
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        return StringOps.toBooleanStrictOrNull(jsonElement7.getContent());
    }

    public static final String getContentOrNull(JsonElement7 jsonElement7) {
        Intrinsics.checkNotNullParameter(jsonElement7, "<this>");
        if (jsonElement7 instanceof JsonElement5) {
            return null;
        }
        return jsonElement7.getContent();
    }

    private static final Void error(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }
}
