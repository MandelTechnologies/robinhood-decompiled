package com.robinhood.android.support.appointments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.support.appointments.AppointmentsSchedulerEvent;
import com.robinhood.android.support.appointments.AppointmentsSchedulerViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import com.robinhood.shared.support.contracts.SupportHubFragmentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AppointmentsSchedulerComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"AppointmentsSchedulerComposable", "", "duxo", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;", "onNavigateBack", "Lkotlin/Function0;", "onCloseAll", "source", "Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/support/contracts/AppointmentsSchedulerFragmentKey$Source;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "state", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDuxo;Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-support_externalRelease", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerEvent;", "showErrorDialog", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsSchedulerComposable$lambda$9(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, Function0 function0, Function0 function02, AppointmentsSchedulerFragmentKey.Source source, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppointmentsSchedulerComposable(appointmentsSchedulerDuxo, function0, function02, source, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Content$lambda$15$lambda$14$lambda$10(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Content$lambda$15$lambda$14$lambda$11(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Content$lambda$15$lambda$14$lambda$12(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Content$lambda$15$lambda$14$lambda$13(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$16(AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, AppointmentsSchedulerViewState appointmentsSchedulerViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(appointmentsSchedulerDuxo, appointmentsSchedulerViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorDialog$lambda$17(Function0 function0, int i, Composer composer, int i2) {
        ErrorDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppointmentsSchedulerComposable(final AppointmentsSchedulerDuxo duxo, final Function0<Unit> onNavigateBack, final Function0<Unit> onCloseAll, final AppointmentsSchedulerFragmentKey.Source source, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Context context;
        final Navigator navigator;
        Event<AppointmentsSchedulerEvent> event;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        final Event<AppointmentsSchedulerEvent> eventAppointmentsSchedulerComposable$lambda$1;
        final Event<AppointmentsSchedulerEvent> eventAppointmentsSchedulerComposable$lambda$12;
        final Context context2;
        final Navigator navigator2;
        final Event<AppointmentsSchedulerEvent> eventAppointmentsSchedulerComposable$lambda$13;
        final Event<AppointmentsSchedulerEvent> eventAppointmentsSchedulerComposable$lambda$14;
        final Modifier modifier3;
        EventConsumer<AppointmentsSchedulerEvent> eventConsumerInvoke;
        EventConsumer<AppointmentsSchedulerEvent> eventConsumerInvoke2;
        EventConsumer<AppointmentsSchedulerEvent> eventConsumerInvoke3;
        EventConsumer<AppointmentsSchedulerEvent> eventConsumerInvoke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onNavigateBack, "onNavigateBack");
        Intrinsics.checkNotNullParameter(onCloseAll, "onCloseAll");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1009965104);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavigateBack) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseAll) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(source) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009965104, i3, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable (AppointmentsSchedulerComposable.kt:53)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<AppointmentsSchedulerEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AppointmentsSchedulerComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof AppointmentsSchedulerEvent) {
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
                Event<AppointmentsSchedulerEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof AppointmentsSchedulerEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), ComposableLambda3.rememberComposableLambda(-223322476, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-223322476, i5, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous> (AppointmentsSchedulerComposable.kt:64)");
                        }
                        final SnapshotState4<AppointmentsSchedulerViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(359710337, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(359710337, i6, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous>.<anonymous> (AppointmentsSchedulerComposable.kt:66)");
                                }
                                if (!(AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState4).getLoadingState() instanceof AppointmentsSchedulerViewState.LoadingState.Loaded)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_title, composer3, 0);
                                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                TextStyle textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textM, composer3, 12582960, 0, 7996);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Function0<Unit> function0 = onCloseAll;
                        final Function0<Unit> function02 = onNavigateBack;
                        final SnapshotState4<AppointmentsSchedulerViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(259759573, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i7 = ((i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i6;
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(259759573, i7, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous>.<anonymous> (AppointmentsSchedulerComposable.kt:80)");
                                }
                                if (AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState42).getUseCloseNavButton()) {
                                    composer3.startReplaceGroup(-1033568255);
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "ToolbarCloseButton"), false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1033264672);
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "ToolbarBackButton"), false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final SnapshotState4<AppointmentsSchedulerViewState> snapshotState43 = snapshotState4CollectAsStateWithLifecycle;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(1208694150, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoAppBar, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1208694150, i6, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous>.<anonymous> (AppointmentsSchedulerComposable.kt:95)");
                                }
                                BentoProgressBar2.m20698BentoProgressBarjB83MbM(AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState43).getProgress(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 3, 0L, 0L, false, composer3, 432, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), false, false, null, null, 0L, null, composer2, 24966, 0, 2026);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1487962847, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer2.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1487962847, i6, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous> (AppointmentsSchedulerComposable.kt:105)");
                        }
                        AppointmentsSchedulerViewState.LoadingState loadingState = AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoadingState();
                        if (Intrinsics.areEqual(loadingState, AppointmentsSchedulerViewState.LoadingState.Uninitialized.INSTANCE) || Intrinsics.areEqual(loadingState, AppointmentsSchedulerViewState.LoadingState.Loading.INSTANCE) || (loadingState instanceof AppointmentsSchedulerViewState.LoadingState.Error)) {
                            composer2.startReplaceGroup(-456060799);
                            AppointmentsLoadingComposable.AppointmentsLoadingComposable(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(loadingState instanceof AppointmentsSchedulerViewState.LoadingState.Loaded)) {
                                composer2.startReplaceGroup(-291810444);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-455733005);
                            AppointmentsSchedulerComposable.Content(duxo, AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (AppointmentsSchedulerComposable$lambda$3(snapshotState)) {
                    ErrorDialog(onNavigateBack, composerStartRestartGroup, (i3 >> 3) & 14);
                }
                eventAppointmentsSchedulerComposable$lambda$1 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAppointmentsSchedulerComposable$lambda$1 != null && (eventAppointmentsSchedulerComposable$lambda$1.getData() instanceof AppointmentsSchedulerEvent.ShowErrorDialog) && (eventConsumerInvoke4 = eventAppointmentsSchedulerComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(eventAppointmentsSchedulerComposable$lambda$1, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19024invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19024invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$4(snapshotState, true);
                        }
                    });
                }
                eventAppointmentsSchedulerComposable$lambda$12 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAppointmentsSchedulerComposable$lambda$12 == null && (eventAppointmentsSchedulerComposable$lambda$12.getData() instanceof AppointmentsSchedulerEvent.ShowScheduledConfirmation) && (eventConsumerInvoke3 = eventAppointmentsSchedulerComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    context2 = context;
                    navigator2 = navigator;
                    eventConsumerInvoke3.consume(eventAppointmentsSchedulerComposable$lambda$12, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19025invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19025invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsSchedulerEvent.ShowScheduledConfirmation showScheduledConfirmation = (AppointmentsSchedulerEvent.ShowScheduledConfirmation) eventAppointmentsSchedulerComposable$lambda$12.getData();
                            onCloseAll.invoke();
                            Navigator.DefaultImpls.showFragment$default(navigator, context2, new AppointmentsConfirmationFragmentKey.Scheduled(showScheduledConfirmation.getAppointment(), source), false, true, false, null, true, null, true, false, null, null, 3764, null);
                        }
                    });
                } else {
                    context2 = context;
                    navigator2 = navigator;
                }
                eventAppointmentsSchedulerComposable$lambda$13 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAppointmentsSchedulerComposable$lambda$13 != null && (eventAppointmentsSchedulerComposable$lambda$13.getData() instanceof AppointmentsSchedulerEvent.ShowSupportHub) && (eventConsumerInvoke2 = eventAppointmentsSchedulerComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventAppointmentsSchedulerComposable$lambda$13, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19026invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19026invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onCloseAll.invoke();
                            context2.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator2, context2, SupportHubFragmentKey.INSTANCE, true, true, true, null, false, true, false, false, false, null, true, 3936, null));
                        }
                    });
                }
                eventAppointmentsSchedulerComposable$lambda$14 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAppointmentsSchedulerComposable$lambda$14 != null && (eventAppointmentsSchedulerComposable$lambda$14.getData() instanceof AppointmentsSchedulerEvent.ShowViewingAppointmentConfirmationView) && (eventConsumerInvoke = eventAppointmentsSchedulerComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                    final Context context3 = context2;
                    eventConsumerInvoke.consume(eventAppointmentsSchedulerComposable$lambda$14, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19027invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19027invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsSchedulerEvent.ShowViewingAppointmentConfirmationView showViewingAppointmentConfirmationView = (AppointmentsSchedulerEvent.ShowViewingAppointmentConfirmationView) eventAppointmentsSchedulerComposable$lambda$14.getData();
                            onCloseAll.invoke();
                            Navigator.DefaultImpls.showFragment$default(navigator2, context3, new AppointmentsConfirmationFragmentKey.ScheduledRedirectToView(showViewingAppointmentConfirmationView.getAppointment(), source), false, false, false, null, false, null, true, false, null, null, 3836, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$9(duxo, onNavigateBack, onCloseAll, source, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final SnapshotState4<AppointmentsSchedulerViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AppointmentsSchedulerComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof AppointmentsSchedulerEvent) {
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
                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<AppointmentsSchedulerEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof AppointmentsSchedulerEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), ComposableLambda3.rememberComposableLambda(-223322476, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-223322476, i5, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous> (AppointmentsSchedulerComposable.kt:64)");
                    }
                    final SnapshotState4<AppointmentsSchedulerViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(359710337, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(359710337, i6, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous>.<anonymous> (AppointmentsSchedulerComposable.kt:66)");
                            }
                            if (!(AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState4).getLoadingState() instanceof AppointmentsSchedulerViewState.LoadingState.Loaded)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_scheduler_title, composer3, 0);
                            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            TextStyle textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, textM, composer3, 12582960, 0, 7996);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final Function0<Unit> function0 = onCloseAll;
                    final Function0<Unit> function02 = onNavigateBack;
                    final SnapshotState4<AppointmentsSchedulerViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle3;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(259759573, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i7 = ((i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i6;
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(259759573, i7, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous>.<anonymous> (AppointmentsSchedulerComposable.kt:80)");
                            }
                            if (AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState42).getUseCloseNavButton()) {
                                composer3.startReplaceGroup(-1033568255);
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "ToolbarCloseButton"), false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1033264672);
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "ToolbarBackButton"), false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 6);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final SnapshotState4<AppointmentsSchedulerViewState> snapshotState43 = snapshotState4CollectAsStateWithLifecycle3;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(1208694150, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1208694150, i6, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous>.<anonymous> (AppointmentsSchedulerComposable.kt:95)");
                            }
                            BentoProgressBar2.m20698BentoProgressBarjB83MbM(AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState43).getProgress(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 3, 0L, 0L, false, composer3, 432, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), false, false, null, null, 0L, null, composer2, 24966, 0, 2026);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1487962847, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.AppointmentsSchedulerComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1487962847, i6, -1, "com.robinhood.android.support.appointments.AppointmentsSchedulerComposable.<anonymous> (AppointmentsSchedulerComposable.kt:105)");
                    }
                    AppointmentsSchedulerViewState.LoadingState loadingState = AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getLoadingState();
                    if (Intrinsics.areEqual(loadingState, AppointmentsSchedulerViewState.LoadingState.Uninitialized.INSTANCE) || Intrinsics.areEqual(loadingState, AppointmentsSchedulerViewState.LoadingState.Loading.INSTANCE) || (loadingState instanceof AppointmentsSchedulerViewState.LoadingState.Error)) {
                        composer2.startReplaceGroup(-456060799);
                        AppointmentsLoadingComposable.AppointmentsLoadingComposable(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(loadingState instanceof AppointmentsSchedulerViewState.LoadingState.Loaded)) {
                            composer2.startReplaceGroup(-291810444);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-455733005);
                        AppointmentsSchedulerComposable.Content(duxo, AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
            composerStartRestartGroup = composerStartRestartGroup;
            if (AppointmentsSchedulerComposable$lambda$3(snapshotState)) {
            }
            eventAppointmentsSchedulerComposable$lambda$1 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventAppointmentsSchedulerComposable$lambda$1 != null) {
                eventConsumerInvoke4.consume(eventAppointmentsSchedulerComposable$lambda$1, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m19024invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m19024invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AppointmentsSchedulerComposable.AppointmentsSchedulerComposable$lambda$4(snapshotState, true);
                    }
                });
            }
            eventAppointmentsSchedulerComposable$lambda$12 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventAppointmentsSchedulerComposable$lambda$12 == null) {
                context2 = context;
                navigator2 = navigator;
                eventAppointmentsSchedulerComposable$lambda$13 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventAppointmentsSchedulerComposable$lambda$13 != null) {
                    eventConsumerInvoke2.consume(eventAppointmentsSchedulerComposable$lambda$13, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19026invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19026invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onCloseAll.invoke();
                            context2.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator2, context2, SupportHubFragmentKey.INSTANCE, true, true, true, null, false, true, false, false, false, null, true, 3936, null));
                        }
                    });
                }
                eventAppointmentsSchedulerComposable$lambda$14 = AppointmentsSchedulerComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventAppointmentsSchedulerComposable$lambda$14 != null) {
                    final Context context32 = context2;
                    eventConsumerInvoke.consume(eventAppointmentsSchedulerComposable$lambda$14, new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$AppointmentsSchedulerComposable$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19027invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19027invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppointmentsSchedulerEvent.ShowViewingAppointmentConfirmationView showViewingAppointmentConfirmationView = (AppointmentsSchedulerEvent.ShowViewingAppointmentConfirmationView) eventAppointmentsSchedulerComposable$lambda$14.getData();
                            onCloseAll.invoke();
                            Navigator.DefaultImpls.showFragment$default(navigator2, context32, new AppointmentsConfirmationFragmentKey.ScheduledRedirectToView(showViewingAppointmentConfirmationView.getAppointment(), source), false, false, false, null, false, null, true, false, null, null, 3836, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppointmentsSchedulerComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppointmentsSchedulerViewState AppointmentsSchedulerComposable$lambda$0(SnapshotState4<AppointmentsSchedulerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AppointmentsSchedulerEvent> AppointmentsSchedulerComposable$lambda$1(SnapshotState4<Event<AppointmentsSchedulerEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean AppointmentsSchedulerComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnusedContentLambdaTargetStateParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final AppointmentsSchedulerDuxo appointmentsSchedulerDuxo, final AppointmentsSchedulerViewState appointmentsSchedulerViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(190609459);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(appointmentsSchedulerDuxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(appointmentsSchedulerViewState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(190609459, i3, -1, "com.robinhood.android.support.appointments.Content (AppointmentsSchedulerComposable.kt:189)");
                }
                AppointmentsSchedulerViewState.LoadingState loadingState = appointmentsSchedulerViewState.getLoadingState();
                Intrinsics.checkNotNull(loadingState, "null cannot be cast to non-null type com.robinhood.android.support.appointments.AppointmentsSchedulerViewState.LoadingState.Loaded");
                AppointmentsSchedulerViewState6 subScreen = ((AppointmentsSchedulerViewState.LoadingState.Loaded) loadingState).getSubScreen();
                Modifier modifierTestTag = TestTag3.testTag(modifier4, "LoadedScreen");
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AppointmentsSchedulerComposable.Content$lambda$15$lambda$14((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(subScreen, modifierTestTag, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-628081446, true, new Function4<AnimatedContentScope, AppointmentsSchedulerViewState6, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.Content.2

                    /* compiled from: AppointmentsSchedulerComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$Content$2$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[AppointmentsSchedulerViewState6.values().length];
                            try {
                                iArr[AppointmentsSchedulerViewState6.DatetimePicker.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[AppointmentsSchedulerViewState6.NotesWriter.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[AppointmentsSchedulerViewState6.Review.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Composer composer2, Integer num) throws Resources.NotFoundException {
                        invoke(animatedContentScope, appointmentsSchedulerViewState6, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, AppointmentsSchedulerViewState6 screen, Composer composer2, int i5) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-628081446, i5, -1, "com.robinhood.android.support.appointments.Content.<anonymous> (AppointmentsSchedulerComposable.kt:223)");
                        }
                        int i6 = WhenMappings.$EnumSwitchMapping$0[screen.ordinal()];
                        if (i6 == 1) {
                            composer2.startReplaceGroup(1998231550);
                            AppointmentsSchedulingDatetimePickerComposableKt.AppointmentsSchedulingDatetimePickerComposable(appointmentsSchedulerDuxo, screen, null, composer2, i5 & 112, 4);
                            composer2.endReplaceGroup();
                        } else if (i6 == 2) {
                            composer2.startReplaceGroup(1998438878);
                            AppointmentsSchedulingNotesWriterComposable.AppointmentsSchedulingNotesWriterComposable(appointmentsSchedulerDuxo, appointmentsSchedulerViewState, screen, null, composer2, (i5 << 3) & 896, 8);
                            composer2.endReplaceGroup();
                        } else {
                            if (i6 != 3) {
                                composer2.startReplaceGroup(2004120403);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(1998669580);
                            AppointmentsSchedulingReviewerComposable.AppointmentsSchedulingReviewerComposable(appointmentsSchedulerDuxo, null, composer2, 0, 2);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AppointmentsSchedulerComposable.Content$lambda$16(appointmentsSchedulerDuxo, appointmentsSchedulerViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AppointmentsSchedulerViewState.LoadingState loadingState2 = appointmentsSchedulerViewState.getLoadingState();
            Intrinsics.checkNotNull(loadingState2, "null cannot be cast to non-null type com.robinhood.android.support.appointments.AppointmentsSchedulerViewState.LoadingState.Loaded");
            AppointmentsSchedulerViewState6 subScreen2 = ((AppointmentsSchedulerViewState.LoadingState.Loaded) loadingState2).getSubScreen();
            Modifier modifierTestTag2 = TestTag3.testTag(modifier4, "LoadedScreen");
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(subScreen2, modifierTestTag2, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-628081446, true, new Function4<AnimatedContentScope, AppointmentsSchedulerViewState6, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt.Content.2

                /* compiled from: AppointmentsSchedulerComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$Content$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AppointmentsSchedulerViewState6.values().length];
                        try {
                            iArr[AppointmentsSchedulerViewState6.DatetimePicker.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AppointmentsSchedulerViewState6.NotesWriter.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[AppointmentsSchedulerViewState6.Review.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(animatedContentScope, appointmentsSchedulerViewState6, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, AppointmentsSchedulerViewState6 screen, Composer composer2, int i5) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(screen, "screen");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-628081446, i5, -1, "com.robinhood.android.support.appointments.Content.<anonymous> (AppointmentsSchedulerComposable.kt:223)");
                    }
                    int i6 = WhenMappings.$EnumSwitchMapping$0[screen.ordinal()];
                    if (i6 == 1) {
                        composer2.startReplaceGroup(1998231550);
                        AppointmentsSchedulingDatetimePickerComposableKt.AppointmentsSchedulingDatetimePickerComposable(appointmentsSchedulerDuxo, screen, null, composer2, i5 & 112, 4);
                        composer2.endReplaceGroup();
                    } else if (i6 == 2) {
                        composer2.startReplaceGroup(1998438878);
                        AppointmentsSchedulingNotesWriterComposable.AppointmentsSchedulingNotesWriterComposable(appointmentsSchedulerDuxo, appointmentsSchedulerViewState, screen, null, composer2, (i5 << 3) & 896, 8);
                        composer2.endReplaceGroup();
                    } else {
                        if (i6 != 3) {
                            composer2.startReplaceGroup(2004120403);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1998669580);
                        AppointmentsSchedulingReviewerComposable.AppointmentsSchedulingReviewerComposable(appointmentsSchedulerDuxo, null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform Content$lambda$15$lambda$14(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((AppointmentsSchedulerViewState6) AnimatedContent.getTargetState()).compareTo((AppointmentsSchedulerViewState6) AnimatedContent.getInitialState()) > 0) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AppointmentsSchedulerComposable.Content$lambda$15$lambda$14$lambda$10(((Integer) obj).intValue()));
                }
            }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AppointmentsSchedulerComposable.Content$lambda$15$lambda$14$lambda$11(((Integer) obj).intValue()));
                }
            }));
        }
        if (((AppointmentsSchedulerViewState6) AnimatedContent.getTargetState()).compareTo((AppointmentsSchedulerViewState6) AnimatedContent.getInitialState()) < 0) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AppointmentsSchedulerComposable.Content$lambda$15$lambda$14$lambda$12(((Integer) obj).intValue()));
                }
            }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AppointmentsSchedulerComposable.Content$lambda$15$lambda$14$lambda$13(((Integer) obj).intValue()));
                }
            }));
        }
        return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
    }

    private static final void ErrorDialog(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1300215103);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1300215103, i2, -1, "com.robinhood.android.support.appointments.ErrorDialog (AppointmentsSchedulerComposable.kt:249)");
            }
            function02 = function0;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C11048R.string.general_error_summary, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0), function0), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsSchedulerComposable.ErrorDialog$lambda$17(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
