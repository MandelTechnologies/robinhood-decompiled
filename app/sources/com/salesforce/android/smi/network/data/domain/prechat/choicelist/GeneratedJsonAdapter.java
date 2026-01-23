package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

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

/* compiled from: ChoiceListConfigurationJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfigurationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListConfiguration;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "listOfChoiceListAdapter", "", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceList;", "listOfChoiceListValueDependencyAdapter", "Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListValueDependency;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.network.data.domain.prechat.choicelist.ChoiceListConfigurationJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ChoiceListConfiguration> {
    private final JsonAdapter<List<ChoiceList>> listOfChoiceListAdapter;
    private final JsonAdapter<List<ChoiceListValueDependency>> listOfChoiceListValueDependencyAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("choiceList", "choiceListValueDependencies");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<List<ChoiceList>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, ChoiceList.class), SetsKt.emptySet(), "choiceList");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.listOfChoiceListAdapter = jsonAdapterAdapter;
        JsonAdapter<List<ChoiceListValueDependency>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, ChoiceListValueDependency.class), SetsKt.emptySet(), "choiceListValueDependencies");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.listOfChoiceListValueDependencyAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ChoiceListConfiguration");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ChoiceListConfiguration fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ChoiceList> listFromJson = null;
        List<ChoiceListValueDependency> listFromJson2 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.listOfChoiceListAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw Util.unexpectedNull("choiceList", "choiceList", reader);
                }
            } else if (iSelectName == 1 && (listFromJson2 = this.listOfChoiceListValueDependencyAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("choiceListValueDependencies", "choiceListValueDependencies", reader);
            }
        }
        reader.endObject();
        if (listFromJson == null) {
            throw Util.missingProperty("choiceList", "choiceList", reader);
        }
        if (listFromJson2 != null) {
            return new ChoiceListConfiguration(listFromJson, listFromJson2);
        }
        throw Util.missingProperty("choiceListValueDependencies", "choiceListValueDependencies", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ChoiceListConfiguration value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("choiceList");
        this.listOfChoiceListAdapter.toJson(writer, (JsonWriter) value_.getChoiceList());
        writer.name("choiceListValueDependencies");
        this.listOfChoiceListValueDependencyAdapter.toJson(writer, (JsonWriter) value_.getChoiceListValueDependencies());
        writer.endObject();
    }
}
