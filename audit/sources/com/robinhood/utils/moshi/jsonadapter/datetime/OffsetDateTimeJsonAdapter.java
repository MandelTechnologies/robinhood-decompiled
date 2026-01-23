package com.robinhood.utils.moshi.jsonadapter.datetime;

import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.OffsetDateTime;

/* compiled from: OffsetDateTimeJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/datetime/OffsetDateTimeJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "j$/time/OffsetDateTime", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "readFrom", "(Lcom/squareup/moshi/JsonReader;)Lj$/time/OffsetDateTime;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "writeTo", "(Lcom/squareup/moshi/JsonWriter;Lj$/time/OffsetDateTime;)V", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OffsetDateTimeJsonAdapter extends NullSafeJsonAdapter<OffsetDateTime> {
    public static final OffsetDateTimeJsonAdapter INSTANCE = new OffsetDateTimeJsonAdapter();

    private OffsetDateTimeJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public OffsetDateTime readFrom(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(reader.nextString());
        Intrinsics.checkNotNullExpressionValue(offsetDateTime, "parse(...)");
        return offsetDateTime;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public void writeTo(JsonWriter writer, OffsetDateTime value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.toString());
    }
}
