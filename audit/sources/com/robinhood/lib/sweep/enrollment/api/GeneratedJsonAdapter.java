package com.robinhood.lib.sweep.enrollment.api;

import com.robinhood.lib.sweep.enrollment.SweepEnrollmentAction;
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

/* compiled from: ApiSweepEnrollmentRequestBodyJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollmentRequestBodyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollmentRequestBody;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "sweepEnrollmentActionAdapter", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentAction;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-sweep-enrollment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollmentRequestBodyJsonAdapter, reason: from toString */
/* loaded from: classes27.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiSweepEnrollmentRequestBody> {
    private final JsonReader.Options options;
    private final JsonAdapter<SweepEnrollmentAction> sweepEnrollmentActionAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("sweep_enrollment_action");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<SweepEnrollmentAction> jsonAdapterAdapter = moshi.adapter(SweepEnrollmentAction.class, SetsKt.emptySet(), "sweepEnrollmentAction");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.sweepEnrollmentActionAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiSweepEnrollmentRequestBody");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiSweepEnrollmentRequestBody fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        SweepEnrollmentAction sweepEnrollmentActionFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0 && (sweepEnrollmentActionFromJson = this.sweepEnrollmentActionAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("sweepEnrollmentAction", "sweep_enrollment_action", reader);
            }
        }
        reader.endObject();
        if (sweepEnrollmentActionFromJson != null) {
            return new ApiSweepEnrollmentRequestBody(sweepEnrollmentActionFromJson);
        }
        throw Util.missingProperty("sweepEnrollmentAction", "sweep_enrollment_action", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiSweepEnrollmentRequestBody value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("sweep_enrollment_action");
        this.sweepEnrollmentActionAdapter.toJson(writer, (JsonWriter) value_.getSweepEnrollmentAction());
        writer.endObject();
    }
}
