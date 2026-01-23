package com.robinhood.utils.moshi.jsonadapter;

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
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BigDecimalJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/BigDecimalJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "StringAdapter", "NumberAdapter", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class BigDecimalJsonAdapterFactory implements JsonAdapter.Factory {
    public static final BigDecimalJsonAdapterFactory INSTANCE = new BigDecimalJsonAdapterFactory();

    private BigDecimalJsonAdapterFactory() {
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (!Intrinsics.areEqual(_MoshiKotlinTypesExtensionsKt.getRawType(type2), BigDecimal.class)) {
            return null;
        }
        Set<? extends Annotation> set = annotations;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((Annotation) it.next()) instanceof JsonNumber) {
                    return NumberAdapter.INSTANCE;
                }
            }
        }
        return StringAdapter.INSTANCE;
    }

    /* compiled from: BigDecimalJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/BigDecimalJsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Ljava/math/BigDecimal;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static abstract class Adapter extends NullSafeJsonAdapter<BigDecimal> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public BigDecimal readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String strNextString = reader.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e) {
                throw new JsonDataException("Expected a BigDecimal but was " + strNextString, e);
            }
        }
    }

    /* compiled from: BigDecimalJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/BigDecimalJsonAdapterFactory$StringAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/BigDecimalJsonAdapterFactory$Adapter;", "<init>", "()V", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Ljava/math/BigDecimal;", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class StringAdapter extends Adapter {
        public static final StringAdapter INSTANCE = new StringAdapter();

        private StringAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, BigDecimal value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.value(value.toPlainString());
        }
    }

    /* compiled from: BigDecimalJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/BigDecimalJsonAdapterFactory$NumberAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/BigDecimalJsonAdapterFactory$Adapter;", "<init>", "()V", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "Ljava/math/BigDecimal;", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class NumberAdapter extends Adapter {
        public static final NumberAdapter INSTANCE = new NumberAdapter();

        private NumberAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, BigDecimal value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.value(value);
        }
    }
}
