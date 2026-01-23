package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionChainSettingsComposableKt$DisplaySettingsOption$2$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Density $density;
    final /* synthetic */ Function1<C2002Dp, Unit> $onSbsNewTagHeightUpdated;
    final /* synthetic */ float $sbsNewTagHeightDp;
    final /* synthetic */ BoxScope $this_Box;

    /* JADX WARN: Multi-variable type inference failed */
    OptionChainSettingsComposableKt$DisplaySettingsOption$2$1$2(BoxScope boxScope, float f, Function1<? super C2002Dp, Unit> function1, Density density) {
        this.$this_Box = boxScope;
        this.$sbsNewTagHeightDp = f;
        this.$onSbsNewTagHeightUpdated = function1;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1119738362, i, -1, "com.robinhood.android.optionschain.chainsettings.DisplaySettingsOption.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:386)");
        }
        Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(this.$this_Box.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(-this.$sbsNewTagHeightDp) / 2), 1, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onSbsNewTagHeightUpdated) | composer.changed(this.$density);
        final Function1<C2002Dp, Unit> function1 = this.$onSbsNewTagHeightUpdated;
        final Density density = this.$density;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$DisplaySettingsOption$2$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainSettingsComposableKt$DisplaySettingsOption$2$1$2.invoke$lambda$2$lambda$1(function1, density, (IntSize) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierM5125offsetVpY3zN4$default, (Function1) objRememberedValue);
        String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_new_tag, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU();
        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
        Color colorM6701boximpl = Color.m6701boximpl(jM21456getPositive0d7_KjU);
        Color colorM6701boximpl2 = Color.m6701boximpl(jM21371getBg0d7_KjU);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$DisplaySettingsOption$2$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(strStringResource, modifierOnSizeChanged, null, colorM6701boximpl, null, false, colorM6701boximpl2, (Function0) objRememberedValue2, composer, 12582912, 52);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Function1 function1, Density density, IntSize intSize) {
        function1.invoke(C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() & 4294967295L))));
        return Unit.INSTANCE;
    }
}
