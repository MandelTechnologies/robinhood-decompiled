package com.robinhood.android.equityscreener.table;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material.icons.Icons2;
import androidx.compose.material.icons.automirrored.filled.ArrowBack;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerToolbar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.ComposableSingletons$ScreenerToolbarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerToolbar {
    public static final ScreenerToolbar INSTANCE = new ScreenerToolbar();

    /* renamed from: lambda$-950811490, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8920lambda$950811490 = ComposableLambda3.composableLambdaInstance(-950811490, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.table.ComposableSingletons$ScreenerToolbarKt$lambda$-950811490$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(row5, "<this>");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950811490, i, -1, "com.robinhood.android.equityscreener.table.ComposableSingletons$ScreenerToolbarKt.lambda$-950811490.<anonymous> (ScreenerToolbar.kt:77)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$675391318 = ComposableLambda3.composableLambdaInstance(675391318, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.table.ComposableSingletons$ScreenerToolbarKt$lambda$675391318$1
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
                ComposerKt.traceEventStart(675391318, i, -1, "com.robinhood.android.equityscreener.table.ComposableSingletons$ScreenerToolbarKt.lambda$675391318.<anonymous> (ScreenerToolbar.kt:139)");
            }
            IconKt.m5872Iconww6aTOc(ArrowBack.getArrowBack(Icons2.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-950811490$feature_equity_screener_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m13997getLambda$950811490$feature_equity_screener_externalDebug() {
        return f8920lambda$950811490;
    }

    public final Function2<Composer, Integer, Unit> getLambda$675391318$feature_equity_screener_externalDebug() {
        return lambda$675391318;
    }
}
