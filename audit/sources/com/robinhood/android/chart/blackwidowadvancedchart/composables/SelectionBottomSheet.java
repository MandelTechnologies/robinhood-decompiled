package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.ButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SelectionBottomSheet {
    public static final SelectionBottomSheet INSTANCE = new SelectionBottomSheet();
    private static Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> lambda$344997823 = ComposableLambda3.composableLambdaInstance(344997823, false, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionBottomSheetKt$lambda$344997823$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer, Integer num) {
            invoke(row5, style, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoButton, ButtonStyle.Style it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(344997823, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionBottomSheetKt.lambda$344997823.<anonymous> (SelectionBottomSheet.kt:106)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16378);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> getLambda$344997823$lib_black_widow_advanced_chart_externalDebug() {
        return lambda$344997823;
    }
}
