package com.robinhood.shared.equities.subzero;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: ApiFundamentalsShortDailyDataJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyData;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyData;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "Lcom/squareup/moshi/JsonAdapter;", "j$/time/LocalDate", "localDateAdapter", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.equities.subzero.ApiFundamentalsShortDailyDataJsonAdapter, reason: from toString */
/* loaded from: classes6.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiFundamentalsShortDailyData> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<LocalDate> localDateAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("shares_short", "shares_upper_bound", "shares_lower_bound", "pc_freefloat", "pc_freefloat_upper_bound", "pc_freefloat_lower_bound", InquiryField.DateField.TYPE);
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<BigDecimal> jsonAdapterAdapter = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "sharesShort");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.bigDecimalAdapter = jsonAdapterAdapter;
        JsonAdapter<LocalDate> jsonAdapterAdapter2 = moshi.adapter(LocalDate.class, SetsKt.emptySet(), InquiryField.DateField.TYPE);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.localDateAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiFundamentalsShortDailyData");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiFundamentalsShortDailyData fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BigDecimal bigDecimalFromJson = null;
        BigDecimal bigDecimalFromJson2 = null;
        BigDecimal bigDecimalFromJson3 = null;
        BigDecimal bigDecimalFromJson4 = null;
        BigDecimal bigDecimalFromJson5 = null;
        BigDecimal bigDecimalFromJson6 = null;
        LocalDate localDateFromJson = null;
        while (true) {
            BigDecimal bigDecimal = bigDecimalFromJson;
            BigDecimal bigDecimal2 = bigDecimalFromJson2;
            BigDecimal bigDecimal3 = bigDecimalFromJson3;
            BigDecimal bigDecimal4 = bigDecimalFromJson4;
            BigDecimal bigDecimal5 = bigDecimalFromJson5;
            BigDecimal bigDecimal6 = bigDecimalFromJson6;
            if (reader.hasNext()) {
                LocalDate localDate = localDateFromJson;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                    case 0:
                        bigDecimalFromJson = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson == null) {
                            throw Util.unexpectedNull("sharesShort", "shares_short", reader);
                        }
                        localDateFromJson = localDate;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                    case 1:
                        bigDecimalFromJson2 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson2 == null) {
                            throw Util.unexpectedNull("sharesUpperBound", "shares_upper_bound", reader);
                        }
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                    case 2:
                        bigDecimalFromJson3 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson3 == null) {
                            throw Util.unexpectedNull("sharesLowerBound", "shares_lower_bound", reader);
                        }
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                    case 3:
                        bigDecimalFromJson4 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson4 == null) {
                            throw Util.unexpectedNull("pcFreeFloat", "pc_freefloat", reader);
                        }
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                    case 4:
                        bigDecimalFromJson5 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson5 == null) {
                            throw Util.unexpectedNull("pcFreeFloatUpperBound", "pc_freefloat_upper_bound", reader);
                        }
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson6 = bigDecimal6;
                    case 5:
                        bigDecimalFromJson6 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson6 == null) {
                            throw Util.unexpectedNull("pcFreeFloatLowerBound", "pc_freefloat_lower_bound", reader);
                        }
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                    case 6:
                        localDateFromJson = this.localDateAdapter.fromJson(reader);
                        if (localDateFromJson == null) {
                            throw Util.unexpectedNull(InquiryField.DateField.TYPE, InquiryField.DateField.TYPE, reader);
                        }
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                    default:
                        localDateFromJson = localDate;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        bigDecimalFromJson3 = bigDecimal3;
                        bigDecimalFromJson4 = bigDecimal4;
                        bigDecimalFromJson5 = bigDecimal5;
                        bigDecimalFromJson6 = bigDecimal6;
                }
            } else {
                LocalDate localDate2 = localDateFromJson;
                reader.endObject();
                if (bigDecimal == null) {
                    throw Util.missingProperty("sharesShort", "shares_short", reader);
                }
                if (bigDecimal2 == null) {
                    throw Util.missingProperty("sharesUpperBound", "shares_upper_bound", reader);
                }
                if (bigDecimal3 == null) {
                    throw Util.missingProperty("sharesLowerBound", "shares_lower_bound", reader);
                }
                if (bigDecimal4 == null) {
                    throw Util.missingProperty("pcFreeFloat", "pc_freefloat", reader);
                }
                if (bigDecimal5 == null) {
                    throw Util.missingProperty("pcFreeFloatUpperBound", "pc_freefloat_upper_bound", reader);
                }
                if (bigDecimal6 == null) {
                    throw Util.missingProperty("pcFreeFloatLowerBound", "pc_freefloat_lower_bound", reader);
                }
                if (localDate2 != null) {
                    return new ApiFundamentalsShortDailyData(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, localDate2);
                }
                throw Util.missingProperty(InquiryField.DateField.TYPE, InquiryField.DateField.TYPE, reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiFundamentalsShortDailyData value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("shares_short");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getSharesShort());
        writer.name("shares_upper_bound");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getSharesUpperBound());
        writer.name("shares_lower_bound");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getSharesLowerBound());
        writer.name("pc_freefloat");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPcFreeFloat());
        writer.name("pc_freefloat_upper_bound");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPcFreeFloatUpperBound());
        writer.name("pc_freefloat_lower_bound");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPcFreeFloatLowerBound());
        writer.name(InquiryField.DateField.TYPE);
        this.localDateAdapter.toJson(writer, (JsonWriter) value_.getDate());
        writer.endObject();
    }
}
