package com.robinhood.android.withdrawableamount.p279ui;

import androidx.paging.PagedList;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.withdrawableamount.p279ui.WithdrawableAmountDetailState2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdown;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: WithdrawableAmountDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailState;", "withdrawableAmountBreakdownStore", "Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/WithdrawableAmountBreakdownStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/shared/store/user/UserStore;)V", "onCreate", "", "onShowAllClicked", "onWithdrawClicked", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WithdrawableAmountDetailDuxo extends OldBaseDuxo<WithdrawableAmountDetailState> {
    private final HistoryStore historyStore;
    private final UserStore userStore;
    private final WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithdrawableAmountDetailDuxo(WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore, HistoryStore historyStore, UserStore userStore) {
        super(new WithdrawableAmountDetailState(null, null, null, null, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(withdrawableAmountBreakdownStore, "withdrawableAmountBreakdownStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.withdrawableAmountBreakdownStore = withdrawableAmountBreakdownStore;
        this.historyStore = historyStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        WithdrawableAmountBreakdownStore withdrawableAmountBreakdownStore = this.withdrawableAmountBreakdownStore;
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        LifecycleHost.DefaultImpls.bind$default(this, withdrawableAmountBreakdownStore.poll(durationOfSeconds), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onCreate$lambda$1(this.f$0, (ApiWithdrawableAmountBreakdown) obj);
            }
        });
        HistoryStore historyStore = this.historyStore;
        Observable observableJust = Observable.just(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableJust2 = Observable.just(HistoryFilter.ALL.getTransactionTypes());
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Observable observableJust3 = Observable.just(Instant.EPOCH);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, null, 5, 24, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onCreate$lambda$3(this.f$0, (PagedList) obj);
            }
        });
        this.userStore.refresh(false);
        Observable<User> observableTake = this.userStore.getUser().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onCreate$lambda$5(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(WithdrawableAmountDetailDuxo withdrawableAmountDetailDuxo, final ApiWithdrawableAmountBreakdown breakdown) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        withdrawableAmountDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onCreate$lambda$1$lambda$0(breakdown, (WithdrawableAmountDetailState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WithdrawableAmountDetailState onCreate$lambda$1$lambda$0(ApiWithdrawableAmountBreakdown apiWithdrawableAmountBreakdown, WithdrawableAmountDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return WithdrawableAmountDetailState.copy$default(applyMutation, null, new WithdrawableAmountDetailState2.Success(apiWithdrawableAmountBreakdown), null, null, null, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(WithdrawableAmountDetailDuxo withdrawableAmountDetailDuxo, final PagedList historyItems) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        withdrawableAmountDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onCreate$lambda$3$lambda$2(historyItems, (WithdrawableAmountDetailState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WithdrawableAmountDetailState onCreate$lambda$3$lambda$2(PagedList pagedList, WithdrawableAmountDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return WithdrawableAmountDetailState.copy$default(applyMutation, null, null, pagedList, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(WithdrawableAmountDetailDuxo withdrawableAmountDetailDuxo, final User user) {
        withdrawableAmountDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onCreate$lambda$5$lambda$4(user, (WithdrawableAmountDetailState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WithdrawableAmountDetailState onCreate$lambda$5$lambda$4(User user, WithdrawableAmountDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return WithdrawableAmountDetailState.copy$default(applyMutation, null, null, null, user, null, null, 55, null);
    }

    public final void onShowAllClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onShowAllClicked$lambda$7((WithdrawableAmountDetailState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WithdrawableAmountDetailState onShowAllClicked$lambda$7(WithdrawableAmountDetailState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return WithdrawableAmountDetailState.copy$default(applyMutation, null, null, null, null, applyMutation.isUkUser() != null ? new UiEvent(new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AccountsHistoryContract.Key(null, null, null, null, false, null, 63, null), false, false, false, false, false, false, 118, null)) : null, null, 47, null);
    }

    public final void onWithdrawClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawableAmountDetailDuxo.onWithdrawClicked$lambda$9((WithdrawableAmountDetailState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WithdrawableAmountDetailState onWithdrawClicked$lambda$9(WithdrawableAmountDetailState applyMutation) {
        UiEvent uiEvent;
        Object transfer;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Boolean boolIsUkUser = applyMutation.isUkUser();
        if (boolIsUkUser != null) {
            if (boolIsUkUser.booleanValue()) {
                transfer = new UkTransfer(TransferDirectionV2.WITHDRAW, null, null, null, null, 30, null);
            } else {
                transfer = new Transfer(new TransferContext.Normal(TransferDirection.WITHDRAW, null, null, 6, null));
            }
            uiEvent = new UiEvent(transfer);
        } else {
            uiEvent = null;
        }
        return WithdrawableAmountDetailState.copy$default(applyMutation, null, null, null, null, null, uiEvent, 31, null);
    }
}
