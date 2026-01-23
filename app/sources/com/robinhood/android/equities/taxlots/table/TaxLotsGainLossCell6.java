package com.robinhood.android.equities.taxlots.table;

import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsGainLossCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$InternalGainLossCell$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotsGainLossCell6 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ C2002Dp $height;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ GainLossViewState $viewState;
    final /* synthetic */ C2002Dp $width;

    TaxLotsGainLossCell6(Modifier modifier, GainLossViewState gainLossViewState, C2002Dp c2002Dp, C2002Dp c2002Dp2, Resources resources) {
        this.$modifier = modifier;
        this.$viewState = gainLossViewState;
        this.$width = c2002Dp;
        this.$height = c2002Dp2;
        this.$resources = resources;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxScope TaxLotsBaseCell, Composer composer, int i) throws Resources.NotFoundException {
        String string2;
        long jM21425getFg0d7_KjU;
        Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-949718868, i, -1, "com.robinhood.android.equities.taxlots.table.InternalGainLossCell.<anonymous> (TaxLotsGainLossCell.kt:96)");
        }
        composer.startReplaceGroup(-2146757453);
        Modifier modifier = this.$modifier;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(PaddingKt.m5144paddingVpY3zN4$default(modifier, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 2, null), this.$viewState.getGainLoss() == null, null, 2, null);
        if (this.$width == null || this.$height == null) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsGainLossCellKt$InternalGainLossCell$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotsGainLossCell6.invoke$lambda$2$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            modifierBentoPlaceholder$default = SemanticsModifier6.clearAndSetSemantics(modifierBentoPlaceholder$default, (Function1) objRememberedValue);
        }
        composer.endReplaceGroup();
        StringResource gainLoss = this.$viewState.getGainLoss();
        if (gainLoss != null) {
            Resources resources = this.$resources;
            Intrinsics.checkNotNull(resources);
            CharSequence text = gainLoss.getText(resources);
            if (text == null || (string2 = text.toString()) == null) {
                string2 = "Placeholder";
            }
        }
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        Boolean boolIsPositive = this.$viewState.isPositive();
        if (Intrinsics.areEqual(boolIsPositive, Boolean.TRUE)) {
            composer.startReplaceGroup(-2146746348);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(boolIsPositive, Boolean.FALSE)) {
            composer.startReplaceGroup(-2146744684);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2146743058);
            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        }
        BentoText2.m20747BentoText38GnDrw(string2, modifierBentoPlaceholder$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer, 905969664, 0, 7416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }
}
