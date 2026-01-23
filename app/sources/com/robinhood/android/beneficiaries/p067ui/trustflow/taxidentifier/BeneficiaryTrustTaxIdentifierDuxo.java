package com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustTaxIdentifierViewModel;
import com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.resource.StringResource;
import java.io.IOException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BeneficiaryTrustTaxIdentifierDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onTrustTaxIdentifierInput", "", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "string", "", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryTrustTaxIdentifierDuxo extends BaseDuxo4<BeneficiaryTrustTaxIdentifierViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeneficiaryTrustTaxIdentifierDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        BeneficiaryFlowTrustTaxIdentifierViewModel trustTaxIdentifierViewModel = ((BeneficiaryTrustTaxIdentifierFragment.Args) companion.getArgs(savedStateHandle)).getTrustTaxIdentifierViewModel();
        String tax_identifier_value = ((BeneficiaryTrustTaxIdentifierFragment.Args) companion.getArgs(savedStateHandle)).getTrustTaxIdentifierViewModel().getTax_identifier_value();
        super(new BeneficiaryTrustTaxIdentifierViewState(trustTaxIdentifierViewModel, tax_identifier_value == null ? "" : tax_identifier_value, StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0])), duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: BeneficiaryTrustTaxIdentifierDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierDuxo$onTrustTaxIdentifierInput$1", m3645f = "BeneficiaryTrustTaxIdentifierDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierDuxo$onTrustTaxIdentifierInput$1 */
    static final class C98461 extends ContinuationImpl7 implements Function2<BeneficiaryTrustTaxIdentifierViewState, Continuation<? super BeneficiaryTrustTaxIdentifierViewState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98461(KeyEvent keyEvent, Continuation<? super C98461> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98461 c98461 = new C98461(this.$keyEvent, continuation);
            c98461.L$0 = obj;
            return c98461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, Continuation<? super BeneficiaryTrustTaxIdentifierViewState> continuation) {
            return ((C98461) create(beneficiaryTrustTaxIdentifierViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState = (BeneficiaryTrustTaxIdentifierViewState) this.L$0;
            if (KeyEvents2.isDelete(this.$keyEvent)) {
                return BeneficiaryTrustTaxIdentifierViewState.copy$default(beneficiaryTrustTaxIdentifierViewState, null, StringsKt.dropLast(beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierInputString(), 1), null, 5, null);
            }
            if (beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierInputString().length() >= 9 || !KeyEvents2.isDigit(this.$keyEvent)) {
                return beneficiaryTrustTaxIdentifierViewState;
            }
            return BeneficiaryTrustTaxIdentifierViewState.copy$default(beneficiaryTrustTaxIdentifierViewState, null, beneficiaryTrustTaxIdentifierViewState.getTrustTaxIdentifierInputString() + this.$keyEvent.getNumber(), null, 5, null);
        }
    }

    public final void onTrustTaxIdentifierInput(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C98461(keyEvent, null));
    }

    /* compiled from: BeneficiaryTrustTaxIdentifierDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierDuxo$onTrustTaxIdentifierInput$2", m3645f = "BeneficiaryTrustTaxIdentifierDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierDuxo$onTrustTaxIdentifierInput$2 */
    static final class C98472 extends ContinuationImpl7 implements Function2<BeneficiaryTrustTaxIdentifierViewState, Continuation<? super BeneficiaryTrustTaxIdentifierViewState>, Object> {
        final /* synthetic */ String $string;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98472(String str, Continuation<? super C98472> continuation) {
            super(2, continuation);
            this.$string = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98472 c98472 = new C98472(this.$string, continuation);
            c98472.L$0 = obj;
            return c98472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, Continuation<? super BeneficiaryTrustTaxIdentifierViewState> continuation) {
            return ((C98472) create(beneficiaryTrustTaxIdentifierViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState = (BeneficiaryTrustTaxIdentifierViewState) this.L$0;
            String str = this.$string;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            return string2.length() > 9 ? beneficiaryTrustTaxIdentifierViewState : BeneficiaryTrustTaxIdentifierViewState.copy$default(beneficiaryTrustTaxIdentifierViewState, null, string2, null, 5, null);
        }
    }

    public final void onTrustTaxIdentifierInput(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        applyMutation(new C98472(string2, null));
    }

    /* compiled from: BeneficiaryTrustTaxIdentifierDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryTrustTaxIdentifierDuxo, BeneficiaryTrustTaxIdentifierFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryTrustTaxIdentifierFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryTrustTaxIdentifierFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryTrustTaxIdentifierFragment.Args getArgs(BeneficiaryTrustTaxIdentifierDuxo beneficiaryTrustTaxIdentifierDuxo) {
            return (BeneficiaryTrustTaxIdentifierFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryTrustTaxIdentifierDuxo);
        }
    }
}
