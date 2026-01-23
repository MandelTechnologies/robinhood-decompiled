package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContractSelectorBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.ComposableSingletons$ContractSelectorBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorBottomSheet {
    public static final ContractSelectorBottomSheet INSTANCE = new ContractSelectorBottomSheet();
    private static Function3<String, Composer, Integer, Unit> lambda$986698327 = ComposableLambda3.composableLambdaInstance(986698327, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ComposableSingletons$ContractSelectorBottomSheetKt$lambda$986698327$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(986698327, i, -1, "com.robinhood.android.futures.detail.ui.ComposableSingletons$ContractSelectorBottomSheetKt.lambda$986698327.<anonymous> (ContractSelectorBottomSheet.kt:215)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_active_contract_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM())), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<String, Composer, Integer, Unit> getLambda$986698327$feature_futures_detail_externalDebug() {
        return lambda$986698327;
    }
}
