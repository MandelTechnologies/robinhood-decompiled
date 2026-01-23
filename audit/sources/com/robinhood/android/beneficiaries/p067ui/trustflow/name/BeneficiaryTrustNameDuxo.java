package com.robinhood.android.beneficiaries.p067ui.trustflow.name;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModel;
import com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryTrustNameDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onTrustNameInput", "", "input", "", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryTrustNameDuxo extends BaseDuxo4<BeneficiaryTrustNameViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeneficiaryTrustNameDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        BeneficiaryFlowTrustNameViewModel trustNameViewModel = ((BeneficiaryTrustNameFragment.Args) companion.getArgs(savedStateHandle)).getTrustNameViewModel();
        String trust_name_value = ((BeneficiaryTrustNameFragment.Args) companion.getArgs(savedStateHandle)).getTrustNameViewModel().getTrust_name_value();
        super(new BeneficiaryTrustNameViewState(trustNameViewModel, trust_name_value == null ? "" : trust_name_value, StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0])), duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: BeneficiaryTrustNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameDuxo$onTrustNameInput$1", m3645f = "BeneficiaryTrustNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameDuxo$onTrustNameInput$1 */
    static final class C98381 extends ContinuationImpl7 implements Function2<BeneficiaryTrustNameViewState, Continuation<? super BeneficiaryTrustNameViewState>, Object> {
        final /* synthetic */ String $input;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98381(String str, Continuation<? super C98381> continuation) {
            super(2, continuation);
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98381 c98381 = new C98381(this.$input, continuation);
            c98381.L$0 = obj;
            return c98381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryTrustNameViewState beneficiaryTrustNameViewState, Continuation<? super BeneficiaryTrustNameViewState> continuation) {
            return ((C98381) create(beneficiaryTrustNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryTrustNameViewState.copy$default((BeneficiaryTrustNameViewState) this.L$0, null, this.$input, null, 5, null);
        }
    }

    public final void onTrustNameInput(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        applyMutation(new C98381(input, null));
    }

    /* compiled from: BeneficiaryTrustNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryTrustNameDuxo, BeneficiaryTrustNameFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryTrustNameFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryTrustNameFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryTrustNameFragment.Args getArgs(BeneficiaryTrustNameDuxo beneficiaryTrustNameDuxo) {
            return (BeneficiaryTrustNameFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryTrustNameDuxo);
        }
    }
}
