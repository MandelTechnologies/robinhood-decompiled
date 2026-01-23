package com.robinhood.android.portfolio.positionsSortOptions;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.portfolio.contracts.PositionsSortOptionsKey;
import com.robinhood.android.portfolio.contracts.PositionsSortOptionsKey2;
import com.robinhood.android.portfolio.contracts.PositionsSortResult;
import com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.disposer.LifecycleState;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PositionsSortOptionsFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\r\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PositionsSortOptionsFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PositionsSortOptionsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(PositionsSortOptionsFragment positionsSortOptionsFragment, int i, Composer composer, int i2) {
        positionsSortOptionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsSortOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsFragment;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<PositionsSortOptionsFragment, PositionsSortOptionsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public PositionsSortOptionsFragment createDialogFragment(PositionsSortOptionsKey positionsSortOptionsKey) {
            return (PositionsSortOptionsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, positionsSortOptionsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PositionsSortOptionsKey getArgs(PositionsSortOptionsFragment positionsSortOptionsFragment) {
            return (PositionsSortOptionsKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, positionsSortOptionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PositionsSortOptionsFragment newInstance(PositionsSortOptionsKey positionsSortOptionsKey) {
            return (PositionsSortOptionsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, positionsSortOptionsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PositionsSortOptionsFragment positionsSortOptionsFragment, PositionsSortOptionsKey positionsSortOptionsKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, positionsSortOptionsFragment, positionsSortOptionsKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionsSortOptionsDuxo getDuxo() {
        return (PositionsSortOptionsDuxo) this.duxo.getValue();
    }

    /* compiled from: PositionsSortOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$onCreate$1", m3645f = "PositionsSortOptionsFragment.kt", m3646l = {42}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$onCreate$1 */
    static final class C258521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C258521(Continuation<? super C258521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsSortOptionsFragment.this.new C258521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C258521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<PositionsSortOptionsViewState> stateFlow = PositionsSortOptionsFragment.this.getDuxo().getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<PositionsSortOptionsViewState>() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "PositionsSortOptionsFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((PositionsSortOptionsViewState) obj).getDismissed()) {
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
                    public Object collect(FlowCollector<? super PositionsSortOptionsViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1);
                final PositionsSortOptionsFragment positionsSortOptionsFragment = PositionsSortOptionsFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment.onCreate.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PositionsSortOptionsViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PositionsSortOptionsViewState positionsSortOptionsViewState, Continuation<? super Unit> continuation) {
                        positionsSortOptionsFragment.dismiss();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTake.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C258521(null));
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-76320545);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-76320545, i2, -1, "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment.ComposeContent (PositionsSortOptionsFragment.kt:48)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, ((PositionsSortOptionsKey) INSTANCE.getArgs((Fragment) this)).getScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(2119575434, true, new C258511(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionsSortOptionsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PositionsSortOptionsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$ComposeContent$1 */
    static final class C258511 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<PositionsSortOptionsViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C258511(SnapshotState4<? extends PositionsSortOptionsViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(2119575434, i, -1, "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment.ComposeContent.<anonymous> (PositionsSortOptionsFragment.kt:51)");
            }
            PositionInstrumentType positionInstrumentType = ((PositionsSortOptionsKey) PositionsSortOptionsFragment.INSTANCE.getArgs((Fragment) PositionsSortOptionsFragment.this)).getPositionInstrumentType();
            PositionsSortOptionsViewState positionsSortOptionsViewStateComposeContent$lambda$0 = PositionsSortOptionsFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            PositionsSortOptionsDuxo duxo = PositionsSortOptionsFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(duxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PositionsSortOptionsFragment2(duxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(PositionsSortOptionsFragment.this);
            final PositionsSortOptionsFragment positionsSortOptionsFragment = PositionsSortOptionsFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PositionsSortOptionsFragment.C258511.invoke$lambda$2$lambda$1(positionsSortOptionsFragment, (PositionsSortResult) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            PositionsSortOptionsComposable.PositionsSortOptionsComposable(positionInstrumentType, positionsSortOptionsViewStateComposeContent$lambda$0, function1, (Function1) objRememberedValue2, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(PositionsSortOptionsFragment positionsSortOptionsFragment, PositionsSortResult positionsSortResult) {
            positionsSortOptionsFragment.getParentFragmentManager().setFragmentResult(PositionsSortOptionsKey2.SORT_OPTIONS_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(PositionsSortOptionsKey2.SORT_OPTIONS_RESULT_BUNDLE_KEY, positionsSortResult)));
            positionsSortOptionsFragment.getDuxo().onDone();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PositionsSortOptionsViewState ComposeContent$lambda$0(SnapshotState4<? extends PositionsSortOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
