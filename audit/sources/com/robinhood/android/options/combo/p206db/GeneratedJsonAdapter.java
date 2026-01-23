package com.robinhood.android.options.combo.p206db;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.shared.models.history.shared.OrderState;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ComboOrderJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/options/combo/db/ComboOrderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/options/combo/db/ComboOrder;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/android/options/combo/db/ComboOrder;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/android/options/combo/db/ComboOrder;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "nullableStringAdapter", "Lcom/robinhood/models/api/OptionStrategyType;", "nullableOptionStrategyTypeAdapter", "nullableBigDecimalAdapter", "j$/time/Instant", "instantAdapter", "Lcom/robinhood/shared/models/history/shared/OrderState;", "orderStateAdapter", "Lcom/robinhood/models/db/OrderDirection;", "orderDirectionAdapter", "", "booleanAdapter", "Lcom/robinhood/models/db/OrderTimeInForce;", "orderTimeInForceAdapter", "Lcom/robinhood/models/db/OrderTrigger;", "orderTriggerAdapter", "Lcom/robinhood/models/db/OrderType;", "orderTypeAdapter", "nullableUUIDAdapter", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "formSourceAdapter", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.combo.db.ComboOrderJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ComboOrder> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<OptionOrder.FormSource> formSourceAdapter;
    private final JsonAdapter<Instant> instantAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<OptionStrategyType> nullableOptionStrategyTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UUID> nullableUUIDAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<OrderDirection> orderDirectionAdapter;
    private final JsonAdapter<OrderState> orderStateAdapter;
    private final JsonAdapter<OrderTimeInForce> orderTimeInForceAdapter;
    private final JsonAdapter<OrderTrigger> orderTriggerAdapter;
    private final JsonAdapter<OrderType> orderTypeAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UUID> uUIDAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("id", "accountNumber", "averageNetPremiumPaid", "cancelUrl", "canceledQuantity", "chainId", "chainSymbol", "closingStrategy", "contractFees", "createdAt", "derivedState", "direction", "goldSavings", "isReplaceable", "netAmount", "netAmountDirection", "openingStrategy", "pendingQuantity", "premium", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "processedPremium", "processedQuantity", "quantity", "regulatoryFees", "stopPrice", "strategy", "timeInForce", "trigger", "type", "updatedAt", "refId", "processedPremiumDirection", "estimatedTotalNetAmount", "estimatedTotalNetAmountDirection", "formSource", "equityInstrumentId", "underlyingSymbol");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<UUID> jsonAdapterAdapter = moshi.adapter(UUID.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.uUIDAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "accountNumber");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<BigDecimal> jsonAdapterAdapter3 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "averageNetPremiumPaid");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.bigDecimalAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "cancelUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
        JsonAdapter<OptionStrategyType> jsonAdapterAdapter5 = moshi.adapter(OptionStrategyType.class, SetsKt.emptySet(), "closingStrategy");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableOptionStrategyTypeAdapter = jsonAdapterAdapter5;
        JsonAdapter<BigDecimal> jsonAdapterAdapter6 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "contractFees");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.nullableBigDecimalAdapter = jsonAdapterAdapter6;
        JsonAdapter<Instant> jsonAdapterAdapter7 = moshi.adapter(Instant.class, SetsKt.emptySet(), "createdAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.instantAdapter = jsonAdapterAdapter7;
        JsonAdapter<OrderState> jsonAdapterAdapter8 = moshi.adapter(OrderState.class, SetsKt.emptySet(), "derivedState");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "adapter(...)");
        this.orderStateAdapter = jsonAdapterAdapter8;
        JsonAdapter<OrderDirection> jsonAdapterAdapter9 = moshi.adapter(OrderDirection.class, SetsKt.emptySet(), "direction");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter9, "adapter(...)");
        this.orderDirectionAdapter = jsonAdapterAdapter9;
        JsonAdapter<Boolean> jsonAdapterAdapter10 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isReplaceable");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter10, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter10;
        JsonAdapter<OrderTimeInForce> jsonAdapterAdapter11 = moshi.adapter(OrderTimeInForce.class, SetsKt.emptySet(), "timeInForce");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter11, "adapter(...)");
        this.orderTimeInForceAdapter = jsonAdapterAdapter11;
        JsonAdapter<OrderTrigger> jsonAdapterAdapter12 = moshi.adapter(OrderTrigger.class, SetsKt.emptySet(), "trigger");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter12, "adapter(...)");
        this.orderTriggerAdapter = jsonAdapterAdapter12;
        JsonAdapter<OrderType> jsonAdapterAdapter13 = moshi.adapter(OrderType.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter13, "adapter(...)");
        this.orderTypeAdapter = jsonAdapterAdapter13;
        JsonAdapter<UUID> jsonAdapterAdapter14 = moshi.adapter(UUID.class, SetsKt.emptySet(), "refId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter14, "adapter(...)");
        this.nullableUUIDAdapter = jsonAdapterAdapter14;
        JsonAdapter<OptionOrder.FormSource> jsonAdapterAdapter15 = moshi.adapter(OptionOrder.FormSource.class, SetsKt.emptySet(), "formSource");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter15, "adapter(...)");
        this.formSourceAdapter = jsonAdapterAdapter15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ComboOrder");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ComboOrder fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean boolFromJson = null;
        UUID uuidFromJson = null;
        String strFromJson = null;
        BigDecimal bigDecimalFromJson = null;
        String strFromJson2 = null;
        BigDecimal bigDecimalFromJson2 = null;
        UUID uuidFromJson2 = null;
        String strFromJson3 = null;
        OptionStrategyType optionStrategyTypeFromJson = null;
        BigDecimal bigDecimalFromJson3 = null;
        Instant instantFromJson = null;
        OrderState orderStateFromJson = null;
        OrderDirection orderDirectionFromJson = null;
        BigDecimal bigDecimalFromJson4 = null;
        BigDecimal bigDecimalFromJson5 = null;
        OrderDirection orderDirectionFromJson2 = null;
        OptionStrategyType optionStrategyTypeFromJson2 = null;
        BigDecimal bigDecimalFromJson6 = null;
        BigDecimal bigDecimalFromJson7 = null;
        BigDecimal bigDecimalFromJson8 = null;
        BigDecimal bigDecimalFromJson9 = null;
        BigDecimal bigDecimalFromJson10 = null;
        BigDecimal bigDecimalFromJson11 = null;
        BigDecimal bigDecimalFromJson12 = null;
        BigDecimal bigDecimalFromJson13 = null;
        OptionStrategyType optionStrategyTypeFromJson3 = null;
        OrderTimeInForce orderTimeInForceFromJson = null;
        OrderTrigger orderTriggerFromJson = null;
        OrderType orderTypeFromJson = null;
        Instant instantFromJson2 = null;
        UUID uuidFromJson3 = null;
        OrderDirection orderDirectionFromJson3 = null;
        BigDecimal bigDecimalFromJson14 = null;
        OrderDirection orderDirectionFromJson4 = null;
        OptionOrder.FormSource formSourceFromJson = null;
        UUID uuidFromJson4 = null;
        String strFromJson4 = null;
        while (true) {
            Boolean bool = boolFromJson;
            UUID uuid = uuidFromJson;
            String str = strFromJson;
            BigDecimal bigDecimal = bigDecimalFromJson;
            String str2 = strFromJson2;
            BigDecimal bigDecimal2 = bigDecimalFromJson2;
            UUID uuid2 = uuidFromJson2;
            String str3 = strFromJson3;
            OptionStrategyType optionStrategyType = optionStrategyTypeFromJson;
            BigDecimal bigDecimal3 = bigDecimalFromJson3;
            Instant instant = instantFromJson;
            OrderState orderState = orderStateFromJson;
            OrderDirection orderDirection = orderDirectionFromJson;
            if (reader.hasNext()) {
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 0:
                        uuidFromJson = this.uUIDAdapter.fromJson(reader);
                        if (uuidFromJson == null) {
                            throw Util.unexpectedNull("id", "id", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 1:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            throw Util.unexpectedNull("accountNumber", "accountNumber", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 2:
                        bigDecimalFromJson = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson == null) {
                            throw Util.unexpectedNull("averageNetPremiumPaid", "averageNetPremiumPaid", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 3:
                        strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 4:
                        bigDecimalFromJson2 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson2 == null) {
                            throw Util.unexpectedNull("canceledQuantity", "canceledQuantity", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 5:
                        uuidFromJson2 = this.uUIDAdapter.fromJson(reader);
                        if (uuidFromJson2 == null) {
                            throw Util.unexpectedNull("chainId", "chainId", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 6:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            throw Util.unexpectedNull("chainSymbol", "chainSymbol", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 7:
                        optionStrategyTypeFromJson = this.nullableOptionStrategyTypeAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 8:
                        bigDecimalFromJson3 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 9:
                        instantFromJson = this.instantAdapter.fromJson(reader);
                        if (instantFromJson == null) {
                            throw Util.unexpectedNull("createdAt", "createdAt", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 10:
                        orderStateFromJson = this.orderStateAdapter.fromJson(reader);
                        if (orderStateFromJson == null) {
                            throw Util.unexpectedNull("derivedState", "derivedState", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderDirectionFromJson = orderDirection;
                    case 11:
                        orderDirectionFromJson = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson == null) {
                            throw Util.unexpectedNull("direction", "direction", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                    case 12:
                        bigDecimalFromJson4 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 13:
                        boolFromJson = this.booleanAdapter.fromJson(reader);
                        if (boolFromJson == null) {
                            throw Util.unexpectedNull("isReplaceable", "isReplaceable", reader);
                        }
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 14:
                        bigDecimalFromJson5 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson5 == null) {
                            throw Util.unexpectedNull("netAmount", "netAmount", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 15:
                        orderDirectionFromJson2 = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson2 == null) {
                            throw Util.unexpectedNull("netAmountDirection", "netAmountDirection", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 16:
                        optionStrategyTypeFromJson2 = this.nullableOptionStrategyTypeAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 17:
                        bigDecimalFromJson6 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson6 == null) {
                            throw Util.unexpectedNull("pendingQuantity", "pendingQuantity", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 18:
                        bigDecimalFromJson7 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 19:
                        bigDecimalFromJson8 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 20:
                        bigDecimalFromJson9 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson9 == null) {
                            throw Util.unexpectedNull("processedPremium", "processedPremium", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 21:
                        bigDecimalFromJson10 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson10 == null) {
                            throw Util.unexpectedNull("processedQuantity", "processedQuantity", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 22:
                        bigDecimalFromJson11 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson11 == null) {
                            throw Util.unexpectedNull("quantity", "quantity", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 23:
                        bigDecimalFromJson12 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson12 == null) {
                            throw Util.unexpectedNull("regulatoryFees", "regulatoryFees", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 24:
                        bigDecimalFromJson13 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 25:
                        optionStrategyTypeFromJson3 = this.nullableOptionStrategyTypeAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 26:
                        orderTimeInForceFromJson = this.orderTimeInForceAdapter.fromJson(reader);
                        if (orderTimeInForceFromJson == null) {
                            throw Util.unexpectedNull("timeInForce", "timeInForce", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 27:
                        orderTriggerFromJson = this.orderTriggerAdapter.fromJson(reader);
                        if (orderTriggerFromJson == null) {
                            throw Util.unexpectedNull("trigger", "trigger", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 28:
                        orderTypeFromJson = this.orderTypeAdapter.fromJson(reader);
                        if (orderTypeFromJson == null) {
                            throw Util.unexpectedNull("type", "type", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 29:
                        instantFromJson2 = this.instantAdapter.fromJson(reader);
                        if (instantFromJson2 == null) {
                            throw Util.unexpectedNull("updatedAt", "updatedAt", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 30:
                        uuidFromJson3 = this.nullableUUIDAdapter.fromJson(reader);
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 31:
                        orderDirectionFromJson3 = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson3 == null) {
                            throw Util.unexpectedNull("processedPremiumDirection", "processedPremiumDirection", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 32:
                        bigDecimalFromJson14 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson14 == null) {
                            throw Util.unexpectedNull("estimatedTotalNetAmount", "estimatedTotalNetAmount", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 33:
                        orderDirectionFromJson4 = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson4 == null) {
                            throw Util.unexpectedNull("estimatedTotalNetAmountDirection", "estimatedTotalNetAmountDirection", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 34:
                        formSourceFromJson = this.formSourceAdapter.fromJson(reader);
                        if (formSourceFromJson == null) {
                            throw Util.unexpectedNull("formSource", "formSource", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 35:
                        uuidFromJson4 = this.uUIDAdapter.fromJson(reader);
                        if (uuidFromJson4 == null) {
                            throw Util.unexpectedNull("equityInstrumentId", "equityInstrumentId", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 36:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            throw Util.unexpectedNull("underlyingSymbol", "underlyingSymbol", reader);
                        }
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    default:
                        boolFromJson = bool;
                        uuidFromJson = uuid;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson2 = uuid2;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                }
            } else {
                reader.endObject();
                if (uuid == null) {
                    throw Util.missingProperty("id", "id", reader);
                }
                if (str == null) {
                    throw Util.missingProperty("accountNumber", "accountNumber", reader);
                }
                if (bigDecimal == null) {
                    throw Util.missingProperty("averageNetPremiumPaid", "averageNetPremiumPaid", reader);
                }
                if (bigDecimal2 == null) {
                    throw Util.missingProperty("canceledQuantity", "canceledQuantity", reader);
                }
                if (uuid2 == null) {
                    throw Util.missingProperty("chainId", "chainId", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("chainSymbol", "chainSymbol", reader);
                }
                if (instant == null) {
                    throw Util.missingProperty("createdAt", "createdAt", reader);
                }
                if (orderState == null) {
                    throw Util.missingProperty("derivedState", "derivedState", reader);
                }
                if (orderDirection == null) {
                    throw Util.missingProperty("direction", "direction", reader);
                }
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    if (bigDecimalFromJson5 == null) {
                        throw Util.missingProperty("netAmount", "netAmount", reader);
                    }
                    if (orderDirectionFromJson2 == null) {
                        throw Util.missingProperty("netAmountDirection", "netAmountDirection", reader);
                    }
                    if (bigDecimalFromJson6 == null) {
                        throw Util.missingProperty("pendingQuantity", "pendingQuantity", reader);
                    }
                    if (bigDecimalFromJson9 == null) {
                        throw Util.missingProperty("processedPremium", "processedPremium", reader);
                    }
                    if (bigDecimalFromJson10 == null) {
                        throw Util.missingProperty("processedQuantity", "processedQuantity", reader);
                    }
                    if (bigDecimalFromJson11 == null) {
                        throw Util.missingProperty("quantity", "quantity", reader);
                    }
                    if (bigDecimalFromJson12 == null) {
                        throw Util.missingProperty("regulatoryFees", "regulatoryFees", reader);
                    }
                    if (orderTimeInForceFromJson == null) {
                        throw Util.missingProperty("timeInForce", "timeInForce", reader);
                    }
                    if (orderTriggerFromJson == null) {
                        throw Util.missingProperty("trigger", "trigger", reader);
                    }
                    if (orderTypeFromJson == null) {
                        throw Util.missingProperty("type", "type", reader);
                    }
                    if (instantFromJson2 == null) {
                        throw Util.missingProperty("updatedAt", "updatedAt", reader);
                    }
                    if (orderDirectionFromJson3 == null) {
                        throw Util.missingProperty("processedPremiumDirection", "processedPremiumDirection", reader);
                    }
                    if (bigDecimalFromJson14 == null) {
                        throw Util.missingProperty("estimatedTotalNetAmount", "estimatedTotalNetAmount", reader);
                    }
                    if (orderDirectionFromJson4 == null) {
                        throw Util.missingProperty("estimatedTotalNetAmountDirection", "estimatedTotalNetAmountDirection", reader);
                    }
                    if (formSourceFromJson == null) {
                        throw Util.missingProperty("formSource", "formSource", reader);
                    }
                    if (uuidFromJson4 == null) {
                        throw Util.missingProperty("equityInstrumentId", "equityInstrumentId", reader);
                    }
                    if (strFromJson4 != null) {
                        return new ComboOrder(uuid, str, bigDecimal, str2, bigDecimal2, uuid2, str3, optionStrategyType, bigDecimal3, instant, orderState, orderDirection, bigDecimalFromJson4, zBooleanValue, bigDecimalFromJson5, orderDirectionFromJson2, optionStrategyTypeFromJson2, bigDecimalFromJson6, bigDecimalFromJson7, bigDecimalFromJson8, bigDecimalFromJson9, bigDecimalFromJson10, bigDecimalFromJson11, bigDecimalFromJson12, bigDecimalFromJson13, optionStrategyTypeFromJson3, orderTimeInForceFromJson, orderTriggerFromJson, orderTypeFromJson, instantFromJson2, uuidFromJson3, orderDirectionFromJson3, bigDecimalFromJson14, orderDirectionFromJson4, formSourceFromJson, uuidFromJson4, strFromJson4);
                    }
                    throw Util.missingProperty("underlyingSymbol", "underlyingSymbol", reader);
                }
                throw Util.missingProperty("isReplaceable", "isReplaceable", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ComboOrder value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getId());
        writer.name("accountNumber");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getAccountNumber());
        writer.name("averageNetPremiumPaid");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getAverageNetPremiumPaid());
        writer.name("cancelUrl");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getCancelUrl());
        writer.name("canceledQuantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getCanceledQuantity());
        writer.name("chainId");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getChainId());
        writer.name("chainSymbol");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getChainSymbol());
        writer.name("closingStrategy");
        this.nullableOptionStrategyTypeAdapter.toJson(writer, (JsonWriter) value_.getClosingStrategy());
        writer.name("contractFees");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getContractFees());
        writer.name("createdAt");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getCreatedAt());
        writer.name("derivedState");
        this.orderStateAdapter.toJson(writer, (JsonWriter) value_.getDerivedState());
        writer.name("direction");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getDirection());
        writer.name("goldSavings");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getGoldSavings());
        writer.name("isReplaceable");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isReplaceable()));
        writer.name("netAmount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getNetAmount());
        writer.name("netAmountDirection");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getNetAmountDirection());
        writer.name("openingStrategy");
        this.nullableOptionStrategyTypeAdapter.toJson(writer, (JsonWriter) value_.getOpeningStrategy());
        writer.name("pendingQuantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPendingQuantity());
        writer.name("premium");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPremium());
        writer.name(AnalyticsStrings.TAG_SORT_ORDER_PRICE);
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPrice());
        writer.name("processedPremium");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getProcessedPremium());
        writer.name("processedQuantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getProcessedQuantity());
        writer.name("quantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getQuantity());
        writer.name("regulatoryFees");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getRegulatoryFees());
        writer.name("stopPrice");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getStopPrice());
        writer.name("strategy");
        this.nullableOptionStrategyTypeAdapter.toJson(writer, (JsonWriter) value_.getStrategy());
        writer.name("timeInForce");
        this.orderTimeInForceAdapter.toJson(writer, (JsonWriter) value_.getTimeInForce());
        writer.name("trigger");
        this.orderTriggerAdapter.toJson(writer, (JsonWriter) value_.getTrigger());
        writer.name("type");
        this.orderTypeAdapter.toJson(writer, (JsonWriter) value_.getType());
        writer.name("updatedAt");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getUpdatedAt());
        writer.name("refId");
        this.nullableUUIDAdapter.toJson(writer, (JsonWriter) value_.getRefId());
        writer.name("processedPremiumDirection");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getProcessedPremiumDirection());
        writer.name("estimatedTotalNetAmount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getEstimatedTotalNetAmount());
        writer.name("estimatedTotalNetAmountDirection");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getEstimatedTotalNetAmountDirection());
        writer.name("formSource");
        this.formSourceAdapter.toJson(writer, (JsonWriter) value_.getFormSource());
        writer.name("equityInstrumentId");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getEquityInstrumentId());
        writer.name("underlyingSymbol");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getUnderlyingSymbol());
        writer.endObject();
    }
}
