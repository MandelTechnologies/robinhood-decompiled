package com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TermsAndConditionsJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "booleanAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditionsJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<TermsAndConditions> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("isTermsAndConditionsEnabled", "isTermsAndConditionsRequired", AnnotatedPrivateKey.LABEL, "isChecked");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<Boolean> jsonAdapterAdapter = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isTermsAndConditionsEnabled");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "isTermsAndConditionsRequired");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), AnnotatedPrivateKey.LABEL);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TermsAndConditions");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public TermsAndConditions fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        String strFromJson = null;
        Boolean boolFromJson3 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw Util.unexpectedNull("isTermsAndConditionsEnabled", "isTermsAndConditionsEnabled", reader);
                }
            } else if (iSelectName == 1) {
                boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
            } else if (iSelectName == 2) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 3 && (boolFromJson3 = this.booleanAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("isChecked", "isChecked", reader);
            }
        }
        reader.endObject();
        if (boolFromJson != null) {
            TermsAndConditions termsAndConditions = new TermsAndConditions(boolFromJson.booleanValue(), boolFromJson2, strFromJson);
            termsAndConditions.setChecked(boolFromJson3 != null ? boolFromJson3.booleanValue() : termsAndConditions.isChecked());
            return termsAndConditions;
        }
        throw Util.missingProperty("isTermsAndConditionsEnabled", "isTermsAndConditionsEnabled", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, TermsAndConditions value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("isTermsAndConditionsEnabled");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isTermsAndConditionsEnabled()));
        writer.name("isTermsAndConditionsRequired");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.isTermsAndConditionsRequired());
        writer.name(AnnotatedPrivateKey.LABEL);
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getLabel());
        writer.name("isChecked");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isChecked()));
        writer.endObject();
    }
}
