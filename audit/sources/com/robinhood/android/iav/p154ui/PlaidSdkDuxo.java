package com.robinhood.android.iav.p154ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.iav.p154ui.PlaidSdkEvent;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PreparePaymentInstrumentDetails;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: PlaidSdkDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u001c\u001a\u00020\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidSdkDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/iav/ui/PlaidSdkEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "packageName", "", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;Lcom/robinhood/analytics/EventLogger;Ljava/lang/String;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "", "hasLauchedMicrodepositsFlow", "getHasLauchedMicrodepositsFlow", "()Z", "setHasLauchedMicrodepositsFlow", "(Z)V", "getLinkToken", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PlaidSdkDuxo extends BaseDuxo5<Unit, PlaidSdkEvent> implements HasSavedState {
    public static final String HAS_LAUNCHED_MICRODEPOSITS_FLOW = "hasLaunchedMicrodepositsFlow";
    private final EventLogger eventLogger;
    private final String packageName;
    private final PlaidConnectApi plaidConnectApi;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSdkDuxo(SuvWorkflowManager suvWorkflowManager, PlaidConnectApi plaidConnectApi, EventLogger eventLogger, @ApplicationPackageInfoModule2 String packageName, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.suvWorkflowManager = suvWorkflowManager;
        this.plaidConnectApi = plaidConnectApi;
        this.eventLogger = eventLogger;
        this.packageName = packageName;
        this.savedStateHandle = savedStateHandle;
    }

    public final boolean getHasLauchedMicrodepositsFlow() {
        Boolean bool = (Boolean) getSavedStateHandle().get(HAS_LAUNCHED_MICRODEPOSITS_FLOW);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setHasLauchedMicrodepositsFlow(boolean z) {
        getSavedStateHandle().set(HAS_LAUNCHED_MICRODEPOSITS_FLOW, Boolean.valueOf(z));
    }

    public final void getLinkToken() {
        if (getHasLauchedMicrodepositsFlow()) {
            return;
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.PLAID_SDK_OPEN, true);
        this.suvWorkflowManager.handleRequest(new C185011(null), new Function1() { // from class: com.robinhood.android.iav.ui.PlaidSdkDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidSdkDuxo.getLinkToken$lambda$0(this.f$0, (PreparePaymentInstrumentDetails) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidSdkDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidSdkDuxo.getLinkToken$lambda$1(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.iav.ui.PlaidSdkDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PlaidSdkDuxo.getLinkToken$lambda$2(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* compiled from: PlaidSdkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PreparePaymentInstrumentDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidSdkDuxo$getLinkToken$1", m3645f = "PlaidSdkDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidSdkDuxo$getLinkToken$1 */
    static final class C185011 extends ContinuationImpl7 implements Function1<Continuation<? super PreparePaymentInstrumentDetails>, Object> {
        int label;

        C185011(Continuation<? super C185011> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PlaidSdkDuxo.this.new C185011(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PreparePaymentInstrumentDetails> continuation) {
            return ((C185011) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            EventLogger eventLogger = PlaidSdkDuxo.this.eventLogger;
            UserInteractionEventData userInteractionEventData = new UserInteractionEventData(null, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -1, -1, -1, 16383, null), null, null, 111, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(PlaidSdkDuxo.this, null);
            NetworkContext.Tag tag = NetworkContext.Tag.IAV_LINK_TOKEN;
            this.label = 1;
            Object objLogResponseMetadataAndUnwrap = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventData, anonymousClass1, tag, this);
            return objLogResponseMetadataAndUnwrap == coroutine_suspended ? coroutine_suspended : objLogResponseMetadataAndUnwrap;
        }

        /* compiled from: PlaidSdkDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PreparePaymentInstrumentDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidSdkDuxo$getLinkToken$1$1", m3645f = "PlaidSdkDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.iav.ui.PlaidSdkDuxo$getLinkToken$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super Response<PreparePaymentInstrumentDetails>>, Object> {
            int label;
            final /* synthetic */ PlaidSdkDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PlaidSdkDuxo plaidSdkDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = plaidSdkDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Response<PreparePaymentInstrumentDetails>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                PlaidConnectApi plaidConnectApi = this.this$0.plaidConnectApi;
                PreparePaymentInstrumentRequest preparePaymentInstrumentRequest = new PreparePaymentInstrumentRequest(new PreparePaymentInstrumentRequest2.PrepareBankAccountRequestDetails(null, this.this$0.packageName, 1, null), PaymentInstrumentType.BANK_ACCOUNT.getServerValue());
                this.label = 1;
                Object objPrepare = plaidConnectApi.prepare(preparePaymentInstrumentRequest, this);
                return objPrepare == coroutine_suspended ? coroutine_suspended : objPrepare;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLinkToken$lambda$0(PlaidSdkDuxo plaidSdkDuxo, PreparePaymentInstrumentDetails paymentInstrumentDetails) {
        Intrinsics.checkNotNullParameter(paymentInstrumentDetails, "paymentInstrumentDetails");
        plaidSdkDuxo.submit(new PlaidSdkEvent.LinkTokenEvent(((PreparePaymentInstrumentDetails.BankAccount) paymentInstrumentDetails).getPayment_instrument_details().getLink_token()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLinkToken$lambda$1(PlaidSdkDuxo plaidSdkDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        plaidSdkDuxo.submit(new PlaidSdkEvent.ErrorEvent(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLinkToken$lambda$2(PlaidSdkDuxo plaidSdkDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        plaidSdkDuxo.submit(new PlaidSdkEvent.VerificationWorkflowEvent(workflowId, z));
        return Unit.INSTANCE;
    }
}
