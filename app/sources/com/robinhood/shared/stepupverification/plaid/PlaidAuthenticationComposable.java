package com.robinhood.shared.stepupverification.plaid;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p355ui.pathfinder.contexts.PlaidAuthenticationContext;
import com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationEvent;
import com.robinhood.utils.compose.LocalActivity3;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PlaidAuthenticationComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002"}, m3636d2 = {"PlaidAuthenticationComposable", "", "pathfinderContext", "Lcom/robinhood/models/ui/pathfinder/contexts/PlaidAuthenticationContext;", "onUseFallback", "Lkotlin/Function0;", "onFallbackDialogDismissed", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo;", "(Lcom/robinhood/models/ui/pathfinder/contexts/PlaidAuthenticationContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo;Landroidx/compose/runtime/Composer;II)V", "FallbackDialog", "(Lcom/robinhood/models/ui/pathfinder/contexts/PlaidAuthenticationContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PlaidAuthenticationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FallbackDialog$lambda$5(PlaidAuthenticationContext plaidAuthenticationContext, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        FallbackDialog(plaidAuthenticationContext, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidAuthenticationComposable$lambda$4(PlaidAuthenticationContext plaidAuthenticationContext, Function0 function0, Function0 function02, ActivityErrorHandler activityErrorHandler, Modifier modifier, PlaidAuthenticationDuxo plaidAuthenticationDuxo, int i, int i2, Composer composer, int i3) {
        PlaidAuthenticationComposable(plaidAuthenticationContext, function0, function02, activityErrorHandler, modifier, plaidAuthenticationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlaidAuthenticationComposable(final PlaidAuthenticationContext pathfinderContext, final Function0<Unit> onUseFallback, final Function0<Unit> onFallbackDialogDismissed, final ActivityErrorHandler activityErrorHandler, Modifier modifier, PlaidAuthenticationDuxo plaidAuthenticationDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PlaidAuthenticationDuxo plaidAuthenticationDuxo2;
        Modifier modifier3;
        int i4;
        PlaidAuthenticationDuxo plaidAuthenticationDuxo3;
        final FragmentActivity fragmentActivity;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<PlaidAuthenticationEvent> event;
        final Event<PlaidAuthenticationEvent> eventPlaidAuthenticationComposable$lambda$1;
        final Event<PlaidAuthenticationEvent> eventPlaidAuthenticationComposable$lambda$12;
        final Modifier modifier4;
        final PlaidAuthenticationDuxo plaidAuthenticationDuxo4;
        EventConsumer<PlaidAuthenticationEvent> eventConsumerInvoke;
        EventConsumer<PlaidAuthenticationEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pathfinderContext, "pathfinderContext");
        Intrinsics.checkNotNullParameter(onUseFallback, "onUseFallback");
        Intrinsics.checkNotNullParameter(onFallbackDialogDismissed, "onFallbackDialogDismissed");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2041419105);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pathfinderContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUseFallback) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFallbackDialogDismissed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    plaidAuthenticationDuxo2 = plaidAuthenticationDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(plaidAuthenticationDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    plaidAuthenticationDuxo2 = plaidAuthenticationDuxo;
                }
                i3 |= i6;
            } else {
                plaidAuthenticationDuxo2 = plaidAuthenticationDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PlaidAuthenticationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-458753);
                        plaidAuthenticationDuxo3 = (PlaidAuthenticationDuxo) baseDuxo;
                    } else {
                        i4 = i3;
                        plaidAuthenticationDuxo3 = plaidAuthenticationDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    plaidAuthenticationDuxo3 = plaidAuthenticationDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2041419105, i4, -1, "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposable (PlaidAuthenticationComposable.kt:26)");
                }
                fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(plaidAuthenticationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final StateFlow<Event<PlaidAuthenticationEvent>> eventFlow = plaidAuthenticationDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PlaidAuthenticationComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof PlaidAuthenticationEvent) {
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
                Event<PlaidAuthenticationEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof PlaidAuthenticationEvent)) {
                    value = null;
                }
                int i7 = i4;
                PlaidAuthenticationDuxo plaidAuthenticationDuxo5 = plaidAuthenticationDuxo3;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventPlaidAuthenticationComposable$lambda$1 = PlaidAuthenticationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPlaidAuthenticationComposable$lambda$1 != null && (eventPlaidAuthenticationComposable$lambda$1.getData() instanceof PlaidAuthenticationEvent.Error) && (eventConsumerInvoke2 = eventPlaidAuthenticationComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventPlaidAuthenticationComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25731invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25731invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((PlaidAuthenticationEvent.Error) eventPlaidAuthenticationComposable$lambda$1.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                eventPlaidAuthenticationComposable$lambda$12 = PlaidAuthenticationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPlaidAuthenticationComposable$lambda$12 != null && (eventPlaidAuthenticationComposable$lambda$12.getData() instanceof PlaidAuthenticationEvent.Timeout) && (eventConsumerInvoke = eventPlaidAuthenticationComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventPlaidAuthenticationComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25732invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25732invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            fragmentActivity.finish();
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(996317163);
                if (PlaidAuthenticationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowFallbackDialog()) {
                    FallbackDialog(pathfinderContext, onUseFallback, onFallbackDialogDismissed, composerStartRestartGroup, i7 & 1022);
                }
                composerStartRestartGroup.endReplaceGroup();
                LoadingScreenComposablesKt.PromoLoadingScreenComposable(modifier3, 0, composerStartRestartGroup, ((i7 >> 12) & 14) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                plaidAuthenticationDuxo4 = plaidAuthenticationDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                plaidAuthenticationDuxo4 = plaidAuthenticationDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PlaidAuthenticationComposable.PlaidAuthenticationComposable$lambda$4(pathfinderContext, onUseFallback, onFallbackDialogDismissed, activityErrorHandler, modifier4, plaidAuthenticationDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(plaidAuthenticationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = plaidAuthenticationDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PlaidAuthenticationComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof PlaidAuthenticationEvent) {
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
                Event<PlaidAuthenticationEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof PlaidAuthenticationEvent)) {
                }
                int i72 = i4;
                PlaidAuthenticationDuxo plaidAuthenticationDuxo52 = plaidAuthenticationDuxo3;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventPlaidAuthenticationComposable$lambda$1 = PlaidAuthenticationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPlaidAuthenticationComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventPlaidAuthenticationComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25731invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25731invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((PlaidAuthenticationEvent.Error) eventPlaidAuthenticationComposable$lambda$1.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                eventPlaidAuthenticationComposable$lambda$12 = PlaidAuthenticationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPlaidAuthenticationComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventPlaidAuthenticationComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$PlaidAuthenticationComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25732invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25732invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            fragmentActivity.finish();
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(996317163);
                if (PlaidAuthenticationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowFallbackDialog()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                LoadingScreenComposablesKt.PromoLoadingScreenComposable(modifier3, 0, composerStartRestartGroup, ((i72 >> 12) & 14) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                plaidAuthenticationDuxo4 = plaidAuthenticationDuxo52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void FallbackDialog(final PlaidAuthenticationContext plaidAuthenticationContext, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332858662);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(plaidAuthenticationContext) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332858662, i2, -1, "com.robinhood.shared.stepupverification.plaid.FallbackDialog (PlaidAuthenticationComposable.kt:56)");
            }
            String fallbackHeading = plaidAuthenticationContext.getFallbackHeading();
            int i3 = i2;
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(plaidAuthenticationContext.getFallbackSubheading());
            BentoAlertButton bentoAlertButton = new BentoAlertButton(plaidAuthenticationContext.getFallbackCtaText(), function0);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0), function02);
            int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(fallbackHeading, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function02, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12) | ((i3 << 18) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlaidAuthenticationComposable.FallbackDialog$lambda$5(plaidAuthenticationContext, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PlaidAuthenticationViewState PlaidAuthenticationComposable$lambda$0(SnapshotState4<PlaidAuthenticationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PlaidAuthenticationEvent> PlaidAuthenticationComposable$lambda$1(SnapshotState4<Event<PlaidAuthenticationEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
