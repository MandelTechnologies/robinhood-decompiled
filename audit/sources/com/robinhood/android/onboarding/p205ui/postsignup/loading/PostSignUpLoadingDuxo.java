package com.robinhood.android.onboarding.p205ui.postsignup.loading;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.onboarding.p205ui.postsignup.loading.PostSignUpLoadingFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EquityOrderDefaultStore;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.achrelationship.QueuedTransferStore;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "queuedTransferStore", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;Lcom/robinhood/store/achrelationship/QueuedTransferStore;Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onRhyStart", "onBrokerageStart", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostSignUpLoadingDuxo extends OldBaseDuxo<PostSignUpLoadingViewState> implements HasSavedState {
    private final EquityOrderDefaultStore equityOrderDefaultStore;
    private final FundAccountScreenStore fundAccountStore;
    private final QueuedTransferStore queuedTransferStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PostSignUpLoadingDuxo(FundAccountScreenStore fundAccountStore, QueuedTransferStore queuedTransferStore, EquityOrderDefaultStore equityOrderDefaultStore, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new PostSignUpLoadingViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
        Intrinsics.checkNotNullParameter(queuedTransferStore, "queuedTransferStore");
        Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.fundAccountStore = fundAccountStore;
        this.queuedTransferStore = queuedTransferStore;
        this.equityOrderDefaultStore = equityOrderDefaultStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.fundAccountStore.fetchIfEmpty();
        if (((PostSignUpLoadingFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIsRhy()) {
            onRhyStart();
        } else {
            onBrokerageStart();
        }
    }

    private final void onRhyStart() {
        Single<Boolean> singleOnErrorReturnItem = this.queuedTransferStore.forcedGetHasQueuedDeposit(RhAccountType.RHY_ACCOUNT).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpLoadingDuxo.onRhyStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRhyStart$lambda$1(PostSignUpLoadingDuxo postSignUpLoadingDuxo, final Boolean bool) {
        postSignUpLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpLoadingDuxo.onRhyStart$lambda$1$lambda$0(bool, (PostSignUpLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostSignUpLoadingViewState onRhyStart$lambda$1$lambda$0(Boolean bool, PostSignUpLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PostSignUpLoadingViewState.copy$default(applyMutation, bool, null, 2, null);
    }

    private final void onBrokerageStart() {
        this.equityOrderDefaultStore.setDefaultToDollarBased();
        Single<Boolean> singleOnErrorReturnItem = this.queuedTransferStore.forcedGetHasQueuedDeposit(RhAccountType.RHS_ACCOUNT).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpLoadingDuxo.onBrokerageStart$lambda$3(this.f$0, (Boolean) obj);
            }
        });
        this.userStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpLoadingDuxo.onBrokerageStart$lambda$5(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBrokerageStart$lambda$3(PostSignUpLoadingDuxo postSignUpLoadingDuxo, final Boolean bool) {
        postSignUpLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpLoadingDuxo.onBrokerageStart$lambda$3$lambda$2(bool, (PostSignUpLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostSignUpLoadingViewState onBrokerageStart$lambda$3$lambda$2(Boolean bool, PostSignUpLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PostSignUpLoadingViewState.copy$default(applyMutation, bool, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBrokerageStart$lambda$5(PostSignUpLoadingDuxo postSignUpLoadingDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        postSignUpLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.ui.postsignup.loading.PostSignUpLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpLoadingDuxo.onBrokerageStart$lambda$5$lambda$4(user, (PostSignUpLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostSignUpLoadingViewState onBrokerageStart$lambda$5$lambda$4(User user, PostSignUpLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PostSignUpLoadingViewState.copy$default(applyMutation, null, user.getOrigin().getLocality(), 1, null);
    }

    /* compiled from: PostSignUpLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingDuxo;", "Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingFragment$Args;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PostSignUpLoadingDuxo, PostSignUpLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PostSignUpLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PostSignUpLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PostSignUpLoadingFragment.Args getArgs(PostSignUpLoadingDuxo postSignUpLoadingDuxo) {
            return (PostSignUpLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, postSignUpLoadingDuxo);
        }
    }
}
