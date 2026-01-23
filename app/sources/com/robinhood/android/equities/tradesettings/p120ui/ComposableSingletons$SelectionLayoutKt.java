package com.robinhood.android.equities.tradesettings.p120ui;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SelectionLayoutKt {
    public static final ComposableSingletons$SelectionLayoutKt INSTANCE = new ComposableSingletons$SelectionLayoutKt();
    private static Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> lambda$1906394285 = ComposableLambda3.composableLambdaInstance(1906394285, false, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt$lambda$1906394285$1
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
                ComposerKt.traceEventStart(1906394285, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt.lambda$1906394285.<anonymous> (SelectionLayout.kt:66)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16378);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$184978761 = ComposableLambda3.composableLambdaInstance(184978761, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt$lambda$184978761$1
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
                ComposerKt.traceEventStart(184978761, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt.lambda$184978761.<anonymous> (SelectionLayout.kt:84)");
            }
            BentoText2.m20747BentoText38GnDrw("Selection Layout Preview", null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleSmall(), composer, 6, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$204519883 = ComposableLambda3.composableLambdaInstance(204519883, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt$lambda$204519883$1
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
                ComposerKt.traceEventStart(204519883, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$SelectionLayoutKt.lambda$204519883.<anonymous> (SelectionLayout.kt:91)");
            }
            BentoText2.m20747BentoText38GnDrw("Row 1", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoText2.m20747BentoText38GnDrw("Row 2", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            BentoText2.m20747BentoText38GnDrw("Row 3", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$737239826 = ComposableLambda3.composableLambdaInstance(737239826, false, ComposableSingletons$SelectionLayoutKt$lambda$737239826$1.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$184978761$lib_trade_settings_externalDebug() {
        return lambda$184978761;
    }

    public final Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> getLambda$1906394285$lib_trade_settings_externalDebug() {
        return lambda$1906394285;
    }

    public final Function2<Composer, Integer, Unit> getLambda$204519883$lib_trade_settings_externalDebug() {
        return lambda$204519883;
    }

    public final Function2<Composer, Integer, Unit> getLambda$737239826$lib_trade_settings_externalDebug() {
        return lambda$737239826;
    }
}
