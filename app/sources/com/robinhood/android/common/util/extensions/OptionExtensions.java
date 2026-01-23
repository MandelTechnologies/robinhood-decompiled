package com.robinhood.android.common.util.extensions;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.FormatAsList2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiCollateralEquity;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionCollateralEquity;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument2;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionExtensions.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u001a\u0012\u0010\u000f\u001a\u00020\b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001a\u0010\u000f\u001a\u00020\b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u001a&\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¨\u0006\u001b"}, m3636d2 = {"getName", "", "Lcom/robinhood/models/api/OptionStrategyType;", "resources", "Landroid/content/res/Resources;", "numLegs", "", "getTitleString", "", "Lcom/robinhood/models/db/OptionInstrumentDetails;", "getTypeString", "getContractTypeString", "type", "Lcom/robinhood/models/db/OptionContractType;", "quantity", "getDisplayString", "Lcom/robinhood/models/api/ApiCollateral;", "context", "Landroid/content/Context;", "orderDirection", "Lcom/robinhood/models/db/OrderDirection;", "getCollateralDisplayString", "cashAmount", "Ljava/math/BigDecimal;", "equities", "", "Lcom/robinhood/models/db/OptionCollateralEquity;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.OptionExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionExtensions {

    /* compiled from: OptionExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.util.extensions.OptionExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionStrategyType.values().length];
            try {
                iArr[OptionStrategyType.LONG_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyType.BUY_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionStrategyType.LONG_PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionStrategyType.BUY_PUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionStrategyType.SHORT_PUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionStrategyType.LONG_CALL_SPREAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CALL_SPREAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionStrategyType.LONG_PUT_SPREAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionStrategyType.SHORT_PUT_SPREAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionStrategyType.LONG_CALL_CALENDAR_SPREAD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionStrategyType.CALL_CALENDAR_SPREAD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CALL_CALENDAR_SPREAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionStrategyType.LONG_PUT_CALENDAR_SPREAD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionStrategyType.PUT_CALENDAR_SPREAD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OptionStrategyType.SHORT_PUT_CALENDAR_SPREAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OptionStrategyType.LONG_STRADDLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OptionStrategyType.STRADDLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[OptionStrategyType.SHORT_STRADDLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[OptionStrategyType.LONG_STRANGLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[OptionStrategyType.STRANGLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[OptionStrategyType.SHORT_STRANGLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[OptionStrategyType.SHORT_IRON_CONDOR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[OptionStrategyType.IRON_CONDOR.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[OptionStrategyType.LONG_IRON_CONDOR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[OptionStrategyType.SHORT_IRON_BUTTERFLY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[OptionStrategyType.IRON_BUTTERFLY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[OptionStrategyType.LONG_IRON_BUTTERFLY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CONDOR_CALL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CONDOR_PUT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[OptionStrategyType.LONG_CONDOR_CALL.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[OptionStrategyType.LONG_CONDOR_PUT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[OptionStrategyType.SHORT_BUTTERFLY_CALL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[OptionStrategyType.SHORT_BUTTERFLY_PUT.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[OptionStrategyType.LONG_BUTTERFLY_CALL.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[OptionStrategyType.LONG_BUTTERFLY_PUT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[OptionStrategyType.BACK_SPREAD_CALL.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[OptionStrategyType.BACK_SPREAD_PUT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[OptionStrategyType.FRONT_SPREAD_CALL.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[OptionStrategyType.FRONT_SPREAD_PUT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[OptionStrategyType.STRADDLE_OR_STRANGLE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[OptionStrategyType.CALENDAR_SPREAD.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[OptionStrategyType.CUSTOM.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionContractType.values().length];
            try {
                iArr2[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr2[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Deprecated
    public static final CharSequence getName(OptionStrategyType optionStrategyType, Resources resources, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionStrategyType, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$0[optionStrategyType.ordinal()]) {
            case 1:
            case 2:
                String string2 = resources.getString(C11048R.string.option_strategy_long_call);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = resources.getString(C11048R.string.option_strategy_short_call);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 4:
            case 5:
                String string4 = resources.getString(C11048R.string.option_strategy_long_put);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 6:
                String string5 = resources.getString(C11048R.string.option_strategy_short_put);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 7:
                String string6 = resources.getString(C11048R.string.option_strategy_call_debit_spread);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 8:
                String string7 = resources.getString(C11048R.string.option_strategy_call_credit_spread);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 9:
                String string8 = resources.getString(C11048R.string.option_strategy_put_debit_spread);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 10:
                String string9 = resources.getString(C11048R.string.option_strategy_put_credit_spread);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 11:
            case 12:
                String string10 = resources.getString(C11048R.string.option_strategy_long_call_calendar_spread);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 13:
                String string11 = resources.getString(C11048R.string.option_strategy_short_call_calendar_spread);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 14:
            case 15:
                String string12 = resources.getString(C11048R.string.option_strategy_long_put_calendar_spread);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case 16:
                String string13 = resources.getString(C11048R.string.option_strategy_short_put_calendar_spread);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            case 17:
            case 18:
                String string14 = resources.getString(C11048R.string.option_strategy_long_straddle);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            case 19:
                String string15 = resources.getString(C11048R.string.option_strategy_short_straddle);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                return string15;
            case 20:
            case 21:
                String string16 = resources.getString(C11048R.string.option_strategy_long_strangle);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                return string16;
            case 22:
                String string17 = resources.getString(C11048R.string.option_strategy_short_strangle);
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                return string17;
            case 23:
            case 24:
                String string18 = resources.getString(C11048R.string.option_strategy_iron_condor);
                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                return string18;
            case 25:
                String string19 = resources.getString(C11048R.string.option_strategy_long_iron_condor);
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                return string19;
            case 26:
            case 27:
                String string20 = resources.getString(C11048R.string.option_strategy_short_iron_butterfly);
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                return string20;
            case 28:
                String string21 = resources.getString(C11048R.string.option_strategy_long_iron_butterfly);
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                return string21;
            case 29:
                String string22 = resources.getString(C11048R.string.option_strategy_short_call_condor);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                return string22;
            case 30:
                String string23 = resources.getString(C11048R.string.option_strategy_short_put_condor);
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                return string23;
            case 31:
                String string24 = resources.getString(C11048R.string.option_strategy_long_call_condor);
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                return string24;
            case 32:
                String string25 = resources.getString(C11048R.string.option_strategy_long_put_condor);
                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                return string25;
            case 33:
                String string26 = resources.getString(C11048R.string.option_strategy_short_call_butterfly);
                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                return string26;
            case 34:
                String string27 = resources.getString(C11048R.string.option_strategy_short_put_butterfly);
                Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                return string27;
            case 35:
                String string28 = resources.getString(C11048R.string.option_strategy_long_call_butterfly);
                Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                return string28;
            case 36:
                String string29 = resources.getString(C11048R.string.option_strategy_long_put_butterfly);
                Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                return string29;
            case 37:
                String string30 = resources.getString(C11048R.string.option_strategy_back_spread_call);
                Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                return string30;
            case 38:
                String string31 = resources.getString(C11048R.string.option_strategy_back_spread_put);
                Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
                return string31;
            case 39:
                String string32 = resources.getString(C11048R.string.option_strategy_front_spread_call);
                Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                return string32;
            case 40:
                String string33 = resources.getString(C11048R.string.option_strategy_front_spread_put);
                Intrinsics.checkNotNullExpressionValue(string33, "getString(...)");
                return string33;
            case 41:
            case 42:
            case 43:
                String string34 = resources.getString(C11048R.string.option_strategy_custom, Integer.valueOf(i));
                Intrinsics.checkNotNullExpressionValue(string34, "getString(...)");
                return string34;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Deprecated
    public static final String getTitleString(OptionInstrument2 optionInstrument2, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C11048R.string.option_position_row_title, optionInstrument2.getChainSymbol(), Formats.getStrikePriceFormat().format(optionInstrument2.getStrikePrice()), getTypeString(optionInstrument2, resources));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final CharSequence getTypeString(OptionInstrument2 optionInstrument2, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getContractTypeString$default(resources, optionInstrument2.getContractType(), 0, 4, null);
    }

    public static /* synthetic */ CharSequence getContractTypeString$default(Resources resources, OptionContractType optionContractType, int i, int i2, Object obj) throws Resources.NotFoundException {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return getContractTypeString(resources, optionContractType, i);
    }

    public static final CharSequence getContractTypeString(Resources resources, OptionContractType type2, int i) throws Resources.NotFoundException {
        int i2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type2, "type");
        int i3 = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i3 == 1) {
            i2 = C11048R.plurals.option_contract_type_call;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C11048R.plurals.option_contract_type_put;
        }
        String quantityString = resources.getQuantityString(i2, i);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public static final String getDisplayString(ApiCollateral apiCollateral, Context context) {
        Intrinsics.checkNotNullParameter(apiCollateral, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        List<ApiCollateralEquity> equities = apiCollateral.getEquities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equities, 10));
        Iterator<T> it = equities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiCollateralEquity) it.next()).toDbModel());
        }
        return getCollateralDisplayString(context, apiCollateral.getCash().getAmount(), arrayList);
    }

    public static final String getDisplayString(ApiCollateral apiCollateral, Context context, OrderDirection orderDirection) {
        Intrinsics.checkNotNullParameter(apiCollateral, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orderDirection, "orderDirection");
        List<ApiCollateralEquity> equities = apiCollateral.getEquities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equities, 10));
        Iterator<T> it = equities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiCollateralEquity) it.next()).toDbModel());
        }
        BigDecimal amount = apiCollateral.getCash().getDirection() == orderDirection ? apiCollateral.getCash().getAmount() : BigDecimal.ZERO;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((OptionCollateralEquity) obj).getDirection() == orderDirection) {
                arrayList2.add(obj);
            }
        }
        return getCollateralDisplayString(context, amount, arrayList2);
    }

    public static final String getCollateralDisplayString(Context context, BigDecimal bigDecimal, List<OptionCollateralEquity> equities) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(equities, "equities");
        ArrayList<OptionCollateralEquity> arrayList = new ArrayList();
        for (Object obj : equities) {
            if (!BigDecimals7.isZero(((OptionCollateralEquity) obj).getQuantity())) {
                arrayList.add(obj);
            }
        }
        List arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (OptionCollateralEquity optionCollateralEquity : arrayList) {
            arrayList2.add(context.getString(C11048R.string.option_collateral_equity, Formats.getIntegerFormat().format(Integer.valueOf(optionCollateralEquity.getQuantity().intValue())), optionCollateralEquity.getSymbol()));
        }
        if (!BigDecimals7.isZero(bigDecimal)) {
            NumberFormatter priceFormat = Formats.getPriceFormat();
            Intrinsics.checkNotNull(bigDecimal);
            arrayList2 = CollectionsKt.plus((Collection<? extends String>) arrayList2, priceFormat.format(bigDecimal));
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return FormatAsList2.formatAsList(arrayList2, resources);
    }
}
