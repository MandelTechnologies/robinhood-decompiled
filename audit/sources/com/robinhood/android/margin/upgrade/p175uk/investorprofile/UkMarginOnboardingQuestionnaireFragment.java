package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState2;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState3;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingQuestionnaireFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003 !\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u001a\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006#²\u0006\u0012\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onPrimaryButtonClicked", "state", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState$Questionnaire;", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UkMarginOnboardingQuestionnaireFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UkMarginOnboardingQuestionnaireFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UkMarginOnboardingInvestorProfileDuxo.class);
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkMarginOnboardingQuestionnaireFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Callbacks;", "", "launchInvestorProfileQuestionnaire", "", "productContext", "", "launchInvestorProfileReview", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void launchInvestorProfileQuestionnaire(String productContext);

        void launchInvestorProfileReview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(UkMarginOnboardingQuestionnaireFragment ukMarginOnboardingQuestionnaireFragment, int i, Composer composer, int i2) {
        ukMarginOnboardingQuestionnaireFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final UkMarginOnboardingInvestorProfileDuxo getDuxo() {
        return (UkMarginOnboardingInvestorProfileDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<UkMarginOnboardingInvestorProfileState2> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(110481302);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(110481302, i2, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment.ComposeContent (UkMarginOnboardingQuestionnaireFragment.kt:70)");
            }
            final StateFlow<Event<UkMarginOnboardingInvestorProfileState2>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UkMarginOnboardingQuestionnaireFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof UkMarginOnboardingInvestorProfileState2) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<UkMarginOnboardingInvestorProfileState2> value = eventFlow.getValue();
            Event<UkMarginOnboardingInvestorProfileState2> event = value;
            if (!((event != null ? event.getData() : null) instanceof UkMarginOnboardingInvestorProfileState2)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            final Event<UkMarginOnboardingInvestorProfileState2> eventComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof UkMarginOnboardingInvestorProfileState2.Error) && (eventConsumerInvoke = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                        m16258invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m16258invoke(Object it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getActivityErrorHandler().invoke2(((UkMarginOnboardingInvestorProfileState2.Error) eventComposeContent$lambda$0.getData()).getThrowable());
                    }
                });
            }
            UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3 = (UkMarginOnboardingInvestorProfileState3) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkMarginOnboardingQuestionnaireFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new UkMarginOnboardingQuestionnaireFragment4(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            UkMarginOnboardingQuestionnaireFragment5.UkMarginOnboardingQuestionnaireScreen(ukMarginOnboardingInvestorProfileState3, function0, (Function1) ((KFunction) objRememberedValue2), null, composerStartRestartGroup, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkMarginOnboardingQuestionnaireFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(UkMarginOnboardingQuestionnaireFragment ukMarginOnboardingQuestionnaireFragment) {
        ukMarginOnboardingQuestionnaireFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    private static final Event<UkMarginOnboardingInvestorProfileState2> ComposeContent$lambda$0(SnapshotState4<Event<UkMarginOnboardingInvestorProfileState2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrimaryButtonClicked(UkMarginOnboardingInvestorProfileState3.Questionnaire state) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(state.getSplashStyle().toScreenName(), null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
        if (state.isCompleted()) {
            getCallbacks().launchInvestorProfileReview();
        } else {
            getCallbacks().launchInvestorProfileQuestionnaire(((Args) INSTANCE.getArgs((Fragment) this)).getProductContext());
        }
    }

    /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "productContext", "skipCompletionCheck", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getProductContext", "getSkipCompletionCheck", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String productContext;
        private final boolean skipCompletionCheck;

        /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.productContext;
            }
            if ((i & 4) != 0) {
                z = args.skipCompletionCheck;
            }
            return args.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipCompletionCheck() {
            return this.skipCompletionCheck;
        }

        public final Args copy(String accountNumber, String productContext, boolean skipCompletionCheck) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            return new Args(accountNumber, productContext, skipCompletionCheck);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.productContext, args.productContext) && this.skipCompletionCheck == args.skipCompletionCheck;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.productContext.hashCode()) * 31) + Boolean.hashCode(this.skipCompletionCheck);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", productContext=" + this.productContext + ", skipCompletionCheck=" + this.skipCompletionCheck + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.productContext);
            dest.writeInt(this.skipCompletionCheck ? 1 : 0);
        }

        public Args(String accountNumber, String productContext, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(productContext, "productContext");
            this.accountNumber = accountNumber;
            this.productContext = productContext;
            this.skipCompletionCheck = z;
        }

        public /* synthetic */ Args(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getProductContext() {
            return this.productContext;
        }

        public final boolean getSkipCompletionCheck() {
            return this.skipCompletionCheck;
        }
    }

    /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkMarginOnboardingQuestionnaireFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkMarginOnboardingQuestionnaireFragment ukMarginOnboardingQuestionnaireFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukMarginOnboardingQuestionnaireFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkMarginOnboardingQuestionnaireFragment newInstance(Args args) {
            return (UkMarginOnboardingQuestionnaireFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkMarginOnboardingQuestionnaireFragment ukMarginOnboardingQuestionnaireFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukMarginOnboardingQuestionnaireFragment, args);
        }
    }
}
