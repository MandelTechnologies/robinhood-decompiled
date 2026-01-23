package com.robinhood.transfers.api.accounts;

import com.robinhood.models.serverdriven.experimental.api.DirectDepositToBrokeragePageAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DDBrokerageRoutingDetailsResponseJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/transfers/api/accounts/DDBrokerageRoutingDetailsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/transfers/api/accounts/DDBrokerageRoutingDetailsResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/DirectDepositToBrokeragePageAction;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.transfers.api.accounts.DDBrokerageRoutingDetailsResponseJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<DDBrokerageRoutingDetailsResponse> {
    private final JsonAdapter<List<UIComponent<DirectDepositToBrokeragePageAction>>> listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("content", "footer_content");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<List<UIComponent<DirectDepositToBrokeragePageAction>>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, Types.newParameterizedType(UIComponent.class, DirectDepositToBrokeragePageAction.class)), SetsKt.emptySet(), "content");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DDBrokerageRoutingDetailsResponse");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public DDBrokerageRoutingDetailsResponse fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<UIComponent<DirectDepositToBrokeragePageAction>> listFromJson = null;
        List<UIComponent<DirectDepositToBrokeragePageAction>> listFromJson2 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw Util.unexpectedNull("content", "content", reader);
                }
            } else if (iSelectName == 1 && (listFromJson2 = this.listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("footer_content", "footer_content", reader);
            }
        }
        reader.endObject();
        if (listFromJson == null) {
            throw Util.missingProperty("content", "content", reader);
        }
        if (listFromJson2 != null) {
            return new DDBrokerageRoutingDetailsResponse(listFromJson, listFromJson2);
        }
        throw Util.missingProperty("footer_content", "footer_content", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, DDBrokerageRoutingDetailsResponse value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("content");
        this.listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter.toJson(writer, (JsonWriter) value_.getContent());
        writer.name("footer_content");
        this.listOfUIComponentOfDirectDepositToBrokeragePageActionAdapter.toJson(writer, (JsonWriter) value_.getFooter_content());
        writer.endObject();
    }
}
