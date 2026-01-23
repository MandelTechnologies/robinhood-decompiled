package com.robinhood.android.common.gold;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BentoAppBarWithTransition.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a£\u0001\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001c²\u0006\f\u0010\u0011\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/unit/Dp;", "headerHeight", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/robinhood/compose/bento/component/BentoAppBarScope;", "", "Lkotlin/ExtensionFunctionType;", "navigationIcon", "", "titleText", "onAppBarHeightUpdated", "", "Lkotlin/ParameterName;", "name", "isScrolledPastHeader", "onScrollPastHeader", "Landroidx/compose/ui/graphics/Color;", "surfaceColor", "titleColor", "BentoAppBarWithTransition-zVdqMik", "(Landroidx/compose/foundation/ScrollState;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JJLandroidx/compose/runtime/Composer;II)V", "BentoAppBarWithTransition", "", "alpha", "appBarHeight", "feature-lib-gold_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.gold.BentoAppBarWithTransitionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BentoAppBarWithTransition {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAppBarWithTransition_zVdqMik$lambda$9(ScrollState scrollState, float f, Modifier modifier, Function3 function3, String str, Function1 function1, Function1 function12, long j, long j2, int i, int i2, Composer composer, int i3) {
        m12210BentoAppBarWithTransitionzVdqMik(scrollState, f, modifier, function3, str, function1, function12, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /* renamed from: BentoAppBarWithTransition-zVdqMik, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12210BentoAppBarWithTransitionzVdqMik(final ScrollState scrollState, final float f, Modifier modifier, Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function3, String str, Function1<? super C2002Dp, Unit> function1, Function1<? super Boolean, Unit> function12, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> lambda$2020769610$feature_lib_gold_externalRelease;
        int i5;
        String str2;
        int i6;
        Function1<? super C2002Dp, Unit> function13;
        int i7;
        int i8;
        int i9;
        Function1<? super Boolean, Unit> function14;
        long jet;
        long nova;
        Modifier modifier3;
        Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function32;
        String str3;
        Function1<? super C2002Dp, Unit> function15;
        int i10;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Modifier modifier4;
        long j3;
        final Function1<? super C2002Dp, Unit> function16;
        final String str4;
        final Function1<? super Boolean, Unit> function17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1065343545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    lambda$2020769610$feature_lib_gold_externalRelease = function3;
                    i3 |= composerStartRestartGroup.changedInstance(lambda$2020769610$feature_lib_gold_externalRelease) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function13 = function1;
                            i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0) {
                                i11 = i3;
                                int i13 = composerStartRestartGroup.changed(j) ? 8388608 : 4194304;
                                i8 = i11 | i13;
                            } else {
                                i11 = i3;
                            }
                            i8 = i11 | i13;
                        } else {
                            i8 = i3;
                        }
                        if ((i & 100663296) == 0) {
                            i8 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(j2)) ? 67108864 : 33554432;
                        }
                        i9 = i8;
                        if ((i9 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    lambda$2020769610$feature_lib_gold_externalRelease = BentoAppBarWithTransition4.INSTANCE.getLambda$2020769610$feature_lib_gold_externalRelease();
                                }
                                if (i5 != 0) {
                                    str2 = null;
                                }
                                if (i6 != 0) {
                                    function13 = null;
                                }
                                function14 = i7 == 0 ? null : function12;
                                if ((i2 & 128) == 0) {
                                    jet = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet();
                                    i9 &= -29360129;
                                } else {
                                    jet = j;
                                }
                                if ((i2 & 256) == 0) {
                                    i10 = i9 & (-234881025);
                                    nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                                    modifier3 = modifier2;
                                    function32 = lambda$2020769610$feature_lib_gold_externalRelease;
                                    str3 = str2;
                                    function15 = function13;
                                } else {
                                    nova = j2;
                                    modifier3 = modifier2;
                                    function32 = lambda$2020769610$feature_lib_gold_externalRelease;
                                    str3 = str2;
                                    function15 = function13;
                                    i10 = i9;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i14 = (i2 & 128) != 0 ? i9 & (-29360129) : i9;
                                if ((i2 & 256) != 0) {
                                    i14 &= -234881025;
                                }
                                jet = j;
                                nova = j2;
                                i10 = i14;
                                modifier3 = modifier2;
                                function32 = lambda$2020769610$feature_lib_gold_externalRelease;
                                str3 = str2;
                                function15 = function13;
                                function14 = function12;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1065343545, i10, -1, "com.robinhood.android.common.gold.BentoAppBarWithTransition (BentoAppBarWithTransition.kt:49)");
                            }
                            final float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f) * 0.5f;
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.common.gold.BentoAppBarWithTransitionKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Boolean.valueOf(BentoAppBarWithTransition.BentoAppBarWithTransition_zVdqMik$lambda$2$lambda$1(scrollState, fMo5016toPx0680j_4));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!BentoAppBarWithTransition_zVdqMik$lambda$3(snapshotState4) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(300, 0, Easing3.getLinearEasing(), 2, null), 0.0f, "appBarAlpha", null, composerStartRestartGroup, 3072, 20);
                            composerStartRestartGroup.startReplaceGroup(1592961518);
                            if (function14 != null) {
                                Boolean boolValueOf = Boolean.valueOf(BentoAppBarWithTransition_zVdqMik$lambda$3(snapshotState4));
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean z = (i10 & 3670016) == 1048576;
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new BentoAppBarWithTransition2(function14, snapshotState4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C11182R.dimen.bento_app_bar_with_transition_default_height, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(fDimensionResource), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            long j4 = jet;
                            modifier4 = modifier3;
                            Function1<? super C2002Dp, Unit> function18 = function15;
                            lambda$2020769610$feature_lib_gold_externalRelease = function32;
                            SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.m6705copywmQWz5c$default(j4, BentoAppBarWithTransition_zVdqMik$lambda$4(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-2054153772, true, new BentoAppBarWithTransition3(modifier3, function15, function32, density, (SnapshotState) objRememberedValue2, str3, nova, snapshotState4AnimateFloatAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j3 = j4;
                            function16 = function18;
                            str4 = str3;
                            function17 = function14;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            nova = j2;
                            modifier4 = modifier2;
                            str4 = str2;
                            function16 = function13;
                            function17 = function12;
                            j3 = j;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier4;
                            final Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function33 = lambda$2020769610$feature_lib_gold_externalRelease;
                            final long j5 = j3;
                            final long j6 = nova;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.BentoAppBarWithTransitionKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoAppBarWithTransition.BentoAppBarWithTransition_zVdqMik$lambda$9(scrollState, f, modifier5, function33, str4, function16, function17, j5, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function13 = function1;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    i9 = i8;
                    if ((i9 & 38347923) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                            if ((i2 & 256) == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f) * 0.5f;
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!BentoAppBarWithTransition_zVdqMik$lambda$3(snapshotState42) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(300, 0, Easing3.getLinearEasing(), 2, null), 0.0f, "appBarAlpha", null, composerStartRestartGroup, 3072, 20);
                            composerStartRestartGroup.startReplaceGroup(1592961518);
                            if (function14 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(C11182R.dimen.bento_app_bar_with_transition_default_height, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            long j42 = jet;
                            modifier4 = modifier3;
                            Function1<? super C2002Dp, Unit> function182 = function15;
                            lambda$2020769610$feature_lib_gold_externalRelease = function32;
                            SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.m6705copywmQWz5c$default(j42, BentoAppBarWithTransition_zVdqMik$lambda$4(snapshotState4AnimateFloatAsState2), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-2054153772, true, new BentoAppBarWithTransition3(modifier3, function15, function32, density2, (SnapshotState) objRememberedValue2, str3, nova, snapshotState4AnimateFloatAsState2), composerStartRestartGroup, 54), composerStartRestartGroup, 12582918, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j3 = j42;
                            function16 = function182;
                            str4 = str3;
                            function17 = function14;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function13 = function1;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i8;
                if ((i9 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            lambda$2020769610$feature_lib_gold_externalRelease = function3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function13 = function1;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i8;
            if ((i9 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        lambda$2020769610$feature_lib_gold_externalRelease = function3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function13 = function1;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i8;
        if ((i9 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoAppBarWithTransition_zVdqMik$lambda$2$lambda$1(ScrollState scrollState, float f) {
        return ((float) scrollState.getValue()) > f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoAppBarWithTransition_zVdqMik$lambda$8(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoAppBarWithTransition_zVdqMik$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BentoAppBarWithTransition_zVdqMik$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BentoAppBarWithTransition_zVdqMik$lambda$7(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }
}
