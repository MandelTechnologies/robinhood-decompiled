package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument2;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.datetime.format.TemporalFormatterKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import p479j$.time.Clock;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionInstrumentDetails.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a;\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0018\u001a+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001d\u001a5\u0010%\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&\u001aC\u0010)\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/models/db/OptionInstrumentDetails;", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "", "getFormattedTitleString", "(Lcom/robinhood/models/db/OptionInstrumentDetails;Landroid/content/res/Resources;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)Ljava/lang/String;", "getFormattedTitleStringWithExpirationSubtitle", "Ljava/math/BigDecimal;", "quantity", "Lcom/robinhood/models/db/OptionPositionType;", "positionType", "Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "orderPositionEffect", "", "settleOnOpen", "getFormattedSubtitleString", "(Lcom/robinhood/models/db/OptionInstrumentDetails;Landroid/content/res/Resources;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionPositionType;Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;Z)Ljava/lang/String;", "j$/time/Clock", Card.Icon.CLOCK, "getFormattedSubtitleStringWithDte", "(Lcom/robinhood/models/db/OptionInstrumentDetails;Landroid/content/res/Resources;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionPositionType;Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;Lj$/time/Clock;)Ljava/lang/String;", "expirationStr", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionPositionType;Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/ranges/ClosedRange;", "j$/time/LocalDate", "expirationDateRange", "getExpirationStringShort", "(Landroid/content/res/Resources;Lkotlin/ranges/ClosedRange;Z)Ljava/lang/String;", "getDteString", "(Landroid/content/res/Resources;Lkotlin/ranges/ClosedRange;Lj$/time/Clock;)Ljava/lang/String;", "getExpirationStringWithoutExp", "processedQuantity", "Lcom/robinhood/models/db/OrderDirection;", "direction", "effectString", "getProcessedQuantityAndSideString", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Ljava/lang/String;)Ljava/lang/String;", "Lcom/robinhood/models/api/OptionStrategyType;", "strategy", "getQuantityAndSideString", "(Landroid/content/res/Resources;Ljava/math/BigDecimal;Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/db/OrderDirection;Ljava/lang/String;)Ljava/lang/String;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionInstrumentDetailsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionInstrumentDetails2 {

    /* compiled from: OptionInstrumentDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.OptionInstrumentDetailsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[UiOptionStrategyDisplay.OptionOrderPositionEffect.values().length];
            try {
                iArr[UiOptionStrategyDisplay.OptionOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiOptionStrategyDisplay.OptionOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiOptionStrategyDisplay.OptionOrderPositionEffect.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderDirection.values().length];
            try {
                iArr2[OrderDirection.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderDirection.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionPositionType.values().length];
            try {
                iArr3[OptionPositionType.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OptionPositionType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final String getFormattedTitleString(OptionInstrument2 optionInstrument2, Resources resources, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        String string2 = resources.getString(C23386R.string.option_position_row_title, optionInstrument2.getChainSymbol(), OptionExtensions2.strikeNumberFormatter(underlyingType).format(optionInstrument2.getStrikePrice()), OptionExtensions.getTypeString(optionInstrument2, resources));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getFormattedTitleStringWithExpirationSubtitle(OptionInstrument2 optionInstrument2, Resources resources, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        String string2 = resources.getString(C23386R.string.option_position_row_title, optionInstrument2.getChainSymbol(), OptionExtensions2.strikeNumberFormatter(underlyingType).format(optionInstrument2.getStrikePrice()), OptionExtensions.getTypeString(optionInstrument2, resources));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getFormattedSubtitleString(OptionInstrument2 optionInstrument2, Resources resources, BigDecimal quantity, OptionPositionType positionType, UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect, boolean z) {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        LocalDate expirationDate = optionInstrument2.getExpirationDate();
        return getFormattedSubtitleString(resources, quantity, positionType, optionOrderPositionEffect, getExpirationStringShort(resources, RangesKt.rangeTo(expirationDate, expirationDate), z));
    }

    public static final String getFormattedSubtitleStringWithDte(OptionInstrument2 optionInstrument2, Resources resources, BigDecimal quantity, OptionPositionType positionType, UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect, Clock clock) {
        Intrinsics.checkNotNullParameter(optionInstrument2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate expirationDate = optionInstrument2.getExpirationDate();
        return getFormattedSubtitleString(resources, quantity, positionType, optionOrderPositionEffect, getDteString(resources, RangesKt.rangeTo(expirationDate, expirationDate), clock));
    }

    private static final String getFormattedSubtitleString(Resources resources, BigDecimal bigDecimal, OptionPositionType optionPositionType, UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect, String str) throws Resources.NotFoundException {
        String string2;
        int i;
        int i2 = C23386R.string.option_position_instrument_detail_row_subtitle;
        OrderDirection direction = optionPositionType.getDirection();
        if (optionOrderPositionEffect != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[optionOrderPositionEffect.ordinal()];
            if (i3 == 1) {
                i = C32428R.string.order_effect_to_open;
            } else if (i3 == 2) {
                i = C32428R.string.order_effect_to_close;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C32428R.string.order_effect_blank;
            }
            string2 = resources.getString(i);
        } else {
            string2 = null;
        }
        String string3 = resources.getString(i2, str, getQuantityAndSideString$default(resources, bigDecimal, null, direction, string2, 4, null));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getExpirationStringShort(Resources resources, Range2<LocalDate> expirationDateRange, boolean z) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(expirationDateRange, "expirationDateRange");
        LocalDate localDateCurrentDateInEst$default = LocalDates.currentDateInEst$default(null, 1, null);
        if (z || localDateCurrentDateInEst$default.compareTo((ChronoLocalDate) expirationDateRange.getStart()) < 0 || localDateCurrentDateInEst$default.compareTo((ChronoLocalDate) expirationDateRange.getEndInclusive()) > 0) {
            if (z) {
                i = C23386R.string.f4750x15c5106e;
            } else {
                i = C23386R.string.option_position_instrument_detail_expiration_date_label;
            }
            String string2 = resources.getString(i, TemporalFormatterKt.format(expirationDateRange, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER()));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C23386R.string.option_expiration_today);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static final String getDteString(Resources resources, Range2<LocalDate> expirationDateRange, Clock clock) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(expirationDateRange, "expirationDateRange");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate localDateNow = LocalDate.now(clock);
        if (Intrinsics.areEqual(expirationDateRange.getStart(), expirationDateRange.getEndInclusive())) {
            int i = C23386R.string.option_number_of_days_until_expiration;
            Intrinsics.checkNotNull(localDateNow);
            String string2 = resources.getString(i, Long.valueOf(localDateNow.until((LocalDate) expirationDateRange.getStart(), ChronoUnit.DAYS)));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        int i2 = C23386R.string.option_number_of_days_until_expiration_range;
        Intrinsics.checkNotNull(localDateNow);
        LocalDate localDate = (LocalDate) expirationDateRange.getStart();
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        String string3 = resources.getString(i2, Long.valueOf(localDateNow.until(localDate, chronoUnit)), Long.valueOf(localDateNow.until((LocalDate) expirationDateRange.getEndInclusive(), chronoUnit)));
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public static final String getExpirationStringWithoutExp(Resources resources, Range2<LocalDate> expirationDateRange, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(expirationDateRange, "expirationDateRange");
        String str = TemporalFormatterKt.format(expirationDateRange, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER());
        if (!z) {
            return str;
        }
        String string2 = resources.getString(C23386R.string.f4749xc6956d69, str);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public static final String getProcessedQuantityAndSideString(Resources resources, BigDecimal processedQuantity, BigDecimal quantity, OrderDirection direction, String effectString) {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(processedQuantity, "processedQuantity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(effectString, "effectString");
        int i2 = WhenMappings.$EnumSwitchMapping$1[direction.ordinal()];
        if (i2 == 1) {
            i = C23386R.string.option_position_pending_quantity_sell_label;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23386R.string.option_position_pending_quantity_buy_label;
        }
        String string2 = resources.getString(i, Integer.valueOf(processedQuantity.intValueExact()), Integer.valueOf(quantity.intValueExact()), effectString);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static /* synthetic */ String getQuantityAndSideString$default(Resources resources, BigDecimal bigDecimal, OptionStrategyType optionStrategyType, OrderDirection orderDirection, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            optionStrategyType = null;
        }
        if ((i & 8) != 0) {
            orderDirection = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return getQuantityAndSideString(resources, bigDecimal, optionStrategyType, orderDirection, str);
    }

    public static final String getQuantityAndSideString(Resources resources, BigDecimal bigDecimal, OptionStrategyType optionStrategyType, OrderDirection orderDirection, String str) {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (optionStrategyType != null) {
            OptionPositionType positionType = optionStrategyType.getPositionType();
            Intrinsics.checkNotNull(positionType);
            int i2 = WhenMappings.$EnumSwitchMapping$2[positionType.ordinal()];
            if (i2 == 1) {
                i = C23386R.plurals.option_position_instrument_detail_sell_quantity_label;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.option_position_instrument_detail_buy_quantity_label;
            }
        } else {
            if (orderDirection == null) {
                return "";
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[orderDirection.ordinal()];
            if (i3 == 1) {
                i = C23386R.plurals.option_position_instrument_detail_sell_quantity_label;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23386R.plurals.option_position_instrument_detail_buy_quantity_label;
            }
        }
        if (bigDecimal == null) {
            String string2 = resources.getString(C11048R.string.general_label_n_a_short);
            if (str == null) {
                str = "";
            }
            String quantityString = resources.getQuantityString(i, 1, string2, str);
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        int iIntValue = bigDecimal.intValue();
        String str2 = Formats.getIntegerFormat().format(bigDecimal);
        if (str == null) {
            str = "";
        }
        String quantityString2 = resources.getQuantityString(i, iIntValue, str2, str);
        Intrinsics.checkNotNull(quantityString2);
        return quantityString2;
    }
}
