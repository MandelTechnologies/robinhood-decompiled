package com.robinhood.android.trade.options.profitloss;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossInfoBarViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JC\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState;", "", "currentProfitLoss", "Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;", "errorToDisplay", "", "infoBarValues", "Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;", "lastRefreshedParams", "Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "loadingState", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState$InfoBarLoadingState;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;Ljava/lang/Throwable;Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState$InfoBarLoadingState;)V", "getCurrentProfitLoss", "()Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;", "getErrorToDisplay", "()Ljava/lang/Throwable;", "getInfoBarValues", "()Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;", "getLastRefreshedParams", "()Lcom/robinhood/android/trade/options/profitloss/UserEnteredProfitLossParams;", "getLoadingState", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState$InfoBarLoadingState;", "caretHidden", "", "getCaretHidden", "()Z", "shouldClearText", "getShouldClearText", "shouldUpdateInfoBarValues", "getShouldUpdateInfoBarValues", "shouldShowExpectedProfitLoss", "getShouldShowExpectedProfitLoss", "textEnabled", "getTextEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "InfoBarLoadingState", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionsProfitLossInfoBarViewState {
    public static final int $stable = 8;
    private final boolean caretHidden;
    private final CurrentProfitLoss currentProfitLoss;
    private final Throwable errorToDisplay;
    private final InfoBarValues infoBarValues;
    private final UserEnteredProfitLossParams lastRefreshedParams;
    private final InfoBarLoadingState loadingState;
    private final boolean shouldClearText;
    private final boolean shouldShowExpectedProfitLoss;
    private final boolean shouldUpdateInfoBarValues;
    private final boolean textEnabled;

    public OptionsProfitLossInfoBarViewState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OptionsProfitLossInfoBarViewState copy$default(OptionsProfitLossInfoBarViewState optionsProfitLossInfoBarViewState, CurrentProfitLoss currentProfitLoss, Throwable th, InfoBarValues infoBarValues, UserEnteredProfitLossParams userEnteredProfitLossParams, InfoBarLoadingState infoBarLoadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            currentProfitLoss = optionsProfitLossInfoBarViewState.currentProfitLoss;
        }
        if ((i & 2) != 0) {
            th = optionsProfitLossInfoBarViewState.errorToDisplay;
        }
        if ((i & 4) != 0) {
            infoBarValues = optionsProfitLossInfoBarViewState.infoBarValues;
        }
        if ((i & 8) != 0) {
            userEnteredProfitLossParams = optionsProfitLossInfoBarViewState.lastRefreshedParams;
        }
        if ((i & 16) != 0) {
            infoBarLoadingState = optionsProfitLossInfoBarViewState.loadingState;
        }
        InfoBarLoadingState infoBarLoadingState2 = infoBarLoadingState;
        InfoBarValues infoBarValues2 = infoBarValues;
        return optionsProfitLossInfoBarViewState.copy(currentProfitLoss, th, infoBarValues2, userEnteredProfitLossParams, infoBarLoadingState2);
    }

    /* renamed from: component1, reason: from getter */
    public final CurrentProfitLoss getCurrentProfitLoss() {
        return this.currentProfitLoss;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getErrorToDisplay() {
        return this.errorToDisplay;
    }

    /* renamed from: component3, reason: from getter */
    public final InfoBarValues getInfoBarValues() {
        return this.infoBarValues;
    }

    /* renamed from: component4, reason: from getter */
    public final UserEnteredProfitLossParams getLastRefreshedParams() {
        return this.lastRefreshedParams;
    }

    /* renamed from: component5, reason: from getter */
    public final InfoBarLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final OptionsProfitLossInfoBarViewState copy(CurrentProfitLoss currentProfitLoss, Throwable errorToDisplay, InfoBarValues infoBarValues, UserEnteredProfitLossParams lastRefreshedParams, InfoBarLoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        return new OptionsProfitLossInfoBarViewState(currentProfitLoss, errorToDisplay, infoBarValues, lastRefreshedParams, loadingState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitLossInfoBarViewState)) {
            return false;
        }
        OptionsProfitLossInfoBarViewState optionsProfitLossInfoBarViewState = (OptionsProfitLossInfoBarViewState) other;
        return Intrinsics.areEqual(this.currentProfitLoss, optionsProfitLossInfoBarViewState.currentProfitLoss) && Intrinsics.areEqual(this.errorToDisplay, optionsProfitLossInfoBarViewState.errorToDisplay) && Intrinsics.areEqual(this.infoBarValues, optionsProfitLossInfoBarViewState.infoBarValues) && Intrinsics.areEqual(this.lastRefreshedParams, optionsProfitLossInfoBarViewState.lastRefreshedParams) && this.loadingState == optionsProfitLossInfoBarViewState.loadingState;
    }

    public int hashCode() {
        CurrentProfitLoss currentProfitLoss = this.currentProfitLoss;
        int iHashCode = (currentProfitLoss == null ? 0 : currentProfitLoss.hashCode()) * 31;
        Throwable th = this.errorToDisplay;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        InfoBarValues infoBarValues = this.infoBarValues;
        int iHashCode3 = (iHashCode2 + (infoBarValues == null ? 0 : infoBarValues.hashCode())) * 31;
        UserEnteredProfitLossParams userEnteredProfitLossParams = this.lastRefreshedParams;
        return ((iHashCode3 + (userEnteredProfitLossParams != null ? userEnteredProfitLossParams.hashCode() : 0)) * 31) + this.loadingState.hashCode();
    }

    public String toString() {
        return "OptionsProfitLossInfoBarViewState(currentProfitLoss=" + this.currentProfitLoss + ", errorToDisplay=" + this.errorToDisplay + ", infoBarValues=" + this.infoBarValues + ", lastRefreshedParams=" + this.lastRefreshedParams + ", loadingState=" + this.loadingState + ")";
    }

    public OptionsProfitLossInfoBarViewState(CurrentProfitLoss currentProfitLoss, Throwable th, InfoBarValues infoBarValues, UserEnteredProfitLossParams userEnteredProfitLossParams, InfoBarLoadingState loadingState) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        this.currentProfitLoss = currentProfitLoss;
        this.errorToDisplay = th;
        this.infoBarValues = infoBarValues;
        this.lastRefreshedParams = userEnteredProfitLossParams;
        this.loadingState = loadingState;
        InfoBarLoadingState infoBarLoadingState = InfoBarLoadingState.INITIAL_LOADING;
        this.caretHidden = loadingState == infoBarLoadingState;
        this.shouldClearText = loadingState == infoBarLoadingState || loadingState == InfoBarLoadingState.ERROR;
        InfoBarLoadingState infoBarLoadingState2 = InfoBarLoadingState.LOADED;
        this.shouldUpdateInfoBarValues = loadingState == infoBarLoadingState2;
        this.shouldShowExpectedProfitLoss = loadingState.getCanShowChart() && currentProfitLoss != null && currentProfitLoss.getScrubbedByUser();
        this.textEnabled = loadingState == InfoBarLoadingState.ERROR || loadingState == infoBarLoadingState2 || loadingState == InfoBarLoadingState.RELOADING;
    }

    public final CurrentProfitLoss getCurrentProfitLoss() {
        return this.currentProfitLoss;
    }

    public final Throwable getErrorToDisplay() {
        return this.errorToDisplay;
    }

    public final InfoBarValues getInfoBarValues() {
        return this.infoBarValues;
    }

    public final UserEnteredProfitLossParams getLastRefreshedParams() {
        return this.lastRefreshedParams;
    }

    public /* synthetic */ OptionsProfitLossInfoBarViewState(CurrentProfitLoss currentProfitLoss, Throwable th, InfoBarValues infoBarValues, UserEnteredProfitLossParams userEnteredProfitLossParams, InfoBarLoadingState infoBarLoadingState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : currentProfitLoss, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : infoBarValues, (i & 8) != 0 ? null : userEnteredProfitLossParams, (i & 16) != 0 ? InfoBarLoadingState.INITIAL_LOADING : infoBarLoadingState);
    }

    public final InfoBarLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final boolean getCaretHidden() {
        return this.caretHidden;
    }

    public final boolean getShouldClearText() {
        return this.shouldClearText;
    }

    public final boolean getShouldUpdateInfoBarValues() {
        return this.shouldUpdateInfoBarValues;
    }

    public final boolean getShouldShowExpectedProfitLoss() {
        return this.shouldShowExpectedProfitLoss;
    }

    public final boolean getTextEnabled() {
        return this.textEnabled;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsProfitLossInfoBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarViewState$InfoBarLoadingState;", "", "canShowChart", "", "<init>", "(Ljava/lang/String;IZ)V", "getCanShowChart", "()Z", "INITIAL_LOADING", "RELOADING", "LOADED", "STALE", "ERROR", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InfoBarLoadingState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoBarLoadingState[] $VALUES;
        private final boolean canShowChart;
        public static final InfoBarLoadingState INITIAL_LOADING = new InfoBarLoadingState("INITIAL_LOADING", 0, false);
        public static final InfoBarLoadingState RELOADING = new InfoBarLoadingState("RELOADING", 1, false);
        public static final InfoBarLoadingState LOADED = new InfoBarLoadingState("LOADED", 2, true);
        public static final InfoBarLoadingState STALE = new InfoBarLoadingState("STALE", 3, true);
        public static final InfoBarLoadingState ERROR = new InfoBarLoadingState("ERROR", 4, false);

        private static final /* synthetic */ InfoBarLoadingState[] $values() {
            return new InfoBarLoadingState[]{INITIAL_LOADING, RELOADING, LOADED, STALE, ERROR};
        }

        public static EnumEntries<InfoBarLoadingState> getEntries() {
            return $ENTRIES;
        }

        private InfoBarLoadingState(String str, int i, boolean z) {
            this.canShowChart = z;
        }

        public final boolean getCanShowChart() {
            return this.canShowChart;
        }

        static {
            InfoBarLoadingState[] infoBarLoadingStateArr$values = $values();
            $VALUES = infoBarLoadingStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoBarLoadingStateArr$values);
        }

        public static InfoBarLoadingState valueOf(String str) {
            return (InfoBarLoadingState) Enum.valueOf(InfoBarLoadingState.class, str);
        }

        public static InfoBarLoadingState[] values() {
            return (InfoBarLoadingState[]) $VALUES.clone();
        }
    }
}
