package com.robinhood.android.options.optionsstring.orderform;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: OptionsOrderSummaryStrings.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a§\u0001\u0010'\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(\u001as\u0010-\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b-\u0010.\u001ak\u0010/\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b/\u00100\u001a§\u0001\u00101\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020$¢\u0006\u0004\b1\u0010(\u001a\u001f\u00102\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0004\b2\u00103¨\u00064"}, m3636d2 = {"Landroid/content/res/Resources;", "res", "Ljava/math/BigDecimal;", "quantity", "", "symbol", "getNumOfSharesWithSymbolStr", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/robinhood/models/db/OptionUnderlier;", "underliers", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Instrument;", "equityInstruments", "getUnderliersStringList", "(Landroid/content/res/Resources;Ljava/util/List;Ljava/util/Map;Ljava/math/BigDecimal;)Ljava/util/List;", "getUnderlierListStr", "(Landroid/content/res/Resources;Ljava/util/List;Ljava/util/Map;Ljava/math/BigDecimal;)Ljava/lang/String;", "cashComponent", "getUnderliersWithCashStr", "(Landroid/content/res/Resources;Ljava/util/List;Ljava/util/Map;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;", "Lcom/robinhood/models/db/OrderSide;", "orderSide", "Lcom/robinhood/models/db/OrderPositionEffect;", "positionEffect", "totalCostWithoutFee", "Lcom/robinhood/models/db/OptionContractType;", "contractType", "cashComponentPerContract", "chainSymbol", "strikePrice", "tradeValueMultiplier", "j$/time/LocalDate", "expirationDate", "today", "", "isReplacedOrderPartiallyFilled", "isSG", "getLimitOrderSummaryStr", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderPositionEffect;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionContractType;Ljava/util/List;Ljava/util/Map;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;Ljava/math/BigDecimal;Lj$/time/LocalDate;Ljava/lang/Boolean;Z)Ljava/lang/String;", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "stopPrice", "limitPrice", "getStopLimitOrderSummaryStr", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/db/OrderTimeInForce;Ljava/lang/String;Ljava/math/BigDecimal;Lj$/time/LocalDate;Ljava/math/BigDecimal;Lj$/time/LocalDate;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Ljava/lang/String;", "getStopMarketOrderSummaryStr", "(Landroid/content/res/Resources;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderPositionEffect;Lcom/robinhood/models/db/OptionContractType;Ljava/util/List;Ljava/util/Map;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Ljava/lang/String;", "getMarketOrderSummaryStr", "getFeesDetailDisplayString", "(Landroid/content/res/Resources;Z)Ljava/lang/String;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.orderform.OptionsOrderSummaryStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsOrderSummaryStrings {

    /* compiled from: OptionsOrderSummaryStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.orderform.OptionsOrderSummaryStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getNumOfSharesWithSymbolStr(Resources res, BigDecimal quantity, String str) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, C23386R.plurals.number_of_shares_with_symbol, quantity, Formats.getShareQuantityFormat().format(quantity), str);
    }

    public static final List<String> getUnderliersStringList(Resources res, List<OptionUnderlier> underliers, Map<UUID, Instrument> equityInstruments, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(underliers, "underliers");
        Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        List<OptionUnderlier> list = underliers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (OptionUnderlier optionUnderlier : list) {
            Instrument instrument = equityInstruments.get(optionUnderlier.getInstrumentId());
            String symbol = instrument != null ? instrument.getSymbol() : null;
            BigDecimal bigDecimalMultiply = quantity.multiply(new BigDecimal(String.valueOf(optionUnderlier.getQuantity())));
            Intrinsics.checkNotNull(bigDecimalMultiply);
            arrayList.add(getNumOfSharesWithSymbolStr(res, bigDecimalMultiply, symbol));
        }
        return arrayList;
    }

    public static final String getUnderlierListStr(Resources res, List<OptionUnderlier> underliers, Map<UUID, Instrument> equityInstruments, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(underliers, "underliers");
        Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return FormatAsList2.formatAsList(getUnderliersStringList(res, underliers, equityInstruments, quantity), res);
    }

    public static final String getUnderliersWithCashStr(Resources res, List<OptionUnderlier> underliers, Map<UUID, Instrument> equityInstruments, BigDecimal bigDecimal, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(underliers, "underliers");
        Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        List<String> underliersStringList = getUnderliersStringList(res, underliers, equityInstruments, quantity);
        if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            NumberFormatter priceFormat = Formats.getPriceFormat();
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(quantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            underliersStringList = CollectionsKt.plus((Collection<? extends String>) underliersStringList, priceFormat.format(bigDecimalMultiply));
        }
        return FormatAsList2.formatAsList(underliersStringList, res);
    }

    public static final String getLimitOrderSummaryStr(Resources res, OrderSide orderSide, OrderPositionEffect positionEffect, BigDecimal bigDecimal, OptionContractType contractType, List<OptionUnderlier> underliers, Map<UUID, Instrument> equityInstruments, BigDecimal bigDecimal2, String chainSymbol, BigDecimal strikePrice, BigDecimal tradeValueMultiplier, LocalDate expirationDate, BigDecimal quantity, LocalDate today, Boolean bool, boolean z) throws Resources.NotFoundException {
        String str;
        BigDecimal bigDecimalDivide;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(underliers, "underliers");
        Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        Intrinsics.checkNotNullParameter(tradeValueMultiplier, "tradeValueMultiplier");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(today, "today");
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal != null ? bigDecimal.abs() : null, null, 2, null);
        String underlierListStr = getUnderlierListStr(res, underliers, equityInstruments, quantity);
        String underliersWithCashStr = getUnderliersWithCashStr(res, underliers, equityInstruments, bigDecimal2, quantity);
        String expirationDateStr = DateStrings2.getExpirationDateStr(expirationDate, today);
        BigDecimal bigDecimalMultiply = strikePrice.multiply(tradeValueMultiplier);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        String str2 = Formats.getPriceFormat().format(bigDecimalMultiply);
        if (((OptionUnderlier) CollectionsKt.singleOrNull((List) underliers)) != null) {
            str = str2;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(r14.getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        } else {
            str = str2;
            bigDecimalDivide = null;
        }
        String nullable$default2 = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimalDivide, null, 2, null);
        boolean z2 = false;
        boolean z3 = bigDecimal2 != null && bigDecimal2.compareTo(BigDecimal.ZERO) > 0;
        if (underliers.size() == 1 && !z3) {
            z2 = true;
        }
        String feesDetailDisplayString = getFeesDetailDisplayString(res, z);
        OrderSide orderSide2 = OrderSide.BUY;
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.OPEN) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i9 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i9 == 1) {
                    i8 = C23386R.string.buy_to_open_call_limit_cancel_new_partially_filled;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i8 = C23386R.string.buy_to_open_put_limit_cancel_new_partially_filled;
                }
                String string2 = res.getString(i8, nullable$default, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, feesDetailDisplayString);
                Intrinsics.checkNotNull(string2);
                return string2;
            }
            if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i10 == 1) {
                    i7 = C23386R.string.buy_to_open_call_limit_cancel_new;
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = C23386R.string.buy_to_open_put_limit_cancel_new;
                }
                String string3 = res.getString(i7, nullable$default, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, feesDetailDisplayString);
                Intrinsics.checkNotNull(string3);
                return string3;
            }
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i11 == 1) {
                i6 = C23386R.plurals.buy_to_open_call_limit;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = C23386R.plurals.buy_to_open_put_limit;
            }
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, i6, quantity, nullable$default, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, feesDetailDisplayString);
        }
        OrderSide orderSide3 = OrderSide.SELL;
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.OPEN) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i12 == 1) {
                    i5 = C23386R.string.sell_to_open_call_limit_cancel_new_partially_filled;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C23386R.string.sell_to_open_put_limit_cancel_new_partially_filled;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i13 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i13 == 1) {
                    i5 = C23386R.string.sell_to_open_call_limit_cancel_new;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C23386R.string.sell_to_open_put_limit_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i14 == 1) {
                    i5 = C23386R.string.sell_to_open_call_limit;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C23386R.string.sell_to_open_put_limit;
                }
            }
            String string4 = res.getString(i5, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, nullable$default, feesDetailDisplayString);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.CLOSE && z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i15 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i15 == 1) {
                    i4 = C23386R.plurals.f4738x8d913d99;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C23386R.plurals.f4742x587a2b26;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i16 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i16 == 1) {
                    i4 = C23386R.plurals.buy_to_close_call_limit_single_underlying_cancel_new;
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C23386R.plurals.buy_to_close_put_limit_single_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i17 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i17 == 1) {
                    i4 = C23386R.plurals.buy_to_close_call_limit_single_underlying;
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C23386R.plurals.buy_to_close_put_limit_single_underlying;
                }
            }
            int iIntValue = quantity.intValue();
            String quantityString = res.getQuantityString(i4, iIntValue, nullable$default, Integer.valueOf(iIntValue), underliersWithCashStr, nullable$default2, expirationDateStr, feesDetailDisplayString);
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.CLOSE && !z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i18 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i18 == 1) {
                    i3 = C23386R.plurals.f4737xbc15654e;
                } else {
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C23386R.plurals.f4741x46c21221;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i19 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i19 == 1) {
                    i3 = C23386R.plurals.buy_to_close_call_limit_multi_underlying_cancel_new;
                } else {
                    if (i19 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C23386R.plurals.buy_to_close_put_limit_multi_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i20 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i20 == 1) {
                    i3 = C23386R.plurals.buy_to_close_call_limit_multi_underlying;
                } else {
                    if (i20 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C23386R.plurals.buy_to_close_put_limit_multi_underlying;
                }
            }
            int iIntValue2 = quantity.intValue();
            String quantityString2 = res.getQuantityString(i3, iIntValue2, nullable$default, Integer.valueOf(iIntValue2), underliersWithCashStr, str, expirationDateStr, feesDetailDisplayString);
            Intrinsics.checkNotNull(quantityString2);
            return quantityString2;
        }
        String str3 = str;
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.CLOSE && z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i21 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i21 == 1) {
                    i2 = C23386R.string.f4752x45a02b65;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23386R.string.f4757x773053da;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i22 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i22 == 1) {
                    i2 = C23386R.string.sell_to_close_call_limit_single_underlying_cancel_new;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23386R.string.sell_to_close_put_limit_single_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i23 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i23 == 1) {
                    i2 = C23386R.string.sell_to_close_call_limit_single_underlying;
                } else {
                    if (i23 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23386R.string.sell_to_close_put_limit_single_underlying;
                }
            }
            String string5 = res.getString(i2, underliersWithCashStr, nullable$default2, expirationDateStr, feesDetailDisplayString);
            Intrinsics.checkNotNull(string5);
            return string5;
        }
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.CLOSE && !z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i24 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i24 == 1) {
                    i = C23386R.string.f4751xdacb8e02;
                } else {
                    if (i24 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.f4756x710a02ed;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i25 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i25 == 1) {
                    i = C23386R.string.sell_to_close_call_limit_multi_underlying_cancel_new;
                } else {
                    if (i25 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.sell_to_close_put_limit_multi_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i26 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i26 == 1) {
                    i = C23386R.string.sell_to_close_call_limit_multi_underlying;
                } else {
                    if (i26 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.sell_to_close_put_limit_multi_underlying;
                }
            }
            String string6 = res.getString(i, underliersWithCashStr, str3, expirationDateStr, feesDetailDisplayString);
            Intrinsics.checkNotNull(string6);
            return string6;
        }
        throw new IllegalStateException(("Not possible combination: " + orderSide + ", " + positionEffect + ".").toString());
    }

    public static final String getStopLimitOrderSummaryStr(Resources res, OrderSide orderSide, OptionContractType contractType, OrderTimeInForce timeInForce, String chainSymbol, BigDecimal strikePrice, LocalDate expirationDate, BigDecimal quantity, LocalDate today, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool) {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(today, "today");
        OrderSide orderSide2 = OrderSide.BUY;
        if (orderSide == orderSide2 && contractType == OptionContractType.CALL && timeInForce == OrderTimeInForce.GFD) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                i = C23386R.plurals.buy_call_gfd_stop_limit_cancel_new_partially_filled;
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                i = C23386R.plurals.buy_call_gfd_stop_limit_cancel_new;
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.buy_call_gfd_stop_limit;
            }
        } else if (orderSide == orderSide2 && contractType == OptionContractType.CALL && timeInForce == OrderTimeInForce.GTC) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                i = C23386R.plurals.buy_call_gtc_stop_limit_cancel_new_partially_filled;
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                i = C23386R.plurals.buy_call_gtc_stop_limit_cancel_new;
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.buy_call_gtc_stop_limit;
            }
        } else if (orderSide == orderSide2 && contractType == OptionContractType.PUT && timeInForce == OrderTimeInForce.GFD) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                i = C23386R.plurals.buy_put_gfd_stop_limit_cancel_new_partially_filled;
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                i = C23386R.plurals.buy_put_gfd_stop_limit_cancel_new;
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.buy_put_gfd_stop_limit;
            }
        } else if (orderSide == orderSide2 && contractType == OptionContractType.PUT && timeInForce == OrderTimeInForce.GTC) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                i = C23386R.plurals.buy_put_gtc_stop_limit_cancel_new_partially_filled;
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                i = C23386R.plurals.buy_put_gtc_stop_limit_cancel_new;
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.buy_put_gtc_stop_limit;
            }
        } else {
            OrderSide orderSide3 = OrderSide.SELL;
            if (orderSide == orderSide3 && contractType == OptionContractType.CALL && timeInForce == OrderTimeInForce.GFD) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    i = C23386R.plurals.sell_call_gfd_stop_limit_cancel_new_partially_filled;
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    i = C23386R.plurals.sell_call_gfd_stop_limit_cancel_new;
                } else {
                    if (bool != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.plurals.sell_call_gfd_stop_limit;
                }
            } else if (orderSide == orderSide3 && contractType == OptionContractType.CALL && timeInForce == OrderTimeInForce.GTC) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    i = C23386R.plurals.sell_call_gtc_stop_limit_cancel_new_partially_filled;
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    i = C23386R.plurals.sell_call_gtc_stop_limit_cancel_new;
                } else {
                    if (bool != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.plurals.sell_call_gtc_stop_limit;
                }
            } else if (orderSide == orderSide3 && contractType == OptionContractType.PUT && timeInForce == OrderTimeInForce.GFD) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    i = C23386R.plurals.sell_put_gfd_stop_limit_cancel_new_partially_filled;
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    i = C23386R.plurals.sell_put_gfd_stop_limit_cancel_new;
                } else {
                    if (bool != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.plurals.sell_put_gfd_stop_limit;
                }
            } else if (orderSide == orderSide3 && contractType == OptionContractType.PUT && timeInForce == OrderTimeInForce.GTC) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    i = C23386R.plurals.sell_put_gtc_stop_limit_cancel_new_partially_filled;
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    i = C23386R.plurals.sell_put_gtc_stop_limit_cancel_new;
                } else {
                    if (bool != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.plurals.sell_put_gtc_stop_limit;
                }
            } else {
                throw new IllegalStateException(("Not possible combination: " + orderSide + ", " + contractType + ", " + timeInForce + ".").toString());
            }
        }
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, i, quantity, quantity, chainSymbol, Formats.getPriceFormat().format(strikePrice), DateStrings2.getExpirationDateStr(expirationDate, today), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal, null, 2, null), NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal2, null, 2, null));
    }

    public static final String getStopMarketOrderSummaryStr(Resources res, OrderSide orderSide, OrderPositionEffect positionEffect, OptionContractType contractType, List<OptionUnderlier> underliers, Map<UUID, Instrument> equityInstruments, BigDecimal quantity, BigDecimal bigDecimal, Boolean bool) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(underliers, "underliers");
        Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        if (positionEffect == OrderPositionEffect.CLOSE) {
            OrderSide orderSide2 = OrderSide.SELL;
        }
        String underlierListStr = getUnderlierListStr(res, underliers, equityInstruments, quantity);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i2 == 1) {
                i = C23386R.string.f4755xfd4e2483;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.string.f4760xe9596138;
            }
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i3 == 1) {
                i = C23386R.string.sell_to_close_call_stop_market_single_underlying_cancel_new;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.string.sell_to_close_put_stop_market_single_underlying_cancel_new;
            }
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i4 == 1) {
                i = C23386R.string.sell_to_close_call_stop_market_single_underlying;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.string.sell_to_close_put_stop_market_single_underlying;
            }
        }
        String string2 = res.getString(i, underlierListStr, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal, null, 2, null));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getMarketOrderSummaryStr(Resources res, OrderSide orderSide, OrderPositionEffect positionEffect, BigDecimal bigDecimal, OptionContractType contractType, List<OptionUnderlier> underliers, Map<UUID, Instrument> equityInstruments, BigDecimal bigDecimal2, String chainSymbol, BigDecimal strikePrice, BigDecimal tradeValueMultiplier, LocalDate expirationDate, BigDecimal quantity, LocalDate today, Boolean bool, boolean z) throws Resources.NotFoundException {
        String str;
        BigDecimal bigDecimalDivide;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(underliers, "underliers");
        Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        Intrinsics.checkNotNullParameter(tradeValueMultiplier, "tradeValueMultiplier");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(today, "today");
        String nullable$default = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimal != null ? bigDecimal.abs() : null, null, 2, null);
        String underlierListStr = getUnderlierListStr(res, underliers, equityInstruments, quantity);
        String underliersWithCashStr = getUnderliersWithCashStr(res, underliers, equityInstruments, bigDecimal2, quantity);
        String expirationDateStr = DateStrings2.getExpirationDateStr(expirationDate, today);
        BigDecimal bigDecimalMultiply = strikePrice.multiply(tradeValueMultiplier);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        String str2 = Formats.getPriceFormat().format(bigDecimalMultiply);
        if (((OptionUnderlier) CollectionsKt.singleOrNull((List) underliers)) != null) {
            str = str2;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(r14.getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalValueOf, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        } else {
            str = str2;
            bigDecimalDivide = null;
        }
        String nullable$default2 = NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), bigDecimalDivide, null, 2, null);
        boolean z2 = false;
        boolean z3 = bigDecimal2 != null && bigDecimal2.compareTo(BigDecimal.ZERO) > 0;
        if (underliers.size() == 1 && !z3) {
            z2 = true;
        }
        String feesDetailDisplayString = getFeesDetailDisplayString(res, z);
        OrderSide orderSide2 = OrderSide.BUY;
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.OPEN) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i9 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i9 == 1) {
                    i8 = C23386R.string.buy_to_open_call_market_cancel_new_partially_filled;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i8 = C23386R.string.buy_to_open_put_market_cancel_new_partially_filled;
                }
                String string2 = res.getString(i8, nullable$default, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, feesDetailDisplayString);
                Intrinsics.checkNotNull(string2);
                return string2;
            }
            if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i10 == 1) {
                    i7 = C23386R.string.buy_to_open_call_market_cancel_new;
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = C23386R.string.buy_to_open_put_market_cancel_new;
                }
                String string3 = res.getString(i7, nullable$default, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, feesDetailDisplayString);
                Intrinsics.checkNotNull(string3);
                return string3;
            }
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
            if (i11 == 1) {
                i6 = C23386R.plurals.buy_to_open_call_market;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = C23386R.plurals.buy_to_open_put_market;
            }
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(res, i6, quantity, nullable$default, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, feesDetailDisplayString);
        }
        OrderSide orderSide3 = OrderSide.SELL;
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.OPEN) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i12 == 1) {
                    i5 = C23386R.string.sell_to_open_call_market_cancel_new_partially_filled;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C23386R.string.sell_to_open_put_market_cancel_new_partially_filled;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i13 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i13 == 1) {
                    i5 = C23386R.string.sell_to_open_call_market_cancel_new;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C23386R.string.sell_to_open_put_market_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i14 == 1) {
                    i5 = C23386R.string.sell_to_open_call_market;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C23386R.string.sell_to_open_put_market;
                }
            }
            String string4 = res.getString(i5, underlierListStr, nullable$default2, expirationDateStr, chainSymbol, nullable$default, feesDetailDisplayString);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.CLOSE && z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i15 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i15 == 1) {
                    i4 = C23386R.plurals.f4740x1e2d8ed8;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C23386R.plurals.f4744xb06252eb;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i16 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i16 == 1) {
                    i4 = C23386R.plurals.buy_to_close_call_market_single_underlying_cancel_new;
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C23386R.plurals.buy_to_close_put_market_single_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i17 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i17 == 1) {
                    i4 = C23386R.plurals.buy_to_close_call_market_single_underlying;
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = C23386R.plurals.buy_to_close_put_market_single_underlying;
                }
            }
            int iIntValue = quantity.intValue();
            String quantityString = res.getQuantityString(i4, iIntValue, nullable$default, Integer.valueOf(iIntValue), underliersWithCashStr, nullable$default2, expirationDateStr, feesDetailDisplayString);
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        if (orderSide == orderSide2 && positionEffect == OrderPositionEffect.CLOSE && !z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i18 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i18 == 1) {
                    i3 = C23386R.plurals.f4739x2c1a702f;
                } else {
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C23386R.plurals.f4743xf7035dbc;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i19 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i19 == 1) {
                    i3 = C23386R.plurals.buy_to_close_call_market_multi_underlying_cancel_new;
                } else {
                    if (i19 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C23386R.plurals.buy_to_close_put_market_multi_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i20 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i20 == 1) {
                    i3 = C23386R.plurals.buy_to_close_call_market_multi_underlying;
                } else {
                    if (i20 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C23386R.plurals.buy_to_close_put_market_multi_underlying;
                }
            }
            int iIntValue2 = quantity.intValue();
            String quantityString2 = res.getQuantityString(i3, iIntValue2, nullable$default, Integer.valueOf(iIntValue2), underliersWithCashStr, str, expirationDateStr, feesDetailDisplayString);
            Intrinsics.checkNotNull(quantityString2);
            return quantityString2;
        }
        String str3 = str;
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.CLOSE && z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i21 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i21 == 1) {
                    i2 = C23386R.string.f4754x67fc5a8c;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23386R.string.f4759x687140b7;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i22 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i22 == 1) {
                    i2 = C23386R.string.sell_to_close_call_market_single_underlying_cancel_new;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23386R.string.sell_to_close_put_market_single_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i23 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i23 == 1) {
                    i2 = C23386R.string.sell_to_close_call_market_single_underlying;
                } else {
                    if (i23 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C23386R.string.sell_to_close_put_market_single_underlying;
                }
            }
            String string5 = res.getString(i2, underliersWithCashStr, nullable$default2, expirationDateStr, nullable$default, feesDetailDisplayString);
            Intrinsics.checkNotNull(string5);
            return string5;
        }
        if (orderSide == orderSide3 && positionEffect == OrderPositionEffect.CLOSE && !z2) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                int i24 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i24 == 1) {
                    i = C23386R.string.f4753xe4295dfb;
                } else {
                    if (i24 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.f4758x15b98670;
                }
            } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                int i25 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i25 == 1) {
                    i = C23386R.string.sell_to_close_call_market_multi_underlying_cancel_new;
                } else {
                    if (i25 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.sell_to_close_put_market_multi_underlying_cancel_new;
                }
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                int i26 = WhenMappings.$EnumSwitchMapping$0[contractType.ordinal()];
                if (i26 == 1) {
                    i = C23386R.string.sell_to_close_call_market_multi_underlying;
                } else {
                    if (i26 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C23386R.string.sell_to_close_put_market_multi_underlying;
                }
            }
            String string6 = res.getString(i, underliersWithCashStr, str3, expirationDateStr, nullable$default, feesDetailDisplayString);
            Intrinsics.checkNotNull(string6);
            return string6;
        }
        throw new IllegalStateException(("Not possible combination: " + orderSide + ", " + positionEffect + ".").toString());
    }

    private static final String getFeesDetailDisplayString(Resources resources, boolean z) throws Resources.NotFoundException {
        if (z) {
            String string2 = resources.getString(C23386R.string.gated_regulatory_fees_display_sg);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C23386R.string.regulatory_fees_display);
        Intrinsics.checkNotNull(string3);
        return string3;
    }
}
