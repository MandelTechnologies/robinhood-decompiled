package com.robinhood.g11n.jsonadapter;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportedCountryCodeJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/g11n/jsonadapter/SupportedCountryCodeJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SupportedCountryCodeJsonAdapter extends NullSafeJsonAdapter<CountryCode.Supported> {
    public static final SupportedCountryCodeJsonAdapter INSTANCE = new SupportedCountryCodeJsonAdapter();

    private SupportedCountryCodeJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public CountryCode.Supported readFrom(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String strNextString = reader.nextString();
        CountryCode.Companion companion = CountryCode.INSTANCE;
        Intrinsics.checkNotNull(strNextString);
        CountryCode companion2 = companion.getInstance(strNextString);
        CountryCode.Supported supported = companion2 instanceof CountryCode.Supported ? (CountryCode.Supported) companion2 : null;
        if (supported != null) {
            return supported;
        }
        throw new IllegalArgumentException(("Country code " + strNextString + " is not supported").toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public void writeTo(JsonWriter writer, CountryCode.Supported value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.getIso3166CountryCode());
    }
}
