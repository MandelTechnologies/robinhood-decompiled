package com.robinhood.enums.moshi;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnumJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\u000bB!\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u000e\u001a(\u0012\f\u0012\n \u0010*\u0004\u0018\u00018\u00008\u0000 \u0010*\u0014\u0012\u000e\b\u0001\u0012\n \u0010*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/enums/moshi/EnumJsonAdapter;", "T", "", "Lcom/squareup/moshi/JsonAdapter;", "enumType", "Ljava/lang/Class;", "fallbackValue", "useFallbackValue", "", "<init>", "(Ljava/lang/Class;Ljava/lang/Enum;Z)V", "(Ljava/lang/Class;)V", "(Ljava/lang/Class;Ljava/lang/Enum;)V", "Ljava/lang/Enum;", "constants", "", "kotlin.jvm.PlatformType", "[Ljava/lang/Enum;", "nameStrings", "", "[Ljava/lang/String;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Enum;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Enum;)V", "toString", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    private final T[] constants;
    private final Class<T> enumType;
    private final T fallbackValue;
    private final String[] nameStrings;
    private final JsonReader.Options options;
    private final boolean useFallbackValue;

    private EnumJsonAdapter(Class<T> cls, T t, boolean z) {
        String strName;
        this.enumType = cls;
        this.fallbackValue = t;
        this.useFallbackValue = z;
        T[] enumConstants = cls.getEnumConstants();
        this.constants = enumConstants;
        int length = enumConstants != null ? enumConstants.length : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            T[] tArr = this.constants;
            Enum r0 = tArr != null ? (Enum) ArraysKt.getOrNull(tArr, i) : null;
            if (r0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strName2 = r0.name();
            try {
                Json json = (Json) this.enumType.getField(strName2).getAnnotation(Json.class);
                if (json != null && (strName = json.name()) != null) {
                    strName2 = strName;
                }
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strName2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                strArr[i] = lowerCase;
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + this.enumType.getName(), e);
            }
        }
        this.nameStrings = strArr;
        this.options = JsonReader.Options.m3152of((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumJsonAdapter(Class<T> enumType) {
        this(enumType, null, false);
        Intrinsics.checkNotNullParameter(enumType, "enumType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumJsonAdapter(Class<T> enumType, T t) {
        this(enumType, t, true);
        Intrinsics.checkNotNullParameter(enumType, "enumType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int iSelectString = reader.selectString(this.options);
        if (iSelectString != -1) {
            T[] tArr = this.constants;
            if (tArr != null) {
                return (T) ArraysKt.getOrNull(tArr, iSelectString);
            }
            return null;
        }
        String path = reader.getPath();
        if (!this.useFallbackValue) {
            String strNextString = reader.nextString();
            throw new JsonDataException("Expected one of " + ArraysKt.toList(this.nameStrings) + " but was " + strNextString + " at path " + path);
        }
        if (reader.peek() != JsonReader.Token.STRING) {
            throw new JsonDataException("Expected a string but was " + reader.peek() + " at path " + path);
        }
        reader.skipValue();
        return this.fallbackValue;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, T value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.value(this.nameStrings[value.ordinal()]);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + ")";
    }
}
