package com.robinhood.android.directdeposit.p101ui.deeplink;

import com.robinhood.android.directdeposit.p101ui.deeplink.DirectDepositFormDuxo3;
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

/* compiled from: ErrorResponseJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "errorTypeAdapter", "Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse$ErrorType;", "stringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.deeplink.ErrorResponseJsonAdapter, reason: from toString */
/* loaded from: classes27.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<DirectDepositFormDuxo3> {
    public static final int $stable = 8;
    private final JsonAdapter<DirectDepositFormDuxo3.ErrorType> errorTypeAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("type", "header", "subtitle", "button_copy");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<DirectDepositFormDuxo3.ErrorType> jsonAdapterAdapter = moshi.adapter(DirectDepositFormDuxo3.ErrorType.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.errorTypeAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "header");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public DirectDepositFormDuxo3 fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DirectDepositFormDuxo3.ErrorType errorTypeFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                errorTypeFromJson = this.errorTypeAdapter.fromJson(reader);
                if (errorTypeFromJson == null) {
                    throw Util.unexpectedNull("type", "type", reader);
                }
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("header_", "header", reader);
                }
            } else if (iSelectName == 2) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw Util.unexpectedNull("subtitle", "subtitle", reader);
                }
            } else if (iSelectName == 3 && (strFromJson3 = this.stringAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("button_copy", "button_copy", reader);
            }
        }
        reader.endObject();
        if (errorTypeFromJson == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        if (strFromJson == null) {
            throw Util.missingProperty("header_", "header", reader);
        }
        if (strFromJson2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", reader);
        }
        if (strFromJson3 != null) {
            return new DirectDepositFormDuxo3(errorTypeFromJson, strFromJson, strFromJson2, strFromJson3);
        }
        throw Util.missingProperty("button_copy", "button_copy", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, DirectDepositFormDuxo3 value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("type");
        this.errorTypeAdapter.toJson(writer, (JsonWriter) value_.getType());
        writer.name("header");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getHeader());
        writer.name("subtitle");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getSubtitle());
        writer.name("button_copy");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getButton_copy());
        writer.endObject();
    }
}
