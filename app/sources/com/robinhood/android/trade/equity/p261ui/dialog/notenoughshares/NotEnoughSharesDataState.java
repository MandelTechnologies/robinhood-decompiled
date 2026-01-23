package com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.datetime.format.DayOfWeekFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.DayOfWeek;
import p479j$.time.LocalDate;

/* compiled from: NotEnoughSharesDataState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\n\u00105\u001a\u0004\u0018\u00010%H\u0002J\n\u00106\u001a\u0004\u0018\u00010%H\u0002J\t\u00107\u001a\u00020\u0003HÂ\u0003J\t\u00108\u001a\u00020\u0005HÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010:\u001a\u00020\tHÂ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b<J?\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010>\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020)HÖ\u0001J\t\u0010A\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00103\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b4\u0010'¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDataState;", "", "position", "Lcom/robinhood/models/db/Position;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "isDollarBasedAmount", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "<init>", "(Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/models/db/MarketHours;)V", "getMarketHours$feature_trade_equity_externalDebug", "()Lcom/robinhood/models/db/MarketHours;", "notEnoughSharesRows", "", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesRowViewState;", "getNotEnoughSharesRows", "()Ljava/util/List;", "sellableShares", "Ljava/math/BigDecimal;", "totalSellableShares", "", "getTotalSellableShares", "()Ljava/lang/String;", "showTotalSellableShares", "getShowTotalSellableShares", "()Z", "showPendingOrderButton", "getShowPendingOrderButton", "showSellAllButton", "getShowSellAllButton", "hasNoSellableShares", "getHasNoSellableShares", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "Lcom/robinhood/utils/resource/StringResource;", "getTitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "zeroSellableDollarAmountMultipleReasonsRes", "", "zeroSellableDollarAmountRes", "zeroSellableSharesRes", "nonZeroSellableAmountMultipleReasonsRes", "nonZeroSellableDollarAmountRes", "nonZeroSellableSharesAmountRes", "sellableString", "heldSharesString", "availableDate", "sellableAmount", "dialogMessageRes", "getDialogMessageRes", "getZeroSellableString", "getNonZeroSellableString", "component1", "component2", "component3", "component4", "component5", "component5$feature_trade_equity_externalDebug", "copy", "equals", "other", "hashCode", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class NotEnoughSharesDataState {
    public static final int $stable = 8;
    private final String availableDate;
    private final boolean hasNoSellableShares;
    private final String heldSharesString;
    private final Instrument instrument;
    private final boolean isDollarBasedAmount;
    private final MarketHours marketHours;
    private final int nonZeroSellableAmountMultipleReasonsRes;
    private final int nonZeroSellableDollarAmountRes;
    private final int nonZeroSellableSharesAmountRes;
    private final List<NotEnoughSharesRowViewState> notEnoughSharesRows;
    private final Position position;
    private final Quote quote;
    private final String sellableAmount;
    private final BigDecimal sellableShares;
    private final String sellableString;
    private final boolean showPendingOrderButton;
    private final boolean showSellAllButton;
    private final boolean showTotalSellableShares;
    private final StringResource titleRes;
    private final String totalSellableShares;
    private final int zeroSellableDollarAmountMultipleReasonsRes;
    private final int zeroSellableDollarAmountRes;
    private final int zeroSellableSharesRes;

    /* renamed from: component1, reason: from getter */
    private final Position getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component3, reason: from getter */
    private final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsDollarBasedAmount() {
        return this.isDollarBasedAmount;
    }

    public static /* synthetic */ NotEnoughSharesDataState copy$default(NotEnoughSharesDataState notEnoughSharesDataState, Position position, Instrument instrument, Quote quote, boolean z, MarketHours marketHours, int i, Object obj) {
        if ((i & 1) != 0) {
            position = notEnoughSharesDataState.position;
        }
        if ((i & 2) != 0) {
            instrument = notEnoughSharesDataState.instrument;
        }
        if ((i & 4) != 0) {
            quote = notEnoughSharesDataState.quote;
        }
        if ((i & 8) != 0) {
            z = notEnoughSharesDataState.isDollarBasedAmount;
        }
        if ((i & 16) != 0) {
            marketHours = notEnoughSharesDataState.marketHours;
        }
        MarketHours marketHours2 = marketHours;
        Quote quote2 = quote;
        return notEnoughSharesDataState.copy(position, instrument, quote2, z, marketHours2);
    }

    /* renamed from: component5$feature_trade_equity_externalDebug, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final NotEnoughSharesDataState copy(Position position, Instrument instrument, Quote quote, boolean isDollarBasedAmount, MarketHours marketHours) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new NotEnoughSharesDataState(position, instrument, quote, isDollarBasedAmount, marketHours);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotEnoughSharesDataState)) {
            return false;
        }
        NotEnoughSharesDataState notEnoughSharesDataState = (NotEnoughSharesDataState) other;
        return Intrinsics.areEqual(this.position, notEnoughSharesDataState.position) && Intrinsics.areEqual(this.instrument, notEnoughSharesDataState.instrument) && Intrinsics.areEqual(this.quote, notEnoughSharesDataState.quote) && this.isDollarBasedAmount == notEnoughSharesDataState.isDollarBasedAmount && Intrinsics.areEqual(this.marketHours, notEnoughSharesDataState.marketHours);
    }

    public int hashCode() {
        int iHashCode = ((this.position.hashCode() * 31) + this.instrument.hashCode()) * 31;
        Quote quote = this.quote;
        int iHashCode2 = (((iHashCode + (quote == null ? 0 : quote.hashCode())) * 31) + Boolean.hashCode(this.isDollarBasedAmount)) * 31;
        MarketHours marketHours = this.marketHours;
        return iHashCode2 + (marketHours != null ? marketHours.hashCode() : 0);
    }

    public String toString() {
        return "NotEnoughSharesDataState(position=" + this.position + ", instrument=" + this.instrument + ", quote=" + this.quote + ", isDollarBasedAmount=" + this.isDollarBasedAmount + ", marketHours=" + this.marketHours + ")";
    }

    public NotEnoughSharesDataState(Position position, Instrument instrument, Quote quote, boolean z, MarketHours marketHours) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        LocalDate nextOpenHours;
        DayOfWeek dayOfWeek;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.position = position;
        this.instrument = instrument;
        this.quote = quote;
        this.isDollarBasedAmount = z;
        this.marketHours = marketHours;
        List<NotEnoughSharesRowViewState> listListOfNotNull = position.hasSharesHeldForMultipleReasons() ? CollectionsKt.listOfNotNull((Object[]) new NotEnoughSharesRowViewState[]{BigDecimals7.isZero(position.getSharesHeldForSells()) ? null : new NotEnoughSharesRowViewState(C29365R.string.not_enough_shares_pending_sells_label, position.getSharesHeldForSells()), BigDecimals7.isZero(position.getSharesHeldForStockGrants()) ? null : new NotEnoughSharesRowViewState(C29365R.string.not_enough_shares_stock_rewards_label, position.getSharesHeldForStockGrants()), BigDecimals7.isZero(position.getSharesHeldForOptionsCollateral()) ? null : new NotEnoughSharesRowViewState(C29365R.string.not_enough_shares_options_collateral_label, position.getSharesHeldForOptionsCollateral()), BigDecimals7.isZero(position.getSharesHeldForOptionsEvents()) ? null : new NotEnoughSharesRowViewState(C29365R.string.not_enough_shares_pending_exercise_label, position.getSharesHeldForOptionsEvents())}) : null;
        this.notEnoughSharesRows = listListOfNotNull;
        BigDecimal closableQuantity = position.getClosableQuantity();
        this.sellableShares = closableQuantity;
        this.totalSellableShares = Formats.getIntegerFormat().format(closableQuantity);
        List<NotEnoughSharesRowViewState> list = listListOfNotNull;
        this.showTotalSellableShares = !(list == null || list.isEmpty());
        this.showPendingOrderButton = BigDecimals7.isPositive(position.getSharesHeldForSells());
        this.showSellAllButton = z && BigDecimals7.isZero(position.getTotalSharesWithheld());
        this.hasNoSellableShares = BigDecimals7.isZero(closableQuantity);
        StringResource.Companion companion = StringResource.INSTANCE;
        if (z) {
            i = C29365R.string.order_create_error_sell_title_dollar_based;
        } else {
            i = BigDecimals7.isPositive(closableQuantity) ? C29365R.string.order_create_error_sell_title : C29365R.string.order_create_error_sell_title_no_shares;
        }
        this.titleRes = companion.invoke(i, new Object[0]);
        if (BigDecimals7.isPositive(position.getSharesHeldForSells())) {
            i2 = C29365R.string.order_create_error_sell_no_amount_has_pending_multiple_reasons;
        } else {
            i2 = C29365R.string.order_create_error_sell_no_amount_no_pending_multiple_reasons;
        }
        this.zeroSellableDollarAmountMultipleReasonsRes = i2;
        if (!BigDecimals7.isZero(position.getTotalSharesWithheld())) {
            BigDecimal totalSharesWithheld = position.getTotalSharesWithheld();
            if (Intrinsics.areEqual(totalSharesWithheld, position.getSharesHeldForOptionsEvents())) {
                i2 = C29365R.string.order_create_error_sell_no_amount_options_events;
            } else if (Intrinsics.areEqual(totalSharesWithheld, position.getSharesHeldForSells())) {
                i2 = C29365R.string.order_create_error_sell_no_amount_pending_orders;
            } else if (Intrinsics.areEqual(totalSharesWithheld, position.getSharesHeldForStockGrants())) {
                i2 = C29365R.string.order_create_error_sell_no_amount_stock_grants;
            }
        }
        this.zeroSellableDollarAmountRes = i2;
        if (BigDecimals7.isZero(position.getTotalSharesWithheld())) {
            i3 = C29365R.string.order_create_error_sell_no_shares_multiple_reasons;
        } else {
            BigDecimal totalSharesWithheld2 = position.getTotalSharesWithheld();
            if (Intrinsics.areEqual(totalSharesWithheld2, position.getSharesHeldForOptionsEvents())) {
                i3 = C29365R.string.gated_options_order_create_error_sell_no_shares_options_events;
            } else if (Intrinsics.areEqual(totalSharesWithheld2, position.getSharesHeldForSells())) {
                i3 = C29365R.string.order_create_error_sell_no_shares_pending_orders;
            } else {
                i3 = Intrinsics.areEqual(totalSharesWithheld2, position.getSharesHeldForStockGrants()) ? C29365R.string.order_create_error_sell_no_shares_stock_grants : C29365R.string.order_create_error_sell_no_shares_multiple_reasons;
            }
        }
        this.zeroSellableSharesRes = i3;
        if (BigDecimals7.isPositive(position.getSharesHeldForSells())) {
            i4 = C29365R.string.order_create_error_sell_some_amount_has_pending_multiple_reasons;
        } else {
            i4 = C29365R.string.order_create_error_sell_some_amount_no_pending_multiple_reasons;
        }
        this.nonZeroSellableAmountMultipleReasonsRes = i4;
        if (!BigDecimals7.isZero(position.getTotalSharesWithheld())) {
            BigDecimal totalSharesWithheld3 = position.getTotalSharesWithheld();
            if (Intrinsics.areEqual(totalSharesWithheld3, position.getSharesHeldForOptionsEvents())) {
                i4 = C29365R.string.order_create_error_sell_some_amount_options_events;
            } else if (Intrinsics.areEqual(totalSharesWithheld3, position.getSharesHeldForSells())) {
                i4 = C29365R.string.order_create_error_sell_some_amount_pending_orders;
            } else if (Intrinsics.areEqual(totalSharesWithheld3, position.getSharesHeldForStockGrants())) {
                i4 = C29365R.string.order_create_error_sell_some_amount_stock_grants;
            }
        }
        this.nonZeroSellableDollarAmountRes = i4;
        if (BigDecimals7.isZero(position.getTotalSharesWithheld())) {
            i5 = C29365R.plurals.order_create_error_sell_some_shares_multiple_reasons;
        } else {
            BigDecimal totalSharesWithheld4 = position.getTotalSharesWithheld();
            if (Intrinsics.areEqual(totalSharesWithheld4, position.getSharesHeldForOptionsEvents())) {
                i5 = C29365R.plurals.order_create_error_sell_some_shares_options_events;
            } else if (Intrinsics.areEqual(totalSharesWithheld4, position.getSharesHeldForSells())) {
                i5 = C29365R.plurals.order_create_error_sell_some_shares_pending_orders;
            } else {
                i5 = Intrinsics.areEqual(totalSharesWithheld4, position.getSharesHeldForStockGrants()) ? C29365R.plurals.order_create_error_sell_some_shares_stock_grants : C29365R.plurals.order_create_error_sell_some_shares_multiple_reasons;
            }
        }
        this.nonZeroSellableSharesAmountRes = i5;
        this.sellableString = Formats.getShareQuantityFormat().format(closableQuantity);
        this.heldSharesString = Formats.getShareQuantityFormat().format(position.getTotalSharesWithheld());
        this.availableDate = (marketHours == null || (nextOpenHours = marketHours.getNextOpenHours()) == null || (dayOfWeek = nextOpenHours.getDayOfWeek()) == null) ? null : DayOfWeekFormatter.LONG.format((DayOfWeekFormatter) dayOfWeek);
        this.sellableAmount = quote != null ? Formats.getPriceFormat().format(position.getSellableAmount(quote).getDecimalValue()) : null;
    }

    public /* synthetic */ NotEnoughSharesDataState(Position position, Instrument instrument, Quote quote, boolean z, MarketHours marketHours, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(position, instrument, (i & 4) != 0 ? null : quote, z, (i & 16) != 0 ? null : marketHours);
    }

    public final MarketHours getMarketHours$feature_trade_equity_externalDebug() {
        return this.marketHours;
    }

    public final List<NotEnoughSharesRowViewState> getNotEnoughSharesRows() {
        return this.notEnoughSharesRows;
    }

    public final String getTotalSellableShares() {
        return this.totalSellableShares;
    }

    public final boolean getShowTotalSellableShares() {
        return this.showTotalSellableShares;
    }

    public final boolean getShowPendingOrderButton() {
        return this.showPendingOrderButton;
    }

    public final boolean getShowSellAllButton() {
        return this.showSellAllButton;
    }

    public final boolean getHasNoSellableShares() {
        return this.hasNoSellableShares;
    }

    public final StringResource getTitleRes() {
        return this.titleRes;
    }

    public final StringResource getDialogMessageRes() {
        if (BigDecimals7.isZero(this.sellableShares)) {
            return getZeroSellableString();
        }
        return getNonZeroSellableString();
    }

    private final StringResource getZeroSellableString() {
        int i;
        String str;
        if (this.isDollarBasedAmount) {
            i = this.zeroSellableDollarAmountRes;
        } else {
            i = this.zeroSellableSharesRes;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        String str2 = this.sellableString;
        String symbol = this.instrument.getSymbol();
        String str3 = this.heldSharesString;
        String str4 = this.availableDate;
        if (str4 == null || (str = this.sellableAmount) == null) {
            return null;
        }
        return companion.invoke(i, str2, symbol, str3, str4, str);
    }

    private final StringResource getNonZeroSellableString() {
        String str;
        if (this.isDollarBasedAmount) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = this.nonZeroSellableDollarAmountRes;
            String str2 = this.sellableString;
            String symbol = this.instrument.getSymbol();
            String str3 = this.heldSharesString;
            String str4 = this.availableDate;
            if (str4 == null || (str = this.sellableAmount) == null) {
                return null;
            }
            return companion.invoke(i, str2, symbol, str3, str4, str);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        StringResource.PluralsResource pluralsResource = new StringResource.PluralsResource(this.nonZeroSellableSharesAmountRes, BigDecimals7.toIntRoundUp(this.sellableShares));
        String str5 = this.sellableString;
        String symbol2 = this.instrument.getSymbol();
        String str6 = this.heldSharesString;
        String str7 = this.availableDate;
        if (str7 == null) {
            return null;
        }
        return companion2.invoke(pluralsResource, str5, symbol2, str6, str7);
    }
}
