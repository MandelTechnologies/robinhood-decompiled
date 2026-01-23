package com.robinhood.android.matchrateselection.match;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.matchrateselection.match.MatchRateSelectionEvent;
import com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImage3;
import com.robinhood.android.retirement.match.MatchOptionsScreen4;
import com.robinhood.android.retirement.match.MatchOptionsScreen5;
import com.robinhood.android.retirement.match.MatchOptionsScreenState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
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
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MatchRateSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0003+,-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\r\u0010\u001b\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/retirement/match/MatchOptionsCallbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "RolloverHeader", MarkdownText4.TagImageUrl, "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "onMatchRateSelected", "type", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "showGoldRejoinFlow", "onDialogDismissed", "id", "", "handleEvent", "event", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionEvent;", "Callbacks", "Args", "Companion", "feature-match-rate-selection_externalDebug", "viewState", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchRateSelectionFragment extends GenericComposeFragment implements MatchOptionsScreen4 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchRateSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchRateSelectionDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MatchRateSelectionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: MatchRateSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Callbacks;", "", "onMatchRateSelect", "", "isGoldSelected", "", "showGoldRejoinFlow", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMatchRateSelect(boolean isGoldSelected, boolean showGoldRejoinFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MatchRateSelectionFragment matchRateSelectionFragment, int i, Composer composer, int i2) {
        matchRateSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverHeader$lambda$4(MatchRateSelectionFragment matchRateSelectionFragment, String str, int i, Composer composer, int i2) {
        matchRateSelectionFragment.RolloverHeader(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchRateSelectionDuxo getDuxo() {
        return (MatchRateSelectionDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint() != ApiMatchRateSelection6.ROLLOVER;
    }

    /* compiled from: MatchRateSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$onViewCreated$1", m3645f = "MatchRateSelectionFragment.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$onViewCreated$1 */
    static final class C215991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C215991(Continuation<? super C215991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchRateSelectionFragment.this.new C215991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C215991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MatchRateSelectionEvent>> eventFlow = MatchRateSelectionFragment.this.getDuxo().getEventFlow();
                final MatchRateSelectionFragment matchRateSelectionFragment = MatchRateSelectionFragment.this;
                FlowCollector<? super Event<MatchRateSelectionEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MatchRateSelectionEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MatchRateSelectionEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MatchRateSelectionEvent> eventConsumerInvoke;
                        if (event != null) {
                            final MatchRateSelectionFragment matchRateSelectionFragment2 = matchRateSelectionFragment;
                            if ((event.getData() instanceof MatchRateSelectionEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m16460invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16460invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        matchRateSelectionFragment2.handleEvent((MatchRateSelectionEvent) event.getData());
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
        BaseFragment.collectDuxoState$default(this, null, new C215991(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1293982045);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1293982045, i2, -1, "com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent (MatchRateSelectionFragment.kt:55)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-222033688, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-222033688, i3, -1, "com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent.<anonymous> (MatchRateSelectionFragment.kt:59)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION, null, ((Args) MatchRateSelectionFragment.INSTANCE.getArgs((Fragment) MatchRateSelectionFragment.this)).getEntryPoint().getServerValue(), null, 10, null), null, null, null, null, 61, null);
                    final MatchRateSelectionFragment matchRateSelectionFragment = MatchRateSelectionFragment.this;
                    final SnapshotState4<MatchRateSelectionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(166710355, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(166710355, i4, -1, "com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent.<anonymous>.<anonymous> (MatchRateSelectionFragment.kt:67)");
                            }
                            MatchOptionsScreenState matchScreenState = MatchRateSelectionFragment.ComposeContent$lambda$0(snapshotState4).getMatchScreenState();
                            MatchRateSelectionFragment matchRateSelectionFragment2 = matchRateSelectionFragment;
                            Modifier modifierNavigationBarsPadding = Modifier.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierNavigationBarsPadding, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            if (((Args) MatchRateSelectionFragment.INSTANCE.getArgs((Fragment) matchRateSelectionFragment)).getEntryPoint() == ApiMatchRateSelection6.ROLLOVER) {
                                modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierNavigationBarsPadding);
                            }
                            Modifier modifierThen = modifierM5146paddingqDBjuR0$default.then(modifierNavigationBarsPadding);
                            final MatchRateSelectionFragment matchRateSelectionFragment3 = matchRateSelectionFragment;
                            final SnapshotState4<MatchRateSelectionViewState> snapshotState42 = snapshotState4;
                            MatchOptionsScreen5.MatchOptionsScreen(matchScreenState, matchRateSelectionFragment2, modifierThen, ComposableLambda3.rememberComposableLambda(-1244532162, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1244532162, i5, -1, "com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MatchRateSelectionFragment.kt:80)");
                                    }
                                    MatchRateSelectionFragment matchRateSelectionFragment4 = matchRateSelectionFragment3;
                                    MatchOptionsScreenState matchScreenState2 = MatchRateSelectionFragment.ComposeContent$lambda$0(snapshotState42).getMatchScreenState();
                                    matchRateSelectionFragment4.RolloverHeader(matchScreenState2 != null ? matchScreenState2.getHeaderImageUrl() : null, composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, MatchOptionsScreenState.$stable | 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchRateSelectionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchRateSelectionViewState ComposeContent$lambda$0(SnapshotState4<MatchRateSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RolloverHeader(String str, Composer composer, final int i) {
        int i2;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(970291767);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(970291767, i2, -1, "com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment.RolloverHeader (MatchRateSelectionFragment.kt:88)");
            }
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchRateSelectionFragment.RolloverHeader$lambda$3$lambda$2(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                str2 = str;
                Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(str2, (Function0) objRememberedValue, null, null, composerStartRestartGroup, i2 & 14, 12);
            } else {
                str2 = str;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchRateSelectionFragment.RolloverHeader$lambda$4(this.f$0, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverHeader$lambda$3$lambda$2(MatchRateSelectionFragment matchRateSelectionFragment) {
        matchRateSelectionFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.retirement.match.MatchOptionsScreen4
    public void onMatchRateSelected(ApiRetirementMatchResponse3 type2, boolean showGoldRejoinFlow) {
        Intrinsics.checkNotNullParameter(type2, "type");
        getCallbacks().onMatchRateSelect(type2 == ApiRetirementMatchResponse3.GOLD, showGoldRejoinFlow);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(MatchRateSelectionEvent event) throws Throwable {
        if (event instanceof MatchRateSelectionEvent.SkipToNextStep) {
            getCallbacks().onMatchRateSelect(false, false);
        } else {
            if (!(event instanceof MatchRateSelectionEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((MatchRateSelectionEvent.Error) event).getError(), true, false, 0, null, 56, null);
        }
    }

    /* compiled from: MatchRateSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Args;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "<init>", "(Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;)V", "getEntryPoint", "()Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiMatchRateSelection6 entryPoint;

        /* compiled from: MatchRateSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ApiMatchRateSelection6.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiMatchRateSelection6 apiMatchRateSelection6, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMatchRateSelection6 = args.entryPoint;
            }
            return args.copy(apiMatchRateSelection6);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMatchRateSelection6 getEntryPoint() {
            return this.entryPoint;
        }

        public final Args copy(ApiMatchRateSelection6 entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.entryPoint == ((Args) other).entryPoint;
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return "Args(entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPoint.name());
        }

        public Args(ApiMatchRateSelection6 entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        public final ApiMatchRateSelection6 getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchRateSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Args;", "<init>", "()V", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchRateSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchRateSelectionFragment matchRateSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchRateSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchRateSelectionFragment newInstance(Args args) {
            return (MatchRateSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchRateSelectionFragment matchRateSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchRateSelectionFragment, args);
        }
    }
}
