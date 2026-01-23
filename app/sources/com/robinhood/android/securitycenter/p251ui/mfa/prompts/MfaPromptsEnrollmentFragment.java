package com.robinhood.android.securitycenter.p251ui.mfa.prompts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.p251ui.mfa.prompts.MfaPromptsEnrollmentEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MfaPromptsEnrollmentFragment.kt */
@Metadata(m3635d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0016\b\u0007\u0018\u0000 12\u00020\u0001:\u0003/01B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010%\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "errorHandler", "com/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$errorHandler$2$1;", "errorHandler$delegate", "toolbarVisible", "getToolbarVisible", "()Z", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentEvent;", "showErrorDialog", "message", "", "onDialogDismissed", "id", "", "Callbacks", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaPromptsEnrollmentFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MfaPromptsEnrollmentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaPromptsEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Callbacks;", "", "onFinishMfaFlow", "", "hasCompletedSetup", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFinishMfaFlow(boolean hasCompletedSetup);
    }

    public MfaPromptsEnrollmentFragment() {
        super(C28186R.layout.fragment_mfa_prompts_enrollment);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, MfaPromptsEnrollmentDuxo.class);
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaPromptsEnrollmentFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaPromptsEnrollmentFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaPromptsEnrollmentFragment.errorHandler_delegate$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaPromptsEnrollmentDuxo getDuxo() {
        return (MfaPromptsEnrollmentDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<MfaPromptsEnrollmentEvent> event) {
        EventConsumer<MfaPromptsEnrollmentEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof MfaPromptsEnrollmentEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18824invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18824invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MfaPromptsEnrollmentEvent mfaPromptsEnrollmentEvent = (MfaPromptsEnrollmentEvent) event.getData();
                if (mfaPromptsEnrollmentEvent instanceof MfaPromptsEnrollmentEvent.ErrorEvent) {
                    MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment = this;
                    String string2 = mfaPromptsEnrollmentFragment.getString(C11048R.string.general_error_summary);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    mfaPromptsEnrollmentFragment.showErrorDialog(string2);
                    return;
                }
                if (mfaPromptsEnrollmentEvent instanceof MfaPromptsEnrollmentEvent.NetworkErrorEvent) {
                    AbsErrorHandler.handleError$default(this.getErrorHandler(), ((MfaPromptsEnrollmentEvent.NetworkErrorEvent) mfaPromptsEnrollmentEvent).getThrowable(), false, 2, null);
                    return;
                }
                if (mfaPromptsEnrollmentEvent instanceof MfaPromptsEnrollmentEvent.SuccessEvent) {
                    this.getCallbacks().onFinishMfaFlow(true);
                    FragmentKey valuePropsFragmentKey = ((MfaPromptsEnrollmentEvent.SuccessEvent) mfaPromptsEnrollmentEvent).getValuePropsFragmentKey();
                    if (valuePropsFragmentKey != null) {
                        Navigator navigator = this.getNavigator();
                        Context contextRequireContext = this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, valuePropsFragmentKey, false, false, false, false, null, false, null, null, 988, null);
                        return;
                    }
                    return;
                }
                if (mfaPromptsEnrollmentEvent instanceof MfaPromptsEnrollmentEvent.VerificationWorkflowEvent) {
                    MfaPromptsEnrollmentEvent.VerificationWorkflowEvent verificationWorkflowEvent = (MfaPromptsEnrollmentEvent.VerificationWorkflowEvent) mfaPromptsEnrollmentEvent;
                    this.launchSuv.invoke(verificationWorkflowEvent.getWorkflowId(), Boolean.valueOf(verificationWorkflowEvent.isMigrated()));
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment) {
        mfaPromptsEnrollmentFragment.getDuxo().enrollInPrompts();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment) {
        mfaPromptsEnrollmentFragment.getCallbacks().onFinishMfaFlow(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaPromptsEnrollmentFragment2 getErrorHandler() {
        return (MfaPromptsEnrollmentFragment2) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$errorHandler$2$1] */
    public static final MfaPromptsEnrollmentFragment2 errorHandler_delegate$lambda$3(final MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment) {
        final FragmentActivity fragmentActivityRequireActivity = mfaPromptsEnrollmentFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, false, 0, null, 14, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showShortError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.this$0.showErrorDialog(message);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showLongError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.this$0.showErrorDialog(message);
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: MfaPromptsEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$onViewCreated$1", m3645f = "MfaPromptsEnrollmentFragment.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$onViewCreated$1 */
    static final class C282771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C282771(Continuation<? super C282771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MfaPromptsEnrollmentFragment.this.new C282771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaPromptsEnrollmentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.prompts.MfaPromptsEnrollmentFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MfaPromptsEnrollmentFragment $tmp0;

            AnonymousClass1(MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment) {
                this.$tmp0 = mfaPromptsEnrollmentFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MfaPromptsEnrollmentFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<MfaPromptsEnrollmentEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C282771.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<MfaPromptsEnrollmentEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MfaPromptsEnrollmentFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MfaPromptsEnrollmentFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment, Event event, Continuation continuation) {
            mfaPromptsEnrollmentFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C282771(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorDialog(String message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder message2 = companion.create(fragmentActivityRequireActivity).setId(C11048R.id.dialog_id_generic_error).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onFinishMfaFlow(false);
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: MfaPromptsEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Args;", "Landroid/os/Parcelable;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "isFromCryptoTransfersEnrollment", "", "<init>", "(Ljava/util/UUID;Z)V", "getChallengeId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID challengeId;
        private final boolean isFromCryptoTransfersEnrollment;

        /* compiled from: MfaPromptsEnrollmentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.challengeId;
            }
            if ((i & 2) != 0) {
                z = args.isFromCryptoTransfersEnrollment;
            }
            return args.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromCryptoTransfersEnrollment() {
            return this.isFromCryptoTransfersEnrollment;
        }

        public final Args copy(UUID challengeId, boolean isFromCryptoTransfersEnrollment) {
            return new Args(challengeId, isFromCryptoTransfersEnrollment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.challengeId, args.challengeId) && this.isFromCryptoTransfersEnrollment == args.isFromCryptoTransfersEnrollment;
        }

        public int hashCode() {
            UUID uuid = this.challengeId;
            return ((uuid == null ? 0 : uuid.hashCode()) * 31) + Boolean.hashCode(this.isFromCryptoTransfersEnrollment);
        }

        public String toString() {
            return "Args(challengeId=" + this.challengeId + ", isFromCryptoTransfersEnrollment=" + this.isFromCryptoTransfersEnrollment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.challengeId);
            dest.writeInt(this.isFromCryptoTransfersEnrollment ? 1 : 0);
        }

        public Args(UUID uuid, boolean z) {
            this.challengeId = uuid;
            this.isFromCryptoTransfersEnrollment = z;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final boolean isFromCryptoTransfersEnrollment() {
            return this.isFromCryptoTransfersEnrollment;
        }
    }

    /* compiled from: MfaPromptsEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment;", "Lcom/robinhood/android/securitycenter/ui/mfa/prompts/MfaPromptsEnrollmentFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MfaPromptsEnrollmentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, mfaPromptsEnrollmentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MfaPromptsEnrollmentFragment newInstance(Args args) {
            return (MfaPromptsEnrollmentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MfaPromptsEnrollmentFragment mfaPromptsEnrollmentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, mfaPromptsEnrollmentFragment, args);
        }
    }
}
