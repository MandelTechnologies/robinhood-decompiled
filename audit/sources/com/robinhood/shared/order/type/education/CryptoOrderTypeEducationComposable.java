package com.robinhood.shared.order.type.education;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducationComposable4;
import com.robinhood.shared.order.type.education.CryptoOrderTypeEducationDuxo2;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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

/* compiled from: CryptoOrderTypeEducationComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoOrderTypeEducationComposable", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "onContinue", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationDuxo;", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-order-type_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderTypeEducationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTypeEducationComposable$lambda$6(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, Function0 function0, CryptoOrderTypeEducationDuxo cryptoOrderTypeEducationDuxo, int i, int i2, Composer composer, int i3) {
        CryptoOrderTypeEducationComposable(orderTypeEducationConfiguration, function0, cryptoOrderTypeEducationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderTypeEducationComposable(final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration, final Function0<Unit> onContinue, CryptoOrderTypeEducationDuxo cryptoOrderTypeEducationDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final CryptoOrderTypeEducationDuxo cryptoOrderTypeEducationDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        final CryptoOrderTypeEducationDuxo cryptoOrderTypeEducationDuxo3;
        Event<CryptoOrderTypeEducationDuxo2> event;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        final Event<CryptoOrderTypeEducationDuxo2> eventCryptoOrderTypeEducationComposable$lambda$0;
        final Event<CryptoOrderTypeEducationDuxo2> eventCryptoOrderTypeEducationComposable$lambda$02;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        EventConsumer<CryptoOrderTypeEducationDuxo2> eventConsumerInvoke;
        EventConsumer<CryptoOrderTypeEducationDuxo2> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(2028172225);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(configuration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cryptoOrderTypeEducationDuxo2 = cryptoOrderTypeEducationDuxo;
                int i4 = composerStartRestartGroup.changedInstance(cryptoOrderTypeEducationDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                cryptoOrderTypeEducationDuxo2 = cryptoOrderTypeEducationDuxo;
            }
            i3 |= i4;
        } else {
            cryptoOrderTypeEducationDuxo2 = cryptoOrderTypeEducationDuxo;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoOrderTypeEducationDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    cryptoOrderTypeEducationDuxo2 = (CryptoOrderTypeEducationDuxo) baseDuxo;
                    i3 &= -897;
                }
                cryptoOrderTypeEducationDuxo3 = cryptoOrderTypeEducationDuxo2;
                int i5 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2028172225, i5, -1, "com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposable (CryptoOrderTypeEducationComposable.kt:15)");
                }
                final StateFlow<Event<CryptoOrderTypeEducationDuxo2>> eventFlow = cryptoOrderTypeEducationDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoOrderTypeEducationComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoOrderTypeEducationDuxo2) {
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
                Event<CryptoOrderTypeEducationDuxo2> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CryptoOrderTypeEducationDuxo2)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventCryptoOrderTypeEducationComposable$lambda$0 = CryptoOrderTypeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventCryptoOrderTypeEducationComposable$lambda$0 != null && (eventCryptoOrderTypeEducationComposable$lambda$0.getData() instanceof CryptoOrderTypeEducationDuxo2.OnContinue) && (eventConsumerInvoke2 = eventCryptoOrderTypeEducationComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventCryptoOrderTypeEducationComposable$lambda$0, new Function1() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25570invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25570invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onContinue.invoke();
                        }
                    });
                }
                eventCryptoOrderTypeEducationComposable$lambda$02 = CryptoOrderTypeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventCryptoOrderTypeEducationComposable$lambda$02 != null && (eventCryptoOrderTypeEducationComposable$lambda$02.getData() instanceof CryptoOrderTypeEducationDuxo2.PopBackStack) && (eventConsumerInvoke = eventCryptoOrderTypeEducationComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoOrderTypeEducationComposable$lambda$02, new Function1() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25571invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25571invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, false, 1, null);
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lifecycleAwareNavigator);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CryptoOrderTypeEducationComposable2(lifecycleAwareNavigator);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoOrderTypeEducationDuxo3) | composerStartRestartGroup.changedInstance(configuration);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderTypeEducationComposable.CryptoOrderTypeEducationComposable$lambda$5$lambda$4(cryptoOrderTypeEducationDuxo3, configuration);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                OrderTypeEducationComposable4.OrderTypeEducationComposable(configuration, function0, (Function0) objRememberedValue2, null, null, null, composerStartRestartGroup, i5 & 14, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoOrderTypeEducationDuxo2 = cryptoOrderTypeEducationDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                cryptoOrderTypeEducationDuxo3 = cryptoOrderTypeEducationDuxo2;
                int i52 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Flow eventFlow2 = cryptoOrderTypeEducationDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoOrderTypeEducationComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoOrderTypeEducationDuxo2) {
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
                Event<CryptoOrderTypeEducationDuxo2> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CryptoOrderTypeEducationDuxo2)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventCryptoOrderTypeEducationComposable$lambda$0 = CryptoOrderTypeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderTypeEducationComposable$lambda$0 != null) {
                    eventConsumerInvoke2.consume(eventCryptoOrderTypeEducationComposable$lambda$0, new Function1() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25570invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25570invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onContinue.invoke();
                        }
                    });
                }
                eventCryptoOrderTypeEducationComposable$lambda$02 = CryptoOrderTypeEducationComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderTypeEducationComposable$lambda$02 != null) {
                    eventConsumerInvoke.consume(eventCryptoOrderTypeEducationComposable$lambda$02, new Function1() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$CryptoOrderTypeEducationComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25571invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25571invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, false, 1, null);
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lifecycleAwareNavigator);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new CryptoOrderTypeEducationComposable2(lifecycleAwareNavigator);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoOrderTypeEducationDuxo3) | composerStartRestartGroup.changedInstance(configuration);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderTypeEducationComposable.CryptoOrderTypeEducationComposable$lambda$5$lambda$4(cryptoOrderTypeEducationDuxo3, configuration);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        OrderTypeEducationComposable4.OrderTypeEducationComposable(configuration, function02, (Function0) objRememberedValue2, null, null, null, composerStartRestartGroup, i52 & 14, 56);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        cryptoOrderTypeEducationDuxo2 = cryptoOrderTypeEducationDuxo3;
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderTypeEducationComposable.CryptoOrderTypeEducationComposable$lambda$6(configuration, onContinue, cryptoOrderTypeEducationDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTypeEducationComposable$lambda$5$lambda$4(CryptoOrderTypeEducationDuxo cryptoOrderTypeEducationDuxo, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        Order.Configuration orderConfiguration;
        OrderSide side;
        boolean z = orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder;
        if (z) {
            orderConfiguration = ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getOrderConfiguration();
        } else {
            if (!(orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract)) {
                throw new IllegalStateException(("Unexpected configuration type: " + orderTypeEducationConfiguration).toString());
            }
            orderConfiguration = ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration).getOrderConfiguration();
        }
        if (z) {
            side = ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getSide();
        } else {
            if (!(orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract)) {
                throw new IllegalStateException(("Unexpected configuration type: " + orderTypeEducationConfiguration).toString());
            }
            side = ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration).getSide();
        }
        cryptoOrderTypeEducationDuxo.onContinueClick(orderConfiguration, side);
        return Unit.INSTANCE;
    }

    private static final Event<CryptoOrderTypeEducationDuxo2> CryptoOrderTypeEducationComposable$lambda$0(SnapshotState4<Event<CryptoOrderTypeEducationDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
