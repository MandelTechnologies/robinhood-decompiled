package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardSuvShimFragment;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.api.bonfire.paymentinstrument.ApiPaymentInstrumentPrecheckResponse;
import com.robinhood.models.api.bonfire.paymentinstrument.PaymentInstrumentPrecheckWorkflowState;
import com.robinhood.rosetta.converters.suv.VerificationWorkflowResults2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DebitCardSuvShimFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002<=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u00020.2\u0006\u00107\u001a\u0002082\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020.0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u000200X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "getPaymentInstrumentBonfireApi", "()Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "setPaymentInstrumentBonfireApi", "(Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;)V", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "getSuvMigrationManager", "()Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "setSuvMigrationManager", "(Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;)V", "<set-?>", "", "hasSuvPrecheckRun", "getHasSuvPrecheckRun", "()Z", "setHasSuvPrecheckRun", "(Z)V", "hasSuvPrecheckRun$delegate", "Lkotlin/properties/ReadWriteProperty;", "Ljava/util/UUID;", "workflowId", "getWorkflowId", "()Ljava/util/UUID;", "setWorkflowId", "(Ljava/util/UUID;)V", "workflowId$delegate", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "launchSuv", "Lkotlin/Function2;", "", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "logSuvEvent", "result", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "Callbacks", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardSuvShimFragment extends AutoLoggableDebitCardLinkingFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;

    /* renamed from: hasSuvPrecheckRun$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasSuvPrecheckRun;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    public PaymentInstrumentBonfireApi paymentInstrumentBonfireApi;
    private final Screen.Name protoScreenName;
    public SuvMigrationManager suvMigrationManager;

    /* renamed from: workflowId$delegate, reason: from kotlin metadata */
    private final Interfaces3 workflowId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DebitCardSuvShimFragment.class, "hasSuvPrecheckRun", "getHasSuvPrecheckRun()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DebitCardSuvShimFragment.class, "workflowId", "getWorkflowId()Ljava/util/UUID;", 0)), Reflection.property1(new PropertyReference1Impl(DebitCardSuvShimFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardSuvShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment$Callbacks;", "", "onWorkflowApproved", "", "onWorkflowUnapproved", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onWorkflowApproved();

        void onWorkflowUnapproved();
    }

    public DebitCardSuvShimFragment() {
        super(C11048R.layout.parent_fragment_container);
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this, false);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.hasSuvPrecheckRun = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[0]);
        this.workflowId = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DebitCardSuvShimFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardSuvShimFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardSuvShimFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.protoScreenName = Screen.Name.NAME_UNSPECIFIED;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final PaymentInstrumentBonfireApi getPaymentInstrumentBonfireApi() {
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi;
        if (paymentInstrumentBonfireApi != null) {
            return paymentInstrumentBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentInstrumentBonfireApi");
        return null;
    }

    public final void setPaymentInstrumentBonfireApi(PaymentInstrumentBonfireApi paymentInstrumentBonfireApi) {
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "<set-?>");
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
    }

    public final SuvMigrationManager getSuvMigrationManager() {
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager;
        if (suvMigrationManager != null) {
            return suvMigrationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suvMigrationManager");
        return null;
    }

    public final void setSuvMigrationManager(SuvMigrationManager suvMigrationManager) {
        Intrinsics.checkNotNullParameter(suvMigrationManager, "<set-?>");
        this.suvMigrationManager = suvMigrationManager;
    }

    private final boolean getHasSuvPrecheckRun() {
        return ((Boolean) this.hasSuvPrecheckRun.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasSuvPrecheckRun(boolean z) {
        this.hasSuvPrecheckRun.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final UUID getWorkflowId() {
        return (UUID) this.workflowId.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWorkflowId(UUID uuid) {
        this.workflowId.setValue(this, $$delegatedProperties[1], uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(DebitCardSuvShimFragment debitCardSuvShimFragment) {
        debitCardSuvShimFragment.logSuvEvent(VerificationWorkflowResult.APPROVED);
        debitCardSuvShimFragment.getCallbacks().onWorkflowApproved();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(DebitCardSuvShimFragment debitCardSuvShimFragment) {
        debitCardSuvShimFragment.logSuvEvent(VerificationWorkflowResult.DENIED);
        debitCardSuvShimFragment.getCallbacks().onWorkflowUnapproved();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Hero(true, true, null, 4, null), null, 2, 0 == true ? 1 : 0)));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getHasSuvPrecheckRun()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C139081(null), 3, null);
    }

    /* compiled from: DebitCardSuvShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment$onViewCreated$1", m3645f = "DebitCardSuvShimFragment.kt", m3646l = {87, 111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment$onViewCreated$1 */
    static final class C139081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C139081(Continuation<? super C139081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardSuvShimFragment.this.new C139081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C139081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objLogResponseMetadataAndUnwrap;
            Object objIsMigrated;
            ApiPaymentInstrumentPrecheckResponse apiPaymentInstrumentPrecheckResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                try {
                    if (!DebitCardSuvShimFragment.this.isAdded()) {
                        return Unit.INSTANCE;
                    }
                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = DebitCardSuvShimFragment.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, th, true, false, 0, null, 56, null);
                } finally {
                    DebitCardSuvShimFragment.this.setHasSuvPrecheckRun(true);
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventLogger eventLogger = DebitCardSuvShimFragment.this.getEventLogger();
                UserInteractionEventData userInteractionEventData = new UserInteractionEventData(null, null, null, UserInteractionEventData.Action.DEBIT_CARD_LINKING_PRECHECK, com.robinhood.rosetta.eventlogging.Context.copy$default(DebitCardSuvShimFragment.this.getLoggingContext(), 0, 0, 0, null, null, null, null, Context.ProductTag.DEBIT_CARD_FUNDING, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -1, -1, -1, 16383, null), null, null, 103, null);
                DebitCardSuvShimFragment2 debitCardSuvShimFragment2 = new DebitCardSuvShimFragment2(DebitCardSuvShimFragment.this, null);
                NetworkContext.Tag tag = NetworkContext.Tag.DEBIT_CARD_LINKING_PRECHECK;
                this.label = 1;
                objLogResponseMetadataAndUnwrap = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventData, debitCardSuvShimFragment2, tag, this);
                if (objLogResponseMetadataAndUnwrap == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiPaymentInstrumentPrecheckResponse = (ApiPaymentInstrumentPrecheckResponse) this.L$0;
                ResultKt.throwOnFailure(obj);
                objIsMigrated = obj;
                DebitCardSuvShimFragment.this.launchSuv.invoke(apiPaymentInstrumentPrecheckResponse.getWorkflow_uuid(), boxing.boxBoolean(((Boolean) objIsMigrated).booleanValue()));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objLogResponseMetadataAndUnwrap = obj;
            ApiPaymentInstrumentPrecheckResponse apiPaymentInstrumentPrecheckResponse2 = (ApiPaymentInstrumentPrecheckResponse) objLogResponseMetadataAndUnwrap;
            DebitCardSuvShimFragment.this.setWorkflowId(apiPaymentInstrumentPrecheckResponse2.getWorkflow_uuid());
            if (apiPaymentInstrumentPrecheckResponse2.getWorkflow_state() == PaymentInstrumentPrecheckWorkflowState.WORKFLOW_STATUS_APPROVED) {
                DebitCardSuvShimFragment.this.getCallbacks().onWorkflowApproved();
                return Unit.INSTANCE;
            }
            SuvMigrationManager suvMigrationManager = DebitCardSuvShimFragment.this.getSuvMigrationManager();
            UUID workflow_uuid = apiPaymentInstrumentPrecheckResponse2.getWorkflow_uuid();
            this.L$0 = apiPaymentInstrumentPrecheckResponse2;
            this.label = 2;
            objIsMigrated = suvMigrationManager.isMigrated(workflow_uuid, this);
            if (objIsMigrated != coroutine_suspended) {
                apiPaymentInstrumentPrecheckResponse = apiPaymentInstrumentPrecheckResponse2;
                DebitCardSuvShimFragment.this.launchSuv.invoke(apiPaymentInstrumentPrecheckResponse.getWorkflow_uuid(), boxing.boxBoolean(((Boolean) objIsMigrated).booleanValue()));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void logSuvEvent(VerificationWorkflowResult result) {
        String string2;
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DEBIT_CARD_LINKING_PRECHECK;
        com.robinhood.rosetta.eventlogging.Context loggingContext = getLoggingContext();
        StepUpVerificationContext.WorkflowStatus protobuf = VerificationWorkflowResults2.toProtobuf(result);
        UUID workflowId = getWorkflowId();
        if (workflowId == null || (string2 = workflowId.toString()) == null) {
            string2 = "";
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(null, null, null, action, com.robinhood.rosetta.eventlogging.Context.copy$default(loggingContext, 0, 0, 0, null, null, null, null, Context.ProductTag.DEBIT_CARD_FUNDING, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new StepUpVerificationContext(protobuf, string2, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1, -1, -262145, -1, -1, 16383, null), null, null, 103, null), false, false, 6, null);
    }

    /* compiled from: DebitCardSuvShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<DebitCardSuvShimFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((DebitCardSuvShimFragment) fragment);
        }

        public Void getArgs(DebitCardSuvShimFragment debitCardSuvShimFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, debitCardSuvShimFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public DebitCardSuvShimFragment newInstance() {
            return (DebitCardSuvShimFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public DebitCardSuvShimFragment newInstance(Void r1) {
            return (DebitCardSuvShimFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
