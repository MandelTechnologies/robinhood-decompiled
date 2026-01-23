package com.robinhood.android.pathfinder.corepages.checkboxpage;

import android.content.Context;
import android.net.Uri;
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
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageEvent;
import com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.contexts.CheckboxConfirmPageContext;
import com.robinhood.shared.support.contracts.pathfinder.CheckboxConfirmPageFragmentKey;
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

/* compiled from: CheckboxConfirmPageFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\r\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u0011R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/checkboxpage/CheckboxConfirmPageFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/checkboxpage/CheckboxConfirmPageDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/checkboxpage/CheckboxConfirmPageDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-pathfinder-core-pages_externalDebug", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/CheckboxConfirmPageContext;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class CheckboxConfirmPageFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CheckboxConfirmPageDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CheckboxConfirmPageFragment checkboxConfirmPageFragment, int i, Composer composer, int i2) {
        checkboxConfirmPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckboxConfirmPageDuxo getDuxo() {
        return (CheckboxConfirmPageDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C252631(null), 1, null);
    }

    /* compiled from: CheckboxConfirmPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$onViewCreated$1", m3645f = "CheckboxConfirmPageFragment.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$onViewCreated$1 */
    static final class C252631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C252631(Continuation<? super C252631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckboxConfirmPageFragment.this.new C252631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C252631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CheckboxConfirmPageFragment.this.getDuxo().getEventFlow());
                final CheckboxConfirmPageFragment checkboxConfirmPageFragment = CheckboxConfirmPageFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<CheckboxConfirmPageEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<CheckboxConfirmPageEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<CheckboxConfirmPageEvent> eventConsumerInvoke;
                        final CheckboxConfirmPageFragment checkboxConfirmPageFragment2 = checkboxConfirmPageFragment;
                        if ((event.getData() instanceof CheckboxConfirmPageEvent.SendInputErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m17500invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17500invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Throwable error = ((CheckboxConfirmPageEvent.SendInputErrorEvent) event.getData()).getError();
                                    if (!AbsErrorHandler.handleError$default(checkboxConfirmPageFragment2.getActivityErrorHandler(), error, false, 2, null)) {
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
        Composer composerStartRestartGroup = composer.startRestartGroup(770932713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(770932713, i2, -1, "com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment.ComposeContent (CheckboxConfirmPageFragment.kt:39)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-392594562, true, new C252621(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckboxConfirmPageFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CheckboxConfirmPageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$ComposeContent$1 */
    static final class C252621 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<CheckboxConfirmPageContext> $context$delegate;

        C252621(SnapshotState4<CheckboxConfirmPageContext> snapshotState4) {
            this.$context$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-392594562, i, -1, "com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment.ComposeContent.<anonymous> (CheckboxConfirmPageFragment.kt:44)");
            }
            CheckboxConfirmPageContext checkboxConfirmPageContextComposeContent$lambda$0 = CheckboxConfirmPageFragment.ComposeContent$lambda$0(this.$context$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CheckboxConfirmPageFragment.this);
            final CheckboxConfirmPageFragment checkboxConfirmPageFragment = CheckboxConfirmPageFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CheckboxConfirmPageFragment.C252621.invoke$lambda$1$lambda$0(checkboxConfirmPageFragment, (Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CheckboxConfirmPageFragment.this);
            final CheckboxConfirmPageFragment checkboxConfirmPageFragment2 = CheckboxConfirmPageFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.checkboxpage.CheckboxConfirmPageFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CheckboxConfirmPageFragment.C252621.invoke$lambda$4$lambda$3(checkboxConfirmPageFragment2, (CtaAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CheckboxConfirmPageComposable.CheckboxConfirmPageComposable(checkboxConfirmPageContextComposeContent$lambda$0, function1, null, (Function1) objRememberedValue2, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CheckboxConfirmPageFragment checkboxConfirmPageFragment, Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (checkboxConfirmPageFragment.getNavigator().isDeepLinkSupported(uri)) {
                Navigator navigator = checkboxConfirmPageFragment.getNavigator();
                Context contextRequireContext = checkboxConfirmPageFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, Boolean.FALSE, null, false, null, 56, null);
            } else {
                WebUtils.viewUrl$default(checkboxConfirmPageFragment.requireContext(), uri.toString(), 0, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(CheckboxConfirmPageFragment checkboxConfirmPageFragment, CtaAction ctaAction) {
            if (ctaAction != null) {
                checkboxConfirmPageFragment.getDuxo().onCtaClicked(ctaAction);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CheckboxConfirmPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/checkboxpage/CheckboxConfirmPageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/checkboxpage/CheckboxConfirmPageFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/CheckboxConfirmPageFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CheckboxConfirmPageFragment, CheckboxConfirmPageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CheckboxConfirmPageFragmentKey checkboxConfirmPageFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, checkboxConfirmPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CheckboxConfirmPageFragmentKey getArgs(CheckboxConfirmPageFragment checkboxConfirmPageFragment) {
            return (CheckboxConfirmPageFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, checkboxConfirmPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CheckboxConfirmPageFragment newInstance(CheckboxConfirmPageFragmentKey checkboxConfirmPageFragmentKey) {
            return (CheckboxConfirmPageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, checkboxConfirmPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CheckboxConfirmPageFragment checkboxConfirmPageFragment, CheckboxConfirmPageFragmentKey checkboxConfirmPageFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, checkboxConfirmPageFragment, checkboxConfirmPageFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckboxConfirmPageContext ComposeContent$lambda$0(SnapshotState4<CheckboxConfirmPageContext> snapshotState4) {
        return snapshotState4.getValue();
    }
}
