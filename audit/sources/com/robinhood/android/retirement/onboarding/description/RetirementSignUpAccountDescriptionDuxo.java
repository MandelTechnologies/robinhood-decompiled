package com.robinhood.android.retirement.onboarding.description;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpAccountDescriptionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpAccountDescriptionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionDataState;", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "signUpFlowStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "loadAccountDescription", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpAccountDescriptionDuxo extends BaseDuxo<AccountDescriptionDataState, AccountDescriptionViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final RetirementOnboardingStore signUpFlowStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpAccountDescriptionDuxo(RetirementOnboardingStore signUpFlowStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AccountDescriptionDataState(((RetirementSignUpFlowAccountDescriptionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getAccountType(), null, null, 6, null), AccountDescriptionDataState.INSTANCE.getStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(signUpFlowStore, "signUpFlowStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.signUpFlowStore = signUpFlowStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        loadAccountDescription();
    }

    public final void loadAccountDescription() {
        LifecycleHost.DefaultImpls.bind$default(this, this.signUpFlowStore.getRetirementSignupFlow(((RetirementSignUpFlowAccountDescriptionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpAccountDescriptionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpAccountDescriptionDuxo.loadAccountDescription$lambda$0(this.f$0, (ApiRetirementSignUpFlow) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpAccountDescriptionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpAccountDescriptionDuxo.loadAccountDescription$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAccountDescription$lambda$0(RetirementSignUpAccountDescriptionDuxo retirementSignUpAccountDescriptionDuxo, ApiRetirementSignUpFlow signUpFlow) {
        Intrinsics.checkNotNullParameter(signUpFlow, "signUpFlow");
        retirementSignUpAccountDescriptionDuxo.applyMutation(new RetirementSignUpAccountDescriptionDuxo2(signUpFlow, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAccountDescription$lambda$1(RetirementSignUpAccountDescriptionDuxo retirementSignUpAccountDescriptionDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        retirementSignUpAccountDescriptionDuxo.applyMutation(new RetirementSignUpAccountDescriptionDuxo3(t, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementSignUpAccountDescriptionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpAccountDescriptionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpAccountDescriptionDuxo;", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementSignUpAccountDescriptionDuxo, RetirementSignUpFlowAccountDescriptionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowAccountDescriptionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementSignUpFlowAccountDescriptionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowAccountDescriptionFragment.Args getArgs(RetirementSignUpAccountDescriptionDuxo retirementSignUpAccountDescriptionDuxo) {
            return (RetirementSignUpFlowAccountDescriptionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementSignUpAccountDescriptionDuxo);
        }
    }
}
