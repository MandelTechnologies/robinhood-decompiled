package com.robinhood.shared.trade.crypto.p397ui.price;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarDefaults;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpad;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceComposableKt;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceEvent;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoOrderPriceComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000626\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u008e\u0002"}, m3636d2 = {"CryptoOrderPriceComposable", "", "onLimitOrderPriceSelected", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "onOrderTypeInfoClicked", "Lkotlin/Function2;", "Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/models/db/OrderSide;", "onStopLimitOrderLimitPriceSelected", "Lkotlin/ParameterName;", "name", "stopPrice", "limitPrice", "onStopLimitOrderStopPriceSelected", "onStopLossOrderPriceSelected", "onShowDialogFragment", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;Landroidx/compose/runtime/Composer;II)V", "Content", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceViewState;", "onCurrentPriceInfoClicked", "Lkotlin/Function0;", "(Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "dialogContent", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogData;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderPriceComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$14(CryptoOrderPriceViewState cryptoOrderPriceViewState, Function0 function0, int i, Composer composer, int i2) {
        Content(cryptoOrderPriceViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderPriceComposable$lambda$6(Function1 function1, Function2 function2, Function2 function22, Function1 function12, Function1 function13, Function1 function14, Modifier modifier, CryptoOrderPriceDuxo cryptoOrderPriceDuxo, int i, int i2, Composer composer, int i3) {
        CryptoOrderPriceComposable(function1, function2, function22, function12, function13, function14, modifier, cryptoOrderPriceDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderPriceComposable(final Function1<? super BigDecimal, Unit> onLimitOrderPriceSelected, final Function2<? super Order.Configuration, ? super OrderSide, Unit> onOrderTypeInfoClicked, final Function2<? super BigDecimal, ? super BigDecimal, Unit> onStopLimitOrderLimitPriceSelected, final Function1<? super BigDecimal, Unit> onStopLimitOrderStopPriceSelected, final Function1<? super BigDecimal, Unit> onStopLossOrderPriceSelected, final Function1<? super DialogFragmentKey, Unit> onShowDialogFragment, Modifier modifier, CryptoOrderPriceDuxo cryptoOrderPriceDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoOrderPriceDuxo cryptoOrderPriceDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        CryptoOrderPriceDuxo cryptoOrderPriceDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<CryptoOrderPriceEvent> event;
        Object objRememberedValue;
        SnapshotState snapshotState;
        final Event<CryptoOrderPriceEvent> eventCryptoOrderPriceComposable$lambda$1;
        Modifier modifier4;
        final SnapshotState snapshotState2;
        final CryptoOrderPriceDuxo cryptoOrderPriceDuxo4;
        final SnapshotState4 snapshotState4;
        Composer composer2;
        final Modifier modifier5;
        final CryptoOrderPriceDuxo cryptoOrderPriceDuxo5;
        EventConsumer<CryptoOrderPriceEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onLimitOrderPriceSelected, "onLimitOrderPriceSelected");
        Intrinsics.checkNotNullParameter(onOrderTypeInfoClicked, "onOrderTypeInfoClicked");
        Intrinsics.checkNotNullParameter(onStopLimitOrderLimitPriceSelected, "onStopLimitOrderLimitPriceSelected");
        Intrinsics.checkNotNullParameter(onStopLimitOrderStopPriceSelected, "onStopLimitOrderStopPriceSelected");
        Intrinsics.checkNotNullParameter(onStopLossOrderPriceSelected, "onStopLossOrderPriceSelected");
        Intrinsics.checkNotNullParameter(onShowDialogFragment, "onShowDialogFragment");
        Composer composerStartRestartGroup = composer.startRestartGroup(-250829869);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onLimitOrderPriceSelected) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderTypeInfoClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStopLimitOrderLimitPriceSelected) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStopLimitOrderStopPriceSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStopLossOrderPriceSelected) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowDialogFragment) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    cryptoOrderPriceDuxo2 = cryptoOrderPriceDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(cryptoOrderPriceDuxo2) ? 8388608 : 4194304;
                    i3 |= i5;
                } else {
                    cryptoOrderPriceDuxo2 = cryptoOrderPriceDuxo;
                }
                i3 |= i5;
            } else {
                cryptoOrderPriceDuxo2 = cryptoOrderPriceDuxo;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 128) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoOrderPriceDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        cryptoOrderPriceDuxo3 = (CryptoOrderPriceDuxo) baseDuxo;
                        i3 &= -29360129;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-250829869, i3, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable (CryptoOrderPriceComposable.kt:68)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderPriceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<CryptoOrderPriceEvent>> eventFlow = cryptoOrderPriceDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    Composer composer3 = composerStartRestartGroup;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoOrderPriceComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoOrderPriceEvent) {
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
                    Event<CryptoOrderPriceEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoOrderPriceEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer3, 0, 0);
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer3.endReplaceGroup();
                    OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composer3, BackHandler5.$stable);
                    final OnBackPressedDispatcher onBackPressedDispatcher = current2 != null ? current2.getOnBackPressedDispatcher() : null;
                    eventCryptoOrderPriceComposable$lambda$1 = CryptoOrderPriceComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCryptoOrderPriceComposable$lambda$1 == null || !(eventCryptoOrderPriceComposable$lambda$1.getData() instanceof CryptoOrderPriceEvent) || (eventConsumerInvoke = eventCryptoOrderPriceComposable$lambda$1.getGetEventConsumer().invoke()) == null) {
                        modifier4 = modifier3;
                        snapshotState2 = snapshotState;
                        cryptoOrderPriceDuxo4 = cryptoOrderPriceDuxo3;
                        snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    } else {
                        cryptoOrderPriceDuxo4 = cryptoOrderPriceDuxo3;
                        snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        modifier4 = modifier3;
                        snapshotState2 = snapshotState;
                        eventConsumerInvoke.consume(eventCryptoOrderPriceComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25934invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25934invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoOrderPriceEvent cryptoOrderPriceEvent = (CryptoOrderPriceEvent) eventCryptoOrderPriceComposable$lambda$1.getData();
                                if (cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.LimitOrderPriceSelectedEvent) {
                                    onLimitOrderPriceSelected.invoke(((CryptoOrderPriceEvent.LimitOrderPriceSelectedEvent) cryptoOrderPriceEvent).getLimitPrice());
                                    return;
                                }
                                if (cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.ShowOrderEducationEvent) {
                                    CryptoOrderPriceEvent.ShowOrderEducationEvent showOrderEducationEvent = (CryptoOrderPriceEvent.ShowOrderEducationEvent) cryptoOrderPriceEvent;
                                    onOrderTypeInfoClicked.invoke(showOrderEducationEvent.getConfiguration(), showOrderEducationEvent.getSide());
                                    return;
                                }
                                if (cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.StopLimitOrderLimitPriceSelectedEvent) {
                                    CryptoOrderPriceEvent.StopLimitOrderLimitPriceSelectedEvent stopLimitOrderLimitPriceSelectedEvent = (CryptoOrderPriceEvent.StopLimitOrderLimitPriceSelectedEvent) cryptoOrderPriceEvent;
                                    onStopLimitOrderLimitPriceSelected.invoke(stopLimitOrderLimitPriceSelectedEvent.getStopPrice(), stopLimitOrderLimitPriceSelectedEvent.getLimitPrice());
                                    return;
                                }
                                if (cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.StopLimitOrderStopPriceSelectedEvent) {
                                    onStopLimitOrderStopPriceSelected.invoke(((CryptoOrderPriceEvent.StopLimitOrderStopPriceSelectedEvent) cryptoOrderPriceEvent).getStopPrice());
                                    return;
                                }
                                if (cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.StopLossOrderPriceSelectedEvent) {
                                    onStopLossOrderPriceSelected.invoke(((CryptoOrderPriceEvent.StopLossOrderPriceSelectedEvent) cryptoOrderPriceEvent).getStopPrice());
                                } else if (cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.ShowDialogFragment) {
                                    onShowDialogFragment.invoke(((CryptoOrderPriceEvent.ShowDialogFragment) cryptoOrderPriceEvent).getDialogFragmentKey());
                                } else {
                                    if (!(cryptoOrderPriceEvent instanceof CryptoOrderPriceEvent.DialogEvent)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    snapshotState2.setValue(((CryptoOrderPriceEvent.DialogEvent) cryptoOrderPriceEvent).getDialogData());
                                }
                            }
                        });
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1270795881, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1270795881, i6, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous> (CryptoOrderPriceComposable.kt:105)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> lambda$1208242244$feature_trade_crypto_externalDebug = ComposableSingletons$CryptoOrderPriceComposableKt.INSTANCE.getLambda$1208242244$feature_trade_crypto_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(2057142936, true, new AnonymousClass1(onBackPressedDispatcher), composer4, 54);
                            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo6 = cryptoOrderPriceDuxo4;
                            final SnapshotState4<CryptoOrderPriceViewState> snapshotState42 = snapshotState4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1208242244$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(1020398521, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.2.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                                    invoke(row5, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer5, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1020398521, i7, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:119)");
                                    }
                                    if (CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState42).getShouldShowMenu()) {
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        CryptoOrderPriceDuxo cryptoOrderPriceDuxo7 = cryptoOrderPriceDuxo6;
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer5.changedInstance(cryptoOrderPriceDuxo7);
                                        Object objRememberedValue3 = composer5.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$2$1$1(cryptoOrderPriceDuxo7);
                                            composer5.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer5.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(Modifier.INSTANCE, TestTags.CRYPTO_ORDER_INFO), 0.0f, composer5, 6, 1), (Function0) ((KFunction) objRememberedValue3), false, composer5, BentoIcon4.Size24.$stable | 48, 32);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), null, false, false, null, null, 0L, null, composer4, 3510, 0, 2032);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoOrderPriceComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $backHandler;

                            AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$backHandler = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2057142936, i, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:109)");
                                }
                                NavigationType navigationType = NavigationType.PRESENT;
                                long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, BentoAppBarDefaults.NavIconTestTag);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$backHandler);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$backHandler;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoOrderPriceComposableKt.C405092.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                NavIconButton.m21673NavIconButtonww6aTOc(navigationType, (Function0) objRememberedValue, modifierTestTag, jM21456getPositive0d7_KjU, composer, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-789907166, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues scaffoldPadding, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(scaffoldPadding, "scaffoldPadding");
                            if ((i6 & 6) == 0) {
                                i6 |= composer4.changed(scaffoldPadding) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-789907166, i6, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous> (CryptoOrderPriceComposable.kt:135)");
                            }
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, scaffoldPadding);
                            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo6 = cryptoOrderPriceDuxo4;
                            final SnapshotState4<CryptoOrderPriceViewState> snapshotState42 = snapshotState4;
                            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-403011451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i7) {
                                    if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-403011451, i7, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:137)");
                                    }
                                    CryptoOrderPriceViewState cryptoOrderPriceViewStateCryptoOrderPriceComposable$lambda$0 = CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState42);
                                    CryptoOrderPriceDuxo cryptoOrderPriceDuxo7 = cryptoOrderPriceDuxo6;
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer5.changedInstance(cryptoOrderPriceDuxo7);
                                    Object objRememberedValue3 = composer5.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$1$1$1(cryptoOrderPriceDuxo7);
                                        composer5.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer5.endReplaceGroup();
                                    CryptoOrderPriceComposableKt.Content(cryptoOrderPriceViewStateCryptoOrderPriceComposable$lambda$0, (Function0) ((KFunction) objRememberedValue3), composer5, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54);
                            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo7 = cryptoOrderPriceDuxo4;
                            final SnapshotState4<CryptoOrderPriceViewState> snapshotState43 = snapshotState4;
                            BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda3, ComposableLambda3.rememberComposableLambda(206815093, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.3.2
                                public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer5, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                    if ((i7 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(206815093, i7, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:140)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).getWidgetBg(), null, 2, null);
                                    CryptoOrderPriceDuxo cryptoOrderPriceDuxo8 = cryptoOrderPriceDuxo7;
                                    SnapshotState4<CryptoOrderPriceViewState> snapshotState44 = snapshotState43;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0);
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer5.changedInstance(cryptoOrderPriceDuxo8);
                                    Object objRememberedValue3 = composer5.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new C40511x44e4ae5f(cryptoOrderPriceDuxo8);
                                        composer5.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer5.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), strStringResource, ModifiersKt.autoLogEvents$default(TestTag3.testTag(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer5, 6, 1), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), 0.0f, 1, null), TestTags.CRYPTO_ORDER_PRICE_CONTINUE_BUTTON), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "CONTINUE", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, null, CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState44).getCtaEnabled(), false, null, null, null, null, false, null, composer5, 0, 0, 8152);
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer5.changedInstance(cryptoOrderPriceDuxo8);
                                    Object objRememberedValue4 = composer5.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new C40512x44e4b220(cryptoOrderPriceDuxo8);
                                        composer5.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer5.endReplaceGroup();
                                    CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState44).getNumpadState(), (Function1) ((KFunction) objRememberedValue4), null, null, composer5, CryptoOrderAnimatedBentoNumpadState.$stable, 12);
                                    composer5.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer5, Integer num) {
                                    invoke(bentoNumpad4, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer4, 54), composer4, 432, 0);
                            CryptoOrderPriceEvent.DialogData dialogDataCryptoOrderPriceComposable$lambda$3 = CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$3(snapshotState2);
                            if (dialogDataCryptoOrderPriceComposable$lambda$3 != null) {
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(805722122, true, new CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1(dialogDataCryptoOrderPriceComposable$lambda$3, cryptoOrderPriceDuxo4, snapshotState2), composer4, 54), composer4, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    composer2 = composer3;
                    Modifier modifier6 = modifier4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, composableLambdaRememberComposableLambda2, composer2, 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier6;
                    cryptoOrderPriceDuxo5 = cryptoOrderPriceDuxo4;
                }
                cryptoOrderPriceDuxo3 = cryptoOrderPriceDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderPriceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoOrderPriceDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                Composer composer32 = composerStartRestartGroup;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoOrderPriceComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoOrderPriceEvent) {
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
                Event<CryptoOrderPriceEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoOrderPriceEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer32, 0, 0);
                composer32.endReplaceGroup();
                composer32.startReplaceGroup(1849434622);
                objRememberedValue = composer32.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer32.endReplaceGroup();
                OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composer32, BackHandler5.$stable);
                if (current22 != null) {
                }
                eventCryptoOrderPriceComposable$lambda$1 = CryptoOrderPriceComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderPriceComposable$lambda$1 == null) {
                    modifier4 = modifier3;
                    snapshotState2 = snapshotState;
                    cryptoOrderPriceDuxo4 = cryptoOrderPriceDuxo3;
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1270795881, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1270795881, i6, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous> (CryptoOrderPriceComposable.kt:105)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> lambda$1208242244$feature_trade_crypto_externalDebug = ComposableSingletons$CryptoOrderPriceComposableKt.INSTANCE.getLambda$1208242244$feature_trade_crypto_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(2057142936, true, new AnonymousClass1(onBackPressedDispatcher), composer4, 54);
                            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo6 = cryptoOrderPriceDuxo4;
                            final SnapshotState4<CryptoOrderPriceViewState> snapshotState42 = snapshotState4;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1208242244$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, composableLambdaRememberComposableLambda22, ComposableLambda3.rememberComposableLambda(1020398521, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.2.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                                    invoke(row5, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer5, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1020398521, i7, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:119)");
                                    }
                                    if (CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState42).getShouldShowMenu()) {
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        CryptoOrderPriceDuxo cryptoOrderPriceDuxo7 = cryptoOrderPriceDuxo6;
                                        composer5.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer5.changedInstance(cryptoOrderPriceDuxo7);
                                        Object objRememberedValue3 = composer5.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$2$1$1(cryptoOrderPriceDuxo7);
                                            composer5.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer5.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(Modifier.INSTANCE, TestTags.CRYPTO_ORDER_INFO), 0.0f, composer5, 6, 1), (Function0) ((KFunction) objRememberedValue3), false, composer5, BentoIcon4.Size24.$stable | 48, 32);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), null, false, false, null, null, 0L, null, composer4, 3510, 0, 2032);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoOrderPriceComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $backHandler;

                            AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$backHandler = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2057142936, i, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:109)");
                                }
                                NavigationType navigationType = NavigationType.PRESENT;
                                long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, BentoAppBarDefaults.NavIconTestTag);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$backHandler);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$backHandler;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoOrderPriceComposableKt.C405092.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                NavIconButton.m21673NavIconButtonww6aTOc(navigationType, (Function0) objRememberedValue, modifierTestTag, jM21456getPositive0d7_KjU, composer, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer32, 54);
                    ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-789907166, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues scaffoldPadding, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(scaffoldPadding, "scaffoldPadding");
                            if ((i6 & 6) == 0) {
                                i6 |= composer4.changed(scaffoldPadding) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-789907166, i6, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous> (CryptoOrderPriceComposable.kt:135)");
                            }
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, scaffoldPadding);
                            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo6 = cryptoOrderPriceDuxo4;
                            final SnapshotState4<CryptoOrderPriceViewState> snapshotState42 = snapshotState4;
                            ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(-403011451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i7) {
                                    if ((i7 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-403011451, i7, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:137)");
                                    }
                                    CryptoOrderPriceViewState cryptoOrderPriceViewStateCryptoOrderPriceComposable$lambda$0 = CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState42);
                                    CryptoOrderPriceDuxo cryptoOrderPriceDuxo7 = cryptoOrderPriceDuxo6;
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer5.changedInstance(cryptoOrderPriceDuxo7);
                                    Object objRememberedValue3 = composer5.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$1$1$1(cryptoOrderPriceDuxo7);
                                        composer5.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer5.endReplaceGroup();
                                    CryptoOrderPriceComposableKt.Content(cryptoOrderPriceViewStateCryptoOrderPriceComposable$lambda$0, (Function0) ((KFunction) objRememberedValue3), composer5, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54);
                            final CryptoOrderPriceDuxo cryptoOrderPriceDuxo7 = cryptoOrderPriceDuxo4;
                            final SnapshotState4<CryptoOrderPriceViewState> snapshotState43 = snapshotState4;
                            BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda32, ComposableLambda3.rememberComposableLambda(206815093, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt.CryptoOrderPriceComposable.3.2
                                public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer5, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                    if ((i7 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(206815093, i7, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposable.<anonymous>.<anonymous> (CryptoOrderPriceComposable.kt:140)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).getWidgetBg(), null, 2, null);
                                    CryptoOrderPriceDuxo cryptoOrderPriceDuxo8 = cryptoOrderPriceDuxo7;
                                    SnapshotState4<CryptoOrderPriceViewState> snapshotState44 = snapshotState43;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0);
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer5.changedInstance(cryptoOrderPriceDuxo8);
                                    Object objRememberedValue3 = composer5.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new C40511x44e4ae5f(cryptoOrderPriceDuxo8);
                                        composer5.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer5.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), strStringResource, ModifiersKt.autoLogEvents$default(TestTag3.testTag(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer5, 6, 1), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), 0.0f, 1, null), TestTags.CRYPTO_ORDER_PRICE_CONTINUE_BUTTON), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer5.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "CONTINUE", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, null, CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState44).getCtaEnabled(), false, null, null, null, null, false, null, composer5, 0, 0, 8152);
                                    composer5.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer5.changedInstance(cryptoOrderPriceDuxo8);
                                    Object objRememberedValue4 = composer5.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new C40512x44e4b220(cryptoOrderPriceDuxo8);
                                        composer5.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer5.endReplaceGroup();
                                    CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$0(snapshotState44).getNumpadState(), (Function1) ((KFunction) objRememberedValue4), null, null, composer5, CryptoOrderAnimatedBentoNumpadState.$stable, 12);
                                    composer5.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer5, Integer num) {
                                    invoke(bentoNumpad4, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer4, 54), composer4, 432, 0);
                            CryptoOrderPriceEvent.DialogData dialogDataCryptoOrderPriceComposable$lambda$3 = CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$3(snapshotState2);
                            if (dialogDataCryptoOrderPriceComposable$lambda$3 != null) {
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(805722122, true, new CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$3$3$1(dialogDataCryptoOrderPriceComposable$lambda$3, cryptoOrderPriceDuxo4, snapshotState2), composer4, 54), composer4, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer32, 54);
                    composer2 = composer32;
                    Modifier modifier62 = modifier4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, composableLambdaRememberComposableLambda3, null, null, null, 0, 0L, 0L, null, composableLambdaRememberComposableLambda22, composer2, 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier62;
                    cryptoOrderPriceDuxo5 = cryptoOrderPriceDuxo4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                cryptoOrderPriceDuxo5 = cryptoOrderPriceDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderPriceComposableKt.CryptoOrderPriceComposable$lambda$6(onLimitOrderPriceSelected, onOrderTypeInfoClicked, onStopLimitOrderLimitPriceSelected, onStopLimitOrderStopPriceSelected, onStopLossOrderPriceSelected, onShowDialogFragment, modifier5, cryptoOrderPriceDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((12582912 & i) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i4 == 0) {
                }
                if ((i2 & 128) == 0) {
                    cryptoOrderPriceDuxo3 = cryptoOrderPriceDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderPriceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow22 = cryptoOrderPriceDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                Composer composer322 = composerStartRestartGroup;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoOrderPriceComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof CryptoOrderPriceEvent) {
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
                Event<CryptoOrderPriceEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoOrderPriceEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composer322, 0, 0);
                composer322.endReplaceGroup();
                composer322.startReplaceGroup(1849434622);
                objRememberedValue = composer322.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer322.endReplaceGroup();
                OnBackPressedDispatcherOwner current222 = BackHandler5.INSTANCE.getCurrent(composer322, BackHandler5.$stable);
                if (current222 != null) {
                }
                eventCryptoOrderPriceComposable$lambda$1 = CryptoOrderPriceComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventCryptoOrderPriceComposable$lambda$1 == null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderPriceViewState CryptoOrderPriceComposable$lambda$0(SnapshotState4<CryptoOrderPriceViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoOrderPriceEvent> CryptoOrderPriceComposable$lambda$1(SnapshotState4<Event<CryptoOrderPriceEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderPriceEvent.DialogData CryptoOrderPriceComposable$lambda$3(SnapshotState<CryptoOrderPriceEvent.DialogData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final CryptoOrderPriceViewState cryptoOrderPriceViewState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-707221012);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cryptoOrderPriceViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-707221012, i2, -1, "com.robinhood.shared.trade.crypto.ui.price.Content (CryptoOrderPriceComposable.kt:212)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            StringResource titleText = cryptoOrderPriceViewState.getTitleText();
            int i3 = StringResource.$stable;
            String textAsString = StringResources6.getTextAsString(titleText, composerStartRestartGroup, i3);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int i5 = i2;
            BentoText2.m20747BentoText38GnDrw(textAsString, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup.startReplaceGroup(-1412434554);
            if (cryptoOrderPriceViewState.getDescriptionText() != null) {
                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(cryptoOrderPriceViewState.getDescriptionText(), composerStartRestartGroup, i3), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8190);
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(48)), composerStartRestartGroup, 6);
            CryptoOrderInputRowState cryptoOrderInputRowState = new CryptoOrderInputRowState(new CryptoOrderInputRowState.TextContent(cryptoOrderPriceViewState.getCryptoAmountLabel(), null, null, false, 14, null), null, cryptoOrderPriceViewState.getFormattedHintPrice(), cryptoOrderPriceViewState.getFormattedAmountResource(), null, false, true, 50, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderPriceComposableKt.Content$lambda$13$lambda$8$lambda$7((CryptoOrderInputRowState.TapAction) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderInputRow.CryptoOrderInputRow(cryptoOrderInputRowState, function1, (Function0) objRememberedValue2, AutomationTestTagModifierExt.automationTestTag(companion, AutomationTestTags.AMOUNT_INPUT_ROW), null, null, composerStartRestartGroup, CryptoOrderInputRowState.$stable | 432, 48);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAlign = column6.align(ClickableKt.m4891clickableO2vRcR0$default(companion, (InteractionSource3) objRememberedValue3, null, false, null, null, function0, 28, null), companion2.getEnd());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getEnd(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20748BentoTextQnj7Zds(cryptoOrderPriceViewState.getCurrentPriceAnnotatedString(composerStartRestartGroup, i5 & 14), null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8190);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderPriceComposableKt.Content$lambda$14(cryptoOrderPriceViewState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$13$lambda$8$lambda$7(CryptoOrderInputRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
