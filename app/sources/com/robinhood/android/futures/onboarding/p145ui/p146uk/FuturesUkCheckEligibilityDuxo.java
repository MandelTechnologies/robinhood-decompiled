package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkCheckEligibilityFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.futures.FuturesAccountStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesUkCheckEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDataState;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityViewState;", "Lcom/robinhood/android/futures/onboarding/ui/uk/ProceedToNextStepEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesUkCheckEligibilityDuxo extends BaseDuxo3<FuturesUkCheckEligibilityDataState, FuturesUkCheckEligibilityDuxo5, ProceedToNextStepEvent> implements HasSavedState {
    private final FuturesAccountStore futuresAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesUkCheckEligibilityDuxo(FuturesAccountStore futuresAccountStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new FuturesUkCheckEligibilityDataState(((FuturesUkCheckEligibilityFragment.Args) INSTANCE.getArgs(savedStateHandle)).getCheckpoint(), null, null, 6, null), FuturesUkCheckEligibilityDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresAccountStore = futuresAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        withDataState(new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesUkCheckEligibilityDuxo.onCreate$lambda$0(this.f$0, (FuturesUkCheckEligibilityDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(FuturesUkCheckEligibilityDuxo futuresUkCheckEligibilityDuxo, FuturesUkCheckEligibilityDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getCurrentCheckpointSuitability() != null) {
            return Unit.INSTANCE;
        }
        futuresUkCheckEligibilityDuxo.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new FuturesUkCheckEligibilityDuxo3(futuresUkCheckEligibilityDuxo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesUkCheckEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityFragment$Args;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesUkCheckEligibilityDuxo, FuturesUkCheckEligibilityFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesUkCheckEligibilityFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesUkCheckEligibilityFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesUkCheckEligibilityFragment.Args getArgs(FuturesUkCheckEligibilityDuxo futuresUkCheckEligibilityDuxo) {
            return (FuturesUkCheckEligibilityFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, futuresUkCheckEligibilityDuxo);
        }
    }
}
