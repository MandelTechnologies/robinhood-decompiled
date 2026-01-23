package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoChipGrid.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aE\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "", "rows", "Landroidx/compose/foundation/layout/PaddingValues;", "edgePadding", "Lkotlin/Function0;", "", "content", "BentoChipGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ILandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BentoChipGridPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoChipGridPreviewWithEdgePadding", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoChipGridKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoChipGrid2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipGrid$lambda$0(Modifier modifier, ScrollState scrollState, int i, PaddingValues paddingValues, Function2 function2, int i2, int i3, Composer composer, int i4) {
        BentoChipGrid(modifier, scrollState, i, paddingValues, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipGridPreview$lambda$1(int i, Composer composer, int i2) {
        BentoChipGridPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipGridPreviewWithEdgePadding$lambda$2(int i, Composer composer, int i2) {
        BentoChipGridPreviewWithEdgePadding(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoChipGrid(Modifier modifier, ScrollState scrollState, int i, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        ScrollState scrollState2;
        int i5;
        int i6;
        PaddingValues paddingValues2;
        ScrollState scrollStateRememberScrollState;
        Modifier modifier3;
        ScrollState scrollState3;
        PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default;
        int i7;
        final int i8;
        final PaddingValues paddingValues3;
        final Modifier modifier4;
        final ScrollState scrollState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(949333516);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                scrollState2 = scrollState;
                int i10 = composerStartRestartGroup.changed(scrollState2) ? 32 : 16;
                i4 |= i10;
            } else {
                scrollState2 = scrollState;
            }
            i4 |= i10;
        } else {
            scrollState2 = scrollState;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) == 0) {
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            i4 &= -113;
                        } else {
                            scrollStateRememberScrollState = scrollState2;
                        }
                        if (i11 != 0) {
                            i5 = 3;
                        }
                        if (i6 == 0) {
                            paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(C2002Dp.m7995constructorimpl(0), 0.0f, 2, null);
                            modifier3 = modifier5;
                            scrollState3 = scrollStateRememberScrollState;
                            i7 = i5;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(949333516, i4, -1, "com.robinhood.compose.bento.component.BentoChipGrid (BentoChipGrid.kt:18)");
                            }
                            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(modifier3, scrollState3, false, null, false, 14, null);
                            BentoChipGrid bentoChipGrid = BentoChipGrid.INSTANCE;
                            int i12 = i4 >> 3;
                            HorizontalStaggeredGrid4.m20813HorizontalStaggeredGridnSlTg7c(modifierHorizontalScroll$default, i7, paddingValuesM5137PaddingValuesYgX7TsA$default, bentoChipGrid.m20600getHorizontalSpacingD9Ej5fM(), bentoChipGrid.m20601getVerticalSpacingD9Ej5fM(), content, composerStartRestartGroup, ((i4 << 3) & 458752) | (i12 & 896) | (i12 & 112) | 27648, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i8 = i7;
                            paddingValues3 = paddingValuesM5137PaddingValuesYgX7TsA$default;
                            modifier4 = modifier3;
                            scrollState4 = scrollState3;
                        } else {
                            modifier3 = modifier5;
                            scrollState3 = scrollStateRememberScrollState;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                    }
                    i7 = i5;
                    paddingValuesM5137PaddingValuesYgX7TsA$default = paddingValues2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierHorizontalScroll$default2 = ScrollKt.horizontalScroll$default(modifier3, scrollState3, false, null, false, 14, null);
                    BentoChipGrid bentoChipGrid2 = BentoChipGrid.INSTANCE;
                    int i122 = i4 >> 3;
                    HorizontalStaggeredGrid4.m20813HorizontalStaggeredGridnSlTg7c(modifierHorizontalScroll$default2, i7, paddingValuesM5137PaddingValuesYgX7TsA$default, bentoChipGrid2.m20600getHorizontalSpacingD9Ej5fM(), bentoChipGrid2.m20601getVerticalSpacingD9Ej5fM(), content, composerStartRestartGroup, ((i4 << 3) & 458752) | (i122 & 896) | (i122 & 112) | 27648, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i8 = i7;
                    paddingValues3 = paddingValuesM5137PaddingValuesYgX7TsA$default;
                    modifier4 = modifier3;
                    scrollState4 = scrollState3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    scrollState4 = scrollState2;
                    i8 = i5;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipGridKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoChipGrid2.BentoChipGrid$lambda$0(modifier4, scrollState4, i8, paddingValues3, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            paddingValues2 = paddingValues;
            if ((i3 & 16) != 0) {
            }
            if ((i4 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 2) == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i6 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i3 & 16) != 0) {
        }
        if ((i4 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BentoChipGridPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(276340856);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(276340856, i, -1, "com.robinhood.compose.bento.component.BentoChipGridPreview (BentoChipGrid.kt:37)");
            }
            BentoChipGrid(null, null, 3, null, BentoChipGrid3.INSTANCE.m20781getLambda$865968145$lib_compose_bento_externalRelease(), composerStartRestartGroup, 24960, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipGridKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChipGrid2.BentoChipGridPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoChipGridPreviewWithEdgePadding(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-462852726);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462852726, i, -1, "com.robinhood.compose.bento.component.BentoChipGridPreviewWithEdgePadding (BentoChipGrid.kt:50)");
            }
            BentoChipGrid(null, null, 3, PaddingKt.m5137PaddingValuesYgX7TsA$default(C2002Dp.m7995constructorimpl(16), 0.0f, 2, null), BentoChipGrid3.INSTANCE.getLambda$1756885299$lib_compose_bento_externalRelease(), composerStartRestartGroup, 28032, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipGridKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChipGrid2.BentoChipGridPreviewWithEdgePadding$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
