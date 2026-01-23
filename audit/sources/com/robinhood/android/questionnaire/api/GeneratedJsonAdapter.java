package com.robinhood.android.questionnaire.api;

import com.robinhood.android.questionnaire.api.ApiQuestionContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiQuestionContent_OptionalIntegerContent_DataJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionContent_OptionalIntegerContent_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionContent$OptionalIntegerContent$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "intAdapter", "", "stringAdapter", "", "nullableIntAdapter", "genericAlertContentOfGenericActionAdapter", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "nullableApiGraphRedirectAdapter", "Lcom/robinhood/android/questionnaire/api/ApiGraphRedirect;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.questionnaire.api.ApiQuestionContent_OptionalIntegerContent_DataJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiQuestionContent.OptionalIntegerContent.Data> {
    private final JsonAdapter<GenericAlertContent<GenericAction>> genericAlertContentOfGenericActionAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<ApiGraphRedirect> nullableApiGraphRedirectAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("min_value", "max_value", "placeholder", "default_value", "below_min_value_alert", "above_max_value_alert", "checkbox_label", "none_render_value", "checkbox_logging_identifier", "graph_checked_redirect", "graph_unchecked_redirect");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<Integer> jsonAdapterAdapter = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "min_value");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.intAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "placeholder");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Integer> jsonAdapterAdapter3 = moshi.adapter(Integer.class, SetsKt.emptySet(), "default_value");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableIntAdapter = jsonAdapterAdapter3;
        JsonAdapter<GenericAlertContent<GenericAction>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(GenericAlertContent.class, GenericAction.class), SetsKt.emptySet(), "below_min_value_alert");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.genericAlertContentOfGenericActionAdapter = jsonAdapterAdapter4;
        JsonAdapter<ApiGraphRedirect> jsonAdapterAdapter5 = moshi.adapter(ApiGraphRedirect.class, SetsKt.emptySet(), "graph_checked_redirect");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableApiGraphRedirectAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiQuestionContent.OptionalIntegerContent.Data");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiQuestionContent.OptionalIntegerContent.Data fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        String strFromJson = null;
        Integer numFromJson3 = null;
        GenericAlertContent<GenericAction> genericAlertContentFromJson = null;
        GenericAlertContent<GenericAction> genericAlertContentFromJson2 = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        ApiGraphRedirect apiGraphRedirectFromJson = null;
        ApiGraphRedirect apiGraphRedirectFromJson2 = null;
        while (true) {
            Integer num = numFromJson;
            Integer num2 = numFromJson2;
            String str = strFromJson;
            Integer num3 = numFromJson3;
            GenericAlertContent<GenericAction> genericAlertContent = genericAlertContentFromJson;
            if (reader.hasNext()) {
                GenericAlertContent<GenericAction> genericAlertContent2 = genericAlertContentFromJson2;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 0:
                        numFromJson = this.intAdapter.fromJson(reader);
                        if (numFromJson == null) {
                            throw Util.unexpectedNull("min_value", "min_value", reader);
                        }
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 1:
                        numFromJson2 = this.intAdapter.fromJson(reader);
                        if (numFromJson2 == null) {
                            throw Util.unexpectedNull("max_value", "max_value", reader);
                        }
                        numFromJson = num;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 2:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            throw Util.unexpectedNull("placeholder", "placeholder", reader);
                        }
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 3:
                        numFromJson3 = this.nullableIntAdapter.fromJson(reader);
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        genericAlertContentFromJson = genericAlertContent;
                    case 4:
                        genericAlertContentFromJson = this.genericAlertContentOfGenericActionAdapter.fromJson(reader);
                        if (genericAlertContentFromJson == null) {
                            throw Util.unexpectedNull("below_min_value_alert", "below_min_value_alert", reader);
                        }
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                    case 5:
                        genericAlertContentFromJson2 = this.genericAlertContentOfGenericActionAdapter.fromJson(reader);
                        if (genericAlertContentFromJson2 == null) {
                            throw Util.unexpectedNull("above_max_value_alert", "above_max_value_alert", reader);
                        }
                        numFromJson = num;
                        numFromJson2 = num2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 6:
                        strFromJson2 = this.stringAdapter.fromJson(reader);
                        if (strFromJson2 == null) {
                            throw Util.unexpectedNull("checkbox_label", "checkbox_label", reader);
                        }
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 7:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            throw Util.unexpectedNull("none_render_value", "none_render_value", reader);
                        }
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 8:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            throw Util.unexpectedNull("checkbox_logging_identifier", "checkbox_logging_identifier", reader);
                        }
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 9:
                        apiGraphRedirectFromJson = this.nullableApiGraphRedirectAdapter.fromJson(reader);
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    case 10:
                        apiGraphRedirectFromJson2 = this.nullableApiGraphRedirectAdapter.fromJson(reader);
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                    default:
                        numFromJson = num;
                        numFromJson2 = num2;
                        genericAlertContentFromJson2 = genericAlertContent2;
                        strFromJson = str;
                        numFromJson3 = num3;
                        genericAlertContentFromJson = genericAlertContent;
                }
            } else {
                GenericAlertContent<GenericAction> genericAlertContent3 = genericAlertContentFromJson2;
                reader.endObject();
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        if (str == null) {
                            throw Util.missingProperty("placeholder", "placeholder", reader);
                        }
                        if (genericAlertContent == null) {
                            throw Util.missingProperty("below_min_value_alert", "below_min_value_alert", reader);
                        }
                        if (genericAlertContent3 == null) {
                            throw Util.missingProperty("above_max_value_alert", "above_max_value_alert", reader);
                        }
                        if (strFromJson2 == null) {
                            throw Util.missingProperty("checkbox_label", "checkbox_label", reader);
                        }
                        if (strFromJson3 == null) {
                            throw Util.missingProperty("none_render_value", "none_render_value", reader);
                        }
                        if (strFromJson4 != null) {
                            return new ApiQuestionContent.OptionalIntegerContent.Data(iIntValue, iIntValue2, str, num3, genericAlertContent, genericAlertContent3, strFromJson2, strFromJson3, strFromJson4, apiGraphRedirectFromJson, apiGraphRedirectFromJson2);
                        }
                        throw Util.missingProperty("checkbox_logging_identifier", "checkbox_logging_identifier", reader);
                    }
                    throw Util.missingProperty("max_value", "max_value", reader);
                }
                throw Util.missingProperty("min_value", "min_value", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiQuestionContent.OptionalIntegerContent.Data value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("min_value");
        this.intAdapter.toJson(writer, (JsonWriter) Integer.valueOf(value_.getMin_value()));
        writer.name("max_value");
        this.intAdapter.toJson(writer, (JsonWriter) Integer.valueOf(value_.getMax_value()));
        writer.name("placeholder");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getPlaceholder());
        writer.name("default_value");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getDefault_value());
        writer.name("below_min_value_alert");
        this.genericAlertContentOfGenericActionAdapter.toJson(writer, (JsonWriter) value_.getBelow_min_value_alert());
        writer.name("above_max_value_alert");
        this.genericAlertContentOfGenericActionAdapter.toJson(writer, (JsonWriter) value_.getAbove_max_value_alert());
        writer.name("checkbox_label");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getCheckbox_label());
        writer.name("none_render_value");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getNone_render_value());
        writer.name("checkbox_logging_identifier");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getCheckbox_logging_identifier());
        writer.name("graph_checked_redirect");
        this.nullableApiGraphRedirectAdapter.toJson(writer, (JsonWriter) value_.getGraph_checked_redirect());
        writer.name("graph_unchecked_redirect");
        this.nullableApiGraphRedirectAdapter.toJson(writer, (JsonWriter) value_.getGraph_unchecked_redirect());
        writer.endObject();
    }
}
