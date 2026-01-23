package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionLeg;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: UiOptionStrategyDisplays.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0012\u001a+\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a+\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0015\u001a+\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0015\u001a+\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0015\u001a+\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0015\u001a+\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0015\u001a+\u0010\u001d\u001a\u00020\u0005*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0015\u001a\u001b\u0010 \u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"Lcom/robinhood/models/ui/UiOptionStrategyDisplay;", "Landroid/content/res/Resources;", "resources", "", "chainSymbol", "", "getStrategyTitleV2", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/CharSequence;", "", "settleOnOpen", "showQuantity", "getSubtitleString", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;ZZ)Ljava/lang/CharSequence;", "j$/time/Clock", Card.Icon.CLOCK, "getSubtitleStringWithDte", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;ZLj$/time/Clock;)Ljava/lang/CharSequence;", "expirationStr", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;ZLjava/lang/String;)Ljava/lang/CharSequence;", "expiration", "getSubtitleStringSingleLeg", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;Ljava/lang/String;Z)Ljava/lang/CharSequence;", "getSubtitleStringVerticalSpread", "getSubtitleStringHorizontalSpread", "getSubtitleStringStraddle", "getSubtitleStringStrangle", "getSubtitleStringIronCondor", "getSubtitleStringIronButterfly", "Lcom/robinhood/models/ui/UiOptionOrder;", "getSubtitleStringRoll", "(Lcom/robinhood/models/ui/UiOptionOrder;Landroid/content/res/Resources;Ljava/lang/String;Z)Ljava/lang/CharSequence;", "getSubtitleStringCustom", "getPositionEffectString", "(Lcom/robinhood/models/ui/UiOptionStrategyDisplay;Landroid/content/res/Resources;)Ljava/lang/String;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplaysKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionStrategyDisplays {

    /* compiled from: UiOptionStrategyDisplays.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplaysKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

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
                iArr[OptionStrategyType.Classification.IRON_CONDOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionStrategyType.Classification.IRON_BUTTERFLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionStrategyType.Classification.NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionPositionType.values().length];
            try {
                iArr2[OptionPositionType.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OptionPositionType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionStrategyType.values().length];
            try {
                iArr3[OptionStrategyType.LONG_CALL_SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionStrategyType.LONG_PUT_SPREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OptionStrategyType.SHORT_CALL_SPREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[OptionStrategyType.SHORT_PUT_SPREAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[OptionStrategyType.CALL_CALENDAR_SPREAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[OptionStrategyType.LONG_CALL_CALENDAR_SPREAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[OptionStrategyType.PUT_CALENDAR_SPREAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[OptionStrategyType.LONG_PUT_CALENDAR_SPREAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[OptionStrategyType.SHORT_CALL_CALENDAR_SPREAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[OptionStrategyType.SHORT_PUT_CALENDAR_SPREAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderDirection.values().length];
            try {
                iArr4[OrderDirection.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[OrderDirection.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[UiOptionStrategyDisplay.OptionOrderPositionEffect.values().length];
            try {
                iArr5[UiOptionStrategyDisplay.OptionOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[UiOptionStrategyDisplay.OptionOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[UiOptionStrategyDisplay.OptionOrderPositionEffect.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final CharSequence getStrategyTitleV2(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String chainSymbol) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionStrategyDisplay, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        OptionLeg optionLeg = (OptionLeg) CollectionsKt.single((List) uiOptionStrategyDisplay.getLegs());
        String string2 = resources.getString(C23386R.string.option_position_row_title_full, chainSymbol, Formats.getStrikePriceFormat().format(optionLeg.getStrikePrice()), OptionExtensions.getName(uiOptionStrategyDisplay.getStrategy(), resources, uiOptionStrategyDisplay.getLegs().size()), OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(optionLeg.getExpirationDate()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static /* synthetic */ CharSequence getSubtitleString$default(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        return getSubtitleString(uiOptionStrategyDisplay, resources, z, z2);
    }

    public static final CharSequence getSubtitleString(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(uiOptionStrategyDisplay, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return getSubtitleString(uiOptionStrategyDisplay, resources, z2, OptionInstrumentDetails2.getExpirationStringShort(resources, uiOptionStrategyDisplay.getExpirationDateRange(), z));
    }

    public static final CharSequence getSubtitleStringWithDte(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, boolean z, Clock clock) {
        Intrinsics.checkNotNullParameter(uiOptionStrategyDisplay, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return getSubtitleString(uiOptionStrategyDisplay, resources, z, OptionInstrumentDetails2.getDteString(resources, uiOptionStrategyDisplay.getExpirationDateRange(), clock));
    }

    private static final CharSequence getSubtitleString(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, boolean z, String str) {
        if (uiOptionStrategyDisplay instanceof UiOptionOrder) {
            UiOptionOrder uiOptionOrder = (UiOptionOrder) uiOptionStrategyDisplay;
            if (uiOptionOrder.getRollingStrategy() != null) {
                return getSubtitleStringRoll(uiOptionOrder, resources, str, z);
            }
        }
        switch (WhenMappings.$EnumSwitchMapping$0[uiOptionStrategyDisplay.getStrategy().getClassification().ordinal()]) {
            case 1:
                return getSubtitleStringSingleLeg(uiOptionStrategyDisplay, resources, str, z);
            case 2:
                return getSubtitleStringVerticalSpread(uiOptionStrategyDisplay, resources, str, z);
            case 3:
                return getSubtitleStringHorizontalSpread(uiOptionStrategyDisplay, resources, str, z);
            case 4:
                return getSubtitleStringStraddle(uiOptionStrategyDisplay, resources, str, z);
            case 5:
                return getSubtitleStringStrangle(uiOptionStrategyDisplay, resources, str, z);
            case 6:
                return getSubtitleStringIronCondor(uiOptionStrategyDisplay, resources, str, z);
            case 7:
                return getSubtitleStringIronButterfly(uiOptionStrategyDisplay, resources, str, z);
            case 8:
                return getSubtitleStringCustom(uiOptionStrategyDisplay, resources, str, z);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final CharSequence getSubtitleStringSingleLeg(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        String quantityAndSideString;
        int i = C23386R.string.option_position_instrument_detail_row_subtitle;
        if (!z) {
            OptionPositionType positionType = uiOptionStrategyDisplay.getStrategy().getPositionType();
            Intrinsics.checkNotNull(positionType);
            int i2 = WhenMappings.$EnumSwitchMapping$1[positionType.ordinal()];
            if (i2 == 1) {
                quantityAndSideString = resources.getString(C32428R.string.general_label_sell);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                quantityAndSideString = resources.getString(C32428R.string.general_label_buy);
            }
        } else if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            quantityAndSideString = OptionInstrumentDetails2.getProcessedQuantityAndSideString(resources, uiOptionStrategyDisplay.getProcessedQuantity(), uiOptionStrategyDisplay.getQuantity(), uiOptionStrategyDisplay.getDirection(), getPositionEffectString(uiOptionStrategyDisplay, resources));
        } else {
            quantityAndSideString = OptionInstrumentDetails2.getQuantityAndSideString(resources, uiOptionStrategyDisplay.getQuantity(), uiOptionStrategyDisplay.isPending() ? null : uiOptionStrategyDisplay.getStrategy(), uiOptionStrategyDisplay.isPending() ? uiOptionStrategyDisplay.getDirection() : null, getPositionEffectString(uiOptionStrategyDisplay, resources));
        }
        String string2 = resources.getString(i, str, quantityAndSideString);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private static final CharSequence getSubtitleStringVerticalSpread(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int i;
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        if (uiOptionStrategyDisplay.isPending()) {
            int i2 = WhenMappings.$EnumSwitchMapping$2[uiOptionStrategyDisplay.getStrategy().ordinal()];
            if (i2 == 1 || i2 == 2) {
                i = C23386R.string.order_direction_debit;
            } else if (i2 == 3 || i2 == 4) {
                i = C23386R.string.order_direction_credit;
            } else {
                throw new IllegalStateException("Invalid vertical strategy type");
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$3[uiOptionStrategyDisplay.getDirection().ordinal()];
            if (i3 == 1) {
                i = C23386R.string.order_direction_credit;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.string.order_direction_debit;
            }
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String quantityString = resources.getQuantityString(C23386R.plurals.option_strategy_spread, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String positionEffectString = getPositionEffectString(uiOptionStrategyDisplay, resources);
        if (!z) {
            return string2;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string3 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_vertical_spread, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), string2, quantityString, positionEffectString);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = resources.getString(C23386R.string.option_position_row_subtitle_vertical_spread, str, Integer.valueOf(iIntValueExact), string2, quantityString, positionEffectString);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    private static final CharSequence getSubtitleStringHorizontalSpread(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int i;
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        String quantityString = resources.getQuantityString(C23386R.plurals.option_strategy_calendar, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (uiOptionStrategyDisplay.isPending()) {
            switch (WhenMappings.$EnumSwitchMapping$2[uiOptionStrategyDisplay.getStrategy().ordinal()]) {
                case 5:
                case 6:
                case 7:
                case 8:
                    i = C23386R.string.order_direction_debit;
                    break;
                case 9:
                case 10:
                    i = C23386R.string.order_direction_credit;
                    break;
                default:
                    throw new IllegalStateException("Invalid horizontal strategy type");
            }
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$3[uiOptionStrategyDisplay.getDirection().ordinal()];
            if (i2 == 1) {
                i = C23386R.string.order_direction_credit;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.string.order_direction_debit;
            }
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String positionEffectString = getPositionEffectString(uiOptionStrategyDisplay, resources);
        if (!z) {
            return string2;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string3 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_calendar_spread, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), string2, quantityString, positionEffectString);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = resources.getString(C23386R.string.option_position_row_subtitle_calendar_spread, str, Integer.valueOf(iIntValueExact), string2, quantityString, positionEffectString);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    private static final CharSequence getSubtitleStringStraddle(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int i;
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        int i2 = WhenMappings.$EnumSwitchMapping$1[((OptionLeg) CollectionsKt.first((List) uiOptionStrategyDisplay.getLegs())).getPositionType().ordinal()];
        if (i2 == 1) {
            i = C23386R.plurals.option_strategy_side_sell;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23386R.plurals.option_strategy_side_buy;
        }
        String quantityString = resources.getQuantityString(i, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String positionEffectString = getPositionEffectString(uiOptionStrategyDisplay, resources);
        if (!z) {
            return quantityString;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string2 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_straddle, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_position_row_subtitle_straddle, str, Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private static final CharSequence getSubtitleStringStrangle(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int i;
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        int i2 = WhenMappings.$EnumSwitchMapping$1[((OptionLeg) CollectionsKt.first((List) uiOptionStrategyDisplay.getLegs())).getPositionType().ordinal()];
        if (i2 == 1) {
            i = C23386R.plurals.option_strategy_side_sell;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23386R.plurals.option_strategy_side_buy;
        }
        String quantityString = resources.getQuantityString(i, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String positionEffectString = getPositionEffectString(uiOptionStrategyDisplay, resources);
        if (!z) {
            return quantityString;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string2 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_straddle, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_position_row_subtitle_straddle, str, Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private static final CharSequence getSubtitleStringIronCondor(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        String quantityString = resources.getQuantityString(C23386R.plurals.option_strategy_iron_condor, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String positionEffectString = getPositionEffectString(uiOptionStrategyDisplay, resources);
        if (!z) {
            return quantityString;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string2 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_iron_condor, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_position_row_subtitle_iron_condor, str, Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private static final CharSequence getSubtitleStringIronButterfly(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        String quantityString = resources.getQuantityString(C23386R.plurals.option_strategy_iron_butterfly, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String positionEffectString = getPositionEffectString(uiOptionStrategyDisplay, resources);
        if (!z) {
            return quantityString;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string2 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_iron_butterfly, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_position_row_subtitle_iron_butterfly, str, Integer.valueOf(iIntValueExact), quantityString, positionEffectString);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private static final CharSequence getSubtitleStringRoll(UiOptionOrder uiOptionOrder, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int iIntValueExact = uiOptionOrder.getQuantity().intValueExact();
        String quantityString = resources.getQuantityString(C23386R.plurals.option_strategy_roll, iIntValueExact);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (!z) {
            return quantityString;
        }
        if (uiOptionOrder.isPartiallyFilled()) {
            String string2 = resources.getString(C23386R.string.partially_filled_option_roll_row_subtitle, str, Integer.valueOf(uiOptionOrder.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), quantityString);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_position_roll_subtitle, str, Integer.valueOf(iIntValueExact), quantityString);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private static final CharSequence getSubtitleStringCustom(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources, String str, boolean z) throws Resources.NotFoundException {
        int i;
        String quantityString;
        int iIntValueExact = uiOptionStrategyDisplay.getQuantity().intValueExact();
        if (uiOptionStrategyDisplay.isPending()) {
            quantityString = resources.getString(C23386R.string.option_position_row_subtitle_custom_pending, Integer.valueOf(uiOptionStrategyDisplay.getLegs().size()), resources.getQuantityString(C23386R.plurals.option_strategy_custom_order, iIntValueExact));
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$3[uiOptionStrategyDisplay.getDirection().ordinal()];
            if (i2 == 1) {
                i = C23386R.plurals.option_strategy_type_credit;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.option_strategy_type_debit;
            }
            quantityString = resources.getQuantityString(i, iIntValueExact);
        }
        Intrinsics.checkNotNull(quantityString);
        String string2 = resources.getString(C32428R.string.order_effect_blank);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (!z) {
            return quantityString;
        }
        if (uiOptionStrategyDisplay.isPartiallyFilled()) {
            String string3 = resources.getString(C23386R.string.partially_filled_option_position_row_subtitle_iron_condor, str, Integer.valueOf(uiOptionStrategyDisplay.getProcessedQuantity().intValueExact()), Integer.valueOf(iIntValueExact), quantityString, string2);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = resources.getString(C23386R.string.option_position_row_subtitle_iron_condor, str, Integer.valueOf(iIntValueExact), quantityString, string2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    private static final String getPositionEffectString(UiOptionStrategyDisplay uiOptionStrategyDisplay, Resources resources) throws Resources.NotFoundException {
        int i;
        if (uiOptionStrategyDisplay.isPending()) {
            int i2 = WhenMappings.$EnumSwitchMapping$4[uiOptionStrategyDisplay.getEffect().ordinal()];
            if (i2 == 1) {
                i = C32428R.string.order_effect_to_open;
            } else if (i2 == 2) {
                i = C32428R.string.order_effect_to_close;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C32428R.string.order_effect_blank;
            }
            String string2 = resources.getString(i);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C32428R.string.order_effect_blank);
        Intrinsics.checkNotNull(string3);
        return string3;
    }
}
