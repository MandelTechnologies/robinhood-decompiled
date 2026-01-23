package com.robinhood.transfers.api.p405uk;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiPaymentTransferFxConversionJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/transfers/api/uk/ApiPaymentTransferFxConversionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/transfers/api/uk/ApiPaymentTransferFxConversion;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableBigDecimalAdapter", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "currencyAdapter", "Ljava/util/Currency;", "stringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.transfers.api.uk.ApiPaymentTransferFxConversionJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiPaymentTransferFxConversion> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Currency> currencyAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("actual_target_amount", "actual_target_fx_rate", "base_amount", "base_currency", "target_amount", "target_currency", "target_fx_rate", "target_fx_rate_id");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<BigDecimal> jsonAdapterAdapter = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "actual_target_amount");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableBigDecimalAdapter = jsonAdapterAdapter;
        JsonAdapter<BigDecimal> jsonAdapterAdapter2 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "base_amount");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.bigDecimalAdapter = jsonAdapterAdapter2;
        JsonAdapter<Currency> jsonAdapterAdapter3 = moshi.adapter(Currency.class, SetsKt.emptySet(), "base_currency");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.currencyAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "target_fx_rate_id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiPaymentTransferFxConversion");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiPaymentTransferFxConversion fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BigDecimal bigDecimalFromJson = null;
        BigDecimal bigDecimalFromJson2 = null;
        BigDecimal bigDecimalFromJson3 = null;
        Currency currencyFromJson = null;
        BigDecimal bigDecimalFromJson4 = null;
        Currency currencyFromJson2 = null;
        BigDecimal bigDecimalFromJson5 = null;
        String strFromJson = null;
        while (reader.hasNext()) {
            BigDecimal bigDecimal = bigDecimalFromJson;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    bigDecimalFromJson = this.nullableBigDecimalAdapter.fromJson(reader);
                    continue;
                case 1:
                    bigDecimalFromJson2 = this.nullableBigDecimalAdapter.fromJson(reader);
                    break;
                case 2:
                    bigDecimalFromJson3 = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson3 == null) {
                        throw Util.unexpectedNull("base_amount", "base_amount", reader);
                    }
                    break;
                case 3:
                    currencyFromJson = this.currencyAdapter.fromJson(reader);
                    if (currencyFromJson == null) {
                        throw Util.unexpectedNull("base_currency", "base_currency", reader);
                    }
                    break;
                case 4:
                    bigDecimalFromJson4 = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson4 == null) {
                        throw Util.unexpectedNull("target_amount", "target_amount", reader);
                    }
                    break;
                case 5:
                    currencyFromJson2 = this.currencyAdapter.fromJson(reader);
                    if (currencyFromJson2 == null) {
                        throw Util.unexpectedNull("target_currency", "target_currency", reader);
                    }
                    break;
                case 6:
                    bigDecimalFromJson5 = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson5 == null) {
                        throw Util.unexpectedNull("target_fx_rate", "target_fx_rate", reader);
                    }
                    break;
                case 7:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("target_fx_rate_id", "target_fx_rate_id", reader);
                    }
                    break;
            }
            bigDecimalFromJson = bigDecimal;
        }
        BigDecimal bigDecimal2 = bigDecimalFromJson;
        reader.endObject();
        if (bigDecimalFromJson3 == null) {
            throw Util.missingProperty("base_amount", "base_amount", reader);
        }
        if (currencyFromJson == null) {
            throw Util.missingProperty("base_currency", "base_currency", reader);
        }
        if (bigDecimalFromJson4 == null) {
            throw Util.missingProperty("target_amount", "target_amount", reader);
        }
        if (currencyFromJson2 == null) {
            throw Util.missingProperty("target_currency", "target_currency", reader);
        }
        if (bigDecimalFromJson5 == null) {
            throw Util.missingProperty("target_fx_rate", "target_fx_rate", reader);
        }
        if (strFromJson != null) {
            return new ApiPaymentTransferFxConversion(bigDecimal2, bigDecimalFromJson2, bigDecimalFromJson3, currencyFromJson, bigDecimalFromJson4, currencyFromJson2, bigDecimalFromJson5, strFromJson);
        }
        throw Util.missingProperty("target_fx_rate_id", "target_fx_rate_id", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiPaymentTransferFxConversion value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("actual_target_amount");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getActual_target_amount());
        writer.name("actual_target_fx_rate");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getActual_target_fx_rate());
        writer.name("base_amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getBase_amount());
        writer.name("base_currency");
        this.currencyAdapter.toJson(writer, (JsonWriter) value_.getBase_currency());
        writer.name("target_amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getTarget_amount());
        writer.name("target_currency");
        this.currencyAdapter.toJson(writer, (JsonWriter) value_.getTarget_currency());
        writer.name("target_fx_rate");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getTarget_fx_rate());
        writer.name("target_fx_rate_id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTarget_fx_rate_id());
        writer.endObject();
    }
}
