package com.robinhood.staticcontent.model.p402cx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxVoiceContentJsonAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/cx/CxVoiceContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.cx.CxVoiceContentJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<CxVoiceContent> {
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("reviewCallDetailsCallTime", "reviewCallDetailsEditCallTimeDismissButton", "reviewCallDetailsEditCallTimeSaveButton", "reviewCallDetailsToastEditCallTimeSuccess", "generalButtonDismiss", "surveyErrorToastRetryable", "surveyErrorToastNonRetryable", "surveyFreeFormTextLimitMessage", "reviewCallDetailsTitleNumberOnly", "reviewCallDetailsTitleNumberTime", "textDescriptionButtonContinue", "textDescriptionTextFormLimitExceededMessage", "textDescriptionTextFormLimitWarningMessage");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "reviewCallDetailsCallTime");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CxVoiceContent");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public CxVoiceContent fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        String strFromJson13 = null;
        while (true) {
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            String str5 = strFromJson5;
            String str6 = strFromJson6;
            String str7 = strFromJson7;
            String str8 = strFromJson8;
            String str9 = strFromJson9;
            String str10 = strFromJson10;
            String str11 = strFromJson11;
            if (reader.hasNext()) {
                String str12 = strFromJson12;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            throw Util.unexpectedNull("reviewCallDetailsCallTime", "reviewCallDetailsCallTime", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(reader);
                        if (strFromJson2 == null) {
                            throw Util.unexpectedNull("reviewCallDetailsEditCallTimeDismissButton", "reviewCallDetailsEditCallTimeDismissButton", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 2:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            throw Util.unexpectedNull("reviewCallDetailsEditCallTimeSaveButton", "reviewCallDetailsEditCallTimeSaveButton", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 3:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            throw Util.unexpectedNull("reviewCallDetailsToastEditCallTimeSuccess", "reviewCallDetailsToastEditCallTimeSuccess", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 4:
                        strFromJson5 = this.stringAdapter.fromJson(reader);
                        if (strFromJson5 == null) {
                            throw Util.unexpectedNull("generalButtonDismiss", "generalButtonDismiss", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 5:
                        strFromJson6 = this.stringAdapter.fromJson(reader);
                        if (strFromJson6 == null) {
                            throw Util.unexpectedNull("surveyErrorToastRetryable", "surveyErrorToastRetryable", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 6:
                        strFromJson7 = this.stringAdapter.fromJson(reader);
                        if (strFromJson7 == null) {
                            throw Util.unexpectedNull("surveyErrorToastNonRetryable", "surveyErrorToastNonRetryable", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 7:
                        strFromJson8 = this.stringAdapter.fromJson(reader);
                        if (strFromJson8 == null) {
                            throw Util.unexpectedNull("surveyFreeFormTextLimitMessage", "surveyFreeFormTextLimitMessage", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 8:
                        strFromJson9 = this.stringAdapter.fromJson(reader);
                        if (strFromJson9 == null) {
                            throw Util.unexpectedNull("reviewCallDetailsTitleNumberOnly", "reviewCallDetailsTitleNumberOnly", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 9:
                        strFromJson10 = this.stringAdapter.fromJson(reader);
                        if (strFromJson10 == null) {
                            throw Util.unexpectedNull("reviewCallDetailsTitleNumberTime", "reviewCallDetailsTitleNumberTime", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson11 = str11;
                    case 10:
                        strFromJson11 = this.stringAdapter.fromJson(reader);
                        if (strFromJson11 == null) {
                            throw Util.unexpectedNull("textDescriptionButtonContinue", "textDescriptionButtonContinue", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                    case 11:
                        strFromJson12 = this.stringAdapter.fromJson(reader);
                        if (strFromJson12 == null) {
                            throw Util.unexpectedNull("textDescriptionTextFormLimitExceededMessage", "textDescriptionTextFormLimitExceededMessage", reader);
                        }
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    case 12:
                        strFromJson13 = this.stringAdapter.fromJson(reader);
                        if (strFromJson13 == null) {
                            throw Util.unexpectedNull("textDescriptionTextFormLimitWarningMessage", "textDescriptionTextFormLimitWarningMessage", reader);
                        }
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                    default:
                        strFromJson12 = str12;
                        strFromJson = str;
                        strFromJson2 = str2;
                        strFromJson3 = str3;
                        strFromJson4 = str4;
                        strFromJson5 = str5;
                        strFromJson6 = str6;
                        strFromJson7 = str7;
                        strFromJson8 = str8;
                        strFromJson9 = str9;
                        strFromJson10 = str10;
                        strFromJson11 = str11;
                }
            } else {
                String str13 = strFromJson12;
                reader.endObject();
                if (str == null) {
                    throw Util.missingProperty("reviewCallDetailsCallTime", "reviewCallDetailsCallTime", reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("reviewCallDetailsEditCallTimeDismissButton", "reviewCallDetailsEditCallTimeDismissButton", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("reviewCallDetailsEditCallTimeSaveButton", "reviewCallDetailsEditCallTimeSaveButton", reader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("reviewCallDetailsToastEditCallTimeSuccess", "reviewCallDetailsToastEditCallTimeSuccess", reader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("generalButtonDismiss", "generalButtonDismiss", reader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("surveyErrorToastRetryable", "surveyErrorToastRetryable", reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("surveyErrorToastNonRetryable", "surveyErrorToastNonRetryable", reader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("surveyFreeFormTextLimitMessage", "surveyFreeFormTextLimitMessage", reader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("reviewCallDetailsTitleNumberOnly", "reviewCallDetailsTitleNumberOnly", reader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("reviewCallDetailsTitleNumberTime", "reviewCallDetailsTitleNumberTime", reader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("textDescriptionButtonContinue", "textDescriptionButtonContinue", reader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("textDescriptionTextFormLimitExceededMessage", "textDescriptionTextFormLimitExceededMessage", reader);
                }
                if (strFromJson13 != null) {
                    return new CxVoiceContent(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str13, strFromJson13);
                }
                throw Util.missingProperty("textDescriptionTextFormLimitWarningMessage", "textDescriptionTextFormLimitWarningMessage", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CxVoiceContent value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("reviewCallDetailsCallTime");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReviewCallDetailsCallTime());
        writer.name("reviewCallDetailsEditCallTimeDismissButton");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReviewCallDetailsEditCallTimeDismissButton());
        writer.name("reviewCallDetailsEditCallTimeSaveButton");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReviewCallDetailsEditCallTimeSaveButton());
        writer.name("reviewCallDetailsToastEditCallTimeSuccess");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReviewCallDetailsToastEditCallTimeSuccess());
        writer.name("generalButtonDismiss");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getGeneralButtonDismiss());
        writer.name("surveyErrorToastRetryable");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getSurveyErrorToastRetryable());
        writer.name("surveyErrorToastNonRetryable");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getSurveyErrorToastNonRetryable());
        writer.name("surveyFreeFormTextLimitMessage");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getSurveyFreeFormTextLimitMessage());
        writer.name("reviewCallDetailsTitleNumberOnly");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReviewCallDetailsTitleNumberOnly());
        writer.name("reviewCallDetailsTitleNumberTime");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getReviewCallDetailsTitleNumberTime());
        writer.name("textDescriptionButtonContinue");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTextDescriptionButtonContinue());
        writer.name("textDescriptionTextFormLimitExceededMessage");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTextDescriptionTextFormLimitExceededMessage());
        writer.name("textDescriptionTextFormLimitWarningMessage");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTextDescriptionTextFormLimitWarningMessage());
        writer.endObject();
    }
}
