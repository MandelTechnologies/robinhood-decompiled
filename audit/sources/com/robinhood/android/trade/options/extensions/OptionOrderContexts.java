package com.robinhood.android.trade.options.extensions;

import android.content.res.Resources;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.optionchain.extensions.CompareOptionInstrumentForDisplay;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p355ui.UiOptionInstrument;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import p479j$.time.LocalDate;

/* compiled from: OptionOrderContexts.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a:\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0000\u001a$\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00100\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0017\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u0001*\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u001f"}, m3636d2 = {"getOrderTitleString", "", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "resources", "Landroid/content/res/Resources;", "isInNomenclatureExperiment", "", "getMultilegQuantityRowTitleString", "expirationDateStr", "isRolling", "symbol", "strategyName", "", "settleOnOpen", "getMultilegSummaryStrings", "", "Lkotlin/Pair;", "compareLegContextsForOrderSummary", "", "leg1", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "leg2", "getMultilegLeftSummaryString", "getMultilegRightSummaryString", "ratioQuantity", "Ljava/math/BigDecimal;", "getEffectString", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "getBidAskText", "Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.extensions.OptionOrderContextsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderContexts {

    /* compiled from: OptionOrderContexts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.extensions.OptionOrderContextsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderPositionEffect.values().length];
            try {
                iArr2[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getOrderTitleString(OptionOrderContext optionOrderContext, Resources resources, boolean z) throws Resources.NotFoundException {
        CharSequence name;
        OptionOrderContext.LegContext.RequestContext requestContext;
        UiOptionInstrument optionInstrument;
        OptionInstrument optionInstrument2;
        LocalDate expirationDate;
        Intrinsics.checkNotNullParameter(optionOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean zIsMultiLeg = optionOrderContext.getApiRequest().isMultiLeg();
        LocalDate localDate = (LocalDate) SequencesKt.singleOrNull(SequencesKt.distinct(SequencesKt.map(CollectionsKt.asSequence(optionOrderContext.getLegContexts()), new Function1() { // from class: com.robinhood.android.trade.options.extensions.OptionOrderContextsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderContexts.getOrderTitleString$lambda$0((OptionOrderContext.LegContext) obj);
            }
        })));
        if (zIsMultiLeg) {
            OptionOrderContext.StrategyContext strategyContext = optionOrderContext.getStrategyContext();
            OptionStrategyType openingStrategyType = strategyContext.getOpeningStrategyType();
            boolean z2 = false;
            boolean z3 = optionOrderContext.getApiRequest().getForm_source() == OptionOrder.FormSource.STRATEGY_ROLL && openingStrategyType != null && openingStrategyType == strategyContext.getClosingStrategyType();
            String str = null;
            if (openingStrategyType == null || !z3) {
                openingStrategyType = optionOrderContext.getStrategyContext().getOverallStrategyType();
                if (openingStrategyType == null) {
                    openingStrategyType = OptionStrategyType.CUSTOM;
                }
                if (localDate != null) {
                    str = OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(localDate);
                }
            } else {
                Iterator<T> it = optionOrderContext.getLegContexts().iterator();
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z2) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        if (((OptionOrderContext.LegContext) next).getRequestContext().getPositionEffect() == OrderPositionEffect.OPEN) {
                            if (z2) {
                                break;
                            }
                            obj = next;
                            z2 = true;
                        }
                    }
                }
                OptionOrderContext.LegContext legContext = (OptionOrderContext.LegContext) obj;
                if (legContext != null && (requestContext = legContext.getRequestContext()) != null && (optionInstrument = requestContext.getOptionInstrument()) != null && (optionInstrument2 = optionInstrument.getOptionInstrument()) != null && (expirationDate = optionInstrument2.getExpirationDate()) != null) {
                    str = OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(expirationDate);
                }
            }
            String str2 = str;
            String symbol = optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getSymbol();
            if (z) {
                name = optionOrderContext.getStrategyContext().getStrategyDisplayName();
                if (name == null) {
                    name = OptionExtensions.getName(OptionStrategyType.CUSTOM, resources, optionOrderContext.getLegContexts().size());
                }
            } else {
                name = OptionExtensions.getName(openingStrategyType, resources, optionOrderContext.getLegContexts().size());
            }
            return getMultilegQuantityRowTitleString(resources, str2, z3, symbol, name, optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getSettleOnOpen());
        }
        OptionOrderContext.LegContext legContext2 = (OptionOrderContext.LegContext) CollectionsKt.single((List) optionOrderContext.getLegContexts());
        return OptionInstruments2.getSingLegQuantityRowTitleString(legContext2.getRequestContext().getOptionInstrument().getOptionInstrument(), resources, legContext2.getRequestArguments().getSide(), localDate, optionOrderContext.getRequestContext().getOptionChain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate getOrderTitleString$lambda$0(OptionOrderContext.LegContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRequestContext().getOptionInstrument().getOptionInstrument().getExpirationDate();
    }

    public static final String getMultilegQuantityRowTitleString(Resources resources, String str, boolean z, String symbol, CharSequence strategyName, boolean z2) throws Resources.NotFoundException {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(strategyName, "strategyName");
        if (str != null) {
            if (z && z2) {
                i2 = C29757R.string.option_order_title_rolling_settle_on_open;
            } else if (z && !z2) {
                i2 = C29757R.string.option_order_title_rolling;
            } else if (!z && z2) {
                i2 = C29757R.string.option_order_title_multileg_settle_on_open;
            } else if (!z && !z2) {
                i2 = C29757R.string.option_order_title_multileg;
            } else {
                throw new IllegalStateException(("Invalid combination of: " + z + ", " + z2).toString());
            }
            String string2 = resources.getString(i2, symbol, strategyName, str);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (z) {
            i = C29757R.string.option_order_title_rolling_no_expiration;
        } else {
            i = C29757R.string.option_order_title_multileg_no_expiration;
        }
        String string3 = resources.getString(i, symbol, strategyName);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static final List<Tuples2<String, String>> getMultilegSummaryStrings(OptionOrderContext optionOrderContext, Resources resources) {
        Object next;
        Intrinsics.checkNotNullParameter(optionOrderContext, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Iterator<T> it = optionOrderContext.getLegContexts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Intrinsics.areEqual(((OptionOrderContext.LegContext) next).getRequestArguments().getRatioQuantity(), BigDecimal.ONE)) {
                break;
            }
        }
        boolean z = next != null;
        List<OptionOrderContext.LegContext> listSortedWith = CollectionsKt.sortedWith(optionOrderContext.getLegContexts(), new Comparator() { // from class: com.robinhood.android.trade.options.extensions.OptionOrderContextsKt.getMultilegSummaryStrings.1
            @Override // java.util.Comparator
            public final int compare(OptionOrderContext.LegContext p0, OptionOrderContext.LegContext p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                return OptionOrderContexts.compareLegContextsForOrderSummary(p0, p1);
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (OptionOrderContext.LegContext legContext : listSortedWith) {
            arrayList.add(Tuples4.m3642to(getMultilegLeftSummaryString(legContext, resources), getMultilegRightSummaryString(legContext, resources, z ? legContext.getRequestArguments().getRatioQuantity() : null)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareLegContextsForOrderSummary(OptionOrderContext.LegContext legContext, OptionOrderContext.LegContext legContext2) {
        return CompareOptionInstrumentForDisplay.compareOptionInstrumentForDisplay(legContext.getRequestContext().getOptionInstrument().getOptionInstrument(), legContext2.getRequestContext().getOptionInstrument().getOptionInstrument());
    }

    public static final String getMultilegLeftSummaryString(OptionOrderContext.LegContext legContext, Resources resources) throws Resources.NotFoundException {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(legContext, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        OptionInstrument optionInstrument = legContext.getRequestContext().getOptionInstrument().getOptionInstrument();
        CharSequence contractTypeString$default = OptionExtensions.getContractTypeString$default(resources, optionInstrument.getContractType(), 0, 4, null);
        int i2 = WhenMappings.$EnumSwitchMapping$0[legContext.getRequestContext().getOptionInstrument().getUnderlyingType().ordinal()];
        if (i2 == 1) {
            str = Formats.getStrikePriceFormat().format(optionInstrument.getStrikePrice());
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = Formats.getStrikeValueFormat().format(optionInstrument.getStrikePrice());
        }
        if (legContext.getRequestContext().getOptionInstrument().getOptionChain().getSettleOnOpen()) {
            i = C29757R.string.option_order_review_multileg_left_settle_on_open;
        } else {
            i = C29757R.string.option_order_review_multileg_left;
        }
        String string2 = resources.getString(i, str, contractTypeString$default, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionInstrument.getExpirationDate()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getMultilegRightSummaryString(OptionOrderContext.LegContext legContext, Resources resources, BigDecimal bigDecimal) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(legContext, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String sideString = UiOptionOrders3.getSideString(resources, legContext.getRequestArguments().getSide());
        String effectString = getEffectString(resources, legContext.getRequestContext().getPositionEffect());
        int i = C29757R.string.option_order_review_multileg_right;
        String str = bigDecimal != null ? Formats.getIntegerFormat().format(bigDecimal) : null;
        if (str == null) {
            str = "";
        }
        String string2 = resources.getString(i, sideString, effectString, str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return StringsKt.trimEnd(string2).toString();
    }

    private static final String getEffectString(Resources resources, OrderPositionEffect orderPositionEffect) throws Resources.NotFoundException {
        int i = WhenMappings.$EnumSwitchMapping$1[orderPositionEffect.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C23386R.string.option_effect_open);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = resources.getString(C23386R.string.option_effect_close);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getBidAskText(OptionOrderContext.Prices prices, Resources resources) {
        Intrinsics.checkNotNullParameter(prices, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        OptionOrderContext.LimitPrice netLimitPrice = prices.getNetLimitPrice();
        if (netLimitPrice == null) {
            return null;
        }
        return resources.getString(C29757R.string.option_order_bid_ask_full, Formats.getPriceFormat().format(netLimitPrice.getStart()), Formats.getPriceFormat().format(netLimitPrice.getEndInclusive()));
    }
}
