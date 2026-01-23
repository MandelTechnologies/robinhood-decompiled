package com.robinhood.android.transfers.nonoriginated.p268ui;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.RobinhoodAccountDto;
import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.nonoriginated.ToTransferAccountTypeDto;
import com.robinhood.android.transfers.nonoriginated.p268ui.NonOriginatedTransferInfoAccountSelectionFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NonOriginatedTransferInfoAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDataState;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionViewState;", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "Lcom/robinhood/android/udf/HasSavedState;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/android/lib/account/AccountProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onAccountSelected", "accountNumber", "", "Companion", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class NonOriginatedTransferInfoAccountSelectionDuxo extends BaseDuxo3<NonOriginatedTransferInfoAccountSelectionDataState, NonOriginatedTransferInfoAccountSelectionViewState, RobinhoodAccountDto> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonOriginatedTransferInfoAccountSelectionDuxo(RhyAccountStore rhyAccountStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle, NonOriginatedTransferInfoAccountSelectionStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new NonOriginatedTransferInfoAccountSelectionDataState(null, null, ((NonOriginatedTransferInfoAccountSelectionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getTransferType(), 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable<List<Account>> observableDistinctUntilChanged = this.accountProvider.streamAllAccounts().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonOriginatedTransferInfoAccountSelectionDuxo.onCreate$lambda$0(this.f$0, (List) obj);
            }
        });
        Observable<Optional<RhyAccount>> observableDistinctUntilChanged2 = this.rhyAccountStore.streamSpendingAccount().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonOriginatedTransferInfoAccountSelectionDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo, List list) {
        nonOriginatedTransferInfoAccountSelectionDuxo.applyMutation(new NonOriginatedTransferInfoAccountSelectionDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo, Optional optional) {
        nonOriginatedTransferInfoAccountSelectionDuxo.applyMutation(new NonOriginatedTransferInfoAccountSelectionDuxo3((RhyAccount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    public final void onAccountSelected(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonOriginatedTransferInfoAccountSelectionDuxo.onAccountSelected$lambda$3(this.f$0, accountNumber, (NonOriginatedTransferInfoAccountSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccountSelected$lambda$3(NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo, String str, NonOriginatedTransferInfoAccountSelectionDataState dataState) {
        Object next;
        TransferAccountTypeDto transferAccountTypeDto;
        BrokerageAccountType brokerageAccountType;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Iterator<T> it = dataState.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Account account = (Account) next;
            if (Intrinsics.areEqual(account.getAccountNumber(), str) || Intrinsics.areEqual(account.getAccountNumberRhs(), str)) {
                break;
            }
        }
        Account account2 = (Account) next;
        if (account2 == null || (brokerageAccountType = account2.getBrokerageAccountType()) == null || (transferAccountTypeDto = ToTransferAccountTypeDto.toTransferAccountTypeDto(brokerageAccountType)) == null) {
            transferAccountTypeDto = TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHY;
        }
        nonOriginatedTransferInfoAccountSelectionDuxo.submit(new RobinhoodAccountDto(str, transferAccountTypeDto));
        return Unit.INSTANCE;
    }

    /* compiled from: NonOriginatedTransferInfoAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDuxo;", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionFragment$Args;", "<init>", "()V", "feature-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<NonOriginatedTransferInfoAccountSelectionDuxo, NonOriginatedTransferInfoAccountSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NonOriginatedTransferInfoAccountSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (NonOriginatedTransferInfoAccountSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NonOriginatedTransferInfoAccountSelectionFragment.Args getArgs(NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo) {
            return (NonOriginatedTransferInfoAccountSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, nonOriginatedTransferInfoAccountSelectionDuxo);
        }
    }
}
