package com.robinhood.android.directdeposit.p101ui.accountinfo;

import com.robinhood.android.directdeposit.p101ui.ShowAccountNumberPref;
import com.robinhood.android.directdeposit.p101ui.accountinfo.AchAccountInfoViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchAccountInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0013J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;", "showAccountNumberPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;Lcom/robinhood/prefs/BooleanPreference;)V", "onStart", "", "setShowAccountNumber", "showAccountNumber", "", "setWithdrawalsLocked", "locked", "getRoutingDetailsOptional", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RoutingDetailsResult;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class AchAccountInfoDuxo extends OldBaseDuxo<AchAccountInfoViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore;
    private final RhyAccountStore rhyAccountStore;
    private final BooleanPreference showAccountNumberPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AchAccountInfoDuxo(AccountProvider accountProvider, MinervaAccountStore minervaAccountStore, RhyAccountStore rhyAccountStore, RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, @ShowAccountNumberPref BooleanPreference showAccountNumberPref) {
        super(new AchAccountInfoViewState(null, false, false, null, false, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyAccountRoutingDetailsStore, "rhyAccountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(showAccountNumberPref, "showAccountNumberPref");
        this.accountProvider = accountProvider;
        this.minervaAccountStore = minervaAccountStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyAccountRoutingDetailsStore = rhyAccountRoutingDetailsStore;
        this.showAccountNumberPref = showAccountNumberPref;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        MinervaAccountStore.refresh$default(this.minervaAccountStore, false, 1, null);
        Observable<R> map = getRoutingDetailsOptional().map(new Function() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final AchAccountInfoViewState.ContentState apply(Optional<? extends MinervaAccountStore.RoutingDetailsResult> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                MinervaAccountStore.RoutingDetailsResult routingDetailsResultComponent1 = optional.component1();
                if (routingDetailsResultComponent1 instanceof MinervaAccountStore.RoutingDetailsResult.Success) {
                    MinervaAccountStore.RoutingDetailsResult.Success success = (MinervaAccountStore.RoutingDetailsResult.Success) routingDetailsResultComponent1;
                    return new AchAccountInfoViewState.ContentState.Success(success.getRoutingDetails().getAccountNumber(), success.getRoutingDetails().getRoutingNumber(), success.getRoutingDetails().getFullBankName());
                }
                return AchAccountInfoViewState.ContentState.Failure.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$1(this.f$0, (AchAccountInfoViewState.ContentState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamIndividualAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$5(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.showAccountNumberPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AchAccountInfoDuxo achAccountInfoDuxo, final AchAccountInfoViewState.ContentState contentState) {
        achAccountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$1$lambda$0(contentState, (AchAccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState onStart$lambda$1$lambda$0(AchAccountInfoViewState.ContentState contentState, AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, contentState, false, false, null, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(AchAccountInfoDuxo achAccountInfoDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            achAccountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AchAccountInfoDuxo.onStart$lambda$3$lambda$2((AchAccountInfoViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState onStart$lambda$3$lambda$2(AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, AchAccountInfoViewState.ContentState.Failure.INSTANCE, false, false, null, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(AchAccountInfoDuxo achAccountInfoDuxo, final Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        achAccountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$5$lambda$4(account, (AchAccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState onStart$lambda$5$lambda$4(Account account, AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, null, false, false, null, account.getReceivedAchDebitLocked(), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(AchAccountInfoDuxo achAccountInfoDuxo, final boolean z) {
        achAccountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.onStart$lambda$7$lambda$6(z, (AchAccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState onStart$lambda$7$lambda$6(boolean z, AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, null, z, false, null, false, 29, null);
    }

    public final void setShowAccountNumber(boolean showAccountNumber) {
        this.showAccountNumberPref.set(showAccountNumber);
    }

    public final void setWithdrawalsLocked(boolean locked) {
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.setWithdrawalsLocked$lambda$8((AchAccountInfoViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.setWithdrawalsLocked(locked), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchAccountInfoDuxo.setWithdrawalsLocked$lambda$10(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.setWithdrawalsLocked$lambda$12(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState setWithdrawalsLocked$lambda$8(AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, null, false, true, null, false, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setWithdrawalsLocked$lambda$10(AchAccountInfoDuxo achAccountInfoDuxo) {
        achAccountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.setWithdrawalsLocked$lambda$10$lambda$9((AchAccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState setWithdrawalsLocked$lambda$10$lambda$9(AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, null, false, false, null, false, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setWithdrawalsLocked$lambda$12(AchAccountInfoDuxo achAccountInfoDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        achAccountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoDuxo.setWithdrawalsLocked$lambda$12$lambda$11(throwable, (AchAccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountInfoViewState setWithdrawalsLocked$lambda$12$lambda$11(Throwable th, AchAccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountInfoViewState.copy$default(applyMutation, null, false, false, new UiEvent(th), false, 19, null);
    }

    private final Observable<Optional<MinervaAccountStore.RoutingDetailsResult>> getRoutingDetailsOptional() {
        Observable observableSwitchMap = this.rhyAccountStore.streamSpendingAccount().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo.getRoutingDetailsOptional.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MinervaAccountStore.RoutingDetailsResult>> apply(Optional<RhyAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                RhyAccount rhyAccountComponent1 = optional.component1();
                if (rhyAccountComponent1 == null) {
                    return AchAccountInfoDuxo.this.minervaAccountStore.getRoutingDetailsOptional();
                }
                return AchAccountInfoDuxo.this.rhyAccountRoutingDetailsStore.streamRhyAccountRoutingDetailsObservable(rhyAccountComponent1.getId()).map(new Function() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoDuxo.getRoutingDetailsOptional.1.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<MinervaAccountStore.RoutingDetailsResult> apply(RhyAccountRoutingDetails rhyAccountRoutingDetails) {
                        Intrinsics.checkNotNullParameter(rhyAccountRoutingDetails, "rhyAccountRoutingDetails");
                        return Optional3.asOptional(new MinervaAccountStore.RoutingDetailsResult.Success(rhyAccountRoutingDetails));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
