package com.robinhood.android.retirement.onboarding.agreements;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementsFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.store.AsyncResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementSignUpFlowAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u0005:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsDataState;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchSignupFlow", "", "onStart", "onSlipToggled", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "enabled", "", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAgreementDuxo extends BaseDuxo<RetirementAgreementsDataState, AsyncResult<? extends RetirementAgreementsViewState>> implements HasSavedState {
    private final RetirementOnboardingStore retirementOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpFlowAgreementDuxo(RetirementOnboardingStore retirementOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RetirementAgreementsDataState(((RetirementSignUpFlowAgreementsFragment.Args) INSTANCE.getArgs(savedStateHandle)).getAccountType(), null, null, null, 14, null), RetirementAgreementsDataState.INSTANCE.getStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.retirementOnboardingStore = retirementOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void fetchSignupFlow() {
        LifecycleHost.DefaultImpls.bind$default(this, this.retirementOnboardingStore.getRetirementSignupFlow(((RetirementSignUpFlowAgreementsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowAgreementDuxo.fetchSignupFlow$lambda$0(this.f$0, (ApiRetirementSignUpFlow) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowAgreementDuxo.fetchSignupFlow$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSignupFlow$lambda$0(RetirementSignUpFlowAgreementDuxo retirementSignUpFlowAgreementDuxo, ApiRetirementSignUpFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        retirementSignUpFlowAgreementDuxo.applyMutation(new RetirementSignUpFlowAgreementDuxo2(flow, retirementSignUpFlowAgreementDuxo, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSignupFlow$lambda$1(RetirementSignUpFlowAgreementDuxo retirementSignUpFlowAgreementDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        retirementSignUpFlowAgreementDuxo.applyMutation(new RetirementSignUpFlowAgreementDuxo3(throwable, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchSignupFlow();
    }

    /* compiled from: RetirementSignUpFlowAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$onSlipToggled$1", m3645f = "RetirementSignUpFlowAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxo$onSlipToggled$1 */
    static final class C270631 extends ContinuationImpl7 implements Function2<RetirementAgreementsDataState, Continuation<? super RetirementAgreementsDataState>, Object> {
        final /* synthetic */ BrokerageAccountType $accountType;
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C270631(BrokerageAccountType brokerageAccountType, boolean z, Continuation<? super C270631> continuation) {
            super(2, continuation);
            this.$accountType = brokerageAccountType;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C270631 c270631 = new C270631(this.$accountType, this.$enabled, continuation);
            c270631.L$0 = obj;
            return c270631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementAgreementsDataState retirementAgreementsDataState, Continuation<? super RetirementAgreementsDataState> continuation) {
            return ((C270631) create(retirementAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RetirementAgreementsDataState retirementAgreementsDataState = (RetirementAgreementsDataState) this.L$0;
            List<SlipCheckboxState> slipCheckboxStates = retirementAgreementsDataState.getSlipCheckboxStates();
            BrokerageAccountType brokerageAccountType = this.$accountType;
            boolean z = this.$enabled;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(slipCheckboxStates, 10));
            for (SlipCheckboxState slipCheckboxStateCopy$default : slipCheckboxStates) {
                if (slipCheckboxStateCopy$default.getAccountType() == brokerageAccountType) {
                    slipCheckboxStateCopy$default = SlipCheckboxState.copy$default(slipCheckboxStateCopy$default, null, null, z, 3, null);
                }
                arrayList.add(slipCheckboxStateCopy$default);
            }
            return RetirementAgreementsDataState.copy$default(retirementAgreementsDataState, null, null, null, arrayList, 7, null);
        }
    }

    public final void onSlipToggled(BrokerageAccountType accountType, boolean enabled) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        applyMutation(new C270631(accountType, enabled, null));
    }

    /* compiled from: RetirementSignUpFlowAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementDuxo;", "Lcom/robinhood/android/retirement/onboarding/agreements/RetirementSignUpFlowAgreementsFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementSignUpFlowAgreementDuxo, RetirementSignUpFlowAgreementsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowAgreementsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementSignUpFlowAgreementsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowAgreementsFragment.Args getArgs(RetirementSignUpFlowAgreementDuxo retirementSignUpFlowAgreementDuxo) {
            return (RetirementSignUpFlowAgreementsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowAgreementDuxo);
        }
    }
}
