package com.robinhood.android.equity.validation;

import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.models.api.ApiFeeItem;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderRequestInputs.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0001tBç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0010\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020\u000b¢\u0006\u0004\b(\u0010)J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0003J\t\u0010_\u001a\u00020\u0012HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010d\u001a\u00020\u0019HÆ\u0003J\t\u0010e\u001a\u00020\u001bHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0010HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010i\u001a\u00020\u000bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020$0\u0010HÆ\u0003J\t\u0010l\u001a\u00020&HÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\u009c\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00102\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u000b2\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0016HÖ\u0001J\t\u0010s\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0011\u0010 \u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0010¢\u0006\b\n\u0000\u001a\u0004\bK\u00108R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010'\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0011\u0010O\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010S\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "accountNumber", "", "orderToReplaceId", "Ljava/util/UUID;", "limitPrice", "Ljava/math/BigDecimal;", "overrideFlipIpoAccessShares", "", "overrideToExecuteInMarketHoursOnly", "overrideMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "checkOverrides", "", "quantityOrAmount", "Lcom/robinhood/models/api/QuantityOrAmount;", "stopPrice", "trailAmount", "trailPercentage", "", "presetPercentLimit", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "estimatedTotalFeesAndTaxes", "estimatedFees", "Lcom/robinhood/models/api/ApiFeeItem;", "borrowFeeApr", "marketBuysEnabled", "taxLotSelectionType", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "taxLotsSelections", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "subzeroEnabled", "<init>", "(Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;Ljava/lang/String;Ljava/util/UUID;Ljava/math/BigDecimal;ZZLcom/robinhood/models/db/OrderMarketHours;Ljava/util/List;Lcom/robinhood/models/api/QuantityOrAmount;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/Order$Configuration;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;ZLcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;Ljava/util/List;Lcom/robinhood/models/db/OrderPositionEffect;Z)V", "getStaticInputs", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "getAccountNumber", "()Ljava/lang/String;", "getOrderToReplaceId", "()Ljava/util/UUID;", "getLimitPrice", "()Ljava/math/BigDecimal;", "getOverrideFlipIpoAccessShares", "()Z", "getOverrideToExecuteInMarketHoursOnly", "getOverrideMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getCheckOverrides", "()Ljava/util/List;", "getQuantityOrAmount", "()Lcom/robinhood/models/api/QuantityOrAmount;", "getStopPrice", "getTrailAmount", "getTrailPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPresetPercentLimit", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getEstimatedTotalFeesAndTaxes", "getEstimatedFees", "getBorrowFeeApr", "getMarketBuysEnabled", "getTaxLotSelectionType", "()Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "getTaxLotsSelections", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getSubzeroEnabled", "type", "Lcom/robinhood/models/db/OrderType;", "getType", "()Lcom/robinhood/models/db/OrderType;", "trigger", "Lcom/robinhood/models/db/OrderTrigger;", "getTrigger", "()Lcom/robinhood/models/db/OrderTrigger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;Ljava/lang/String;Ljava/util/UUID;Ljava/math/BigDecimal;ZZLcom/robinhood/models/db/OrderMarketHours;Ljava/util/List;Lcom/robinhood/models/api/QuantityOrAmount;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/Order$Configuration;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;ZLcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;Ljava/util/List;Lcom/robinhood/models/db/OrderPositionEffect;Z)Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "equals", "other", "hashCode", "toString", "StaticInputs", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityOrderRequestInputs {
    public static final int $stable = 8;
    private final String accountNumber;
    private final BigDecimal borrowFeeApr;
    private final List<String> checkOverrides;
    private final List<ApiFeeItem> estimatedFees;
    private final BigDecimal estimatedTotalFeesAndTaxes;
    private final BigDecimal limitPrice;
    private final boolean marketBuysEnabled;
    private final Order.Configuration orderConfiguration;
    private final UUID orderToReplaceId;
    private final boolean overrideFlipIpoAccessShares;
    private final OrderMarketHours overrideMarketHours;
    private final boolean overrideToExecuteInMarketHoursOnly;
    private final OrderPositionEffect positionEffect;
    private final BigDecimal presetPercentLimit;
    private final OrderRequest2 quantityOrAmount;
    private final StaticInputs staticInputs;
    private final BigDecimal stopPrice;
    private final boolean subzeroEnabled;
    private final TaxLotSelectionType taxLotSelectionType;
    private final List<TaxLotSelection> taxLotsSelections;
    private final OrderTimeInForce timeInForce;
    private final BigDecimal trailAmount;
    private final Integer trailPercentage;

    public static /* synthetic */ EquityOrderRequestInputs copy$default(EquityOrderRequestInputs equityOrderRequestInputs, StaticInputs staticInputs, String str, UUID uuid, BigDecimal bigDecimal, boolean z, boolean z2, OrderMarketHours orderMarketHours, List list, OrderRequest2 orderRequest2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Integer num, BigDecimal bigDecimal4, OrderTimeInForce orderTimeInForce, Order.Configuration configuration, BigDecimal bigDecimal5, List list2, BigDecimal bigDecimal6, boolean z3, TaxLotSelectionType taxLotSelectionType, List list3, OrderPositionEffect orderPositionEffect, boolean z4, int i, Object obj) {
        boolean z5;
        OrderPositionEffect orderPositionEffect2;
        StaticInputs staticInputs2 = (i & 1) != 0 ? equityOrderRequestInputs.staticInputs : staticInputs;
        String str2 = (i & 2) != 0 ? equityOrderRequestInputs.accountNumber : str;
        UUID uuid2 = (i & 4) != 0 ? equityOrderRequestInputs.orderToReplaceId : uuid;
        BigDecimal bigDecimal7 = (i & 8) != 0 ? equityOrderRequestInputs.limitPrice : bigDecimal;
        boolean z6 = (i & 16) != 0 ? equityOrderRequestInputs.overrideFlipIpoAccessShares : z;
        boolean z7 = (i & 32) != 0 ? equityOrderRequestInputs.overrideToExecuteInMarketHoursOnly : z2;
        OrderMarketHours orderMarketHours2 = (i & 64) != 0 ? equityOrderRequestInputs.overrideMarketHours : orderMarketHours;
        List list4 = (i & 128) != 0 ? equityOrderRequestInputs.checkOverrides : list;
        OrderRequest2 orderRequest22 = (i & 256) != 0 ? equityOrderRequestInputs.quantityOrAmount : orderRequest2;
        BigDecimal bigDecimal8 = (i & 512) != 0 ? equityOrderRequestInputs.stopPrice : bigDecimal2;
        BigDecimal bigDecimal9 = (i & 1024) != 0 ? equityOrderRequestInputs.trailAmount : bigDecimal3;
        Integer num2 = (i & 2048) != 0 ? equityOrderRequestInputs.trailPercentage : num;
        BigDecimal bigDecimal10 = (i & 4096) != 0 ? equityOrderRequestInputs.presetPercentLimit : bigDecimal4;
        OrderTimeInForce orderTimeInForce2 = (i & 8192) != 0 ? equityOrderRequestInputs.timeInForce : orderTimeInForce;
        StaticInputs staticInputs3 = staticInputs2;
        Order.Configuration configuration2 = (i & 16384) != 0 ? equityOrderRequestInputs.orderConfiguration : configuration;
        BigDecimal bigDecimal11 = (i & 32768) != 0 ? equityOrderRequestInputs.estimatedTotalFeesAndTaxes : bigDecimal5;
        List list5 = (i & 65536) != 0 ? equityOrderRequestInputs.estimatedFees : list2;
        BigDecimal bigDecimal12 = (i & 131072) != 0 ? equityOrderRequestInputs.borrowFeeApr : bigDecimal6;
        boolean z8 = (i & 262144) != 0 ? equityOrderRequestInputs.marketBuysEnabled : z3;
        TaxLotSelectionType taxLotSelectionType2 = (i & 524288) != 0 ? equityOrderRequestInputs.taxLotSelectionType : taxLotSelectionType;
        List list6 = (i & 1048576) != 0 ? equityOrderRequestInputs.taxLotsSelections : list3;
        OrderPositionEffect orderPositionEffect3 = (i & 2097152) != 0 ? equityOrderRequestInputs.positionEffect : orderPositionEffect;
        if ((i & 4194304) != 0) {
            orderPositionEffect2 = orderPositionEffect3;
            z5 = equityOrderRequestInputs.subzeroEnabled;
        } else {
            z5 = z4;
            orderPositionEffect2 = orderPositionEffect3;
        }
        return equityOrderRequestInputs.copy(staticInputs3, str2, uuid2, bigDecimal7, z6, z7, orderMarketHours2, list4, orderRequest22, bigDecimal8, bigDecimal9, num2, bigDecimal10, orderTimeInForce2, configuration2, bigDecimal11, list5, bigDecimal12, z8, taxLotSelectionType2, list6, orderPositionEffect2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    /* renamed from: component10, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    /* renamed from: component11, reason: from getter */
    public final BigDecimal getTrailAmount() {
        return this.trailAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getTrailPercentage() {
        return this.trailPercentage;
    }

    /* renamed from: component13, reason: from getter */
    public final BigDecimal getPresetPercentLimit() {
        return this.presetPercentLimit;
    }

    /* renamed from: component14, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component15, reason: from getter */
    public final Order.Configuration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component16, reason: from getter */
    public final BigDecimal getEstimatedTotalFeesAndTaxes() {
        return this.estimatedTotalFeesAndTaxes;
    }

    public final List<ApiFeeItem> component17() {
        return this.estimatedFees;
    }

    /* renamed from: component18, reason: from getter */
    public final BigDecimal getBorrowFeeApr() {
        return this.borrowFeeApr;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component20, reason: from getter */
    public final TaxLotSelectionType getTaxLotSelectionType() {
        return this.taxLotSelectionType;
    }

    public final List<TaxLotSelection> component21() {
        return this.taxLotsSelections;
    }

    /* renamed from: component22, reason: from getter */
    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getOrderToReplaceId() {
        return this.orderToReplaceId;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOverrideFlipIpoAccessShares() {
        return this.overrideFlipIpoAccessShares;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    /* renamed from: component7, reason: from getter */
    public final OrderMarketHours getOverrideMarketHours() {
        return this.overrideMarketHours;
    }

    public final List<String> component8() {
        return this.checkOverrides;
    }

    /* renamed from: component9, reason: from getter */
    public final OrderRequest2 getQuantityOrAmount() {
        return this.quantityOrAmount;
    }

    public final EquityOrderRequestInputs copy(StaticInputs staticInputs, String accountNumber, UUID orderToReplaceId, BigDecimal limitPrice, boolean overrideFlipIpoAccessShares, boolean overrideToExecuteInMarketHoursOnly, OrderMarketHours overrideMarketHours, List<String> checkOverrides, OrderRequest2 quantityOrAmount, BigDecimal stopPrice, BigDecimal trailAmount, Integer trailPercentage, BigDecimal presetPercentLimit, OrderTimeInForce timeInForce, Order.Configuration orderConfiguration, BigDecimal estimatedTotalFeesAndTaxes, List<ApiFeeItem> estimatedFees, BigDecimal borrowFeeApr, boolean marketBuysEnabled, TaxLotSelectionType taxLotSelectionType, List<TaxLotSelection> taxLotsSelections, OrderPositionEffect positionEffect, boolean subzeroEnabled) {
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        Intrinsics.checkNotNullParameter(taxLotsSelections, "taxLotsSelections");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        return new EquityOrderRequestInputs(staticInputs, accountNumber, orderToReplaceId, limitPrice, overrideFlipIpoAccessShares, overrideToExecuteInMarketHoursOnly, overrideMarketHours, checkOverrides, quantityOrAmount, stopPrice, trailAmount, trailPercentage, presetPercentLimit, timeInForce, orderConfiguration, estimatedTotalFeesAndTaxes, estimatedFees, borrowFeeApr, marketBuysEnabled, taxLotSelectionType, taxLotsSelections, positionEffect, subzeroEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderRequestInputs)) {
            return false;
        }
        EquityOrderRequestInputs equityOrderRequestInputs = (EquityOrderRequestInputs) other;
        return Intrinsics.areEqual(this.staticInputs, equityOrderRequestInputs.staticInputs) && Intrinsics.areEqual(this.accountNumber, equityOrderRequestInputs.accountNumber) && Intrinsics.areEqual(this.orderToReplaceId, equityOrderRequestInputs.orderToReplaceId) && Intrinsics.areEqual(this.limitPrice, equityOrderRequestInputs.limitPrice) && this.overrideFlipIpoAccessShares == equityOrderRequestInputs.overrideFlipIpoAccessShares && this.overrideToExecuteInMarketHoursOnly == equityOrderRequestInputs.overrideToExecuteInMarketHoursOnly && this.overrideMarketHours == equityOrderRequestInputs.overrideMarketHours && Intrinsics.areEqual(this.checkOverrides, equityOrderRequestInputs.checkOverrides) && Intrinsics.areEqual(this.quantityOrAmount, equityOrderRequestInputs.quantityOrAmount) && Intrinsics.areEqual(this.stopPrice, equityOrderRequestInputs.stopPrice) && Intrinsics.areEqual(this.trailAmount, equityOrderRequestInputs.trailAmount) && Intrinsics.areEqual(this.trailPercentage, equityOrderRequestInputs.trailPercentage) && Intrinsics.areEqual(this.presetPercentLimit, equityOrderRequestInputs.presetPercentLimit) && this.timeInForce == equityOrderRequestInputs.timeInForce && this.orderConfiguration == equityOrderRequestInputs.orderConfiguration && Intrinsics.areEqual(this.estimatedTotalFeesAndTaxes, equityOrderRequestInputs.estimatedTotalFeesAndTaxes) && Intrinsics.areEqual(this.estimatedFees, equityOrderRequestInputs.estimatedFees) && Intrinsics.areEqual(this.borrowFeeApr, equityOrderRequestInputs.borrowFeeApr) && this.marketBuysEnabled == equityOrderRequestInputs.marketBuysEnabled && this.taxLotSelectionType == equityOrderRequestInputs.taxLotSelectionType && Intrinsics.areEqual(this.taxLotsSelections, equityOrderRequestInputs.taxLotsSelections) && this.positionEffect == equityOrderRequestInputs.positionEffect && this.subzeroEnabled == equityOrderRequestInputs.subzeroEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.staticInputs.hashCode() * 31) + this.accountNumber.hashCode()) * 31;
        UUID uuid = this.orderToReplaceId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        BigDecimal bigDecimal = this.limitPrice;
        int iHashCode3 = (((((iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.overrideFlipIpoAccessShares)) * 31) + Boolean.hashCode(this.overrideToExecuteInMarketHoursOnly)) * 31;
        OrderMarketHours orderMarketHours = this.overrideMarketHours;
        int iHashCode4 = (((((iHashCode3 + (orderMarketHours == null ? 0 : orderMarketHours.hashCode())) * 31) + this.checkOverrides.hashCode()) * 31) + this.quantityOrAmount.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.stopPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.trailAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Integer num = this.trailPercentage;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.presetPercentLimit;
        int iHashCode8 = (((((iHashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + this.timeInForce.hashCode()) * 31) + this.orderConfiguration.hashCode()) * 31;
        BigDecimal bigDecimal5 = this.estimatedTotalFeesAndTaxes;
        int iHashCode9 = (iHashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        List<ApiFeeItem> list = this.estimatedFees;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.borrowFeeApr;
        int iHashCode11 = (((iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31;
        TaxLotSelectionType taxLotSelectionType = this.taxLotSelectionType;
        return ((((((iHashCode11 + (taxLotSelectionType != null ? taxLotSelectionType.hashCode() : 0)) * 31) + this.taxLotsSelections.hashCode()) * 31) + this.positionEffect.hashCode()) * 31) + Boolean.hashCode(this.subzeroEnabled);
    }

    public String toString() {
        return "EquityOrderRequestInputs(staticInputs=" + this.staticInputs + ", accountNumber=" + this.accountNumber + ", orderToReplaceId=" + this.orderToReplaceId + ", limitPrice=" + this.limitPrice + ", overrideFlipIpoAccessShares=" + this.overrideFlipIpoAccessShares + ", overrideToExecuteInMarketHoursOnly=" + this.overrideToExecuteInMarketHoursOnly + ", overrideMarketHours=" + this.overrideMarketHours + ", checkOverrides=" + this.checkOverrides + ", quantityOrAmount=" + this.quantityOrAmount + ", stopPrice=" + this.stopPrice + ", trailAmount=" + this.trailAmount + ", trailPercentage=" + this.trailPercentage + ", presetPercentLimit=" + this.presetPercentLimit + ", timeInForce=" + this.timeInForce + ", orderConfiguration=" + this.orderConfiguration + ", estimatedTotalFeesAndTaxes=" + this.estimatedTotalFeesAndTaxes + ", estimatedFees=" + this.estimatedFees + ", borrowFeeApr=" + this.borrowFeeApr + ", marketBuysEnabled=" + this.marketBuysEnabled + ", taxLotSelectionType=" + this.taxLotSelectionType + ", taxLotsSelections=" + this.taxLotsSelections + ", positionEffect=" + this.positionEffect + ", subzeroEnabled=" + this.subzeroEnabled + ")";
    }

    public EquityOrderRequestInputs(StaticInputs staticInputs, String accountNumber, UUID uuid, BigDecimal bigDecimal, boolean z, boolean z2, OrderMarketHours orderMarketHours, List<String> checkOverrides, OrderRequest2 quantityOrAmount, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Integer num, BigDecimal bigDecimal4, OrderTimeInForce timeInForce, Order.Configuration orderConfiguration, BigDecimal bigDecimal5, List<ApiFeeItem> list, BigDecimal bigDecimal6, boolean z3, TaxLotSelectionType taxLotSelectionType, List<TaxLotSelection> taxLotsSelections, OrderPositionEffect positionEffect, boolean z4) {
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        Intrinsics.checkNotNullParameter(taxLotsSelections, "taxLotsSelections");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        this.staticInputs = staticInputs;
        this.accountNumber = accountNumber;
        this.orderToReplaceId = uuid;
        this.limitPrice = bigDecimal;
        this.overrideFlipIpoAccessShares = z;
        this.overrideToExecuteInMarketHoursOnly = z2;
        this.overrideMarketHours = orderMarketHours;
        this.checkOverrides = checkOverrides;
        this.quantityOrAmount = quantityOrAmount;
        this.stopPrice = bigDecimal2;
        this.trailAmount = bigDecimal3;
        this.trailPercentage = num;
        this.presetPercentLimit = bigDecimal4;
        this.timeInForce = timeInForce;
        this.orderConfiguration = orderConfiguration;
        this.estimatedTotalFeesAndTaxes = bigDecimal5;
        this.estimatedFees = list;
        this.borrowFeeApr = bigDecimal6;
        this.marketBuysEnabled = z3;
        this.taxLotSelectionType = taxLotSelectionType;
        this.taxLotsSelections = taxLotsSelections;
        this.positionEffect = positionEffect;
        this.subzeroEnabled = z4;
    }

    public final StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderToReplaceId() {
        return this.orderToReplaceId;
    }

    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    public final boolean getOverrideFlipIpoAccessShares() {
        return this.overrideFlipIpoAccessShares;
    }

    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    public final OrderMarketHours getOverrideMarketHours() {
        return this.overrideMarketHours;
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final OrderRequest2 getQuantityOrAmount() {
        return this.quantityOrAmount;
    }

    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    public final BigDecimal getTrailAmount() {
        return this.trailAmount;
    }

    public final Integer getTrailPercentage() {
        return this.trailPercentage;
    }

    public final BigDecimal getPresetPercentLimit() {
        return this.presetPercentLimit;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final Order.Configuration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    public final BigDecimal getEstimatedTotalFeesAndTaxes() {
        return this.estimatedTotalFeesAndTaxes;
    }

    public final List<ApiFeeItem> getEstimatedFees() {
        return this.estimatedFees;
    }

    public final BigDecimal getBorrowFeeApr() {
        return this.borrowFeeApr;
    }

    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    public final TaxLotSelectionType getTaxLotSelectionType() {
        return this.taxLotSelectionType;
    }

    public final List<TaxLotSelection> getTaxLotsSelections() {
        return this.taxLotsSelections;
    }

    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    public final OrderType getType() {
        return this.orderConfiguration.getType();
    }

    public final OrderTrigger getTrigger() {
        return this.orderConfiguration.getTrigger();
    }

    /* compiled from: EquityOrderRequestInputs.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "", "instrumentId", "Ljava/util/UUID;", "isPreIpo", "", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "uuid", "<init>", "(Ljava/util/UUID;ZLcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "()Z", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getUuid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StaticInputs {
        public static final int $stable = 8;
        private final EquityOrderFlowSource flowSource;
        private final UUID instrumentId;
        private final boolean isPreIpo;
        private final EquityOrderSide side;
        private final UUID uuid;

        public static /* synthetic */ StaticInputs copy$default(StaticInputs staticInputs, UUID uuid, boolean z, EquityOrderSide equityOrderSide, EquityOrderFlowSource equityOrderFlowSource, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = staticInputs.instrumentId;
            }
            if ((i & 2) != 0) {
                z = staticInputs.isPreIpo;
            }
            if ((i & 4) != 0) {
                equityOrderSide = staticInputs.side;
            }
            if ((i & 8) != 0) {
                equityOrderFlowSource = staticInputs.flowSource;
            }
            if ((i & 16) != 0) {
                uuid2 = staticInputs.uuid;
            }
            UUID uuid3 = uuid2;
            EquityOrderSide equityOrderSide2 = equityOrderSide;
            return staticInputs.copy(uuid, z, equityOrderSide2, equityOrderFlowSource, uuid3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPreIpo() {
            return this.isPreIpo;
        }

        /* renamed from: component3, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getUuid() {
            return this.uuid;
        }

        public final StaticInputs copy(UUID instrumentId, boolean isPreIpo, EquityOrderSide side, EquityOrderFlowSource flowSource, UUID uuid) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new StaticInputs(instrumentId, isPreIpo, side, flowSource, uuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaticInputs)) {
                return false;
            }
            StaticInputs staticInputs = (StaticInputs) other;
            return Intrinsics.areEqual(this.instrumentId, staticInputs.instrumentId) && this.isPreIpo == staticInputs.isPreIpo && this.side == staticInputs.side && this.flowSource == staticInputs.flowSource && Intrinsics.areEqual(this.uuid, staticInputs.uuid);
        }

        public int hashCode() {
            return (((((((this.instrumentId.hashCode() * 31) + Boolean.hashCode(this.isPreIpo)) * 31) + this.side.hashCode()) * 31) + this.flowSource.hashCode()) * 31) + this.uuid.hashCode();
        }

        public String toString() {
            return "StaticInputs(instrumentId=" + this.instrumentId + ", isPreIpo=" + this.isPreIpo + ", side=" + this.side + ", flowSource=" + this.flowSource + ", uuid=" + this.uuid + ")";
        }

        public StaticInputs(UUID instrumentId, boolean z, EquityOrderSide side, EquityOrderFlowSource flowSource, UUID uuid) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.instrumentId = instrumentId;
            this.isPreIpo = z;
            this.side = side;
            this.flowSource = flowSource;
            this.uuid = uuid;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final boolean isPreIpo() {
            return this.isPreIpo;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final UUID getUuid() {
            return this.uuid;
        }
    }
}
