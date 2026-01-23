package com.robinhood.android.feature.margin.hub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginStatusDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.ComposableSingletons$MarginStatusDetailFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarginStatusDetailFragment2 {
    public static final MarginStatusDetailFragment2 INSTANCE = new MarginStatusDetailFragment2();
    private static Function2<Composer, Integer, Unit> lambda$269523743 = ComposableLambda3.composableLambdaInstance(269523743, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.hub.ComposableSingletons$MarginStatusDetailFragmentKt$lambda$269523743$1
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
                ComposerKt.traceEventStart(269523743, i, -1, "com.robinhood.android.feature.margin.hub.ComposableSingletons$MarginStatusDetailFragmentKt.lambda$269523743.<anonymous> (MarginStatusDetailFragment.kt:53)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$269523743$feature_margin_hub_externalDebug() {
        return lambda$269523743;
    }
}
