package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainBottomSheetDragHandle.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"OptionChainBottomSheetDragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "shape", "Landroidx/compose/ui/graphics/Shape;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "OptionChainBottomSheetDragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandleKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetDragHandle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetDragHandle_lgZ2HuY$lambda$2(Modifier modifier, float f, float f2, Shape shape, long j, int i, int i2, Composer composer, int i3) {
        m17156OptionChainBottomSheetDragHandlelgZ2HuY(modifier, f, f2, shape, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /* renamed from: OptionChainBottomSheetDragHandle-lgZ2HuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17156OptionChainBottomSheetDragHandlelgZ2HuY(Modifier modifier, float f, float f2, Shape shape, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float fM7995constructorimpl;
        int i4;
        float fM7995constructorimpl2;
        Shape extraLarge;
        long j2;
        final float f3;
        long jM21427getFg30d7_KjU;
        Modifier modifier3;
        final float f4;
        Shape shape2;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape3;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2111880232);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                fM7995constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fM7995constructorimpl2 = f2;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        extraLarge = shape;
                        int i7 = composerStartRestartGroup.changed(extraLarge) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        extraLarge = shape;
                    }
                    i3 |= i7;
                } else {
                    extraLarge = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        int i8 = composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        j2 = j;
                    }
                    i3 |= i8;
                } else {
                    j2 = j;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(40);
                        }
                        if (i4 != 0) {
                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(4);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getExtraLarge();
                        }
                        if ((i2 & 16) == 0) {
                            i3 &= -57345;
                            f3 = fM7995constructorimpl2;
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                        } else {
                            f3 = fM7995constructorimpl2;
                            jM21427getFg30d7_KjU = j2;
                        }
                        modifier3 = modifier5;
                        f4 = fM7995constructorimpl;
                        shape2 = extraLarge;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        f4 = fM7995constructorimpl;
                        f3 = fM7995constructorimpl2;
                        shape2 = extraLarge;
                        jM21427getFg30d7_KjU = j2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2111880232, i3, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandle (OptionChainBottomSheetDragHandle.kt:24)");
                    }
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, C2002Dp.m7995constructorimpl(16), 5, null);
                    Modifier modifier6 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final String str = "handle";
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandleKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainBottomSheetDragHandle.OptionChainBottomSheetDragHandle_lgZ2HuY$lambda$1$lambda$0(str, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i9 = i3 >> 6;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m5967SurfaceT9BRK9s(SemanticsModifier6.semantics$default(modifierM5146paddingqDBjuR0$default, false, (Function1) objRememberedValue, 1, null), shape2, jM21427getFg30d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(218918493, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandleKt$OptionChainBottomSheetDragHandle$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(218918493, i10, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandle.<anonymous> (OptionChainBottomSheetDragHandle.kt:33)");
                            }
                            BoxKt.Box(SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, f4, f3), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, (i9 & 112) | 12582912 | (i9 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                    shape3 = shape2;
                    j3 = jM21427getFg30d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    f4 = fM7995constructorimpl;
                    f3 = fM7995constructorimpl2;
                    shape3 = extraLarge;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionChainBottomSheetDragHandle.OptionChainBottomSheetDragHandle_lgZ2HuY$lambda$2(modifier4, f4, f3, shape3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            fM7995constructorimpl2 = f2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    modifier3 = modifier5;
                    f4 = fM7995constructorimpl;
                    shape2 = extraLarge;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, C2002Dp.m7995constructorimpl(16), 5, null);
                    Modifier modifier62 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i92 = i3 >> 6;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m5967SurfaceT9BRK9s(SemanticsModifier6.semantics$default(modifierM5146paddingqDBjuR0$default2, false, (Function1) objRememberedValue, 1, null), shape2, jM21427getFg30d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(218918493, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandleKt$OptionChainBottomSheetDragHandle$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(218918493, i10, -1, "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDragHandle.<anonymous> (OptionChainBottomSheetDragHandle.kt:33)");
                            }
                            BoxKt.Box(SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, f4, f3), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, (i92 & 112) | 12582912 | (i92 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                    shape3 = shape2;
                    j3 = jM21427getFg30d7_KjU;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM7995constructorimpl = f;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        fM7995constructorimpl2 = f2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainBottomSheetDragHandle_lgZ2HuY$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }
}
