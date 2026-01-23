package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$TextContent$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderInputRow5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $defaultTextColor;
    final /* synthetic */ TextStyle $defaultTextStyle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<CryptoOrderInputRowState.TapAction, Unit> $onTap;
    final /* synthetic */ CryptoOrderInputRowState.TextContent $textContent;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoOrderInputRow5(Modifier modifier, CryptoOrderInputRowState.TextContent textContent, Function1<? super CryptoOrderInputRowState.TapAction, Unit> function1, long j, TextStyle textStyle) {
        this.$modifier = modifier;
        this.$textContent = textContent;
        this.$onTap = function1;
        this.$defaultTextColor = j;
        this.$defaultTextStyle = textStyle;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964214828, i, -1, "com.robinhood.shared.crypto.ui.trade.view.TextContent.<anonymous> (CryptoOrderInputRow.kt:167)");
        }
        Modifier modifier = this.$modifier;
        boolean z = this.$textContent.getTapAction() != null;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$textContent) | composer.changed(this.$onTap);
        final CryptoOrderInputRowState.TextContent textContent = this.$textContent;
        final Function1<CryptoOrderInputRowState.TapAction, Unit> function1 = this.$onTap;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$TextContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderInputRow5.invoke$lambda$2$lambda$1(textContent, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier, z, null, null, (Function0) objRememberedValue, 6, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM());
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        CryptoOrderInputRowState.TextContent textContent2 = this.$textContent;
        long j = this.$defaultTextColor;
        TextStyle textStyle = this.$defaultTextStyle;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(textContent2.getText(), composer, StringResource.$stable), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, textStyle, composer, 0, 0, 8186);
        composer.startReplaceGroup(1715538942);
        if (textContent2.getTrailingIcon() != null) {
            BentoIcon4 icon = textContent2.getTrailingIcon().getIcon();
            CryptoOrderInputRowState.ColorOverride colorOverride = textContent2.getTrailingIcon().getColorOverride();
            composer.startReplaceGroup(1715546274);
            Color colorM6701boximpl = colorOverride == null ? null : Color.m6701boximpl(colorOverride.getBentoColor(composer, 0));
            composer.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(icon, null, colorM6701boximpl != null ? colorM6701boximpl.getValue() : j, null, null, false, composer, BentoIcon4.$stable | 48, 56);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CryptoOrderInputRowState.TextContent textContent, Function1 function1) {
        CryptoOrderInputRowState.TapAction tapAction = textContent.getTapAction();
        if (tapAction != null) {
            function1.invoke(tapAction);
        }
        return Unit.INSTANCE;
    }
}
