package com.robinhood.rosetta.converters.options;

import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.OptionOrderPayload;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rosetta.option.Direction;
import rosetta.option.OptionOrderFormSource;
import rosetta.order.TimeInForce;

/* compiled from: OptionOrders.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "Lrosetta/option/OptionOrderFormSource;", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.converters.options.OptionOrdersKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class OptionOrders2 {

    /* compiled from: OptionOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.options.OptionOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrder.FormSource.values().length];
            try {
                iArr[OptionOrder.FormSource.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrder.FormSource.OPTION_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionOrder.FormSource.INSTRUMENT_DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionOrder.FormSource.AGGREGATE_POSITION_DETAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionOrder.FormSource.STRATEGY_DETAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionOrder.FormSource.ORDER_DETAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionOrder.FormSource.ACTIVITY_ITEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionOrder.FormSource.STRATEGY_ROLL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionOrder.FormSource.STRATEGY_CHAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionOrder.FormSource.SIMULATED_RETURNS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionOrder.FormSource.HOME_TAB.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionOrder.FormSource.ASSET_HOME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionOrder.FormSource.RETIREMENT_HOME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OptionOrderPayload toProtobuf(ApiOptionOrderRequest apiOptionOrderRequest, Moshi moshi) {
        String serverValue;
        Intrinsics.checkNotNullParameter(apiOptionOrderRequest, "<this>");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        String account = apiOptionOrderRequest.getAccount();
        String protobuf = Securities.toProtobuf(apiOptionOrderRequest.getClient_ask_at_submission());
        String protobuf2 = Securities.toProtobuf(apiOptionOrderRequest.getClient_bid_at_submission());
        Direction protobuf3 = Orders2.toProtobuf(apiOptionOrderRequest.getDirection());
        OptionOrderFormSource protobuf4 = toProtobuf(apiOptionOrderRequest.getForm_source());
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = moshi.adapter(new TypeToken<List<? extends ApiOptionOrderRequest.Leg>>() { // from class: com.robinhood.rosetta.converters.options.OptionOrdersKt$toProtobuf$$inlined$getAdapter$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        String json = jsonAdapterAdapter.toJson(apiOptionOrderRequest.getLegs());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        boolean override_day_trade_checks = apiOptionOrderRequest.getOverride_day_trade_checks();
        boolean override_dtbp_checks = apiOptionOrderRequest.getOverride_dtbp_checks();
        String protobuf5 = Securities.toProtobuf(apiOptionOrderRequest.getPrice());
        String protobuf6 = Securities.toProtobuf(apiOptionOrderRequest.getQuantity());
        String string2 = apiOptionOrderRequest.getRef_id().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        TimeInForce protobuf7 = Orders2.toProtobuf(apiOptionOrderRequest.getTime_in_force());
        String protobuf8 = Securities.toProtobuf(apiOptionOrderRequest.getStop_price());
        OrderMarketHours market_hours = apiOptionOrderRequest.getMarket_hours();
        if (market_hours == null || (serverValue = market_hours.getServerValue()) == null) {
            serverValue = "";
        }
        return new OptionOrderPayload(string2, account, json, protobuf5, protobuf8, protobuf6, protobuf7, Orders2.toProtobuf(apiOptionOrderRequest.getTrigger()), Orders2.toProtobuf(apiOptionOrderRequest.getType()), protobuf3, override_day_trade_checks, override_dtbp_checks, protobuf4, protobuf2, protobuf, serverValue, null, 65536, null);
    }

    public static final OptionOrderFormSource toProtobuf(OptionOrder.FormSource formSource) {
        Intrinsics.checkNotNullParameter(formSource, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[formSource.ordinal()]) {
            case 1:
                return OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
            case 2:
                return OptionOrderFormSource.OPTION_CHAIN;
            case 3:
                return OptionOrderFormSource.INSTRUMENT_DETAIL;
            case 4:
                return OptionOrderFormSource.AGGREGATE_POSITION_DETAIL;
            case 5:
                return OptionOrderFormSource.STRATEGY_DETAIL;
            case 6:
                return OptionOrderFormSource.ORDER_DETAIL;
            case 7:
                return OptionOrderFormSource.ACTIVITY_ITEM;
            case 8:
                return OptionOrderFormSource.STRATEGY_ROLL;
            case 9:
                return OptionOrderFormSource.STRATEGY_CHAIN;
            case 10:
                return OptionOrderFormSource.SIMULATED_RETURNS;
            case 11:
                return OptionOrderFormSource.HOME_TAB;
            case 12:
                return OptionOrderFormSource.ASSET_HOME;
            case 13:
                return OptionOrderFormSource.RETIREMENT_HOME;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
