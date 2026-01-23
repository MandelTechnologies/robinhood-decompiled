package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayoutV2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.taxLots.TaxLotsTableKt;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.AlertDialogType;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionEvent;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.alert.dismissable.CryptoTaxLotSelectionDismissableAlertDialogComposable3;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.alert.workLoss.CryptoTaxLotSelectionWorkLossAlertDialogComposable3;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionHeader3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a¾\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u00112!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001b\"\u001c\u0010\u001c\u001a\u00020\u000f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001c\u0010!\u001a\u00020\u000f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 \"\u001c\u0010$\u001a\u00020\u000f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 \"\u001c\u0010'\u001a\u00020\u000f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 \"\u001c\u0010*\u001a\u00020\u000f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 ¨\u0006-²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0012\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/X\u008a\u0084\u0002²\u0006\f\u00101\u001a\u0004\u0018\u000102X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTaxLotSelectionComposable", "", "leaveScreen", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionViewState;", "requestNextPage", "onHeaderClicked", "Lkotlin/Function1;", "", "onCheckBoxClicked", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "id", "", "isSelected", "onInputFieldFocused", "onTapAction", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionTapAction;", "onPriceInfoClicked", "(Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG", "getCRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG$annotations", "()V", "getCRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG", "()Ljava/lang/String;", "CRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG", "getCRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG$annotations", "getCRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG", "CRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG", "getCRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG$annotations", "getCRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG", "CRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG", "getCRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG$annotations", "getCRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG", "CRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG", "getCRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG$annotations", "getCRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG", "feature-trade-crypto_externalDebug", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "alertDialogType", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/AlertDialogType;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionComposableKt {
    private static final String CRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG = "crypto_tax_lot_selection_close_button_test_tag";
    private static final String CRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG = "crypto_tax_lot_selection_footer_test_tag";
    private static final String CRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG = "crypto_tax_lot_selection_header_test_tag";
    private static final String CRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG = "crypto_tax_lot_selection_info_button_test_tag";
    private static final String CRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG = "crypto_tax_lot_selection_work_loss_alert_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotSelectionComposable$lambda$15(Function0 function0, Modifier modifier, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotSelectionComposable(function0, modifier, cryptoTaxLotSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$17(CryptoTaxLotSelectionViewState cryptoTaxLotSelectionViewState, Function0 function0, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(cryptoTaxLotSelectionViewState, function0, function1, function2, function12, function13, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotSelectionComposable(final Function0<Unit> leaveScreen, Modifier modifier, CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo2;
        int i4;
        CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo3;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Event<CryptoTaxLotSelectionEvent> eventCryptoTaxLotSelectionComposable$lambda$2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo4;
        AlertDialogType alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4;
        EventConsumer<CryptoTaxLotSelectionEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(leaveScreen, "leaveScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1834742138);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(leaveScreen) ? 4 : 2) | i;
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
                    cryptoTaxLotSelectionDuxo2 = cryptoTaxLotSelectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTaxLotSelectionDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoTaxLotSelectionDuxo2 = cryptoTaxLotSelectionDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTaxLotSelectionDuxo2 = cryptoTaxLotSelectionDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTaxLotSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-897);
                        cryptoTaxLotSelectionDuxo3 = (CryptoTaxLotSelectionDuxo) baseDuxo;
                    } else {
                        i4 = i3;
                        cryptoTaxLotSelectionDuxo3 = cryptoTaxLotSelectionDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    cryptoTaxLotSelectionDuxo3 = cryptoTaxLotSelectionDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1834742138, i4, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposable (CryptoTaxLotSelectionComposable.kt:57)");
                }
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                BentoNumpadScopeV22 bentoNumpadScopeV22 = (BentoNumpadScopeV22) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotSelectionDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoTaxLotSelectionComposable$lambda$2 = CryptoTaxLotSelectionComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTaxLotSelectionComposable$lambda$2 != null) {
                    if ((eventCryptoTaxLotSelectionComposable$lambda$2.getData() instanceof CryptoTaxLotSelectionEvent.DisplayWorkLossAlertDialog) && (eventConsumerInvoke = eventCryptoTaxLotSelectionComposable$lambda$2.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoTaxLotSelectionComposable$lambda$2, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m26019invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m26019invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                snapshotState.setValue(AlertDialogType.WorkLoss.INSTANCE);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSystemBarsPadding);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                cryptoTaxLotSelectionDuxo4 = cryptoTaxLotSelectionDuxo3;
                int i7 = i4;
                BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV22, ComposableLambda3.rememberComposableLambda(1073442373, true, new C40749xb7dd7624(focusManager, cryptoTaxLotSelectionDuxo3, navigator, context, snapshotState4CollectAsStateWithLifecycle, current2, screen, snapshotState), composerStartRestartGroup, 54), null, coroutineScope, ComposableLambda3.rememberComposableLambda(-1099972600, true, new C40755xb7dd7625(cryptoTaxLotSelectionDuxo4, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, BentoNumpadScopeV22.$stable | 24624, 2);
                alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4 = CryptoTaxLotSelectionComposable$lambda$4(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1429123387);
                if (alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4 != null) {
                    if (Intrinsics.areEqual(alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4, AlertDialogType.WorkLoss.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-938969971);
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, CRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ALERT, "work_loss", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z = (i7 & 14) == 4;
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTaxLotSelectionComposableKt.m2921x42ceebe8(leaveScreen, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function0 function0 = (Function0) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTaxLotSelectionComposableKt.m2919xd38d495f(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoTaxLotSelectionWorkLossAlertDialogComposable3.CryptoTaxLotSelectionWorkLossAlertDialogComposable(function0, (Function0) objRememberedValue6, modifierAutoLogEvents$default, composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4 instanceof AlertDialogType.DismissableAlert)) {
                            composerStartRestartGroup.startReplaceGroup(-1138669488);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-937952365);
                        AlertDialogType.DismissableAlert dismissableAlert = (AlertDialogType.DismissableAlert) alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4;
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ALERT, dismissableAlert.getAnalyticsIdentifier(), null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        String title = dismissableAlert.getTitle();
                        String body = dismissableAlert.getBody();
                        String analyticsIdentifier = dismissableAlert.getAnalyticsIdentifier();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTaxLotSelectionComposableKt.m2920xc7e5473c(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoTaxLotSelectionDismissableAlertDialogComposable3.CryptoTaxLotSelectionDismissableAlertDialogComposable(title, body, analyticsIdentifier, (Function0) objRememberedValue7, modifierAutoLogEvents$default2, composerStartRestartGroup, 3072, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cryptoTaxLotSelectionDuxo4 = cryptoTaxLotSelectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotSelectionComposableKt.CryptoTaxLotSelectionComposable$lambda$15(leaveScreen, modifier3, cryptoTaxLotSelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                BentoNumpadScopeV22 bentoNumpadScopeV222 = (BentoNumpadScopeV22) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotSelectionDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                Screen screen2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoTaxLotSelectionComposable$lambda$2 = CryptoTaxLotSelectionComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoTaxLotSelectionComposable$lambda$2 != null) {
                }
                Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSystemBarsPadding2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    cryptoTaxLotSelectionDuxo4 = cryptoTaxLotSelectionDuxo3;
                    int i72 = i4;
                    BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV222, ComposableLambda3.rememberComposableLambda(1073442373, true, new C40749xb7dd7624(focusManager2, cryptoTaxLotSelectionDuxo3, navigator2, context2, snapshotState4CollectAsStateWithLifecycle3, current22, screen2, snapshotState2), composerStartRestartGroup, 54), null, coroutineScope2, ComposableLambda3.rememberComposableLambda(-1099972600, true, new C40755xb7dd7625(cryptoTaxLotSelectionDuxo4, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), composerStartRestartGroup, BentoNumpadScopeV22.$stable | 24624, 2);
                    alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4 = CryptoTaxLotSelectionComposable$lambda$4(snapshotState2);
                    composerStartRestartGroup.startReplaceGroup(-1429123387);
                    if (alertDialogTypeCryptoTaxLotSelectionComposable$lambda$4 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTaxLotSelectionViewState CryptoTaxLotSelectionComposable$lambda$1(SnapshotState4<CryptoTaxLotSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTaxLotSelectionEvent> CryptoTaxLotSelectionComposable$lambda$2(SnapshotState4<Event<CryptoTaxLotSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final AlertDialogType CryptoTaxLotSelectionComposable$lambda$4(SnapshotState<AlertDialogType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotSelectionComposable$lambda$14$lambda$13$lambda$8$lambda$7 */
    public static final Unit m2921x42ceebe8(Function0 function0, SnapshotState snapshotState) {
        snapshotState.setValue(null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotSelectionComposable$lambda$14$lambda$13$lambda$10$lambda$9 */
    public static final Unit m2919xd38d495f(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTaxLotSelectionComposable$lambda$14$lambda$13$lambda$12$lambda$11 */
    public static final Unit m2920xc7e5473c(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final CryptoTaxLotSelectionViewState cryptoTaxLotSelectionViewState, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function2<? super String, ? super Boolean, Unit> function2, final Function1<? super String, Unit> function12, final Function1<? super CryptoTaxLotSelectionTapAction, Unit> function13, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        CryptoTaxLotSelectionViewState cryptoTaxLotSelectionViewState2;
        int i3;
        Function0<Unit> function03;
        Function1<? super String, Unit> function14;
        Function2<? super String, ? super Boolean, Unit> function22;
        Function1<? super String, Unit> function15;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1875548419);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            cryptoTaxLotSelectionViewState2 = cryptoTaxLotSelectionViewState;
        } else {
            cryptoTaxLotSelectionViewState2 = cryptoTaxLotSelectionViewState;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(cryptoTaxLotSelectionViewState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function14 = function1;
        } else {
            function14 = function1;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function15 = function12;
        } else {
            function15 = function12;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function15) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else {
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1875548419, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.MainContent (CryptoTaxLotSelectionComposable.kt:237)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    int i5 = i3;
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
                    CryptoTaxLotSelectionHeader3.CryptoTaxLotSelectionHeader(cryptoTaxLotSelectionViewState2.getHeaderState(), function02, TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), CRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG), composerStartRestartGroup, (i5 >> 15) & 112, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    modifier2 = modifier3;
                    TaxLotsTableKt.TaxLotTable(cryptoTaxLotSelectionViewState.getTableState(), function03, function14, function22, function15, function13, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, composerStartRestartGroup, TaxLotTableState.$stable | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5), 128);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTaxLotSelectionComposableKt.MainContent$lambda$17(cryptoTaxLotSelectionViewState, function0, function1, function2, function12, function13, function02, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            if ((4793491 & i3) == 4793490) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                int i52 = i3;
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
                    CryptoTaxLotSelectionHeader3.CryptoTaxLotSelectionHeader(cryptoTaxLotSelectionViewState2.getHeaderState(), function02, TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1), CRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG), composerStartRestartGroup, (i52 >> 15) & 112, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    modifier2 = modifier3;
                    TaxLotsTableKt.TaxLotTable(cryptoTaxLotSelectionViewState.getTableState(), function03, function14, function22, function15, function13, SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null), null, composerStartRestartGroup, TaxLotTableState.$stable | 1572864 | (i52 & 112) | (i52 & 896) | (i52 & 7168) | (57344 & i52) | (458752 & i52), 128);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            final Modifier modifier42 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i3) == 4793490) {
        }
        final Modifier modifier422 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final String getCRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG() {
        return CRYPTO_TAX_LOT_SELECTION_BACK_BUTTON_TEST_TAG;
    }

    public static final String getCRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG() {
        return CRYPTO_TAX_LOT_SELECTION_INFO_BUTTON_TEST_TAG;
    }

    public static final String getCRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG() {
        return CRYPTO_TAX_LOT_SELECTION_HEADER_TEST_TAG;
    }

    public static final String getCRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG() {
        return CRYPTO_TAX_LOT_SELECTION_FOOTER_TEST_TAG;
    }

    public static final String getCRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG() {
        return CRYPTO_TAX_LOT_SELECTION_WORK_LOSS_ALERT_TEST_TAG;
    }
}
