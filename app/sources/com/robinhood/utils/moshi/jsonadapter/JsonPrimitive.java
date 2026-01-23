package com.robinhood.utils.moshi.jsonadapter;

import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: JsonPrimitive.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "T", "", "Lcom/robinhood/utils/moshi/jsonadapter/WrappedValue;", "Landroid/os/Parcelable;", "<init>", "()V", "JsonAdapterFactory", "Lcom/robinhood/utils/moshi/jsonadapter/BooleanPrimitive;", "Lcom/robinhood/utils/moshi/jsonadapter/NumberPrimitive;", "Lcom/robinhood/utils/moshi/jsonadapter/StringPrimitive;", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class JsonPrimitive<T> implements WrappedValue<T>, Parcelable {
    public /* synthetic */ JsonPrimitive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JsonPrimitive() {
    }

    /* compiled from: JsonPrimitive.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive$JsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class JsonAdapterFactory implements JsonAdapter.Factory {
        public static final JsonAdapterFactory INSTANCE = new JsonAdapterFactory();

        private JsonAdapterFactory() {
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type2);
            if (Intrinsics.areEqual(rawType, JsonPrimitive.class) || Intrinsics.areEqual(rawType, JsonPrimitive5.class)) {
                return Adapter.INSTANCE;
            }
            return null;
        }

        /* compiled from: JsonPrimitive.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0014¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive$JsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        private static final class Adapter extends NullSafeJsonAdapter<JsonPrimitive<?>> {
            public static final Adapter INSTANCE = new Adapter();

            /* compiled from: JsonPrimitive.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes12.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[JsonReader.Token.values().length];
                    try {
                        iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[JsonReader.Token.END_ARRAY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[JsonReader.Token.END_OBJECT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[JsonReader.Token.NAME.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[JsonReader.Token.END_DOCUMENT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[JsonReader.Token.STRING.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[JsonReader.Token.NUMBER.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[JsonReader.Token.BOOLEAN.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[JsonReader.Token.NULL.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Adapter() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
            public JsonPrimitive<?> readFrom(JsonReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                JsonReader.Token tokenPeek = reader.peek();
                switch (tokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tokenPeek.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        throw new JsonDataException("Unexpected token: " + tokenPeek);
                    case 7:
                        String strNextString = reader.nextString();
                        Intrinsics.checkNotNullExpressionValue(strNextString, "nextString(...)");
                        return new JsonPrimitive6(strNextString);
                    case 8:
                        String strNextString2 = reader.nextString();
                        Intrinsics.checkNotNull(strNextString2);
                        return StringsKt.contains$default((CharSequence) strNextString2, '.', false, 2, (Object) null) ? new DecimalPrimitive(new BigDecimal(strNextString2)) : new IntegerPrimitive(Long.parseLong(strNextString2));
                    case 9:
                        return new JsonPrimitive2(reader.nextBoolean());
                    case 10:
                        return null;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
            public void writeTo(JsonWriter writer, JsonPrimitive<?> value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value instanceof JsonPrimitive2) {
                    writer.value(((JsonPrimitive2) value).getValue2().booleanValue());
                    return;
                }
                if (value instanceof JsonPrimitive6) {
                    writer.value(((JsonPrimitive6) value).getValue2());
                    return;
                }
                if (!(value instanceof JsonPrimitive5)) {
                    throw new NoWhenBranchMatchedException();
                }
                JsonPrimitive5 jsonPrimitive5 = (JsonPrimitive5) value;
                if (jsonPrimitive5 instanceof IntegerPrimitive) {
                    writer.value(((IntegerPrimitive) value).getValue2().longValue());
                } else {
                    if (!(jsonPrimitive5 instanceof DecimalPrimitive)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    writer.value(((DecimalPrimitive) value).getValue2());
                }
            }
        }
    }
}
