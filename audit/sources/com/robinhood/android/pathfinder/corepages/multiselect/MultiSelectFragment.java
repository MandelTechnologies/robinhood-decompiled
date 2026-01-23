package com.robinhood.android.pathfinder.corepages.multiselect;

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
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectEvent;
import com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.support.contracts.pathfinder.MultiSelectFragmentKey;
import java.util.List;
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

/* compiled from: MultiSelectFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\r\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u0011R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-pathfinder-core-pages_externalDebug", "state", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class MultiSelectFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MultiSelectDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MultiSelectFragment multiSelectFragment, int i, Composer composer, int i2) {
        multiSelectFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiSelectDuxo getDuxo() {
        return (MultiSelectDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C253271(null), 1, null);
    }

    /* compiled from: MultiSelectFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$onViewCreated$1", m3645f = "MultiSelectFragment.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$onViewCreated$1 */
    static final class C253271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C253271(Continuation<? super C253271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MultiSelectFragment.this.new C253271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MultiSelectFragment.this.getDuxo().getEventFlow());
                final MultiSelectFragment multiSelectFragment = MultiSelectFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MultiSelectEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MultiSelectEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MultiSelectEvent> eventConsumerInvoke;
                        final MultiSelectFragment multiSelectFragment2 = multiSelectFragment;
                        if ((event.getData() instanceof MultiSelectEvent.SendInputErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m17526invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17526invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Throwable error = ((MultiSelectEvent.SendInputErrorEvent) event.getData()).getError();
                                    if (!AbsErrorHandler.handleError$default(multiSelectFragment2.getActivityErrorHandler(), error, false, 2, null)) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1624170234);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624170234, i2, -1, "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment.ComposeContent (MultiSelectFragment.kt:36)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-506080047, true, new C253261(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MultiSelectFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$ComposeContent$1 */
    static final class C253261 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<MultiSelectViewState> $state$delegate;

        C253261(SnapshotState4<MultiSelectViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-506080047, i, -1, "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment.ComposeContent.<anonymous> (MultiSelectFragment.kt:40)");
            }
            MultiSelectViewState multiSelectViewStateComposeContent$lambda$0 = MultiSelectFragment.ComposeContent$lambda$0(this.$state$delegate);
            boolean sendingInput = MultiSelectFragment.ComposeContent$lambda$0(this.$state$delegate).getSendingInput();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(MultiSelectFragment.this);
            final MultiSelectFragment multiSelectFragment = MultiSelectFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MultiSelectFragment.C253261.invoke$lambda$1$lambda$0(multiSelectFragment, (String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(MultiSelectFragment.this);
            final MultiSelectFragment multiSelectFragment2 = MultiSelectFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiSelectFragment.C253261.invoke$lambda$3$lambda$2(multiSelectFragment2, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            MultiSelectComposable.MultiSelectComposable(multiSelectViewStateComposeContent$lambda$0, sendingInput, function2, (Function1) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MultiSelectFragment multiSelectFragment, String option, boolean z) {
            Intrinsics.checkNotNullParameter(option, "option");
            multiSelectFragment.getDuxo().updateOption$feature_pathfinder_core_pages_externalDebug(option, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(MultiSelectFragment multiSelectFragment, List options) {
            Intrinsics.checkNotNullParameter(options, "options");
            multiSelectFragment.getDuxo().sendInput$feature_pathfinder_core_pages_externalDebug(options);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MultiSelectFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/MultiSelectFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MultiSelectFragment, MultiSelectFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MultiSelectFragmentKey multiSelectFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, multiSelectFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MultiSelectFragmentKey getArgs(MultiSelectFragment multiSelectFragment) {
            return (MultiSelectFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, multiSelectFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MultiSelectFragment newInstance(MultiSelectFragmentKey multiSelectFragmentKey) {
            return (MultiSelectFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, multiSelectFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MultiSelectFragment multiSelectFragment, MultiSelectFragmentKey multiSelectFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, multiSelectFragment, multiSelectFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiSelectViewState ComposeContent$lambda$0(SnapshotState4<MultiSelectViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
