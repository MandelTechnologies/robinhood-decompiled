package com.robinhood.android.charts;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.model.Pie;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PieChart.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ae\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"PieChart", "", "modifier", "Landroidx/compose/ui/Modifier;", "slices", "", "Lcom/robinhood/android/charts/model/Pie$Slice;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "useCenter", "", "stack", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "sliceGap", "", "progress", "PieChart-cE-mTA8", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ZZLandroidx/compose/ui/graphics/Color;FFLandroidx/compose/runtime/Composer;II)V", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.PieChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PieChart2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PieChart_cE_mTA8$lambda$1(Modifier modifier, List list, DrawScope2 drawScope2, boolean z, boolean z2, Color color, float f, float f2, int i, int i2, Composer composer, int i3) {
        m11980PieChartcEmTA8(modifier, list, drawScope2, z, z2, color, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* renamed from: PieChart-cE-mTA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11980PieChartcEmTA8(Modifier modifier, final List<Pie.Slice> slices, DrawScope2 drawScope2, boolean z, boolean z2, Color color, float f, float f2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        DrawScope2 drawScope22;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        Color color2;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        float f3;
        int i9;
        DrawScope2 drawScope23;
        boolean z5;
        Color color3;
        float f4;
        Composer composer2;
        final Modifier modifier4;
        final boolean z6;
        final DrawScope2 drawScope24;
        final float f5;
        final float f6;
        final Color color4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(slices, "slices");
        Composer composerStartRestartGroup = composer.startRestartGroup(2134614076);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(slices) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                drawScope22 = drawScope2;
                int i11 = composerStartRestartGroup.changedInstance(drawScope22) ? 256 : 128;
                i3 |= i11;
            } else {
                drawScope22 = drawScope2;
            }
            i3 |= i11;
        } else {
            drawScope22 = drawScope2;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        color2 = color;
                        i3 |= composerStartRestartGroup.changed(color2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                        if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            Pie pie = null;
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                    drawScope22 = DrawScope3.INSTANCE;
                                }
                                if (i12 != 0) {
                                    z3 = false;
                                }
                                if (i4 != 0) {
                                    z4 = false;
                                }
                                if (i5 != 0) {
                                    color2 = null;
                                }
                                float f7 = i6 == 0 ? 0.0f : f;
                                if (i8 == 0) {
                                    modifier3 = modifier5;
                                    i9 = i3;
                                    drawScope23 = drawScope22;
                                    z5 = z3;
                                    color3 = color2;
                                    f4 = 1.0f;
                                    f3 = f7;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2134614076, i9, -1, "com.robinhood.android.charts.PieChart (PieChart.kt:19)");
                                    }
                                    if (color3 != null) {
                                        pie = new Pie(null, null, CollectionsKt.listOf(new Pie.Slice(1.0f, color3.getValue(), null, 4, null)), drawScope23, 0.0f, 0.0f, 0.0f, z5, false, null, 883, null);
                                    }
                                    Modifier modifier6 = modifier3;
                                    Chart2.Chart(modifier6, CollectionsKt.listOfNotNull((Object[]) new Pie[]{pie, new Pie(null, null, slices, drawScope23, 0.0f, f3, f4, z5, z4, null, 531, null)}), null, composerStartRestartGroup, i9 & 14, 4);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier6;
                                    z6 = z5;
                                    drawScope24 = drawScope23;
                                    f5 = f4;
                                    f6 = f3;
                                    color4 = color3;
                                } else {
                                    modifier3 = modifier5;
                                    f3 = f7;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                f3 = f;
                                modifier3 = modifier2;
                            }
                            i9 = i3;
                            drawScope23 = drawScope22;
                            z5 = z3;
                            color3 = color2;
                            f4 = f2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (color3 != null) {
                            }
                            Modifier modifier62 = modifier3;
                            Chart2.Chart(modifier62, CollectionsKt.listOfNotNull((Object[]) new Pie[]{pie, new Pie(null, null, slices, drawScope23, 0.0f, f3, f4, z5, z4, null, 531, null)}), null, composerStartRestartGroup, i9 & 14, 4);
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier62;
                            z6 = z5;
                            drawScope24 = drawScope23;
                            f5 = f4;
                            f6 = f3;
                            color4 = color3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            f5 = f2;
                            modifier4 = modifier2;
                            drawScope24 = drawScope22;
                            z6 = z3;
                            color4 = color2;
                            composer2 = composerStartRestartGroup;
                            f6 = f;
                        }
                        final boolean z7 = z4;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.PieChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PieChart2.PieChart_cE_mTA8$lambda$1(modifier4, slices, drawScope24, z6, z7, color4, f6, f5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    i8 = i7;
                    if ((i3 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        Pie pie2 = null;
                        if ((i & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                        }
                    }
                    final boolean z72 = z4;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                color2 = color;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i3 & 4793491) != 4793490) {
                }
                final boolean z722 = z4;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            color2 = color;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & 4793491) != 4793490) {
            }
            final boolean z7222 = z4;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        color2 = color;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & 4793491) != 4793490) {
        }
        final boolean z72222 = z4;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
