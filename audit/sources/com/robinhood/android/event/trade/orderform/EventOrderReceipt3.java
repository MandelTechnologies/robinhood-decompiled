package com.robinhood.android.event.trade.orderform;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.event.trade.orderform.EventOrderReceipt3;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.EventContractStyle;
import com.robinhood.android.eventcontracts.sharedeventui.ImageBackground4;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcImageStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventOrderReceipt.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001ay\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 \u001a\u0017\u0010!\u001a\u00020\u00012\b\b\u0001\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\u0010$¨\u0006%"}, m3636d2 = {"EventOrderReceipt", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;", "onDoneClicked", "Lkotlin/Function0;", "onResubmitClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/animation/AnimatedVisibilityScope;Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderReceiptCard", "title", "", "subtitle", "payoutData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "costOrCreditLabel", "Lcom/robinhood/utils/resource/StringResource;", "costOrCredit", "filledQuantity", "showFilledQuantity", "", "totalCost", "amountReturned", "comboLegDisplay", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "ReceiptDividerLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewOrderReceiptCard_allFields", "(Landroidx/compose/runtime/Composer;I)V", "PreviewHero", "imageStyle", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;", "(Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;Landroidx/compose/runtime/Composer;I)V", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderReceipt3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int EventOrderReceipt$lambda$1$lambda$0(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderReceipt$lambda$5(AnimatedVisibilityScope animatedVisibilityScope, EventOrderFormViewState.ReceiptData receiptData, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventOrderReceipt(animatedVisibilityScope, receiptData, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderReceiptCard$lambda$9(String str, String str2, EventOrderFormViewState.PayoutData payoutData, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, boolean z, String str3, String str4, String str5, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        OrderReceiptCard(str, str2, payoutData, stringResource, stringResource2, stringResource3, z, str3, str4, str5, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHero$lambda$12(EcImageStyle ecImageStyle, int i, Composer composer, int i2) {
        PreviewHero(ecImageStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOrderReceiptCard_allFields$lambda$11(int i, Composer composer, int i2) {
        PreviewOrderReceiptCard_allFields(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiptDividerLine$lambda$10(Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReceiptDividerLine(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventOrderReceipt(final AnimatedVisibilityScope animatedVisibilityScope, final EventOrderFormViewState.ReceiptData data, final Function0<Unit> onDoneClicked, final Function1<? super EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> onResubmitClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Column6 column6;
        int i5;
        int i6;
        Modifier modifier3;
        int i7;
        String str;
        BentoTheme bentoTheme;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onDoneClicked, "onDoneClicked");
        Intrinsics.checkNotNullParameter(onResubmitClicked, "onResubmitClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-144751671);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(animatedVisibilityScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(data) : composerStartRestartGroup.changedInstance(data) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDoneClicked) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onResubmitClicked) ? 2048 : 1024;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-144751671, i4, -1, "com.robinhood.android.event.trade.orderform.EventOrderReceipt (EventOrderReceipt.kt:56)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null));
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierSystemBarsPadding, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(EventOrderReceipt3.EventOrderReceipt$lambda$1$lambda$0(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAnimateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, modifierM5142padding3ABfNKs, EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null), null, null, 6, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateEnterExit$default);
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
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(112692962);
                if (data.getHideHeroElements()) {
                    str = null;
                    i5 = i9;
                    i6 = i4;
                    modifier3 = modifier5;
                    i7 = 1;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C16594R.drawable.robinhood_logo, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C16594R.string.robinhood_logo_content_description, composerStartRestartGroup, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    column6 = column62;
                    Spacer2.Spacer(Column5.weight$default(column62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    if (data.getCenterDisplayName() != null) {
                        bentoTheme = bentoTheme2;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C16465R.string.order_receipt_i_traded, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i5).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                        String centerDisplayName = data.getCenterDisplayName();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        int i10 = C16915R.font.martina_regular;
                        FontWeight.Companion companion3 = FontWeight.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(centerDisplayName, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getNova()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, new TextStyle(0L, TextUnit2.getSp(70), companion3.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i10, companion3.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-4), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(80), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null), composerStartRestartGroup, 0, 0, 8122);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    StringResource cardTitle = data.getCardTitle();
                    composerStartRestartGroup.startReplaceGroup(112737320);
                    String text = cardTitle == null ? str : EventOrderFormScreen3.getText(cardTitle, composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    StringResource cardDetail = data.getCardDetail();
                    composerStartRestartGroup.startReplaceGroup(112738952);
                    String text2 = cardDetail == null ? str : EventOrderFormScreen3.getText(cardDetail, composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer3 = composerStartRestartGroup;
                    String str2 = text;
                    String str3 = text2;
                    EventOrderFormViewState.PayoutData payoutData = data.getPayoutData();
                    StringResource estimatedCostOrCreditLabel = data.getEstimatedCostOrCreditLabel();
                    StringResource estimatedCostOrCredit = data.getEstimatedCostOrCredit();
                    StringResource filledQuantity = data.getFilledQuantity();
                    boolean showFilledQuantity = data.getShowFilledQuantity();
                    String totalCost = data.getTotalCost();
                    String amountReturned = data.getAmountReturned();
                    String comboLegDisplay = data.getComboLegDisplay();
                    int i11 = StringResource.$stable;
                    Modifier modifier6 = modifier3;
                    OrderReceiptCard(str2, str3, payoutData, estimatedCostOrCreditLabel, estimatedCostOrCredit, filledQuantity, showFilledQuantity, totalCost, amountReturned, comboLegDisplay, null, composer3, (i11 << 9) | (i11 << 12) | (i11 << 15), 0, 1024);
                    Composer composer4 = composer3;
                    composer4.startReplaceGroup(112753589);
                    if (data.getQuickResubmit() != null) {
                        String text3 = EventOrderFormScreen3.getText(data.getQuickResubmit().getCta(), composer4, i11);
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer4, i5).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer4, i5).m21425getFg0d7_KjU();
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, i7, str), 0.0f, bentoTheme.getSpacing(composer4, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer4.startReplaceGroup(-1633490746);
                        boolean z = ((i6 & 7168) == 2048) | ((i6 & 112) == 32 || ((i6 & 64) != 0 && composer4.changedInstance(data)));
                        Object objRememberedValue2 = composer4.rememberedValue();
                        if (z || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventOrderReceipt3.EventOrderReceipt$lambda$4$lambda$3$lambda$2(onResubmitClicked, data);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue2);
                        }
                        composer4.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, text3, modifierM5146paddingqDBjuR0$default, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, false, null, composer4, 0, 0, 7800);
                        composer4 = composer4;
                    }
                    composer4.endReplaceGroup();
                    composer2 = composer4;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDoneClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer4, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer4, i5).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer4, i5).m21425getFg0d7_KjU()), null, null, false, null, composer2, (i6 >> 6) & 14, 0, 7800);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                } else {
                    column6 = column62;
                    i5 = i9;
                    i6 = i4;
                    modifier3 = modifier5;
                    i7 = 1;
                    str = null;
                }
                bentoTheme = bentoTheme2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                StringResource cardTitle2 = data.getCardTitle();
                composerStartRestartGroup.startReplaceGroup(112737320);
                if (cardTitle2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                StringResource cardDetail2 = data.getCardDetail();
                composerStartRestartGroup.startReplaceGroup(112738952);
                if (cardDetail2 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer32 = composerStartRestartGroup;
                String str22 = text;
                String str32 = text2;
                EventOrderFormViewState.PayoutData payoutData2 = data.getPayoutData();
                StringResource estimatedCostOrCreditLabel2 = data.getEstimatedCostOrCreditLabel();
                StringResource estimatedCostOrCredit2 = data.getEstimatedCostOrCredit();
                StringResource filledQuantity2 = data.getFilledQuantity();
                boolean showFilledQuantity2 = data.getShowFilledQuantity();
                String totalCost2 = data.getTotalCost();
                String amountReturned2 = data.getAmountReturned();
                String comboLegDisplay2 = data.getComboLegDisplay();
                int i112 = StringResource.$stable;
                Modifier modifier62 = modifier3;
                OrderReceiptCard(str22, str32, payoutData2, estimatedCostOrCreditLabel2, estimatedCostOrCredit2, filledQuantity2, showFilledQuantity2, totalCost2, amountReturned2, comboLegDisplay2, null, composer32, (i112 << 9) | (i112 << 12) | (i112 << 15), 0, 1024);
                Composer composer42 = composer32;
                composer42.startReplaceGroup(112753589);
                if (data.getQuickResubmit() != null) {
                }
                composer42.endReplaceGroup();
                composer2 = composer42;
                BentoButtonKt.m20586BentoButtonEikTQX8(onDoneClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer42, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer42, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer42, i5).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer42, i5).m21425getFg0d7_KjU()), null, null, false, null, composer2, (i6 >> 6) & 14, 0, 7800);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier62;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderReceipt3.EventOrderReceipt$lambda$5(animatedVisibilityScope, data, onDoneClicked, onResubmitClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null));
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifierSystemBarsPadding2, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAnimateEnterExit$default2 = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, modifierM5142padding3ABfNKs2, EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null), null, null, 6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateEnterExit$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column622 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(112692962);
                if (data.getHideHeroElements()) {
                }
                bentoTheme = bentoTheme22;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion422 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion422, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                StringResource cardTitle22 = data.getCardTitle();
                composerStartRestartGroup.startReplaceGroup(112737320);
                if (cardTitle22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                StringResource cardDetail22 = data.getCardDetail();
                composerStartRestartGroup.startReplaceGroup(112738952);
                if (cardDetail22 == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer322 = composerStartRestartGroup;
                String str222 = text;
                String str322 = text2;
                EventOrderFormViewState.PayoutData payoutData22 = data.getPayoutData();
                StringResource estimatedCostOrCreditLabel22 = data.getEstimatedCostOrCreditLabel();
                StringResource estimatedCostOrCredit22 = data.getEstimatedCostOrCredit();
                StringResource filledQuantity22 = data.getFilledQuantity();
                boolean showFilledQuantity22 = data.getShowFilledQuantity();
                String totalCost22 = data.getTotalCost();
                String amountReturned22 = data.getAmountReturned();
                String comboLegDisplay22 = data.getComboLegDisplay();
                int i1122 = StringResource.$stable;
                Modifier modifier622 = modifier3;
                OrderReceiptCard(str222, str322, payoutData22, estimatedCostOrCreditLabel22, estimatedCostOrCredit22, filledQuantity22, showFilledQuantity22, totalCost22, amountReturned22, comboLegDisplay22, null, composer322, (i1122 << 9) | (i1122 << 12) | (i1122 << 15), 0, 1024);
                Composer composer422 = composer322;
                composer422.startReplaceGroup(112753589);
                if (data.getQuickResubmit() != null) {
                }
                composer422.endReplaceGroup();
                composer2 = composer422;
                BentoButtonKt.m20586BentoButtonEikTQX8(onDoneClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer422, 0), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion422, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer422, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer422, i5).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer422, i5).m21425getFg0d7_KjU()), null, null, false, null, composer2, (i6 >> 6) & 14, 0, 7800);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier622;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderReceipt$lambda$4$lambda$3$lambda$2(Function1 function1, EventOrderFormViewState.ReceiptData receiptData) {
        function1.invoke(receiptData.getQuickResubmit());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderReceiptCard(final String str, final String str2, final EventOrderFormViewState.PayoutData payoutData, final StringResource stringResource, final StringResource stringResource2, final StringResource stringResource3, final boolean z, final String str3, final String str4, final String str5, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        Modifier.Companion companion;
        Modifier modifier3;
        int i8;
        int i9;
        Composer composer2;
        int i10;
        Composer composer3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1909029557);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(payoutData) : composerStartRestartGroup.changedInstance(payoutData) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(stringResource3) : composerStartRestartGroup.changedInstance(stringResource3) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
        }
        if ((i3 & 256) == 0) {
            if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changed(str4) ? 67108864 : 33554432;
            }
            if ((i3 & 512) == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(str5) ? 536870912 : 268435456;
            }
            i5 = i4;
            i6 = i3 & 1024;
            if (i6 == 0) {
                modifier2 = modifier;
                i7 = i2 | 6;
            } else {
                modifier2 = modifier;
                if ((i2 & 6) == 0) {
                    i7 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                } else {
                    i7 = i2;
                }
            }
            if ((i5 & 306783379) != 306783378 && (i7 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
            } else {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1909029557, i5, i7, "com.robinhood.android.event.trade.orderform.OrderReceiptCard (EventOrderReceipt.kt:156)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4871backgroundbw27NRU(modifier5, bentoTheme.getColors(composerStartRestartGroup, i11).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM())), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 5, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier6 = modifier5;
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
                String str6 = OrderFormComponents.EMPTY_VALUE_PLACEHOLDER;
                String str7 = str != null ? OrderFormComponents.EMPTY_VALUE_PLACEHOLDER : str;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i11).getDisplayCapsuleMedium();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(str7, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(ModifiersKt.bentoPlaceholder$default(companion3, str != null, null, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (str2 != null) {
                    str6 = str2;
                }
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(ModifiersKt.bentoPlaceholder$default(companion3, str2 != null, null, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventOrderReceipt3.OrderReceiptCard$lambda$8$lambda$7$lambda$6(context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(str6, modifierM21622defaultHorizontalPaddingWMci_g0, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup.startReplaceGroup(899283536);
                if (str5 != null) {
                    ReceiptDividerLine(null, composerStartRestartGroup, 0, 1);
                    BentoText2.m20747BentoText38GnDrw(str5, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, C2002Dp.m7995constructorimpl(12), composerStartRestartGroup, 54, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i5 >> 27) & 14, 0, 16380);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(899291069);
                if (z) {
                    ReceiptDividerLine(null, composerStartRestartGroup, 0, 1);
                    OrderFormComponents.FilledQuantityRow(stringResource3, null, composerStartRestartGroup, StringResource.$stable | ((i5 >> 15) & 14), 2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(899295118);
                if (str3 == null) {
                    ReceiptDividerLine(null, composerStartRestartGroup, 0, 1);
                    int i12 = (i5 >> 21) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                    modifier3 = null;
                    i9 = 1;
                    companion = companion3;
                    i8 = i5;
                    composer2 = composerStartRestartGroup;
                    i10 = 0;
                    OrderFormComponents.TotalCostRow(str3, str4, null, composer2, i12, 4);
                } else {
                    companion = companion3;
                    modifier3 = null;
                    i8 = i5;
                    i9 = 1;
                    composer2 = composerStartRestartGroup;
                    i10 = 0;
                }
                composer2.endReplaceGroup();
                if (payoutData == null) {
                    composer2.startReplaceGroup(2108571773);
                    ReceiptDividerLine(modifier3, composer2, i10, i9);
                    OrderFormComponents.PayoutRow(payoutData, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, i9), composer2, (i8 >> 6) & 14, i10);
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                } else if (stringResource != null && stringResource2 != null) {
                    composer2.startReplaceGroup(2108821571);
                    ReceiptDividerLine(modifier3, composer2, i10, i9);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, i9);
                    int i13 = StringResource.$stable;
                    int i14 = i8 >> 3;
                    OrderFormComponents.CostOrCreditRow(null, false, stringResource, stringResource2, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 54 | (i13 << 6) | (i14 & 896) | (i13 << 9) | (i14 & 7168), 0);
                    composer3 = composer2;
                    composer3.endReplaceGroup();
                } else {
                    composer3 = composer2;
                    composer3.startReplaceGroup(2109148311);
                    composer3.endReplaceGroup();
                }
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderReceipt3.OrderReceiptCard$lambda$9(str, str2, payoutData, stringResource, stringResource2, stringResource3, z, str3, str4, str5, modifier4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 100663296;
        if ((i3 & 512) == 0) {
        }
        i5 = i4;
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i112 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4871backgroundbw27NRU(modifier5, bentoTheme2.getColors(composerStartRestartGroup, i112).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM())), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i112).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), 5, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Modifier modifier62 = modifier5;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String str62 = OrderFormComponents.EMPTY_VALUE_PLACEHOLDER;
                if (str != null) {
                }
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i112).getDisplayCapsuleMedium();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(str7, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(ModifiersKt.bentoPlaceholder$default(companion32, str != null, null, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i112).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (str2 != null) {
                }
                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(ModifiersKt.bentoPlaceholder$default(companion32, str2 != null, null, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i112).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EventOrderReceipt3.OrderReceiptCard$lambda$8$lambda$7$lambda$6(context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(str62, modifierM21622defaultHorizontalPaddingWMci_g02, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, 0, 12);
                    composerStartRestartGroup.startReplaceGroup(899283536);
                    if (str5 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(899291069);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(899295118);
                    if (str3 == null) {
                    }
                    composer2.endReplaceGroup();
                    if (payoutData == null) {
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderReceiptCard$lambda$8$lambda$7$lambda$6(Context context, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void ReceiptDividerLine(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-359815626);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359815626, i3, -1, "com.robinhood.android.event.trade.orderform.ReceiptDividerLine (EventOrderReceipt.kt:230)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier, 0.0f, composerStartRestartGroup, i3 & 14, 1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU(), C2002Dp.m7995constructorimpl((float) 0.5d), composerStartRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderReceipt3.ReceiptDividerLine$lambda$10(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewOrderReceiptCard_allFields(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(381755513);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(381755513, i, -1, "com.robinhood.android.event.trade.orderform.PreviewOrderReceiptCard_allFields (EventOrderReceipt.kt:242)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, EventOrderReceipt.INSTANCE.m14285getLambda$2080012239$feature_event_trade_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderReceipt3.PreviewOrderReceiptCard_allFields$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewHero(final EcImageStyle imageStyle, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(imageStyle, "imageStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-842355190);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-842355190, i2, -1, "com.robinhood.android.event.trade.orderform.PreviewHero (EventOrderReceipt.kt:272)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-113058878, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt.PreviewHero.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-113058878, i3, -1, "com.robinhood.android.event.trade.orderform.PreviewHero.<anonymous> (EventOrderReceipt.kt:274)");
                    }
                    final EcImageStyle ecImageStyle = imageStyle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2033160269, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt.PreviewHero.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2033160269, i4, -1, "com.robinhood.android.event.trade.orderform.PreviewHero.<anonymous>.<anonymous> (EventOrderReceipt.kt:275)");
                            }
                            final EcImageStyle ecImageStyle2 = ecImageStyle;
                            AnimatedVisibilityKt.AnimatedVisibility(true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-1992516827, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt.PreviewHero.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                    invoke(animatedVisibilityScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1992516827, i5, -1, "com.robinhood.android.event.trade.orderform.PreviewHero.<anonymous>.<anonymous>.<anonymous> (EventOrderReceipt.kt:276)");
                                    }
                                    ImageBackground4.EventContractBackground(new EventContractStyle(new DayNightColor(Color2.Color(4280782750L), Color2.Color(4280782750L), null), ecImageStyle2).getReceipt(composer4, 0), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter(), ComposableLambda3.rememberComposableLambda(-1427125382, true, new C500661(AnimatedVisibility), composer4, 54), composer4, 3504, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: EventOrderReceipt.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$PreviewHero$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C500661 implements Function3<BoxScope, Composer, Integer, Unit> {
                                    final /* synthetic */ AnimatedVisibilityScope $this_AnimatedVisibility;

                                    C500661(AnimatedVisibilityScope animatedVisibilityScope) {
                                        this.$this_AnimatedVisibility = animatedVisibilityScope;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                        invoke(boxScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope EventContractBackground, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(EventContractBackground, "$this$EventContractBackground");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1427125382, i, -1, "com.robinhood.android.event.trade.orderform.PreviewHero.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventOrderReceipt.kt:287)");
                                        }
                                        AnimatedVisibilityScope animatedVisibilityScope = this.$this_AnimatedVisibility;
                                        StringResource.Companion companion = StringResource.INSTANCE;
                                        EventOrderFormViewState.ReceiptData receiptData = new EventOrderFormViewState.ReceiptData(false, "PHI", companion.invoke("Philadelphia"), companion.invoke("Your limit order to buy 1 contract of **Yes PHI** at $0.50 is complete."), new EventOrderFormViewState.PayoutData.Receipt(companion.invoke("Payout if Philadelphia wins"), companion.invoke("$30")), null, null, null, true, null, null, null, null);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion2 = Composer.INSTANCE;
                                        if (objRememberedValue == companion2.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$PreviewHero$1$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        Function0 function0 = (Function0) objRememberedValue;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == companion2.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$PreviewHero$1$1$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return EventOrderReceipt3.C164881.AnonymousClass1.C500651.C500661.invoke$lambda$3$lambda$2((EventOrderFormViewState.ReceiptData.QuickResubmit) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        EventOrderReceipt3.EventOrderReceipt(animatedVisibilityScope, receiptData, function0, (Function1) objRememberedValue2, null, composer, 3456, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(EventOrderFormViewState.ReceiptData.QuickResubmit it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), composer3, 196614, 30);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderReceiptKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderReceipt3.PreviewHero$lambda$12(imageStyle, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
