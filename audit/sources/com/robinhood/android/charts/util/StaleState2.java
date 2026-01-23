package com.robinhood.android.charts.util;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StaleState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"", "isStale", "Landroidx/compose/ui/graphics/Color;", "staleColor", "Lkotlin/Function0;", "", "content", "StaleStateProvider-3IgeMak", "(ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "StaleStateProvider", "orStale-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "orStale", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/charts/util/StaleState;", "LocalStaleState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalStaleState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.util.StaleStateKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StaleState2 {
    private static final CompositionLocal6<StaleState> LocalStaleState = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.charts.util.StaleStateKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StaleState2.LocalStaleState$lambda$1();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaleStateProvider_3IgeMak$lambda$0(boolean z, long j, Function2 function2, int i, int i2, Composer composer, int i3) {
        m12176StaleStateProvider3IgeMak(z, j, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* renamed from: StaleStateProvider-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12176StaleStateProvider3IgeMak(final boolean z, long j, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(205300198);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                CompositionLocal3.CompositionLocalProvider(LocalStaleState.provides(new StaleState(z, j, null)), content, composerStartRestartGroup, ((i3 >> 3) & 112) | ProvidedValue.$stable);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if ((i2 & 2) != 0) {
                    j = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(205300198, i3, -1, "com.robinhood.android.charts.util.StaleStateProvider (StaleState.kt:14)");
                }
                CompositionLocal3.CompositionLocalProvider(LocalStaleState.provides(new StaleState(z, j, null)), content, composerStartRestartGroup, ((i3 >> 3) & 112) | ProvidedValue.$stable);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final long j2 = j;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.util.StaleStateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StaleState2.StaleStateProvider_3IgeMak$lambda$0(z, j2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final CompositionLocal6<StaleState> getLocalStaleState() {
        return LocalStaleState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaleState LocalStaleState$lambda$1() {
        return new StaleState(false, Color.INSTANCE.m6725getTransparent0d7_KjU(), null);
    }

    /* renamed from: orStale-ek8zF_U, reason: not valid java name */
    public static final long m12177orStaleek8zF_U(long j, Composer composer, int i) {
        composer.startReplaceGroup(-1726012991);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1726012991, i, -1, "com.robinhood.android.charts.util.orStale (StaleState.kt:34)");
        }
        CompositionLocal6<StaleState> compositionLocal6 = LocalStaleState;
        if (((StaleState) composer.consume(compositionLocal6)).getEnabled()) {
            j = ((StaleState) composer.consume(compositionLocal6)).m12175getStaleColor0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }
}
