package com.robinhood.utils.moshi.jsonadapter.datetime;

import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.Quarter;

/* compiled from: QuarterJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/datetime/QuarterJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lorg/threeten/extra/Quarter;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class QuarterJsonAdapter extends NullSafeJsonAdapter<Quarter> {
    public static final QuarterJsonAdapter INSTANCE = new QuarterJsonAdapter();

    private QuarterJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public Quarter readFrom(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Quarter quarterM3994of = Quarter.m3994of(reader.nextInt());
        Intrinsics.checkNotNullExpressionValue(quarterM3994of, "of(...)");
        return quarterM3994of;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public void writeTo(JsonWriter writer, Quarter value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.toString());
    }
}
