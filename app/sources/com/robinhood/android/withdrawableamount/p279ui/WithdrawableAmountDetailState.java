package com.robinhood.android.withdrawableamount.p279ui;

import androidx.paging.PagedList;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.withdrawableamount.p279ui.WithdrawableAmountDetailState2;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WithdrawableAmountDetailState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u001b\u0010#\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jk\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailState;", "", "withdrawableAmountFromUnifiedBalances", "Ljava/math/BigDecimal;", "request", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest;", "historyItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "user", "Lcom/robinhood/models/db/sheriff/User;", "showAllIntentKeyEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "withdrawFundsIntentKeyEvent", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest;Landroidx/paging/PagedList;Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getWithdrawableAmountFromUnifiedBalances", "()Ljava/math/BigDecimal;", "getRequest", "()Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest;", "getHistoryItems", "()Landroidx/paging/PagedList;", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getShowAllIntentKeyEvent", "()Lcom/robinhood/udf/UiEvent;", "getWithdrawFundsIntentKeyEvent", "isUkUser", "", "()Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final /* data */ class WithdrawableAmountDetailState {
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems;
    private final WithdrawableAmountDetailState2 request;
    private final UiEvent<IntentKey> showAllIntentKeyEvent;
    private final User user;
    private final UiEvent<IntentKey> withdrawFundsIntentKeyEvent;
    private final BigDecimal withdrawableAmountFromUnifiedBalances;

    public WithdrawableAmountDetailState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WithdrawableAmountDetailState copy$default(WithdrawableAmountDetailState withdrawableAmountDetailState, BigDecimal bigDecimal, WithdrawableAmountDetailState2 withdrawableAmountDetailState2, PagedList pagedList, User user, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = withdrawableAmountDetailState.withdrawableAmountFromUnifiedBalances;
        }
        if ((i & 2) != 0) {
            withdrawableAmountDetailState2 = withdrawableAmountDetailState.request;
        }
        if ((i & 4) != 0) {
            pagedList = withdrawableAmountDetailState.historyItems;
        }
        if ((i & 8) != 0) {
            user = withdrawableAmountDetailState.user;
        }
        if ((i & 16) != 0) {
            uiEvent = withdrawableAmountDetailState.showAllIntentKeyEvent;
        }
        if ((i & 32) != 0) {
            uiEvent2 = withdrawableAmountDetailState.withdrawFundsIntentKeyEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return withdrawableAmountDetailState.copy(bigDecimal, withdrawableAmountDetailState2, pagedList, user, uiEvent3, uiEvent4);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getWithdrawableAmountFromUnifiedBalances() {
        return this.withdrawableAmountFromUnifiedBalances;
    }

    /* renamed from: component2, reason: from getter */
    public final WithdrawableAmountDetailState2 getRequest() {
        return this.request;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component3() {
        return this.historyItems;
    }

    /* renamed from: component4, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final UiEvent<IntentKey> component5() {
        return this.showAllIntentKeyEvent;
    }

    public final UiEvent<IntentKey> component6() {
        return this.withdrawFundsIntentKeyEvent;
    }

    public final WithdrawableAmountDetailState copy(BigDecimal withdrawableAmountFromUnifiedBalances, WithdrawableAmountDetailState2 request, PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems, User user, UiEvent<IntentKey> showAllIntentKeyEvent, UiEvent<IntentKey> withdrawFundsIntentKeyEvent) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new WithdrawableAmountDetailState(withdrawableAmountFromUnifiedBalances, request, historyItems, user, showAllIntentKeyEvent, withdrawFundsIntentKeyEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawableAmountDetailState)) {
            return false;
        }
        WithdrawableAmountDetailState withdrawableAmountDetailState = (WithdrawableAmountDetailState) other;
        return Intrinsics.areEqual(this.withdrawableAmountFromUnifiedBalances, withdrawableAmountDetailState.withdrawableAmountFromUnifiedBalances) && Intrinsics.areEqual(this.request, withdrawableAmountDetailState.request) && Intrinsics.areEqual(this.historyItems, withdrawableAmountDetailState.historyItems) && Intrinsics.areEqual(this.user, withdrawableAmountDetailState.user) && Intrinsics.areEqual(this.showAllIntentKeyEvent, withdrawableAmountDetailState.showAllIntentKeyEvent) && Intrinsics.areEqual(this.withdrawFundsIntentKeyEvent, withdrawableAmountDetailState.withdrawFundsIntentKeyEvent);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.withdrawableAmountFromUnifiedBalances;
        int iHashCode = (((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.request.hashCode()) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.historyItems;
        int iHashCode2 = (iHashCode + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        UiEvent<IntentKey> uiEvent = this.showAllIntentKeyEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<IntentKey> uiEvent2 = this.withdrawFundsIntentKeyEvent;
        return iHashCode4 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "WithdrawableAmountDetailState(withdrawableAmountFromUnifiedBalances=" + this.withdrawableAmountFromUnifiedBalances + ", request=" + this.request + ", historyItems=" + this.historyItems + ", user=" + this.user + ", showAllIntentKeyEvent=" + this.showAllIntentKeyEvent + ", withdrawFundsIntentKeyEvent=" + this.withdrawFundsIntentKeyEvent + ")";
    }

    public WithdrawableAmountDetailState(BigDecimal bigDecimal, WithdrawableAmountDetailState2 request, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, User user, UiEvent<IntentKey> uiEvent, UiEvent<IntentKey> uiEvent2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.withdrawableAmountFromUnifiedBalances = bigDecimal;
        this.request = request;
        this.historyItems = pagedList;
        this.user = user;
        this.showAllIntentKeyEvent = uiEvent;
        this.withdrawFundsIntentKeyEvent = uiEvent2;
    }

    public final BigDecimal getWithdrawableAmountFromUnifiedBalances() {
        return this.withdrawableAmountFromUnifiedBalances;
    }

    public /* synthetic */ WithdrawableAmountDetailState(BigDecimal bigDecimal, WithdrawableAmountDetailState2 withdrawableAmountDetailState2, PagedList pagedList, User user, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? WithdrawableAmountDetailState2.Loading.INSTANCE : withdrawableAmountDetailState2, (i & 4) != 0 ? null : pagedList, (i & 8) != 0 ? null : user, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2);
    }

    public final WithdrawableAmountDetailState2 getRequest() {
        return this.request;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getHistoryItems() {
        return this.historyItems;
    }

    public final User getUser() {
        return this.user;
    }

    public final UiEvent<IntentKey> getShowAllIntentKeyEvent() {
        return this.showAllIntentKeyEvent;
    }

    public final UiEvent<IntentKey> getWithdrawFundsIntentKeyEvent() {
        return this.withdrawFundsIntentKeyEvent;
    }

    public final Boolean isUkUser() {
        User user = this.user;
        if (user != null) {
            return Boolean.valueOf(Intrinsics.areEqual(user.getOrigin().getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE));
        }
        return null;
    }
}
