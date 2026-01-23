package com.robinhood.shared.stepupverification.support;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.workflow.p358ui.screens.RequestPhoneCallScreen;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey;
import com.robinhood.shared.security.contracts.RequestPhoneCallFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowCallbacks;
import com.robinhood.shared.security.lib.workflow.WorkflowErrorResponses;
import com.robinhood.shared.stepupverification.support.RequestPhoneCallEvent;
import com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RequestPhoneCallFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010!\u001a\u00020\"H\u0017¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006*²\u0006\u0012\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo;", "getDuxo", "()Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCountryCodeSelected", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "onBackPressed", "", "Companion", "feature-step-up-verification_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RequestPhoneCallFragment extends GenericComposeFragment implements SelectCountryCodeFragmentKey.Callbacks, AutoLoggableFragment {
    private static final String SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG = "selectCountryCodeBottomSheetTag";
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RequestPhoneCallFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RequestPhoneCallDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(WorkflowCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof WorkflowCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(RequestPhoneCallFragment requestPhoneCallFragment, int i, Composer composer, int i2) {
        requestPhoneCallFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final RequestPhoneCallDuxo getDuxo() {
        return (RequestPhoneCallDuxo) this.duxo.getValue();
    }

    private final WorkflowCallbacks getCallbacks() {
        return (WorkflowCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        String string2 = ((RequestPhoneCallFragmentKey) companion.getArgs((Fragment) this)).getWorkflowId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String name = ((RequestPhoneCallFragmentKey) companion.getArgs((Fragment) this)).getWorkflowScreen().getName();
        String string3 = ((RequestPhoneCallFragmentKey) companion.getArgs((Fragment) this)).getWorkflowScreen().getBlockId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new StepUpVerificationContext(null, string2, name, string3, String.valueOf(((RequestPhoneCallFragmentKey) companion.getArgs((Fragment) this)).getWorkflowScreen().getLoggingIdentifier()), null, null, 97, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -262145, -1, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<RequestPhoneCallEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(692873354);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(692873354, i2, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment.ComposeContent (RequestPhoneCallFragment.kt:53)");
            }
            final Event<RequestPhoneCallEvent> eventComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof RequestPhoneCallEvent.Error) && (eventConsumerInvoke = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25740invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25740invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        RequestPhoneCallEvent.Error error = (RequestPhoneCallEvent.Error) eventComposeContent$lambda$0.getData();
                        FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        WorkflowErrorResponses.handleWorkflowError$default(fragmentActivityRequireActivity, error.getThrowable(), 0, 2, null);
                    }
                });
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(getEventLogger()), ComposableLambda3.rememberComposableLambda(399489994, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment.ComposeContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(399489994, i3, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment.ComposeContent.<anonymous> (RequestPhoneCallFragment.kt:63)");
                    }
                    final RequestPhoneCallFragment requestPhoneCallFragment = RequestPhoneCallFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-851809313, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment.ComposeContent.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-851809313, i4, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment.ComposeContent.<anonymous>.<anonymous> (RequestPhoneCallFragment.kt:64)");
                            }
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, requestPhoneCallFragment.getEventScreen(), null, requestPhoneCallFragment.getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1534858220, true, new C507601(requestPhoneCallFragment), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RequestPhoneCallFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment$ComposeContent$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C507601 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ RequestPhoneCallFragment this$0;

                            C507601(RequestPhoneCallFragment requestPhoneCallFragment) {
                                this.this$0 = requestPhoneCallFragment;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1534858220, i, -1, "com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RequestPhoneCallFragment.kt:70)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final RequestPhoneCallFragment requestPhoneCallFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment$ComposeContent$2$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RequestPhoneCallFragment.C399442.AnonymousClass1.C507601.invoke$lambda$2$lambda$1(requestPhoneCallFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                RequestPhoneCallComposable.RequestPhoneCallComposable((Function0) objRememberedValue, this.this$0.getDuxo(), null, composer, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(RequestPhoneCallFragment requestPhoneCallFragment) {
                                EventLogger.DefaultImpls.logScreenAppear$default(requestPhoneCallFragment.getEventLogger(), null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY, null, null, null, 14, null), null, null, requestPhoneCallFragment.getScreenEventContext(), 13, null);
                                Navigator navigator = requestPhoneCallFragment.getNavigator();
                                List<InternationalInfo> sortedInternationalInfos = InternationalInfo.INSTANCE.getSortedInternationalInfos();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedInternationalInfos, 10));
                                Iterator<T> it = sortedInternationalInfos.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((InternationalInfo) it.next()).getCountryCode());
                                }
                                Navigator.DefaultImpls.createDialogFragment$default(navigator, new SelectCountryCodeFragmentKey(arrayList, false, 2, null), null, 2, null).show(requestPhoneCallFragment.getChildFragmentManager(), RequestPhoneCallFragment.SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.support.RequestPhoneCallFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RequestPhoneCallFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Event<RequestPhoneCallEvent> ComposeContent$lambda$0(SnapshotState4<Event<RequestPhoneCallEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey.Callbacks
    public void onCountryCodeSelected(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        getDuxo().onCountryCodeSelected(countryCode);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.BACK, getEventScreen(), null, null, getScreenEventContext(), false, 44, null);
        getCallbacks().finishWithRequest(RequestPhoneCallScreen.Action.CustomerAbandon.INSTANCE, ((RequestPhoneCallFragmentKey) INSTANCE.getArgs((Fragment) this)).getWorkflowScreen());
        return true;
    }

    /* compiled from: RequestPhoneCallFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallFragment;", "Lcom/robinhood/shared/security/contracts/RequestPhoneCallFragmentKey;", "<init>", "()V", "SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RequestPhoneCallFragment, RequestPhoneCallFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RequestPhoneCallFragmentKey requestPhoneCallFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, requestPhoneCallFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RequestPhoneCallFragmentKey getArgs(RequestPhoneCallFragment requestPhoneCallFragment) {
            return (RequestPhoneCallFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, requestPhoneCallFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RequestPhoneCallFragment newInstance(RequestPhoneCallFragmentKey requestPhoneCallFragmentKey) {
            return (RequestPhoneCallFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, requestPhoneCallFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RequestPhoneCallFragment requestPhoneCallFragment, RequestPhoneCallFragmentKey requestPhoneCallFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, requestPhoneCallFragment, requestPhoneCallFragmentKey);
        }
    }
}
