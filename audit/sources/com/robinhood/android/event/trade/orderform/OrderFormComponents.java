package com.robinhood.android.event.trade.orderform;

import androidx.compose.animation.AnimationModifier;
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
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.event.trade.orderform.OrderFormComponents;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.futures.sharedfuturesui.TransparentSelectionColors2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OrderFormComponents.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aO\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aM\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0014\u001a;\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010!\u001a\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010%\u001a\u001f\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020'2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010(\u001a\u001f\u0010)\u001a\u00020\u00032\u0006\u0010#\u001a\u00020*2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010+\u001a5\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u00101\u001a5\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u00106\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"EMPTY_VALUE_PLACEHOLDER", "", "QuantityRow", "", "quantityText", "Landroidx/compose/ui/text/input/TextFieldValue;", "quantitySubtitle", "Lcom/robinhood/utils/resource/StringResource;", "isQuantityEnabled", "", "quantityUseSecondaryColor", "isFocused", "onFocused", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lcom/robinhood/utils/resource/StringResource;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "QuantityInput", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TextFieldValue;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CostOrCreditRow", "feesDisplay", "showFees", "estimatedCostOrCreditLabel", "estimatedCostOrCredit", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FilledQuantityRow", "filledQuantity", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TotalCostRow", "totalCost", "amountReturned", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PayoutRow", "payoutData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReceiptPayoutRow", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$Receipt;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$Receipt;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderFormPayoutRow", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$OrderForm;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$OrderForm;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", EquityOrderFormRowState2.TimeInForceRowTestTag, "timeInForceDisplay", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "canEdit", "onChangeTimeInForce", "(Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderSummarySection", ErrorBundle.SUMMARY_ENTRY, "showPriceInfoButton", "onPriceInfoClick", "(Lcom/robinhood/utils/resource/StringResource;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderFormComponents {
    public static final String EMPTY_VALUE_PLACEHOLDER = "       ";

    /* compiled from: OrderFormComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderFormTimeInForce.values().length];
            try {
                iArr[OrderFormTimeInForce.IOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFormTimeInForce.UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderFormTimeInForce.GTD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderFormTimeInForce.FOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CostOrCreditRow$lambda$8(StringResource stringResource, boolean z, StringResource stringResource2, StringResource stringResource3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CostOrCreditRow(stringResource, z, stringResource2, stringResource3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledQuantityRow$lambda$9(StringResource stringResource, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FilledQuantityRow(stringResource, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormPayoutRow$lambda$16(EventOrderFormViewState.PayoutData.OrderForm orderForm, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormPayoutRow(orderForm, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderSummarySection$lambda$24(StringResource stringResource, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderSummarySection(stringResource, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PayoutRow$lambda$11(EventOrderFormViewState.PayoutData payoutData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PayoutRow(payoutData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityInput$lambda$5(TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, Function0 function0, FocusRequester focusRequester, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuantityInput(textFieldValue, z, z2, z3, function0, focusRequester, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityRow$lambda$4(TextFieldValue textFieldValue, StringResource stringResource, boolean z, boolean z2, boolean z3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuantityRow(textFieldValue, stringResource, z, z2, z3, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiptPayoutRow$lambda$13(EventOrderFormViewState.PayoutData.Receipt receipt, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReceiptPayoutRow(receipt, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceRow$lambda$21(OrderFormTimeInForce orderFormTimeInForce, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimeInForceRow(orderFormTimeInForce, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TotalCostRow$lambda$10(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TotalCostRow(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuantityRow(final TextFieldValue quantityText, final StringResource stringResource, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onFocused, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(quantityText, "quantityText");
        Intrinsics.checkNotNullParameter(onFocused, "onFocused");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1047084181);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(quantityText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z5 = z2;
                    i3 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z6 = z3;
                        i3 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onFocused) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 != 0) {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                        } else {
                            Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1047084181, i3, -1, "com.robinhood.android.event.trade.orderform.QuantityRow (OrderFormComponents.kt:65)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                            int i6 = i3;
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16465R.string.events_order_form_quantity_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                            composerStartRestartGroup.startReplaceGroup(-295899156);
                            if (stringResource != null) {
                                BentoText2.m20747BentoText38GnDrw(EventOrderFormScreen3.getText(stringResource, composerStartRestartGroup, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            int i7 = i6 >> 3;
                            modifier2 = modifier3;
                            QuantityInput(quantityText, z4, z5, z6, onFocused, focusRequester, null, composerStartRestartGroup, (i6 & 14) | 196608 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 64);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return OrderFormComponents.QuantityRow$lambda$4(quantityText, stringResource, z, z2, z3, onFocused, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    modifier2 = modifier;
                    if ((599187 & i3) == 599186) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            Modifier modifierWeight$default2 = Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            int i62 = i3;
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16465R.string.events_order_form_quantity_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                                composerStartRestartGroup.startReplaceGroup(-295899156);
                                if (stringResource != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                int i72 = i62 >> 3;
                                modifier2 = modifier3;
                                QuantityInput(quantityText, z4, z5, z6, onFocused, focusRequester2, null, composerStartRestartGroup, (i62 & 14) | 196608 | (i72 & 112) | (i72 & 896) | (i72 & 7168) | (i72 & 57344), 64);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z3;
                if ((i2 & 32) == 0) {
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z2;
            if ((i2 & 16) != 0) {
            }
            z6 = z3;
            if ((i2 & 32) == 0) {
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z;
        if ((i2 & 8) == 0) {
        }
        z5 = z2;
        if ((i2 & 16) != 0) {
        }
        z6 = z3;
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: OrderFormComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$QuantityInput$1 */
    static final class C164921 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $isFocused;
        final /* synthetic */ boolean $isQuantityEnabled;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onFocused;
        final /* synthetic */ TextFieldValue $quantityText;
        final /* synthetic */ boolean $quantityUseSecondaryColor;

        C164921(boolean z, Modifier modifier, FocusRequester focusRequester, Function0<Unit> function0, TextFieldValue textFieldValue, boolean z2, boolean z3) {
            this.$quantityUseSecondaryColor = z;
            this.$modifier = modifier;
            this.$focusRequester = focusRequester;
            this.$onFocused = function0;
            this.$quantityText = textFieldValue;
            this.$isQuantityEnabled = z2;
            this.$isFocused = z3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, FocusState focusState) {
            Intrinsics.checkNotNullParameter(focusState, "focusState");
            if (focusState.isFocused()) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            long jM21425getFg0d7_KjU;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191569513, i, -1, "com.robinhood.android.event.trade.orderform.QuantityInput.<anonymous> (OrderFormComponents.kt:113)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            if (this.$quantityUseSecondaryColor) {
                composer.startReplaceGroup(-142324146);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-142257713);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.m5155defaultMinSizeVpY3zN4$default(this.$modifier, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 2, null), this.$focusRequester);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onFocused);
            final Function0<Unit> function0 = this.$onFocused;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$QuantityInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderFormComponents.C164921.invoke$lambda$1$lambda$0(function0, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
            TextFieldValue textFieldValue = this.$quantityText;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$QuantityInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderFormComponents.C164921.invoke$lambda$3$lambda$2((TextFieldValue) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue2, modifierOnFocusChanged, this.$isQuantityEnabled, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer, 100663344, 0, 48848);
            Boolean boolValueOf = Boolean.valueOf(this.$isFocused);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(this.$isFocused) | composer.changed(this.$focusRequester);
            boolean z = this.$isFocused;
            FocusRequester focusRequester = this.$focusRequester;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OrderFormComponents3(z, focusRequester, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void QuantityInput(final TextFieldValue textFieldValue, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, final FocusRequester focusRequester, Modifier modifier, Composer composer, final int i, final int i2) {
        TextFieldValue textFieldValue2;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        Function0<Unit> function02;
        FocusRequester focusRequester2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1789264672);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            textFieldValue2 = textFieldValue;
        } else {
            textFieldValue2 = textFieldValue;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(textFieldValue2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            focusRequester2 = focusRequester;
        } else {
            focusRequester2 = focusRequester;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 131072 : 65536;
            }
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1789264672, i3, -1, "com.robinhood.android.event.trade.orderform.QuantityInput (OrderFormComponents.kt:111)");
                }
                TransparentSelectionColors2.TransparentSelectionColors(ComposableLambda3.rememberComposableLambda(-1191569513, true, new C164921(z5, modifier4, focusRequester2, function02, textFieldValue2, z4, z6), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.QuantityInput$lambda$5(textFieldValue, z, z2, z3, function0, focusRequester, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            TransparentSelectionColors2.TransparentSelectionColors(ComposableLambda3.rememberComposableLambda(-1191569513, true, new C164921(z5, modifier4, focusRequester2, function02, textFieldValue2, z4, z6), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CostOrCreditRow(final StringResource stringResource, final boolean z, final StringResource estimatedCostOrCreditLabel, final StringResource stringResource2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String text;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(estimatedCostOrCreditLabel, "estimatedCostOrCreditLabel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-806590293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(estimatedCostOrCreditLabel) : composerStartRestartGroup.changedInstance(estimatedCostOrCreditLabel) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-806590293, i3, -1, "com.robinhood.android.event.trade.orderform.CostOrCreditRow (OrderFormComponents.kt:152)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i5 = StringResource.$stable;
                String text2 = EventOrderFormScreen3.getText(estimatedCostOrCreditLabel, composerStartRestartGroup, i5 | ((i3 >> 6) & 14));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                int i7 = i3;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(text2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                Composer composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(495951982);
                if (z) {
                    composer3.startReplaceGroup(495954298);
                    String text3 = stringResource == null ? null : EventOrderFormScreen3.getText(stringResource, composer3, i5 | (i7 & 14));
                    composer3.endReplaceGroup();
                    if (text3 == null) {
                        text3 = EMPTY_VALUE_PLACEHOLDER;
                    }
                    BentoText2.m20747BentoText38GnDrw(text3, ModifiersKt.bentoPlaceholder$default(companion3, stringResource == null, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8184);
                    composer3 = composer3;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.startReplaceGroup(626260144);
                text = stringResource2 != null ? null : EventOrderFormScreen3.getText(stringResource2, composer3, i5 | ((i7 >> 9) & 14));
                composer3.endReplaceGroup();
                if (text == null) {
                    text = EMPTY_VALUE_PLACEHOLDER;
                }
                composer2 = composer3;
                BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(SizeKt.m5173sizeInqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(50), 0.0f, 0.0f, 0.0f, 14, null), stringResource2 != null, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer2, 24576, 0, 8108);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.CostOrCreditRow$lambda$8(stringResource, z, estimatedCostOrCreditLabel, stringResource2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierWeight$default2 = Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    int i52 = StringResource.$stable;
                    String text22 = EventOrderFormScreen3.getText(estimatedCostOrCreditLabel, composerStartRestartGroup, i52 | ((i3 >> 6) & 14));
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    int i72 = i3;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(text22, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                    Composer composer32 = composerStartRestartGroup;
                    composer32.startReplaceGroup(495951982);
                    if (z) {
                    }
                    composer32.endReplaceGroup();
                    composer32.endNode();
                    composer32.startReplaceGroup(626260144);
                    if (stringResource2 != null) {
                    }
                    composer32.endReplaceGroup();
                    if (text == null) {
                    }
                    composer2 = composer32;
                    BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(SizeKt.m5173sizeInqDBjuR0$default(companion32, C2002Dp.m7995constructorimpl(50), 0.0f, 0.0f, 0.0f, 14, null), stringResource2 != null, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer32, i62).getTextM(), composer2, 24576, 0, 8108);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledQuantityRow(final StringResource stringResource, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String textAsString;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(266047891);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(266047891, i3, -1, "com.robinhood.android.event.trade.orderform.FilledQuantityRow (OrderFormComponents.kt:195)");
                }
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C16465R.string.events_order_form_receipt_filled_quantity_label, composerStartRestartGroup, 0), null, 2, null);
                Color colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU());
                composerStartRestartGroup.startReplaceGroup(-2026001692);
                textAsString = stringResource != null ? null : StringResources6.getTextAsString(stringResource, composerStartRestartGroup, StringResource.$stable | (i3 & 14));
                composerStartRestartGroup.endReplaceGroup();
                if (textAsString == null) {
                    textAsString = PlaceholderUtils.getShortPlaceholderText();
                }
                modifier3 = modifier4;
                BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString, colorM6701boximpl, null, null, new AnnotatedString(textAsString, null, 2, null), null, null, null, null, false, stringResource == null, 2009, null), modifier3, null, null, null, composerStartRestartGroup, BentoDataRowState.$stable | (i3 & 112), 28);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.FilledQuantityRow$lambda$9(stringResource, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C16465R.string.events_order_form_receipt_filled_quantity_label, composerStartRestartGroup, 0), null, 2, null);
            Color colorM6701boximpl2 = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU());
            composerStartRestartGroup.startReplaceGroup(-2026001692);
            if (stringResource != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (textAsString == null) {
            }
            modifier3 = modifier4;
            BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString2, colorM6701boximpl2, null, null, new AnnotatedString(textAsString, null, 2, null), null, null, null, null, false, stringResource == null, 2009, null), modifier3, null, null, null, composerStartRestartGroup, BentoDataRowState.$stable | (i3 & 112), 28);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TotalCostRow(final String totalCost, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(totalCost, "totalCost");
        Composer composerStartRestartGroup = composer.startRestartGroup(-472759034);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(totalCost) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-472759034, i3, -1, "com.robinhood.android.event.trade.orderform.TotalCostRow (OrderFormComponents.kt:212)");
                }
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(-766442724);
                    modifier3 = modifier5;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifier3, new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C16465R.string.event_order_form_receipt_cost_label, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C16465R.string.event_order_form_receipt_amount_returned_label, composerStartRestartGroup, 0), (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.TwoLine(totalCost, str), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer2, ((i3 >> 6) & 14) | (BentoBaseRowState.$stable << 3), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-765964673);
                    BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C16465R.string.event_order_form_receipt_cost_label, composer2, 0), null, 2, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), null, null, new AnnotatedString(totalCost, null, 2, null), null, null, null, null, false, false, 4057, null), modifier5, null, null, null, composer2, BentoDataRowState.$stable | ((i3 >> 3) & 112), 28);
                    modifier3 = modifier5;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.TotalCostRow$lambda$10(totalCost, str, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (str == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PayoutRow(final EventOrderFormViewState.PayoutData payoutData, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(payoutData, "payoutData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1291803491);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(payoutData) : composerStartRestartGroup.changedInstance(payoutData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291803491, i3, -1, "com.robinhood.android.event.trade.orderform.PayoutRow (OrderFormComponents.kt:241)");
            }
            if (payoutData instanceof EventOrderFormViewState.PayoutData.OrderForm) {
                composerStartRestartGroup.startReplaceGroup(-177599163);
                OrderFormPayoutRow((EventOrderFormViewState.PayoutData.OrderForm) payoutData, modifier, composerStartRestartGroup, (i3 & 112) | StringResource.$stable, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(payoutData instanceof EventOrderFormViewState.PayoutData.Receipt)) {
                    composerStartRestartGroup.startReplaceGroup(-177601869);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-177595613);
                ReceiptPayoutRow((EventOrderFormViewState.PayoutData.Receipt) payoutData, modifier, composerStartRestartGroup, (i3 & 112) | StringResource.$stable, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormComponents.PayoutRow$lambda$11(payoutData, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReceiptPayoutRow(final EventOrderFormViewState.PayoutData.Receipt receipt, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String text;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1868548517);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(receipt) : composerStartRestartGroup.changedInstance(receipt) ? 4 : 2);
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
                    ComposerKt.traceEventStart(1868548517, i3, -1, "com.robinhood.android.event.trade.orderform.ReceiptPayoutRow (OrderFormComponents.kt:255)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                StringResource payoutLabel = receipt.getPayoutLabel();
                int i5 = StringResource.$stable;
                String text2 = EventOrderFormScreen3.getText(payoutLabel, composerStartRestartGroup, i5);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text2, Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8188);
                StringResource payout = receipt.getPayout();
                composerStartRestartGroup.startReplaceGroup(-523106294);
                text = payout != null ? null : EventOrderFormScreen3.getText(payout, composerStartRestartGroup, i5);
                composerStartRestartGroup.endReplaceGroup();
                if (text == null) {
                    text = EMPTY_VALUE_PLACEHOLDER;
                }
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(companion2, receipt.getPayout() != null, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 24576, 0, 8172);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.ReceiptPayoutRow$lambda$13(receipt, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                StringResource payoutLabel2 = receipt.getPayoutLabel();
                int i52 = StringResource.$stable;
                String text22 = EventOrderFormScreen3.getText(payoutLabel2, composerStartRestartGroup, i52);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text22, Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion22, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 0, 0, 8188);
                StringResource payout2 = receipt.getPayout();
                composerStartRestartGroup.startReplaceGroup(-523106294);
                if (payout2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (text == null) {
                }
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(companion22, receipt.getPayout() != null, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composer2, 24576, 0, 8172);
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OrderFormPayoutRow(final EventOrderFormViewState.PayoutData.OrderForm orderForm, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String text;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(74977125);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(orderForm) : composerStartRestartGroup.changedInstance(orderForm) ? 4 : 2);
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
                    ComposerKt.traceEventStart(74977125, i3, -1, "com.robinhood.android.event.trade.orderform.OrderFormPayoutRow (OrderFormComponents.kt:282)");
                }
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
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
                StringResource payoutLabel = orderForm.getPayoutLabel();
                int i5 = StringResource.$stable;
                String text2 = EventOrderFormScreen3.getText(payoutLabel, composerStartRestartGroup, i5);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(text2, Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                StringResource payout = orderForm.getPayout();
                composerStartRestartGroup.startReplaceGroup(1252372276);
                text = payout != null ? null : EventOrderFormScreen3.getText(payout, composerStartRestartGroup, i5);
                composerStartRestartGroup.endReplaceGroup();
                if (text == null) {
                    text = EMPTY_VALUE_PLACEHOLDER;
                }
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(companion3, orderForm.getPayout() != null, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 24576, 0, 8172);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.OrderFormPayoutRow$lambda$16(orderForm, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    StringResource payoutLabel2 = orderForm.getPayoutLabel();
                    int i52 = StringResource.$stable;
                    String text22 = EventOrderFormScreen3.getText(payoutLabel2, composerStartRestartGroup, i52);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(text22, Row5.weight$default(row62, PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    StringResource payout2 = orderForm.getPayout();
                    composerStartRestartGroup.startReplaceGroup(1252372276);
                    if (payout2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (text == null) {
                    }
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(companion32, orderForm.getPayout() != null, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composer2, 24576, 0, 8172);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInForceRow(final OrderFormTimeInForce timeInForceDisplay, final boolean z, final Function0<Unit> onChangeTimeInForce, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        String strStringResource;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(timeInForceDisplay, "timeInForceDisplay");
        Intrinsics.checkNotNullParameter(onChangeTimeInForce, "onChangeTimeInForce");
        Composer composerStartRestartGroup = composer.startRestartGroup(423185331);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(timeInForceDisplay.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChangeTimeInForce) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(423185331, i3, -1, "com.robinhood.android.event.trade.orderform.TimeInForceRow (OrderFormComponents.kt:312)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(modifier4, null, null, 3, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C16465R.string.events_order_form_time_in_force_label, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = (i3 & 896) != 256;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderFormComponents.TimeInForceRow$lambda$20$lambda$18$lambda$17(onChangeTimeInForce);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(companion3, z, null, null, function0, 6, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                i4 = WhenMappings.$EnumSwitchMapping$0[timeInForceDisplay.ordinal()];
                if (i4 != 1 || i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-432526761);
                    strStringResource = StringResources_androidKt.stringResource(C16465R.string.events_order_form_time_in_force_ioc, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 3) {
                    composerStartRestartGroup.startReplaceGroup(-432523241);
                    strStringResource = StringResources_androidKt.stringResource(C16465R.string.events_order_form_time_in_force_gtd, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 4) {
                        composerStartRestartGroup.startReplaceGroup(-432531306);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-523131901);
                    composerStartRestartGroup.endReplaceGroup();
                    strStringResource = "";
                }
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-432512163);
                if (z) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.TimeInForceRow$lambda$21(timeInForceDisplay, z, onChangeTimeInForce, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
            Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(modifier4, null, null, 3, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically3, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                String strStringResource22 = StringResources_androidKt.stringResource(C16465R.string.events_order_form_time_in_force_label, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource22, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Alignment.Vertical centerVertically22 = companion4.getCenterVertically();
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 896) != 256) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderFormComponents.TimeInForceRow$lambda$20$lambda$18$lambda$17(onChangeTimeInForce);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(companion32, z, null, null, function02, 6, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically22, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        i4 = WhenMappings.$EnumSwitchMapping$0[timeInForceDisplay.ordinal()];
                        if (i4 != 1) {
                            composerStartRestartGroup.startReplaceGroup(-432526761);
                            strStringResource = StringResources_androidKt.stringResource(C16465R.string.events_order_form_time_in_force_ioc, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-432512163);
                            if (z) {
                            }
                            composer2.endReplaceGroup();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceRow$lambda$20$lambda$18$lambda$17(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderSummarySection(final StringResource summary, final boolean z, final Function0<Unit> onPriceInfoClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(onPriceInfoClick, "onPriceInfoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1439904453);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(summary) : composerStartRestartGroup.changedInstance(summary) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPriceInfoClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439904453, i3, -1, "com.robinhood.android.event.trade.orderform.OrderSummarySection (OrderFormComponents.kt:365)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                composerStartRestartGroup.startReplaceGroup(-524876459);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(StringResources_androidKt.stringResource(C16465R.string.events_order_form_order_summary_label, composerStartRestartGroup, 0));
                if (z) {
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    InlineTextContent2.appendInlineContent$default(builder, "priceInfoBtn", null, 2, null);
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 7, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("priceInfoBtn", new InlineTextContent(new Placeholder(TextUnit2.getSp(16), TextUnit2.getSp(16), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-1765341260, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$OrderSummarySection$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer2, Integer num) {
                        invoke(str, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765341260, i5, -1, "com.robinhood.android.event.trade.orderform.OrderSummarySection.<anonymous>.<anonymous> (OrderFormComponents.kt:379)");
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), StringResources_androidKt.stringResource(C16465R.string.order_form_notional_pricing_disclosure_content_desc, composer2, 0), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), null, onPriceInfoClick, false, composer2, BentoIcon4.Size16.$stable, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54)))), null, null, composerStartRestartGroup, 24576, 0, 14316);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoMarkdownText2.BentoMarkdownText(EventOrderFormScreen3.getText(summary, composerStartRestartGroup, (i3 & 14) | StringResource.$stable), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, 0, 30);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormComponents.OrderSummarySection$lambda$24(summary, z, onPriceInfoClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                composerStartRestartGroup.startReplaceGroup(-524876459);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                builder2.append(StringResources_androidKt.stringResource(C16465R.string.events_order_form_order_summary_label, composerStartRestartGroup, 0));
                if (z) {
                }
                AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 7, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("priceInfoBtn", new InlineTextContent(new Placeholder(TextUnit2.getSp(16), TextUnit2.getSp(16), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(-1765341260, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.OrderFormComponentsKt$OrderSummarySection$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer2, Integer num) {
                        invoke(str, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765341260, i5, -1, "com.robinhood.android.event.trade.orderform.OrderSummarySection.<anonymous>.<anonymous> (OrderFormComponents.kt:379)");
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), StringResources_androidKt.stringResource(C16465R.string.order_form_notional_pricing_disclosure_content_desc, composer2, 0), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), null, onPriceInfoClick, false, composer2, BentoIcon4.Size16.$stable, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54)))), null, null, composerStartRestartGroup, 24576, 0, 14316);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoMarkdownText2.BentoMarkdownText(EventOrderFormScreen3.getText(summary, composerStartRestartGroup, (i3 & 14) | StringResource.$stable), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, 0, 30);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
