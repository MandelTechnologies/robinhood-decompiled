package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRow$2$1$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderInputRow3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $isCursorVisible$delegate;
    final /* synthetic */ Function0<Unit> $onFocusRequested;
    final /* synthetic */ Function0<Unit> $onInputTooltipClick;
    final /* synthetic */ CryptoOrderInputRowState $state;
    final /* synthetic */ CryptoOrderInputRowStyle $style;

    CryptoOrderInputRow3(Function0<Unit> function0, CryptoOrderInputRowState cryptoOrderInputRowState, CryptoOrderInputRowStyle cryptoOrderInputRowStyle, Function0<Unit> function02, SnapshotState<Boolean> snapshotState) {
        this.$onFocusRequested = function0;
        this.$state = cryptoOrderInputRowState;
        this.$style = cryptoOrderInputRowStyle;
        this.$onInputTooltipClick = function02;
        this.$isCursorVisible$delegate = snapshotState;
    }

    private static final long invoke$lambda$7$lambda$6(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r37v0, types: [androidx.compose.runtime.Composer] */
    public final void invoke(Composer composer, int i) {
        Modifier.Companion companionM26519popupTooltipBgaGok8;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402437988, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRow.<anonymous>.<anonymous>.<anonymous> (CryptoOrderInputRow.kt:95)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onFocusRequested);
        final Function0<Unit> function0 = this.$onFocusRequested;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRow$2$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderInputRow3.invoke$lambda$2$lambda$1(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        final CryptoOrderInputRowState cryptoOrderInputRowState = this.$state;
        CryptoOrderInputRowStyle cryptoOrderInputRowStyle = this.$style;
        final Function0<Unit> function02 = this.$onInputTooltipClick;
        SnapshotState<Boolean> snapshotState = this.$isCursorVisible$delegate;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4891clickableO2vRcR0$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        StringResource inputText = cryptoOrderInputRowState.getInputText();
        composer.startReplaceGroup(1544582067);
        String string2 = inputText == null ? null : StringResource2.getString(inputText, composer, StringResource.$stable);
        composer.endReplaceGroup();
        long jM25288getPlaceholderTextColor0d7_KjU = (string2 == null || StringsKt.isBlank(string2)) ? cryptoOrderInputRowStyle.m25288getPlaceholderTextColor0d7_KjU() : cryptoOrderInputRowStyle.m25287getInputTextColor0d7_KjU();
        int iM7920getEnde0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        FontWeight bold = FontWeight.INSTANCE.getBold();
        composer.startReplaceGroup(1544597272);
        if (string2 == null || StringsKt.isBlank(string2)) {
            StringResource inputPlaceholderText = cryptoOrderInputRowState.getInputPlaceholderText();
            String string3 = inputPlaceholderText == null ? null : StringResource2.getString(inputPlaceholderText, composer, StringResource.$stable);
            string2 = string3 == null ? "-----" : string3;
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(1544607398);
        Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        if (cryptoOrderInputRowState.getInputTooltip() != null) {
            PopupPositioning popupPositioning = PopupPositioning.BELOW;
            float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function02);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRow$2$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoOrderInputRow3.invoke$lambda$7$lambda$5$lambda$4$lambda$3(function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            companionM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(companion, (16232 & 1) != 0 ? Boolean.TRUE : null, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : (Function0) objRememberedValue3, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : fM21593getSmallD9Ej5fM, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-1508805755, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRow$2$1$2$3$1$2
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
                        ComposerKt.traceEventStart(-1508805755, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoOrderInputRow.kt:128)");
                    }
                    StringResource inputTooltip = cryptoOrderInputRowState.getInputTooltip();
                    if (inputTooltip == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(inputTooltip, composer2, StringResource.$stable), SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16380);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54));
        } else {
            companionM26519popupTooltipBgaGok8 = companion;
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(string2, companionM26519popupTooltipBgaGok8, Color.m6701boximpl(jM25288getPlaceholderTextColor0d7_KjU), null, bold, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk), 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8104);
        composer.startReplaceGroup(1544637224);
        long jM21425getFg0d7_KjU = CryptoOrderInputRow.CryptoOrderInputRow$lambda$1(snapshotState) ? bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
        composer.endReplaceGroup();
        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(TextUnit.m8074getValueimpl(bentoTheme.getTypography(composer, i2).getTextM().m7662getFontSizeXSAIIZE()))), C2002Dp.m7995constructorimpl(2)), invoke$lambda$7$lambda$6(SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21425getFg0d7_KjU, null, "CursorColorAnimation", null, composer, 384, 10)), null, 2, null), composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$5$lambda$4$lambda$3(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
