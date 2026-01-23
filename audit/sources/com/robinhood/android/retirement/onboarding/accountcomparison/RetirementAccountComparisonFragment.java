package com.robinhood.android.retirement.onboarding.accountcomparison;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementAccountComparison;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RetirementAccountComparisonFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001%B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\r\u0010\u001b\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0016H\u0016J\t\u0010\u001e\u001a\u00020\u001fH\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonCallbacks;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "duxo", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onCloseClick", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementAccountComparisonFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated, RetirementAccountComparison4 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_ACCOUNT_COMPARISON, null, null, null, 14, null);
    private final UserInteractionEventData screenEventData = new UserInteractionEventData(null, getEventScreen(), null, null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 109, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementAccountComparisonDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementAccountComparisonFragment retirementAccountComparisonFragment, int i, Composer composer, int i2) {
        retirementAccountComparisonFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return this.screenEventData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementAccountComparisonDuxo getDuxo() {
        return (RetirementAccountComparisonDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C270441(null), 1, null);
    }

    /* compiled from: RetirementAccountComparisonFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment$onViewCreated$1", m3645f = "RetirementAccountComparisonFragment.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment$onViewCreated$1 */
    static final class C270441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C270441(Continuation<? super C270441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementAccountComparisonFragment.this.new C270441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C270441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<RetirementAccountComparisonLoadingErrorEvent>> eventFlow = RetirementAccountComparisonFragment.this.getDuxo().getEventFlow();
                final RetirementAccountComparisonFragment retirementAccountComparisonFragment = RetirementAccountComparisonFragment.this;
                FlowCollector<? super Event<RetirementAccountComparisonLoadingErrorEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RetirementAccountComparisonLoadingErrorEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RetirementAccountComparisonLoadingErrorEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RetirementAccountComparisonLoadingErrorEvent> eventConsumerInvoke;
                        if (event != null) {
                            final RetirementAccountComparisonFragment retirementAccountComparisonFragment2 = retirementAccountComparisonFragment;
                            if ((event.getData() instanceof RetirementAccountComparisonLoadingErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m18151invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18151invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AbsErrorHandler.handleError$default(retirementAccountComparisonFragment2.getActivityErrorHandler(), ((RetirementAccountComparisonLoadingErrorEvent) event.getData()).getThrowable(), false, 2, null);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1901372515);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901372515, i2, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment.ComposeContent (RetirementAccountComparisonFragment.kt:50)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1087348056, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1087348056, i3, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment.ComposeContent.<anonymous> (RetirementAccountComparisonFragment.kt:58)");
                    }
                    RetirementAccountComparison5.RetirementAccountComparison(RetirementAccountComparisonFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), RetirementAccountComparisonFragment.this, composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementAccountComparisonFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparison4
    public void onCloseClick() {
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    /* compiled from: RetirementAccountComparisonFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/retirement/contracts/RetirementAccountComparison;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonFragment;", "<init>", "()V", "createFragment", "key", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RetirementAccountComparison>, FragmentWithoutArgsCompanion<RetirementAccountComparisonFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((RetirementAccountComparisonFragment) fragment);
        }

        public Void getArgs(RetirementAccountComparisonFragment retirementAccountComparisonFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, retirementAccountComparisonFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public RetirementAccountComparisonFragment newInstance() {
            return (RetirementAccountComparisonFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public RetirementAccountComparisonFragment newInstance(Void r1) {
            return (RetirementAccountComparisonFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RetirementAccountComparisonFragment createFragment(RetirementAccountComparison key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (RetirementAccountComparisonFragment) newInstance();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementAccountComparisonViewState ComposeContent$lambda$0(SnapshotState4<? extends RetirementAccountComparisonViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
