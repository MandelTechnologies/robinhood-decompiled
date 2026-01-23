package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTaxLotSelectionFooter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class CryptoTaxLotSelectionFooterKt$Cell$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $textAlign;
    final /* synthetic */ CryptoTaxLotSelectionFooterState.TextContent $textContent;
    final /* synthetic */ String $valueTestTag;

    CryptoTaxLotSelectionFooterKt$Cell$1$1(String str, CryptoTaxLotSelectionFooterState.TextContent textContent, int i) {
        this.$valueTestTag = str;
        this.$textContent = textContent;
        this.$textAlign = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String string2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1552914691, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.Cell.<anonymous>.<anonymous> (CryptoTaxLotSelectionFooter.kt:149)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.views.CryptoTaxLotSelectionFooterKt$Cell$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotSelectionFooterKt$Cell$1$1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierTestTag = TestTag3.testTag(SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), this.$valueTestTag);
        CryptoTaxLotSelectionFooterState.TextContent textContent = this.$textContent;
        composer.startReplaceGroup(-1997359912);
        if (textContent instanceof CryptoTaxLotSelectionFooterState.TextContent.Loading) {
            string2 = "----------";
        } else if (textContent instanceof CryptoTaxLotSelectionFooterState.TextContent.None) {
            string2 = "-";
        } else {
            if (!(textContent instanceof CryptoTaxLotSelectionFooterState.TextContent.Text)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = StringResource2.getString(((CryptoTaxLotSelectionFooterState.TextContent.Text) this.$textContent).getText(), composer, StringResource.$stable);
        }
        composer.endReplaceGroup();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        CryptoTaxLotSelectionFooterState.TextContent textContent2 = this.$textContent;
        CryptoTaxLotSelectionFooterState.TextContent.Text text = textContent2 instanceof CryptoTaxLotSelectionFooterState.TextContent.Text ? (CryptoTaxLotSelectionFooterState.TextContent.Text) textContent2 : null;
        CryptoTaxLotSelectionFooterState.TextContent.Text.ColorOverride colorOverride = text != null ? text.getColorOverride() : null;
        composer.startReplaceGroup(-1997343673);
        Color colorM6701boximpl = colorOverride != null ? Color.m6701boximpl(colorOverride.getBentoColor(composer, 0)) : null;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1997346233);
        long jM21425getFg0d7_KjU = colorM6701boximpl == null ? bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU() : colorM6701boximpl.getValue();
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(string2, modifierTestTag, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(this.$textAlign), 0, false, 0, 0, null, 0, textS, composer, 0, 0, 8120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
