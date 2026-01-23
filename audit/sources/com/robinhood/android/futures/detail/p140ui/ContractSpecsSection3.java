package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContractSpecsSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class ContractSpecsSection3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BentoIcon4 $icon;
    final /* synthetic */ String $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ TooltipState $tooltipState;
    final /* synthetic */ String $value;

    ContractSpecsSection3(String str, String str2, BentoIcon4 bentoIcon4, Modifier modifier, CoroutineScope coroutineScope, TooltipState tooltipState) {
        this.$label = str;
        this.$value = str2;
        this.$icon = bentoIcon4;
        this.$modifier = modifier;
        this.$scope = coroutineScope;
        this.$tooltipState = tooltipState;
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
            ComposerKt.traceEventStart(2077851420, i, -1, "com.robinhood.android.futures.detail.ui.ContractSpec.<anonymous>.<anonymous> (ContractSpecsSection.kt:173)");
        }
        AnnotatedString annotatedString = new AnnotatedString(this.$label, null, 2, null);
        AnnotatedString annotatedString2 = new AnnotatedString(this.$value, null, 2, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, this.$icon, Color.m6701boximpl(jM21426getFg20d7_KjU), annotatedString2, null, bentoTheme.getTypography(composer, i2).getTextM(), null, null, false, false, 3909, null);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$tooltipState);
        final CoroutineScope coroutineScope = this.$scope;
        final TooltipState tooltipState = this.$tooltipState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractSpecsSection3.invoke$lambda$1$lambda$0(coroutineScope, tooltipState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoDataRowKt.BentoDataRow(bentoDataRowState, ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), null, composer, BentoDataRowState.$stable, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, TooltipState tooltipState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ContractSpecsSection4(tooltipState, null), 3, null);
        return Unit.INSTANCE;
    }
}
