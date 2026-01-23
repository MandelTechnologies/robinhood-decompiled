package com.robinhood.android.search.highlights.p249ui.multicontractshero;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.search.highlights.C27914R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchHighlightsMultiContractHeroCardContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightsMultiContractHeroCardContentKt$SearchHighlightsMultiContractHeroCardContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SearchHighlightsMultiContractHeroCardContent2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onTradeClicked;

    SearchHighlightsMultiContractHeroCardContent2(Function0<Unit> function0) {
        this.$onTradeClicked = function0;
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
            ComposerKt.traceEventStart(1527337631, i, -1, "com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightsMultiContractHeroCardContent.<anonymous>.<anonymous> (SearchHighlightsMultiContractHeroCardContent.kt:81)");
        }
        BentoButtons.Type type2 = BentoButtons.Type.Primary;
        String strStringResource = StringResources_androidKt.stringResource(C27914R.string.trade_button, composer, 0);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onTradeClicked);
        final Function0<Unit> function0 = this.$onTradeClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightsMultiContractHeroCardContentKt$SearchHighlightsMultiContractHeroCardContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchHighlightsMultiContractHeroCardContent2.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, type2, false, false, null, null, null, null, false, null, composer, 24960, 0, 8168);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
