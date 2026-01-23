package com.robinhood.android.rhymigration.p245ui.directdeposit;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyDirectDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositViewState;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/shared/store/user/UserStore;)V", "onStart", "", "requestRoutingInfoEmail", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyDirectDepositDuxo extends OldBaseDuxo<RhyDirectDepositViewState> {
    public static final int $stable = 8;
    private final AccountRoutingDetailsStore accountRoutingDetailsStore;
    private final MinervaAccountStore minervaAccountStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyDirectDepositDuxo(AccountRoutingDetailsStore accountRoutingDetailsStore, MinervaAccountStore minervaAccountStore, UserStore userStore) {
        super(new RhyDirectDepositViewState(null, null, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.minervaAccountStore = minervaAccountStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.onStart$lambda$1(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.onStart$lambda$5(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyDirectDepositDuxo rhyDirectDepositDuxo, final AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        rhyDirectDepositDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.onStart$lambda$1$lambda$0(routingDetails, (RhyDirectDepositViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyDirectDepositViewState onStart$lambda$1$lambda$0(AccountRoutingDetailsStore.RoutingDetails routingDetails, RhyDirectDepositViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyDirectDepositViewState.copy$default(applyMutation, routingDetails, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyDirectDepositDuxo rhyDirectDepositDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyDirectDepositDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.onStart$lambda$3$lambda$2(throwable, (RhyDirectDepositViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyDirectDepositViewState onStart$lambda$3$lambda$2(Throwable th, RhyDirectDepositViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyDirectDepositViewState.copy$default(applyMutation, null, null, new UiEvent(th), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyDirectDepositDuxo rhyDirectDepositDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        rhyDirectDepositDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.onStart$lambda$5$lambda$4(user, (RhyDirectDepositViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyDirectDepositViewState onStart$lambda$5$lambda$4(User user, RhyDirectDepositViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyDirectDepositViewState.copy$default(applyMutation, null, user.getEmail(), null, null, 13, null);
    }

    public final void requestRoutingInfoEmail() {
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.cmSunsetEmailAccountInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyDirectDepositDuxo.requestRoutingInfoEmail$lambda$7(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.requestRoutingInfoEmail$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRoutingInfoEmail$lambda$7(RhyDirectDepositDuxo rhyDirectDepositDuxo) {
        rhyDirectDepositDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositDuxo.requestRoutingInfoEmail$lambda$7$lambda$6((RhyDirectDepositViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyDirectDepositViewState requestRoutingInfoEmail$lambda$7$lambda$6(RhyDirectDepositViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyDirectDepositViewState.copy$default(applyMutation, null, null, null, new UiEvent(Boolean.TRUE), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRoutingInfoEmail$lambda$9(RhyDirectDepositDuxo rhyDirectDepositDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            rhyDirectDepositDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyDirectDepositDuxo.requestRoutingInfoEmail$lambda$9$lambda$8((RhyDirectDepositViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyDirectDepositViewState requestRoutingInfoEmail$lambda$9$lambda$8(RhyDirectDepositViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyDirectDepositViewState.copy$default(applyMutation, null, null, null, new UiEvent(Boolean.FALSE), 7, null);
    }
}
