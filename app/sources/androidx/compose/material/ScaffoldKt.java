package androidx.compose.material;

import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.material.FabPosition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Scaffold.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0089\u0002\u0010)\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0081\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001av\u00102\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0014\u00109\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, m3636d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "isFabDocked", "fabPosition", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final CompositionLocal6<FabPlacement> LocalFabPlacement = CompositionLocal3.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = C2002Dp.m7995constructorimpl(16);

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5626Scaffoldu4IkXBM(final WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        ScaffoldState scaffoldStateRememberScaffoldState;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M5569getLambda2$material_release;
        int i8;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M5570getLambda3$material_release;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function2M5571getLambda4$material_release;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final int i21;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final Modifier modifier3;
        final ScaffoldState scaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final boolean z3;
        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function35;
        final boolean z4;
        final Shape shape2;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z5;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function36;
        boolean z6;
        Shape large;
        float fM5582getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i22;
        Shape shape3;
        long jM5563getSurface0d7_KjU;
        long jM5565contentColorForek8zF_U;
        int i23;
        long scrimColor;
        int i24;
        int i25;
        long jM5552getBackground0d7_KjU;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        long jM5565contentColorForek8zF_U2;
        int i26;
        long j11;
        int i27;
        Shape shape4;
        int i28;
        Shape shape5;
        Shape shape6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1288630565);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i29 = i4 & 2;
        if (i29 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                    int i30 = composerStartRestartGroup.changed(scaffoldStateRememberScaffoldState) ? 256 : 128;
                    i5 |= i30;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                i5 |= i30;
            } else {
                scaffoldStateRememberScaffoldState = scaffoldState;
            }
            i6 = i4 & 8;
            int i31 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                int i32 = 8192;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function2M5569getLambda2$material_release = function22;
                        i5 |= composerStartRestartGroup.changedInstance(function2M5569getLambda2$material_release) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        function3M5570getLambda3$material_release = function3;
                    } else {
                        function3M5570getLambda3$material_release = function3;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function3M5570getLambda3$material_release) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function2M5571getLambda4$material_release = function23;
                    } else {
                        function2M5571getLambda4$material_release = function23;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function2M5571getLambda4$material_release) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                            }
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i17 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            int i33 = i17;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i19 = i33 | 384;
                            } else {
                                i19 = i33;
                                if ((i3 & 384) == 0) {
                                    i19 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                                }
                                if ((i3 & 3072) == 0) {
                                    if ((i4 & 8192) == 0) {
                                        i20 = i18;
                                        if (composerStartRestartGroup.changed(j)) {
                                            i31 = 2048;
                                        }
                                    } else {
                                        i20 = i18;
                                    }
                                    i19 |= i31;
                                } else {
                                    i20 = i18;
                                }
                                int i34 = i20;
                                if ((i3 & 24576) == 0) {
                                    if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j2)) {
                                        i32 = 16384;
                                    }
                                    i19 |= i32;
                                }
                                if ((i3 & 196608) == 0) {
                                    i19 |= ((32768 & i4) == 0 && composerStartRestartGroup.changed(j3)) ? 131072 : 65536;
                                }
                                if ((1572864 & i3) == 0) {
                                    i19 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j4)) ? 1048576 : 524288;
                                }
                                if ((12582912 & i3) == 0) {
                                    i19 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(j5)) ? 8388608 : 4194304;
                                }
                                if ((262144 & i4) == 0) {
                                    if ((i3 & 100663296) == 0) {
                                        i19 |= composerStartRestartGroup.changedInstance(function33) ? 67108864 : 33554432;
                                    }
                                    if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                                        composer2 = composerStartRestartGroup;
                                        composer2.skipToGroupEnd();
                                        function24 = function2;
                                        i21 = i;
                                        j6 = j;
                                        j7 = j2;
                                        j8 = j3;
                                        j9 = j4;
                                        j10 = j5;
                                        function25 = function2M5569getLambda2$material_release;
                                        function34 = function3M5570getLambda3$material_release;
                                        modifier3 = modifier2;
                                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                                        function26 = function2M5571getLambda4$material_release;
                                        z3 = z;
                                        function35 = function32;
                                        z4 = z2;
                                        shape2 = shape;
                                        f2 = f;
                                    } else {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i29 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if ((i4 & 4) != 0) {
                                                i5 &= -897;
                                                scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function2M5568getLambda1$material_release = i6 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m5568getLambda1$material_release() : function2;
                                            if (i7 != 0) {
                                                function2M5569getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m5569getLambda2$material_release();
                                            }
                                            if (i8 != 0) {
                                                function3M5570getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m5570getLambda3$material_release();
                                            }
                                            if (i9 != 0) {
                                                function2M5571getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m5571getLambda4$material_release();
                                            }
                                            int iM5595getEnd5ygKITE = i10 != 0 ? FabPosition.INSTANCE.m5595getEnd5ygKITE() : i;
                                            z5 = i12 != 0 ? false : z;
                                            function36 = i14 != 0 ? null : function32;
                                            z6 = i16 != 0 ? true : z2;
                                            if ((i4 & 2048) != 0) {
                                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                                i19 &= -113;
                                            } else {
                                                large = shape;
                                            }
                                            int i35 = i19;
                                            fM5582getElevationD9Ej5fM = i34 != 0 ? DrawerDefaults.INSTANCE.m5582getElevationD9Ej5fM() : f;
                                            if ((i4 & 8192) != 0) {
                                                function27 = function2M5568getLambda1$material_release;
                                                i22 = i5;
                                                shape3 = large;
                                                jM5563getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m5563getSurface0d7_KjU();
                                                i35 &= -7169;
                                            } else {
                                                function27 = function2M5568getLambda1$material_release;
                                                i22 = i5;
                                                shape3 = large;
                                                jM5563getSurface0d7_KjU = j;
                                            }
                                            if ((i4 & 16384) != 0) {
                                                jM5565contentColorForek8zF_U = Colors2.m5565contentColorForek8zF_U(jM5563getSurface0d7_KjU, composerStartRestartGroup, (i35 >> 9) & 14);
                                                i35 &= -57345;
                                            } else {
                                                jM5565contentColorForek8zF_U = j2;
                                            }
                                            if ((32768 & i4) != 0) {
                                                i23 = 6;
                                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                                i35 &= -458753;
                                            } else {
                                                i23 = 6;
                                                scrimColor = j3;
                                            }
                                            if ((i4 & 65536) != 0) {
                                                i25 = i35 & (-3670017);
                                                i24 = iM5595getEnd5ygKITE;
                                                jM5552getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i23).m5552getBackground0d7_KjU();
                                            } else {
                                                i24 = iM5595getEnd5ygKITE;
                                                i25 = i35;
                                                jM5552getBackground0d7_KjU = j4;
                                            }
                                            if ((i4 & 131072) != 0) {
                                                function28 = function27;
                                                i26 = i25 & (-29360129);
                                                jM5565contentColorForek8zF_U2 = Colors2.m5565contentColorForek8zF_U(jM5552getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 18) & 14);
                                                i28 = i22;
                                                j11 = jM5552getBackground0d7_KjU;
                                                i27 = i24;
                                                shape4 = shape3;
                                            } else {
                                                function28 = function27;
                                                jM5565contentColorForek8zF_U2 = j5;
                                                i26 = i25;
                                                j11 = jM5552getBackground0d7_KjU;
                                                i27 = i24;
                                                shape4 = shape3;
                                                i28 = i22;
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i4 & 4) != 0) {
                                                i5 &= -897;
                                            }
                                            if ((i4 & 2048) != 0) {
                                                i19 &= -113;
                                            }
                                            int i36 = i19;
                                            if ((i4 & 8192) != 0) {
                                                i36 &= -7169;
                                            }
                                            if ((i4 & 16384) != 0) {
                                                i36 &= -57345;
                                            }
                                            if ((32768 & i4) != 0) {
                                                i36 &= -458753;
                                            }
                                            if ((i4 & 65536) != 0) {
                                                i36 &= -3670017;
                                            }
                                            if ((i4 & 131072) != 0) {
                                                i36 &= -29360129;
                                            }
                                            i27 = i;
                                            z5 = z;
                                            function36 = function32;
                                            z6 = z2;
                                            shape4 = shape;
                                            fM5582getElevationD9Ej5fM = f;
                                            jM5565contentColorForek8zF_U = j2;
                                            scrimColor = j3;
                                            j11 = j4;
                                            jM5565contentColorForek8zF_U2 = j5;
                                            i26 = i36;
                                            i28 = i5;
                                            function28 = function2;
                                            jM5563getSurface0d7_KjU = j;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        final int i37 = i27;
                                        if (ComposerKt.isTraceInProgress()) {
                                            shape5 = shape4;
                                            ComposerKt.traceEventStart(-1288630565, i28, i26, "androidx.compose.material.Scaffold (Scaffold.kt:197)");
                                        } else {
                                            shape5 = shape4;
                                        }
                                        boolean z7 = (i28 & 14) == 4;
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new MutableWindowInsets(windowInsets);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                                        final boolean z8 = z5;
                                        final Function2<? super Composer, ? super Integer, Unit> function29 = function2M5569getLambda2$material_release;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37 = function3M5570getLambda3$material_release;
                                        final ScaffoldState scaffoldState3 = scaffoldStateRememberScaffoldState;
                                        final Function2<? super Composer, ? super Integer, Unit> function210 = function2M5571getLambda4$material_release;
                                        final long j12 = j11;
                                        final long j13 = jM5565contentColorForek8zF_U2;
                                        Function2<? super Composer, ? super Integer, Unit> function211 = function28;
                                        int i38 = i28;
                                        final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer3, Integer num) {
                                                invoke(modifier4, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Modifier modifier4, Composer composer3, int i39) {
                                                int i40;
                                                if ((i39 & 6) == 0) {
                                                    i40 = i39 | (composer3.changed(modifier4) ? 4 : 2);
                                                } else {
                                                    i40 = i39;
                                                }
                                                if (composer3.shouldExecute((i40 & 19) != 18, i40 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-219833176, i40, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:201)");
                                                    }
                                                    boolean zChanged = composer3.changed(mutableWindowInsets) | composer3.changed(windowInsets);
                                                    final MutableWindowInsets mutableWindowInsets2 = mutableWindowInsets;
                                                    final WindowInsets windowInsets2 = windowInsets;
                                                    Object objRememberedValue2 = composer3.rememberedValue();
                                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                                invoke2(windowInsets3);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(WindowInsets windowInsets3) {
                                                                mutableWindowInsets2.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    Modifier modifierOnConsumedWindowInsetsChanged = WindowInsetsPadding6.onConsumedWindowInsetsChanged(modifier4, (Function1) objRememberedValue2);
                                                    long j14 = j12;
                                                    long j15 = j13;
                                                    final boolean z9 = z8;
                                                    final int i41 = i37;
                                                    final Function2<Composer, Integer, Unit> function212 = function28;
                                                    final Function3<PaddingValues, Composer, Integer, Unit> function38 = function33;
                                                    final Function2<Composer, Integer, Unit> function213 = function210;
                                                    final MutableWindowInsets mutableWindowInsets3 = mutableWindowInsets;
                                                    final Function2<Composer, Integer, Unit> function214 = function29;
                                                    final Function3<SnackbarHostState, Composer, Integer, Unit> function39 = function37;
                                                    final ScaffoldState scaffoldState4 = scaffoldState3;
                                                    SurfaceKt.m5643SurfaceFjzlyU(modifierOnConsumedWindowInsetsChanged, null, j14, j15, null, 0.0f, ComposableLambda3.rememberComposableLambda(1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i42) {
                                                            if (composer4.shouldExecute((i42 & 3) != 2, i42 & 1)) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1772955108, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                                                                }
                                                                boolean z10 = z9;
                                                                int i43 = i41;
                                                                Function2<Composer, Integer, Unit> function215 = function212;
                                                                Function3<PaddingValues, Composer, Integer, Unit> function310 = function38;
                                                                final Function3<SnackbarHostState, Composer, Integer, Unit> function311 = function39;
                                                                final ScaffoldState scaffoldState5 = scaffoldState4;
                                                                ScaffoldKt.m5627ScaffoldLayouti1QSOvI(z10, i43, function215, function310, ComposableLambda3.rememberComposableLambda(433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                        invoke(composer5, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer5, int i44) {
                                                                        if (!composer5.shouldExecute((i44 & 3) != 2, i44 & 1)) {
                                                                            composer5.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(433906483, i44, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:217)");
                                                                        }
                                                                        function311.invoke(scaffoldState5.getSnackbarHostState(), composer5, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }, composer4, 54), function213, mutableWindowInsets3, function214, composer4, 24576);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }, composer3, 54), composer3, 1572864, 50);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        if (function36 != null) {
                                            composerStartRestartGroup.startReplaceGroup(651765711);
                                            int i39 = i26 << 9;
                                            Shape shape7 = shape5;
                                            DrawerKt.m5583ModalDrawerGs3lGvM(function36, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z6, shape7, fM5582getElevationD9Ej5fM, jM5563getSurface0d7_KjU, jM5565contentColorForek8zF_U, scrimColor, ComposableLambda3.rememberComposableLambda(-1409196448, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i40) {
                                                    if (!composer3.shouldExecute((i40 & 3) != 2, i40 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1409196448, i40, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:235)");
                                                    }
                                                    composableLambdaRememberComposableLambda.invoke(Modifier.INSTANCE, composer3, 54);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i38 >> 27) & 14) | 805306368 | (i38 & 112) | (i39 & 7168) | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (29360128 & i39) | (i39 & 234881024), 0);
                                            shape6 = shape7;
                                            composer2 = composerStartRestartGroup;
                                            composer2.endReplaceGroup();
                                        } else {
                                            shape6 = shape5;
                                            composer2 = composerStartRestartGroup;
                                            composer2.startReplaceGroup(652256007);
                                            composableLambdaRememberComposableLambda.invoke(modifier2, composer2, Integer.valueOf(((i38 >> 3) & 14) | 48));
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function24 = function211;
                                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                                        function26 = function2M5571getLambda4$material_release;
                                        f2 = fM5582getElevationD9Ej5fM;
                                        j7 = jM5565contentColorForek8zF_U;
                                        j8 = scrimColor;
                                        j9 = j11;
                                        j10 = jM5565contentColorForek8zF_U2;
                                        shape2 = shape6;
                                        modifier3 = modifier2;
                                        z4 = z6;
                                        boolean z9 = z5;
                                        i21 = i37;
                                        Function2<? super Composer, ? super Integer, Unit> function212 = function2M5569getLambda2$material_release;
                                        z3 = z9;
                                        long j14 = jM5563getSurface0d7_KjU;
                                        function25 = function212;
                                        function34 = function3M5570getLambda3$material_release;
                                        function35 = function36;
                                        j6 = j14;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i40) {
                                                ScaffoldKt.m5626Scaffoldu4IkXBM(windowInsets, modifier3, scaffoldState2, function24, function25, function34, function26, i21, z3, function35, z4, shape2, f2, j6, j7, j8, j9, j10, function33, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i19 |= 100663296;
                                if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i342 = i20;
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & 196608) == 0) {
                            }
                            if ((1572864 & i3) == 0) {
                            }
                            if ((12582912 & i3) == 0) {
                            }
                            if ((262144 & i4) == 0) {
                            }
                            if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        int i332 = i17;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i3422 = i20;
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        if ((1572864 & i3) == 0) {
                        }
                        if ((12582912 & i3) == 0) {
                        }
                        if ((262144 & i4) == 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i3322 = i17;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i34222 = i20;
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if ((1572864 & i3) == 0) {
                    }
                    if ((12582912 & i3) == 0) {
                    }
                    if ((262144 & i4) == 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function2M5569getLambda2$material_release = function22;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i33222 = i17;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i342222 = i20;
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if ((1572864 & i3) == 0) {
                }
                if ((12582912 & i3) == 0) {
                }
                if ((262144 & i4) == 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            int i322 = 8192;
            if (i7 != 0) {
            }
            function2M5569getLambda2$material_release = function22;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i332222 = i17;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i3422222 = i20;
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((1572864 & i3) == 0) {
            }
            if ((12582912 & i3) == 0) {
            }
            if ((262144 & i4) == 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i6 = i4 & 8;
        int i312 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i3222 = 8192;
        if (i7 != 0) {
        }
        function2M5569getLambda2$material_release = function22;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i3322222 = i17;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i34222222 = i20;
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((1572864 & i3) == 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        if ((262144 & i4) == 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5625Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        ScaffoldState scaffoldStateRememberScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M5572getLambda5$material_release;
        int i6;
        int i7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M5574getLambda7$material_release;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function2M5575getLambda8$material_release;
        int i9;
        int iM5595getEnd5ygKITE;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final Modifier modifier3;
        final ScaffoldState scaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final int i19;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function35;
        final boolean z5;
        final Shape shape2;
        final long j9;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Shape large;
        float fM5582getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function36;
        long jM5563getSurface0d7_KjU;
        long jM5565contentColorForek8zF_U;
        long j11;
        int i20;
        long scrimColor;
        long jM5552getBackground0d7_KjU;
        boolean z6;
        Modifier modifier4;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape3;
        boolean z7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37;
        ScaffoldState scaffoldState3;
        long j12;
        long j13;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function38;
        long j14;
        long j15;
        int i21;
        int i22;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Composer composerStartRestartGroup = composer.startRestartGroup(1037492569);
        int i23 = i4 & 1;
        if (i23 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i4 & 2) == 0) {
                scaffoldStateRememberScaffoldState = scaffoldState;
                int i24 = composerStartRestartGroup.changed(scaffoldStateRememberScaffoldState) ? 32 : 16;
                i5 |= i24;
            } else {
                scaffoldStateRememberScaffoldState = scaffoldState;
            }
            i5 |= i24;
        } else {
            scaffoldStateRememberScaffoldState = scaffoldState;
        }
        int i25 = i4 & 4;
        if (i25 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                function2M5572getLambda5$material_release = function2;
                i5 |= composerStartRestartGroup.changedInstance(function2M5572getLambda5$material_release) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                int i26 = 8192;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function3M5574getLambda7$material_release = function3;
                        i5 |= composerStartRestartGroup.changedInstance(function3M5574getLambda7$material_release) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        function2M5575getLambda8$material_release = function23;
                    } else {
                        function2M5575getLambda8$material_release = function23;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function2M5575getLambda8$material_release) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        iM5595getEnd5ygKITE = i;
                    } else {
                        iM5595getEnd5ygKITE = i;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(iM5595getEnd5ygKITE) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                            }
                            if ((i3 & 6) != 0) {
                                i15 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
                            } else {
                                i15 = i3;
                            }
                            i16 = i4 & 2048;
                            if (i16 != 0) {
                                if ((i3 & 48) == 0) {
                                    i17 = i16;
                                    i15 |= composerStartRestartGroup.changed(f) ? 32 : 16;
                                }
                                if ((i3 & 384) == 0) {
                                    i18 = i23;
                                    i15 |= ((i4 & 4096) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
                                } else {
                                    i18 = i23;
                                }
                                if ((i3 & 3072) == 0) {
                                    i15 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(j2)) ? 2048 : 1024;
                                }
                                if ((i3 & 24576) == 0) {
                                    if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j3)) {
                                        i26 = 16384;
                                    }
                                    i15 |= i26;
                                }
                                if ((i3 & 196608) == 0) {
                                    i15 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                                }
                                if ((i3 & 1572864) == 0) {
                                    i15 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j5)) ? 1048576 : 524288;
                                }
                                if ((i4 & 131072) != 0) {
                                    i15 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    i15 |= composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
                                }
                                if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i18 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if ((i4 & 2) != 0) {
                                            i5 &= -113;
                                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                        }
                                        if (i25 != 0) {
                                            function2M5572getLambda5$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m5572getLambda5$material_release();
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function2M5573getLambda6$material_release = i6 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m5573getLambda6$material_release() : function22;
                                        if (i7 != 0) {
                                            function3M5574getLambda7$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m5574getLambda7$material_release();
                                        }
                                        if (i8 != 0) {
                                            function2M5575getLambda8$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m5575getLambda8$material_release();
                                        }
                                        if (i9 != 0) {
                                            iM5595getEnd5ygKITE = FabPosition.INSTANCE.m5595getEnd5ygKITE();
                                        }
                                        if (i10 != 0) {
                                            z3 = false;
                                        }
                                        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function39 = i12 != 0 ? null : function32;
                                        boolean z8 = i14 == 0 ? z2 : true;
                                        if ((i4 & 1024) != 0) {
                                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                            i15 &= -15;
                                        } else {
                                            large = shape;
                                        }
                                        int i27 = i15;
                                        fM5582getElevationD9Ej5fM = i17 != 0 ? DrawerDefaults.INSTANCE.m5582getElevationD9Ej5fM() : f;
                                        if ((i4 & 4096) != 0) {
                                            function27 = function2M5573getLambda6$material_release;
                                            i27 &= -897;
                                            function36 = function39;
                                            jM5563getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m5563getSurface0d7_KjU();
                                        } else {
                                            function27 = function2M5573getLambda6$material_release;
                                            function36 = function39;
                                            jM5563getSurface0d7_KjU = j;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            jM5565contentColorForek8zF_U = Colors2.m5565contentColorForek8zF_U(jM5563getSurface0d7_KjU, composerStartRestartGroup, (i27 >> 6) & 14);
                                            i27 &= -7169;
                                        } else {
                                            jM5565contentColorForek8zF_U = j2;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            j11 = jM5563getSurface0d7_KjU;
                                            i20 = 6;
                                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                            i27 &= -57345;
                                        } else {
                                            j11 = jM5563getSurface0d7_KjU;
                                            i20 = 6;
                                            scrimColor = j3;
                                        }
                                        if ((32768 & i4) != 0) {
                                            jM5552getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i20).m5552getBackground0d7_KjU();
                                            i27 &= -458753;
                                        } else {
                                            jM5552getBackground0d7_KjU = j4;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            long jM5565contentColorForek8zF_U2 = Colors2.m5565contentColorForek8zF_U(jM5552getBackground0d7_KjU, composerStartRestartGroup, (i27 >> 15) & 14);
                                            i27 &= -3670017;
                                            boolean z9 = z3;
                                            z6 = z8;
                                            modifier4 = modifier2;
                                            function28 = function2M5572getLambda5$material_release;
                                            shape3 = large;
                                            z7 = z9;
                                            ScaffoldState scaffoldState4 = scaffoldStateRememberScaffoldState;
                                            function37 = function3M5574getLambda7$material_release;
                                            scaffoldState3 = scaffoldState4;
                                            long j16 = j11;
                                            j12 = jM5565contentColorForek8zF_U;
                                            j13 = j16;
                                            function38 = function36;
                                            j14 = jM5565contentColorForek8zF_U2;
                                        } else {
                                            boolean z10 = z3;
                                            z6 = z8;
                                            modifier4 = modifier2;
                                            function28 = function2M5572getLambda5$material_release;
                                            shape3 = large;
                                            z7 = z10;
                                            ScaffoldState scaffoldState5 = scaffoldStateRememberScaffoldState;
                                            function37 = function3M5574getLambda7$material_release;
                                            scaffoldState3 = scaffoldState5;
                                            long j17 = j11;
                                            j12 = jM5565contentColorForek8zF_U;
                                            j13 = j17;
                                            function38 = function36;
                                            j14 = j5;
                                        }
                                        j15 = jM5552getBackground0d7_KjU;
                                        i21 = i27;
                                        i22 = i5;
                                        function29 = function27;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i4 & 2) != 0) {
                                            i5 &= -113;
                                        }
                                        if ((i4 & 1024) != 0) {
                                            i15 &= -15;
                                        }
                                        i21 = i15;
                                        if ((i4 & 4096) != 0) {
                                            i21 &= -897;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i21 &= -7169;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            i21 &= -57345;
                                        }
                                        if ((32768 & i4) != 0) {
                                            i21 &= -458753;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            i21 &= -3670017;
                                        }
                                        ScaffoldState scaffoldState6 = scaffoldStateRememberScaffoldState;
                                        function37 = function3M5574getLambda7$material_release;
                                        scaffoldState3 = scaffoldState6;
                                        function38 = function32;
                                        fM5582getElevationD9Ej5fM = f;
                                        j13 = j;
                                        j12 = j2;
                                        scrimColor = j3;
                                        j15 = j4;
                                        j14 = j5;
                                        modifier4 = modifier2;
                                        i22 = i5;
                                        z7 = z3;
                                        function28 = function2M5572getLambda5$material_release;
                                        function29 = function22;
                                        z6 = z2;
                                        shape3 = shape;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1037492569, i22, i21, "androidx.compose.material.Scaffold (Scaffold.kt:323)");
                                    }
                                    int i28 = i21 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m5626Scaffoldu4IkXBM(WindowInsetsKt.m5185WindowInsetsa9UjIt4$default(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier4, scaffoldState3, function28, function29, function37, function2M5575getLambda8$material_release, iM5595getEnd5ygKITE, z7, function38, z6, shape3, fM5582getElevationD9Ej5fM, j13, j12, scrimColor, j15, j14, function33, composer2, (i22 << 3) & 2147483632, ((i22 >> 27) & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (i28 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    scaffoldState2 = scaffoldState3;
                                    function26 = function28;
                                    function24 = function29;
                                    function34 = function37;
                                    function25 = function2M5575getLambda8$material_release;
                                    i19 = iM5595getEnd5ygKITE;
                                    z4 = z7;
                                    function35 = function38;
                                    z5 = z6;
                                    shape2 = shape3;
                                    f2 = fM5582getElevationD9Ej5fM;
                                    j9 = j13;
                                    j10 = j12;
                                    j6 = scrimColor;
                                    j7 = j15;
                                    j8 = j14;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    composer2.skipToGroupEnd();
                                    function24 = function22;
                                    f2 = f;
                                    j6 = j3;
                                    j7 = j4;
                                    j8 = j5;
                                    function34 = function3M5574getLambda7$material_release;
                                    modifier3 = modifier2;
                                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                                    function25 = function2M5575getLambda8$material_release;
                                    i19 = iM5595getEnd5ygKITE;
                                    z4 = z3;
                                    function26 = function2M5572getLambda5$material_release;
                                    function35 = function32;
                                    z5 = z2;
                                    shape2 = shape;
                                    j9 = j;
                                    j10 = j2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i29) {
                                            ScaffoldKt.m5625Scaffold27mzLpw(modifier3, scaffoldState2, function26, function24, function34, function25, i19, z4, function35, z5, shape2, f2, j9, j10, j6, j7, j8, function33, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i15 |= 48;
                            i17 = i16;
                            if ((i3 & 384) == 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & 196608) == 0) {
                            }
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((i4 & 131072) != 0) {
                            }
                            if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i14 = i13;
                        if ((i3 & 6) != 0) {
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                        }
                        i17 = i16;
                        if ((i3 & 384) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i3 & 6) != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    if ((i3 & 384) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M5574getLambda7$material_release = function3;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i3 & 6) != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i17 = i16;
                if ((i3 & 384) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i262 = 8192;
            if (i7 != 0) {
            }
            function3M5574getLambda7$material_release = function3;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i3 & 6) != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i17 = i16;
            if ((i3 & 384) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function2M5572getLambda5$material_release = function2;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2622 = 8192;
        if (i7 != 0) {
        }
        function3M5574getLambda7$material_release = function3;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i3 & 6) != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        i17 = i16;
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i15 & 4793491) == 4793490) ? false : true, i5 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m5627ScaffoldLayouti1QSOvI(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-468424875);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function32 = function3;
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function25 = function23;
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
        } else {
            function25 = function23;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) objRememberedValue;
            boolean z2 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 896) == 256) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                i4 = 0;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function27 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m5629invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:93:0x023d  */
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MeasureResult m5629invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        Object obj;
                        Object obj2;
                        final FabPlacement fabPlacement;
                        Object obj3;
                        Integer numValueOf;
                        Integer num;
                        float fM7995constructorimpl;
                        int iIntValue;
                        int iMo5010roundToPx0680j_4;
                        int height;
                        Object obj4;
                        Object obj5;
                        int iMo5010roundToPx0680j_42;
                        int iMo5010roundToPx0680j_43;
                        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
                        int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
                        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            arrayList.add(listSubcompose.get(i5).mo7239measureBRTryo0(jM7967copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i6 = 1;
                                while (true) {
                                    Object obj6 = arrayList.get(i6);
                                    int height3 = ((Placeable) obj6).getHeight();
                                    if (height2 < height3) {
                                        obj = obj6;
                                        height2 = height3;
                                    }
                                    if (i6 == lastIndex) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height4 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets2 = windowInsets;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            arrayList2.add(listSubcompose2.get(i7).mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(jM7967copyZbe2FdA$default, (-windowInsets2.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope))));
                            i7++;
                            iM7975getMaxWidthimpl = iM7975getMaxWidthimpl;
                        }
                        int i8 = iM7975getMaxWidthimpl;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj7 = obj2;
                                int i9 = height5;
                                int i10 = 1;
                                while (true) {
                                    Object obj8 = arrayList2.get(i10);
                                    int height6 = ((Placeable) obj8).getHeight();
                                    if (i9 < height6) {
                                        obj7 = obj8;
                                        i9 = height6;
                                    }
                                    if (i10 == lastIndex2) {
                                        break;
                                    }
                                    i10++;
                                }
                                obj2 = obj7;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function26);
                        WindowInsets windowInsets3 = windowInsets;
                        final ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            arrayList3.add(listSubcompose3.get(i11).mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(jM7967copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                            i11++;
                            height7 = height7;
                            iM7974getMaxHeightimpl = iM7974getMaxHeightimpl;
                        }
                        int i12 = height7;
                        final int i13 = iM7974getMaxHeightimpl;
                        if (arrayList3.isEmpty()) {
                            fabPlacement = null;
                        } else {
                            if (arrayList3.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList3.get(0);
                                int width = ((Placeable) obj4).getWidth();
                                int lastIndex3 = CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex3) {
                                    Object obj9 = obj4;
                                    int i14 = width;
                                    int i15 = 1;
                                    while (true) {
                                        Object obj10 = arrayList3.get(i15);
                                        int width2 = ((Placeable) obj10).getWidth();
                                        if (i14 < width2) {
                                            obj9 = obj10;
                                            i14 = width2;
                                        }
                                        if (i15 == lastIndex3) {
                                            break;
                                        }
                                        i15++;
                                    }
                                    obj4 = obj9;
                                }
                            }
                            Placeable placeable3 = (Placeable) obj4;
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (arrayList3.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList3.get(0);
                                int height8 = ((Placeable) obj5).getHeight();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex4) {
                                    Object obj11 = obj5;
                                    int i16 = height8;
                                    int i17 = 1;
                                    while (true) {
                                        Object obj12 = arrayList3.get(i17);
                                        int height9 = ((Placeable) obj12).getHeight();
                                        if (i16 < height9) {
                                            obj11 = obj12;
                                            i16 = height9;
                                        }
                                        if (i17 == lastIndex4) {
                                            break;
                                        }
                                        i17++;
                                    }
                                    obj5 = obj11;
                                }
                            }
                            Placeable placeable4 = (Placeable) obj5;
                            int height10 = placeable4 != null ? placeable4.getHeight() : 0;
                            if (width3 != 0 && height10 != 0) {
                                int i18 = i;
                                FabPosition.Companion companion2 = FabPosition.INSTANCE;
                                if (!FabPosition.m5593equalsimpl0(i18, companion2.m5596getStart5ygKITE())) {
                                    if (!FabPosition.m5593equalsimpl0(i18, companion2.m5595getEnd5ygKITE())) {
                                        iMo5010roundToPx0680j_42 = (i8 - width3) / 2;
                                    } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                        iMo5010roundToPx0680j_43 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        iMo5010roundToPx0680j_42 = (i8 - iMo5010roundToPx0680j_43) - width3;
                                    } else {
                                        iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    }
                                    fabPlacement = new FabPlacement(z, iMo5010roundToPx0680j_42, width3, height10);
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    fabPlacement = new FabPlacement(z, iMo5010roundToPx0680j_42, width3, height10);
                                } else {
                                    iMo5010roundToPx0680j_43 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    iMo5010roundToPx0680j_42 = (i8 - iMo5010roundToPx0680j_43) - width3;
                                    fabPlacement = new FabPlacement(z, iMo5010roundToPx0680j_42, width3, height10);
                                }
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambda3.composableLambdaInstance(424088350, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i19) {
                                if (composer2.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(424088350, i19, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:475)");
                                    }
                                    CompositionLocal3.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function28, composer2, ProvidedValue.$stable);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        final FabPlacement fabPlacement2 = fabPlacement;
                        final ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            arrayList4.add(listSubcompose4.get(i19).mo7239measureBRTryo0(jM7967copyZbe2FdA$default));
                        }
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int height11 = ((Placeable) obj3).getHeight();
                            int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex5) {
                                int i20 = 1;
                                while (true) {
                                    Object obj13 = arrayList4.get(i20);
                                    int height12 = ((Placeable) obj13).getHeight();
                                    if (height11 < height12) {
                                        obj3 = obj13;
                                        height11 = height12;
                                    }
                                    if (i20 == lastIndex5) {
                                        break;
                                    }
                                    i20++;
                                }
                            }
                        }
                        Placeable placeable5 = (Placeable) obj3;
                        Integer numValueOf2 = placeable5 != null ? Integer.valueOf(placeable5.getHeight()) : null;
                        if (fabPlacement2 != null) {
                            WindowInsets windowInsets4 = windowInsets;
                            boolean z3 = z;
                            if (numValueOf2 == null) {
                                height = fabPlacement2.getHeight() + subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets4.getBottom(subcomposeMeasureScope);
                            } else {
                                if (z3) {
                                    iIntValue = numValueOf2.intValue();
                                    iMo5010roundToPx0680j_4 = fabPlacement2.getHeight() / 2;
                                } else {
                                    iIntValue = numValueOf2.intValue() + fabPlacement2.getHeight();
                                    iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                height = iMo5010roundToPx0680j_4 + iIntValue;
                            }
                            numValueOf = Integer.valueOf(height);
                        } else {
                            numValueOf = null;
                        }
                        final int iIntValue2 = i12 != 0 ? i12 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets.getBottom(subcomposeMeasureScope)) : 0;
                        PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
                        ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$12 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
                        if (arrayList.isEmpty()) {
                            num = numValueOf2;
                            fM7995constructorimpl = paddingValuesAsPaddingValues.getTop();
                        } else {
                            num = numValueOf2;
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                        }
                        final Integer num2 = numValueOf;
                        scaffoldKt$ScaffoldLayout$contentPadding$1$12.setPaddingHolder(PaddingKt.m5138PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fM7995constructorimpl, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (arrayList4.isEmpty() || num == null) ? paddingValuesAsPaddingValues.getBottom() : subcomposeMeasureScope.mo5013toDpu2uoSUM(num.intValue())));
                        int i21 = i13 - height4;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$13 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambda3.composableLambdaInstance(-570781649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num3) {
                                invoke(composer2, num3.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i22) {
                                if (!composer2.shouldExecute((i22 & 3) != 2, i22 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-570781649, i22, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:534)");
                                }
                                function34.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$13, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i22 = 0; i22 < size5; i22++) {
                            arrayList5.add(listSubcompose5.get(i22).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(jM7967copyZbe2FdA$default, 0, 0, 0, i21, 7, null)));
                        }
                        final Integer num3 = num;
                        return MeasureScope.layout$default(subcomposeMeasureScope, i8, i13, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                List<Placeable> list = arrayList5;
                                int i23 = height4;
                                int size6 = list.size();
                                for (int i24 = 0; i24 < size6; i24++) {
                                    Placeable.PlacementScope.place$default(placementScope, list.get(i24), 0, i23, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList;
                                int size7 = list2.size();
                                for (int i25 = 0; i25 < size7; i25++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i25), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList2;
                                int i26 = i13;
                                int i27 = iIntValue2;
                                int size8 = list3.size();
                                for (int i28 = 0; i28 < size8; i28++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i28), 0, i26 - i27, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList4;
                                int i29 = i13;
                                Integer num4 = num3;
                                int size9 = list4.size();
                                for (int i30 = 0; i30 < size9; i30++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i30), 0, i29 - (num4 != null ? num4.intValue() : 0), 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList3;
                                FabPlacement fabPlacement3 = fabPlacement2;
                                int i31 = i13;
                                Integer num5 = num2;
                                int size10 = list5.size();
                                for (int i32 = 0; i32 < size10; i32++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i32), fabPlacement3 != null ? fabPlacement3.getLeft() : 0, i31 - (num5 != null ? num5.intValue() : 0), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function27);
                objRememberedValue2 = function27;
            } else {
                i4 = 0;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue2, composerStartRestartGroup, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

                public final void invoke(Composer composer2, int i5) {
                    ScaffoldKt.m5627ScaffoldLayouti1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final CompositionLocal6<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
