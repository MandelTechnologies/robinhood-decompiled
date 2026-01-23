package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo5;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.Moneys;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrderFormRows.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000e\u001aY\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0015\u001a7\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0019\u001aQ\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0002\u0010%\u001aG\u0010&\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010'\u001a\u00020(H\u0003¢\u0006\u0002\u0010)\u001a5\u0010*\u001a\u00020\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010'\u001a\u00020(H\u0003¢\u0006\u0002\u0010+\u001a!\u0010,\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010'\u001a\u00020(H\u0003¢\u0006\u0002\u0010-\u001a\r\u0010/\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00100\u001a\r\u00101\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00100\u001a\r\u00102\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00100\u001a\r\u00103\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00100\u001a\r\u00104\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00100\u001a\r\u00105\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00100\"\u000e\u0010.\u001a\u00020\u001eX\u0082T¢\u0006\u0002\n\u0000¨\u00066²\u0006\n\u00107\u001a\u000208X\u008a\u008e\u0002"}, m3636d2 = {"QuantityRow", "", "quantityText", "Landroidx/compose/ui/text/input/TextFieldValue;", "useSecondaryColor", "", "isEnabled", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "onFocusChanged", "Lkotlin/Function1;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "onDisabledClicked", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$DisabledClickSource;", "(Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", EquityAdvanceChartOrderDuxo5.PRICE_ROW, "orderFormContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "priceText", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;", "focusedText", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", EquityOrderFormRowState2.TimeInForceRowTestTag, "onShowTimeInForceSelector", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BuyingPowerEffectRow", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "buyingPowerEffect", "", "marginRequired", "Lcom/robinhood/utils/resource/StringResource;", "totalCommission", "regulatoryAndExchangeFees", "commissionAndFees", "totalGoldSavings", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/runtime/Composer;I)V", "FeesSubRow", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderFormFeesAndSavingsSubRow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderReceiptFeesSubRow", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EMPTY_VALUE_PLACEHOLDER", "PreviewBuyingPowerEffectRow_Loading", "(Landroidx/compose/runtime/Composer;I)V", "PreviewBuyingPowerEffectRow_NA", "PreviewBuyingPowerEffectRow_Loaded", "PreviewBuyingPowerEffectRow_WithGold", "PreviewBuyingPowerEffectRow_withAllFees_whileEditing", "PreviewBuyingPowerEffectRow_withAllFees_afterConfirmation", "feature-futures-trade_externalDebug", "goldSavingsLabelPositionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderFormRowsKt {
    private static final String EMPTY_VALUE_PLACEHOLDER = "-------";

    /* compiled from: OrderFormRows.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FuturesTimeInForce.values().length];
            try {
                iArr[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderForm6.values().length];
            try {
                iArr2[OrderForm6.REVIEWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderForm6.EDITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderForm6.CONFIRMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BuyingPowerEffectRow$lambda$39(OrderForm6 orderForm6, String str, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, int i, Composer composer, int i2) {
        BuyingPowerEffectRow(orderForm6, str, stringResource, stringResource2, stringResource3, stringResource4, stringResource5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeesSubRow$lambda$40(OrderForm6 orderForm6, String str, String str2, String str3, String str4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FeesSubRow(orderForm6, str, str2, str3, str4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormFeesAndSavingsSubRow$lambda$45(String str, String str2, String str3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormFeesAndSavingsSubRow(str, str2, str3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderReceiptFeesSubRow$lambda$47(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderReceiptFeesSubRow(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBuyingPowerEffectRow_Loaded$lambda$50(int i, Composer composer, int i2) {
        PreviewBuyingPowerEffectRow_Loaded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBuyingPowerEffectRow_Loading$lambda$48(int i, Composer composer, int i2) {
        PreviewBuyingPowerEffectRow_Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBuyingPowerEffectRow_NA$lambda$49(int i, Composer composer, int i2) {
        PreviewBuyingPowerEffectRow_NA(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBuyingPowerEffectRow_WithGold$lambda$51(int i, Composer composer, int i2) {
        PreviewBuyingPowerEffectRow_WithGold(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewBuyingPowerEffectRow_withAllFees_afterConfirmation$lambda$53 */
    public static final Unit m2029x502ef7ba(int i, Composer composer, int i2) {
        PreviewBuyingPowerEffectRow_withAllFees_afterConfirmation(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBuyingPowerEffectRow_withAllFees_whileEditing$lambda$52(int i, Composer composer, int i2) {
        PreviewBuyingPowerEffectRow_withAllFees_whileEditing(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceRow$lambda$23(FuturesOrderFormViewState.OrderFormContentData orderFormContentData, FuturesOrderFormViewState.TextDisplay textDisplay, FuturesOrderFormDataState.FocusedText focusedText, FocusRequester focusRequester, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        PriceRow(orderFormContentData, textDisplay, focusedText, focusRequester, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityRow$lambda$9(TextFieldValue textFieldValue, boolean z, boolean z2, FocusRequester focusRequester, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        QuantityRow(textFieldValue, z, z2, focusRequester, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceRow$lambda$28(FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        TimeInForceRow(orderFormContentData, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void QuantityRow(final TextFieldValue quantityText, final boolean z, final boolean z2, FocusRequester focusRequester, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, Composer composer, final int i) {
        int i2;
        long jM21425getFg0d7_KjU;
        FocusRequester focusRequester2 = focusRequester;
        Intrinsics.checkNotNullParameter(quantityText, "quantityText");
        Intrinsics.checkNotNullParameter(focusRequester2, "focusRequester");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1308359348);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(quantityText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1308359348, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.QuantityRow (OrderFormRows.kt:58)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = i2;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_quantity_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8190);
            Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null);
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-2134168267);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2134101834);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            composerStartRestartGroup.startReplaceGroup(-1454299251);
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.m5155defaultMinSizeVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM(), 0.0f, 2, null), focusRequester2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i3 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderFormRowsKt.QuantityRow$lambda$8$lambda$1$lambda$0(onFocusChanged, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
            if (!z2) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z4 = (i3 & 458752) == 131072;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderFormRowsKt.QuantityRow$lambda$8$lambda$4$lambda$3$lambda$2(onDisabledClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierOnFocusChanged = ClickableKt.m4893clickableXHw0xAI$default(modifierOnFocusChanged, false, null, null, (Function0) objRememberedValue2, 7, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderFormRowsKt.QuantityRow$lambda$8$lambda$6$lambda$5((TextFieldValue) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(quantityText, (Function1<? super TextFieldValue, Unit>) objRememberedValue3, modifierOnFocusChanged, z2, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, (i3 & 14) | 100663344 | ((i3 << 3) & 7168), 0, 48848);
            composerStartRestartGroup = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z5 = (i3 & 7168) == 2048;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == companion3.getEmpty()) {
                focusRequester2 = focusRequester;
                objRememberedValue4 = new OrderFormRowsKt$QuantityRow$1$4$1(focusRequester2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                focusRequester2 = focusRequester;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final FocusRequester focusRequester3 = focusRequester2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.QuantityRow$lambda$9(quantityText, z, z2, focusRequester3, onFocusChanged, onDisabledClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityRow$lambda$8$lambda$6$lambda$5(TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long BuyingPowerEffectRow$lambda$38$lambda$30(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityRow$lambda$8$lambda$1$lambda$0(Function1 function1, FocusState focus) {
        Intrinsics.checkNotNullParameter(focus, "focus");
        if (focus.getHasFocus()) {
            function1.invoke(FuturesOrderFormDataState.FocusedText.QUANTITY);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityRow$lambda$8$lambda$4$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(FuturesOrderFormDataState.DisabledClickSource.QUANTITY);
        return Unit.INSTANCE;
    }

    public static final void PriceRow(final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final FuturesOrderFormViewState.TextDisplay priceText, final FuturesOrderFormDataState.FocusedText focusedText, final FocusRequester focusRequester, final Function1<? super FuturesOrderFormDataState.FocusedText, Unit> onFocusChanged, final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, Composer composer, final int i) {
        int i2;
        final SnapshotState snapshotState;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-699656300);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(priceText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(focusedText == null ? -1 : focusedText.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFocusChanged) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-699656300, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.PriceRow (OrderFormRows.kt:113)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState4.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i3);
                        snapshotState3.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                snapshotState = snapshotState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState2 = snapshotState3;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                snapshotState = snapshotState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState2 = snapshotState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState2.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    boolean z;
                    ConstraintLayoutScope constraintLayoutScope2;
                    BentoTheme bentoTheme;
                    int i5;
                    Modifier.Companion companion2;
                    OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$5 orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$5;
                    long jM21425getFg0d7_KjU;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                    composer3.startReplaceGroup(428434804);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                    boolean z2 = (orderFormContentData.getBidDisplay() == null || orderFormContentData.getAskDisplay() == null) ? false : true;
                    String strStringResource = StringResources_androidKt.stringResource(orderFormContentData.getPriceLabelRes(), composer3, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme2.getTypography(composer3, i6).getTextM();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChanged = composer3.changed(z2) | composer3.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new OrderFormRowsKt$PriceRow$1$1$1(z2, constraintLayoutBaseScope4Component2);
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    composer3.endReplaceGroup();
                    boolean z3 = z2;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope3.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8188);
                    composer3.startReplaceGroup(1676403147);
                    if (z3) {
                        String strStringResource2 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_bid_label, composer3, 0);
                        TextStyle textM2 = bentoTheme2.getTypography(composer3, i6).getTextM();
                        long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU();
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component1);
                        Object objRememberedValue10 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new OrderFormRowsKt$PriceRow$1$2$1(constraintLayoutBaseScope4Component1);
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(strStringResource2, constraintLayoutScope3.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer3, 0, 0, 8184);
                        String bidDisplay = orderFormContentData.getBidDisplay();
                        TextStyle textM3 = bentoTheme2.getTypography(composer3, i6).getTextM();
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21425getFg0d7_KjU();
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue11 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new OrderFormRowsKt$PriceRow$1$3$1(constraintLayoutBaseScope4Component2);
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(bidDisplay, constraintLayoutScope3.constrainAs(modifierM5144paddingVpY3zN4$default2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM3, composer3, 0, 0, 8184);
                        String strStringResource3 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_ask_label, composer3, 0);
                        TextStyle textM4 = bentoTheme2.getTypography(composer3, i6).getTextM();
                        long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU();
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component2) | composer3.changed(constraintLayoutBaseScope4Component3);
                        Object objRememberedValue12 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new OrderFormRowsKt$PriceRow$1$4$1(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        composer3.endReplaceGroup();
                        z = false;
                        BentoText2.m20747BentoText38GnDrw(strStringResource3, constraintLayoutScope3.constrainAs(companion3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM4, composer3, 0, 0, 8184);
                        String askDisplay = orderFormContentData.getAskDisplay();
                        TextStyle textM5 = bentoTheme2.getTypography(composer3, i6).getTextM();
                        long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composer3, i6).m21425getFg0d7_KjU();
                        Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component2) | composer3.changed(constraintLayoutBaseScope4Component4);
                        Object objRememberedValue13 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new OrderFormRowsKt$PriceRow$1$5$1(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component4);
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        composer3.endReplaceGroup();
                        bentoTheme = bentoTheme2;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        i5 = i6;
                        companion2 = companion3;
                        orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$5 = this;
                        BentoText2.m20747BentoText38GnDrw(askDisplay, constraintLayoutScope3.constrainAs(modifierM5144paddingVpY3zN4$default3, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue13), Color.m6701boximpl(jM21425getFg0d7_KjU3), null, null, null, null, 0, false, 0, 0, null, 0, textM5, composer3, 0, 0, 8184);
                    } else {
                        z = false;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        bentoTheme = bentoTheme2;
                        i5 = i6;
                        companion2 = companion3;
                        orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$5 = this;
                    }
                    composer3.endReplaceGroup();
                    TextFieldValue text = priceText.getText();
                    BentoTheme bentoTheme3 = bentoTheme;
                    int i7 = i5;
                    SolidColor solidColor = new SolidColor(bentoTheme3.getColors(composer3, i7).m21425getFg0d7_KjU(), null);
                    boolean z4 = (focusedText == null || !orderFormContentData.isEnabled()) ? z : true;
                    TextStyle textM6 = bentoTheme3.getTypography(composer3, i7).getTextM();
                    if (priceText.getUseSecondaryColor()) {
                        composer3.startReplaceGroup(430939944);
                        jM21425getFg0d7_KjU = bentoTheme3.getColors(composer3, i7).m21427getFg30d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(431006377);
                        jM21425getFg0d7_KjU = bentoTheme3.getColors(composer3, i7).m21425getFg0d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM6, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
                    composer3.startReplaceGroup(1676498595);
                    composer3.startReplaceGroup(1676483462);
                    Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion2, bentoTheme3.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), 0.0f, 2, null);
                    FocusRequester focusRequester2 = focusRequester;
                    if (focusRequester2 != null ? true : z) {
                        if (focusRequester2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        modifierM5155defaultMinSizeVpY3zN4$default = FocusRequesterModifier3.focusRequester(modifierM5155defaultMinSizeVpY3zN4$default, focusRequester2);
                    }
                    if (focusedText != null ? true : z) {
                        composer3.startReplaceGroup(-1633490746);
                        FuturesOrderFormDataState.FocusedText focusedText2 = focusedText;
                        boolean zChanged6 = composer3.changed(focusedText2 == null ? -1 : focusedText2.ordinal()) | composer3.changed(onFocusChanged);
                        Object objRememberedValue14 = composer3.rememberedValue();
                        if (zChanged6 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new OrderFormRowsKt$PriceRow$1$7$1$1(focusedText, onFocusChanged);
                            composer3.updateRememberedValue(objRememberedValue14);
                        }
                        composer3.endReplaceGroup();
                        modifierM5155defaultMinSizeVpY3zN4$default = FocusChangedModifier2.onFocusChanged(modifierM5155defaultMinSizeVpY3zN4$default, (Function1) objRememberedValue14);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue15 = composer3.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue15 == companion4.getEmpty()) {
                        objRememberedValue15 = OrderFormRowsKt$PriceRow$1$8$1.INSTANCE;
                        composer3.updateRememberedValue(objRememberedValue15);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5155defaultMinSizeVpY3zN4$default, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue15);
                    if ((focusedText == null || orderFormContentData.isEnabled()) ? z : true) {
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged7 = composer3.changed(onDisabledClicked);
                        Object objRememberedValue16 = composer3.rememberedValue();
                        if (zChanged7 || objRememberedValue16 == companion4.getEmpty()) {
                            objRememberedValue16 = new OrderFormRowsKt$PriceRow$1$9$1$1(onDisabledClicked);
                            composer3.updateRememberedValue(objRememberedValue16);
                        }
                        composer3.endReplaceGroup();
                        modifierConstrainAs = ClickableKt.m4893clickableXHw0xAI$default(modifierConstrainAs, false, null, null, (Function0) objRememberedValue16, 7, null);
                    }
                    Modifier modifier = modifierConstrainAs;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue17 = composer3.rememberedValue();
                    if (objRememberedValue17 == companion4.getEmpty()) {
                        objRememberedValue17 = OrderFormRowsKt$PriceRow$1$10$1.INSTANCE;
                        composer3.updateRememberedValue(objRememberedValue17);
                    }
                    composer3.endReplaceGroup();
                    BasicTextFieldKt.BasicTextField(text, (Function1<? super TextFieldValue, Unit>) objRememberedValue17, modifier, z4, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer3, 100663344, 0, 48848);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.PriceRow$lambda$23(orderFormContentData, priceText, focusedText, focusRequester, onFocusChanged, onDisabledClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TimeInForceRow(final FuturesOrderFormViewState.OrderFormContentData orderFormContentData, final Function0<Unit> onShowTimeInForceSelector, final Function1<? super FuturesOrderFormDataState.DisabledClickSource, Unit> onDisabledClicked, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(onShowTimeInForceSelector, "onShowTimeInForceSelector");
        Intrinsics.checkNotNullParameter(onDisabledClicked, "onDisabledClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1826011896);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(orderFormContentData) : composerStartRestartGroup.changedInstance(orderFormContentData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowTimeInForceSelector) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDisabledClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826011896, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.TimeInForceRow (OrderFormRows.kt:222)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_trade_time_in_force_label, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int i5 = i2;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8190);
            Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Alignment.Vertical centerVertically2 = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z = ((i5 & 112) == 32) | ((i5 & 14) == 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(orderFormContentData))) | ((i5 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderFormRowsKt.TimeInForceRow$lambda$27$lambda$25$lambda$24(orderFormContentData, onShowTimeInForceSelector, onDisabledClicked);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            int i6 = WhenMappings.$EnumSwitchMapping$0[orderFormContentData.getTimeInForce().ordinal()];
            if (i6 == 1) {
                i3 = C32428R.string.order_time_in_force_gfd;
            } else if (i6 == 2) {
                i3 = C32428R.string.order_time_in_force_gtc_no_limit;
            } else if (i6 == 3) {
                i3 = C32428R.string.order_time_in_force_ioc;
            } else if (i6 == 4) {
                i3 = C32428R.string.order_time_in_force_gtd;
            } else {
                if (i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C32428R.string.order_time_in_force_fok;
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8190);
            composerStartRestartGroup.startReplaceGroup(1420073);
            if (orderFormContentData.isEnabled()) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.TimeInForceRow$lambda$28(orderFormContentData, onShowTimeInForceSelector, onDisabledClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceRow$lambda$27$lambda$25$lambda$24(FuturesOrderFormViewState.OrderFormContentData orderFormContentData, Function0 function0, Function1 function1) {
        if (orderFormContentData.isEnabled()) {
            function0.invoke();
        } else {
            function1.invoke(FuturesOrderFormDataState.DisabledClickSource.TIME_IN_FORCE);
        }
        return Unit.INSTANCE;
    }

    public static final void BuyingPowerEffectRow(final OrderForm6 orderFormState, final String str, final StringResource stringResource, final StringResource stringResource2, final StringResource stringResource3, final StringResource stringResource4, final StringResource stringResource5, Composer composer, final int i) {
        int i2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState;
        Composer composer2;
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-665441204);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(orderFormState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(stringResource3) : composerStartRestartGroup.changedInstance(stringResource3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(stringResource4) : composerStartRestartGroup.changedInstance(stringResource4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(stringResource5) : composerStartRestartGroup.changedInstance(stringResource5) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-665441204, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.BuyingPowerEffectRow (OrderFormRows.kt:277)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i3);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState = snapshotState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    ConstraintLayoutScope constraintLayoutScope2;
                    Modifier.Companion companion2;
                    BentoTheme bentoTheme;
                    int i5;
                    Composer composer4 = composer3;
                    if ((i4 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState3.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                    composer4.startReplaceGroup(1363647725);
                    composer4.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composer4.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion3.getEmpty()) {
                        objRememberedValue9 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                        composer4.updateRememberedValue(objRememberedValue9);
                    }
                    SnapshotState snapshotState4 = (SnapshotState) objRememberedValue9;
                    composer4.endReplaceGroup();
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                    String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_est_buying_power_effect_label, composer4, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme2.getTypography(composer4, i6).getTextM();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    composer4.startReplaceGroup(5004770);
                    boolean zChanged = composer4.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue10 = composer4.rememberedValue();
                    if (zChanged || objRememberedValue10 == companion3.getEmpty()) {
                        objRememberedValue10 = new OrderFormRowsKt$BuyingPowerEffectRow$1$1$1(constraintLayoutBaseScope4Component2);
                        composer4.updateRememberedValue(objRememberedValue10);
                    }
                    composer4.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope3.constrainAs(companion4, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer4, 0, 0, 8188);
                    composer4.startReplaceGroup(1983666700);
                    StringResource stringResource6 = stringResource4;
                    String text = stringResource6 == null ? null : StringResources4.getText(stringResource6, composer4, StringResource.$stable);
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(1983669932);
                    StringResource stringResource7 = stringResource;
                    String text2 = stringResource7 == null ? null : StringResources4.getText(stringResource7, composer4, StringResource.$stable);
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(1983671788);
                    StringResource stringResource8 = stringResource2;
                    String text3 = stringResource8 == null ? null : StringResources4.getText(stringResource8, composer4, StringResource.$stable);
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(1983674284);
                    StringResource stringResource9 = stringResource3;
                    String text4 = stringResource9 == null ? null : StringResources4.getText(stringResource9, composer4, StringResource.$stable);
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(5004770);
                    boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component1);
                    Object objRememberedValue11 = composer4.rememberedValue();
                    if (zChanged2 || objRememberedValue11 == companion3.getEmpty()) {
                        objRememberedValue11 = new OrderFormRowsKt$BuyingPowerEffectRow$1$2$1(constraintLayoutBaseScope4Component1);
                        composer4.updateRememberedValue(objRememberedValue11);
                    }
                    composer4.endReplaceGroup();
                    OrderFormRowsKt.FeesSubRow(orderFormState, text2, text3, text, text4, constraintLayoutScope3.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), composer4, 0, 0);
                    composer4.startReplaceGroup(1983679976);
                    StringResource stringResource10 = stringResource5;
                    if (stringResource10 != null) {
                        String text5 = StringResources4.getText(stringResource10, composer4, StringResource.$stable);
                        TextStyle textStylePlus = bentoTheme2.getTypography(composer4, i6).getTextS().plus(new TextStyle(GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, OrderFormRowsKt.BuyingPowerEffectRow$lambda$38$lambda$30(snapshotState4), null, composer4, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null));
                        composer4.startReplaceGroup(5004770);
                        boolean zChanged3 = composer4.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue12 = composer4.rememberedValue();
                        if (zChanged3 || objRememberedValue12 == companion3.getEmpty()) {
                            objRememberedValue12 = new OrderFormRowsKt$BuyingPowerEffectRow$1$3$1$1(constraintLayoutBaseScope4Component2);
                            composer4.updateRememberedValue(objRememberedValue12);
                        }
                        composer4.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12);
                        composer4.startReplaceGroup(5004770);
                        Object objRememberedValue13 = composer4.rememberedValue();
                        if (objRememberedValue13 == companion3.getEmpty()) {
                            objRememberedValue13 = new OrderFormRowsKt$BuyingPowerEffectRow$1$3$2$1(snapshotState4);
                            composer4.updateRememberedValue(objRememberedValue13);
                        }
                        composer4.endReplaceGroup();
                        composer4 = composer3;
                        companion2 = companion4;
                        bentoTheme = bentoTheme2;
                        i5 = i6;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        BentoText2.m20747BentoText38GnDrw(text5, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue13), null, null, null, null, null, 0, false, 0, 0, null, 0, textStylePlus, composer4, 0, 0, 8188);
                    } else {
                        constraintLayoutScope2 = constraintLayoutScope3;
                        companion2 = companion4;
                        bentoTheme = bentoTheme2;
                        i5 = i6;
                    }
                    composer4.endReplaceGroup();
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "-------";
                    }
                    TextStyle textM2 = bentoTheme.getTypography(composer4, i5).getTextM();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    composer4.startReplaceGroup(1849434622);
                    Object objRememberedValue14 = composer4.rememberedValue();
                    if (objRememberedValue14 == companion3.getEmpty()) {
                        objRememberedValue14 = OrderFormRowsKt$BuyingPowerEffectRow$1$4$1.INSTANCE;
                        composer4.updateRememberedValue(objRememberedValue14);
                    }
                    composer4.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(str2, ModifiersKt.bentoPlaceholder$default(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue14), str == null, null, 2, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, textM2, composer4, 24576, 0, 8172);
                    composer4.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer4, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.BuyingPowerEffectRow$lambda$39(orderFormState, str, stringResource, stringResource2, stringResource3, stringResource4, stringResource5, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BuyingPowerEffectRow$lambda$38$lambda$31(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FeesSubRow(final OrderForm6 orderForm6, final String str, final String str2, final String str3, final String str4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str5;
        String str6;
        String str7;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-883231402);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(orderForm6.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str5 = str;
        } else {
            str5 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str6 = str2;
        } else {
            str6 = str2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str6) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            str7 = str4;
        } else {
            str7 = str4;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(str7) ? 16384 : 8192;
            }
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-883231402, i3, -1, "com.robinhood.android.futures.trade.ui.orderform.FeesSubRow (OrderFormRows.kt:346)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$1[orderForm6.ordinal()];
                if (i4 != 1 || i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1376705768);
                    int i6 = (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                    int i7 = i3 >> 6;
                    OrderFormFeesAndSavingsSubRow(str5, str6, str7, modifier3, composerStartRestartGroup, i6 | (i7 & 896) | (i7 & 7168), 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 3) {
                    composerStartRestartGroup.startReplaceGroup(-1376395117);
                    OrderReceiptFeesSubRow(str3, modifier3, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 12) & 112), 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1376227872);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormRowsKt.FeesSubRow$lambda$40(orderForm6, str, str2, str3, str4, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$1[orderForm6.ordinal()];
            if (i4 != 1) {
                composerStartRestartGroup.startReplaceGroup(-1376705768);
                int i62 = (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                int i72 = i3 >> 6;
                OrderFormFeesAndSavingsSubRow(str5, str6, str7, modifier3, composerStartRestartGroup, i62 | (i72 & 896) | (i72 & 7168), 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OrderFormFeesAndSavingsSubRow(final String str, final String str2, final String str3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119561508);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119561508, i3, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderFormFeesAndSavingsSubRow (OrderFormRows.kt:376)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String currency = str != null ? Moneys.formatCurrency(FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE)) : str;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(currency, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_margin_requirement, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(str2 != null ? Moneys.formatCurrency(FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE)) : str2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_total_commission, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str3 != null ? Moneys.formatCurrency(FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE)) : str3, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_regulatory_and_exchange_fees, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8186);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormRowsKt.OrderFormFeesAndSavingsSubRow$lambda$45(str, str2, str3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy4, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    if (str != null) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(currency, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_margin_requirement, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup.endNode();
                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        if (str2 != null) {
                        }
                        BentoText2.m20747BentoText38GnDrw(str2 != null ? Moneys.formatCurrency(FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE)) : str2, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_total_commission, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                        composerStartRestartGroup.endNode();
                        MeasurePolicy measurePolicyRowMeasurePolicy32 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                        Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy32, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting()) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                            if (str3 != null) {
                            }
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(str3 != null ? Moneys.formatCurrency(FuturesOrderFormDuxoKt.getZERO(MoneyDto.INSTANCE)) : str3, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 0, 0, 8186);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_regulatory_and_exchange_fees, composer2, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, 0, 0, 8186);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OrderReceiptFeesSubRow(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1605046894);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1605046894, i3, -1, "com.robinhood.android.futures.trade.ui.orderform.OrderReceiptFeesSubRow (OrderFormRows.kt:427)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, str != null, null, 2, null);
                String str2 = str != null ? EMPTY_VALUE_PLACEHOLDER : str;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_commission_and_fees, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormRowsKt.OrderReceiptFeesSubRow$lambda$47(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, str != null, null, 2, null);
                if (str != null) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 0, 0, 8184);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_order_form_commission_and_fees, composer2, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, 0, 0, 8186);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PreviewBuyingPowerEffectRow_Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-629186538);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-629186538, i, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_Loading (OrderFormRows.kt:449)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$OrderFormRowsKt.INSTANCE.getLambda$1709260126$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.PreviewBuyingPowerEffectRow_Loading$lambda$48(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBuyingPowerEffectRow_NA(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1355851659);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355851659, i, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_NA (OrderFormRows.kt:465)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(C41827R.string.general_label_n_a, composerStartRestartGroup, 0);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2069515821, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt.PreviewBuyingPowerEffectRow_NA.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2069515821, i2, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_NA.<anonymous> (OrderFormRows.kt:468)");
                    }
                    OrderFormRowsKt.BuyingPowerEffectRow(OrderForm6.EDITING, strStringResource, null, null, null, StringResource.INSTANCE.invoke(strStringResource), null, composer2, (StringResource.$stable << 15) | 1600902);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.PreviewBuyingPowerEffectRow_NA$lambda$49(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBuyingPowerEffectRow_Loaded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1456542403);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456542403, i, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_Loaded (OrderFormRows.kt:482)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$OrderFormRowsKt.INSTANCE.m14910getLambda$2070254469$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.PreviewBuyingPowerEffectRow_Loaded$lambda$50(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBuyingPowerEffectRow_WithGold(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1250633758);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1250633758, i, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_WithGold (OrderFormRows.kt:498)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$OrderFormRowsKt.INSTANCE.m14909getLambda$1773231206$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.PreviewBuyingPowerEffectRow_WithGold$lambda$51(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBuyingPowerEffectRow_withAllFees_whileEditing(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(406205066);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(406205066, i, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_withAllFees_whileEditing (OrderFormRows.kt:517)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$OrderFormRowsKt.INSTANCE.m14911getLambda$734949822$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.PreviewBuyingPowerEffectRow_withAllFees_whileEditing$lambda$52(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBuyingPowerEffectRow_withAllFees_afterConfirmation(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1435540536);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1435540536, i, -1, "com.robinhood.android.futures.trade.ui.orderform.PreviewBuyingPowerEffectRow_withAllFees_afterConfirmation (OrderFormRows.kt:536)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$OrderFormRowsKt.INSTANCE.getLambda$1634849664$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormRowsKt.m2029x502ef7ba(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
