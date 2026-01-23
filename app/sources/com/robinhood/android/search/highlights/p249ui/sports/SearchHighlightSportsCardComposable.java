package com.robinhood.android.search.highlights.p249ui.sports;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchHighlightSportsCardComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.ui.sports.ComposableSingletons$SearchHighlightSportsCardComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightSportsCardComposable {
    public static final SearchHighlightSportsCardComposable INSTANCE = new SearchHighlightSportsCardComposable();
    private static Function2<Composer, Integer, Unit> lambda$1248317589 = ComposableLambda3.composableLambdaInstance(1248317589, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.sports.ComposableSingletons$SearchHighlightSportsCardComposableKt$lambda$1248317589$1
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
                ComposerKt.traceEventStart(1248317589, i, -1, "com.robinhood.android.search.highlights.ui.sports.ComposableSingletons$SearchHighlightSportsCardComposableKt.lambda$1248317589.<anonymous> (SearchHighlightSportsCardComposable.kt:137)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1248317589$lib_search_highlights_externalDebug() {
        return lambda$1248317589;
    }
}
