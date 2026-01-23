package com.withpersona.sdk2.inquiry.steps.p423ui.network;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NumberAdapter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/NumberAdapter;", "", "<init>", "()V", "fromJson", "", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NumberAdapter {
    public static final NumberAdapter INSTANCE = new NumberAdapter();

    @ToJson
    public final void toJson(JsonWriter writer, Number value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    private NumberAdapter() {
    }

    @FromJson
    public final Number fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Object jsonValue = reader.readJsonValue();
        Number number = jsonValue instanceof Number ? (Number) jsonValue : null;
        if (number instanceof Double) {
            return Double.compare(number.doubleValue(), (double) ((int) number.doubleValue())) == 0 ? Integer.valueOf((int) number.doubleValue()) : number;
        }
        if (number instanceof Integer) {
            return number;
        }
        return null;
    }
}
