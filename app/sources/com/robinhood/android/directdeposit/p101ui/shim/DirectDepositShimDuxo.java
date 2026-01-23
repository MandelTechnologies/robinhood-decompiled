package com.robinhood.android.directdeposit.p101ui.shim;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.directdeposit.p101ui.shim.DirectDepositShimDuxo6;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Singles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositShimDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositShimDuxo extends OldBaseDuxo<DirectDepositShimDuxo6> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositShimDuxo(AccountProvider accountProvider, TransferAccountStore transferAccountStore, DirectDepositRelationshipStore directDepositRelationshipStore, SavedStateHandle savedStateHandle) {
        super(DirectDepositShimDuxo6.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.transferAccountStore = transferAccountStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.accountProvider.refresh(false);
        Observable<T> observableAsObservable = asObservable(this.accountProvider.streamAllSelfDirectedIndividualAccounts());
        Observable<List<TransferAccount>> observableRefCount = this.transferAccountStore.fetchIfStaleThenStream().onErrorReturnItem(CollectionsKt.emptyList()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Single singleFirstOrError = observableRefCount.map(new Function() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimDuxo$onCreate$hasRhyAccountSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<TransferAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<TransferAccount> list = accounts2;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((TransferAccount) it.next()).getType() == ApiTransferAccount.TransferAccountType.RHY) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }).firstOrError();
        Observable observableTake = observableAsObservable.flatMapSingle(new Function() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimDuxo$onCreate$hasRhsDirectDepositRelationshipSingle$1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                if (accounts2.isEmpty()) {
                    Single singleJust = Single.just(Boolean.FALSE);
                    Intrinsics.checkNotNull(singleJust);
                    return singleJust;
                }
                return DirectDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached$default(this.this$0.directDepositRelationshipStore, RhEntity.RHS, null, 2, null);
            }
        }).take(1L);
        Boolean bool = Boolean.FALSE;
        Single singleOnErrorReturnItem = observableTake.first(bool).onErrorReturnItem(bool);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        Single singleFirst = observableAsObservable.map(new Function() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimDuxo$onCreate$accountDeactivatedSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                boolean z = true;
                if (!accounts2.isEmpty()) {
                    List<Account> list = accounts2;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (!((Account) it.next()).getDeactivated()) {
                                z = false;
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }).take(1L).first(bool);
        Singles singles = Singles.INSTANCE;
        Intrinsics.checkNotNull(singleFirstOrError);
        Single<List<TransferAccount>> singleFirstOrError2 = observableRefCount.firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError2, "firstOrError(...)");
        Intrinsics.checkNotNull(singleFirst);
        Single singleZip = Single.zip(singleFirstOrError, singleFirstOrError2, singleOnErrorReturnItem, singleFirst, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimDuxo$onCreate$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                boolean zBooleanValue = ((Boolean) t4).booleanValue();
                boolean zBooleanValue2 = ((Boolean) t3).booleanValue();
                return (R) new DirectDepositShimBundle(((Boolean) t1).booleanValue(), (List) t2, zBooleanValue2, zBooleanValue);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositShimDuxo.onCreate$lambda$1(this.f$0, (DirectDepositShimBundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final DirectDepositShimDuxo directDepositShimDuxo, DirectDepositShimBundle directDepositShimBundle) {
        Intrinsics.checkNotNullParameter(directDepositShimBundle, "<destruct>");
        final boolean hasRhyAccount = directDepositShimBundle.getHasRhyAccount();
        final List<TransferAccount> listComponent2 = directDepositShimBundle.component2();
        final boolean hasRhsDirectDepositRelationship = directDepositShimBundle.getHasRhsDirectDepositRelationship();
        final boolean accountDeactivated = directDepositShimBundle.getAccountDeactivated();
        directDepositShimDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositShimDuxo.onCreate$lambda$1$lambda$0(accountDeactivated, hasRhyAccount, directDepositShimDuxo, listComponent2, hasRhsDirectDepositRelationship, (DirectDepositShimDuxo6) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositShimDuxo6 onCreate$lambda$1$lambda$0(boolean z, boolean z2, DirectDepositShimDuxo directDepositShimDuxo, List list, boolean z3, DirectDepositShimDuxo6 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (z && !z2) {
            return DirectDepositShimDuxo6.DeactivatedAccount.INSTANCE;
        }
        Companion companion = INSTANCE;
        return new DirectDepositShimDuxo6.Loaded(z2, list, z3, ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getRequireCashManagement(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getFromRhyMigration(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getFromManualSetupDeeplink(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getFromDDOnboardingFlow(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getShowEarlyPayHook(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getShowConfirmationScreen(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getFromDirectDepositToBrokerageDeeplink(), ((DirectDepositShimKey) companion.getExtras((HasSavedState) directDepositShimDuxo)).getFromTransfersHub());
    }

    /* compiled from: DirectDepositShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimDuxo;", "Lcom/robinhood/android/transfers/contracts/DirectDepositShimKey;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<DirectDepositShimDuxo, DirectDepositShimKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public DirectDepositShimKey getExtras(SavedStateHandle savedStateHandle) {
            return (DirectDepositShimKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public DirectDepositShimKey getExtras(DirectDepositShimDuxo directDepositShimDuxo) {
            return (DirectDepositShimKey) DuxoCompanion2.DefaultImpls.getExtras(this, directDepositShimDuxo);
        }
    }
}
