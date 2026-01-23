package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal2;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Overscroll.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Landroidx/compose/foundation/OverscrollEffect;", "rememberOverscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollFactory;", "LocalOverscrollFactory", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollFactory", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.OverscrollKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Overscroll4 {
    private static final CompositionLocal6<Overscroll3> LocalOverscrollFactory = CompositionLocal3.compositionLocalWithComputedDefaultOf(new Function1<CompositionLocal2, Overscroll3>() { // from class: androidx.compose.foundation.OverscrollKt$LocalOverscrollFactory$1
        @Override // kotlin.jvm.functions.Function1
        public final Overscroll3 invoke(CompositionLocal2 compositionLocal2) {
            return AndroidOverscroll_androidKt.defaultOverscrollFactory(compositionLocal2);
        }
    });

    public static final Overscroll rememberOverscrollEffect(Composer composer, int i) {
        composer.startReplaceGroup(282942128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(282942128, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
        }
        Overscroll3 overscroll3 = (Overscroll3) composer.consume(LocalOverscrollFactory);
        if (overscroll3 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        boolean zChanged = composer.changed(overscroll3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = overscroll3.createOverscrollEffect();
            composer.updateRememberedValue(objRememberedValue);
        }
        Overscroll overscroll = (Overscroll) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overscroll;
    }

    public static final CompositionLocal6<Overscroll3> getLocalOverscrollFactory() {
        return LocalOverscrollFactory;
    }
}
