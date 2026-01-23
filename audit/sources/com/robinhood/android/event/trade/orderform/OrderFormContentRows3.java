package com.robinhood.android.event.trade.orderform;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo5;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.event.trade.OrderFormFocusedField;
import com.robinhood.android.event.trade.orderform.OrderFormContentRows3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.futures.sharedfuturesui.TransparentSelectionColors2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
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

/* compiled from: OrderFormContentRows.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001at\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001aw\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010'\u001a\u001d\u0010(\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010)\u001aE\u0010*\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010-¨\u0006.²\u0006\n\u0010/\u001a\u00020!X\u008a\u008e\u0002"}, m3636d2 = {"OrderFormContentRows", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;", "focusedField", "Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "onPriceInfoClick", "Lkotlin/Function0;", "onQuantityFieldFocused", "onPriceFieldFocused", "onChangeTimeInForce", "Lkotlin/Function1;", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "Lkotlin/ParameterName;", "name", "currentTimeInForce", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;Lcom/robinhood/android/event/trade/OrderFormFocusedField;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Title", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData$Title;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData$Title;Landroidx/compose/runtime/Composer;I)V", "OrderFormDivider", "(Landroidx/compose/runtime/Composer;I)V", EquityAdvanceChartOrderDuxo5.PRICE_ROW, "priceLabel", "Lcom/robinhood/utils/resource/StringResource;", "bidDisplay", "", "askDisplay", "priceText", "Landroidx/compose/ui/text/input/TextFieldValue;", "priceUseSecondaryColor", "", "isEditable", "showLoadingPlaceholder", "isFocused", "onInfoClick", "onFocused", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "BidAskDisplay", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PriceInput", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TextFieldValue;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-trade_externalDebug", "expanded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderFormContentRows3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BidAskDisplay$lambda$27(String str, String str2, int i, Composer composer, int i2) {
        BidAskDisplay(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContentRows$lambda$5(EventOrderFormViewState.OrderFormContentData.QuantityBasedData quantityBasedData, OrderFormFocusedField orderFormFocusedField, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormContentRows(quantityBasedData, orderFormFocusedField, function0, function02, function03, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormDivider$lambda$15(int i, Composer composer, int i2) {
        OrderFormDivider(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceInput$lambda$28(TextFieldValue textFieldValue, boolean z, boolean z2, Function0 function0, FocusRequester focusRequester, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PriceInput(textFieldValue, z, z2, function0, focusRequester, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceRow$lambda$20(StringResource stringResource, String str, String str2, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        PriceRow(stringResource, str, str2, textFieldValue, z, z2, z3, z4, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$14(EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title title, int i, Composer composer, int i2) {
        Title(title, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderFormContentRows(final EventOrderFormViewState.OrderFormContentData.QuantityBasedData data, final OrderFormFocusedField focusedField, final Function0<Unit> onPriceInfoClick, final Function0<Unit> onQuantityFieldFocused, final Function0<Unit> onPriceFieldFocused, final Function1<? super OrderFormTimeInForce, Unit> onChangeTimeInForce, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        int i5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion;
        int i6;
        int i7;
        float f;
        EventOrderFormViewState.PayoutData payoutData;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(onPriceInfoClick, "onPriceInfoClick");
        Intrinsics.checkNotNullParameter(onQuantityFieldFocused, "onQuantityFieldFocused");
        Intrinsics.checkNotNullParameter(onPriceFieldFocused, "onPriceFieldFocused");
        Intrinsics.checkNotNullParameter(onChangeTimeInForce, "onChangeTimeInForce");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1153374167);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(data) : composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(focusedField.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPriceInfoClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuantityFieldFocused) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPriceFieldFocused) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChangeTimeInForce) ? 131072 : 65536;
        }
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1153374167, i3, -1, "com.robinhood.android.event.trade.orderform.OrderFormContentRows (OrderFormContentRows.kt:66)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title title = data.getTitle();
                int i9 = StringResource.$stable;
                Title(title, composerStartRestartGroup, i9);
                composerStartRestartGroup.startReplaceGroup(-1526298350);
                if (data.getSubtitle() == null) {
                    String text = EventOrderFormScreen3.getText(data.getSubtitle(), composerStartRestartGroup, i9);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    i4 = 1;
                    i5 = 0;
                    BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i10).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    i4 = 1;
                    i5 = 0;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion4, ScrollKt.rememberScrollState(i5, composerStartRestartGroup, i5, i4), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i5);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i5);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Composer composer2 = composerStartRestartGroup;
                OrderFormComponents.QuantityRow(data.getQuantityText(), data.getQuantitySubtitle(), data.isQuantityEnabled(), data.getQuantityUseSecondaryColor(), focusedField != OrderFormFocusedField.QUANTITY, onQuantityFieldFocused, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), composer2, (i9 << 3) | ((i3 << 6) & 458752), 0);
                OrderFormDivider(composer2, 0);
                int i11 = i3;
                Modifier modifier5 = modifier4;
                PriceRow(StringResource.INSTANCE.invoke(C16465R.string.events_order_form_price_label, new Object[0]), data.getBidDisplay(), data.getAskDisplay(), data.getPriceData().getEditablePriceText(), data.getPriceData().getUseSecondaryColor(), data.getPriceData().isEditable(), data.getPriceData().getShowLoadingPlaceholder(), focusedField != OrderFormFocusedField.LIMIT_PRICE, onPriceInfoClick, onPriceFieldFocused, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composer2, 6, 1), composer2, i9 | ((i3 << 18) & 234881024) | ((i3 << 15) & 1879048192), 0, 0);
                composerStartRestartGroup = composer2;
                OrderFormDivider(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1391719811);
                if (data.getTimeInForceDisplay() == null) {
                    OrderFormTimeInForce timeInForceDisplay = data.getTimeInForceDisplay();
                    boolean canEditTimeInForce = data.getCanEditTimeInForce();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.changedInstance(data))) | ((i11 & 458752) == 131072);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderFormContentRows3.OrderFormContentRows$lambda$4$lambda$3$lambda$1$lambda$0(onChangeTimeInForce, data);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion4;
                    i6 = 6;
                    i7 = 1;
                    f = 0.0f;
                    OrderFormComponents.TimeInForceRow(timeInForceDisplay, canEditTimeInForce, function0, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    OrderFormDivider(composerStartRestartGroup, 0);
                } else {
                    companion = companion4;
                    i6 = 6;
                    i7 = 1;
                    f = 0.0f;
                }
                composerStartRestartGroup.endReplaceGroup();
                OrderFormComponents.CostOrCreditRow(data.getFeesDisplay(), data.getFeesDisplay() == null ? i7 : 0, data.getEstimatedCostOrCreditLabel(), data.getEstimatedCostOrCredit(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, f, composerStartRestartGroup, i6, i7), composerStartRestartGroup, i9 | (i9 << 6) | (i9 << 9), 0);
                OrderFormDivider(composerStartRestartGroup, 0);
                payoutData = data.getPayoutData();
                composerStartRestartGroup.startReplaceGroup(1391747703);
                if (payoutData != null) {
                    OrderFormComponents.PayoutRow(payoutData, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, f, composerStartRestartGroup, i6, i7), composerStartRestartGroup, 0, 0);
                    OrderFormDivider(composerStartRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContentRows3.OrderFormContentRows$lambda$5(data, focusedField, onPriceInfoClick, onQuantityFieldFocused, onPriceFieldFocused, onChangeTimeInForce, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title title2 = data.getTitle();
                int i92 = StringResource.$stable;
                Title(title2, composerStartRestartGroup, i92);
                composerStartRestartGroup.startReplaceGroup(-1526298350);
                if (data.getSubtitle() == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion42, ScrollKt.rememberScrollState(i5, composerStartRestartGroup, i5, i4), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, i5);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i5);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Composer composer22 = composerStartRestartGroup;
                    OrderFormComponents.QuantityRow(data.getQuantityText(), data.getQuantitySubtitle(), data.isQuantityEnabled(), data.getQuantityUseSecondaryColor(), focusedField != OrderFormFocusedField.QUANTITY, onQuantityFieldFocused, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), composer22, (i92 << 3) | ((i3 << 6) & 458752), 0);
                    OrderFormDivider(composer22, 0);
                    int i112 = i3;
                    Modifier modifier52 = modifier4;
                    PriceRow(StringResource.INSTANCE.invoke(C16465R.string.events_order_form_price_label, new Object[0]), data.getBidDisplay(), data.getAskDisplay(), data.getPriceData().getEditablePriceText(), data.getPriceData().getUseSecondaryColor(), data.getPriceData().isEditable(), data.getPriceData().getShowLoadingPlaceholder(), focusedField != OrderFormFocusedField.LIMIT_PRICE, onPriceInfoClick, onPriceFieldFocused, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composer22, 6, 1), composer22, i92 | ((i3 << 18) & 234881024) | ((i3 << 15) & 1879048192), 0, 0);
                    composerStartRestartGroup = composer22;
                    OrderFormDivider(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1391719811);
                    if (data.getTimeInForceDisplay() == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OrderFormComponents.CostOrCreditRow(data.getFeesDisplay(), data.getFeesDisplay() == null ? i7 : 0, data.getEstimatedCostOrCreditLabel(), data.getEstimatedCostOrCredit(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, f, composerStartRestartGroup, i6, i7), composerStartRestartGroup, i92 | (i92 << 6) | (i92 << 9), 0);
                    OrderFormDivider(composerStartRestartGroup, 0);
                    payoutData = data.getPayoutData();
                    composerStartRestartGroup.startReplaceGroup(1391747703);
                    if (payoutData != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean Title$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContentRows$lambda$4$lambda$3$lambda$1$lambda$0(Function1 function1, EventOrderFormViewState.OrderFormContentData.QuantityBasedData quantityBasedData) {
        function1.invoke(quantityBasedData.getTimeInForceDisplay());
        return Unit.INSTANCE;
    }

    private static final void Title(final EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title title, Composer composer, final int i) {
        int i2;
        Modifier modifierM4893clickableXHw0xAI$default;
        Composer composer2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2097157874);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(title) : composerStartRestartGroup.changedInstance(title) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2097157874, i2, -1, "com.robinhood.android.event.trade.orderform.Title (OrderFormContentRows.kt:146)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1029066331);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Intrinsics.checkNotNull(companion2, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            if ((title != null ? title.getExpandableContent() : null) != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderFormContentRows3.Title$lambda$11$lambda$10$lambda$9(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue2, 7, null);
            } else {
                modifierM4893clickableXHw0xAI$default = companion2;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierM4893clickableXHw0xAI$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 1);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            StringResource title2 = title != null ? title.getTitle() : null;
            composerStartRestartGroup.startReplaceGroup(-484275851);
            String text = title2 == null ? null : EventOrderFormScreen3.getText(title2, composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.endReplaceGroup();
            if (text == null) {
                text = OrderFormComponents.EMPTY_VALUE_PLACEHOLDER;
            }
            BentoText2.m20747BentoText38GnDrw(text, ModifiersKt.bentoPlaceholder$default(companion2, title == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(-484268586);
            if ((title != null ? title.getExpandableContent() : null) != null) {
                if (Title$lambda$7(snapshotState)) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_UP_16;
                } else {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_DOWN_16;
                }
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, bentoTheme.getColors(composer3, i3).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer3, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            composer2 = composer3;
            AnimatedVisibilityKt.AnimatedVisibility(column6, (title != null ? title.getExpandableContent() : null) != null && Title$lambda$7(snapshotState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1299321664, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$Title$2$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                    invoke(animatedVisibilityScope, composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i4) {
                    String expandableContent;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1299321664, i4, -1, "com.robinhood.android.event.trade.orderform.Title.<anonymous>.<anonymous> (OrderFormContentRows.kt:181)");
                    }
                    EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title title3 = title;
                    if (title3 == null || (expandableContent = title3.getExpandableContent()) == null) {
                        expandableContent = "";
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    String str = expandableContent;
                    BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composer4, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme2.getColors(composer4, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i5).getTextS(), composer4, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer2, 1572870, 30);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormContentRows3.Title$lambda$14(title, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Title$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$11$lambda$10$lambda$9(SnapshotState snapshotState) {
        Title$lambda$8(snapshotState, !Title$lambda$7(snapshotState));
        return Unit.INSTANCE;
    }

    private static final void OrderFormDivider(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1437037237);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1437037237, i, -1, "com.robinhood.android.event.trade.orderform.OrderFormDivider (OrderFormContentRows.kt:192)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU(), C2002Dp.m7995constructorimpl((float) 0.5d), composerStartRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormContentRows3.OrderFormDivider$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PriceRow(final StringResource stringResource, final String str, final String str2, final TextFieldValue textFieldValue, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z5;
        boolean z6;
        Function0<Unit> function03;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z7;
        Modifier modifierM5144paddingVpY3zN4$default;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(494780139);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(textFieldValue) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z5 = z;
                    i4 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        z6 = z4;
                        i4 |= composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            function03 = function0;
                            i4 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i & 805306368) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
                            }
                            i5 = i3 & 1024;
                            if (i5 == 0) {
                                i6 = i5;
                                i7 = i2 | 6;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                if ((i2 & 6) == 0) {
                                    i6 = i5;
                                    i7 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                                } else {
                                    i6 = i5;
                                    i7 = i2;
                                }
                            }
                            if ((i4 & 306783379) != 306783378 && (i7 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                            } else {
                                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(494780139, i4, i7, "com.robinhood.android.event.trade.orderform.PriceRow (OrderFormContentRows.kt:213)");
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new FocusRequester();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion.getCenterVertically();
                                int i8 = i4;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                                Modifier modifier5 = modifier4;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                z7 = str == null && str2 != null;
                                if (!z7) {
                                    composerStartRestartGroup.startReplaceGroup(463163324);
                                    float f = 12;
                                    modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function03, 7, null), 0.0f, C2002Dp.m7995constructorimpl(f), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), C2002Dp.m7995constructorimpl(f), 1, null);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(463440092);
                                    modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String text = EventOrderFormScreen3.getText(stringResource, composerStartRestartGroup, StringResource.$stable | (i8 & 14));
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                                composerStartRestartGroup.startReplaceGroup(-822244684);
                                if (z7) {
                                    BidAskDisplay(str, str2, composerStartRestartGroup, (i8 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                if (!z2) {
                                    composerStartRestartGroup.startReplaceGroup(463886523);
                                    int i10 = i8 >> 9;
                                    PriceInput(textFieldValue, z5, z6, function02, focusRequester, null, composerStartRestartGroup, (i10 & 112) | (i10 & 14) | 24576 | ((i8 >> 15) & 896) | ((i8 >> 18) & 7168), 32);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(464174575);
                                    String text2 = textFieldValue.getText();
                                    if (text2.length() == 0) {
                                        text2 = OrderFormComponents.EMPTY_VALUE_PLACEHOLDER;
                                    }
                                    BentoText2.m20747BentoText38GnDrw(text2, ModifiersKt.bentoPlaceholder$default(SizeKt.m5173sizeInqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(50), 0.0f, 0.0f, 0.0f, 14, null), z3, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 24576, 0, 8108);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OrderFormContentRows3.PriceRow$lambda$20(stringResource, str, str2, textFieldValue, z, z2, z3, z4, function0, function02, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i5 = i3 & 1024;
                        if (i5 == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                            int i82 = i4;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                            Modifier modifier52 = modifier4;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                if (str == null) {
                                    if (!z7) {
                                    }
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                                        String text3 = EventOrderFormScreen3.getText(stringResource, composerStartRestartGroup, StringResource.$stable | (i82 & 14));
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i92 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(text3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i92).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                                        composerStartRestartGroup.startReplaceGroup(-822244684);
                                        if (z7) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        Modifier.Companion companion32 = Modifier.INSTANCE;
                                        Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                        if (!z2) {
                                        }
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier52;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function03 = function0;
                    if ((i3 & 512) == 0) {
                    }
                    i5 = i3 & 1024;
                    if (i5 == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z6 = z4;
                if ((i3 & 256) == 0) {
                }
                function03 = function0;
                if ((i3 & 512) == 0) {
                }
                i5 = i3 & 1024;
                if (i5 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z5 = z;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            z6 = z4;
            if ((i3 & 256) == 0) {
            }
            function03 = function0;
            if ((i3 & 512) == 0) {
            }
            i5 = i3 & 1024;
            if (i5 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        z5 = z;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        z6 = z4;
        if ((i3 & 256) == 0) {
        }
        function03 = function0;
        if ((i3 & 512) == 0) {
        }
        i5 = i3 & 1024;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void BidAskDisplay(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-52622252);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-52622252, i2, -1, "com.robinhood.android.event.trade.orderform.BidAskDisplay (OrderFormContentRows.kt:273)");
            }
            composerStartRestartGroup.startReplaceGroup(969628169);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composerStartRestartGroup.startReplaceGroup(969629244);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int iPushStyle = builder.pushStyle(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS().toSpanStyle());
            try {
                composerStartRestartGroup.startReplaceGroup(969631065);
                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C16465R.string.events_order_form_bid_label, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(str);
                        builder.pop(iPushStyle);
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        composerStartRestartGroup.startReplaceGroup(969642969);
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources_androidKt.stringResource(C16465R.string.events_order_form_ask_label, composerStartRestartGroup, 0));
                            builder.pop(iPushStyle);
                            composerStartRestartGroup.endReplaceGroup();
                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                            try {
                                builder.append(str2);
                                builder.pop(iPushStyle);
                                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                                InlineTextContent2.appendInlineContent$default(builder, "priceInfoBtn", null, 2, null);
                                builder.pop(iPushStyle);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composer2.endReplaceGroup();
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, extensions2.persistentMapOf(Tuples4.m3642to("priceInfoBtn", new InlineTextContent(new Placeholder(TextUnit2.getSp(16), TextUnit2.getSp(16), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), OrderFormContentRows.INSTANCE.getLambda$143776392$feature_event_trade_externalDebug()))), null, null, composer2, 0, 0, 14334);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderFormContentRows3.BidAskDisplay$lambda$27(str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OrderFormContentRows.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$PriceInput$1 */
    static final class C164931 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $isFocused;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onFocused;
        final /* synthetic */ TextFieldValue $priceText;
        final /* synthetic */ boolean $priceUseSecondaryColor;

        C164931(boolean z, Modifier modifier, FocusRequester focusRequester, Function0<Unit> function0, TextFieldValue textFieldValue, boolean z2) {
            this.$priceUseSecondaryColor = z;
            this.$modifier = modifier;
            this.$focusRequester = focusRequester;
            this.$onFocused = function0;
            this.$priceText = textFieldValue;
            this.$isFocused = z2;
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
                ComposerKt.traceEventStart(-1383287069, i, -1, "com.robinhood.android.event.trade.orderform.PriceInput.<anonymous> (OrderFormContentRows.kt:321)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            if (this.$priceUseSecondaryColor) {
                composer.startReplaceGroup(706449890);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(706516323);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            long j = jM21425getFg0d7_KjU;
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, j, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744442, null);
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.m5155defaultMinSizeVpY3zN4$default(this.$modifier, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 2, null), this.$focusRequester);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onFocused);
            final Function0<Unit> function0 = this.$onFocused;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$PriceInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderFormContentRows3.C164931.invoke$lambda$1$lambda$0(function0, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
            TextFieldValue textFieldValue = this.$priceText;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$PriceInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderFormContentRows3.C164931.invoke$lambda$3$lambda$2((TextFieldValue) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue2, modifierOnFocusChanged, true, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer, 100666416, 0, 48848);
            Boolean boolValueOf = Boolean.valueOf(this.$isFocused);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(this.$isFocused) | composer.changed(this.$focusRequester);
            boolean z = this.$isFocused;
            FocusRequester focusRequester = this.$focusRequester;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OrderFormContentRows4(z, focusRequester, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PriceInput(final TextFieldValue textFieldValue, final boolean z, final boolean z2, final Function0<Unit> function0, final FocusRequester focusRequester, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        Function0<Unit> function02;
        FocusRequester focusRequester2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-409548372);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            focusRequester2 = focusRequester;
        } else {
            focusRequester2 = focusRequester;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
            }
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409548372, i3, -1, "com.robinhood.android.event.trade.orderform.PriceInput (OrderFormContentRows.kt:319)");
                }
                TransparentSelectionColors2.TransparentSelectionColors(ComposableLambda3.rememberComposableLambda(-1383287069, true, new C164931(z3, modifier4, focusRequester2, function02, textFieldValue, z4), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.OrderFormContentRowsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderFormContentRows3.PriceInput$lambda$28(textFieldValue, z, z2, function0, focusRequester, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            TransparentSelectionColors2.TransparentSelectionColors(ComposableLambda3.rememberComposableLambda(-1383287069, true, new C164931(z3, modifier4, focusRequester2, function02, textFieldValue, z4), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
