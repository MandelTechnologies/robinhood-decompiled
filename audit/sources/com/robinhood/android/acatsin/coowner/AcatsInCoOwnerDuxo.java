package com.robinhood.android.acatsin.coowner;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acatsin.coowner.AcatsInCoOwnerState;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerViewState;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCompleteStep", "", "step", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "onAcatReviewed", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "dtccNumber", "Companion", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerDuxo extends BaseDuxo5<AcatsInCoOwnerViewState, AcatsInCoOwnerState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInCoOwnerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AcatsFlowStep.values().length];
            try {
                iArr[AcatsFlowStep.REVIEW_AND_SUBMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsFlowStep.AGREEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInCoOwnerDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsInCoOwnerViewState(((AcatsInCoOwnerIntentKey) companion.getExtras(savedStateHandle)).getSource(), ((AcatsInCoOwnerIntentKey) companion.getExtras(savedStateHandle)).isFromTransferDetails(), ((AcatsInCoOwnerIntentKey) companion.getExtras(savedStateHandle)).getAcatsId(), null, null, null, null, null, null, 504, null), duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    public final void onCompleteStep(final AcatsFlowStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInCoOwnerDuxo.onCompleteStep$lambda$0(step, this, (AcatsInCoOwnerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCompleteStep$lambda$0(AcatsFlowStep acatsFlowStep, AcatsInCoOwnerDuxo acatsInCoOwnerDuxo, AcatsInCoOwnerViewState viewState) {
        AcatsInCoOwnerState2 acatsInCoOwnerState2BuildAgreementsStep;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        int i = WhenMappings.$EnumSwitchMapping$0[acatsFlowStep.ordinal()];
        if (i == 1) {
            acatsInCoOwnerState2BuildAgreementsStep = viewState.buildAgreementsStep();
        } else if (i == 2) {
            acatsInCoOwnerState2BuildAgreementsStep = viewState.buildConfirmationStep();
        } else {
            throw new IllegalStateException(("Invalid Co-owner ACAT in flow step: " + acatsFlowStep).toString());
        }
        acatsInCoOwnerDuxo.submit(new AcatsInCoOwnerState.FlowNavigation(acatsInCoOwnerState2BuildAgreementsStep));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInCoOwnerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.AcatsInCoOwnerDuxo$onAcatReviewed$1", m3645f = "AcatsInCoOwnerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerDuxo$onAcatReviewed$1 */
    static final class C78741 extends ContinuationImpl7 implements Function2<AcatsInCoOwnerViewState, Continuation<? super AcatsInCoOwnerViewState>, Object> {
        final /* synthetic */ BrokerageAccountType $brokerageAccountType;
        final /* synthetic */ String $dtccNumber;
        final /* synthetic */ String $rhsAccountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78741(String str, BrokerageAccountType brokerageAccountType, String str2, Continuation<? super C78741> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
            this.$brokerageAccountType = brokerageAccountType;
            this.$dtccNumber = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78741 c78741 = new C78741(this.$rhsAccountNumber, this.$brokerageAccountType, this.$dtccNumber, continuation);
            c78741.L$0 = obj;
            return c78741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInCoOwnerViewState acatsInCoOwnerViewState, Continuation<? super AcatsInCoOwnerViewState> continuation) {
            return ((C78741) create(acatsInCoOwnerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInCoOwnerViewState.copy$default((AcatsInCoOwnerViewState) this.L$0, null, false, null, this.$rhsAccountNumber, this.$brokerageAccountType, this.$dtccNumber, null, null, null, 455, null);
        }
    }

    public final void onAcatReviewed(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, String dtccNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
        applyMutation(new C78741(rhsAccountNumber, brokerageAccountType, dtccNumber, null));
    }

    /* compiled from: AcatsInCoOwnerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerDuxo;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerIntentKey;", "<init>", "()V", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<AcatsInCoOwnerDuxo, AcatsInCoOwnerIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public AcatsInCoOwnerIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (AcatsInCoOwnerIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public AcatsInCoOwnerIntentKey getExtras(AcatsInCoOwnerDuxo acatsInCoOwnerDuxo) {
            return (AcatsInCoOwnerIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, acatsInCoOwnerDuxo);
        }
    }
}
