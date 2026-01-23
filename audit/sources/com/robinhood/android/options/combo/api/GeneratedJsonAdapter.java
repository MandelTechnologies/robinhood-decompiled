package com.robinhood.android.options.combo.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.combo.api.ApiComboOrder;
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
import p479j$.time.Instant;

/* compiled from: ApiComboOrderJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020-\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0018¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/android/options/combo/api/ApiComboOrder;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "nullableStringAdapter", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/robinhood/models/api/OptionStrategyType;", "nullableOptionStrategyTypeAdapter", "nullableBigDecimalAdapter", "j$/time/Instant", "instantAdapter", "Lcom/robinhood/shared/models/history/shared/OrderState;", "orderStateAdapter", "Lcom/robinhood/models/db/OrderDirection;", "orderDirectionAdapter", "nullableUUIDAdapter", "", "booleanAdapter", "", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$Leg;", "listOfLegAdapter", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$SalesTax;", "nullableListOfSalesTaxAdapter", "Lcom/robinhood/models/db/OrderTimeInForce;", "orderTimeInForceAdapter", "Lcom/robinhood/models/db/OrderTrigger;", "orderTriggerAdapter", "Lcom/robinhood/models/db/OrderType;", "orderTypeAdapter", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "nullableFormSourceAdapter", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.combo.api.ApiComboOrderJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ApiComboOrder> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Instant> instantAdapter;
    private final JsonAdapter<List<ApiComboOrder.Leg>> listOfLegAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<OptionOrder.FormSource> nullableFormSourceAdapter;
    private final JsonAdapter<List<ApiComboOrder.SalesTax>> nullableListOfSalesTaxAdapter;
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
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("account_number", "average_net_premium_paid", "cancel_url", "canceled_quantity", "chain_id", "chain_symbol", "closing_strategy", "contract_fees", "created_at", "derived_state", "direction", "gold_savings", "id", "ref_id", "is_replaceable", "legs", "net_amount", "net_amount_direction", "opening_strategy", "pending_quantity", "premium", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "processed_premium", "processed_premium_direction", "processed_quantity", "quantity", "regulatory_fees", "sales_taxes", "stop_price", "strategy", "time_in_force", "trigger", "type", "updated_at", "estimated_total_net_amount", "estimated_total_net_amount_direction", "form_source", "equity_instrument_id", "underlying_symbol");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "account_number");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<BigDecimal> jsonAdapterAdapter2 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "average_net_premium_paid");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.bigDecimalAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "cancel_url");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<UUID> jsonAdapterAdapter4 = moshi.adapter(UUID.class, SetsKt.emptySet(), "chain_id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.uUIDAdapter = jsonAdapterAdapter4;
        JsonAdapter<OptionStrategyType> jsonAdapterAdapter5 = moshi.adapter(OptionStrategyType.class, SetsKt.emptySet(), "closing_strategy");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableOptionStrategyTypeAdapter = jsonAdapterAdapter5;
        JsonAdapter<BigDecimal> jsonAdapterAdapter6 = moshi.adapter(BigDecimal.class, SetsKt.emptySet(), "contract_fees");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.nullableBigDecimalAdapter = jsonAdapterAdapter6;
        JsonAdapter<Instant> jsonAdapterAdapter7 = moshi.adapter(Instant.class, SetsKt.emptySet(), "created_at");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.instantAdapter = jsonAdapterAdapter7;
        JsonAdapter<OrderState> jsonAdapterAdapter8 = moshi.adapter(OrderState.class, SetsKt.emptySet(), "derived_state");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "adapter(...)");
        this.orderStateAdapter = jsonAdapterAdapter8;
        JsonAdapter<OrderDirection> jsonAdapterAdapter9 = moshi.adapter(OrderDirection.class, SetsKt.emptySet(), "direction");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter9, "adapter(...)");
        this.orderDirectionAdapter = jsonAdapterAdapter9;
        JsonAdapter<UUID> jsonAdapterAdapter10 = moshi.adapter(UUID.class, SetsKt.emptySet(), "ref_id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter10, "adapter(...)");
        this.nullableUUIDAdapter = jsonAdapterAdapter10;
        JsonAdapter<Boolean> jsonAdapterAdapter11 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "is_replaceable");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter11, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter11;
        JsonAdapter<List<ApiComboOrder.Leg>> jsonAdapterAdapter12 = moshi.adapter(Types.newParameterizedType(List.class, ApiComboOrder.Leg.class), SetsKt.emptySet(), "legs");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter12, "adapter(...)");
        this.listOfLegAdapter = jsonAdapterAdapter12;
        JsonAdapter<List<ApiComboOrder.SalesTax>> jsonAdapterAdapter13 = moshi.adapter(Types.newParameterizedType(List.class, ApiComboOrder.SalesTax.class), SetsKt.emptySet(), "sales_taxes");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter13, "adapter(...)");
        this.nullableListOfSalesTaxAdapter = jsonAdapterAdapter13;
        JsonAdapter<OrderTimeInForce> jsonAdapterAdapter14 = moshi.adapter(OrderTimeInForce.class, SetsKt.emptySet(), "time_in_force");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter14, "adapter(...)");
        this.orderTimeInForceAdapter = jsonAdapterAdapter14;
        JsonAdapter<OrderTrigger> jsonAdapterAdapter15 = moshi.adapter(OrderTrigger.class, SetsKt.emptySet(), "trigger");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter15, "adapter(...)");
        this.orderTriggerAdapter = jsonAdapterAdapter15;
        JsonAdapter<OrderType> jsonAdapterAdapter16 = moshi.adapter(OrderType.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter16, "adapter(...)");
        this.orderTypeAdapter = jsonAdapterAdapter16;
        JsonAdapter<OptionOrder.FormSource> jsonAdapterAdapter17 = moshi.adapter(OptionOrder.FormSource.class, SetsKt.emptySet(), "form_source");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter17, "adapter(...)");
        this.nullableFormSourceAdapter = jsonAdapterAdapter17;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ApiComboOrder");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ApiComboOrder fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean boolFromJson = null;
        String strFromJson = null;
        BigDecimal bigDecimalFromJson = null;
        String strFromJson2 = null;
        BigDecimal bigDecimalFromJson2 = null;
        UUID uuidFromJson = null;
        String strFromJson3 = null;
        OptionStrategyType optionStrategyTypeFromJson = null;
        BigDecimal bigDecimalFromJson3 = null;
        Instant instantFromJson = null;
        OrderState orderStateFromJson = null;
        OrderDirection orderDirectionFromJson = null;
        BigDecimal bigDecimalFromJson4 = null;
        UUID uuidFromJson2 = null;
        UUID uuidFromJson3 = null;
        List<ApiComboOrder.Leg> listFromJson = null;
        BigDecimal bigDecimalFromJson5 = null;
        OrderDirection orderDirectionFromJson2 = null;
        OptionStrategyType optionStrategyTypeFromJson2 = null;
        BigDecimal bigDecimalFromJson6 = null;
        BigDecimal bigDecimalFromJson7 = null;
        BigDecimal bigDecimalFromJson8 = null;
        BigDecimal bigDecimalFromJson9 = null;
        OrderDirection orderDirectionFromJson3 = null;
        BigDecimal bigDecimalFromJson10 = null;
        BigDecimal bigDecimalFromJson11 = null;
        BigDecimal bigDecimalFromJson12 = null;
        List<ApiComboOrder.SalesTax> listFromJson2 = null;
        BigDecimal bigDecimalFromJson13 = null;
        OptionStrategyType optionStrategyTypeFromJson3 = null;
        OrderTimeInForce orderTimeInForceFromJson = null;
        OrderTrigger orderTriggerFromJson = null;
        OrderType orderTypeFromJson = null;
        Instant instantFromJson2 = null;
        BigDecimal bigDecimalFromJson14 = null;
        OrderDirection orderDirectionFromJson4 = null;
        OptionOrder.FormSource formSourceFromJson = null;
        UUID uuidFromJson4 = null;
        String strFromJson4 = null;
        while (true) {
            Boolean bool = boolFromJson;
            String str = strFromJson;
            BigDecimal bigDecimal = bigDecimalFromJson;
            String str2 = strFromJson2;
            BigDecimal bigDecimal2 = bigDecimalFromJson2;
            UUID uuid = uuidFromJson;
            String str3 = strFromJson3;
            OptionStrategyType optionStrategyType = optionStrategyTypeFromJson;
            BigDecimal bigDecimal3 = bigDecimalFromJson3;
            Instant instant = instantFromJson;
            OrderState orderState = orderStateFromJson;
            OrderDirection orderDirection = orderDirectionFromJson;
            BigDecimal bigDecimal4 = bigDecimalFromJson4;
            if (reader.hasNext()) {
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            throw Util.unexpectedNull("account_number", "account_number", reader);
                        }
                        boolFromJson = bool;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 1:
                        bigDecimalFromJson = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson == null) {
                            throw Util.unexpectedNull("average_net_premium_paid", "average_net_premium_paid", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 2:
                        strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 3:
                        bigDecimalFromJson2 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson2 == null) {
                            throw Util.unexpectedNull("canceled_quantity", "canceled_quantity", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 4:
                        uuidFromJson = this.uUIDAdapter.fromJson(reader);
                        if (uuidFromJson == null) {
                            throw Util.unexpectedNull("chain_id", "chain_id", reader);
                        }
                        boolFromJson = bool;
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
                        bigDecimalFromJson4 = bigDecimal4;
                    case 5:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            throw Util.unexpectedNull("chain_symbol", "chain_symbol", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 6:
                        optionStrategyTypeFromJson = this.nullableOptionStrategyTypeAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 7:
                        bigDecimalFromJson3 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 8:
                        instantFromJson = this.instantAdapter.fromJson(reader);
                        if (instantFromJson == null) {
                            throw Util.unexpectedNull("created_at", "created_at", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 9:
                        orderStateFromJson = this.orderStateAdapter.fromJson(reader);
                        if (orderStateFromJson == null) {
                            throw Util.unexpectedNull("derived_state", "derived_state", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 10:
                        orderDirectionFromJson = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson == null) {
                            throw Util.unexpectedNull("direction", "direction", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 11:
                        bigDecimalFromJson4 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                    case 12:
                        uuidFromJson2 = this.uUIDAdapter.fromJson(reader);
                        if (uuidFromJson2 == null) {
                            throw Util.unexpectedNull("id", "id", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 13:
                        uuidFromJson3 = this.nullableUUIDAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 14:
                        boolFromJson = this.booleanAdapter.fromJson(reader);
                        if (boolFromJson == null) {
                            throw Util.unexpectedNull("is_replaceable", "is_replaceable", reader);
                        }
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 15:
                        listFromJson = this.listOfLegAdapter.fromJson(reader);
                        if (listFromJson == null) {
                            throw Util.unexpectedNull("legs", "legs", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 16:
                        bigDecimalFromJson5 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson5 == null) {
                            throw Util.unexpectedNull("net_amount", "net_amount", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 17:
                        orderDirectionFromJson2 = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson2 == null) {
                            throw Util.unexpectedNull("net_amount_direction", "net_amount_direction", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 18:
                        optionStrategyTypeFromJson2 = this.nullableOptionStrategyTypeAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 19:
                        bigDecimalFromJson6 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson6 == null) {
                            throw Util.unexpectedNull("pending_quantity", "pending_quantity", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 20:
                        bigDecimalFromJson7 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 21:
                        bigDecimalFromJson8 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 22:
                        bigDecimalFromJson9 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson9 == null) {
                            throw Util.unexpectedNull("processed_premium", "processed_premium", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 23:
                        orderDirectionFromJson3 = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson3 == null) {
                            throw Util.unexpectedNull("processed_premium_direction", "processed_premium_direction", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 24:
                        bigDecimalFromJson10 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson10 == null) {
                            throw Util.unexpectedNull("processed_quantity", "processed_quantity", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 25:
                        bigDecimalFromJson11 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson11 == null) {
                            throw Util.unexpectedNull("quantity", "quantity", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 26:
                        bigDecimalFromJson12 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson12 == null) {
                            throw Util.unexpectedNull("regulatory_fees", "regulatory_fees", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 27:
                        listFromJson2 = this.nullableListOfSalesTaxAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 28:
                        bigDecimalFromJson13 = this.nullableBigDecimalAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 29:
                        optionStrategyTypeFromJson3 = this.nullableOptionStrategyTypeAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 30:
                        orderTimeInForceFromJson = this.orderTimeInForceAdapter.fromJson(reader);
                        if (orderTimeInForceFromJson == null) {
                            throw Util.unexpectedNull("time_in_force", "time_in_force", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 31:
                        orderTriggerFromJson = this.orderTriggerAdapter.fromJson(reader);
                        if (orderTriggerFromJson == null) {
                            throw Util.unexpectedNull("trigger", "trigger", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 32:
                        orderTypeFromJson = this.orderTypeAdapter.fromJson(reader);
                        if (orderTypeFromJson == null) {
                            throw Util.unexpectedNull("type", "type", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 33:
                        instantFromJson2 = this.instantAdapter.fromJson(reader);
                        if (instantFromJson2 == null) {
                            throw Util.unexpectedNull("updated_at", "updated_at", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 34:
                        bigDecimalFromJson14 = this.bigDecimalAdapter.fromJson(reader);
                        if (bigDecimalFromJson14 == null) {
                            throw Util.unexpectedNull("estimated_total_net_amount", "estimated_total_net_amount", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 35:
                        orderDirectionFromJson4 = this.orderDirectionAdapter.fromJson(reader);
                        if (orderDirectionFromJson4 == null) {
                            throw Util.unexpectedNull("estimated_total_net_amount_direction", "estimated_total_net_amount_direction", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 36:
                        formSourceFromJson = this.nullableFormSourceAdapter.fromJson(reader);
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 37:
                        uuidFromJson4 = this.uUIDAdapter.fromJson(reader);
                        if (uuidFromJson4 == null) {
                            throw Util.unexpectedNull("equity_instrument_id", "equity_instrument_id", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    case 38:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            throw Util.unexpectedNull("underlying_symbol", "underlying_symbol", reader);
                        }
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                    default:
                        boolFromJson = bool;
                        strFromJson = str;
                        bigDecimalFromJson = bigDecimal;
                        strFromJson2 = str2;
                        bigDecimalFromJson2 = bigDecimal2;
                        uuidFromJson = uuid;
                        strFromJson3 = str3;
                        optionStrategyTypeFromJson = optionStrategyType;
                        bigDecimalFromJson3 = bigDecimal3;
                        instantFromJson = instant;
                        orderStateFromJson = orderState;
                        orderDirectionFromJson = orderDirection;
                        bigDecimalFromJson4 = bigDecimal4;
                }
            } else {
                reader.endObject();
                if (str == null) {
                    throw Util.missingProperty("account_number", "account_number", reader);
                }
                if (bigDecimal == null) {
                    throw Util.missingProperty("average_net_premium_paid", "average_net_premium_paid", reader);
                }
                if (bigDecimal2 == null) {
                    throw Util.missingProperty("canceled_quantity", "canceled_quantity", reader);
                }
                if (uuid == null) {
                    throw Util.missingProperty("chain_id", "chain_id", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("chain_symbol", "chain_symbol", reader);
                }
                if (instant == null) {
                    throw Util.missingProperty("created_at", "created_at", reader);
                }
                if (orderState == null) {
                    throw Util.missingProperty("derived_state", "derived_state", reader);
                }
                if (orderDirection == null) {
                    throw Util.missingProperty("direction", "direction", reader);
                }
                if (uuidFromJson2 == null) {
                    throw Util.missingProperty("id", "id", reader);
                }
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    if (listFromJson == null) {
                        throw Util.missingProperty("legs", "legs", reader);
                    }
                    if (bigDecimalFromJson5 == null) {
                        throw Util.missingProperty("net_amount", "net_amount", reader);
                    }
                    if (orderDirectionFromJson2 == null) {
                        throw Util.missingProperty("net_amount_direction", "net_amount_direction", reader);
                    }
                    if (bigDecimalFromJson6 == null) {
                        throw Util.missingProperty("pending_quantity", "pending_quantity", reader);
                    }
                    if (bigDecimalFromJson9 == null) {
                        throw Util.missingProperty("processed_premium", "processed_premium", reader);
                    }
                    if (orderDirectionFromJson3 == null) {
                        throw Util.missingProperty("processed_premium_direction", "processed_premium_direction", reader);
                    }
                    if (bigDecimalFromJson10 == null) {
                        throw Util.missingProperty("processed_quantity", "processed_quantity", reader);
                    }
                    if (bigDecimalFromJson11 == null) {
                        throw Util.missingProperty("quantity", "quantity", reader);
                    }
                    if (bigDecimalFromJson12 == null) {
                        throw Util.missingProperty("regulatory_fees", "regulatory_fees", reader);
                    }
                    if (orderTimeInForceFromJson == null) {
                        throw Util.missingProperty("time_in_force", "time_in_force", reader);
                    }
                    if (orderTriggerFromJson == null) {
                        throw Util.missingProperty("trigger", "trigger", reader);
                    }
                    if (orderTypeFromJson == null) {
                        throw Util.missingProperty("type", "type", reader);
                    }
                    if (instantFromJson2 == null) {
                        throw Util.missingProperty("updated_at", "updated_at", reader);
                    }
                    if (bigDecimalFromJson14 == null) {
                        throw Util.missingProperty("estimated_total_net_amount", "estimated_total_net_amount", reader);
                    }
                    if (orderDirectionFromJson4 == null) {
                        throw Util.missingProperty("estimated_total_net_amount_direction", "estimated_total_net_amount_direction", reader);
                    }
                    if (uuidFromJson4 == null) {
                        throw Util.missingProperty("equity_instrument_id", "equity_instrument_id", reader);
                    }
                    if (strFromJson4 != null) {
                        return new ApiComboOrder(str, bigDecimal, str2, bigDecimal2, uuid, str3, optionStrategyType, bigDecimal3, instant, orderState, orderDirection, bigDecimal4, uuidFromJson2, uuidFromJson3, zBooleanValue, listFromJson, bigDecimalFromJson5, orderDirectionFromJson2, optionStrategyTypeFromJson2, bigDecimalFromJson6, bigDecimalFromJson7, bigDecimalFromJson8, bigDecimalFromJson9, orderDirectionFromJson3, bigDecimalFromJson10, bigDecimalFromJson11, bigDecimalFromJson12, listFromJson2, bigDecimalFromJson13, optionStrategyTypeFromJson3, orderTimeInForceFromJson, orderTriggerFromJson, orderTypeFromJson, instantFromJson2, bigDecimalFromJson14, orderDirectionFromJson4, formSourceFromJson, uuidFromJson4, strFromJson4);
                    }
                    throw Util.missingProperty("underlying_symbol", "underlying_symbol", reader);
                }
                throw Util.missingProperty("is_replaceable", "is_replaceable", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ApiComboOrder value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("account_number");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getAccount_number());
        writer.name("average_net_premium_paid");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getAverage_net_premium_paid());
        writer.name("cancel_url");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getCancel_url());
        writer.name("canceled_quantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getCanceled_quantity());
        writer.name("chain_id");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getChain_id());
        writer.name("chain_symbol");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getChain_symbol());
        writer.name("closing_strategy");
        this.nullableOptionStrategyTypeAdapter.toJson(writer, (JsonWriter) value_.getClosing_strategy());
        writer.name("contract_fees");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getContract_fees());
        writer.name("created_at");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getCreated_at());
        writer.name("derived_state");
        this.orderStateAdapter.toJson(writer, (JsonWriter) value_.getDerived_state());
        writer.name("direction");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getDirection());
        writer.name("gold_savings");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getGold_savings());
        writer.name("id");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getId());
        writer.name("ref_id");
        this.nullableUUIDAdapter.toJson(writer, (JsonWriter) value_.getRef_id());
        writer.name("is_replaceable");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.is_replaceable()));
        writer.name("legs");
        this.listOfLegAdapter.toJson(writer, (JsonWriter) value_.getLegs());
        writer.name("net_amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getNet_amount());
        writer.name("net_amount_direction");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getNet_amount_direction());
        writer.name("opening_strategy");
        this.nullableOptionStrategyTypeAdapter.toJson(writer, (JsonWriter) value_.getOpening_strategy());
        writer.name("pending_quantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPending_quantity());
        writer.name("premium");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPremium());
        writer.name(AnalyticsStrings.TAG_SORT_ORDER_PRICE);
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getPrice());
        writer.name("processed_premium");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getProcessed_premium());
        writer.name("processed_premium_direction");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getProcessed_premium_direction());
        writer.name("processed_quantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getProcessed_quantity());
        writer.name("quantity");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getQuantity());
        writer.name("regulatory_fees");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getRegulatory_fees());
        writer.name("sales_taxes");
        this.nullableListOfSalesTaxAdapter.toJson(writer, (JsonWriter) value_.getSales_taxes());
        writer.name("stop_price");
        this.nullableBigDecimalAdapter.toJson(writer, (JsonWriter) value_.getStop_price());
        writer.name("strategy");
        this.nullableOptionStrategyTypeAdapter.toJson(writer, (JsonWriter) value_.getStrategy());
        writer.name("time_in_force");
        this.orderTimeInForceAdapter.toJson(writer, (JsonWriter) value_.getTime_in_force());
        writer.name("trigger");
        this.orderTriggerAdapter.toJson(writer, (JsonWriter) value_.getTrigger());
        writer.name("type");
        this.orderTypeAdapter.toJson(writer, (JsonWriter) value_.getType());
        writer.name("updated_at");
        this.instantAdapter.toJson(writer, (JsonWriter) value_.getUpdated_at());
        writer.name("estimated_total_net_amount");
        this.bigDecimalAdapter.toJson(writer, (JsonWriter) value_.getEstimated_total_net_amount());
        writer.name("estimated_total_net_amount_direction");
        this.orderDirectionAdapter.toJson(writer, (JsonWriter) value_.getEstimated_total_net_amount_direction());
        writer.name("form_source");
        this.nullableFormSourceAdapter.toJson(writer, (JsonWriter) value_.getForm_source());
        writer.name("equity_instrument_id");
        this.uUIDAdapter.toJson(writer, (JsonWriter) value_.getEquity_instrument_id());
        writer.name("underlying_symbol");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getUnderlying_symbol());
        writer.endObject();
    }
}
