package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.retirement.match.MatchOptionsScreen4;
import com.robinhood.android.retirement.match.MatchOptionsScreen5;
import com.robinhood.android.retirement.match.MatchOptionsScreenState;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.EligibilityDeterminerCallbacks;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options.MatchOptionsDuxo2;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options.MatchOptionsFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MatchOptionsFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010\u001d\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/retirement/match/MatchOptionsCallbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onMatchRateSelected", "type", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "showGoldRejoinFlow", "", "Callbacks", "Companion", "feature-transfers_externalRelease", "state", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MatchOptionsFragment extends GenericActionHandlingFragment implements MatchOptionsScreen4 {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MatchOptionsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchOptionsDuxo.class);
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchOptionsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/EligibilityDeterminerCallbacks;", "onMatchRateSelected", "", "type", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "showGoldRejoinFlow", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends EligibilityDeterminerCallbacks {
        void onMatchRateSelected(ApiRetirementMatchResponse3 type2, boolean showGoldRejoinFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MatchOptionsFragment matchOptionsFragment, int i, Composer composer, int i2) {
        matchOptionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final MatchOptionsDuxo getDuxo() {
        return (MatchOptionsDuxo) this.duxo.getValue();
    }

    /* compiled from: MatchOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment$onViewCreated$1", m3645f = "MatchOptionsFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment$onViewCreated$1 */
    static final class C310891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310891(Continuation<? super C310891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchOptionsFragment.this.new C310891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MatchOptionsDuxo2>> eventFlow = MatchOptionsFragment.this.getDuxo().getEventFlow();
                final MatchOptionsFragment matchOptionsFragment = MatchOptionsFragment.this;
                FlowCollector<? super Event<MatchOptionsDuxo2>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MatchOptionsDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MatchOptionsDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MatchOptionsDuxo2> eventConsumerInvoke;
                        if (event != null) {
                            final MatchOptionsFragment matchOptionsFragment2 = matchOptionsFragment;
                            if ((event.getData() instanceof MatchOptionsDuxo2.NotEligibleEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19950invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19950invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        matchOptionsFragment2.getCallbacks().onNotEligible();
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C310891(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(403547096);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(403547096, i2, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.ComposeContent (MatchOptionsFragment.kt:48)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-360066237, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-360066237, i3, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.ComposeContent.<anonymous> (MatchOptionsFragment.kt:56)");
                    }
                    final MatchOptionsFragment matchOptionsFragment = MatchOptionsFragment.this;
                    final SnapshotState4<MatchOptionsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ActionHandlingFragment2.ContentWithDialog(matchOptionsFragment, ComposableLambda3.rememberComposableLambda(-710938393, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(-710938393, i4, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment.ComposeContent.<anonymous>.<anonymous> (MatchOptionsFragment.kt:57)");
                            }
                            MatchOptionsScreen5.MatchOptionsScreen(MatchOptionsFragment.ComposeContent$lambda$0(snapshotState4).getMatchOptionsViewModel(), matchOptionsFragment, WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, composer3, MatchOptionsScreenState.$stable, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchOptionsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.match.MatchOptionsScreen4
    public void onMatchRateSelected(ApiRetirementMatchResponse3 type2, boolean showGoldRejoinFlow) {
        Intrinsics.checkNotNullParameter(type2, "type");
        if (type2 == ApiRetirementMatchResponse3.BASE) {
            getUserLeapManager().track(TrackingEvent.SELECTED_1_PERC_FULLSCREEN_CONTRIBUTIONS);
        } else if (type2 == ApiRetirementMatchResponse3.GOLD) {
            getUserLeapManager().track(TrackingEvent.SELECTED_3_PERC_FULLSCREEN_CONTRIBUTIONS);
        }
        getCallbacks().onMatchRateSelected(type2, showGoldRejoinFlow);
    }

    /* compiled from: MatchOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsFragment;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<MatchOptionsFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((MatchOptionsFragment) fragment);
        }

        public Void getArgs(MatchOptionsFragment matchOptionsFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, matchOptionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public MatchOptionsFragment newInstance() {
            return (MatchOptionsFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public MatchOptionsFragment newInstance(Void r1) {
            return (MatchOptionsFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchOptionsViewState ComposeContent$lambda$0(SnapshotState4<MatchOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
