package com.google.accompanist.navigation.material;

import androidx.compose.material.Colors2;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001ad\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m3636d2 = {"Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "bottomSheetNavigator", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "", "content", "ModalBottomSheetLayout-4erKP6g", "(Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetLayout", "navigation-material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.accompanist.navigation.material.BottomSheetKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class BottomSheet3 {
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /* renamed from: ModalBottomSheetLayout-4erKP6g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9189ModalBottomSheetLayout4erKP6g(final BottomSheetNavigator bottomSheetNavigator, Modifier modifier, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape large;
        float fM5605getElevationD9Ej5fM;
        long jM5563getSurface0d7_KjU;
        int i4;
        int i5;
        long jM5565contentColorForek8zF_U;
        int i6;
        long scrimColor;
        int i7;
        final Modifier modifier3;
        final Shape shape2;
        final float f2;
        final long j4;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(bottomSheetNavigator, "bottomSheetNavigator");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(46058684);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(bottomSheetNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    large = shape;
                    int i10 = composerStartRestartGroup.changed(large) ? 256 : 128;
                    i3 |= i10;
                } else {
                    large = shape;
                }
                i3 |= i10;
            } else {
                large = shape;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    fM5605getElevationD9Ej5fM = f;
                    int i11 = composerStartRestartGroup.changed(fM5605getElevationD9Ej5fM) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    fM5605getElevationD9Ej5fM = f;
                }
                i3 |= i11;
            } else {
                fM5605getElevationD9Ej5fM = f;
            }
            if ((i & 57344) != 0) {
                jM5563getSurface0d7_KjU = j;
                i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(jM5563getSurface0d7_KjU)) ? 16384 : 8192;
            } else {
                jM5563getSurface0d7_KjU = j;
            }
            if ((i & 458752) != 0) {
                i4 = 57344;
                if ((i2 & 32) == 0) {
                    i5 = 458752;
                    jM5565contentColorForek8zF_U = j2;
                    int i12 = composerStartRestartGroup.changed(jM5565contentColorForek8zF_U) ? 131072 : 65536;
                    i3 |= i12;
                } else {
                    i5 = 458752;
                    jM5565contentColorForek8zF_U = j2;
                }
                i3 |= i12;
            } else {
                i4 = 57344;
                i5 = 458752;
                jM5565contentColorForek8zF_U = j2;
            }
            if ((i & 3670016) != 0) {
                scrimColor = j3;
                i6 = i3 | (((i2 & 64) == 0 && composerStartRestartGroup.changed(scrimColor)) ? 1048576 : 524288);
            } else {
                i6 = i3;
                scrimColor = j3;
            }
            int i13 = i5;
            if ((i2 & 128) != 0) {
                i8 = (i & 29360128) == 0 ? composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304 : 12582912;
                i7 = i6;
                if ((i7 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i7 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i7 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i7 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i7 &= -3670017;
                        }
                        long j7 = jM5565contentColorForek8zF_U;
                        long j8 = scrimColor;
                        Modifier modifier4 = modifier2;
                        Shape shape3 = large;
                        float f3 = fM5605getElevationD9Ej5fM;
                        long j9 = jM5563getSurface0d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i14 = i7 << 6;
                        ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.getSheetContent(), modifier4, bottomSheetNavigator.getSheetState(), false, shape3, f3, j9, j7, j8, content, composerStartRestartGroup, (i7 & 112) | (ModalBottomSheetState.$stable << 6) | (i14 & i4) | (i14 & i13) | (i14 & 3670016) | (i14 & 29360128) | (234881024 & i14) | (i14 & 1879048192), 8);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        shape2 = shape3;
                        f2 = f3;
                        j4 = j9;
                        j5 = j7;
                        j6 = j8;
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i7 &= -897;
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                        }
                        if ((i2 & 8) != 0) {
                            i7 &= -7169;
                            fM5605getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m5605getElevationD9Ej5fM();
                        }
                        if ((i2 & 16) != 0) {
                            jM5563getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m5563getSurface0d7_KjU();
                            i7 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            jM5565contentColorForek8zF_U = Colors2.m5565contentColorForek8zF_U(jM5563getSurface0d7_KjU, composerStartRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, ModalBottomSheetDefaults.$stable);
                            i7 &= -3670017;
                        }
                        long j72 = jM5565contentColorForek8zF_U;
                        long j82 = scrimColor;
                        Modifier modifier42 = modifier2;
                        Shape shape32 = large;
                        float f32 = fM5605getElevationD9Ej5fM;
                        long j92 = jM5563getSurface0d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(46058684, i7, -1, "com.google.accompanist.navigation.material.ModalBottomSheetLayout (BottomSheet.kt:46)");
                        }
                        int i142 = i7 << 6;
                        ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.getSheetContent(), modifier42, bottomSheetNavigator.getSheetState(), false, shape32, f32, j92, j72, j82, content, composerStartRestartGroup, (i7 & 112) | (ModalBottomSheetState.$stable << 6) | (i142 & i4) | (i142 & i13) | (i142 & 3670016) | (i142 & 29360128) | (234881024 & i142) | (i142 & 1879048192), 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier42;
                        shape2 = shape32;
                        f2 = f32;
                        j4 = j92;
                        j5 = j72;
                        j6 = j82;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j4 = jM5563getSurface0d7_KjU;
                    long j10 = scrimColor;
                    shape2 = large;
                    f2 = fM5605getElevationD9Ej5fM;
                    j5 = jM5565contentColorForek8zF_U;
                    j6 = j10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.navigation.material.BottomSheetKt$ModalBottomSheetLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            BottomSheet3.m9189ModalBottomSheetLayout4erKP6g(bottomSheetNavigator, modifier3, shape2, f2, j4, j5, j6, content, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i6 |= i8;
            i7 = i6;
            if ((i7 & 23967451) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i9 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    long j722 = jM5565contentColorForek8zF_U;
                    long j822 = scrimColor;
                    Modifier modifier422 = modifier2;
                    Shape shape322 = large;
                    float f322 = fM5605getElevationD9Ej5fM;
                    long j922 = jM5563getSurface0d7_KjU;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1422 = i7 << 6;
                    ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.getSheetContent(), modifier422, bottomSheetNavigator.getSheetState(), false, shape322, f322, j922, j722, j822, content, composerStartRestartGroup, (i7 & 112) | (ModalBottomSheetState.$stable << 6) | (i1422 & i4) | (i1422 & i13) | (i1422 & 3670016) | (i1422 & 29360128) | (234881024 & i1422) | (i1422 & 1879048192), 8);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier422;
                    shape2 = shape322;
                    f2 = f322;
                    j4 = j922;
                    j5 = j722;
                    j6 = j822;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        int i132 = i5;
        if ((i2 & 128) != 0) {
        }
        i6 |= i8;
        i7 = i6;
        if ((i7 & 23967451) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
