package com.robinhood.websocket.p410dx.utils;

import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.robinhood.websocket.p410dx.models.BigDecimalWithNaN;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimalWithNaNJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0015J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0015¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/websocket/dx/utils/BigDecimalWithNaNJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/websocket/dx/models/BigDecimalWithNaN;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BigDecimalWithNaNJsonAdapter extends NullSafeJsonAdapter<BigDecimalWithNaN> {
    public static final BigDecimalWithNaNJsonAdapter INSTANCE = new BigDecimalWithNaNJsonAdapter();

    private BigDecimalWithNaNJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    @FromJson
    public BigDecimalWithNaN readFrom(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String strNextString = reader.nextString();
        if (Intrinsics.areEqual(strNextString, "NaN")) {
            return new BigDecimalWithNaN(null);
        }
        return new BigDecimalWithNaN(new BigDecimal(strNextString));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    @ToJson
    public void writeTo(JsonWriter writer, BigDecimalWithNaN value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimal = value.getBigDecimal();
        if (bigDecimal != null) {
            writer.value(bigDecimal.toPlainString());
        }
    }
}
