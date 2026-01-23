package com.robinhood.compose.bento.component;

import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoDivider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a%\u0010\f\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"BentoHorizontalDivider", "", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "BentoHorizontalDivider-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "BentoVerticalDivider", "BentoVerticalDivider-aM-cp0Q", "topHorizontalDivider", "topHorizontalDivider-Hht5A8o", "(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoDividerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoDivider {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoHorizontalDivider_aM_cp0Q$lambda$0(Modifier modifier, long j, float f, int i, int i2, Composer composer, int i3) {
        m20635BentoHorizontalDivideraMcp0Q(modifier, j, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoVerticalDivider_aM_cp0Q$lambda$1(Modifier modifier, long j, float f, int i, int i2, Composer composer, int i3) {
        m20636BentoVerticalDivideraMcp0Q(modifier, j, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoHorizontalDivider-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20635BentoHorizontalDivideraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        int i3;
        float fM7995constructorimpl;
        long jM21425getFg0d7_KjU;
        Modifier modifier2;
        long j2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1027808320);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                fM7995constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i4 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) == 0) {
                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                        i3 &= -113;
                    } else {
                        jM21425getFg0d7_KjU = j;
                    }
                    if (i5 == 0) {
                        modifier2 = modifier;
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    } else {
                        modifier2 = modifier;
                    }
                    j2 = jM21425getFg0d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    modifier2 = modifier;
                    j2 = j;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1027808320, i3, -1, "com.robinhood.compose.bento.component.BentoHorizontalDivider (BentoDivider.kt:20)");
                }
                Divider5.m5851HorizontalDivider9IZ8Weo(modifier2, fM7995constructorimpl, j2, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                j3 = j2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j3 = j;
            }
            final float f2 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoDividerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoDivider.BentoHorizontalDivider_aM_cp0Q$lambda$0(modifier3, j3, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        fM7995constructorimpl = f;
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i5 == 0) {
                }
                j2 = jM21425getFg0d7_KjU;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Divider5.m5851HorizontalDivider9IZ8Weo(modifier2, fM7995constructorimpl, j2, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                j3 = j2;
            }
        }
        final float f22 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoVerticalDivider-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20636BentoVerticalDivideraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        int i3;
        float fM7995constructorimpl;
        long jM21425getFg0d7_KjU;
        Modifier modifier2;
        long j2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1663208530);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                fM7995constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i4 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) == 0) {
                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21425getFg0d7_KjU();
                        i3 &= -113;
                    } else {
                        jM21425getFg0d7_KjU = j;
                    }
                    if (i5 == 0) {
                        modifier2 = modifier;
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    } else {
                        modifier2 = modifier;
                    }
                    j2 = jM21425getFg0d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    modifier2 = modifier;
                    j2 = j;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1663208530, i3, -1, "com.robinhood.compose.bento.component.BentoVerticalDivider (BentoDivider.kt:33)");
                }
                Divider5.m5852VerticalDivider9IZ8Weo(modifier2, fM7995constructorimpl, j2, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                j3 = j2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j3 = j;
            }
            final float f2 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoDividerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoDivider.BentoVerticalDivider_aM_cp0Q$lambda$1(modifier3, j3, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        fM7995constructorimpl = f;
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i5 == 0) {
                }
                j2 = jM21425getFg0d7_KjU;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Divider5.m5852VerticalDivider9IZ8Weo(modifier2, fM7995constructorimpl, j2, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                j3 = j2;
            }
        }
        final float f22 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: topHorizontalDivider-Hht5A8o$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20638topHorizontalDividerHht5A8o$default(Modifier modifier, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m6726getUnspecified0d7_KjU();
        }
        if ((i & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(1);
        }
        return m20637topHorizontalDividerHht5A8o(modifier, j, f);
    }

    /* renamed from: topHorizontalDivider-Hht5A8o, reason: not valid java name */
    public static final Modifier m20637topHorizontalDividerHht5A8o(Modifier topHorizontalDivider, long j, float f) {
        Intrinsics.checkNotNullParameter(topHorizontalDivider, "$this$topHorizontalDivider");
        return ComposedModifier2.composed$default(topHorizontalDivider, null, new BentoDivider2(j, f), 1, null);
    }
}
