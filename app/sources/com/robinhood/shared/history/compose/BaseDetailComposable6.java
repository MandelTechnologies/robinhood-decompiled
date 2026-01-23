package com.robinhood.shared.history.compose;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BaseDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.compose.ComposableSingletons$BaseDetailComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BaseDetailComposable6 {
    public static final BaseDetailComposable6 INSTANCE = new BaseDetailComposable6();
    private static Function2<Composer, Integer, Unit> lambda$1727584800 = ComposableLambda3.composableLambdaInstance(1727584800, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.history.compose.ComposableSingletons$BaseDetailComposableKt$lambda$1727584800$1
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
                ComposerKt.traceEventStart(1727584800, i, -1, "com.robinhood.shared.history.compose.ComposableSingletons$BaseDetailComposableKt.lambda$1727584800.<anonymous> (BaseDetailComposable.kt:147)");
            }
            TextKt.m6028Text4IGK_g("Content", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1787009498 = ComposableLambda3.composableLambdaInstance(1787009498, false, BaseDetailComposable8.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1727584800$lib_history_compose_externalRelease() {
        return lambda$1727584800;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1787009498$lib_history_compose_externalRelease() {
        return lambda$1787009498;
    }
}
