package com.robinhood.android.trade.configuration;

import androidx.compose.runtime.Composer;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderConfigurationResource.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n56789:;<=>B\u00ad\u0001\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0014\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b\u0015\u0010.R\"\u0010\u0016\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b0\u0010.\"\u0004\b1\u00102R\"\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00102\u0082\u0001\n?@ABCDEFGH¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "subtitleRes", "Lkotlin/Function0;", "", "headerComposable", "footerComposable", "", "Lcom/robinhood/utils/Either;", "", "Lcom/robinhood/utils/resource/StringResource;", "subtitleFormatArgs", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "dayNightOverlay", "dayDrawableRes", "nightDrawableRes", "", "disabled", "showDivider", "isFxAtTrade", "selected", "new", "<init>", "(ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/List;Lcom/robinhood/android/designsystem/style/DayNightOverlay;IIZZZZZ)V", "I", "getTitleRes", "()I", "Ljava/lang/Integer;", "getSubtitleRes", "()Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function2;", "getHeaderComposable", "()Lkotlin/jvm/functions/Function2;", "getFooterComposable", "Ljava/util/List;", "getSubtitleFormatArgs", "()Ljava/util/List;", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayDrawableRes", "getNightDrawableRes", "Z", "getDisabled", "()Z", "getShowDivider", "getSelected", "setSelected", "(Z)V", "getNew", "setNew", "MarketShares", "MarketDollar", "TaxLots", "Limit", "StopLoss", "StopLimit", "StopMarket", "OptionMarket", "TrailingStop", "Recurring", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$Limit;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$MarketDollar;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$MarketShares;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$OptionMarket;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$Recurring;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopLimit;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopLoss;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopMarket;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$TaxLots;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$TrailingStop;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class OrderConfigurationResource {
    public static final int $stable = 8;
    private final int dayDrawableRes;
    private final DayNightOverlay dayNightOverlay;
    private final boolean disabled;
    private final Function2<Composer, Integer, Unit> footerComposable;
    private final Function2<Composer, Integer, Unit> headerComposable;
    private final boolean isFxAtTrade;
    private boolean new;
    private final int nightDrawableRes;
    private boolean selected;
    private final boolean showDivider;
    private final List<Either<String, StringResource>> subtitleFormatArgs;
    private final Integer subtitleRes;
    private final int titleRes;

    public /* synthetic */ OrderConfigurationResource(int i, Integer num, Function2 function2, Function2 function22, List list, DayNightOverlay dayNightOverlay, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, function2, function22, list, dayNightOverlay, i2, i3, z, z2, z3, z4, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OrderConfigurationResource(int i, Integer num, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, List<? extends Either<String, ? extends StringResource>> list, DayNightOverlay dayNightOverlay, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.titleRes = i;
        this.subtitleRes = num;
        this.headerComposable = function2;
        this.footerComposable = function22;
        this.subtitleFormatArgs = list;
        this.dayNightOverlay = dayNightOverlay;
        this.dayDrawableRes = i2;
        this.nightDrawableRes = i3;
        this.disabled = z;
        this.showDivider = z2;
        this.isFxAtTrade = z3;
        this.selected = z4;
        this.new = z5;
    }

    public int getTitleRes() {
        return this.titleRes;
    }

    public Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    public Function2<Composer, Integer, Unit> getHeaderComposable() {
        return this.headerComposable;
    }

    public Function2<Composer, Integer, Unit> getFooterComposable() {
        return this.footerComposable;
    }

    public /* synthetic */ OrderConfigurationResource(int i, Integer num, Function2 function2, Function2 function22, List list, DayNightOverlay dayNightOverlay, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, (i4 & 4) != 0 ? null : function2, (i4 & 8) != 0 ? null : function22, (i4 & 16) != 0 ? CollectionsKt.emptyList() : list, dayNightOverlay, i2, i3, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? false : z2, (i4 & 1024) != 0 ? false : z3, (i4 & 2048) != 0 ? false : z4, (i4 & 4096) != 0 ? false : z5, null);
    }

    public final List<Either<String, StringResource>> getSubtitleFormatArgs() {
        return this.subtitleFormatArgs;
    }

    public DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final int getDayDrawableRes() {
        return this.dayDrawableRes;
    }

    public final int getNightDrawableRes() {
        return this.nightDrawableRes;
    }

    public boolean getDisabled() {
        return this.disabled;
    }

    public boolean getShowDivider() {
        return this.showDivider;
    }

    /* renamed from: isFxAtTrade, reason: from getter */
    public boolean getIsFxAtTrade() {
        return this.isFxAtTrade;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean getNew() {
        return this.new;
    }

    public final void setNew(boolean z) {
        this.new = z;
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$MarketShares;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "symbol", "", "isBuyToClose", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "isFxAtTrade", "showDivider", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;ZZ)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getSymbol", "()Ljava/lang/String;", "()Z", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getShowDivider", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MarketShares extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean isBuyToClose;
        private final boolean isFxAtTrade;
        private final boolean showDivider;
        private final EquityOrderSide side;
        private final String symbol;

        /* compiled from: OrderConfigurationResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ MarketShares copy$default(MarketShares marketShares, EquityOrderSide equityOrderSide, String str, boolean z, DayNightOverlay dayNightOverlay, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderSide = marketShares.side;
            }
            if ((i & 2) != 0) {
                str = marketShares.symbol;
            }
            if ((i & 4) != 0) {
                z = marketShares.isBuyToClose;
            }
            if ((i & 8) != 0) {
                dayNightOverlay = marketShares.dayNightOverlay;
            }
            if ((i & 16) != 0) {
                z2 = marketShares.isFxAtTrade;
            }
            if ((i & 32) != 0) {
                z3 = marketShares.showDivider;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            return marketShares.copy(equityOrderSide, str, z, dayNightOverlay, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBuyToClose() {
            return this.isBuyToClose;
        }

        /* renamed from: component4, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFxAtTrade() {
            return this.isFxAtTrade;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final MarketShares copy(EquityOrderSide side, String symbol, boolean isBuyToClose, DayNightOverlay dayNightOverlay, boolean isFxAtTrade, boolean showDivider) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new MarketShares(side, symbol, isBuyToClose, dayNightOverlay, isFxAtTrade, showDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketShares)) {
                return false;
            }
            MarketShares marketShares = (MarketShares) other;
            return this.side == marketShares.side && Intrinsics.areEqual(this.symbol, marketShares.symbol) && this.isBuyToClose == marketShares.isBuyToClose && this.dayNightOverlay == marketShares.dayNightOverlay && this.isFxAtTrade == marketShares.isFxAtTrade && this.showDivider == marketShares.showDivider;
        }

        public int hashCode() {
            return (((((((((this.side.hashCode() * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.isBuyToClose)) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.isFxAtTrade)) * 31) + Boolean.hashCode(this.showDivider);
        }

        public String toString() {
            return "MarketShares(side=" + this.side + ", symbol=" + this.symbol + ", isBuyToClose=" + this.isBuyToClose + ", dayNightOverlay=" + this.dayNightOverlay + ", isFxAtTrade=" + this.isFxAtTrade + ", showDivider=" + this.showDivider + ")";
        }

        public /* synthetic */ MarketShares(EquityOrderSide equityOrderSide, String str, boolean z, DayNightOverlay dayNightOverlay, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderSide, str, z, dayNightOverlay, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean isBuyToClose() {
            return this.isBuyToClose;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        /* renamed from: isFxAtTrade */
        public boolean getIsFxAtTrade() {
            return this.isFxAtTrade;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MarketShares(EquityOrderSide side, String symbol, boolean z, DayNightOverlay dayNightOverlay, boolean z2, boolean z3) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[side.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i = C29312R.string.order_type_shares_market_sell_title;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C29312R.string.order_type_shares_market_sell_short_title;
                }
            } else if (z) {
                i = C29312R.string.order_type_shares_market_buy_to_close_title;
            } else {
                i = C29312R.string.order_type_shares_market_buy_title;
            }
            int i4 = iArr[side.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    i2 = C29312R.string.order_type_shares_market_sell_description;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C29312R.string.order_type_shares_market_sell_short_description;
                }
            } else if (z) {
                i2 = C29312R.string.order_type_shares_market_buy_to_close_description;
            } else {
                i2 = C29312R.string.order_type_shares_market_buy_description;
            }
            super(i, z2 ? null : Integer.valueOf(i2), null, null, CollectionsKt.listOf(new Either.Left(symbol)), dayNightOverlay, C29312R.drawable.svg_shares_order_day, C29312R.drawable.svg_shares_order_night, false, z3, false, false, false, 7436, null);
            this.side = side;
            this.symbol = symbol;
            this.isBuyToClose = z;
            this.dayNightOverlay = dayNightOverlay;
            this.isFxAtTrade = z2;
            this.showDivider = z3;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$MarketDollar;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "disabled", "", "symbol", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "isFxAtTrade", "showDivider", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;ZLjava/lang/String;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZZ)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getDisabled", "()Z", "getSymbol", "()Ljava/lang/String;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getShowDivider", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MarketDollar extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final boolean isFxAtTrade;
        private final boolean showDivider;
        private final EquityOrderSide side;
        private final String symbol;

        public static /* synthetic */ MarketDollar copy$default(MarketDollar marketDollar, EquityOrderSide equityOrderSide, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderSide = marketDollar.side;
            }
            if ((i & 2) != 0) {
                z = marketDollar.disabled;
            }
            if ((i & 4) != 0) {
                str = marketDollar.symbol;
            }
            if ((i & 8) != 0) {
                dayNightOverlay = marketDollar.dayNightOverlay;
            }
            if ((i & 16) != 0) {
                z2 = marketDollar.isFxAtTrade;
            }
            if ((i & 32) != 0) {
                z3 = marketDollar.showDivider;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            return marketDollar.copy(equityOrderSide, z, str, dayNightOverlay, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFxAtTrade() {
            return this.isFxAtTrade;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final MarketDollar copy(EquityOrderSide side, boolean disabled, String symbol, DayNightOverlay dayNightOverlay, boolean isFxAtTrade, boolean showDivider) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new MarketDollar(side, disabled, symbol, dayNightOverlay, isFxAtTrade, showDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarketDollar)) {
                return false;
            }
            MarketDollar marketDollar = (MarketDollar) other;
            return this.side == marketDollar.side && this.disabled == marketDollar.disabled && Intrinsics.areEqual(this.symbol, marketDollar.symbol) && this.dayNightOverlay == marketDollar.dayNightOverlay && this.isFxAtTrade == marketDollar.isFxAtTrade && this.showDivider == marketDollar.showDivider;
        }

        public int hashCode() {
            return (((((((((this.side.hashCode() * 31) + Boolean.hashCode(this.disabled)) * 31) + this.symbol.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.isFxAtTrade)) * 31) + Boolean.hashCode(this.showDivider);
        }

        public String toString() {
            return "MarketDollar(side=" + this.side + ", disabled=" + this.disabled + ", symbol=" + this.symbol + ", dayNightOverlay=" + this.dayNightOverlay + ", isFxAtTrade=" + this.isFxAtTrade + ", showDivider=" + this.showDivider + ")";
        }

        public /* synthetic */ MarketDollar(EquityOrderSide equityOrderSide, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderSide, z, str, dayNightOverlay, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        /* renamed from: isFxAtTrade */
        public boolean getIsFxAtTrade() {
            return this.isFxAtTrade;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MarketDollar(EquityOrderSide side, boolean z, String symbol, DayNightOverlay dayNightOverlay, boolean z2, boolean z3) {
            int i;
            int i2;
            int i3;
            int i4;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            EquityOrderSide equityOrderSide = EquityOrderSide.BUY;
            if (side == equityOrderSide) {
                if (z2) {
                    i = C29312R.string.order_type_cash_based_market_buy_title;
                } else {
                    i = C29312R.string.order_type_dollar_based_market_buy_title;
                }
            } else if (z2) {
                i = C29312R.string.order_type_cash_based_market_sell_title;
            } else {
                i = C29312R.string.order_type_dollar_based_market_sell_title;
            }
            if (side == equityOrderSide) {
                i2 = C29312R.string.order_type_dollar_based_order_buy_description;
            } else {
                i2 = C29312R.string.order_type_dollar_based_order_sell_description;
            }
            Integer numValueOf = z2 ? null : Integer.valueOf(i2);
            List listListOf = CollectionsKt.listOf(new Either.Left(symbol));
            if (z) {
                if (z2) {
                    i3 = C29312R.drawable.svg_cash_order_disabled;
                } else {
                    i3 = C11048R.drawable.svg_dollars_order_disabled;
                }
            } else if (z2) {
                i3 = C29312R.drawable.svg_cash_order_day;
            } else {
                i3 = C11048R.drawable.svg_dollars_order_day;
            }
            int i5 = i3;
            if (z) {
                if (z2) {
                    i4 = C29312R.drawable.svg_cash_order_disabled;
                } else {
                    i4 = C11048R.drawable.svg_dollars_order_disabled;
                }
            } else if (z2) {
                i4 = C29312R.drawable.svg_cash_order_night;
            } else {
                i4 = C11048R.drawable.svg_dollars_order_night;
            }
            super(i, numValueOf, null, null, listListOf, dayNightOverlay, i5, i4, z, z3, false, false, false, 7180, null);
            this.side = side;
            this.disabled = z;
            this.symbol = symbol;
            this.dayNightOverlay = dayNightOverlay;
            this.isFxAtTrade = z2;
            this.showDivider = z3;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$TaxLots;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "Lkotlin/Function0;", "", "headerComposable", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "dayNightOverlay", "", "showDivider", "disabled", "", "symbol", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZZLjava/lang/String;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "component2", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "component3", "()Z", "component4", "component5", "()Ljava/lang/String;", "copy", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZZLjava/lang/String;)Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$TaxLots;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function2;", "getHeaderComposable", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "Z", "getShowDivider", "getDisabled", "Ljava/lang/String;", "getSymbol", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TaxLots extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final Function2<Composer, Integer, Unit> headerComposable;
        private final boolean showDivider;
        private final String symbol;

        public static /* synthetic */ TaxLots copy$default(TaxLots taxLots, Function2 function2, DayNightOverlay dayNightOverlay, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                function2 = taxLots.headerComposable;
            }
            if ((i & 2) != 0) {
                dayNightOverlay = taxLots.dayNightOverlay;
            }
            if ((i & 4) != 0) {
                z = taxLots.showDivider;
            }
            if ((i & 8) != 0) {
                z2 = taxLots.disabled;
            }
            if ((i & 16) != 0) {
                str = taxLots.symbol;
            }
            String str2 = str;
            boolean z3 = z;
            return taxLots.copy(function2, dayNightOverlay, z3, z2, str2);
        }

        public final Function2<Composer, Integer, Unit> component1() {
            return this.headerComposable;
        }

        /* renamed from: component2, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final TaxLots copy(Function2<? super Composer, ? super Integer, Unit> headerComposable, DayNightOverlay dayNightOverlay, boolean showDivider, boolean disabled, String symbol) {
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new TaxLots(headerComposable, dayNightOverlay, showDivider, disabled, symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaxLots)) {
                return false;
            }
            TaxLots taxLots = (TaxLots) other;
            return Intrinsics.areEqual(this.headerComposable, taxLots.headerComposable) && this.dayNightOverlay == taxLots.dayNightOverlay && this.showDivider == taxLots.showDivider && this.disabled == taxLots.disabled && Intrinsics.areEqual(this.symbol, taxLots.symbol);
        }

        public int hashCode() {
            Function2<Composer, Integer, Unit> function2 = this.headerComposable;
            return ((((((((function2 == null ? 0 : function2.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.showDivider)) * 31) + Boolean.hashCode(this.disabled)) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            return "TaxLots(headerComposable=" + this.headerComposable + ", dayNightOverlay=" + this.dayNightOverlay + ", showDivider=" + this.showDivider + ", disabled=" + this.disabled + ", symbol=" + this.symbol + ")";
        }

        public /* synthetic */ TaxLots(Function2 function2, DayNightOverlay dayNightOverlay, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : function2, dayNightOverlay, (i & 4) != 0 ? false : z, z2, str);
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Function2<Composer, Integer, Unit> getHeaderComposable() {
            return this.headerComposable;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public TaxLots(Function2<? super Composer, ? super Integer, Unit> function2, DayNightOverlay dayNightOverlay, boolean z, boolean z2, String symbol) {
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            int i = C29312R.string.order_type_tax_lot_title;
            int i2 = C29312R.string.order_type_tax_lot_description;
            Function2 function22 = null;
            super(i, Integer.valueOf(i2), function2, function22, CollectionsKt.listOf(new Either.Left(symbol)), dayNightOverlay, C29312R.drawable.svg_tax_lots_day, C29312R.drawable.svg_tax_lots_night, z2, z, false, false, false, 3080, null);
            this.headerComposable = function2;
            this.dayNightOverlay = dayNightOverlay;
            this.showDivider = z;
            this.disabled = z2;
            this.symbol = symbol;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ|\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0003\u0010\u0012\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b6\u0010\u001cR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b;\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b<\u0010\u001c¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$Limit;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "Lcom/robinhood/models/db/EquityOrderSide;", "side", "", "symbol", "", "showAdtLimitOrderIcon", "", "buySubtitleRes", "sellSubtitleRes", "sellShortSubtitleRes", "Lkotlin/Function0;", "", "headerComposable", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "dayNightOverlay", "showDivider", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZIIILkotlin/jvm/functions/Function2;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZI)V", "component1", "()Lcom/robinhood/models/db/EquityOrderSide;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()I", "component5", "component6", "component7", "()Lkotlin/jvm/functions/Function2;", "component8", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "component9", "component10", "copy", "(Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZIIILkotlin/jvm/functions/Function2;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZI)Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$Limit;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "Ljava/lang/String;", "getSymbol", "Z", "getShowAdtLimitOrderIcon", "I", "getBuySubtitleRes", "getSellSubtitleRes", "getSellShortSubtitleRes", "Lkotlin/jvm/functions/Function2;", "getHeaderComposable", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "getShowDivider", "getTitleRes", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Limit extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final int buySubtitleRes;
        private final DayNightOverlay dayNightOverlay;
        private final Function2<Composer, Integer, Unit> headerComposable;
        private final int sellShortSubtitleRes;
        private final int sellSubtitleRes;
        private final boolean showAdtLimitOrderIcon;
        private final boolean showDivider;
        private final EquityOrderSide side;
        private final String symbol;
        private final int titleRes;

        /* compiled from: OrderConfigurationResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Limit copy$default(Limit limit, EquityOrderSide equityOrderSide, String str, boolean z, int i, int i2, int i3, Function2 function2, DayNightOverlay dayNightOverlay, boolean z2, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                equityOrderSide = limit.side;
            }
            if ((i5 & 2) != 0) {
                str = limit.symbol;
            }
            if ((i5 & 4) != 0) {
                z = limit.showAdtLimitOrderIcon;
            }
            if ((i5 & 8) != 0) {
                i = limit.buySubtitleRes;
            }
            if ((i5 & 16) != 0) {
                i2 = limit.sellSubtitleRes;
            }
            if ((i5 & 32) != 0) {
                i3 = limit.sellShortSubtitleRes;
            }
            if ((i5 & 64) != 0) {
                function2 = limit.headerComposable;
            }
            if ((i5 & 128) != 0) {
                dayNightOverlay = limit.dayNightOverlay;
            }
            if ((i5 & 256) != 0) {
                z2 = limit.showDivider;
            }
            if ((i5 & 512) != 0) {
                i4 = limit.titleRes;
            }
            boolean z3 = z2;
            int i6 = i4;
            Function2 function22 = function2;
            DayNightOverlay dayNightOverlay2 = dayNightOverlay;
            int i7 = i2;
            int i8 = i3;
            return limit.copy(equityOrderSide, str, z, i, i7, i8, function22, dayNightOverlay2, z3, i6);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component10, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowAdtLimitOrderIcon() {
            return this.showAdtLimitOrderIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBuySubtitleRes() {
            return this.buySubtitleRes;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSellSubtitleRes() {
            return this.sellSubtitleRes;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSellShortSubtitleRes() {
            return this.sellShortSubtitleRes;
        }

        public final Function2<Composer, Integer, Unit> component7() {
            return this.headerComposable;
        }

        /* renamed from: component8, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final Limit copy(EquityOrderSide side, String symbol, boolean showAdtLimitOrderIcon, int buySubtitleRes, int sellSubtitleRes, int sellShortSubtitleRes, Function2<? super Composer, ? super Integer, Unit> headerComposable, DayNightOverlay dayNightOverlay, boolean showDivider, int titleRes) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new Limit(side, symbol, showAdtLimitOrderIcon, buySubtitleRes, sellSubtitleRes, sellShortSubtitleRes, headerComposable, dayNightOverlay, showDivider, titleRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return this.side == limit.side && Intrinsics.areEqual(this.symbol, limit.symbol) && this.showAdtLimitOrderIcon == limit.showAdtLimitOrderIcon && this.buySubtitleRes == limit.buySubtitleRes && this.sellSubtitleRes == limit.sellSubtitleRes && this.sellShortSubtitleRes == limit.sellShortSubtitleRes && Intrinsics.areEqual(this.headerComposable, limit.headerComposable) && this.dayNightOverlay == limit.dayNightOverlay && this.showDivider == limit.showDivider && this.titleRes == limit.titleRes;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.side.hashCode() * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.showAdtLimitOrderIcon)) * 31) + Integer.hashCode(this.buySubtitleRes)) * 31) + Integer.hashCode(this.sellSubtitleRes)) * 31) + Integer.hashCode(this.sellShortSubtitleRes)) * 31;
            Function2<Composer, Integer, Unit> function2 = this.headerComposable;
            return ((((((iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.showDivider)) * 31) + Integer.hashCode(this.titleRes);
        }

        public String toString() {
            return "Limit(side=" + this.side + ", symbol=" + this.symbol + ", showAdtLimitOrderIcon=" + this.showAdtLimitOrderIcon + ", buySubtitleRes=" + this.buySubtitleRes + ", sellSubtitleRes=" + this.sellSubtitleRes + ", sellShortSubtitleRes=" + this.sellShortSubtitleRes + ", headerComposable=" + this.headerComposable + ", dayNightOverlay=" + this.dayNightOverlay + ", showDivider=" + this.showDivider + ", titleRes=" + this.titleRes + ")";
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean getShowAdtLimitOrderIcon() {
            return this.showAdtLimitOrderIcon;
        }

        public /* synthetic */ Limit(EquityOrderSide equityOrderSide, String str, boolean z, int i, int i2, int i3, Function2 function2, DayNightOverlay dayNightOverlay, boolean z2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderSide, str, z, (i5 & 8) != 0 ? C29312R.string.order_type_limit_order_buy_description : i, (i5 & 16) != 0 ? C29312R.string.order_type_limit_order_sell_description : i2, (i5 & 32) != 0 ? C29312R.string.order_type_limit_order_sell_short_description : i3, (i5 & 64) != 0 ? null : function2, dayNightOverlay, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? C29312R.string.order_type_limit_title : i4);
        }

        public final int getBuySubtitleRes() {
            return this.buySubtitleRes;
        }

        public final int getSellSubtitleRes() {
            return this.sellSubtitleRes;
        }

        public final int getSellShortSubtitleRes() {
            return this.sellShortSubtitleRes;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Function2<Composer, Integer, Unit> getHeaderComposable() {
            return this.headerComposable;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public int getTitleRes() {
            return this.titleRes;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public Limit(EquityOrderSide side, String symbol, boolean z, int i, int i2, int i3, Function2<? super Composer, ? super Integer, Unit> function2, DayNightOverlay dayNightOverlay, boolean z2, int i4) {
            int i5;
            int i6;
            int i7;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            int i8 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
            if (i8 == 1) {
                i5 = i;
            } else if (i8 == 2) {
                i5 = i2;
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = i3;
            }
            Integer numValueOf = Integer.valueOf(i5);
            List listListOf = CollectionsKt.listOf(new Either.Left(symbol));
            EquityOrderSide equityOrderSide = EquityOrderSide.BUY;
            if (side == equityOrderSide && z) {
                i6 = C29312R.drawable.svg_limit_order_adt_day_buy;
            } else {
                EquityOrderSide equityOrderSide2 = EquityOrderSide.SELL;
                if (side == equityOrderSide2 && z) {
                    i6 = C29312R.drawable.svg_limit_order_adt_day_sell;
                } else if (side == equityOrderSide && !z) {
                    i6 = C29312R.drawable.svg_limit_order_day_buy;
                } else if (side == EquityOrderSide.SELL_SHORT || (side == equityOrderSide2 && !z)) {
                    i6 = C29312R.drawable.svg_limit_order_day_sell;
                } else {
                    throw new IllegalStateException(("Impossible value: side: " + side + ", showAdtLimitOrderIcon: " + z).toString());
                }
            }
            if (side == equityOrderSide && z) {
                i7 = C29312R.drawable.svg_limit_order_adt_night_buy;
            } else {
                EquityOrderSide equityOrderSide3 = EquityOrderSide.SELL;
                if (side == equityOrderSide3 && z) {
                    i7 = C29312R.drawable.svg_limit_order_adt_night_sell;
                } else if (side == equityOrderSide && !z) {
                    i7 = C29312R.drawable.svg_limit_order_night_buy;
                } else if (side == EquityOrderSide.SELL_SHORT || (side == equityOrderSide3 && !z)) {
                    i7 = C29312R.drawable.svg_limit_order_night_sell;
                } else {
                    throw new IllegalStateException(("Impossible value: side: " + side + ", showAdtLimitOrderIcon: " + z).toString());
                }
            }
            super(i4, numValueOf, function2, null, listListOf, dayNightOverlay, i6, i7, false, z2, false, false, false, 7432, null);
            this.side = side;
            this.symbol = symbol;
            this.showAdtLimitOrderIcon = z;
            this.buySubtitleRes = i;
            this.sellSubtitleRes = i2;
            this.sellShortSubtitleRes = i3;
            this.headerComposable = function2;
            this.dayNightOverlay = dayNightOverlay;
            this.showDivider = z2;
            this.titleRes = i4;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopLoss;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "disabled", "", "symbol", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "showDivider", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;ZLjava/lang/String;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Z)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getDisabled", "()Z", "getSymbol", "()Ljava/lang/String;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getShowDivider", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLoss extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final boolean showDivider;
        private final EquityOrderSide side;
        private final String symbol;

        /* compiled from: OrderConfigurationResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, EquityOrderSide equityOrderSide, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderSide = stopLoss.side;
            }
            if ((i & 2) != 0) {
                z = stopLoss.disabled;
            }
            if ((i & 4) != 0) {
                str = stopLoss.symbol;
            }
            if ((i & 8) != 0) {
                dayNightOverlay = stopLoss.dayNightOverlay;
            }
            if ((i & 16) != 0) {
                z2 = stopLoss.showDivider;
            }
            boolean z3 = z2;
            String str2 = str;
            return stopLoss.copy(equityOrderSide, z, str2, dayNightOverlay, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final StopLoss copy(EquityOrderSide side, boolean disabled, String symbol, DayNightOverlay dayNightOverlay, boolean showDivider) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new StopLoss(side, disabled, symbol, dayNightOverlay, showDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopLoss)) {
                return false;
            }
            StopLoss stopLoss = (StopLoss) other;
            return this.side == stopLoss.side && this.disabled == stopLoss.disabled && Intrinsics.areEqual(this.symbol, stopLoss.symbol) && this.dayNightOverlay == stopLoss.dayNightOverlay && this.showDivider == stopLoss.showDivider;
        }

        public int hashCode() {
            return (((((((this.side.hashCode() * 31) + Boolean.hashCode(this.disabled)) * 31) + this.symbol.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.showDivider);
        }

        public String toString() {
            return "StopLoss(side=" + this.side + ", disabled=" + this.disabled + ", symbol=" + this.symbol + ", dayNightOverlay=" + this.dayNightOverlay + ", showDivider=" + this.showDivider + ")";
        }

        public /* synthetic */ StopLoss(EquityOrderSide equityOrderSide, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderSide, z, str, dayNightOverlay, (i & 16) != 0 ? false : z2);
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StopLoss(EquityOrderSide side, boolean z, String symbol, DayNightOverlay dayNightOverlay, boolean z2) {
            int i;
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            int i4 = C29312R.string.order_type_stop_title;
            int i5 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
            if (i5 == 1) {
                i = C29312R.string.order_type_stop_order_buy_description;
            } else if (i5 == 2) {
                i = C29312R.string.order_type_stop_order_sell_description_collaring_member;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C29312R.string.order_type_stop_order_sell_short_description;
            }
            Integer numValueOf = Integer.valueOf(i);
            List listListOf = CollectionsKt.listOf(new Either.Left(symbol));
            if (z && side == EquityOrderSide.BUY) {
                i2 = C29312R.drawable.svg_stop_order_disabled_buy;
            } else if (z && side == EquityOrderSide.SELL) {
                i2 = C29312R.drawable.svg_stop_order_disabled_sell;
            } else if (side == EquityOrderSide.BUY) {
                i2 = C29312R.drawable.svg_stop_order_day_buy;
            } else {
                if (side != EquityOrderSide.SELL_SHORT && side != EquityOrderSide.SELL) {
                    throw new IllegalStateException("Impossible.");
                }
                i2 = C29312R.drawable.svg_stop_order_day_sell;
            }
            if (z && side == EquityOrderSide.BUY) {
                i3 = C29312R.drawable.svg_stop_order_disabled_buy;
            } else if (z && side == EquityOrderSide.SELL) {
                i3 = C29312R.drawable.svg_stop_order_disabled_sell;
            } else if (side == EquityOrderSide.BUY) {
                i3 = C29312R.drawable.svg_stop_order_night_buy;
            } else {
                if (side != EquityOrderSide.SELL_SHORT && side != EquityOrderSide.SELL) {
                    throw new IllegalStateException("Impossible.");
                }
                i3 = C29312R.drawable.svg_stop_order_night_sell;
            }
            int i6 = i3;
            super(i4, numValueOf, null, null, listListOf, dayNightOverlay, i2, i6, z, z2, false, false, false, 7180, null);
            this.side = side;
            this.disabled = z;
            this.symbol = symbol;
            this.dayNightOverlay = dayNightOverlay;
            this.showDivider = z2;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003Jj\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopLimit;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "disabled", "", "symbol", "", "buySubtitleRes", "", "sellSubtitleRes", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "disabledTextRes", "showDivider", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;ZLjava/lang/String;IILcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/lang/Integer;ZI)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getDisabled", "()Z", "getSymbol", "()Ljava/lang/String;", "getBuySubtitleRes", "()I", "getSellSubtitleRes", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDisabledTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowDivider", "getTitleRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/robinhood/models/db/EquityOrderSide;ZLjava/lang/String;IILcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/lang/Integer;ZI)Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopLimit;", "equals", "other", "", "hashCode", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLimit extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final int buySubtitleRes;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final Integer disabledTextRes;
        private final int sellSubtitleRes;
        private final boolean showDivider;
        private final EquityOrderSide side;
        private final String symbol;
        private final int titleRes;

        public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, EquityOrderSide equityOrderSide, boolean z, String str, int i, int i2, DayNightOverlay dayNightOverlay, Integer num, boolean z2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                equityOrderSide = stopLimit.side;
            }
            if ((i4 & 2) != 0) {
                z = stopLimit.disabled;
            }
            if ((i4 & 4) != 0) {
                str = stopLimit.symbol;
            }
            if ((i4 & 8) != 0) {
                i = stopLimit.buySubtitleRes;
            }
            if ((i4 & 16) != 0) {
                i2 = stopLimit.sellSubtitleRes;
            }
            if ((i4 & 32) != 0) {
                dayNightOverlay = stopLimit.dayNightOverlay;
            }
            if ((i4 & 64) != 0) {
                num = stopLimit.disabledTextRes;
            }
            if ((i4 & 128) != 0) {
                z2 = stopLimit.showDivider;
            }
            if ((i4 & 256) != 0) {
                i3 = stopLimit.titleRes;
            }
            boolean z3 = z2;
            int i5 = i3;
            DayNightOverlay dayNightOverlay2 = dayNightOverlay;
            Integer num2 = num;
            int i6 = i2;
            String str2 = str;
            return stopLimit.copy(equityOrderSide, z, str2, i, i6, dayNightOverlay2, num2, z3, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBuySubtitleRes() {
            return this.buySubtitleRes;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSellSubtitleRes() {
            return this.sellSubtitleRes;
        }

        /* renamed from: component6, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getDisabledTextRes() {
            return this.disabledTextRes;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        /* renamed from: component9, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public final StopLimit copy(EquityOrderSide side, boolean disabled, String symbol, int buySubtitleRes, int sellSubtitleRes, DayNightOverlay dayNightOverlay, Integer disabledTextRes, boolean showDivider, int titleRes) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new StopLimit(side, disabled, symbol, buySubtitleRes, sellSubtitleRes, dayNightOverlay, disabledTextRes, showDivider, titleRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopLimit)) {
                return false;
            }
            StopLimit stopLimit = (StopLimit) other;
            return this.side == stopLimit.side && this.disabled == stopLimit.disabled && Intrinsics.areEqual(this.symbol, stopLimit.symbol) && this.buySubtitleRes == stopLimit.buySubtitleRes && this.sellSubtitleRes == stopLimit.sellSubtitleRes && this.dayNightOverlay == stopLimit.dayNightOverlay && Intrinsics.areEqual(this.disabledTextRes, stopLimit.disabledTextRes) && this.showDivider == stopLimit.showDivider && this.titleRes == stopLimit.titleRes;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.side.hashCode() * 31) + Boolean.hashCode(this.disabled)) * 31) + this.symbol.hashCode()) * 31) + Integer.hashCode(this.buySubtitleRes)) * 31) + Integer.hashCode(this.sellSubtitleRes)) * 31) + this.dayNightOverlay.hashCode()) * 31;
            Integer num = this.disabledTextRes;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.showDivider)) * 31) + Integer.hashCode(this.titleRes);
        }

        public String toString() {
            return "StopLimit(side=" + this.side + ", disabled=" + this.disabled + ", symbol=" + this.symbol + ", buySubtitleRes=" + this.buySubtitleRes + ", sellSubtitleRes=" + this.sellSubtitleRes + ", dayNightOverlay=" + this.dayNightOverlay + ", disabledTextRes=" + this.disabledTextRes + ", showDivider=" + this.showDivider + ", titleRes=" + this.titleRes + ")";
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public /* synthetic */ StopLimit(EquityOrderSide equityOrderSide, boolean z, String str, int i, int i2, DayNightOverlay dayNightOverlay, Integer num, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderSide, z, str, (i4 & 8) != 0 ? C29312R.string.order_type_stop_limit_order_buy_description : i, (i4 & 16) != 0 ? C29312R.string.order_type_stop_limit_order_sell_description : i2, dayNightOverlay, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? false : z2, (i4 & 256) != 0 ? C29312R.string.order_type_stop_limit_title : i3);
        }

        public final int getBuySubtitleRes() {
            return this.buySubtitleRes;
        }

        public final int getSellSubtitleRes() {
            return this.sellSubtitleRes;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        public final Integer getDisabledTextRes() {
            return this.disabledTextRes;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public int getTitleRes() {
            return this.titleRes;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StopLimit(EquityOrderSide side, boolean z, String symbol, int i, int i2, DayNightOverlay dayNightOverlay, Integer num, boolean z2, int i3) {
            int iIntValue;
            int i4;
            int i5;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            if (z && num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = side == EquityOrderSide.BUY ? i : i2;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            List listListOf = CollectionsKt.listOf(new Either.Left(symbol));
            if (z && side == EquityOrderSide.BUY) {
                i4 = C29312R.drawable.svg_stop_limit_order_disabled_buy;
            } else if (z && side == EquityOrderSide.SELL) {
                i4 = C29312R.drawable.svg_stop_limit_order_disabled_sell;
            } else if (side == EquityOrderSide.BUY) {
                i4 = C29312R.drawable.svg_stop_limit_order_day_buy;
            } else {
                if (side != EquityOrderSide.SELL) {
                    throw new IllegalStateException("Impossible.");
                }
                i4 = C29312R.drawable.svg_stop_limit_order_day_sell;
            }
            int i6 = i4;
            if (z && side == EquityOrderSide.BUY) {
                i5 = C29312R.drawable.svg_stop_limit_order_disabled_buy;
            } else if (z && side == EquityOrderSide.SELL) {
                i5 = C29312R.drawable.svg_stop_limit_order_disabled_sell;
            } else if (side == EquityOrderSide.BUY) {
                i5 = C29312R.drawable.svg_stop_limit_order_night_buy;
            } else {
                if (side != EquityOrderSide.SELL) {
                    throw new IllegalStateException("Impossible.");
                }
                i5 = C29312R.drawable.svg_stop_limit_order_night_sell;
            }
            super(i3, numValueOf, null, null, listListOf, dayNightOverlay, i6, i5, z, z2, false, false, false, 7180, null);
            this.side = side;
            this.disabled = z;
            this.symbol = symbol;
            this.buySubtitleRes = i;
            this.sellSubtitleRes = i2;
            this.dayNightOverlay = dayNightOverlay;
            this.disabledTextRes = num;
            this.showDivider = z2;
            this.titleRes = i3;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJl\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010*R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001cR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b3\u0010\u001c¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopMarket;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "subtitleRes", "", "", "subtitleArgs", "", "disabled", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "dayNightOverlay", "Lkotlin/Function0;", "", "headerComposable", "footerComposable", "<init>", "(IILjava/util/List;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "component6", "()Lkotlin/jvm/functions/Function2;", "component7", "copy", "(IILjava/util/List;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$StopMarket;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTitleRes", "getSubtitleRes", "()Ljava/lang/Integer;", "Ljava/util/List;", "getSubtitleArgs", "Z", "getDisabled", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "Lkotlin/jvm/functions/Function2;", "getHeaderComposable", "getFooterComposable", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class StopMarket extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final Function2<Composer, Integer, Unit> footerComposable;
        private final Function2<Composer, Integer, Unit> headerComposable;
        private final List<String> subtitleArgs;
        private final int subtitleRes;
        private final int titleRes;

        public static /* synthetic */ StopMarket copy$default(StopMarket stopMarket, int i, int i2, List list, boolean z, DayNightOverlay dayNightOverlay, Function2 function2, Function2 function22, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = stopMarket.titleRes;
            }
            if ((i3 & 2) != 0) {
                i2 = stopMarket.subtitleRes;
            }
            if ((i3 & 4) != 0) {
                list = stopMarket.subtitleArgs;
            }
            if ((i3 & 8) != 0) {
                z = stopMarket.disabled;
            }
            if ((i3 & 16) != 0) {
                dayNightOverlay = stopMarket.dayNightOverlay;
            }
            if ((i3 & 32) != 0) {
                function2 = stopMarket.headerComposable;
            }
            if ((i3 & 64) != 0) {
                function22 = stopMarket.footerComposable;
            }
            Function2 function23 = function2;
            Function2 function24 = function22;
            DayNightOverlay dayNightOverlay2 = dayNightOverlay;
            List list2 = list;
            return stopMarket.copy(i, i2, list2, z, dayNightOverlay2, function23, function24);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSubtitleRes() {
            return this.subtitleRes;
        }

        public final List<String> component3() {
            return this.subtitleArgs;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component5, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        public final Function2<Composer, Integer, Unit> component6() {
            return this.headerComposable;
        }

        public final Function2<Composer, Integer, Unit> component7() {
            return this.footerComposable;
        }

        public final StopMarket copy(int titleRes, int subtitleRes, List<String> subtitleArgs, boolean disabled, DayNightOverlay dayNightOverlay, Function2<? super Composer, ? super Integer, Unit> headerComposable, Function2<? super Composer, ? super Integer, Unit> footerComposable) {
            Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new StopMarket(titleRes, subtitleRes, subtitleArgs, disabled, dayNightOverlay, headerComposable, footerComposable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopMarket)) {
                return false;
            }
            StopMarket stopMarket = (StopMarket) other;
            return this.titleRes == stopMarket.titleRes && this.subtitleRes == stopMarket.subtitleRes && Intrinsics.areEqual(this.subtitleArgs, stopMarket.subtitleArgs) && this.disabled == stopMarket.disabled && this.dayNightOverlay == stopMarket.dayNightOverlay && Intrinsics.areEqual(this.headerComposable, stopMarket.headerComposable) && Intrinsics.areEqual(this.footerComposable, stopMarket.footerComposable);
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.subtitleRes)) * 31) + this.subtitleArgs.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + this.dayNightOverlay.hashCode()) * 31;
            Function2<Composer, Integer, Unit> function2 = this.headerComposable;
            int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function22 = this.footerComposable;
            return iHashCode2 + (function22 != null ? function22.hashCode() : 0);
        }

        public String toString() {
            return "StopMarket(titleRes=" + this.titleRes + ", subtitleRes=" + this.subtitleRes + ", subtitleArgs=" + this.subtitleArgs + ", disabled=" + this.disabled + ", dayNightOverlay=" + this.dayNightOverlay + ", headerComposable=" + this.headerComposable + ", footerComposable=" + this.footerComposable + ")";
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public int getTitleRes() {
            return this.titleRes;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Integer getSubtitleRes() {
            return Integer.valueOf(this.subtitleRes);
        }

        public /* synthetic */ StopMarket(int i, int i2, List list, boolean z, DayNightOverlay dayNightOverlay, Function2 function2, Function2 function22, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? CollectionsKt.emptyList() : list, z, dayNightOverlay, function2, function22);
        }

        public final List<String> getSubtitleArgs() {
            return this.subtitleArgs;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Function2<Composer, Integer, Unit> getHeaderComposable() {
            return this.headerComposable;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Function2<Composer, Integer, Unit> getFooterComposable() {
            return this.footerComposable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StopMarket(int i, int i2, List<String> subtitleArgs, boolean z, DayNightOverlay dayNightOverlay, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            int i3;
            int i4;
            Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            List<String> list = subtitleArgs;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Either.Left((String) it.next()));
            }
            if (z) {
                i3 = C29312R.drawable.svg_stop_order_disabled_sell;
            } else {
                i3 = C29312R.drawable.svg_stop_order_day_sell;
            }
            int i5 = i3;
            if (z) {
                i4 = C29312R.drawable.svg_stop_order_disabled_sell;
            } else {
                i4 = C29312R.drawable.svg_stop_order_night_sell;
            }
            super(i, Integer.valueOf(i2), function2, function22, arrayList, dayNightOverlay, i5, i4, z, true, false, false, false, 7168, null);
            this.titleRes = i;
            this.subtitleRes = i2;
            this.subtitleArgs = subtitleArgs;
            this.disabled = z;
            this.dayNightOverlay = dayNightOverlay;
            this.headerComposable = function2;
            this.footerComposable = function22;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJl\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010*R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001cR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b3\u0010\u001c¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$OptionMarket;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "subtitleRes", "", "", "subtitleArgs", "", "disabled", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "dayNightOverlay", "Lkotlin/Function0;", "", "headerComposable", "footerComposable", "<init>", "(IILjava/util/List;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "component6", "()Lkotlin/jvm/functions/Function2;", "component7", "copy", "(IILjava/util/List;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$OptionMarket;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTitleRes", "getSubtitleRes", "()Ljava/lang/Integer;", "Ljava/util/List;", "getSubtitleArgs", "Z", "getDisabled", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "Lkotlin/jvm/functions/Function2;", "getHeaderComposable", "getFooterComposable", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class OptionMarket extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final Function2<Composer, Integer, Unit> footerComposable;
        private final Function2<Composer, Integer, Unit> headerComposable;
        private final List<String> subtitleArgs;
        private final int subtitleRes;
        private final int titleRes;

        public static /* synthetic */ OptionMarket copy$default(OptionMarket optionMarket, int i, int i2, List list, boolean z, DayNightOverlay dayNightOverlay, Function2 function2, Function2 function22, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = optionMarket.titleRes;
            }
            if ((i3 & 2) != 0) {
                i2 = optionMarket.subtitleRes;
            }
            if ((i3 & 4) != 0) {
                list = optionMarket.subtitleArgs;
            }
            if ((i3 & 8) != 0) {
                z = optionMarket.disabled;
            }
            if ((i3 & 16) != 0) {
                dayNightOverlay = optionMarket.dayNightOverlay;
            }
            if ((i3 & 32) != 0) {
                function2 = optionMarket.headerComposable;
            }
            if ((i3 & 64) != 0) {
                function22 = optionMarket.footerComposable;
            }
            Function2 function23 = function2;
            Function2 function24 = function22;
            DayNightOverlay dayNightOverlay2 = dayNightOverlay;
            List list2 = list;
            return optionMarket.copy(i, i2, list2, z, dayNightOverlay2, function23, function24);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSubtitleRes() {
            return this.subtitleRes;
        }

        public final List<String> component3() {
            return this.subtitleArgs;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component5, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        public final Function2<Composer, Integer, Unit> component6() {
            return this.headerComposable;
        }

        public final Function2<Composer, Integer, Unit> component7() {
            return this.footerComposable;
        }

        public final OptionMarket copy(int titleRes, int subtitleRes, List<String> subtitleArgs, boolean disabled, DayNightOverlay dayNightOverlay, Function2<? super Composer, ? super Integer, Unit> headerComposable, Function2<? super Composer, ? super Integer, Unit> footerComposable) {
            Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new OptionMarket(titleRes, subtitleRes, subtitleArgs, disabled, dayNightOverlay, headerComposable, footerComposable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionMarket)) {
                return false;
            }
            OptionMarket optionMarket = (OptionMarket) other;
            return this.titleRes == optionMarket.titleRes && this.subtitleRes == optionMarket.subtitleRes && Intrinsics.areEqual(this.subtitleArgs, optionMarket.subtitleArgs) && this.disabled == optionMarket.disabled && this.dayNightOverlay == optionMarket.dayNightOverlay && Intrinsics.areEqual(this.headerComposable, optionMarket.headerComposable) && Intrinsics.areEqual(this.footerComposable, optionMarket.footerComposable);
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.subtitleRes)) * 31) + this.subtitleArgs.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + this.dayNightOverlay.hashCode()) * 31;
            Function2<Composer, Integer, Unit> function2 = this.headerComposable;
            int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function22 = this.footerComposable;
            return iHashCode2 + (function22 != null ? function22.hashCode() : 0);
        }

        public String toString() {
            return "OptionMarket(titleRes=" + this.titleRes + ", subtitleRes=" + this.subtitleRes + ", subtitleArgs=" + this.subtitleArgs + ", disabled=" + this.disabled + ", dayNightOverlay=" + this.dayNightOverlay + ", headerComposable=" + this.headerComposable + ", footerComposable=" + this.footerComposable + ")";
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public int getTitleRes() {
            return this.titleRes;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Integer getSubtitleRes() {
            return Integer.valueOf(this.subtitleRes);
        }

        public /* synthetic */ OptionMarket(int i, int i2, List list, boolean z, DayNightOverlay dayNightOverlay, Function2 function2, Function2 function22, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? CollectionsKt.emptyList() : list, z, dayNightOverlay, function2, function22);
        }

        public final List<String> getSubtitleArgs() {
            return this.subtitleArgs;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Function2<Composer, Integer, Unit> getHeaderComposable() {
            return this.headerComposable;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public Function2<Composer, Integer, Unit> getFooterComposable() {
            return this.footerComposable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OptionMarket(int i, int i2, List<String> subtitleArgs, boolean z, DayNightOverlay dayNightOverlay, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            int i3;
            int i4;
            Intrinsics.checkNotNullParameter(subtitleArgs, "subtitleArgs");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            List<String> list = subtitleArgs;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Either.Left((String) it.next()));
            }
            if (z) {
                i3 = C29312R.drawable.svg_option_market_disabled;
            } else {
                i3 = C29312R.drawable.svg_option_market_day;
            }
            int i5 = i3;
            if (z) {
                i4 = C29312R.drawable.svg_option_market_disabled;
            } else {
                i4 = C29312R.drawable.svg_option_market_night;
            }
            super(i, Integer.valueOf(i2), function2, function22, arrayList, dayNightOverlay, i5, i4, z, true, false, false, false, 7168, null);
            this.titleRes = i;
            this.subtitleRes = i2;
            this.subtitleArgs = subtitleArgs;
            this.disabled = z;
            this.dayNightOverlay = dayNightOverlay;
            this.headerComposable = function2;
            this.footerComposable = function22;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$TrailingStop;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "disabled", "", "symbol", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "showDivider", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;ZLjava/lang/String;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Z)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getDisabled", "()Z", "getSymbol", "()Ljava/lang/String;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getShowDivider", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TrailingStop extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final boolean showDivider;
        private final EquityOrderSide side;
        private final String symbol;

        public static /* synthetic */ TrailingStop copy$default(TrailingStop trailingStop, EquityOrderSide equityOrderSide, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderSide = trailingStop.side;
            }
            if ((i & 2) != 0) {
                z = trailingStop.disabled;
            }
            if ((i & 4) != 0) {
                str = trailingStop.symbol;
            }
            if ((i & 8) != 0) {
                dayNightOverlay = trailingStop.dayNightOverlay;
            }
            if ((i & 16) != 0) {
                z2 = trailingStop.showDivider;
            }
            boolean z3 = z2;
            String str2 = str;
            return trailingStop.copy(equityOrderSide, z, str2, dayNightOverlay, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        public final TrailingStop copy(EquityOrderSide side, boolean disabled, String symbol, DayNightOverlay dayNightOverlay, boolean showDivider) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new TrailingStop(side, disabled, symbol, dayNightOverlay, showDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailingStop)) {
                return false;
            }
            TrailingStop trailingStop = (TrailingStop) other;
            return this.side == trailingStop.side && this.disabled == trailingStop.disabled && Intrinsics.areEqual(this.symbol, trailingStop.symbol) && this.dayNightOverlay == trailingStop.dayNightOverlay && this.showDivider == trailingStop.showDivider;
        }

        public int hashCode() {
            return (((((((this.side.hashCode() * 31) + Boolean.hashCode(this.disabled)) * 31) + this.symbol.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.showDivider);
        }

        public String toString() {
            return "TrailingStop(side=" + this.side + ", disabled=" + this.disabled + ", symbol=" + this.symbol + ", dayNightOverlay=" + this.dayNightOverlay + ", showDivider=" + this.showDivider + ")";
        }

        public /* synthetic */ TrailingStop(EquityOrderSide equityOrderSide, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderSide, z, str, dayNightOverlay, (i & 16) != 0 ? false : z2);
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TrailingStop(EquityOrderSide side, boolean z, String symbol, DayNightOverlay dayNightOverlay, boolean z2) {
            int i;
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            int i4 = C29312R.string.order_type_trailing_stop_title;
            EquityOrderSide equityOrderSide = EquityOrderSide.BUY;
            if (side == equityOrderSide) {
                i = C29312R.string.order_type_trailing_stop_order_buy_description;
            } else {
                i = C29312R.string.order_type_trailing_stop_order_sell_description_collaring_member;
            }
            Integer numValueOf = Integer.valueOf(i);
            List listListOf = CollectionsKt.listOf(new Either.Left(symbol));
            if (z && side == equityOrderSide) {
                i2 = C29312R.drawable.svg_trailing_stop_order_disabled_buy;
            } else if (z && side == EquityOrderSide.SELL) {
                i2 = C29312R.drawable.svg_trailing_stop_order_disabled_sell;
            } else if (side == equityOrderSide) {
                i2 = C29312R.drawable.svg_trailing_stop_order_day_buy;
            } else {
                if (side != EquityOrderSide.SELL) {
                    throw new IllegalStateException("Impossible.");
                }
                i2 = C29312R.drawable.svg_trailing_stop_order_day_sell;
            }
            if (z && side == equityOrderSide) {
                i3 = C29312R.drawable.svg_trailing_stop_order_disabled_buy;
            } else if (z && side == EquityOrderSide.SELL) {
                i3 = C29312R.drawable.svg_trailing_stop_order_disabled_sell;
            } else if (side == equityOrderSide) {
                i3 = C29312R.drawable.svg_trailing_stop_order_night_buy;
            } else {
                if (side != EquityOrderSide.SELL) {
                    throw new IllegalStateException("Impossible.");
                }
                i3 = C29312R.drawable.svg_trailing_stop_order_night_sell;
            }
            int i5 = i2;
            int i6 = i3;
            super(i4, numValueOf, null, null, listListOf, dayNightOverlay, i5, i6, z, z2, false, false, false, 7180, null);
            this.side = side;
            this.disabled = z;
            this.symbol = symbol;
            this.dayNightOverlay = dayNightOverlay;
            this.showDivider = z2;
        }
    }

    /* compiled from: OrderConfigurationResource.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationResource$Recurring;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "disabled", "", "symbol", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "showDivider", "account", "Lcom/robinhood/models/db/Account;", "shouldShowComingSoon", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZLcom/robinhood/models/db/Account;Z)V", "getDisabled", "()Z", "getSymbol", "()Ljava/lang/String;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getShowDivider", "getAccount", "()Lcom/robinhood/models/db/Account;", "getShouldShowComingSoon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Recurring extends OrderConfigurationResource {
        public static final int $stable = 8;
        private final Account account;
        private final DayNightOverlay dayNightOverlay;
        private final boolean disabled;
        private final boolean shouldShowComingSoon;
        private final boolean showDivider;
        private final String symbol;

        public static /* synthetic */ Recurring copy$default(Recurring recurring, boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, Account account, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = recurring.disabled;
            }
            if ((i & 2) != 0) {
                str = recurring.symbol;
            }
            if ((i & 4) != 0) {
                dayNightOverlay = recurring.dayNightOverlay;
            }
            if ((i & 8) != 0) {
                z2 = recurring.showDivider;
            }
            if ((i & 16) != 0) {
                account = recurring.account;
            }
            if ((i & 32) != 0) {
                z3 = recurring.shouldShowComingSoon;
            }
            Account account2 = account;
            boolean z4 = z3;
            return recurring.copy(z, str, dayNightOverlay, z2, account2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowDivider() {
            return this.showDivider;
        }

        /* renamed from: component5, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldShowComingSoon() {
            return this.shouldShowComingSoon;
        }

        public final Recurring copy(boolean disabled, String symbol, DayNightOverlay dayNightOverlay, boolean showDivider, Account account, boolean shouldShowComingSoon) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            Intrinsics.checkNotNullParameter(account, "account");
            return new Recurring(disabled, symbol, dayNightOverlay, showDivider, account, shouldShowComingSoon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recurring)) {
                return false;
            }
            Recurring recurring = (Recurring) other;
            return this.disabled == recurring.disabled && Intrinsics.areEqual(this.symbol, recurring.symbol) && this.dayNightOverlay == recurring.dayNightOverlay && this.showDivider == recurring.showDivider && Intrinsics.areEqual(this.account, recurring.account) && this.shouldShowComingSoon == recurring.shouldShowComingSoon;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.disabled) * 31) + this.symbol.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.showDivider)) * 31) + this.account.hashCode()) * 31) + Boolean.hashCode(this.shouldShowComingSoon);
        }

        public String toString() {
            return "Recurring(disabled=" + this.disabled + ", symbol=" + this.symbol + ", dayNightOverlay=" + this.dayNightOverlay + ", showDivider=" + this.showDivider + ", account=" + this.account + ", shouldShowComingSoon=" + this.shouldShowComingSoon + ")";
        }

        public /* synthetic */ Recurring(boolean z, String str, DayNightOverlay dayNightOverlay, boolean z2, Account account, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, dayNightOverlay, (i & 8) != 0 ? false : z2, account, z3);
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getDisabled() {
            return this.disabled;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationResource
        public boolean getShowDivider() {
            return this.showDivider;
        }

        public final Account getAccount() {
            return this.account;
        }

        public final boolean getShouldShowComingSoon() {
            return this.shouldShowComingSoon;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Recurring(boolean z, String symbol, DayNightOverlay dayNightOverlay, boolean z2, Account account, boolean z3) {
            int i;
            List listListOf;
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            Intrinsics.checkNotNullParameter(account, "account");
            int i4 = C29312R.string.order_type_recurring_order_title;
            if (z3) {
                i = C29312R.string.order_type_recurring_order_buy_coming_soon_description;
            } else {
                i = C29312R.string.order_type_recurring_order_buy_description;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (z3) {
                listListOf = CollectionsKt.listOf(new Either.Right(AccountDisplayNames.getDisplayName(account).getWithAccount().getInSentence()));
            } else {
                listListOf = CollectionsKt.listOf(new Either.Left(symbol));
            }
            List list = listListOf;
            if (!z) {
                i2 = C11048R.drawable.svg_recurring_order_day;
            } else {
                i2 = C11048R.drawable.svg_recurring_order_disabled;
            }
            int i5 = i2;
            if (!z) {
                i3 = C11048R.drawable.svg_recurring_order_night;
            } else {
                i3 = C11048R.drawable.svg_recurring_order_disabled;
            }
            int i6 = i3;
            super(i4, numValueOf, null, null, list, dayNightOverlay, i5, i6, z, z2, false, false, false, 7180, null);
            this.disabled = z;
            this.symbol = symbol;
            this.dayNightOverlay = dayNightOverlay;
            this.showDivider = z2;
            this.account = account;
            this.shouldShowComingSoon = z3;
        }
    }
}
