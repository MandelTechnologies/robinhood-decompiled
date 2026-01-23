package com.robinhood.android.directdeposit.p101ui.prefilled.confirmation;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/confirmation/PreFilledFormConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/prefilled/confirmation/PreFilledFormConfirmationViewState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;)V", "onCreate", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class PreFilledFormConfirmationDuxo extends OldBaseDuxo<PreFilledFormConfirmationViewState> {
    public static final int $stable = 8;
    private final RhyAccountStore rhyAccountStore;
    private final UserStore userStore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PreFilledFormConfirmationDuxo(UserStore userStore, RhyAccountStore rhyAccountStore) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        super(new PreFilledFormConfirmationViewState(null, objArr, 3, 0 == true ? 1 : 0), objArr2, 2, 0 == true ? 1 : 0);
        this.userStore = userStore;
        this.rhyAccountStore = rhyAccountStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.confirmation.PreFilledFormConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormConfirmationDuxo.onCreate$lambda$1(this.f$0, (User) obj);
            }
        });
        Single<Optional<RhyAccount>> singleOnErrorReturn = this.rhyAccountStore.forceFetchAccountIfNotCached().onErrorReturn(new Function() { // from class: com.robinhood.android.directdeposit.ui.prefilled.confirmation.PreFilledFormConfirmationDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final Optional<RhyAccount> apply(Throwable throwable) throws Throwable {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (Throwables.isNetworkRelated(throwable)) {
                    return Optional2.INSTANCE;
                }
                throw throwable;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.confirmation.PreFilledFormConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormConfirmationDuxo.onCreate$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(PreFilledFormConfirmationDuxo preFilledFormConfirmationDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        preFilledFormConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.confirmation.PreFilledFormConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormConfirmationDuxo.onCreate$lambda$1$lambda$0(user, (PreFilledFormConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormConfirmationViewState onCreate$lambda$1$lambda$0(User user, PreFilledFormConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormConfirmationViewState.copy$default(applyMutation, user.getEmail(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(PreFilledFormConfirmationDuxo preFilledFormConfirmationDuxo, Optional optional) {
        final RhyAccount rhyAccount = (RhyAccount) optional.component1();
        preFilledFormConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.confirmation.PreFilledFormConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormConfirmationDuxo.onCreate$lambda$3$lambda$2(rhyAccount, (PreFilledFormConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormConfirmationViewState onCreate$lambda$3$lambda$2(RhyAccount rhyAccount, PreFilledFormConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormConfirmationViewState.copy$default(applyMutation, null, Boolean.valueOf(rhyAccount != null), 1, null);
    }
}
