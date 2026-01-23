package com.robinhood.android.api.gold.hub;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ApiGoldDepositBoostPayoutJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayoutJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "j$/time/Instant", "instantAdapter", "nullableStringAdapter", "", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostHistoryDetailItem;", "nullableListOfApiGoldDepositBoostHistoryDetailItemAdapter", "lib-api-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.api.gold.hub.ApiGoldDepositBoostPayoutJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiGoldDepositBoostPayout> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Instant> instantAdapter;
    private final JsonAdapter<List<ApiGoldDepositBoostHistoryDetailItem>> nullableListOfApiGoldDepositBoostHistoryDetailItemAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<UUID> uUIDAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("id", "amount", "created_at", "title", ErrorBundle.DETAIL_ENTRY, "account_number");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<UUID> jsonAdapterAdapter = moshi.adapter(UUID.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.uUIDAdapter = jsonAdapterAdapter;
        JsonAdapter<BigDecimal> jsonAdapterAdapter2 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "amount");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.bigDecimalAdapter = jsonAdapterAdapter2;
        JsonAdapter<Instant> jsonAdapterAdapter3 = moshi.adapter(Instant.class, SetsKt.emptySet(), "created_at");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.instantAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "title");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
        JsonAdapter<List<ApiGoldDepositBoostHistoryDetailItem>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(List.class, ApiGoldDepositBoostHistoryDetailItem.class), SetsKt.emptySet(), ErrorBundle.DETAIL_ENTRY);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableListOfApiGoldDepositBoostHistoryDetailItemAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiGoldDepositBoostPayout");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiGoldDepositBoostPayout fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        UUID uuidFromJson = null;
        BigDecimal bigDecimalFromJson = null;
        Instant instantFromJson = null;
        String strFromJson = null;
        List<ApiGoldDepositBoostHistoryDetailItem> listFromJson = null;
        String strFromJson2 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    uuidFromJson = this.uUIDAdapter.fromJson(reader);
                    if (uuidFromJson == null) {
                        throw Util.unexpectedNull("id", "id", reader);
                    }
                    break;
                case 1:
                    bigDecimalFromJson = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimalFromJson == null) {
                        throw Util.unexpectedNull("amount", "amount", reader);
                    }
                    break;
                case 2:
                    instantFromJson = this.instantAdapter.fromJson(reader);
                    if (instantFromJson == null) {
                        throw Util.unexpectedNull("created_at", "created_at", reader);
                    }
                    break;
                case 3:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    listFromJson = this.nullableListOfApiGoldDepositBoostHistoryDetailItemAdapter.fromJson(reader);
                    break;
                case 5:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (uuidFromJson == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        if (bigDecimalFromJson == null) {
            throw Util.missingProperty("amount", "amount", reader);
        }
        if (instantFromJson != null) {
            return new ApiGoldDepositBoostPayout(uuidFromJson, bigDecimalFromJson, instantFromJson, strFromJson, listFromJson, strFromJson2);
        }
        throw Util.missingProperty("created_at", "created_at", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiGoldDepositBoostPayout value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getId());
        writer.name("amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getAmount());
        writer.name("created_at");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getCreated_at());
        writer.name("title");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getTitle());
        writer.name(ErrorBundle.DETAIL_ENTRY);
        this.nullableListOfApiGoldDepositBoostHistoryDetailItemAdapter.toJson(writer, (JsonWriter) value_.getDetails());
        writer.name("account_number");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getAccount_number());
        writer.endObject();
    }
}
