package com.robinhood.android.acatsin.coowner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.acats.contracts.AcatsFragmentKeys3;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementContract;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import com.robinhood.android.acatsin.coowner.AcatsInCoOwnerState;
import com.robinhood.android.acatsin.coowner.AcatsInCoOwnerState2;
import com.robinhood.android.acatsin.coowner.cancel.AcatsInCoOwnerCancelConfirmationFragment;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.utils.Either;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AcatsInCoOwnerActivity.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001&B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onReviewAssets", "acatsTransferId", "Ljava/util/UUID;", "onAcatReviewed", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "dtccNumber", "onAcatRequestCanceled", "coOwnerName", "onSlipAgreementsUpdated", "slipAgreements", "", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "onAgreementAccepted", "onConfirmationDoneClicked", "onViewDetailsClicked", "handleFlowNavigation", "step", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;", "Companion", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerActivity extends BaseActivity implements AcatsInAgreementContract.Callbacks, AcatsInConfirmationContract.Callbacks, AcatsInCoOwnerReviewContract.Callbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public void onSlipAgreementsUpdated(List<UiSlipAgreements.Agreement> slipAgreements) {
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public AcatsInAgreementContract.Key buildAgreementContract(String str, AcatsInScreenContext acatsInScreenContext, Either<ApiBrokerage, String> either, boolean z, AcatsFlowStep2 acatsFlowStep2, UUID uuid) {
        return AcatsInAgreementContract.Callbacks.DefaultImpls.buildAgreementContract(this, str, acatsInScreenContext, either, z, acatsFlowStep2, uuid);
    }

    public AcatsInCoOwnerActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, AcatsInCoOwnerDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInCoOwnerDuxo getDuxo() {
        return (AcatsInCoOwnerDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            Navigator navigator = getNavigator();
            Companion companion = INSTANCE;
            setFragment(i, Navigator.DefaultImpls.createFragment$default(navigator, new AcatsInCoOwnerReviewContract.Key(((AcatsInCoOwnerIntentKey) companion.getExtras((Activity) this)).getAcatsId(), ((AcatsInCoOwnerIntentKey) companion.getExtras((Activity) this)).getSource()), null, 2, null));
        }
        BaseActivity.collectDuxoState$default(this, null, new C78731(null), 1, null);
    }

    /* compiled from: AcatsInCoOwnerActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.coowner.AcatsInCoOwnerActivity$onCreate$1", m3645f = "AcatsInCoOwnerActivity.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerActivity$onCreate$1 */
    static final class C78731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C78731(Continuation<? super C78731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInCoOwnerActivity.this.new C78731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(AcatsInCoOwnerActivity.this.getDuxo().getEventFlow());
                final AcatsInCoOwnerActivity acatsInCoOwnerActivity = AcatsInCoOwnerActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInCoOwnerState>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AcatsInCoOwnerState> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInCoOwnerState> eventConsumerInvoke;
                        final AcatsInCoOwnerActivity acatsInCoOwnerActivity2 = acatsInCoOwnerActivity;
                        if ((event.getData() instanceof AcatsInCoOwnerState.FlowNavigation) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m10725invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10725invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    acatsInCoOwnerActivity2.handleFlowNavigation(((AcatsInCoOwnerState.FlowNavigation) event.getData()).getNextStep());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract.Callbacks
    public void onReviewAssets(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new AcatsFragmentKeys3(acatsTransferId), null, 2, null));
    }

    @Override // com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract.Callbacks
    public void onAcatReviewed(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, String dtccNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
        getDuxo().onAcatReviewed(rhsAccountNumber, brokerageAccountType, dtccNumber);
        getDuxo().onCompleteStep(AcatsFlowStep.REVIEW_AND_SUBMIT);
    }

    @Override // com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract.Callbacks
    public void onAcatRequestCanceled(String coOwnerName) {
        Intrinsics.checkNotNullParameter(coOwnerName, "coOwnerName");
        replaceFragment(AcatsInCoOwnerCancelConfirmationFragment.INSTANCE.newInstance((Parcelable) new AcatsInCoOwnerCancelConfirmationFragment.Args(coOwnerName)));
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public void onAgreementAccepted() {
        getDuxo().onCompleteStep(AcatsFlowStep.AGREEMENT);
    }

    @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Callbacks
    public void onConfirmationDoneClicked() {
        finish();
    }

    @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Callbacks
    public void onViewDetailsClicked(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACATS_TRANSFER, acatsTransferId, null, false, 12, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFlowNavigation(AcatsInCoOwnerState2 step) {
        FragmentKey key;
        if (step instanceof AcatsInCoOwnerState2.Agreements) {
            AcatsInCoOwnerState2.Agreements agreements = (AcatsInCoOwnerState2.Agreements) step;
            key = AcatsInAgreementContract.Callbacks.DefaultImpls.buildAgreementContract$default(this, agreements.getRhsAccountNumber(), agreements.getScreenContext(), new Either.Right(agreements.getDtccNumber()), false, AcatsFlowStep2.ACATS_IN_CO_OWNER_CONFIRM, ((AcatsInCoOwnerIntentKey) INSTANCE.getExtras((Activity) this)).getAcatsId(), 8, null);
        } else {
            if (!(step instanceof AcatsInCoOwnerState2.Confirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            AcatsInCoOwnerState2.Confirmation confirmation = (AcatsInCoOwnerState2.Confirmation) step;
            key = new AcatsInConfirmationContract.Key(confirmation.getScreenContext(), new Either.Right(confirmation.getDtccNumber()), confirmation.getAcatsTransferId(), confirmation.getConfirmationTitle(), confirmation.getConfirmationDescription(), false, confirmation.isFromTransferDetails());
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), key, null, 2, null));
    }

    /* compiled from: AcatsInCoOwnerActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerActivity;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerIntentKey;", "<init>", "()V", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<AcatsInCoOwnerActivity, AcatsInCoOwnerIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public AcatsInCoOwnerIntentKey getExtras(AcatsInCoOwnerActivity acatsInCoOwnerActivity) {
            return (AcatsInCoOwnerIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, acatsInCoOwnerActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, AcatsInCoOwnerIntentKey acatsInCoOwnerIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, acatsInCoOwnerIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, AcatsInCoOwnerIntentKey acatsInCoOwnerIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, acatsInCoOwnerIntentKey);
        }
    }
}
