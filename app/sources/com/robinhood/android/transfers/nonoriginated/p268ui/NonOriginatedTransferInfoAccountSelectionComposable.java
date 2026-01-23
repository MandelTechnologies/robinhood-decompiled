package com.robinhood.android.transfers.nonoriginated.p268ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import bff_money_movement.service.p019v1.RobinhoodAccountDto;
import com.robinhood.android.lib.accountswitcher.AccountSelectionList;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
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

/* compiled from: NonOriginatedTransferInfoAccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u0012\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eX\u008a\u0084\u0002"}, m3636d2 = {"NonOriginatedTransferInfoAccountSelectionComposable", "", "onAccountRowClick", "Lkotlin/Function1;", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-non-originated-transfer-info_externalDebug", "viewState", "Lcom/robinhood/android/transfers/nonoriginated/ui/NonOriginatedTransferInfoAccountSelectionViewState;", "event", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class NonOriginatedTransferInfoAccountSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NonOriginatedTransferInfoAccountSelectionComposable$lambda$4(Function1 function1, Modifier modifier, NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo, int i, int i2, Composer composer, int i3) {
        NonOriginatedTransferInfoAccountSelectionComposable(function1, modifier, nonOriginatedTransferInfoAccountSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NonOriginatedTransferInfoAccountSelectionComposable(final Function1<? super RobinhoodAccountDto, Unit> onAccountRowClick, Modifier modifier, NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo2;
        Modifier modifier3;
        int i4;
        final NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo3;
        Composer composer2;
        Event<RobinhoodAccountDto> event;
        final Event<RobinhoodAccountDto> eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        StringResource title;
        final NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo4;
        final Modifier modifier4;
        EventConsumer<RobinhoodAccountDto> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAccountRowClick, "onAccountRowClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-654620904);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onAccountRowClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    nonOriginatedTransferInfoAccountSelectionDuxo2 = nonOriginatedTransferInfoAccountSelectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(nonOriginatedTransferInfoAccountSelectionDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    nonOriginatedTransferInfoAccountSelectionDuxo2 = nonOriginatedTransferInfoAccountSelectionDuxo;
                }
                i3 |= i6;
            } else {
                nonOriginatedTransferInfoAccountSelectionDuxo2 = nonOriginatedTransferInfoAccountSelectionDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(NonOriginatedTransferInfoAccountSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$duxo$1.1
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
                        NonOriginatedTransferInfoAccountSelectionDuxo nonOriginatedTransferInfoAccountSelectionDuxo5 = (NonOriginatedTransferInfoAccountSelectionDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        nonOriginatedTransferInfoAccountSelectionDuxo3 = nonOriginatedTransferInfoAccountSelectionDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-654620904, i4, -1, "com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposable (NonOriginatedTransferInfoAccountSelectionComposable.kt:23)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(nonOriginatedTransferInfoAccountSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composer2 = composerStartRestartGroup;
                    final StateFlow<Event<RobinhoodAccountDto>> eventFlow = nonOriginatedTransferInfoAccountSelectionDuxo3.getEventFlow();
                    composer2.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "NonOriginatedTransferInfoAccountSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof RobinhoodAccountDto) {
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
                    Event<RobinhoodAccountDto> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof RobinhoodAccountDto)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1 = NonOriginatedTransferInfoAccountSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1 != null && (eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1.getData() instanceof RobinhoodAccountDto) && (eventConsumerInvoke = eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19684invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19684invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onAccountRowClick.invoke(eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1.getData());
                            }
                        });
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier3);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    title = NonOriginatedTransferInfoAccountSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTitle();
                    composer2.startReplaceGroup(75462711);
                    if (title != null) {
                        String textAsString = StringResources6.getTextAsString(title, composer2, StringResource.$stable);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(textAsString, PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    AccountSelectionList.AccountSelectionList(new AccountSelectorData(NonOriginatedTransferInfoAccountSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRows()), new AccountSelectorCallbacks() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$1$2
                        @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks
                        public void onAccountSelected(String accountNumber) {
                            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                            nonOriginatedTransferInfoAccountSelectionDuxo3.onAccountSelected(accountNumber);
                        }
                    }, null, null, composer3, 0, 12);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    nonOriginatedTransferInfoAccountSelectionDuxo4 = nonOriginatedTransferInfoAccountSelectionDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                nonOriginatedTransferInfoAccountSelectionDuxo3 = nonOriginatedTransferInfoAccountSelectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(nonOriginatedTransferInfoAccountSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                final Flow eventFlow2 = nonOriginatedTransferInfoAccountSelectionDuxo3.getEventFlow();
                composer2.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "NonOriginatedTransferInfoAccountSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof RobinhoodAccountDto) {
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
                Event<RobinhoodAccountDto> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof RobinhoodAccountDto)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer2, 0, 0);
                composer2.endReplaceGroup();
                eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1 = NonOriginatedTransferInfoAccountSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19684invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19684invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onAccountRowClick.invoke(eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1.getData());
                        }
                    });
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    title = NonOriginatedTransferInfoAccountSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getTitle();
                    composer2.startReplaceGroup(75462711);
                    if (title != null) {
                    }
                    composer2.endReplaceGroup();
                    Composer composer32 = composer2;
                    AccountSelectionList.AccountSelectionList(new AccountSelectorData(NonOriginatedTransferInfoAccountSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getRows()), new AccountSelectorCallbacks() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$1$2
                        @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks
                        public void onAccountSelected(String accountNumber) {
                            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                            nonOriginatedTransferInfoAccountSelectionDuxo3.onAccountSelected(accountNumber);
                        }
                    }, null, null, composer32, 0, 12);
                    composerStartRestartGroup = composer32;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier3;
                    nonOriginatedTransferInfoAccountSelectionDuxo4 = nonOriginatedTransferInfoAccountSelectionDuxo3;
                    modifier4 = modifier52;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                nonOriginatedTransferInfoAccountSelectionDuxo4 = nonOriginatedTransferInfoAccountSelectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NonOriginatedTransferInfoAccountSelectionComposable.NonOriginatedTransferInfoAccountSelectionComposable$lambda$4(onAccountRowClick, modifier4, nonOriginatedTransferInfoAccountSelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = i3;
                    nonOriginatedTransferInfoAccountSelectionDuxo3 = nonOriginatedTransferInfoAccountSelectionDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(nonOriginatedTransferInfoAccountSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                final Flow eventFlow22 = nonOriginatedTransferInfoAccountSelectionDuxo3.getEventFlow();
                composer2.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "NonOriginatedTransferInfoAccountSelectionComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionComposableKt$NonOriginatedTransferInfoAccountSelectionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof RobinhoodAccountDto) {
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
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<RobinhoodAccountDto> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof RobinhoodAccountDto)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composer2, 0, 0);
                composer2.endReplaceGroup();
                eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1 = NonOriginatedTransferInfoAccountSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventNonOriginatedTransferInfoAccountSelectionComposable$lambda$1 != null) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final NonOriginatedTransferInfoAccountSelectionViewState NonOriginatedTransferInfoAccountSelectionComposable$lambda$0(SnapshotState4<NonOriginatedTransferInfoAccountSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<RobinhoodAccountDto> NonOriginatedTransferInfoAccountSelectionComposable$lambda$1(SnapshotState4<Event<RobinhoodAccountDto>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
