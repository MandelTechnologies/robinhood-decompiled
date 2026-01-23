package com.robinhood.android.cash.rewards.p074ui.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDataState;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "stateProvider", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingIntroDuxo extends BaseDuxo<RewardsOnboardingIntroDataState, RewardsOnboardingIntroViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final BaseSortingHatStore sortingHatStore;
    private final SweepsInterestStore sweepInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RewardsOnboardingIntroDuxo(BaseSortingHatStore sortingHatStore, SweepsInterestStore sweepInterestStore, RewardsOnboardingIntroStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        CharSequence content;
        String string2;
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        RewardsOnboardingContent bonus = ((RewardsOnboardingIntroFragmentV2.Args) companion.getArgs(savedStateHandle)).getBonus();
        super(new RewardsOnboardingIntroDataState(((RewardsOnboardingIntroFragmentV2.Args) companion.getArgs(savedStateHandle)).getIntroOnboardingSteps(), (bonus == null || (content = bonus.getContent()) == null || (string2 = content.toString()) == null) ? "" : string2, null, null, 12, null), stateProvider, duxoBundle);
        this.sortingHatStore = sortingHatStore;
        this.sweepInterestStore = sweepInterestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.sortingHatStore.refresh();
        this.sweepInterestStore.refreshNoAccountNumber(true);
        Observable observableDistinctUntilChanged = QueryKt.asObservable(this.sortingHatStore.streamUserState()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingIntroDuxo.onCreate$lambda$0(this.f$0, (SortingHatUserState) obj);
            }
        });
        Observable<Optional<BigDecimal>> observableDistinctUntilChanged2 = this.sweepInterestStore.streamInterestNoAccountNumber().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingIntroDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RewardsOnboardingIntroDuxo rewardsOnboardingIntroDuxo, SortingHatUserState sortingHatUserState) {
        rewardsOnboardingIntroDuxo.applyMutation(new RewardsOnboardingIntroDuxo2(sortingHatUserState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RewardsOnboardingIntroDuxo rewardsOnboardingIntroDuxo, Optional optional) {
        rewardsOnboardingIntroDuxo.applyMutation(new RewardsOnboardingIntroDuxo3(optional, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsOnboardingIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDuxo;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$Args;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RewardsOnboardingIntroDuxo, RewardsOnboardingIntroFragmentV2.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardsOnboardingIntroFragmentV2.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RewardsOnboardingIntroFragmentV2.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RewardsOnboardingIntroFragmentV2.Args getArgs(RewardsOnboardingIntroDuxo rewardsOnboardingIntroDuxo) {
            return (RewardsOnboardingIntroFragmentV2.Args) DuxoCompanion.DefaultImpls.getArgs(this, rewardsOnboardingIntroDuxo);
        }
    }
}
