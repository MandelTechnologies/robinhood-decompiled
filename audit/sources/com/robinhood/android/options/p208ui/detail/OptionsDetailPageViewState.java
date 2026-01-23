package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageViewState.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u000fHÆ\u0003Jd\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0005HÖ\u0001J\t\u0010R\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u00108\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0013\u0010<\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0013\u0010>\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "", "currentAccount", "Lcom/robinhood/models/db/Account;", "currentPage", "", "isDay", "", "pageStates", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageState;", "strategyCodeList", "", "tradebarHeight", "pnlDataState", "Lcom/robinhood/android/options/ui/detail/PnlDataState;", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/lang/Integer;ZLjava/util/List;Ljava/util/List;ILcom/robinhood/android/options/ui/detail/PnlDataState;)V", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getPageStates", "()Ljava/util/List;", "getStrategyCodeList", "getTradebarHeight", "()I", "getPnlDataState", "()Lcom/robinhood/android/options/ui/detail/PnlDataState;", "pageCount", "getPageCount", "currentToolbarState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "getCurrentToolbarState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState;", "currentBodyState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "getCurrentBodyState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "currentTradebarData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "getCurrentTradebarData", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "currentLoggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "getCurrentLoggingState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "currentStrategyCode", "getCurrentStrategyCode", "()Ljava/lang/String;", "currentPageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getCurrentPageDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "currentPageHasRealPosition", "getCurrentPageHasRealPosition", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "currentAccountNumber", "getCurrentAccountNumber", "currentOptionsAccountSwitcherId", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "getCurrentOptionsAccountSwitcherId", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "currentUiOptionPositionState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "getCurrentUiOptionPositionState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageUiOptionPositionState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/db/Account;Ljava/lang/Integer;ZLjava/util/List;Ljava/util/List;ILcom/robinhood/android/options/ui/detail/PnlDataState;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "equals", "other", "hashCode", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageViewState {
    public static final int $stable = 8;
    private final Account currentAccount;
    private final String currentAccountNumber;
    private final OptionsDetailPageBodyState currentBodyState;
    private final OptionsDetailPageLoggingState currentLoggingState;
    private final OptionsAccountSwitcherId currentOptionsAccountSwitcherId;
    private final Integer currentPage;
    private final Direction currentPageDirection;
    private final Boolean currentPageHasRealPosition;
    private final String currentStrategyCode;
    private final OptionsDetailPageToolbarState currentToolbarState;
    private final OptionsDetailPageTradebarDataState.PageSpecificDerivedData currentTradebarData;
    private final OptionsDetailPageUiOptionPositionState currentUiOptionPositionState;
    private final boolean isDay;
    private final int pageCount;
    private final List<OptionsDetailPageState> pageStates;
    private final OptionsDetailPagePnlDataState2 pnlDataState;
    private final List<String> strategyCodeList;
    private final int tradebarHeight;

    public static /* synthetic */ OptionsDetailPageViewState copy$default(OptionsDetailPageViewState optionsDetailPageViewState, Account account, Integer num, boolean z, List list, List list2, int i, OptionsDetailPagePnlDataState2 optionsDetailPagePnlDataState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            account = optionsDetailPageViewState.currentAccount;
        }
        if ((i2 & 2) != 0) {
            num = optionsDetailPageViewState.currentPage;
        }
        if ((i2 & 4) != 0) {
            z = optionsDetailPageViewState.isDay;
        }
        if ((i2 & 8) != 0) {
            list = optionsDetailPageViewState.pageStates;
        }
        if ((i2 & 16) != 0) {
            list2 = optionsDetailPageViewState.strategyCodeList;
        }
        if ((i2 & 32) != 0) {
            i = optionsDetailPageViewState.tradebarHeight;
        }
        if ((i2 & 64) != 0) {
            optionsDetailPagePnlDataState2 = optionsDetailPageViewState.pnlDataState;
        }
        int i3 = i;
        OptionsDetailPagePnlDataState2 optionsDetailPagePnlDataState22 = optionsDetailPagePnlDataState2;
        List list3 = list2;
        boolean z2 = z;
        return optionsDetailPageViewState.copy(account, num, z2, list, list3, i3, optionsDetailPagePnlDataState22);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    public final List<OptionsDetailPageState> component4() {
        return this.pageStates;
    }

    public final List<String> component5() {
        return this.strategyCodeList;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsDetailPagePnlDataState2 getPnlDataState() {
        return this.pnlDataState;
    }

    public final OptionsDetailPageViewState copy(Account currentAccount, Integer currentPage, boolean isDay, List<OptionsDetailPageState> pageStates, List<String> strategyCodeList, int tradebarHeight, OptionsDetailPagePnlDataState2 pnlDataState) {
        Intrinsics.checkNotNullParameter(pageStates, "pageStates");
        Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
        Intrinsics.checkNotNullParameter(pnlDataState, "pnlDataState");
        return new OptionsDetailPageViewState(currentAccount, currentPage, isDay, pageStates, strategyCodeList, tradebarHeight, pnlDataState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageViewState)) {
            return false;
        }
        OptionsDetailPageViewState optionsDetailPageViewState = (OptionsDetailPageViewState) other;
        return Intrinsics.areEqual(this.currentAccount, optionsDetailPageViewState.currentAccount) && Intrinsics.areEqual(this.currentPage, optionsDetailPageViewState.currentPage) && this.isDay == optionsDetailPageViewState.isDay && Intrinsics.areEqual(this.pageStates, optionsDetailPageViewState.pageStates) && Intrinsics.areEqual(this.strategyCodeList, optionsDetailPageViewState.strategyCodeList) && this.tradebarHeight == optionsDetailPageViewState.tradebarHeight && Intrinsics.areEqual(this.pnlDataState, optionsDetailPageViewState.pnlDataState);
    }

    public int hashCode() {
        Account account = this.currentAccount;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        Integer num = this.currentPage;
        return ((((((((((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDay)) * 31) + this.pageStates.hashCode()) * 31) + this.strategyCodeList.hashCode()) * 31) + Integer.hashCode(this.tradebarHeight)) * 31) + this.pnlDataState.hashCode();
    }

    public String toString() {
        return "OptionsDetailPageViewState(currentAccount=" + this.currentAccount + ", currentPage=" + this.currentPage + ", isDay=" + this.isDay + ", pageStates=" + this.pageStates + ", strategyCodeList=" + this.strategyCodeList + ", tradebarHeight=" + this.tradebarHeight + ", pnlDataState=" + this.pnlDataState + ")";
    }

    public OptionsDetailPageViewState(Account account, Integer num, boolean z, List<OptionsDetailPageState> pageStates, List<String> strategyCodeList, int i, OptionsDetailPagePnlDataState2 pnlDataState) {
        OptionsDetailPageState optionsDetailPageState;
        OptionsDetailPageState optionsDetailPageState2;
        OptionsDetailPageState optionsDetailPageState3;
        OptionsDetailPageState optionsDetailPageState4;
        OptionsDetailPageState optionsDetailPageState5;
        OptionsDetailPageState optionsDetailPageState6;
        OptionsDetailPageState optionsDetailPageState7;
        OptionsDetailPageState optionsDetailPageState8;
        Intrinsics.checkNotNullParameter(pageStates, "pageStates");
        Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
        Intrinsics.checkNotNullParameter(pnlDataState, "pnlDataState");
        this.currentAccount = account;
        this.currentPage = num;
        this.isDay = z;
        this.pageStates = pageStates;
        this.strategyCodeList = strategyCodeList;
        this.tradebarHeight = i;
        this.pnlDataState = pnlDataState;
        this.pageCount = pageStates.size();
        OptionsDetailPageUiOptionPositionState uiOptionPositionState = null;
        this.currentToolbarState = (num == null || (optionsDetailPageState8 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState8.getToolbarState();
        this.currentBodyState = (num == null || (optionsDetailPageState7 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState7.getBodyState();
        this.currentTradebarData = (num == null || (optionsDetailPageState6 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState6.getTradebarData();
        this.currentLoggingState = (num == null || (optionsDetailPageState5 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState5.getLoggingState();
        this.currentStrategyCode = num != null ? (String) CollectionsKt.getOrNull(strategyCodeList, num.intValue()) : null;
        this.currentPageDirection = (num == null || (optionsDetailPageState4 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState4.getDirection();
        this.currentPageHasRealPosition = (num == null || (optionsDetailPageState3 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState3.getHasRealPosition();
        this.currentAccountNumber = account != null ? account.getAccountNumber() : null;
        this.currentOptionsAccountSwitcherId = (num == null || (optionsDetailPageState2 = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) == null) ? null : optionsDetailPageState2.getOptionsAccountSwitcherId();
        if (num != null && (optionsDetailPageState = (OptionsDetailPageState) CollectionsKt.getOrNull(pageStates, num.intValue())) != null) {
            uiOptionPositionState = optionsDetailPageState.getUiOptionPositionState();
        }
        this.currentUiOptionPositionState = uiOptionPositionState;
    }

    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    public final boolean isDay() {
        return this.isDay;
    }

    public final List<OptionsDetailPageState> getPageStates() {
        return this.pageStates;
    }

    public final List<String> getStrategyCodeList() {
        return this.strategyCodeList;
    }

    public final int getTradebarHeight() {
        return this.tradebarHeight;
    }

    public final OptionsDetailPagePnlDataState2 getPnlDataState() {
        return this.pnlDataState;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final OptionsDetailPageToolbarState getCurrentToolbarState() {
        return this.currentToolbarState;
    }

    public final OptionsDetailPageBodyState getCurrentBodyState() {
        return this.currentBodyState;
    }

    public final OptionsDetailPageTradebarDataState.PageSpecificDerivedData getCurrentTradebarData() {
        return this.currentTradebarData;
    }

    public final OptionsDetailPageLoggingState getCurrentLoggingState() {
        return this.currentLoggingState;
    }

    public final String getCurrentStrategyCode() {
        return this.currentStrategyCode;
    }

    public final Direction getCurrentPageDirection() {
        return this.currentPageDirection;
    }

    public final Boolean getCurrentPageHasRealPosition() {
        return this.currentPageHasRealPosition;
    }

    public final String getCurrentAccountNumber() {
        return this.currentAccountNumber;
    }

    public final OptionsAccountSwitcherId getCurrentOptionsAccountSwitcherId() {
        return this.currentOptionsAccountSwitcherId;
    }

    public final OptionsDetailPageUiOptionPositionState getCurrentUiOptionPositionState() {
        return this.currentUiOptionPositionState;
    }
}
