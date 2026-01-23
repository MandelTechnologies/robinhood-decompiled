package com.robinhood.android.hyperextendedonboarding;

import com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.HyperExtendedOnboardingStore;
import com.robinhood.models.api.bonfire.ApiNewTradingHoursOnboarding;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HyperExtendedOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/hyperextendedonboarding/HyperExtendedOnboardingViewState;", "hyperExtendedOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/HyperExtendedOnboardingStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/HyperExtendedOnboardingStore;)V", "onStart", "", "feature-hyper-extended-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HyperExtendedOnboardingDuxo extends OldBaseDuxo<HyperExtendedOnboardingViewState> {
    public static final int $stable = 8;
    private final HyperExtendedOnboardingStore hyperExtendedOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HyperExtendedOnboardingDuxo(HyperExtendedOnboardingStore hyperExtendedOnboardingStore) {
        super(new HyperExtendedOnboardingViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(hyperExtendedOnboardingStore, "hyperExtendedOnboardingStore");
        this.hyperExtendedOnboardingStore = hyperExtendedOnboardingStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel> observable = this.hyperExtendedOnboardingStore.getHyperExtendedOnboardingViewModel().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observable, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HyperExtendedOnboardingDuxo.onStart$lambda$1(this.f$0, (ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HyperExtendedOnboardingDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(HyperExtendedOnboardingDuxo hyperExtendedOnboardingDuxo, final ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel hyperExtendedOnboardingViewModel) {
        hyperExtendedOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HyperExtendedOnboardingDuxo.onStart$lambda$1$lambda$0(hyperExtendedOnboardingViewModel, (HyperExtendedOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HyperExtendedOnboardingViewState onStart$lambda$1$lambda$0(ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel hyperExtendedOnboardingViewModel, HyperExtendedOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(hyperExtendedOnboardingViewModel);
        return HyperExtendedOnboardingViewState.copy$default(applyMutation, null, new HyperExtendedOnboardingViewState.Result.Success(hyperExtendedOnboardingViewModel), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(HyperExtendedOnboardingDuxo hyperExtendedOnboardingDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        hyperExtendedOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HyperExtendedOnboardingDuxo.onStart$lambda$3$lambda$2((HyperExtendedOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HyperExtendedOnboardingViewState onStart$lambda$3$lambda$2(HyperExtendedOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return HyperExtendedOnboardingViewState.copy$default(applyMutation, null, HyperExtendedOnboardingViewState.Result.Error.INSTANCE, 1, null);
    }
}
