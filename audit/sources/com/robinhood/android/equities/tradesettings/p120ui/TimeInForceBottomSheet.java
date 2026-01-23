package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equities.tradesettings.C14990R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TimeInForceBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TimeInForceBottomSheet {
    public static final TimeInForceBottomSheet INSTANCE = new TimeInForceBottomSheet();
    private static Function2<Composer, Integer, Unit> lambda$195374482 = ComposableLambda3.composableLambdaInstance(195374482, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt$lambda$195374482$1
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
                ComposerKt.traceEventStart(195374482, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TimeInForceBottomSheetKt.lambda$195374482.<anonymous> (TimeInForceBottomSheet.kt:80)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C14990R.string.select_time_in_force_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1259808703, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8899lambda$1259808703 = ComposableLambda3.composableLambdaInstance(-1259808703, false, TimeInForceBottomSheet2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$107572214 = ComposableLambda3.composableLambdaInstance(107572214, false, TimeInForceBottomSheet3.INSTANCE);

    /* renamed from: getLambda$-1259808703$lib_trade_settings_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13687getLambda$1259808703$lib_trade_settings_externalDebug() {
        return f8899lambda$1259808703;
    }

    public final Function2<Composer, Integer, Unit> getLambda$107572214$lib_trade_settings_externalDebug() {
        return lambda$107572214;
    }

    public final Function2<Composer, Integer, Unit> getLambda$195374482$lib_trade_settings_externalDebug() {
        return lambda$195374482;
    }
}
