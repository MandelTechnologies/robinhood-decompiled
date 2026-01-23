package com.robinhood.utils.moshi.jsonadapter.datetime;

import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: LocalDateJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/datetime/LocalDateJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "j$/time/LocalDate", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "readFrom", "(Lcom/squareup/moshi/JsonReader;)Lj$/time/LocalDate;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "writeTo", "(Lcom/squareup/moshi/JsonWriter;Lj$/time/LocalDate;)V", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LocalDateJsonAdapter extends NullSafeJsonAdapter<LocalDate> {
    public static final LocalDateJsonAdapter INSTANCE = new LocalDateJsonAdapter();

    private LocalDateJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    @FromJson
    public LocalDate readFrom(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        LocalDate localDate = LocalDate.parse(reader.nextString());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    @ToJson
    public void writeTo(JsonWriter writer, LocalDate value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.toString());
    }
}
