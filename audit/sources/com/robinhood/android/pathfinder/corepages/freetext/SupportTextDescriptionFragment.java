package com.robinhood.android.pathfinder.corepages.freetext;

import android.os.Bundle;
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
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionEvent;
import com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.contracts.pathfinder.FreeTextDescriptionFragmentKey;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SupportTextDescriptionFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "previousSoftInputMode", "", "getPreviousSoftInputMode$annotations", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "Companion", "feature-pathfinder-core-pages_externalDebug", "viewState", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SupportTextDescriptionFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SupportTextDescriptionDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.CX_CALL_DESCRIPTION, null, null, null, 14, null);
    private int previousSoftInputMode = 18;
    private final String screenName = getEventScreen().getName().name();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SupportTextDescriptionFragment supportTextDescriptionFragment, int i, Composer composer, int i2) {
        supportTextDescriptionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void getPreviousSoftInputMode$annotations() {
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportTextDescriptionDuxo getDuxo() {
        return (SupportTextDescriptionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.previousSoftInputMode = requireActivity().getWindow().getAttributes().softInputMode;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1698413930);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698413930, i2, -1, "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment.ComposeContent (SupportTextDescriptionFragment.kt:39)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(240199615, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(240199615, i3, -1, "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment.ComposeContent.<anonymous> (SupportTextDescriptionFragment.kt:43)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, SupportTextDescriptionFragment.this.getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1924298188, true, new AnonymousClass1(SupportTextDescriptionFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: SupportTextDescriptionFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<SupportTextDescriptionViewState> $viewState$delegate;
                    final /* synthetic */ SupportTextDescriptionFragment this$0;

                    AnonymousClass1(SupportTextDescriptionFragment supportTextDescriptionFragment, SnapshotState4<SupportTextDescriptionViewState> snapshotState4) {
                        this.this$0 = supportTextDescriptionFragment;
                        this.$viewState$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(-1924298188, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment.ComposeContent.<anonymous>.<anonymous> (SupportTextDescriptionFragment.kt:46)");
                        }
                        SupportTextDescriptionViewState supportTextDescriptionViewStateComposeContent$lambda$0 = SupportTextDescriptionFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final SupportTextDescriptionFragment supportTextDescriptionFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SupportTextDescriptionFragment.C253141.AnonymousClass1.invoke$lambda$1$lambda$0(supportTextDescriptionFragment, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        SupportTextDescriptionComposable.SupportTextDescriptionComposable(supportTextDescriptionViewStateComposeContent$lambda$0, (Function1) objRememberedValue, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(SupportTextDescriptionFragment supportTextDescriptionFragment, String input) {
                        Intrinsics.checkNotNullParameter(input, "input");
                        supportTextDescriptionFragment.getDuxo().onClickContinue(input);
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportTextDescriptionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C253151(null), 1, null);
    }

    /* compiled from: SupportTextDescriptionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment$onViewCreated$1", m3645f = "SupportTextDescriptionFragment.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment$onViewCreated$1 */
    static final class C253151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C253151(Continuation<? super C253151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportTextDescriptionFragment.this.new C253151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SupportTextDescriptionFragment.this.getDuxo().getEventFlow());
                final SupportTextDescriptionFragment supportTextDescriptionFragment = SupportTextDescriptionFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<SupportTextDescriptionEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<SupportTextDescriptionEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<SupportTextDescriptionEvent> eventConsumerInvoke;
                        final SupportTextDescriptionFragment supportTextDescriptionFragment2 = supportTextDescriptionFragment;
                        if ((event.getData() instanceof SupportTextDescriptionEvent.SendInputErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.pathfinder.corepages.freetext.SupportTextDescriptionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m17518invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17518invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Throwable error = ((SupportTextDescriptionEvent.SendInputErrorEvent) event.getData()).getError();
                                    if (!AbsErrorHandler.handleError$default(supportTextDescriptionFragment2.getActivityErrorHandler(), error, false, 2, null)) {
                                        throw error;
                                    }
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requireActivity().getWindow().setSoftInputMode(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportTextDescriptionViewState ComposeContent$lambda$0(SnapshotState4<SupportTextDescriptionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireActivity().getWindow().setSoftInputMode(this.previousSoftInputMode);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return String.valueOf(((FreeTextDescriptionFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId());
    }

    /* compiled from: SupportTextDescriptionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/freetext/SupportTextDescriptionFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/FreeTextDescriptionFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SupportTextDescriptionFragment, FreeTextDescriptionFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(FreeTextDescriptionFragmentKey freeTextDescriptionFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, freeTextDescriptionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FreeTextDescriptionFragmentKey getArgs(SupportTextDescriptionFragment supportTextDescriptionFragment) {
            return (FreeTextDescriptionFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, supportTextDescriptionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SupportTextDescriptionFragment newInstance(FreeTextDescriptionFragmentKey freeTextDescriptionFragmentKey) {
            return (SupportTextDescriptionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, freeTextDescriptionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SupportTextDescriptionFragment supportTextDescriptionFragment, FreeTextDescriptionFragmentKey freeTextDescriptionFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, supportTextDescriptionFragment, freeTextDescriptionFragmentKey);
        }
    }
}
