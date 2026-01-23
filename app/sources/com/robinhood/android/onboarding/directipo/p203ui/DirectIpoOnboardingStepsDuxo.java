package com.robinhood.android.onboarding.directipo.p203ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboarding;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingStepsDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setSelectedPage", "position", "", "Companion", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DirectIpoOnboardingStepsDuxo extends OldBaseDuxo<DirectIpoOnboardingStepsViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectIpoOnboardingStepsDuxo(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        super(new DirectIpoOnboardingStepsViewState(null, objArr, 3, 0 == true ? 1 : 0), objArr2, 2, 0 == true ? 1 : 0);
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOnboardingStepsDuxo.onCreate$lambda$0(this.f$0, (DirectIpoOnboardingStepsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOnboardingStepsViewState onCreate$lambda$0(DirectIpoOnboardingStepsDuxo directIpoOnboardingStepsDuxo, DirectIpoOnboardingStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOnboardingStepsViewState.copy$default(applyMutation, (UiDirectIpoOnboarding) INSTANCE.getArgs((HasSavedState) directIpoOnboardingStepsDuxo), null, 2, null);
    }

    public final void setSelectedPage(final int position) {
        applyMutation(new Function1() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOnboardingStepsDuxo.setSelectedPage$lambda$1(position, (DirectIpoOnboardingStepsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOnboardingStepsViewState setSelectedPage$lambda$1(int i, DirectIpoOnboardingStepsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOnboardingStepsViewState.copy$default(applyMutation, null, Integer.valueOf(i), 1, null);
    }

    /* compiled from: DirectIpoOnboardingStepsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingStepsDuxo;", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "<init>", "()V", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectIpoOnboardingStepsDuxo, UiDirectIpoOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UiDirectIpoOnboarding getArgs(SavedStateHandle savedStateHandle) {
            return (UiDirectIpoOnboarding) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UiDirectIpoOnboarding getArgs(DirectIpoOnboardingStepsDuxo directIpoOnboardingStepsDuxo) {
            return (UiDirectIpoOnboarding) DuxoCompanion.DefaultImpls.getArgs(this, directIpoOnboardingStepsDuxo);
        }
    }
}
