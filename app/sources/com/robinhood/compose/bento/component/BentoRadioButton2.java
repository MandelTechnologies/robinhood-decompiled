package com.robinhood.compose.bento.component;

import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoRadioButton.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"BentoRadioButton", "", "selected", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "(ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "BentoRadioButtonDay", "(Landroidx/compose/runtime/Composer;I)V", "BentoRadioButtonNight", "BentoRadioButtonPreview", "isDay", "(ZLandroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoRadioButtonKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoRadioButton2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRadioButton$lambda$0(boolean z, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        BentoRadioButton(z, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRadioButtonDay$lambda$1(int i, Composer composer, int i2) {
        BentoRadioButtonDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRadioButtonNight$lambda$2(int i, Composer composer, int i2) {
        BentoRadioButtonNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRadioButtonPreview$lambda$3(boolean z, int i, Composer composer, int i2) {
        BentoRadioButtonPreview(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoRadioButton(final boolean z, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        final Modifier modifier3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1672816055);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z6 = i4 == 0 ? true : z4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1672816055, i3, -1, "com.robinhood.compose.bento.component.BentoRadioButton (BentoRadioButton.kt:22)");
                    }
                    RadioButtonStyle radioButton = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRadioButton(composerStartRestartGroup, 0);
                    RadioButtonKt.RadioButton(z3, null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier4, false, 1, null), z6, new RadioButtonColors(radioButton.m21916getSelectedColor0d7_KjU(), radioButton.m21917getUnselectedColor0d7_KjU(), radioButton.m21914getDisabledSelectedColor0d7_KjU(), radioButton.m21915getDisabledUnselectedColor0d7_KjU(), null), null, composerStartRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 7168), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z5 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoRadioButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoRadioButton2.BentoRadioButton$lambda$0(z, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z4 = z2;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RadioButtonStyle radioButton2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRadioButton(composerStartRestartGroup, 0);
                RadioButtonKt.RadioButton(z3, null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier4, false, 1, null), z6, new RadioButtonColors(radioButton2.m21916getSelectedColor0d7_KjU(), radioButton2.m21917getUnselectedColor0d7_KjU(), radioButton2.m21914getDisabledSelectedColor0d7_KjU(), radioButton2.m21915getDisabledUnselectedColor0d7_KjU(), null), null, composerStartRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 7168), 32);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                z5 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z4 = z2;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BentoRadioButtonDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818645938);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1818645938, i, -1, "com.robinhood.compose.bento.component.BentoRadioButtonDay (BentoRadioButton.kt:52)");
            }
            BentoRadioButtonPreview(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoRadioButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoRadioButton2.BentoRadioButtonDay$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoRadioButtonNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868121070);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868121070, i, -1, "com.robinhood.compose.bento.component.BentoRadioButtonNight (BentoRadioButton.kt:58)");
            }
            BentoRadioButtonPreview(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoRadioButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoRadioButton2.BentoRadioButtonNight$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BentoRadioButtonPreview(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1872005472);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1872005472, i2, -1, "com.robinhood.compose.bento.component.BentoRadioButtonPreview (BentoRadioButton.kt:65)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, BentoRadioButton3.INSTANCE.m20795getLambda$1693665512$lib_compose_bento_externalRelease(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoRadioButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoRadioButton2.BentoRadioButtonPreview$lambda$3(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
