package com.robinhood.android.libdesignsystem.serverui.experimental.page;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GenericActionStandardPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.page.ComposableSingletons$GenericActionStandardPageFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class GenericActionStandardPageFragment2 {
    public static final GenericActionStandardPageFragment2 INSTANCE = new GenericActionStandardPageFragment2();

    /* renamed from: lambda$-78630963, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9102lambda$78630963 = ComposableLambda3.composableLambdaInstance(-78630963, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.page.ComposableSingletons$GenericActionStandardPageFragmentKt$lambda$-78630963$1
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
                ComposerKt.traceEventStart(-78630963, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.page.ComposableSingletons$GenericActionStandardPageFragmentKt.lambda$-78630963.<anonymous> (GenericActionStandardPageFragment.kt:60)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-78630963$lib_sdui_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16057getLambda$78630963$lib_sdui_externalRelease() {
        return f9102lambda$78630963;
    }
}
