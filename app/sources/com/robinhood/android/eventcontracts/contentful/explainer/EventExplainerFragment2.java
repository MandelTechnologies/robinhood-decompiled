package com.robinhood.android.eventcontracts.contentful.explainer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventExplainerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.contentful.explainer.ComposableSingletons$EventExplainerFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventExplainerFragment2 {
    public static final EventExplainerFragment2 INSTANCE = new EventExplainerFragment2();
    private static Function2<Composer, Integer, Unit> lambda$399188382 = ComposableLambda3.composableLambdaInstance(399188382, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.contentful.explainer.ComposableSingletons$EventExplainerFragmentKt$lambda$399188382$1
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
                ComposerKt.traceEventStart(399188382, i, -1, "com.robinhood.android.eventcontracts.contentful.explainer.ComposableSingletons$EventExplainerFragmentKt.lambda$399188382.<anonymous> (EventExplainerFragment.kt:56)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$399188382$feature_event_contracts_contentful_externalDebug */
    public final Function2<Composer, Integer, Unit> m2008xa88ba695() {
        return lambda$399188382;
    }
}
