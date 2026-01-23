package com.robinhood.android.directdeposit.p101ui.accountinfo;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoViewState;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;Lcom/robinhood/shared/store/user/UserStore;)V", "onStart", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class AccountInfoDuxo extends OldBaseDuxo<AccountInfoViewState> {
    public static final int $stable = 8;
    private final AccountRoutingDetailsStore accountRoutingDetailsStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoDuxo(AccountRoutingDetailsStore accountRoutingDetailsStore, UserStore userStore) {
        super(new AccountInfoViewState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoDuxo.onStart$lambda$1(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoDuxo.onStart$lambda$5(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AccountInfoDuxo accountInfoDuxo, final AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        accountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoDuxo.onStart$lambda$1$lambda$0(routingDetails, (AccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountInfoViewState onStart$lambda$1$lambda$0(AccountRoutingDetailsStore.RoutingDetails routingDetails, AccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountInfoViewState.copy$default(applyMutation, routingDetails, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(AccountInfoDuxo accountInfoDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        accountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoDuxo.onStart$lambda$3$lambda$2(throwable, (AccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountInfoViewState onStart$lambda$3$lambda$2(Throwable th, AccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountInfoViewState.copy$default(applyMutation, null, null, new UiEvent(th), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(AccountInfoDuxo accountInfoDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        accountInfoDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoDuxo.onStart$lambda$5$lambda$4(user, (AccountInfoViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountInfoViewState onStart$lambda$5$lambda$4(User user, AccountInfoViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountInfoViewState.copy$default(applyMutation, null, user.getFullName(), null, 5, null);
    }
}
