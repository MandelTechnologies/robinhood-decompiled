package com.robinhood.trader.singpass;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SingpassRetrievingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.singpass.ComposableSingletons$SingpassRetrievingComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SingpassRetrievingComposable {
    public static final SingpassRetrievingComposable INSTANCE = new SingpassRetrievingComposable();
    private static Function2<Composer, Integer, Unit> lambda$1066079095 = ComposableLambda3.composableLambdaInstance(1066079095, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.singpass.ComposableSingletons$SingpassRetrievingComposableKt$lambda$1066079095$1
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
                ComposerKt.traceEventStart(1066079095, i, -1, "com.robinhood.trader.singpass.ComposableSingletons$SingpassRetrievingComposableKt.lambda$1066079095.<anonymous> (SingpassRetrievingComposable.kt:40)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1066079095$feature_singpass_externalDebug() {
        return lambda$1066079095;
    }
}
