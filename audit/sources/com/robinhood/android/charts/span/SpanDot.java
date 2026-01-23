package com.robinhood.android.charts.span;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpanDot.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"getSpanDotColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/compose/theme/style/SpanButtonStyle$Colors;", "state", "Lcom/robinhood/android/charts/span/SpanDotState;", "(Lcom/robinhood/compose/theme/style/SpanButtonStyle$Colors;Lcom/robinhood/android/charts/span/SpanDotState;Landroidx/compose/runtime/Composer;I)J", "StaticDot", "", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "StaticDot-iJQMabo", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "SpanDot", "isPulsing", "", "SpanDot-FNF3uiM", "(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/runtime/Composer;II)V", "lib-charts_externalDebug", "alpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.span.SpanDotKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SpanDot {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpanDot_FNF3uiM$lambda$2(Modifier modifier, boolean z, long j, int i, int i2, Composer composer, int i3) {
        m12142SpanDotFNF3uiM(modifier, z, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticDot_iJQMabo$lambda$0(Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m12143StaticDotiJQMabo(modifier, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final long getSpanDotColor(SpanButtonStyle.Colors colors, SpanDotState state, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceGroup(373256643);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(373256643, i, -1, "com.robinhood.android.charts.span.getSpanDotColor (SpanDot.kt:23)");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(colors.m21961getContentColor0d7_KjU(), state.getPulsing() ? 1.0f : 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM6705copywmQWz5c$default;
    }

    /* renamed from: StaticDot-iJQMabo, reason: not valid java name */
    private static final void m12143StaticDotiJQMabo(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1325843683);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325843683, i3, -1, "com.robinhood.android.charts.span.StaticDot (SpanDot.kt:33)");
            }
            j2 = j;
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(modifier, C2002Dp.m7995constructorimpl(6)), RoundedCornerShape2.getCircleShape()), j, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j2 = j;
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanDotKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SpanDot.StaticDot_iJQMabo$lambda$0(modifier2, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: SpanDot-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12142SpanDotFNF3uiM(Modifier modifier, boolean z, final long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        boolean z3;
        Modifier modifier3;
        final boolean z4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-731753627);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
                }
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731753627, i3, -1, "com.robinhood.android.charts.span.SpanDot (SpanDot.kt:50)");
                }
                if (!z3) {
                    composerStartRestartGroup.startReplaceGroup(1581841682);
                    SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("pulsing_dot_infinite_transition", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), RepeatMode.Reverse, 0L, 4, null), "pulsing_dot_alpha", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    m12143StaticDotiJQMabo(Alpha.alpha(modifier5, SpanDot_FNF3uiM$lambda$1(snapshotState4AnimateFloat)), j2, composerStartRestartGroup, (i3 >> 3) & 112, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1582383965);
                    modifier3 = modifier5;
                    m12143StaticDotiJQMabo(modifier3, j, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112), 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.SpanDotKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SpanDot.SpanDot_FNF3uiM$lambda$2(modifier4, z4, j, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z3) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float SpanDot_FNF3uiM$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}
