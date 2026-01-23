package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetEvent;
import com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoHomeRewardsCardBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a-\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0010\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002"}, m3636d2 = {"CryptoHomeRewardsCardBottomSheet", "", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "onGotIt", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDuxo;", "(Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingState", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLoadingState", "Loaded", "viewState", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState$Loaded;", "(Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState$Loaded;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsCardBottomSheetFragment6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeRewardsCardBottomSheet$lambda$4(ActivityErrorHandler activityErrorHandler, Function0 function0, Modifier modifier, CryptoHomeRewardsCardBottomSheetDuxo cryptoHomeRewardsCardBottomSheetDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeRewardsCardBottomSheet(activityErrorHandler, function0, modifier, cryptoHomeRewardsCardBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$8(CryptoHomeRewardsCardBottomSheetViewState.Loaded loaded, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(loaded, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingState$lambda$5(int i, Composer composer, int i2) {
        LoadingState(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingState$lambda$6(int i, Composer composer, int i2) {
        PreviewLoadingState(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeRewardsCardBottomSheet(final ActivityErrorHandler activityErrorHandler, final Function0<Unit> onGotIt, Modifier modifier, CryptoHomeRewardsCardBottomSheetDuxo cryptoHomeRewardsCardBottomSheetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoHomeRewardsCardBottomSheetDuxo cryptoHomeRewardsCardBottomSheetDuxo2;
        int i4;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        int i5;
        CryptoHomeRewardsCardBottomSheetDuxo cryptoHomeRewardsCardBottomSheetDuxo3;
        Event<CryptoHomeRewardsCardBottomSheetEvent> event;
        final Event<CryptoHomeRewardsCardBottomSheetEvent> eventCryptoHomeRewardsCardBottomSheet$lambda$1;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        CryptoHomeRewardsCardBottomSheetViewState cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$0;
        final CryptoHomeRewardsCardBottomSheetDuxo cryptoHomeRewardsCardBottomSheetDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoHomeRewardsCardBottomSheetEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Intrinsics.checkNotNullParameter(onGotIt, "onGotIt");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1607671417);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGotIt) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoHomeRewardsCardBottomSheetDuxo2 = cryptoHomeRewardsCardBottomSheetDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoHomeRewardsCardBottomSheetDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    cryptoHomeRewardsCardBottomSheetDuxo2 = cryptoHomeRewardsCardBottomSheetDuxo;
                }
                i3 |= i7;
            } else {
                cryptoHomeRewardsCardBottomSheetDuxo2 = cryptoHomeRewardsCardBottomSheetDuxo;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeRewardsCardBottomSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$duxo$1.1
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
                        i5 = i4 & (-7169);
                        cryptoHomeRewardsCardBottomSheetDuxo3 = (CryptoHomeRewardsCardBottomSheetDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607671417, i5, -1, "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheet (CryptoHomeRewardsCardBottomSheetFragment.kt:57)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeRewardsCardBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    final StateFlow<Event<CryptoHomeRewardsCardBottomSheetEvent>> eventFlow = cryptoHomeRewardsCardBottomSheetDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoHomeRewardsCardBottomSheetFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoHomeRewardsCardBottomSheetEvent) {
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
                    Event<CryptoHomeRewardsCardBottomSheetEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoHomeRewardsCardBottomSheetEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventCryptoHomeRewardsCardBottomSheet$lambda$1 = CryptoHomeRewardsCardBottomSheet$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoHomeRewardsCardBottomSheet$lambda$1 != null && (eventCryptoHomeRewardsCardBottomSheet$lambda$1.getData() instanceof CryptoHomeRewardsCardBottomSheetEvent.Error) && (eventConsumerInvoke = eventCryptoHomeRewardsCardBottomSheet$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoHomeRewardsCardBottomSheet$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m13054invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13054invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(activityErrorHandler, ((CryptoHomeRewardsCardBottomSheetEvent.Error) eventCryptoHomeRewardsCardBottomSheet$lambda$1.getData()).getThrowable(), false, 2, null);
                            }
                        });
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$0 = CryptoHomeRewardsCardBottomSheet$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (!(cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$0 instanceof CryptoHomeRewardsCardBottomSheetViewState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(-1118286391);
                        CryptoHomeRewardsCardBottomSheetViewState cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$02 = CryptoHomeRewardsCardBottomSheet$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        Intrinsics.checkNotNull(cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$02, "null cannot be cast to non-null type com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetViewState.Loaded");
                        Loaded((CryptoHomeRewardsCardBottomSheetViewState.Loaded) cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$02, onGotIt, Modifier.INSTANCE, composerStartRestartGroup, (i5 & 112) | 384, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$0, CryptoHomeRewardsCardBottomSheetViewState.Loading.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(-1118289462);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1118278033);
                        LoadingState(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoHomeRewardsCardBottomSheetDuxo4 = cryptoHomeRewardsCardBottomSheetDuxo3;
                    modifier4 = modifier3;
                }
                i5 = i4;
                cryptoHomeRewardsCardBottomSheetDuxo3 = cryptoHomeRewardsCardBottomSheetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeRewardsCardBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow2 = cryptoHomeRewardsCardBottomSheetDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoHomeRewardsCardBottomSheetFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoHomeRewardsCardBottomSheetEvent) {
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
                Event<CryptoHomeRewardsCardBottomSheetEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoHomeRewardsCardBottomSheetEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoHomeRewardsCardBottomSheet$lambda$1 = CryptoHomeRewardsCardBottomSheet$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoHomeRewardsCardBottomSheet$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoHomeRewardsCardBottomSheet$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13054invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13054invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, ((CryptoHomeRewardsCardBottomSheetEvent.Error) eventCryptoHomeRewardsCardBottomSheet$lambda$1.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$0 = CryptoHomeRewardsCardBottomSheet$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                    if (!(cryptoHomeRewardsCardBottomSheetViewStateCryptoHomeRewardsCardBottomSheet$lambda$0 instanceof CryptoHomeRewardsCardBottomSheetViewState.Loaded)) {
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoHomeRewardsCardBottomSheetDuxo4 = cryptoHomeRewardsCardBottomSheetDuxo3;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoHomeRewardsCardBottomSheetDuxo4 = cryptoHomeRewardsCardBottomSheetDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeRewardsCardBottomSheetFragment6.CryptoHomeRewardsCardBottomSheet$lambda$4(activityErrorHandler, onGotIt, modifier4, cryptoHomeRewardsCardBottomSheetDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i5 = i4;
                    cryptoHomeRewardsCardBottomSheetDuxo3 = cryptoHomeRewardsCardBottomSheetDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeRewardsCardBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final Flow eventFlow22 = cryptoHomeRewardsCardBottomSheetDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoHomeRewardsCardBottomSheetFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$CryptoHomeRewardsCardBottomSheet$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoHomeRewardsCardBottomSheetEvent) {
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
                Event<CryptoHomeRewardsCardBottomSheetEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoHomeRewardsCardBottomSheetEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoHomeRewardsCardBottomSheet$lambda$1 = CryptoHomeRewardsCardBottomSheet$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoHomeRewardsCardBottomSheet$lambda$1 != null) {
                }
                Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, 3, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default22);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
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

    private static final CryptoHomeRewardsCardBottomSheetViewState CryptoHomeRewardsCardBottomSheet$lambda$0(SnapshotState4<? extends CryptoHomeRewardsCardBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoHomeRewardsCardBottomSheetEvent> CryptoHomeRewardsCardBottomSheet$lambda$1(SnapshotState4<Event<CryptoHomeRewardsCardBottomSheetEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingState(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-417031382);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-417031382, i, -1, "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.LoadingState (CryptoHomeRewardsCardBottomSheetFragment.kt:85)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, CryptoHomeRewardsCardBottomSheetFragment2.INSTANCE.m13051getLambda$1989558374$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeRewardsCardBottomSheetFragment6.LoadingState$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingState(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(541718774);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(541718774, i, -1, "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.PreviewLoadingState (CryptoHomeRewardsCardBottomSheetFragment.kt:101)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoHomeRewardsCardBottomSheetFragment2.INSTANCE.m13052getLambda$599436114$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeRewardsCardBottomSheetFragment6.PreviewLoadingState$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(final CryptoHomeRewardsCardBottomSheetViewState.Loaded loaded, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        CryptoHomeRewardsCardBottomSheetViewState.Loaded loaded2;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1172544818);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else if ((i & 6) == 0) {
            loaded2 = loaded;
            i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
        } else {
            loaded2 = loaded;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1172544818, i3, -1, "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.Loaded (CryptoHomeRewardsCardBottomSheetFragment.kt:112)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(loaded2.getTitle(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoMarkdownText2.BentoMarkdownText(loaded.getBody().getRaw(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, 0, 30);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoButtonBar2.BentoButtonBar(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, false, null, null, function0, loaded.getCta(), false, null, false, null, null, false, null, false, composerStartRestartGroup, ((i3 << 15) & 3670016) | 6, 0, 65342);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetFragmentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoHomeRewardsCardBottomSheetFragment6.Loaded$lambda$8(loaded, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21620defaultFillMaxWidthPaddingVpY3zN42);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(loaded2.getTitle(), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoMarkdownText2.BentoMarkdownText(loaded.getBody().getRaw(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, 0, 30);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoButtonBar2.BentoButtonBar(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), null, null, false, null, null, function0, loaded.getCta(), false, null, false, null, null, false, null, false, composerStartRestartGroup, ((i3 << 15) & 3670016) | 6, 0, 65342);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
