package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionLeg;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: OptionExtensions.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0006\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\r\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000f\u001a?\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a7\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a7\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a7\u0010 \u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u001d\u001a7\u0010!\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u001d\u001a7\u0010\"\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010\u001d\u001a\u0011\u0010#\u001a\u00020\u0016*\u00020\u0005¢\u0006\u0004\b#\u0010$\u001a'\u0010(\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "Landroid/content/res/Resources;", "resources", "", "includeSymbol", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "", "getStrategyTitle", "(Lcom/robinhood/models/ui/UiAggregateOptionPosition;Landroid/content/res/Resources;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;)Ljava/lang/CharSequence;", "Lcom/robinhood/models/ui/UiOptionStrategyDisplay;", "", "chainSymbol", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;Ljava/lang/String;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)Ljava/lang/CharSequence;", "Lcom/robinhood/models/ui/UiOptionOrder;", "(Lcom/robinhood/models/ui/UiOptionOrder;Landroid/content/res/Resources;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;)Ljava/lang/CharSequence;", "Lcom/robinhood/models/api/OptionStrategyType$Classification;", "classification", "symbol", "", "Lcom/robinhood/models/db/OptionLeg;", "legs", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "formatter", "getTitleString", "(Landroid/content/res/Resources;Lcom/robinhood/models/api/OptionStrategyType$Classification;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/lib/formats/NumberFormatter;)Ljava/lang/CharSequence;", "getTitleStringCustom", "(Landroid/content/res/Resources;Ljava/lang/String;Ljava/util/List;)Ljava/lang/CharSequence;", "getTitleStringSingleLeg", "(Landroid/content/res/Resources;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/lib/formats/NumberFormatter;)Ljava/lang/CharSequence;", "getTitleStringIronCondorOrIronButterfly", "getTitleStringStrangle", "getTitleStringStraddle", "getTitleStringHorizontalSpread", "getTitleStringVerticalSpread", "strikeNumberFormatter", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;)Lcom/robinhood/android/lib/formats/NumberFormatter;", "j$/time/LocalDate", "expirationDate", "settleOnOpen", "getExpirationStringShort", "(Landroid/content/res/Resources;Lj$/time/LocalDate;Z)Ljava/lang/String;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionExtensionsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionExtensions2 {

    /* compiled from: OptionExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.OptionExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OptionStrategyType.Classification.values().length];
            try {
                iArr[OptionStrategyType.Classification.SINGLE_LEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyType.Classification.VERTICAL_SPREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStrategyType.Classification.HORIZONTAL_SPREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionStrategyType.Classification.STRADDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionStrategyType.Classification.STRANGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionStrategyType.Classification.IRON_BUTTERFLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionStrategyType.Classification.IRON_CONDOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionStrategyType.Classification.NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionContractType.values().length];
            try {
                iArr2[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr3[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ CharSequence getStrategyTitle$default(UiAggregateOptionPosition uiAggregateOptionPosition, Resources resources, boolean z, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return getStrategyTitle(uiAggregateOptionPosition, resources, z, underlyingType);
    }

    public static final CharSequence getStrategyTitle(UiAggregateOptionPosition uiAggregateOptionPosition, Resources resources, boolean z, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(uiAggregateOptionPosition, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return getTitleString(resources, uiAggregateOptionPosition.getAggregateOptionPosition().getStrategy().getClassification(), z ? uiAggregateOptionPosition.getOptionChain().getSymbol() : null, uiAggregateOptionPosition.getLegs(), strikeNumberFormatter(underlyingType));
    }

    public static final CharSequence getStrategyTitle(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String chainSymbol, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(uiOptionStrategyDisplay, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return getTitleString(resources, uiOptionStrategyDisplay.getStrategy().getClassification(), chainSymbol, uiOptionStrategyDisplay.getLegs(), strikeNumberFormatter(underlyingType));
    }

    public static final CharSequence getStrategyTitle(UiOptionOrder uiOptionOrder, Resources resources, boolean z, OptionChain.UnderlyingType underlyingType) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        OptionStrategyType rollingStrategy = uiOptionOrder.getRollingStrategy();
        CharSequence name = rollingStrategy != null ? OptionExtensions.getName(rollingStrategy, resources, uiOptionOrder.getLegs().size()) : null;
        if (name == null) {
            return getTitleString(resources, uiOptionOrder.getStrategy().getClassification(), z ? uiOptionOrder.getOptionChain().getSymbol() : null, uiOptionOrder.getLegs(), strikeNumberFormatter(underlyingType));
        }
        if (z) {
            String string2 = resources.getString(C23386R.string.option_strategy_roll_with_symbol, uiOptionOrder.getOptionChain().getSymbol(), name);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_strategy_roll_without_symbol, name);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private static final CharSequence getTitleString(Resources resources, OptionStrategyType.Classification classification, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) {
        switch (WhenMappings.$EnumSwitchMapping$0[classification.ordinal()]) {
            case 1:
                return getTitleStringSingleLeg(resources, str, list, numberFormatter);
            case 2:
                return getTitleStringVerticalSpread(resources, str, list, numberFormatter);
            case 3:
                return getTitleStringHorizontalSpread(resources, str, list, numberFormatter);
            case 4:
                return getTitleStringStraddle(resources, str, list, numberFormatter);
            case 5:
                return getTitleStringStrangle(resources, str, list, numberFormatter);
            case 6:
            case 7:
                return getTitleStringIronCondorOrIronButterfly(resources, str, list, numberFormatter);
            case 8:
                return getTitleStringCustom(resources, str, list);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final CharSequence getTitleStringCustom(Resources resources, String str, List<? extends OptionLeg> list) throws Resources.NotFoundException {
        int i;
        if (str == null) {
            i = C23386R.string.option_position_row_title_custom_no_symbol;
        } else {
            i = C23386R.string.option_position_row_title_custom;
        }
        String string2 = resources.getString(i, str, Integer.valueOf(list.size()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final CharSequence getTitleStringSingleLeg(Resources resources, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) throws Resources.NotFoundException {
        int i;
        OptionLeg optionLeg = (OptionLeg) CollectionsKt.singleOrNull((List) list);
        if (optionLeg == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("attempted to get title for single leg strategy w no legs"), false, null, 6, null);
            return "";
        }
        String str2 = numberFormatter.format(optionLeg.getStrikePrice());
        CharSequence contractTypeString$default = OptionExtensions.getContractTypeString$default(resources, optionLeg.getContractType(), 0, 4, null);
        if (str == null) {
            i = C23386R.string.option_position_row_title_single_leg_no_symbol;
        } else {
            i = C23386R.string.option_position_row_title_single_leg;
        }
        String string2 = resources.getString(i, str, str2, contractTypeString$default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final CharSequence getTitleStringIronCondorOrIronButterfly(Resources resources, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) throws Resources.NotFoundException {
        int i;
        List listSortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.options.optionsstring.common.OptionExtensionsKt$getTitleStringIronCondorOrIronButterfly$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((OptionLeg) t).getStrikePrice(), ((OptionLeg) t2).getStrikePrice());
            }
        });
        BigDecimal strikePrice = ((OptionLeg) listSortedWith.get(1)).getStrikePrice();
        BigDecimal strikePrice2 = ((OptionLeg) listSortedWith.get(listSortedWith.size() - 2)).getStrikePrice();
        if (str == null) {
            i = C23386R.string.option_position_row_title_iron_condor_no_symbol;
        } else {
            i = C23386R.string.option_position_row_title_iron_condor;
        }
        String string2 = resources.getString(i, str, numberFormatter.format(strikePrice), numberFormatter.format(strikePrice2));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final CharSequence getTitleStringStrangle(Resources resources, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) throws Resources.NotFoundException {
        int i;
        List<? extends OptionLeg> list2 = list;
        for (OptionLeg optionLeg : list2) {
            if (optionLeg.getContractType() == OptionContractType.CALL) {
                BigDecimal strikePrice = optionLeg.getStrikePrice();
                for (OptionLeg optionLeg2 : list2) {
                    if (optionLeg2.getContractType() == OptionContractType.PUT) {
                        BigDecimal strikePrice2 = optionLeg2.getStrikePrice();
                        if (str == null) {
                            i = C23386R.string.option_position_row_title_strangle_no_symbol;
                        } else {
                            i = C23386R.string.option_position_row_title_strangle;
                        }
                        String string2 = resources.getString(i, str, numberFormatter.format(strikePrice), numberFormatter.format(strikePrice2));
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        return string2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final CharSequence getTitleStringStraddle(Resources resources, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) throws Resources.NotFoundException {
        int i;
        String str2 = numberFormatter.format(((OptionLeg) CollectionsKt.first((List) list)).getStrikePrice());
        if (str == null) {
            i = C23386R.string.option_position_row_title_straddle_no_symbol;
        } else {
            i = C23386R.string.option_position_row_title_straddle;
        }
        String string2 = resources.getString(i, str, str2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final CharSequence getTitleStringHorizontalSpread(Resources resources, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) throws Resources.NotFoundException {
        int i;
        OptionLeg optionLeg = (OptionLeg) CollectionsKt.first((List) list);
        String str2 = numberFormatter.format(optionLeg.getStrikePrice());
        CharSequence contractTypeString$default = OptionExtensions.getContractTypeString$default(resources, optionLeg.getContractType(), 0, 4, null);
        if (str == null) {
            i = C23386R.string.option_position_row_title_calendar_spread_no_symbol;
        } else {
            i = C23386R.string.option_position_row_title_calendar_spread;
        }
        String string2 = resources.getString(i, str, str2, contractTypeString$default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final CharSequence getTitleStringVerticalSpread(Resources resources, String str, List<? extends OptionLeg> list, NumberFormatter numberFormatter) throws Resources.NotFoundException {
        int i;
        List<? extends OptionLeg> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        BigDecimal strikePrice = ((OptionLeg) it.next()).getStrikePrice();
        while (it.hasNext()) {
            BigDecimal strikePrice2 = ((OptionLeg) it.next()).getStrikePrice();
            if (strikePrice.compareTo(strikePrice2) < 0) {
                strikePrice = strikePrice2;
            }
        }
        Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        BigDecimal strikePrice3 = ((OptionLeg) it2.next()).getStrikePrice();
        while (it2.hasNext()) {
            BigDecimal strikePrice4 = ((OptionLeg) it2.next()).getStrikePrice();
            if (strikePrice3.compareTo(strikePrice4) > 0) {
                strikePrice3 = strikePrice4;
            }
        }
        OptionContractType contractType = ((OptionLeg) CollectionsKt.first((List) list)).getContractType();
        int i2 = WhenMappings.$EnumSwitchMapping$1[contractType.ordinal()];
        if (i2 == 1) {
            BigDecimal bigDecimal = strikePrice;
            strikePrice = strikePrice3;
            strikePrice3 = bigDecimal;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        CharSequence contractTypeString = OptionExtensions.getContractTypeString(resources, contractType, 2);
        if (str == null) {
            i = C23386R.string.option_position_row_title_vertical_spread_no_symbol;
        } else {
            i = C23386R.string.option_position_row_title_vertical_spread;
        }
        String string2 = resources.getString(i, str, numberFormatter.format(strikePrice), numberFormatter.format(strikePrice3), contractTypeString);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final NumberFormatter strikeNumberFormatter(OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[underlyingType.ordinal()];
        if (i == 1) {
            return Formats.getStrikePriceFormat();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Formats.getStrikeValueFormat();
    }

    public static final String getExpirationStringShort(Resources resources, LocalDate expirationDate, boolean z) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        String str = OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(expirationDate);
        if (!z) {
            return str;
        }
        String string2 = resources.getString(C23386R.string.option_history_title_settle_on_open, str);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
