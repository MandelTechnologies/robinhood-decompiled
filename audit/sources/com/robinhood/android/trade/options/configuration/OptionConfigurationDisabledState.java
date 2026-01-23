package com.robinhood.android.trade.options.configuration;

import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Clock2;
import kotlinx.datetime.Converters4;
import p479j$.time.Instant;
import p479j$.time.LocalTime;
import p479j$.time.ZonedDateTime;

/* compiled from: OptionConfigurationDisabledState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B+\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "", "subtitleRes", "", "subtitleFormatArgs", "", "", "mode", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$Mode;", "<init>", "(ILjava/util/List;Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$Mode;)V", "getSubtitleRes", "()I", "getSubtitleFormatArgs", "()Ljava/util/List;", "getMode", "()Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$Mode;", "SellToCloseOnly", "SingleLegOnly", "RollingNotSupported", "OutsideMarketHours", "NonMarketDay", "Mode", "Companion", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$NonMarketDay;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$OutsideMarketHours;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$RollingNotSupported;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$SellToCloseOnly;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$SingleLegOnly;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class OptionConfigurationDisabledState {
    private static final long SHORTENED_VOLATILITY_PERIOD_SECONDS = 300;
    private static final long VOLATILITY_PERIOD_SECONDS = 900;
    private final Mode mode;
    private final List<String> subtitleFormatArgs;
    private final int subtitleRes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ OptionConfigurationDisabledState(int i, List list, Mode mode, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, mode);
    }

    private OptionConfigurationDisabledState(int i, List<String> list, Mode mode) {
        this.subtitleRes = i;
        this.subtitleFormatArgs = list;
        this.mode = mode;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public /* synthetic */ OptionConfigurationDisabledState(int i, List list, Mode mode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, mode, null);
    }

    public final List<String> getSubtitleFormatArgs() {
        return this.subtitleFormatArgs;
    }

    public final Mode getMode() {
        return this.mode;
    }

    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$SellToCloseOnly;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SellToCloseOnly extends OptionConfigurationDisabledState {
        public static final SellToCloseOnly INSTANCE = new SellToCloseOnly();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof SellToCloseOnly);
        }

        public int hashCode() {
            return -1058373437;
        }

        public String toString() {
            return "SellToCloseOnly";
        }

        private SellToCloseOnly() {
            super(C29757R.string.option_order_configuration_error_sell_to_close_only_subtitle, null, Mode.STOP_MARKET_ONLY, 2, null);
        }
    }

    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$SingleLegOnly;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SingleLegOnly extends OptionConfigurationDisabledState {
        public static final SingleLegOnly INSTANCE = new SingleLegOnly();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof SingleLegOnly);
        }

        public int hashCode() {
            return 312371806;
        }

        public String toString() {
            return "SingleLegOnly";
        }

        private SingleLegOnly() {
            super(C29757R.string.option_order_configuration_error_single_leg_only_subtitle, null, Mode.ALL_MARKET_ORDERS, 2, null);
        }
    }

    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$RollingNotSupported;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RollingNotSupported extends OptionConfigurationDisabledState {
        public static final RollingNotSupported INSTANCE = new RollingNotSupported();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof RollingNotSupported);
        }

        public int hashCode() {
            return -1235542548;
        }

        public String toString() {
            return "RollingNotSupported";
        }

        private RollingNotSupported() {
            super(C29757R.string.option_order_configuration_error_single_leg_only_subtitle, null, Mode.ALL_MARKET_ORDERS, 2, null);
        }
    }

    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$OutsideMarketHours;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "j$/time/Instant", "marketOpen", "regularClose", "lateClose", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "withShortenedVolatilityPeriod", "(Lcom/robinhood/models/db/MarketHours;Z)V", "component1", "()Lj$/time/Instant;", "component2", "component3", "copy", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$OutsideMarketHours;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OutsideMarketHours extends OptionConfigurationDisabledState {
        public static final int $stable = 8;
        private final Instant lateClose;
        private final Instant marketOpen;
        private final Instant regularClose;

        /* renamed from: component1, reason: from getter */
        private final Instant getMarketOpen() {
            return this.marketOpen;
        }

        /* renamed from: component2, reason: from getter */
        private final Instant getRegularClose() {
            return this.regularClose;
        }

        /* renamed from: component3, reason: from getter */
        private final Instant getLateClose() {
            return this.lateClose;
        }

        public static /* synthetic */ OutsideMarketHours copy$default(OutsideMarketHours outsideMarketHours, Instant instant, Instant instant2, Instant instant3, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = outsideMarketHours.marketOpen;
            }
            if ((i & 2) != 0) {
                instant2 = outsideMarketHours.regularClose;
            }
            if ((i & 4) != 0) {
                instant3 = outsideMarketHours.lateClose;
            }
            return outsideMarketHours.copy(instant, instant2, instant3);
        }

        public final OutsideMarketHours copy(Instant marketOpen, Instant regularClose, Instant lateClose) {
            Intrinsics.checkNotNullParameter(marketOpen, "marketOpen");
            Intrinsics.checkNotNullParameter(regularClose, "regularClose");
            return new OutsideMarketHours(marketOpen, regularClose, lateClose);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutsideMarketHours)) {
                return false;
            }
            OutsideMarketHours outsideMarketHours = (OutsideMarketHours) other;
            return Intrinsics.areEqual(this.marketOpen, outsideMarketHours.marketOpen) && Intrinsics.areEqual(this.regularClose, outsideMarketHours.regularClose) && Intrinsics.areEqual(this.lateClose, outsideMarketHours.lateClose);
        }

        public int hashCode() {
            int iHashCode = ((this.marketOpen.hashCode() * 31) + this.regularClose.hashCode()) * 31;
            Instant instant = this.lateClose;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "OutsideMarketHours(marketOpen=" + this.marketOpen + ", regularClose=" + this.regularClose + ", lateClose=" + this.lateClose + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OutsideMarketHours(Instant marketOpen, Instant regularClose, Instant instant) {
            int i;
            List listListOf;
            Intrinsics.checkNotNullParameter(marketOpen, "marketOpen");
            Intrinsics.checkNotNullParameter(regularClose, "regularClose");
            if (instant == null) {
                i = C29757R.string.f4979xddb5ab34;
            } else {
                i = C29757R.string.option_order_configuration_error_outside_market_hours_subtitle;
            }
            if (instant == null) {
                listListOf = CollectionsKt.listOf((Object[]) new String[]{Instants2.toEasternTimeString(marketOpen), Instants2.toEasternTimeString(regularClose)});
            } else {
                Companion companion = OptionConfigurationDisabledState.INSTANCE;
                listListOf = CollectionsKt.listOf((Object[]) new String[]{companion.toShortEasternTimeString(marketOpen), companion.toShortEasternTimeString(regularClose), companion.toShortEasternTimeString(instant)});
            }
            super(i, listListOf, Mode.ALL_MARKET_ORDERS, null);
            this.marketOpen = marketOpen;
            this.regularClose = regularClose;
            this.lateClose = instant;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OutsideMarketHours(MarketHours marketHours, boolean z) {
            this(OptionConfigurationDisabledState.INSTANCE.getMarketOpenAfterVolatility(marketHours, z), marketHours.getRegularClosesAt(), marketHours.getLateOptionClosesAt());
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        }
    }

    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$NonMarketDay;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NonMarketDay extends OptionConfigurationDisabledState {
        public static final NonMarketDay INSTANCE = new NonMarketDay();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            return this == other || (other instanceof NonMarketDay);
        }

        public int hashCode() {
            return -125107449;
        }

        public String toString() {
            return "NonMarketDay";
        }

        private NonMarketDay() {
            super(C29757R.string.option_order_configuration_error_non_market_day_subtitle, null, Mode.ALL_MARKET_ORDERS, 2, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "STOP_MARKET_ONLY", "ALL_MARKET_ORDERS", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode STOP_MARKET_ONLY = new Mode("STOP_MARKET_ONLY", 0);
        public static final Mode ALL_MARKET_ORDERS = new Mode("ALL_MARKET_ORDERS", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{STOP_MARKET_ONLY, ALL_MARKET_ORDERS};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(modeArr$values);
        }

        private Mode(String str, int i) {
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionConfigurationDisabledState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState$Companion;", "", "<init>", "()V", "Lcom/robinhood/models/db/MarketHours;", "", "shortened", "j$/time/Instant", "getMarketOpenAfterVolatility", "(Lcom/robinhood/models/db/MarketHours;Z)Lj$/time/Instant;", "isLateClosing", "marketClose", "", "toShortEasternTimeString", "(Lj$/time/Instant;)Ljava/lang/String;", "marketHours", "isRolling", "isMultiLeg", "Lcom/robinhood/models/db/OrderSide;", "side", "Lcom/robinhood/models/db/OrderPositionEffect;", "singleLegPositionEffect", "withShortenedVolatilityPeriod", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "from", "(Lcom/robinhood/models/db/MarketHours;ZZZLcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderPositionEffect;Z)Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "", "VOLATILITY_PERIOD_SECONDS", "J", "SHORTENED_VOLATILITY_PERIOD_SECONDS", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Instant getMarketOpenAfterVolatility(MarketHours marketHours, boolean z) {
            Instant instantPlusSeconds = marketHours.getRegularOpensAt().plusSeconds(z ? 300L : OptionConfigurationDisabledState.VOLATILITY_PERIOD_SECONDS);
            Intrinsics.checkNotNullExpressionValue(instantPlusSeconds, "plusSeconds(...)");
            return instantPlusSeconds;
        }

        private final Instant marketClose(MarketHours marketHours, boolean z) {
            Instant lateOptionClosesAt;
            return (!z || (lateOptionClosesAt = marketHours.getLateOptionClosesAt()) == null) ? marketHours.getRegularClosesAt() : lateOptionClosesAt;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toShortEasternTimeString(Instant instant) {
            LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT;
            LocalTime localTime = ZonedDateTime.ofInstant(instant, ZoneIds.INSTANCE.getNEW_YORK()).toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
            return localTimeFormatter.format(localTime);
        }

        public final OptionConfigurationDisabledState from(MarketHours marketHours, boolean isLateClosing, boolean isRolling, boolean isMultiLeg, OrderSide side, OrderPositionEffect singleLegPositionEffect, boolean withShortenedVolatilityPeriod) {
            Intrinsics.checkNotNullParameter(side, "side");
            if (marketHours != null && !marketHours.isOpen()) {
                return NonMarketDay.INSTANCE;
            }
            if ((marketHours != null ? marketHours.getLateOptionClosesAt() : null) != null) {
                Instant marketOpenAfterVolatility = getMarketOpenAfterVolatility(marketHours, withShortenedVolatilityPeriod);
                Instant instantMarketClose = marketClose(marketHours, isLateClosing);
                Instant javaInstant = Converters4.toJavaInstant(Clock2.INSTANCE.now());
                if (javaInstant.compareTo(marketOpenAfterVolatility) < 0 || javaInstant.compareTo(instantMarketClose) > 0) {
                    return new OutsideMarketHours(marketHours, withShortenedVolatilityPeriod);
                }
            }
            if (isRolling) {
                return RollingNotSupported.INSTANCE;
            }
            if (isMultiLeg) {
                return SingleLegOnly.INSTANCE;
            }
            if (side == OrderSide.SELL && singleLegPositionEffect == OrderPositionEffect.CLOSE) {
                return null;
            }
            return SellToCloseOnly.INSTANCE;
        }
    }
}
