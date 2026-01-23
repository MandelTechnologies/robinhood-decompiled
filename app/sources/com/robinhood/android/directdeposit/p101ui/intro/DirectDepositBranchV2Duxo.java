package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositBranchV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2Duxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2DataState;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2ViewState;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "emailDirectDepositInformation", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectDepositBranchV2Duxo extends BaseDuxo<DirectDepositBranchV2DataState, DirectDepositBranchV2ViewState> {
    public static final int $stable = 8;
    private final AccountRoutingDetailsStore accountRoutingDetailsStore;
    private final MinervaAccountStore minervaAccountStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositBranchV2Duxo(AccountRoutingDetailsStore accountRoutingDetailsStore, MinervaAccountStore minervaAccountStore, UserStore userStore, DirectDepositBranchV2StateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new DirectDepositBranchV2DataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.minervaAccountStore = minervaAccountStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositBranchV2Duxo.onStart$lambda$0(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        });
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositBranchV2Duxo.onStart$lambda$1(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DirectDepositBranchV2Duxo directDepositBranchV2Duxo, AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        directDepositBranchV2Duxo.applyMutation(new DirectDepositBranchV2Duxo3(routingDetails, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DirectDepositBranchV2Duxo directDepositBranchV2Duxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        directDepositBranchV2Duxo.applyMutation(new DirectDepositBranchV2Duxo4(user, null));
        return Unit.INSTANCE;
    }

    public final void emailDirectDepositInformation() {
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.cmSunsetEmailAccountInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositBranchV2Duxo.emailDirectDepositInformation$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emailDirectDepositInformation$lambda$2(DirectDepositBranchV2Duxo directDepositBranchV2Duxo) {
        directDepositBranchV2Duxo.applyMutation(new DirectDepositBranchV2Duxo2(null));
        return Unit.INSTANCE;
    }
}
