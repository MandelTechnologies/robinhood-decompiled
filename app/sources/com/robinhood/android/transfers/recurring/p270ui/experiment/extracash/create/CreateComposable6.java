package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create;

import android.app.Activity;
import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavOptionsBuilder;
import androidx.view.compose.LocalActivity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavOptionsBuilders;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubDestinations2;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringExtraCashData;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateEvent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CreateComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u0084\u0002"}, m3636d2 = {"CreateComposable", "", "args", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "callbacks", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateDuxo;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateCallbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateComposable6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateComposable$lambda$3(RecurringExtraCashData recurringExtraCashData, CreateComposable5 createComposable5, Modifier modifier, CreateDuxo createDuxo, int i, int i2, Composer composer, int i3) {
        CreateComposable(recurringExtraCashData, createComposable5, modifier, createDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateComposable(final RecurringExtraCashData args, final CreateComposable5 callbacks, Modifier modifier, CreateDuxo createDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CreateDuxo createDuxo2;
        Modifier modifier3;
        int i4;
        CreateDuxo createDuxo3;
        Object objConsume;
        final CreateDuxo createDuxo4;
        final Modifier modifier4;
        EventConsumer<CreateEvent> eventConsumerInvoke;
        EventConsumer<CreateEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1799912428);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    createDuxo2 = createDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(createDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    createDuxo2 = createDuxo;
                }
                i3 |= i6;
            } else {
                createDuxo2 = createDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CreateDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        createDuxo3 = (CreateDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1799912428, i4, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposable (CreateComposable.kt:37)");
                        }
                        objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                        if (objConsume != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        final Activity activity = (Activity) objConsume;
                        final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                        final StateFlow<Event<CreateEvent>> eventFlow = createDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CreateComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof CreateEvent) {
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
                        Event<CreateEvent> value = eventFlow.getValue();
                        Event<CreateEvent> event = value;
                        if (!((event != null ? event.getData() : null) instanceof CreateEvent)) {
                            value = null;
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        final Event<CreateEvent> eventCreateComposable$lambda$0 = CreateComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (eventCreateComposable$lambda$0 != null && (eventCreateComposable$lambda$0.getData() instanceof CreateEvent.Success) && (eventConsumerInvoke2 = eventCreateComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventCreateComposable$lambda$0, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                    m19714invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19714invoke(Object it) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    callbacks.showPostTransferFlow(((CreateEvent.Success) eventCreateComposable$lambda$0.getData()).getPostTransferFlow());
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestination.composeNav$default(RecurringDepositHubDestinations2.INSTANCE, null, null, 3, null), false, (Function1) new Function1<NavOptionsBuilder, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                            invoke2(navOptionsBuilder);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(NavOptionsBuilder navigate) {
                                            Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                            NavOptionsBuilders.popUpTo(navigate, RecurringDepositHubDestinations2.INSTANCE.getRoutePath(), false);
                                            navigate.setLaunchSingleTop(true);
                                        }
                                    }, 2, (Object) null);
                                }
                            });
                        }
                        final Event<CreateEvent> eventCreateComposable$lambda$02 = CreateComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (eventCreateComposable$lambda$02 != null && (eventCreateComposable$lambda$02.getData() instanceof CreateEvent.Error) && (eventConsumerInvoke = eventCreateComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCreateComposable$lambda$02, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$CreateComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                    m19715invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19715invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((CreateEvent.Error) eventCreateComposable$lambda$02.getData()).getThrowable(), true, false, 0, null, 56, null);
                                }
                            });
                        }
                        Modifier modifier5 = modifier3;
                        LocalShowPlaceholder.Loadable(true, modifier5, null, CreateComposable.INSTANCE.m19710getLambda$1131048868$feature_recurring_deposits_externalDebug(), composerStartRestartGroup, ((i4 >> 3) & 112) | 3078, 4);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        createDuxo4 = createDuxo3;
                        modifier4 = modifier5;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                createDuxo3 = createDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                if (objConsume != null) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                createDuxo4 = createDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateComposable6.CreateComposable$lambda$3(args, callbacks, modifier4, createDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Event<CreateEvent> CreateComposable$lambda$0(SnapshotState4<Event<CreateEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
