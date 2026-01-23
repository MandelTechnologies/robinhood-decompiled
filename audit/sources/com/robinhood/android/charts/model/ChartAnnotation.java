package com.robinhood.android.charts.model;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartAnnotation.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\u0007*\u00020\tH'¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/charts/model/ChartAnnotation;", "", "drawLayer", "", "getDrawLayer", "()Ljava/lang/Float;", "BoxScopeContent", "", "boxScope", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Content", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ChartAnnotation {
    void BoxScopeContent(BoxScope boxScope, Composer composer, int i);

    void Content(BoxScope boxScope, Composer composer, int i);

    Float getDrawLayer();

    /* compiled from: ChartAnnotation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void BoxScopeContent(ChartAnnotation chartAnnotation, BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "boxScope");
            composer.startReplaceGroup(-1289394855);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1289394855, i, -1, "com.robinhood.android.charts.model.ChartAnnotation.BoxScopeContent (ChartAnnotation.kt:24)");
            }
            chartAnnotation.Content(boxScope, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    }
}
