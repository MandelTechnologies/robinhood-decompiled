package com.robinhood.android.acats.plaid.cannotcomplete;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInCannotCompleteComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInCannotCompleteComposable2 {
    public static final AcatsInCannotCompleteComposable2 INSTANCE = new AcatsInCannotCompleteComposable2();
    private static Function2<Composer, Integer, Unit> lambda$1213729587 = ComposableLambda3.composableLambdaInstance(1213729587, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt$lambda$1213729587$1
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
                ComposerKt.traceEventStart(1213729587, i, -1, "com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt.lambda$1213729587.<anonymous> (AcatsInCannotCompleteComposable.kt:30)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$206575444 = ComposableLambda3.composableLambdaInstance(206575444, false, AcatsInCannotCompleteComposable4.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1213729587$lib_acats_plaid_externalDebug() {
        return lambda$1213729587;
    }

    public final Function2<Composer, Integer, Unit> getLambda$206575444$lib_acats_plaid_externalDebug() {
        return lambda$206575444;
    }
}
