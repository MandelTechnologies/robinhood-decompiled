package com.robinhood.transfers.gold;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostTransferDetailJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetailJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableIconAssetAdapter", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-models-transfer-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.transfers.gold.GoldDepositBoostTransferDetailJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<GoldDepositBoostTransferDetail> {
    private final JsonAdapter<ServerToBentoAssetMapper2> nullableIconAssetAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("badgeText", "amountTitle", "amountText", "iconAsset", "detailText");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "badgeText");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<ServerToBentoAssetMapper2> jsonAdapterAdapter2 = moshi.adapter(ServerToBentoAssetMapper2.class, SetsKt.emptySet(), "iconAsset");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableIconAssetAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GoldDepositBoostTransferDetail");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public GoldDepositBoostTransferDetail fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromJson = null;
        String strFromJson4 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 2) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 3) {
                serverToBentoAssetMapper2FromJson = this.nullableIconAssetAdapter.fromJson(reader);
            } else if (iSelectName == 4) {
                strFromJson4 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new GoldDepositBoostTransferDetail(strFromJson, strFromJson2, strFromJson3, serverToBentoAssetMapper2FromJson, strFromJson4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, GoldDepositBoostTransferDetail value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("badgeText");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getBadgeText());
        writer.name("amountTitle");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getAmountTitle());
        writer.name("amountText");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getAmountText());
        writer.name("iconAsset");
        this.nullableIconAssetAdapter.toJson(writer, (JsonWriter) value_.getIconAsset());
        writer.name("detailText");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getDetailText());
        writer.endObject();
    }
}
