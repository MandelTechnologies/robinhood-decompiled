package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeRow;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetDuxo;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetEvent;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetViewState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeAmountInputRowState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoQuickTradeSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a¡\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010 \u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u0084\u0002"}, m3636d2 = {"CryptoQuickTradeSheetComposable", "", "args", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo$Args;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo;", "(Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo$Args;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "Content", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "onCurrencySwitcherClick", "Lkotlin/Function0;", "onTypeSelected", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "onOpenDisclosuresClicked", "onButtonPressed", "Lkotlin/Function2;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "", "onOrderReviewRowTapped", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "(Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoQuickTradeInputSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "testViewState", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeSheetComposable3 {
    private static final CryptoQuickTradeSheetViewState testViewState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$11(CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState, Event event, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function2 function2, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(cryptoQuickTradeSheetViewState, event, function1, function0, function12, function02, function2, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeInputSheetPreview$lambda$12(int i, Composer composer, int i2) {
        CryptoQuickTradeInputSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeSheetComposable$lambda$9(CryptoQuickTradeSheetDuxo.Args args, Modifier modifier, CryptoQuickTradeSheetDuxo cryptoQuickTradeSheetDuxo, int i, int i2, Composer composer, int i3) {
        CryptoQuickTradeSheetComposable(args, modifier, cryptoQuickTradeSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoQuickTradeSheetComposable(final CryptoQuickTradeSheetDuxo.Args args, Modifier modifier, CryptoQuickTradeSheetDuxo cryptoQuickTradeSheetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoQuickTradeSheetDuxo cryptoQuickTradeSheetDuxo2;
        Composer composer2;
        Modifier modifier3;
        int i4;
        CryptoQuickTradeSheetDuxo cryptoQuickTradeSheetDuxo3;
        Composer composer3;
        final Navigator navigator;
        final Context context;
        final Event<CryptoQuickTradeSheetEvent> eventCryptoQuickTradeSheetComposable$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        boolean zChangedInstance4;
        Object objRememberedValue4;
        boolean zChangedInstance5;
        Object objRememberedValue5;
        boolean zChangedInstance6;
        Object objRememberedValue6;
        Composer composer4;
        final CryptoQuickTradeSheetDuxo cryptoQuickTradeSheetDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoQuickTradeSheetEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(1867235726);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
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
                    cryptoQuickTradeSheetDuxo2 = cryptoQuickTradeSheetDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoQuickTradeSheetDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoQuickTradeSheetDuxo2 = cryptoQuickTradeSheetDuxo;
                }
                i3 |= i6;
            } else {
                cryptoQuickTradeSheetDuxo2 = cryptoQuickTradeSheetDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoQuickTradeSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance7 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer2, 0);
                        composer2.endReplaceGroup();
                        modifier3 = modifier5;
                        i4 = i3 & (-897);
                        cryptoQuickTradeSheetDuxo3 = (CryptoQuickTradeSheetDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier5;
                        i4 = i3;
                        cryptoQuickTradeSheetDuxo3 = cryptoQuickTradeSheetDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoQuickTradeSheetDuxo3 = cryptoQuickTradeSheetDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1867235726, i4, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposable (CryptoQuickTradeSheetComposable.kt:47)");
                }
                composer3 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoQuickTradeSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoQuickTradeSheetDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventCryptoQuickTradeSheetComposable$lambda$1 = CryptoQuickTradeSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoQuickTradeSheetComposable$lambda$1 != null && (eventCryptoQuickTradeSheetComposable$lambda$1.getData() instanceof CryptoQuickTradeSheetEvent.NavigateToOrderType) && (eventConsumerInvoke = eventCryptoQuickTradeSheetComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoQuickTradeSheetComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25953invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25953invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, ((CryptoQuickTradeSheetEvent.NavigateToOrderType) eventCryptoQuickTradeSheetComposable$lambda$1.getData()).getKey(), null, false, null, null, 60, null);
                        }
                    });
                }
                CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewStateCryptoQuickTradeSheetComposable$lambda$0 = CryptoQuickTradeSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CryptoQuickTradeSheetComposable4(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(5004770);
                zChangedInstance2 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new CryptoQuickTradeSheetComposable5(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue2;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(5004770);
                zChangedInstance3 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue3 = composer3.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new CryptoQuickTradeSheetComposable6(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                KFunction kFunction3 = (KFunction) objRememberedValue3;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(5004770);
                zChangedInstance4 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue4 = composer3.rememberedValue();
                if (!zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new CryptoQuickTradeSheetComposable7(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                KFunction kFunction4 = (KFunction) objRememberedValue4;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(5004770);
                zChangedInstance5 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue5 = composer3.rememberedValue();
                if (!zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new CryptoQuickTradeSheetComposable8(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue5);
                }
                KFunction kFunction5 = (KFunction) objRememberedValue5;
                composer3.endReplaceGroup();
                Event<CryptoQuickTradeSheetEvent> eventCryptoQuickTradeSheetComposable$lambda$12 = CryptoQuickTradeSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                composer3.startReplaceGroup(5004770);
                zChangedInstance6 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue6 = composer3.rememberedValue();
                if (!zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new CryptoQuickTradeSheetComposable9(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                composer3.endReplaceGroup();
                Content(cryptoQuickTradeSheetViewStateCryptoQuickTradeSheetComposable$lambda$0, eventCryptoQuickTradeSheetComposable$lambda$12, (Function1) kFunction, (Function0) kFunction2, (Function1) kFunction3, (Function0) kFunction4, (Function2) kFunction5, (Function1) ((KFunction) objRememberedValue6), modifier3, composer3, (i4 << 21) & 234881024, 0);
                composer4 = composer3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoQuickTradeSheetDuxo4 = cryptoQuickTradeSheetDuxo3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoQuickTradeSheetDuxo4 = cryptoQuickTradeSheetDuxo2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoQuickTradeSheetComposable3.CryptoQuickTradeSheetComposable$lambda$9(args, modifier4, cryptoQuickTradeSheetDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoQuickTradeSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoQuickTradeSheetDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                eventCryptoQuickTradeSheetComposable$lambda$1 = CryptoQuickTradeSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoQuickTradeSheetComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoQuickTradeSheetComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$CryptoQuickTradeSheetComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25953invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25953invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.startActivity$default(navigator, context, ((CryptoQuickTradeSheetEvent.NavigateToOrderType) eventCryptoQuickTradeSheetComposable$lambda$1.getData()).getKey(), null, false, null, null, 60, null);
                        }
                    });
                }
                CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewStateCryptoQuickTradeSheetComposable$lambda$02 = CryptoQuickTradeSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new CryptoQuickTradeSheetComposable4(cryptoQuickTradeSheetDuxo3);
                    composer3.updateRememberedValue(objRememberedValue);
                    KFunction kFunction6 = (KFunction) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(5004770);
                    zChangedInstance2 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new CryptoQuickTradeSheetComposable5(cryptoQuickTradeSheetDuxo3);
                        composer3.updateRememberedValue(objRememberedValue2);
                        KFunction kFunction22 = (KFunction) objRememberedValue2;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(5004770);
                        zChangedInstance3 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                        objRememberedValue3 = composer3.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue3 = new CryptoQuickTradeSheetComposable6(cryptoQuickTradeSheetDuxo3);
                            composer3.updateRememberedValue(objRememberedValue3);
                            KFunction kFunction32 = (KFunction) objRememberedValue3;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(5004770);
                            zChangedInstance4 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                            objRememberedValue4 = composer3.rememberedValue();
                            if (!zChangedInstance4) {
                                objRememberedValue4 = new CryptoQuickTradeSheetComposable7(cryptoQuickTradeSheetDuxo3);
                                composer3.updateRememberedValue(objRememberedValue4);
                                KFunction kFunction42 = (KFunction) objRememberedValue4;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(5004770);
                                zChangedInstance5 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                                objRememberedValue5 = composer3.rememberedValue();
                                if (!zChangedInstance5) {
                                    objRememberedValue5 = new CryptoQuickTradeSheetComposable8(cryptoQuickTradeSheetDuxo3);
                                    composer3.updateRememberedValue(objRememberedValue5);
                                    KFunction kFunction52 = (KFunction) objRememberedValue5;
                                    composer3.endReplaceGroup();
                                    Event<CryptoQuickTradeSheetEvent> eventCryptoQuickTradeSheetComposable$lambda$122 = CryptoQuickTradeSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                                    composer3.startReplaceGroup(5004770);
                                    zChangedInstance6 = composer3.changedInstance(cryptoQuickTradeSheetDuxo3);
                                    objRememberedValue6 = composer3.rememberedValue();
                                    if (!zChangedInstance6) {
                                        objRememberedValue6 = new CryptoQuickTradeSheetComposable9(cryptoQuickTradeSheetDuxo3);
                                        composer3.updateRememberedValue(objRememberedValue6);
                                        composer3.endReplaceGroup();
                                        Content(cryptoQuickTradeSheetViewStateCryptoQuickTradeSheetComposable$lambda$02, eventCryptoQuickTradeSheetComposable$lambda$122, (Function1) kFunction6, (Function0) kFunction22, (Function1) kFunction32, (Function0) kFunction42, (Function2) kFunction52, (Function1) ((KFunction) objRememberedValue6), modifier3, composer3, (i4 << 21) & 234881024, 0);
                                        composer4 = composer3;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        cryptoQuickTradeSheetDuxo4 = cryptoQuickTradeSheetDuxo3;
                                        modifier4 = modifier3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState, final Event<CryptoQuickTradeSheetEvent> event, final Function1<? super KeyEvent, Unit> function1, final Function0<Unit> function0, final Function1<? super CryptoOrderIntentKey.OrderType, Unit> function12, final Function0<Unit> function02, final Function2<? super ActionViewState, ? super Integer, Unit> function2, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Event<CryptoQuickTradeSheetEvent> event2;
        Function0<Unit> function03;
        Function1<? super CryptoOrderIntentKey.OrderType, Unit> function14;
        Function0<Unit> function04;
        Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function15;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        CryptoQuickTradeSheetViewState.TradeStage tradeStage;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1261106961);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cryptoQuickTradeSheetViewState) : composerStartRestartGroup.changedInstance(cryptoQuickTradeSheetViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            event2 = event;
        } else {
            event2 = event;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(event2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else {
                        if ((i & 196608) == 0) {
                            function04 = function02;
                            i3 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else {
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                            }
                            if ((i2 & 128) == 0) {
                                i3 |= 12582912;
                            } else {
                                if ((i & 12582912) == 0) {
                                    function15 = function13;
                                    i3 |= composerStartRestartGroup.changedInstance(function15) ? 8388608 : 4194304;
                                }
                                i4 = i2 & 256;
                                if (i4 == 0) {
                                    if ((100663296 & i) == 0) {
                                        modifier2 = modifier;
                                        i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                                    }
                                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        if (i4 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1261106961, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.Content (CryptoQuickTradeSheetComposable.kt:84)");
                                        }
                                        float f = 24;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4871backgroundbw27NRU(modifier2, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 12, null)), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 13, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        int i5 = i3;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.useNode();
                                        } else {
                                            composerStartRestartGroup.createNode(constructor);
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
                                        tradeStage = cryptoQuickTradeSheetViewState.getTradeStage();
                                        composerStartRestartGroup.startReplaceGroup(-1872501925);
                                        if (tradeStage == CryptoQuickTradeSheetViewState.TradeStage.INPUT) {
                                            if (tradeStage != CryptoQuickTradeSheetViewState.TradeStage.SUBMITTING && tradeStage != CryptoQuickTradeSheetViewState.TradeStage.RECEIPT && tradeStage != CryptoQuickTradeSheetViewState.TradeStage.UPSELL) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw new IllegalStateException("Not yet implemented");
                                        }
                                        int i6 = i5 >> 3;
                                        CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent(cryptoQuickTradeSheetViewState, function1, function03, function14, function04, function2, function15, event2, null, composerStartRestartGroup, (i5 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016) | ((i5 << 18) & 29360128), 256);
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final Modifier modifier3 = modifier2;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return CryptoQuickTradeSheetComposable3.Content$lambda$11(cryptoQuickTradeSheetViewState, event, function1, function0, function12, function02, function2, function13, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i3 |= 100663296;
                                modifier2 = modifier;
                                if ((38347923 & i3) == 38347922) {
                                    if (i4 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    float f2 = 24;
                                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4871backgroundbw27NRU(modifier2, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 12, null)), 0.0f, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 13, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    int i52 = i3;
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        tradeStage = cryptoQuickTradeSheetViewState.getTradeStage();
                                        composerStartRestartGroup.startReplaceGroup(-1872501925);
                                        if (tradeStage == CryptoQuickTradeSheetViewState.TradeStage.INPUT) {
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            function15 = function13;
                            i4 = i2 & 256;
                            if (i4 == 0) {
                            }
                            modifier2 = modifier;
                            if ((38347923 & i3) == 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i2 & 128) == 0) {
                        }
                        function15 = function13;
                        i4 = i2 & 256;
                        if (i4 == 0) {
                        }
                        modifier2 = modifier;
                        if ((38347923 & i3) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function04 = function02;
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    function15 = function13;
                    i4 = i2 & 256;
                    if (i4 == 0) {
                    }
                    modifier2 = modifier;
                    if ((38347923 & i3) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function14 = function12;
                if ((i2 & 32) == 0) {
                }
                function04 = function02;
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                function15 = function13;
                i4 = i2 & 256;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((38347923 & i3) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function0;
            if ((i2 & 16) != 0) {
            }
            function14 = function12;
            if ((i2 & 32) == 0) {
            }
            function04 = function02;
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            function15 = function13;
            i4 = i2 & 256;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((38347923 & i3) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        function03 = function0;
        if ((i2 & 16) != 0) {
        }
        function14 = function12;
        if ((i2 & 32) == 0) {
        }
        function04 = function02;
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        function15 = function13;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((38347923 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CryptoQuickTradeSheetViewState CryptoQuickTradeSheetComposable$lambda$0(SnapshotState4<CryptoQuickTradeSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoQuickTradeSheetEvent> CryptoQuickTradeSheetComposable$lambda$1(SnapshotState4<Event<CryptoQuickTradeSheetEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void CryptoQuickTradeInputSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-558315014);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558315014, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputSheetPreview (CryptoQuickTradeSheetComposable.kt:118)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoQuickTradeSheetComposable.INSTANCE.getLambda$833587634$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeSheetComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeSheetComposable3.CryptoQuickTradeInputSheetPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C38572R.string.order_create_buy_title, new Object[0]);
        CryptoQuickTradeRow.Input input = new CryptoQuickTradeRow.Input(new CryptoQuickTradeAmountInputRowState("$100.00", "Max $500.00", new CryptoInputRowCurrencyToggle4.Quote("USD")));
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(companion.invoke(C40095R.string.crypto_order_row_ask_price, new Object[0]), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion.invoke("Includes 0.85% spread"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null));
        StringResource stringResourceInvoke2 = companion.invoke("$99.15");
        CryptoOrderReviewRowState.TextStyleOverride textStyleOverride = CryptoOrderReviewRowState.TextStyleOverride.TEXT_M_BOLD;
        ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(input, new CryptoQuickTradeRow.OrderReviewRow(new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, null, null, null, textStyleOverride, null, false, 110, null), null, immutableList3PersistentListOf, null, false, null, false, null, null, 980, null), true), new CryptoQuickTradeRow.OrderReviewRow(new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("Total BTC"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("$100.00"), null, null, null, textStyleOverride, null, false, 110, null), null, null, null, false, null, false, null, null, 988, null), true));
        ActionViewState.Submit submit = new ActionViewState.Submit(true);
        CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState = new CryptoOrderAnimatedBentoNumpadState(true, false, false, null, 14, null);
        CryptoOrderIntentKey.OrderType orderType = CryptoOrderIntentKey.OrderType.MARKET;
        testViewState = new CryptoQuickTradeSheetViewState(stringResourceInvoke, new CryptoQuickTradeDropdownState(extensions2.persistentListOf(orderType, CryptoOrderIntentKey.OrderType.LIMIT, CryptoOrderIntentKey.OrderType.STOP_LIMIT, CryptoOrderIntentKey.OrderType.STOP_LOSS), orderType), immutableList3PersistentListOf2, true, submit, cryptoOrderAnimatedBentoNumpadState, CryptoQuickTradeSheetViewState.TradeStage.INPUT);
    }
}
