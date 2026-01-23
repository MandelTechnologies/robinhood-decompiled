package com.robinhood.utils.moshi.jsonadapter;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocaleJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/LocaleJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Ljava/util/Locale;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LocaleJsonAdapter extends NullSafeJsonAdapter<Locale> {
    public static final LocaleJsonAdapter INSTANCE = new LocaleJsonAdapter();

    private LocaleJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public Locale readFrom(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Locale localeForLanguageTag = Locale.forLanguageTag(reader.nextString());
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(...)");
        return localeForLanguageTag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public void writeTo(JsonWriter writer, Locale value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.toLanguageTag());
    }
}
