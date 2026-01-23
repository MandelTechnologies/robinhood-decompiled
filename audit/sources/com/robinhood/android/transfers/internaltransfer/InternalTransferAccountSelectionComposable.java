package com.robinhood.android.transfers.internaltransfer;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionEvent;
import com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InternalTransferAccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0012\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m3636d2 = {"InternalTransferAccountSelection", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-hub_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionEvent;", "viewState", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternalTransferAccountSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferAccountSelection$lambda$6(Modifier modifier, InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo, int i, int i2, Composer composer, int i3) {
        InternalTransferAccountSelection(modifier, internalTransferAccountSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalTransferAccountSelection(Modifier modifier, InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo3;
        Event<InternalTransferAccountSelectionEvent> event;
        final Event<InternalTransferAccountSelectionEvent> eventInternalTransferAccountSelection$lambda$0;
        InternalTransferAccountSelectionViewState internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2;
        Modifier modifier4;
        final InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo4;
        Composer composer3;
        EventConsumer<InternalTransferAccountSelectionEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1741093643);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                internalTransferAccountSelectionDuxo2 = internalTransferAccountSelectionDuxo;
                int i6 = composerStartRestartGroup.changedInstance(internalTransferAccountSelectionDuxo2) ? 32 : 16;
                i3 |= i6;
            } else {
                internalTransferAccountSelectionDuxo2 = internalTransferAccountSelectionDuxo;
            }
            i3 |= i6;
        } else {
            internalTransferAccountSelectionDuxo2 = internalTransferAccountSelectionDuxo;
        }
        int i7 = i3;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            internalTransferAccountSelectionDuxo4 = internalTransferAccountSelectionDuxo2;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InternalTransferAccountSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    i4 = i7 & (-113);
                    internalTransferAccountSelectionDuxo3 = (InternalTransferAccountSelectionDuxo) baseDuxo;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1741093643, i4, -1, "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelection (InternalTransferAccountSelectionComposable.kt:23)");
                }
                final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final StateFlow<Event<InternalTransferAccountSelectionEvent>> eventFlow = internalTransferAccountSelectionDuxo3.getEventFlow();
                composer2.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InternalTransferAccountSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof InternalTransferAccountSelectionEvent) {
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
                Event<InternalTransferAccountSelectionEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof InternalTransferAccountSelectionEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                composer2.endReplaceGroup();
                eventInternalTransferAccountSelection$lambda$0 = InternalTransferAccountSelection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventInternalTransferAccountSelection$lambda$0 != null) {
                    if ((eventInternalTransferAccountSelection$lambda$0.getData() instanceof InternalTransferAccountSelectionEvent.LaunchActivity) && (eventConsumerInvoke = eventInternalTransferAccountSelection$lambda$0.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventInternalTransferAccountSelection$lambda$0, new Function1() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19635invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19635invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.startActivity$default(navigator, context, ((InternalTransferAccountSelectionEvent.LaunchActivity) eventInternalTransferAccountSelection$lambda$0.getData()).getIntentKey(), null, false, null, null, 60, null);
                                BaseContexts.requireActivityBaseContext(context).finish();
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Composer composer4 = composer2;
                internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2 = InternalTransferAccountSelection$lambda$2(FlowExtKt.collectAsStateWithLifecycle(internalTransferAccountSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7));
                if (internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2 instanceof InternalTransferAccountSelectionViewState.Loading) {
                    Modifier modifier5 = modifier3;
                    if (!(internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2 instanceof InternalTransferAccountSelectionViewState.Loaded)) {
                        composer4.startReplaceGroup(-1846235278);
                        composer4.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer4.startReplaceGroup(-1398397019);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier5);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    modifier4 = modifier5;
                    internalTransferAccountSelectionDuxo4 = internalTransferAccountSelectionDuxo3;
                    BentoText2.m20747BentoText38GnDrw("Select an account to transfer from", PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, bentoTheme.getSpacing(composer4, i8).m21592getMediumD9Ej5fM(), composer4, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i8).getDisplayCapsuleMedium(), composer4, 6, 0, 8188);
                    composer3 = composer4;
                    composer3.startReplaceGroup(-1125855781);
                    for (final InternalTransferAccountSelectionViewState.Row row : ((InternalTransferAccountSelectionViewState.Loaded) internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2).getRows()) {
                        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(row.getIcon(), null, null, 6, null), row.getTitle(), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer3.changedInstance(internalTransferAccountSelectionDuxo4) | composer3.changed(row);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalTransferAccountSelectionComposable.InternalTransferAccountSelection$lambda$5$lambda$4$lambda$3(internalTransferAccountSelectionDuxo4, row);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        Composer composer5 = composer3;
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue2, composer5, BentoBaseRowState.$stable << 3, 61);
                        composer3 = composer5;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-1398657016);
                    Modifier modifier6 = modifier3;
                    LoadingScreenComposablesKt.ListLoadingScreenComposable(modifier6, true, false, 2, composer4, (i4 & 14) | 3120, 4);
                    composer3 = composer4;
                    composer3.endReplaceGroup();
                    modifier4 = modifier6;
                    internalTransferAccountSelectionDuxo4 = internalTransferAccountSelectionDuxo3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                modifier3 = modifier2;
            }
            composer2 = composerStartRestartGroup;
            i4 = i7;
            internalTransferAccountSelectionDuxo3 = internalTransferAccountSelectionDuxo2;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Flow eventFlow2 = internalTransferAccountSelectionDuxo3.getEventFlow();
            composer2.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InternalTransferAccountSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$InternalTransferAccountSelection$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof InternalTransferAccountSelectionEvent) {
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
            Event<InternalTransferAccountSelectionEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof InternalTransferAccountSelectionEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer2, 0, 0);
            composer2.endReplaceGroup();
            eventInternalTransferAccountSelection$lambda$0 = InternalTransferAccountSelection$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
            if (eventInternalTransferAccountSelection$lambda$0 != null) {
            }
            Composer composer42 = composer2;
            internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2 = InternalTransferAccountSelection$lambda$2(FlowExtKt.collectAsStateWithLifecycle(internalTransferAccountSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7));
            if (internalTransferAccountSelectionViewStateInternalTransferAccountSelection$lambda$2 instanceof InternalTransferAccountSelectionViewState.Loading) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalTransferAccountSelectionComposable.InternalTransferAccountSelection$lambda$6(modifier2, internalTransferAccountSelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferAccountSelection$lambda$5$lambda$4$lambda$3(InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo, InternalTransferAccountSelectionViewState.Row row) {
        internalTransferAccountSelectionDuxo.onSourceAccountSelected(row.getAccountId());
        return Unit.INSTANCE;
    }

    private static final Event<InternalTransferAccountSelectionEvent> InternalTransferAccountSelection$lambda$0(SnapshotState4<Event<InternalTransferAccountSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final InternalTransferAccountSelectionViewState InternalTransferAccountSelection$lambda$2(SnapshotState4<? extends InternalTransferAccountSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
