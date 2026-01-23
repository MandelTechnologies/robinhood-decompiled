package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.p011ui.Modifier;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Scaffold.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001an\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Scaffold", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/ui/unit/Dp;", "FabSpacing", "F", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = C2002Dp.m7995constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5939ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, int i, long j, long j2, WindowInsets windowInsets, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function2M5805getLambda1$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M5806getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M5807getLambda3$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M5808getLambda4$material3_release;
        int iM5857getEndERTFSPs;
        int i10;
        int i11;
        long jM5741getBackground0d7_KjU;
        long jM5779contentColorForek8zF_U;
        final WindowInsets contentWindowInsets;
        int i12;
        long j3;
        int i13;
        boolean z;
        Object objRememberedValue;
        final MutableWindowInsets mutableWindowInsets;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final int i14;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219521777);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function25 = function2;
                i4 |= composerStartRestartGroup.changedInstance(function25) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    function26 = function22;
                    i4 |= composerStartRestartGroup.changedInstance(function26) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function27 = function23;
                        i4 |= composerStartRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            function28 = function24;
                            i4 |= composerStartRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i9 = i15;
                            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(j)) ? 1048576 : 524288;
                        } else {
                            i9 = i15;
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 67108864 : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & 805306368) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            }
                            if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                                    function2M5805getLambda1$material3_release = i16 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m5805getLambda1$material3_release() : function25;
                                    function2M5806getLambda2$material3_release = i5 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m5806getLambda2$material3_release() : function26;
                                    function2M5807getLambda3$material3_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m5807getLambda3$material3_release() : function27;
                                    function2M5808getLambda4$material3_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m5808getLambda4$material3_release() : function28;
                                    iM5857getEndERTFSPs = i8 == 0 ? FabPosition.INSTANCE.m5857getEndERTFSPs() : i;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        i10 = -234881025;
                                        i11 = -29360129;
                                        jM5741getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).getBackground();
                                    } else {
                                        i10 = -234881025;
                                        i11 = -29360129;
                                        jM5741getBackground0d7_KjU = j;
                                    }
                                    if ((i3 & 128) == 0) {
                                        jM5779contentColorForek8zF_U = ColorScheme2.m5779contentColorForek8zF_U(jM5741getBackground0d7_KjU, composerStartRestartGroup, (i4 >> 18) & 14);
                                        i4 &= i11;
                                    } else {
                                        jM5779contentColorForek8zF_U = j2;
                                    }
                                    if ((i3 & 256) == 0) {
                                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                        i4 &= i10;
                                    } else {
                                        contentWindowInsets = windowInsets;
                                    }
                                    i12 = 100663296;
                                    j3 = jM5779contentColorForek8zF_U;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    modifier2 = modifier;
                                    iM5857getEndERTFSPs = i;
                                    jM5741getBackground0d7_KjU = j;
                                    contentWindowInsets = windowInsets;
                                    function2M5805getLambda1$material3_release = function25;
                                    function2M5806getLambda2$material3_release = function26;
                                    function2M5807getLambda3$material3_release = function27;
                                    function2M5808getLambda4$material3_release = function28;
                                    i12 = 100663296;
                                    j3 = j2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i13 = i12;
                                } else {
                                    i13 = i12;
                                    ComposerKt.traceEventStart(-1219521777, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                                }
                                int i17 = (234881024 & i4) ^ i13;
                                z = (i17 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (i4 & i13) == 67108864;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new MutableWindowInsets(contentWindowInsets);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                                long j6 = jM5741getBackground0d7_KjU;
                                zChanged = ((i17 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (i4 & i13) == 67108864) | composerStartRestartGroup.changed(mutableWindowInsets);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                                            invoke2(windowInsets2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(WindowInsets windowInsets2) {
                                            mutableWindowInsets.setInsets(WindowInsetsKt.exclude(contentWindowInsets, windowInsets2));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function213 = function2M5805getLambda1$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function2M5806getLambda2$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function2M5807getLambda3$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function2M5808getLambda4$material3_release;
                                final int i18 = iM5857getEndERTFSPs;
                                int i19 = i4 >> 12;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m5967SurfaceT9BRK9s(WindowInsetsPadding6.onConsumedWindowInsetsChanged(modifier2, (Function1) objRememberedValue2), null, j6, j3, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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

                                    public final void invoke(Composer composer3, int i20) {
                                        if ((i20 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1979205334, i20, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                            }
                                            ScaffoldKt.m5940ScaffoldLayoutFMILGgc(i18, function213, function3, function215, function216, mutableWindowInsets, function214, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, (i19 & 896) | 12582912 | (i19 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                function29 = function2M5805getLambda1$material3_release;
                                function210 = function2M5806getLambda2$material3_release;
                                function211 = function2M5807getLambda3$material3_release;
                                function212 = function2M5808getLambda4$material3_release;
                                i14 = iM5857getEndERTFSPs;
                                j4 = j6;
                                j5 = j3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                contentWindowInsets = windowInsets;
                                composer2 = composerStartRestartGroup;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                function212 = function28;
                                modifier3 = modifier;
                                i14 = i;
                                j4 = j;
                                j5 = j2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
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

                                    public final void invoke(Composer composer3, int i20) {
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, function29, function210, function211, function212, i14, j4, j5, contentWindowInsets, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if ((i3 & 128) == 0) {
                                }
                                if ((i3 & 256) == 0) {
                                }
                                i12 = 100663296;
                                j3 = jM5779contentColorForek8zF_U;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i172 = (234881024 & i4) ^ i13;
                                if (i172 <= 67108864) {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z) {
                                        objRememberedValue = new MutableWindowInsets(contentWindowInsets);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                                        long j62 = jM5741getBackground0d7_KjU;
                                        if (i172 <= 67108864) {
                                            zChanged = ((i172 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (i4 & i13) == 67108864) | composerStartRestartGroup.changed(mutableWindowInsets);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged) {
                                                objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                                                        invoke2(windowInsets2);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(WindowInsets windowInsets2) {
                                                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(contentWindowInsets, windowInsets2));
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                final Function2<? super Composer, ? super Integer, Unit> function2132 = function2M5805getLambda1$material3_release;
                                                final Function2<? super Composer, ? super Integer, Unit> function2142 = function2M5806getLambda2$material3_release;
                                                final Function2<? super Composer, ? super Integer, Unit> function2152 = function2M5807getLambda3$material3_release;
                                                final Function2<? super Composer, ? super Integer, Unit> function2162 = function2M5808getLambda4$material3_release;
                                                final int i182 = iM5857getEndERTFSPs;
                                                int i192 = i4 >> 12;
                                                composer2 = composerStartRestartGroup;
                                                SurfaceKt.m5967SurfaceT9BRK9s(WindowInsetsPadding6.onConsumedWindowInsetsChanged(modifier2, (Function1) objRememberedValue2), null, j62, j3, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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

                                                    public final void invoke(Composer composer3, int i20) {
                                                        if ((i20 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1979205334, i20, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                                            }
                                                            ScaffoldKt.m5940ScaffoldLayoutFMILGgc(i182, function2132, function3, function2152, function2162, mutableWindowInsets, function2142, composer3, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composerStartRestartGroup, 54), composer2, (i192 & 896) | 12582912 | (i192 & 7168), 114);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier3 = modifier2;
                                                function29 = function2M5805getLambda1$material3_release;
                                                function210 = function2M5806getLambda2$material3_release;
                                                function211 = function2M5807getLambda3$material3_release;
                                                function212 = function2M5808getLambda4$material3_release;
                                                i14 = iM5857getEndERTFSPs;
                                                j4 = j62;
                                                j5 = j3;
                                            }
                                        } else {
                                            zChanged = ((i172 <= 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (i4 & i13) == 67108864) | composerStartRestartGroup.changed(mutableWindowInsets);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged) {
                                            }
                                        }
                                    }
                                } else {
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z) {
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function28 = function24;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function27 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function28 = function24;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function26 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function28 = function24;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function25 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function28 = function24;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m5940ScaffoldLayoutFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        final WindowInsets windowInsets2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function32 = function3;
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
        } else {
            function32 = function3;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function25 = function23;
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
        } else {
            function25 = function23;
        }
        if ((196608 & i2) == 0) {
            windowInsets2 = windowInsets;
            i3 |= composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                i4 = 1;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function27 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m5942invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m5942invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        int i5;
                        FabPlacement fabPlacement;
                        Object obj4;
                        Integer numValueOf;
                        int height;
                        int bottom;
                        Object obj5;
                        Object obj6;
                        int iMo5010roundToPx0680j_4;
                        int iMo5010roundToPx0680j_42;
                        final int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(j);
                        final int iM7974getMaxHeightimpl = Constraints.m7974getMaxHeightimpl(j);
                        long jM7967copyZbe2FdA$default = Constraints.m7967copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            arrayList.add(listSubcompose.get(i6).mo7239measureBRTryo0(jM7967copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i7 = 1;
                                while (true) {
                                    Object obj7 = arrayList.get(i7);
                                    int height3 = ((Placeable) obj7).getHeight();
                                    if (height2 < height3) {
                                        obj = obj7;
                                        height2 = height3;
                                    }
                                    if (i7 == lastIndex) {
                                        break;
                                    }
                                    i7++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        int height4 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets3 = windowInsets2;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            arrayList2.add(listSubcompose2.get(i8).mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(jM7967copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                            i8++;
                            arrayList = arrayList;
                            listSubcompose2 = listSubcompose2;
                        }
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj8 = obj2;
                                int i9 = height5;
                                int i10 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i10);
                                    int height6 = ((Placeable) obj9).getHeight();
                                    if (i9 < height6) {
                                        obj8 = obj9;
                                        i9 = height6;
                                    }
                                    if (i10 == lastIndex2) {
                                        break;
                                    }
                                    i10++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex3) {
                                Object obj10 = obj3;
                                int i11 = width;
                                int i12 = 1;
                                while (true) {
                                    Object obj11 = arrayList2.get(i12);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i11 < width2) {
                                        obj10 = obj11;
                                        i11 = width2;
                                    }
                                    if (i12 == lastIndex3) {
                                        break;
                                    }
                                    i12++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function26);
                        WindowInsets windowInsets4 = windowInsets2;
                        final int i13 = width3;
                        final ArrayList arrayList4 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            int i15 = height7;
                            List<Measurable> list = listSubcompose3;
                            Placeable placeableMo7239measureBRTryo0 = listSubcompose3.get(i14).mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(jM7967copyZbe2FdA$default, (-windowInsets4.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope)));
                            if (placeableMo7239measureBRTryo0.getHeight() == 0 || placeableMo7239measureBRTryo0.getWidth() == 0) {
                                placeableMo7239measureBRTryo0 = null;
                            }
                            if (placeableMo7239measureBRTryo0 != null) {
                                arrayList4.add(placeableMo7239measureBRTryo0);
                            }
                            i14++;
                            height7 = i15;
                            listSubcompose3 = list;
                        }
                        int i16 = height7;
                        if (arrayList4.isEmpty()) {
                            i5 = height4;
                            fabPlacement = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList4.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList4);
                                if (1 <= lastIndex4) {
                                    Object obj12 = obj5;
                                    int i17 = width4;
                                    int i18 = 1;
                                    while (true) {
                                        Object obj13 = arrayList4.get(i18);
                                        int width5 = ((Placeable) obj13).getWidth();
                                        if (i17 < width5) {
                                            obj12 = obj13;
                                            i17 = width5;
                                        }
                                        if (i18 == lastIndex4) {
                                            break;
                                        }
                                        i18++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            Intrinsics.checkNotNull(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList4.isEmpty()) {
                                i5 = height4;
                                obj6 = null;
                            } else {
                                obj6 = arrayList4.get(0);
                                int height8 = ((Placeable) obj6).getHeight();
                                int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                                if (1 <= lastIndex5) {
                                    Object obj14 = obj6;
                                    int i19 = height8;
                                    int i20 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i20);
                                        i5 = height4;
                                        int height9 = ((Placeable) obj15).getHeight();
                                        if (i19 < height9) {
                                            i19 = height9;
                                            obj14 = obj15;
                                        }
                                        if (i20 == lastIndex5) {
                                            break;
                                        }
                                        i20++;
                                        height4 = i5;
                                    }
                                    obj6 = obj14;
                                } else {
                                    i5 = height4;
                                }
                            }
                            Intrinsics.checkNotNull(obj6);
                            int height10 = ((Placeable) obj6).getHeight();
                            int i21 = i;
                            FabPosition.Companion companion = FabPosition.INSTANCE;
                            if (!FabPosition.m5855equalsimpl0(i21, companion.m5859getStartERTFSPs())) {
                                if (!(FabPosition.m5855equalsimpl0(i21, companion.m5857getEndERTFSPs()) ? true : FabPosition.m5855equalsimpl0(i21, companion.m5858getEndOverlayERTFSPs()))) {
                                    iMo5010roundToPx0680j_4 = (iM7975getMaxWidthimpl - width6) / 2;
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    iMo5010roundToPx0680j_4 = (iM7975getMaxWidthimpl - iMo5010roundToPx0680j_42) - width6;
                                } else {
                                    iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                fabPlacement = new FabPlacement(iMo5010roundToPx0680j_4, width6, height10);
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                iMo5010roundToPx0680j_4 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                fabPlacement = new FabPlacement(iMo5010roundToPx0680j_4, width6, height10);
                            } else {
                                iMo5010roundToPx0680j_42 = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                iMo5010roundToPx0680j_4 = (iM7975getMaxWidthimpl - iMo5010roundToPx0680j_42) - width6;
                                fabPlacement = new FabPlacement(iMo5010roundToPx0680j_4, width6, height10);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambda3.composableLambdaInstance(-2146438447, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
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

                            public final void invoke(Composer composer2, int i22) {
                                if ((i22 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2146438447, i22, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                function28.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i22 = 0; i22 < size4; i22++) {
                            arrayList5.add(listSubcompose4.get(i22).mo7239measureBRTryo0(jM7967copyZbe2FdA$default));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int height11 = ((Placeable) obj4).getHeight();
                            int lastIndex6 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex6) {
                                int i23 = 1;
                                while (true) {
                                    Object obj16 = arrayList5.get(i23);
                                    int height12 = ((Placeable) obj16).getHeight();
                                    if (height11 < height12) {
                                        height11 = height12;
                                        obj4 = obj16;
                                    }
                                    if (i23 == lastIndex6) {
                                        break;
                                    }
                                    i23++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        if (fabPlacement != null) {
                            int i24 = i;
                            WindowInsets windowInsets5 = windowInsets2;
                            if (numValueOf2 == null || FabPosition.m5855equalsimpl0(i24, FabPosition.INSTANCE.m5858getEndOverlayERTFSPs())) {
                                height = fabPlacement.getHeight() + subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                bottom = windowInsets5.getBottom(subcomposeMeasureScope);
                            } else {
                                height = numValueOf2.intValue() + fabPlacement.getHeight();
                                bottom = subcomposeMeasureScope.mo5010roundToPx0680j_4(ScaffoldKt.FabSpacing);
                            }
                            numValueOf = Integer.valueOf(height + bottom);
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = i16 != 0 ? i16 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(subcomposeMeasureScope)) : 0;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets6 = windowInsets2;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        final int i25 = i5;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambda3.composableLambdaInstance(-1213360416, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
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

                            public final void invoke(Composer composer2, int i26) {
                                float fMo5013toDpu2uoSUM;
                                float bottom2;
                                Integer num;
                                if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1213360416, i26, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                    }
                                    PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets6, subcomposeMeasureScope);
                                    if (arrayList3.isEmpty()) {
                                        fMo5013toDpu2uoSUM = paddingValuesAsPaddingValues.getTop();
                                    } else {
                                        fMo5013toDpu2uoSUM = subcomposeMeasureScope.mo5013toDpu2uoSUM(i25);
                                    }
                                    if (arrayList5.isEmpty() || (num = numValueOf2) == null) {
                                        bottom2 = paddingValuesAsPaddingValues.getBottom();
                                    } else {
                                        bottom2 = subcomposeMeasureScope.mo5013toDpu2uoSUM(num.intValue());
                                    }
                                    function34.invoke(PaddingKt.m5138PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fMo5013toDpu2uoSUM, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        final ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i26 = 0; i26 < size5; i26++) {
                            arrayList6.add(listSubcompose5.get(i26).mo7239measureBRTryo0(jM7967copyZbe2FdA$default));
                        }
                        final Integer num = numValueOf2;
                        final WindowInsets windowInsets7 = windowInsets2;
                        final Integer num2 = numValueOf;
                        final int i27 = iIntValue;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM7975getMaxWidthimpl, iM7974getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
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
                                List<Placeable> list2 = arrayList6;
                                int size6 = list2.size();
                                for (int i28 = 0; i28 < size6; i28++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i28), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList3;
                                int size7 = list3.size();
                                for (int i29 = 0; i29 < size7; i29++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i29), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList2;
                                int i30 = iM7975getMaxWidthimpl;
                                int i31 = i13;
                                WindowInsets windowInsets8 = windowInsets7;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                int i32 = iM7974getMaxHeightimpl;
                                int i33 = i27;
                                int size8 = list4.size();
                                for (int i34 = 0; i34 < size8; i34++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i34), ((i30 - i31) / 2) + windowInsets8.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), i32 - i33, 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList5;
                                int i35 = iM7974getMaxHeightimpl;
                                Integer num3 = num;
                                int size9 = list5.size();
                                for (int i36 = 0; i36 < size9; i36++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i36), 0, i35 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list6 = arrayList4;
                                    int i37 = iM7974getMaxHeightimpl;
                                    Integer num4 = num2;
                                    int size10 = list6.size();
                                    for (int i38 = 0; i38 < size10; i38++) {
                                        Placeable placeable5 = list6.get(i38);
                                        int left = fabPlacement3.getLeft();
                                        Intrinsics.checkNotNull(num4);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i37 - num4.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function27);
                objRememberedValue = function27;
            } else {
                i4 = 1;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
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
                    ScaffoldKt.m5940ScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
