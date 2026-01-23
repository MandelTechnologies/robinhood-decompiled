package com.robinhood.android.common.detail.component.appbar;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.detail.component.appbar.ComposableSingletons$DetailPageTopAppBarKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageTopAppBar {
    public static final DetailPageTopAppBar INSTANCE = new DetailPageTopAppBar();

    /* renamed from: lambda$-145468544, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8721lambda$145468544 = ComposableLambda3.composableLambdaInstance(-145468544, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.detail.component.appbar.ComposableSingletons$DetailPageTopAppBarKt$lambda$-145468544$1
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
                ComposerKt.traceEventStart(-145468544, i, -1, "com.robinhood.android.common.detail.component.appbar.ComposableSingletons$DetailPageTopAppBarKt.lambda$-145468544.<anonymous> (DetailPageTopAppBar.kt:25)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-145468544$feature_lib_detail_component_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m12196getLambda$145468544$feature_lib_detail_component_externalDebug() {
        return f8721lambda$145468544;
    }
}
