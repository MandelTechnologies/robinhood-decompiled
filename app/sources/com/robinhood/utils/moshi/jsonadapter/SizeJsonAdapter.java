package com.robinhood.utils.moshi.jsonadapter;

import android.util.Size;
import com.robinhood.utils.extensions.Moshi3;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SizeJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/SizeJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Landroid/util/Size;", "<init>", "()V", "OPTIONS", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SizeJsonAdapter extends NullSafeJsonAdapter<Size> {
    public static final SizeJsonAdapter INSTANCE = new SizeJsonAdapter();
    private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("width", "height");

    private SizeJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public Size readFrom(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(OPTIONS);
            if (iSelectName == 0) {
                numValueOf = Integer.valueOf(reader.nextInt());
            } else if (iSelectName == 1) {
                numValueOf2 = Integer.valueOf(reader.nextInt());
            } else {
                Moshi3.skipNameAndValue(reader);
            }
        }
        Unit unit = Unit.INSTANCE;
        reader.endObject();
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (numValueOf2 != null) {
                return new Size(iIntValue, numValueOf2.intValue());
            }
            throw new JsonDataException("Missing height");
        }
        throw new JsonDataException("Missing width");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public void writeTo(JsonWriter writer, Size value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.beginObject();
        writer.name("width").value(Integer.valueOf(value.getWidth()));
        writer.name("height").value(Integer.valueOf(value.getHeight()));
        writer.endObject();
    }
}
