package com.robinhood.android.beneficiaries.p067ui.trustflow.date;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.p067ui.trustflow.date.BeneficiaryTrustDateFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.card.p311db.Card;
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
import p479j$.time.Clock;

/* compiled from: BeneficiaryTrustDateDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;)V", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "keyEvent", "", "onTrustDateInput", "(Landroid/view/KeyEvent;)V", "", "string", "(Ljava/lang/String;)V", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryTrustDateDuxo extends BaseDuxo4<BeneficiaryTrustDateViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeneficiaryTrustDateDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, Clock clock) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Companion companion = INSTANCE;
        super(new BeneficiaryTrustDateViewState(((BeneficiaryTrustDateFragment.Args) companion.getArgs(savedStateHandle)).getTrustDateViewModel(), BeneficiaryTrustDateDuxo2.formatDateFromBackendToAndroid(((BeneficiaryTrustDateFragment.Args) companion.getArgs(savedStateHandle)).getTrustDateViewModel().getAndroid_format_template(), ((BeneficiaryTrustDateFragment.Args) companion.getArgs(savedStateHandle)).getTrustDateViewModel().getDate_value()), StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]), clock), duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: BeneficiaryTrustDateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.date.BeneficiaryTrustDateDuxo$onTrustDateInput$1", m3645f = "BeneficiaryTrustDateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.date.BeneficiaryTrustDateDuxo$onTrustDateInput$1 */
    static final class C98171 extends ContinuationImpl7 implements Function2<BeneficiaryTrustDateViewState, Continuation<? super BeneficiaryTrustDateViewState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BeneficiaryTrustDateDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98171(KeyEvent keyEvent, BeneficiaryTrustDateDuxo beneficiaryTrustDateDuxo, Continuation<? super C98171> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
            this.this$0 = beneficiaryTrustDateDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98171 c98171 = new C98171(this.$keyEvent, this.this$0, continuation);
            c98171.L$0 = obj;
            return c98171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryTrustDateViewState beneficiaryTrustDateViewState, Continuation<? super BeneficiaryTrustDateViewState> continuation) {
            return ((C98171) create(beneficiaryTrustDateViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BeneficiaryTrustDateViewState beneficiaryTrustDateViewState = (BeneficiaryTrustDateViewState) this.L$0;
            if (KeyEvents2.isDelete(this.$keyEvent)) {
                return BeneficiaryTrustDateViewState.copy$default(beneficiaryTrustDateViewState, null, StringsKt.dropLast(beneficiaryTrustDateViewState.getTrustDateInputString(), 1), null, null, 13, null);
            }
            if (beneficiaryTrustDateViewState.getTrustDateInputString().length() >= ((BeneficiaryTrustDateFragment.Args) BeneficiaryTrustDateDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTrustDateViewModel().getAndroid_format_template().length() || !KeyEvents2.isDigit(this.$keyEvent)) {
                return beneficiaryTrustDateViewState;
            }
            return BeneficiaryTrustDateViewState.copy$default(beneficiaryTrustDateViewState, null, beneficiaryTrustDateViewState.getTrustDateInputString() + this.$keyEvent.getNumber(), null, null, 13, null);
        }
    }

    public final void onTrustDateInput(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C98171(keyEvent, this, null));
    }

    /* compiled from: BeneficiaryTrustDateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.date.BeneficiaryTrustDateDuxo$onTrustDateInput$2", m3645f = "BeneficiaryTrustDateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.date.BeneficiaryTrustDateDuxo$onTrustDateInput$2 */
    static final class C98182 extends ContinuationImpl7 implements Function2<BeneficiaryTrustDateViewState, Continuation<? super BeneficiaryTrustDateViewState>, Object> {
        final /* synthetic */ String $string;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BeneficiaryTrustDateDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C98182(String str, BeneficiaryTrustDateDuxo beneficiaryTrustDateDuxo, Continuation<? super C98182> continuation) {
            super(2, continuation);
            this.$string = str;
            this.this$0 = beneficiaryTrustDateDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98182 c98182 = new C98182(this.$string, this.this$0, continuation);
            c98182.L$0 = obj;
            return c98182;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryTrustDateViewState beneficiaryTrustDateViewState, Continuation<? super BeneficiaryTrustDateViewState> continuation) {
            return ((C98182) create(beneficiaryTrustDateViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BeneficiaryTrustDateViewState beneficiaryTrustDateViewState = (BeneficiaryTrustDateViewState) this.L$0;
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
            return string2.length() > ((BeneficiaryTrustDateFragment.Args) BeneficiaryTrustDateDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTrustDateViewModel().getAndroid_format_template().length() ? beneficiaryTrustDateViewState : BeneficiaryTrustDateViewState.copy$default(beneficiaryTrustDateViewState, null, string2, null, null, 13, null);
        }
    }

    public final void onTrustDateInput(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        applyMutation(new C98182(string2, this, null));
    }

    /* compiled from: BeneficiaryTrustDateDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateDuxo;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryTrustDateDuxo, BeneficiaryTrustDateFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryTrustDateFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BeneficiaryTrustDateFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BeneficiaryTrustDateFragment.Args getArgs(BeneficiaryTrustDateDuxo beneficiaryTrustDateDuxo) {
            return (BeneficiaryTrustDateFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryTrustDateDuxo);
        }
    }
}
