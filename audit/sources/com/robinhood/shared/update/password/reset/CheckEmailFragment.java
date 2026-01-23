package com.robinhood.shared.update.password.reset;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.update.password.reset.CheckEmailEvent;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.UUID;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CheckEmailFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/update/password/reset/CheckEmailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/update/password/reset/CheckEmailDuxo;", "getDuxo", "()Lcom/robinhood/shared/update/password/reset/CheckEmailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "Companion", "feature-update-password_externalDebug", "viewState", "Lcom/robinhood/shared/update/password/reset/CheckEmailViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/update/password/reset/CheckEmailEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CheckEmailFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CheckEmailDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(CheckEmailFragment checkEmailFragment, int i, Composer composer, int i2) {
        checkEmailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CheckEmailDuxo getDuxo() {
        return (CheckEmailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        EventConsumer<CheckEmailEvent> eventConsumerInvoke;
        EventConsumer<CheckEmailEvent> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2115591586);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115591586, i2, -1, "com.robinhood.shared.update.password.reset.CheckEmailFragment.ComposeContent (CheckEmailFragment.kt:26)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<CheckEmailEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CheckEmailFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof CheckEmailEvent) {
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
            Event<CheckEmailEvent> value = eventFlow.getValue();
            Event<CheckEmailEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof CheckEmailEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            Navigator navigator = getNavigator();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.update.password.reset.CheckEmailFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckEmailFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue, null, composerStartRestartGroup, 0, 4);
            composer2 = composerStartRestartGroup;
            final Event<CheckEmailEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof CheckEmailEvent.VerificationWorkflow) && (eventConsumerInvoke2 = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m26407invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m26407invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CheckEmailEvent.VerificationWorkflow verificationWorkflow = (CheckEmailEvent.VerificationWorkflow) eventComposeContent$lambda$1.getData();
                        function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                    }
                });
            }
            final Event<CheckEmailEvent> eventComposeContent$lambda$12 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$12 != null && (eventComposeContent$lambda$12.getData() instanceof CheckEmailEvent.Error) && (eventConsumerInvoke = eventComposeContent$lambda$12.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$12, new Function1() { // from class: com.robinhood.shared.update.password.reset.CheckEmailFragment$ComposeContent$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                        m26408invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m26408invoke(Object it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CheckEmailEvent.Error error = (CheckEmailEvent.Error) eventComposeContent$lambda$12.getData();
                        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                        FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                    }
                });
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1036402515, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.update.password.reset.CheckEmailFragment.ComposeContent.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1036402515, i3, -1, "com.robinhood.shared.update.password.reset.CheckEmailFragment.ComposeContent.<anonymous> (CheckEmailFragment.kt:46)");
                    }
                    boolean zIsLoading = CheckEmailFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading();
                    boolean showEmailResentDialog = CheckEmailFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowEmailResentDialog();
                    String email = CheckEmailFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEmail();
                    CheckEmailDuxo duxo = CheckEmailFragment.this.getDuxo();
                    composer3.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer3.changedInstance(duxo);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new CheckEmailFragment2(duxo);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                    CheckEmailDuxo duxo2 = CheckEmailFragment.this.getDuxo();
                    composer3.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer3.changedInstance(duxo2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new CheckEmailFragment3(duxo2);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    CheckEmailComposable.CheckEmailComposable(zIsLoading, showEmailResentDialog, email, function0, (Function0) ((KFunction) objRememberedValue3), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.reset.CheckEmailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckEmailFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(CheckEmailFragment checkEmailFragment) {
        checkEmailFragment.getDuxo().resendEmail();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Toolbar toolbar2 = toolbar.getToolbar();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Drawable themeDrawable = Contexts7.getThemeDrawable(contextRequireContext, C20690R.attr.iconClose24dp);
        if (themeDrawable != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            themeDrawable.setTint(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground1));
        }
        toolbar2.setNavigationIcon(themeDrawable);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: CheckEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/update/password/reset/CheckEmailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/shared/update/password/reset/CheckEmailFragment;", "<init>", "()V", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<CheckEmailFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((CheckEmailFragment) fragment);
        }

        public Void getArgs(CheckEmailFragment checkEmailFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, checkEmailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public CheckEmailFragment newInstance() {
            return (CheckEmailFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public CheckEmailFragment newInstance(Void r1) {
            return (CheckEmailFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEmailViewState ComposeContent$lambda$0(SnapshotState4<CheckEmailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CheckEmailEvent> ComposeContent$lambda$1(SnapshotState4<Event<CheckEmailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
