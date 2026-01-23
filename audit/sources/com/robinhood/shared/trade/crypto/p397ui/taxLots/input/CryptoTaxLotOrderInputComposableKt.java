package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp3;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpad;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderComposable4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeDropdownSelector;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeDropdownSelectorState;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownComposable;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputDataState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputEvent;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputViewState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialog;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.alert.lotLimit.CryptoTaxLotOrderInputLotLimitAlertDialogState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.views.CryptoTaxLotOrderInputCta;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.views.CryptoTaxLotOrderInputFooter;
import com.robinhood.shared.trade.crypto.views.CryptoOrderAppBarOrderTypeComposable;
import com.robinhood.shared.trade.crypto.views.CryptoOrderAppBarOrderTypeState;
import com.robinhood.shared.trade.crypto.views.CryptoOrderInputDropdownRow3;
import com.robinhood.shared.trade.crypto.views.CryptoOrderInputDropdownRowState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: CryptoTaxLotOrderInputComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\"\u0016\u0010\u000e\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0011\"\u0016\u0010\u0014\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0011\"\u0016\u0010\u0016\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0011¨\u0006\u0018²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u008a\u0084\u0002"}, m3636d2 = {"CryptoTaxLotOrderInputComposable", "", "onCloseClick", "Lkotlin/Function0;", "onOrderTypeClick", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState;", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState;Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDuxo;Landroidx/compose/runtime/Composer;I)V", "CRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG", "", "getCRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG$annotations", "()V", "CRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG", "getCRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG$annotations", "CRYPTO_TAX_LOT_ORDER_INPUT_HEADER_TEST_TAG", "getCRYPTO_TAX_LOT_ORDER_INPUT_HEADER_TEST_TAG$annotations", "CRYPTO_TAX_LOT_ORDER_INPUT_LOT_LIMIT_ALERT_TEST_TAG", "getCRYPTO_TAX_LOT_ORDER_INPUT_LOT_LIMIT_ALERT_TEST_TAG$annotations", "feature-trade-crypto_externalDebug", "shouldShowStrategySelectionBottomSheet", "", "shouldShowOrderTypeSelector", "lotLimitAlertState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/alert/lotLimit/CryptoTaxLotOrderInputLotLimitAlertDialogState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderInputComposableKt {
    public static final String CRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG = "crypto_tax_lot_order_input_back_button_test_tag";
    public static final String CRYPTO_TAX_LOT_ORDER_INPUT_HEADER_TEST_TAG = "crypto_tax_lot_order_input_header_test_tag";
    public static final String CRYPTO_TAX_LOT_ORDER_INPUT_LOT_LIMIT_ALERT_TEST_TAG = "crypto_tax_lot_order_input_lot_limit_alert_test_tag";
    public static final String CRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG = "crypto_tax_lot_order_input_order_type_test_tag";

    /* compiled from: CryptoTaxLotOrderInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoTaxLotOrderInputViewState.TaxLotStrategyRowTapAction.values().length];
            try {
                iArr[CryptoTaxLotOrderInputViewState.TaxLotStrategyRowTapAction.DISPLAY_STRATEGY_SELECTION_BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoTaxLotOrderInputViewState.TaxLotStrategyRowTapAction.PROCEED_TO_LOT_SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotOrderInputComposable$lambda$1(Function0 function0, Function0 function02, Modifier modifier, CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotOrderInputComposable(function0, function02, modifier, cryptoTaxLotOrderInputDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$48(CryptoTaxLotOrderInputViewState cryptoTaxLotOrderInputViewState, CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, int i, Composer composer, int i2) {
        MainContent(cryptoTaxLotOrderInputViewState, cryptoTaxLotOrderInputDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_ORDER_INPUT_HEADER_TEST_TAG$annotations() {
    }

    /* renamed from: getCRYPTO_TAX_LOT_ORDER_INPUT_LOT_LIMIT_ALERT_TEST_TAG$annotations */
    public static /* synthetic */ void m2907x801ef132() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotOrderInputComposable(final Function0<Unit> onCloseClick, final Function0<Unit> onOrderTypeClick, Modifier modifier, CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        int i4;
        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo3;
        Composer composer3;
        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onOrderTypeClick, "onOrderTypeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1802031286);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderTypeClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoTaxLotOrderInputDuxo2 = cryptoTaxLotOrderInputDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoTaxLotOrderInputDuxo2 = cryptoTaxLotOrderInputDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTaxLotOrderInputDuxo2 = cryptoTaxLotOrderInputDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
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
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTaxLotOrderInputDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$CryptoTaxLotOrderInputComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$CryptoTaxLotOrderInputComposable$$inlined$duxo$1.1
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
                        CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo5 = (CryptoTaxLotOrderInputDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        cryptoTaxLotOrderInputDuxo3 = cryptoTaxLotOrderInputDuxo5;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1802031286, i4, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable (CryptoTaxLotOrderInputComposable.kt:60)");
                    }
                    Composer composer4 = composer2;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1955267962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1
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
                                ComposerKt.traceEventStart(1955267962, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous> (CryptoTaxLotOrderInputComposable.kt:65)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> lambda$2131732199$feature_trade_crypto_externalDebug = ComposableSingletons$CryptoTaxLotOrderInputComposableKt.INSTANCE.getLambda$2131732199$feature_trade_crypto_externalDebug();
                            final Function0<Unit> function0 = onCloseClick;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1355629509, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer6, Integer num) {
                                    invoke(bentoAppBarScope, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer6, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer6.changed(BentoAppBar) : composer6.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1355629509, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:69)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotOrderInputComposableKt.CRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG), false, 0L, function0, composer6, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54);
                            final Function0<Unit> function02 = onOrderTypeClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2131732199$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1462330140, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer6, Integer num) {
                                    invoke(row5, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer6, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1462330140, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:75)");
                                    }
                                    CryptoOrderAppBarOrderTypeComposable.CryptoOrderAppBarOrderTypeComposable(new CryptoOrderAppBarOrderTypeState(CryptoOrderAppBarOrderTypeState.Type.TaxLots.INSTANCE, false, 2, null), function02, ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), CryptoTaxLotOrderInputComposableKt.CRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer6.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TEXT_VIEW, "order_type", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), composer6, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), null, false, false, null, null, 0L, null, composer5, 3510, 0, 2032);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-637924283, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                            invoke(paddingValues, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues contentPadding, Composer composer5, int i7) {
                            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                            if ((i7 & 6) == 0) {
                                i7 |= composer5.changed(contentPadding) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-637924283, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous> (CryptoTaxLotOrderInputComposable.kt:95)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, contentPadding);
                            final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo6 = cryptoTaxLotOrderInputDuxo3;
                            final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1040905448, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i8) {
                                    if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1040905448, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:98)");
                                    }
                                    CryptoTaxLotOrderInputComposableKt.MainContent(CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$0(snapshotState4), cryptoTaxLotOrderInputDuxo6, composer6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54);
                            final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo7 = cryptoTaxLotOrderInputDuxo3;
                            final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                            BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1730547672, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer6, Integer num) {
                                    invoke(bentoNumpad4, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer6, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                    if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1730547672, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:104)");
                                    }
                                    CryptoOrderAnimatedBentoNumpadState numpadState = CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$0(snapshotState42).getNumpadState();
                                    CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo8 = cryptoTaxLotOrderInputDuxo7;
                                    composer6.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer6.changedInstance(cryptoTaxLotOrderInputDuxo8);
                                    Object objRememberedValue2 = composer6.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new C40676x550fc831(cryptoTaxLotOrderInputDuxo8);
                                        composer6.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer6.endReplaceGroup();
                                    CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(numpadState, (Function1) ((KFunction) objRememberedValue2), null, null, composer6, CryptoOrderAnimatedBentoNumpadState.$stable, 12);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), composer5, 432, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54), composer4, 805306416, 508);
                    composer3 = composer4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoTaxLotOrderInputDuxo4 = cryptoTaxLotOrderInputDuxo3;
                    modifier4 = modifier5;
                }
                composer2 = composerStartRestartGroup;
                i4 = i3;
                cryptoTaxLotOrderInputDuxo3 = cryptoTaxLotOrderInputDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1955267962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1
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
                            ComposerKt.traceEventStart(1955267962, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous> (CryptoTaxLotOrderInputComposable.kt:65)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> lambda$2131732199$feature_trade_crypto_externalDebug = ComposableSingletons$CryptoTaxLotOrderInputComposableKt.INSTANCE.getLambda$2131732199$feature_trade_crypto_externalDebug();
                        final Function0<Unit> function0 = onCloseClick;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1355629509, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer6, Integer num) {
                                invoke(bentoAppBarScope, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer6.changed(BentoAppBar) : composer6.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1355629509, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:69)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotOrderInputComposableKt.CRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG), false, 0L, function0, composer6, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54);
                        final Function0<Unit> function02 = onOrderTypeClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2131732199$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1462330140, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer6, Integer num) {
                                invoke(row5, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1462330140, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:75)");
                                }
                                CryptoOrderAppBarOrderTypeComposable.CryptoOrderAppBarOrderTypeComposable(new CryptoOrderAppBarOrderTypeState(CryptoOrderAppBarOrderTypeState.Type.TaxLots.INSTANCE, false, 2, null), function02, ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), CryptoTaxLotOrderInputComposableKt.CRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer6.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TEXT_VIEW, "order_type", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), composer6, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), null, false, false, null, null, 0L, null, composer5, 3510, 0, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-637924283, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer5, int i7) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i7 & 6) == 0) {
                            i7 |= composer5.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-637924283, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous> (CryptoTaxLotOrderInputComposable.kt:95)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, contentPadding);
                        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo6 = cryptoTaxLotOrderInputDuxo3;
                        final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1040905448, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1040905448, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:98)");
                                }
                                CryptoTaxLotOrderInputComposableKt.MainContent(CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$0(snapshotState4), cryptoTaxLotOrderInputDuxo6, composer6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54);
                        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo7 = cryptoTaxLotOrderInputDuxo3;
                        final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1730547672, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer6, Integer num) {
                                invoke(bentoNumpad4, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1730547672, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:104)");
                                }
                                CryptoOrderAnimatedBentoNumpadState numpadState = CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$0(snapshotState42).getNumpadState();
                                CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo8 = cryptoTaxLotOrderInputDuxo7;
                                composer6.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer6.changedInstance(cryptoTaxLotOrderInputDuxo8);
                                Object objRememberedValue2 = composer6.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new C40676x550fc831(cryptoTaxLotOrderInputDuxo8);
                                    composer6.updateRememberedValue(objRememberedValue2);
                                }
                                composer6.endReplaceGroup();
                                CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(numpadState, (Function1) ((KFunction) objRememberedValue2), null, null, composer6, CryptoOrderAnimatedBentoNumpadState.$stable, 12);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), composer5, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), composer42, 805306416, 508);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoTaxLotOrderInputDuxo4 = cryptoTaxLotOrderInputDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTaxLotOrderInputDuxo4 = cryptoTaxLotOrderInputDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$1(onCloseClick, onOrderTypeClick, modifier4, cryptoTaxLotOrderInputDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    composer2 = composerStartRestartGroup;
                    i4 = i3;
                    cryptoTaxLotOrderInputDuxo3 = cryptoTaxLotOrderInputDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer422 = composer2;
                final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer422, 0, 7);
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1955267962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1
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
                            ComposerKt.traceEventStart(1955267962, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous> (CryptoTaxLotOrderInputComposable.kt:65)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> lambda$2131732199$feature_trade_crypto_externalDebug = ComposableSingletons$CryptoTaxLotOrderInputComposableKt.INSTANCE.getLambda$2131732199$feature_trade_crypto_externalDebug();
                        final Function0<Unit> function0 = onCloseClick;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1355629509, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer6, Integer num) {
                                invoke(bentoAppBarScope, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer6.changed(BentoAppBar) : composer6.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1355629509, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:69)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotOrderInputComposableKt.CRYPTO_TAX_LOT_ORDER_INPUT_BACK_BUTTON_TEST_TAG), false, 0L, function0, composer6, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54);
                        final Function0<Unit> function02 = onOrderTypeClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2131732199$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1462330140, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer6, Integer num) {
                                invoke(row5, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1462330140, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:75)");
                                }
                                CryptoOrderAppBarOrderTypeComposable.CryptoOrderAppBarOrderTypeComposable(new CryptoOrderAppBarOrderTypeState(CryptoOrderAppBarOrderTypeState.Type.TaxLots.INSTANCE, false, 2, null), function02, ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null), CryptoTaxLotOrderInputComposableKt.CRYPTO_TAX_LOT_ORDER_INPUT_ORDER_TYPE_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer6.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TEXT_VIEW, "order_type", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), composer6, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), null, false, false, null, null, 0L, null, composer5, 3510, 0, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer422, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-637924283, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer5, int i7) {
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i7 & 6) == 0) {
                            i7 |= composer5.changed(contentPadding) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-637924283, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous> (CryptoTaxLotOrderInputComposable.kt:95)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, contentPadding);
                        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo6 = cryptoTaxLotOrderInputDuxo3;
                        final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1040905448, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i8) {
                                if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1040905448, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:98)");
                                }
                                CryptoTaxLotOrderInputComposableKt.MainContent(CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$0(snapshotState4), cryptoTaxLotOrderInputDuxo6, composer6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54);
                        final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo7 = cryptoTaxLotOrderInputDuxo3;
                        final SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle22;
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1730547672, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable.2.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer6, Integer num) {
                                invoke(bentoNumpad4, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer6, int i8) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                if ((i8 & 17) == 16 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1730547672, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderInputComposable.kt:104)");
                                }
                                CryptoOrderAnimatedBentoNumpadState numpadState = CryptoTaxLotOrderInputComposableKt.CryptoTaxLotOrderInputComposable$lambda$0(snapshotState42).getNumpadState();
                                CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo8 = cryptoTaxLotOrderInputDuxo7;
                                composer6.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer6.changedInstance(cryptoTaxLotOrderInputDuxo8);
                                Object objRememberedValue2 = composer6.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new C40676x550fc831(cryptoTaxLotOrderInputDuxo8);
                                    composer6.updateRememberedValue(objRememberedValue2);
                                }
                                composer6.endReplaceGroup();
                                CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(numpadState, (Function1) ((KFunction) objRememberedValue2), null, null, composer6, CryptoOrderAnimatedBentoNumpadState.$stable, 12);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), composer5, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer422, 54), composer422, 805306416, 508);
                composer3 = composer422;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoTaxLotOrderInputDuxo4 = cryptoTaxLotOrderInputDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTaxLotOrderInputViewState CryptoTaxLotOrderInputComposable$lambda$0(SnapshotState4<CryptoTaxLotOrderInputViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTaxLotOrderInputEvent> MainContent$lambda$11(SnapshotState4<Event<CryptoTaxLotOrderInputEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean MainContent$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean MainContent$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final CryptoTaxLotOrderInputLotLimitAlertDialogState MainContent$lambda$9(SnapshotState<CryptoTaxLotOrderInputLotLimitAlertDialogState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent(final CryptoTaxLotOrderInputViewState cryptoTaxLotOrderInputViewState, final CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        final SnapshotState snapshotState;
        EventConsumer<CryptoTaxLotOrderInputEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1474025984);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1474025984, i2, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.MainContent (CryptoTaxLotOrderInputComposable.kt:119)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            final Event<CryptoTaxLotOrderInputEvent> eventMainContent$lambda$11 = MainContent$lambda$11(FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderInputDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventMainContent$lambda$11 != null) {
                if ((eventMainContent$lambda$11.getData() instanceof CryptoTaxLotOrderInputEvent.ShowLotLimitAlert) && (eventConsumerInvoke = eventMainContent$lambda$11.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventMainContent$lambda$11, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$MainContent$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25998invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25998invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState4.setValue(((CryptoTaxLotOrderInputEvent.ShowLotLimitAlert) eventMainContent$lambda$11.getData()).getState());
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(cryptoTaxLotOrderInputViewState.getCryptoOrderHeaderState(), TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), CRYPTO_TAX_LOT_ORDER_INPUT_HEADER_TEST_TAG), null, composerStartRestartGroup, CryptoOrderHeaderState.$stable, 4);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.ROW;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, "order_type", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            CryptoOrderInputDropdownRowState orderTypeCryptoOrderInputDropdownRowState = cryptoTaxLotOrderInputViewState.getOrderTypeCryptoOrderInputDropdownRowState();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTaxLotOrderInputComposableKt.m2902x7de5a106(snapshotState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = StringResource.$stable;
            CryptoOrderInputDropdownRow3.CryptoOrderInputDropdownRow(orderTypeCryptoOrderInputDropdownRowState, (Function0) objRememberedValue4, modifierAutoLogEvents$default, composerStartRestartGroup, i7 | 48, 0);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ORDER_TYPE_PICKER, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            CryptoOrderTypeDropdownSelectorState orderTypeDropdownSelectorState = cryptoTaxLotOrderInputViewState.getOrderTypeDropdownSelectorState();
            composerStartRestartGroup.startReplaceGroup(409159177);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composerStartRestartGroup.endReplaceGroup();
            long jM8009constructorimpl = Dp3.m8009constructorimpl((Float.floatToRawIntBits(C2002Dp.m7995constructorimpl(0)) & 4294967295L) | (Float.floatToRawIntBits(fMo5013toDpu2uoSUM) << 32));
            boolean zMainContent$lambda$6 = MainContent$lambda$6(snapshotState3);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTaxLotOrderInputComposableKt.m2903x3c93b94c(cryptoTaxLotOrderInputDuxo, snapshotState3, (CryptoOrderType) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTaxLotOrderInputComposableKt.m2904x665d1ed0(snapshotState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderTypeDropdownSelector.m25297CryptoOrderTypeDropdownSelectorEZyisMU(orderTypeDropdownSelectorState, zMainContent$lambda$6, function1, (Function0) objRememberedValue6, modifierAutoLogEvents$default2, jM8009constructorimpl, composerStartRestartGroup, CryptoOrderTypeDropdownSelectorState.$stable | 3072, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            CryptoOrderReviewRowState assetPriceRowState = cryptoTaxLotOrderInputViewState.getAssetPriceRowState();
            composerStartRestartGroup.startReplaceGroup(-1946111853);
            if (assetPriceRowState == null) {
                i3 = 5004770;
            } else {
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                i3 = 5004770;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$2$1$1(cryptoTaxLotOrderInputDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoOrderReviewRow3.CryptoOrderReviewRow(assetPriceRowState, modifierM21623defaultHorizontalPaddingrAjV9yQ, (Function1) ((KFunction) objRememberedValue7), composerStartRestartGroup, CryptoOrderReviewRowState.$stable, 0);
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderInputRowState limitPriceRowState = cryptoTaxLotOrderInputViewState.getLimitPriceRowState();
            composerStartRestartGroup.startReplaceGroup(-1946102023);
            if (limitPriceRowState != null) {
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$3$1$1(cryptoTaxLotOrderInputDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function12 = (Function1) ((KFunction) objRememberedValue8);
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTaxLotOrderInputComposableKt.m2905x6611ba4c(cryptoTaxLotOrderInputDuxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoOrderInputRow.CryptoOrderInputRow(limitPriceRowState, function12, (Function0) objRememberedValue9, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, composerStartRestartGroup, CryptoOrderInputRowState.$stable, 48);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit3 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, "tax_lot_strategy", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            CryptoOrderInputDropdownRowState taxLotStrategyDropdownRowState = cryptoTaxLotOrderInputViewState.getTaxLotStrategyDropdownRowState();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputViewState) | composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTaxLotOrderInputComposableKt.MainContent$lambda$47$lambda$39$lambda$37$lambda$28$lambda$27(cryptoTaxLotOrderInputViewState, cryptoTaxLotOrderInputDuxo, snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderInputDropdownRow3.CryptoOrderInputDropdownRow(taxLotStrategyDropdownRowState, (Function0) objRememberedValue10, modifierAutoLogEvents$default3, composerStartRestartGroup, i7, 0);
            CryptoOrderInputRowState assetOrderInputRowState = cryptoTaxLotOrderInputViewState.getAssetOrderInputRowState();
            composerStartRestartGroup.startReplaceGroup(-1946048070);
            if (assetOrderInputRowState == null) {
                i4 = i7;
            } else {
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance6 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$5$1$1(cryptoTaxLotOrderInputDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function13 = (Function1) ((KFunction) objRememberedValue11);
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance7 || objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTaxLotOrderInputComposableKt.m2906x6e52795d(cryptoTaxLotOrderInputDuxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                i4 = i7;
                CryptoOrderInputRow.CryptoOrderInputRow(assetOrderInputRowState, function13, (Function0) objRememberedValue12, modifierM21623defaultHorizontalPaddingrAjV9yQ3, null, null, composer2, CryptoOrderInputRowState.$stable, 48);
                composerStartRestartGroup = composer2;
                Unit unit4 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderReviewRowState feeRowState = cryptoTaxLotOrderInputViewState.getFeeRowState();
            composerStartRestartGroup.startReplaceGroup(-1946035373);
            if (feeRowState != null) {
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ4 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance8 || objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$6$1$1(cryptoTaxLotOrderInputDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoOrderReviewRow3.CryptoOrderReviewRow(feeRowState, modifierM21623defaultHorizontalPaddingrAjV9yQ4, (Function1) ((KFunction) objRememberedValue13), composerStartRestartGroup, CryptoOrderReviewRowState.$stable, 0);
                Unit unit5 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderReviewRowState totalCreditRowState = cryptoTaxLotOrderInputViewState.getTotalCreditRowState();
            composerStartRestartGroup.startReplaceGroup(-1946025613);
            if (totalCreditRowState != null) {
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ5 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                composerStartRestartGroup.startReplaceGroup(i3);
                boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance9 || objRememberedValue14 == companion.getEmpty()) {
                    objRememberedValue14 = new CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$7$1$1(cryptoTaxLotOrderInputDuxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceGroup();
                CryptoOrderReviewRow3.CryptoOrderReviewRow(totalCreditRowState, modifierM21623defaultHorizontalPaddingrAjV9yQ5, (Function1) ((KFunction) objRememberedValue14), composerStartRestartGroup, CryptoOrderReviewRowState.$stable, 0);
                Unit unit6 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (cryptoTaxLotOrderInputViewState.getAccountSwitcherArgs() != null) {
                composerStartRestartGroup.startReplaceGroup(1314144244);
                CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable(cryptoTaxLotOrderInputViewState.getAccountSwitcherArgs(), null, null, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1314262881);
                CryptoTaxLotOrderInputFooter.CryptoTaxLotOrderInputFooter(cryptoTaxLotOrderInputViewState.getFooterMessage(), null, composerStartRestartGroup, i4, 2);
                composerStartRestartGroup.endReplaceGroup();
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierAutoLogEvents$default4 = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, cryptoTaxLotOrderInputViewState.getSelectedTaxLotStrategyIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, "review", null, 4, null), null, 39, null), false, false, false, true, false, null, 110, null);
            boolean zIsCtaEnabled = cryptoTaxLotOrderInputViewState.isCtaEnabled();
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance10 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance10 || objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new CryptoTaxLotOrderInputComposableKt$MainContent$2$1$2$1(cryptoTaxLotOrderInputDuxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoTaxLotOrderInputCta.CryptoTaxLotOrderInputCta((Function0) ((KFunction) objRememberedValue15), zIsCtaEnabled, modifierAutoLogEvents$default4, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(974055165);
            if (MainContent$lambda$3(snapshotState2)) {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance11 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo);
                Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance11 || objRememberedValue16 == companion.getEmpty()) {
                    objRememberedValue16 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTaxLotOrderInputComposableKt.MainContent$lambda$47$lambda$41$lambda$40(cryptoTaxLotOrderInputDuxo, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer3 = composerStartRestartGroup;
                i5 = i3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue16, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1307291718, true, new CryptoTaxLotOrderInputComposableKt$MainContent$2$3(cryptoTaxLotOrderInputViewState, cryptoTaxLotOrderInputDuxo, snapshotState2), composerStartRestartGroup, 54), composer3, 1572864, 62);
                composerStartRestartGroup = composer3;
            } else {
                i5 = i3;
            }
            composerStartRestartGroup.endReplaceGroup();
            final CryptoTaxLotOrderInputLotLimitAlertDialogState cryptoTaxLotOrderInputLotLimitAlertDialogStateMainContent$lambda$9 = MainContent$lambda$9(snapshotState4);
            composerStartRestartGroup.startReplaceGroup(974096543);
            if (cryptoTaxLotOrderInputLotLimitAlertDialogStateMainContent$lambda$9 != null) {
                Modifier modifierAutoLogEvents$default5 = ModifiersKt.autoLogEvents$default(TestTag3.testTag(companion2, CRYPTO_TAX_LOT_ORDER_INPUT_LOT_LIMIT_ALERT_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ALERT, "tax_lots_lot_limit", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance12 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputDuxo) | composerStartRestartGroup.changedInstance(cryptoTaxLotOrderInputLotLimitAlertDialogStateMainContent$lambda$9);
                Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance12 || objRememberedValue17 == companion.getEmpty()) {
                    snapshotState = snapshotState4;
                    objRememberedValue17 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTaxLotOrderInputComposableKt.MainContent$lambda$47$lambda$46$lambda$43$lambda$42(cryptoTaxLotOrderInputDuxo, cryptoTaxLotOrderInputLotLimitAlertDialogStateMainContent$lambda$9, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                } else {
                    snapshotState = snapshotState4;
                }
                Function0 function0 = (Function0) objRememberedValue17;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(i5);
                Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == companion.getEmpty()) {
                    objRememberedValue18 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTaxLotOrderInputComposableKt.MainContent$lambda$47$lambda$46$lambda$45$lambda$44(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer4 = composerStartRestartGroup;
                CryptoTaxLotOrderInputLotLimitAlertDialog.CryptoTaxLotOrderInputLotLimitAlertDialog(cryptoTaxLotOrderInputLotLimitAlertDialogStateMainContent$lambda$9, function0, (Function0) objRememberedValue18, modifierAutoLogEvents$default5, composer4, 384, 0);
                composerStartRestartGroup = composer4;
                Unit unit7 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotOrderInputComposableKt.MainContent$lambda$48(cryptoTaxLotOrderInputViewState, cryptoTaxLotOrderInputDuxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void MainContent$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MainContent$lambda$47$lambda$39$lambda$37$lambda$20$lambda$14$lambda$13 */
    public static final Unit m2902x7de5a106(SnapshotState snapshotState) {
        MainContent$lambda$7(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MainContent$lambda$47$lambda$39$lambda$37$lambda$20$lambda$17$lambda$16 */
    public static final Unit m2903x3c93b94c(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, SnapshotState snapshotState, CryptoOrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        cryptoTaxLotOrderInputDuxo.onOrderTypeSelected(orderType);
        MainContent$lambda$7(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MainContent$lambda$47$lambda$39$lambda$37$lambda$20$lambda$19$lambda$18 */
    public static final Unit m2904x665d1ed0(SnapshotState snapshotState) {
        MainContent$lambda$7(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MainContent$lambda$47$lambda$39$lambda$37$lambda$26$lambda$25$lambda$24 */
    public static final Unit m2905x6611ba4c(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo) {
        cryptoTaxLotOrderInputDuxo.onInputFieldFocusRequested(CryptoTaxLotOrderInputDataState.InputField.LIMIT_PRICE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$47$lambda$39$lambda$37$lambda$28$lambda$27(CryptoTaxLotOrderInputViewState cryptoTaxLotOrderInputViewState, CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, SnapshotState snapshotState) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoTaxLotOrderInputViewState.getTaxLotStrategyDropdownRowTapAction().ordinal()];
        if (i == 1) {
            MainContent$lambda$4(snapshotState, !MainContent$lambda$3(snapshotState));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (cryptoTaxLotOrderInputViewState.isCtaEnabled()) {
                cryptoTaxLotOrderInputDuxo.onViewTaxLotsClicked();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MainContent$lambda$47$lambda$39$lambda$37$lambda$32$lambda$31$lambda$30 */
    public static final Unit m2906x6e52795d(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo) {
        cryptoTaxLotOrderInputDuxo.onInputFieldFocusRequested(CryptoTaxLotOrderInputDataState.InputField.ASSET_AMOUNT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$47$lambda$41$lambda$40(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, SnapshotState snapshotState) {
        cryptoTaxLotOrderInputDuxo.onClearTemporarilySelectedStrategyType();
        MainContent$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$47$lambda$46$lambda$43$lambda$42(CryptoTaxLotOrderInputDuxo cryptoTaxLotOrderInputDuxo, CryptoTaxLotOrderInputLotLimitAlertDialogState cryptoTaxLotOrderInputLotLimitAlertDialogState, SnapshotState snapshotState) {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        cryptoTaxLotOrderInputDuxo.setOrderSize(ZERO, cryptoTaxLotOrderInputLotLimitAlertDialogState.getMaxQuantity());
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$47$lambda$46$lambda$45$lambda$44(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
