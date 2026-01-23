package com.robinhood.android.event.gamedetail.p130ui;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.ViewCompat;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.event.gamedetail.GameDetailDuxo;
import com.robinhood.android.event.gamedetail.GameDetailEvent;
import com.robinhood.android.event.gamedetail.GameDetailFragment;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks2;
import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks2;
import com.robinhood.android.event.gamedetail.components.GameDetailTradeBar4;
import com.robinhood.android.event.gamedetail.components.GameDetailTradeBarState;
import com.robinhood.android.event.gamedetail.p130ui.GameDetailScreen;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: GameDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"GameDetailScreen", "", "callbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "orderSubmittedEvent", "Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;", "(Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/event/gamedetail/GameDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug", "viewState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/gamedetail/GameDetailEvent;", "isScrolled", "", "showDisplayDataSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailScreen$lambda$11(GameDetailScreenCallbacks gameDetailScreenCallbacks, GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent, Function0 function0, Modifier modifier, GameDetailDuxo gameDetailDuxo, int i, int i2, Composer composer, int i3) {
        GameDetailScreen(gameDetailScreenCallbacks, orderSubmittedEvent, function0, modifier, gameDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailScreen(final GameDetailScreenCallbacks callbacks, final GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent, final Function0<Unit> onBack, Modifier modifier, GameDetailDuxo gameDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent2;
        Modifier modifier2;
        GameDetailDuxo gameDetailDuxo2;
        Modifier modifier3;
        int i4;
        GameDetailDuxo gameDetailDuxo3;
        final View view;
        final Event<GameDetailEvent> eventGameDetailScreen$lambda$1;
        final Event<GameDetailEvent> eventGameDetailScreen$lambda$12;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer2;
        final GameDetailDuxo gameDetailDuxo4;
        final Modifier modifier4;
        EventConsumer<GameDetailEvent> eventConsumerInvoke;
        EventConsumer<GameDetailEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-76196249);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            orderSubmittedEvent2 = orderSubmittedEvent;
        } else {
            orderSubmittedEvent2 = orderSubmittedEvent;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(orderSubmittedEvent2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    gameDetailDuxo2 = gameDetailDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(gameDetailDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    gameDetailDuxo2 = gameDetailDuxo;
                }
                i3 |= i6;
            } else {
                gameDetailDuxo2 = gameDetailDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GameDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$$inlined$duxo$1.1
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
                        GameDetailDuxo gameDetailDuxo5 = (GameDetailDuxo) baseDuxo;
                        i4 = i3 & (-57345);
                        gameDetailDuxo3 = gameDetailDuxo5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-76196249, i4, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailScreen (GameDetailScreen.kt:41)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(gameDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(gameDetailDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        eventGameDetailScreen$lambda$1 = GameDetailScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventGameDetailScreen$lambda$1 != null && (eventGameDetailScreen$lambda$1.getData() instanceof GameDetailEvent.HapticFeedback) && (eventConsumerInvoke2 = eventGameDetailScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventGameDetailScreen$lambda$1, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m14240invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14240invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ViewCompat.performHapticFeedback(view, ((GameDetailEvent.HapticFeedback) eventGameDetailScreen$lambda$1.getData()).getConstant());
                                }
                            });
                        }
                        eventGameDetailScreen$lambda$12 = GameDetailScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventGameDetailScreen$lambda$12 != null && (eventGameDetailScreen$lambda$12.getData() instanceof GameDetailEvent.PollBottomSheet) && (eventConsumerInvoke = eventGameDetailScreen$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventGameDetailScreen$lambda$12, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m14241invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m14241invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    callbacks.onPollBottomSheet(((GameDetailEvent.PollBottomSheet) eventGameDetailScreen$lambda$12.getData()).getEventId());
                                }
                            });
                        }
                        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(GameDetailScreen.GameDetailScreen$lambda$5$lambda$4(topBarScrollStateRememberTopBarScrollState));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GameDetailScreen.GameDetailScreen$lambda$8$lambda$7();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                        GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent3 = orderSubmittedEvent2;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier5 = modifier3;
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GAME_DETAIL_PAGE, null, null, null, 14, null), null, GameDetailScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-890220708, true, new C163623(callbacks, gameDetailDuxo3, topBarScrollStateRememberTopBarScrollState, lazyListStateRememberLazyListState, orderSubmittedEvent3, snapshotState, onBack, modifier5, snapshotState4CollectAsStateWithLifecycle, snapshotState4CollectAsStateWithLifecycle2, snapshotState4), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        gameDetailDuxo4 = gameDetailDuxo3;
                        modifier4 = modifier5;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                gameDetailDuxo3 = gameDetailDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(gameDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(gameDetailDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                eventGameDetailScreen$lambda$1 = GameDetailScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventGameDetailScreen$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventGameDetailScreen$lambda$1, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14240invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14240invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ViewCompat.performHapticFeedback(view, ((GameDetailEvent.HapticFeedback) eventGameDetailScreen$lambda$1.getData()).getConstant());
                        }
                    });
                }
                eventGameDetailScreen$lambda$12 = GameDetailScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventGameDetailScreen$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventGameDetailScreen$lambda$12, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14241invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14241invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            callbacks.onPollBottomSheet(((GameDetailEvent.PollBottomSheet) eventGameDetailScreen$lambda$12.getData()).getEventId());
                        }
                    });
                }
                LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent32 = orderSubmittedEvent2;
                composer2 = composerStartRestartGroup;
                Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GAME_DETAIL_PAGE, null, null, null, 14, null), null, GameDetailScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-890220708, true, new C163623(callbacks, gameDetailDuxo3, topBarScrollStateRememberTopBarScrollState2, lazyListStateRememberLazyListState2, orderSubmittedEvent32, snapshotState2, onBack, modifier52, snapshotState4CollectAsStateWithLifecycle3, snapshotState4CollectAsStateWithLifecycle22, snapshotState42), composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                gameDetailDuxo4 = gameDetailDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                gameDetailDuxo4 = gameDetailDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailScreen.GameDetailScreen$lambda$11(callbacks, orderSubmittedEvent, onBack, modifier4, gameDetailDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GameDetailScreen$lambda$5$lambda$4(TopBarScrollState topBarScrollState) {
        return topBarScrollState.getValue() > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GameDetailScreen$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState GameDetailScreen$lambda$8$lambda$7() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* compiled from: GameDetailScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3 */
    static final class C163623 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ GameDetailScreenCallbacks $callbacks;
        final /* synthetic */ GameDetailDuxo $duxo;
        final /* synthetic */ SnapshotState4<Event<GameDetailEvent>> $event$delegate;
        final /* synthetic */ SnapshotState4<Boolean> $isScrolled$delegate;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onBack;
        final /* synthetic */ GameDetailFragment.OrderSubmittedEvent $orderSubmittedEvent;
        final /* synthetic */ SnapshotState<Boolean> $showDisplayDataSheet$delegate;
        final /* synthetic */ TopBarScrollState $topBarScrollState;
        final /* synthetic */ SnapshotState4<GameDetailViewState> $viewState$delegate;

        C163623(GameDetailScreenCallbacks gameDetailScreenCallbacks, GameDetailDuxo gameDetailDuxo, TopBarScrollState topBarScrollState, LazyListState lazyListState, GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent, SnapshotState<Boolean> snapshotState, Function0<Unit> function0, Modifier modifier, SnapshotState4<GameDetailViewState> snapshotState4, SnapshotState4<Event<GameDetailEvent>> snapshotState42, SnapshotState4<Boolean> snapshotState43) {
            this.$callbacks = gameDetailScreenCallbacks;
            this.$duxo = gameDetailDuxo;
            this.$topBarScrollState = topBarScrollState;
            this.$listState = lazyListState;
            this.$orderSubmittedEvent = orderSubmittedEvent;
            this.$showDisplayDataSheet$delegate = snapshotState;
            this.$onBack = function0;
            this.$modifier = modifier;
            this.$viewState$delegate = snapshotState4;
            this.$event$delegate = snapshotState42;
            this.$isScrolled$delegate = snapshotState43;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
            GameDetailScreen.GameDetailScreen$lambda$10(snapshotState, z);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-890220708, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailScreen.<anonymous> (GameDetailScreen.kt:70)");
            }
            if (GameDetailScreen.GameDetailScreen$lambda$0(this.$viewState$delegate).isCombosEnabled()) {
                composer.startReplaceGroup(858006370);
                GameDetailViewState gameDetailViewStateGameDetailScreen$lambda$0 = GameDetailScreen.GameDetailScreen$lambda$0(this.$viewState$delegate);
                Event eventGameDetailScreen$lambda$1 = GameDetailScreen.GameDetailScreen$lambda$1(this.$event$delegate);
                boolean zGameDetailScreen$lambda$6 = GameDetailScreen.GameDetailScreen$lambda$6(this.$isScrolled$delegate);
                boolean zGameDetailScreen$lambda$9 = GameDetailScreen.GameDetailScreen$lambda$9(this.$showDisplayDataSheet$delegate);
                GameDetailScreenCallbacks gameDetailScreenCallbacks = this.$callbacks;
                GameDetailDuxo gameDetailDuxo = this.$duxo;
                GdpV2ComboUiCallbacks gdpV2ComboUiCallbacksCompositeGdpV2ComboUiCallbacks = GdpV2ComboUiCallbacks2.compositeGdpV2ComboUiCallbacks(gameDetailScreenCallbacks, gameDetailDuxo, gameDetailDuxo, gameDetailDuxo, composer, 0);
                TopBarScrollState topBarScrollState = this.$topBarScrollState;
                LazyListState lazyListState = this.$listState;
                GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent = this.$orderSubmittedEvent;
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$showDisplayDataSheet$delegate);
                final SnapshotState<Boolean> snapshotState = this.$showDisplayDataSheet$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailScreen.C163623.invoke$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                GameDetailComboScreen2.GameDetailComboScreen(gameDetailViewStateGameDetailScreen$lambda$0, eventGameDetailScreen$lambda$1, topBarScrollState, lazyListState, zGameDetailScreen$lambda$6, zGameDetailScreen$lambda$9, gdpV2ComboUiCallbacksCompositeGdpV2ComboUiCallbacks, orderSubmittedEvent, (Function1) objRememberedValue, this.$onBack, this.$modifier, composer, TopBarScrollState.$stable << 6, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(858854592);
                GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent2 = this.$orderSubmittedEvent;
                if (orderSubmittedEvent2 != null && orderSubmittedEvent2.consume()) {
                    this.$duxo.onOrderSubmitted();
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
                final GameDetailDuxo gameDetailDuxo2 = this.$duxo;
                GameDetailScreenCallbacks gameDetailScreenCallbacks2 = this.$callbacks;
                TopBarScrollState topBarScrollState2 = this.$topBarScrollState;
                LazyListState lazyListState2 = this.$listState;
                Function0<Unit> function0 = this.$onBack;
                final SnapshotState<Boolean> snapshotState2 = this.$showDisplayDataSheet$delegate;
                SnapshotState4<GameDetailViewState> snapshotState4 = this.$viewState$delegate;
                SnapshotState4<Boolean> snapshotState42 = this.$isScrolled$delegate;
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Modifier modifierClipToBounds = Clip.clipToBounds(Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierClipToBounds);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                GameDetailViewState gameDetailViewStateGameDetailScreen$lambda$02 = GameDetailScreen.GameDetailScreen$lambda$0(snapshotState4);
                boolean zGameDetailScreen$lambda$62 = GameDetailScreen.GameDetailScreen$lambda$6(snapshotState42);
                boolean zGameDetailScreen$lambda$92 = GameDetailScreen.GameDetailScreen$lambda$9(snapshotState2);
                GdpV1UiCallbacks gdpV1UiCallbacksCompositeGdpV1UiCallbacks = GdpV1UiCallbacks2.compositeGdpV1UiCallbacks(gameDetailScreenCallbacks2, gameDetailDuxo2, gameDetailDuxo2, gameDetailDuxo2, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(snapshotState2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailScreen.C163623.invoke$lambda$13$lambda$4$lambda$3$lambda$2(snapshotState2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                GameDetailNoComboScreenKt.GameDetailNoComboScreen(gameDetailViewStateGameDetailScreen$lambda$02, topBarScrollState2, lazyListState2, zGameDetailScreen$lambda$62, zGameDetailScreen$lambda$92, gdpV1UiCallbacksCompositeGdpV1UiCallbacks, function0, (Function1) objRememberedValue2, null, composer, TopBarScrollState.$stable << 3, 256);
                composer.endNode();
                GameDetailTradeBarState tradeBarState = GameDetailScreen.GameDetailScreen$lambda$0(snapshotState4).getTradeBarState();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(gameDetailDuxo2);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailScreen.C163623.invoke$lambda$13$lambda$6$lambda$5(gameDetailDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function02 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(gameDetailScreenCallbacks2);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new GameDetailScreen2(gameDetailScreenCallbacks2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue4);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(gameDetailDuxo2);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GameDetailScreen.C163623.invoke$lambda$13$lambda$9$lambda$8(gameDetailDuxo2, (UUID) obj, (ContractSide) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function2 function2 = (Function2) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(gameDetailScreenCallbacks2);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new GameDetailScreen3(gameDetailScreenCallbacks2);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                Function2 function22 = (Function2) ((KFunction) objRememberedValue6);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer.changedInstance(gameDetailScreenCallbacks2);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new GameDetailScreen4(gameDetailScreenCallbacks2);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                Function1 function12 = (Function1) ((KFunction) objRememberedValue7);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composer.changedInstance(gameDetailDuxo2);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new GameDetailScreen5(gameDetailDuxo2);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                GameDetailTradeBar4.GameDetailTradeBar(tradeBarState, function02, function1, function2, function22, function12, (Function0) ((KFunction) objRememberedValue8), null, composer, 0, 128);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
            GameDetailScreen.GameDetailScreen$lambda$10(snapshotState, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$6$lambda$5(GameDetailDuxo gameDetailDuxo) {
            gameDetailDuxo.onWheelPickerItemSelected(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$9$lambda$8(GameDetailDuxo gameDetailDuxo, UUID uuid, ContractSide contractSide) {
            Intrinsics.checkNotNullParameter(uuid, "<unused var>");
            Intrinsics.checkNotNullParameter(contractSide, "<unused var>");
            gameDetailDuxo.onConfirmAlternativeStrike();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailViewState GameDetailScreen$lambda$0(SnapshotState4<GameDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<GameDetailEvent> GameDetailScreen$lambda$1(SnapshotState4<Event<GameDetailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GameDetailScreen$lambda$6(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GameDetailScreen$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
