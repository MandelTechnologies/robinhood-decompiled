package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SwitcherButton.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SwitcherButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-uk-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButtonKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SwitcherButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitcherButton$lambda$0(Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        SwitcherButton(modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwitcherButton(Modifier modifier, boolean z, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final boolean z2;
        long jM21427getFg30d7_KjU;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1137109353);
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
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    z2 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1137109353, i3, -1, "com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButton (SwitcherButton.kt:23)");
                }
                Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(modifier4, C2002Dp.m7995constructorimpl(32), C2002Dp.m7995constructorimpl(24));
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) 0.5d);
                if (z2) {
                    composerStartRestartGroup.startReplaceGroup(1840409900);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1840409067);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, jM21427getFg30d7_KjU);
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                z3 = z2;
                ButtonKt.Button(onClick, modifierM5171sizeVpY3zN4, z3, roundedCornerShapeM5327RoundedCornerShape0680j_4, buttonDefaults.m5719buttonColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), null, borderStrokeM4886BorderStrokecXLIe8U, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(8), C2002Dp.m7995constructorimpl(4)), null, ComposableLambda3.rememberComposableLambda(-1708187783, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButtonKt.SwitcherButton.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 Button, Composer composer2, int i7) {
                        long jM21427getFg30d7_KjU2;
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1708187783, i7, -1, "com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButton.<anonymous> (SwitcherButton.kt:42)");
                        }
                        Modifier modifierRotate = Rotate.rotate(Modifier.INSTANCE, 90.0f);
                        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRANSFERS_16);
                        String strStringResource = StringResources_androidKt.stringResource(C31333R.string.switch_currency_input, composer2, 0);
                        if (z2) {
                            composer2.startReplaceGroup(-890943685);
                            jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-890942852);
                            jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21427getFg30d7_KjU2, modifierRotate, null, false, composer2, BentoIcon4.Size16.$stable | 3072, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 818085888 | ((i3 << 3) & 896), 256);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SwitcherButton.SwitcherButton$lambda$0(modifier3, z3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(modifier4, C2002Dp.m7995constructorimpl(32), C2002Dp.m7995constructorimpl(24));
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl((float) 0.5d);
            if (z2) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl2, jM21427getFg30d7_KjU);
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifier52 = modifier4;
            z3 = z2;
            ButtonKt.Button(onClick, modifierM5171sizeVpY3zN42, z3, roundedCornerShapeM5327RoundedCornerShape0680j_42, buttonDefaults2.m5719buttonColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21427getFg30d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), null, borderStrokeM4886BorderStrokecXLIe8U2, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(8), C2002Dp.m7995constructorimpl(4)), null, ComposableLambda3.rememberComposableLambda(-1708187783, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButtonKt.SwitcherButton.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 Button, Composer composer2, int i7) {
                    long jM21427getFg30d7_KjU2;
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i7 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1708187783, i7, -1, "com.robinhood.android.ui.transfers.ekiben.uk.SwitcherButton.<anonymous> (SwitcherButton.kt:42)");
                    }
                    Modifier modifierRotate = Rotate.rotate(Modifier.INSTANCE, 90.0f);
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRANSFERS_16);
                    String strStringResource = StringResources_androidKt.stringResource(C31333R.string.switch_currency_input, composer2, 0);
                    if (z2) {
                        composer2.startReplaceGroup(-890943685);
                        jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                    } else {
                        composer2.startReplaceGroup(-890942852);
                        jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                    }
                    composer2.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21427getFg30d7_KjU2, modifierRotate, null, false, composer2, BentoIcon4.Size16.$stable | 3072, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 818085888 | ((i3 << 3) & 896), 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
