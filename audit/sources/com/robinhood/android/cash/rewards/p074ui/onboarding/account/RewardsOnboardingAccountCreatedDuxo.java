package com.robinhood.android.cash.rewards.p074ui.onboarding.account;

import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingAccountCreatedDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/account/RewardsOnboardingAccountCreatedViewState;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;)V", "onCreate", "", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingAccountCreatedDuxo extends OldBaseDuxo<RewardsOnboardingAccountCreatedViewState> {
    private static final long LOADING_DELAY_SECONDS = 8;
    private final BaseSortingHatStore sortingHatStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOnboardingAccountCreatedDuxo(BaseSortingHatStore sortingHatStore) {
        super(new RewardsOnboardingAccountCreatedViewState(false, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        this.sortingHatStore = sortingHatStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.sortingHatStore.refresh();
        Observable observableDelay = QueryKt.asObservable(this.sortingHatStore.streamUserState()).take(1L).delay(LOADING_DELAY_SECONDS, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDelay, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.account.RewardsOnboardingAccountCreatedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAccountCreatedDuxo.onCreate$lambda$1(this.f$0, (SortingHatUserState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RewardsOnboardingAccountCreatedDuxo rewardsOnboardingAccountCreatedDuxo, final SortingHatUserState sortingHatUserState) {
        rewardsOnboardingAccountCreatedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.account.RewardsOnboardingAccountCreatedDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAccountCreatedDuxo.onCreate$lambda$1$lambda$0(sortingHatUserState, (RewardsOnboardingAccountCreatedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAccountCreatedViewState onCreate$lambda$1$lambda$0(SortingHatUserState sortingHatUserState, RewardsOnboardingAccountCreatedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, new UiEvent<>(sortingHatUserState));
    }
}
