package com.robinhood.compose.bento.component;

import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.CheckboxStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoCheckbox.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"BentoCheckbox", "", "modifier", "Landroidx/compose/ui/Modifier;", "checked", "", "enabled", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "onCheckedChange", "Lkotlin/Function1;", "BentoCheckbox-Sj8uqqQ", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoCheckboxKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCheckbox2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCheckbox_Sj8uqqQ$lambda$0(Modifier modifier, boolean z, boolean z2, Color color, Function1 function1, int i, int i2, Composer composer, int i3) {
        m20599BentoCheckboxSj8uqqQ(modifier, z, z2, color, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoCheckbox-Sj8uqqQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20599BentoCheckboxSj8uqqQ(Modifier modifier, final boolean z, boolean z2, Color color, final Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        Color color2;
        final Modifier modifier3;
        Composer composer2;
        final boolean z5;
        final Color color3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(910251985);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        color2 = color;
                        i3 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
                    }
                    if ((i2 & 16) != 0) {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i4 == 0 ? true : z4;
                            Color color4 = i5 == 0 ? null : color2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(910251985, i3, -1, "com.robinhood.compose.bento.component.BentoCheckbox (BentoCheckbox.kt:23)");
                            }
                            CheckboxStyle checkBox = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCheckBox(composerStartRestartGroup, 0);
                            composer2 = composerStartRestartGroup;
                            boolean z7 = z6;
                            CheckboxKt.Checkbox(z3, function1, LocalShowPlaceholder.withBentoPlaceholder$default(modifier3, false, null, 3, null), z7, CheckboxDefaults.INSTANCE.m5735colors5tl4gsc(color4 == null ? color4.getValue() : checkBox.m21737getCheckedColor0d7_KjU(), checkBox.m21741getUncheckedColor0d7_KjU(), checkBox.m21738getCheckmarkColor0d7_KjU(), checkBox.m21739getDisabledCheckedColor0d7_KjU(), checkBox.m21740getDisabledUncheckedColor0d7_KjU(), 0L, composer2, CheckboxDefaults.$stable << 18, 32), null, composer2, ((i3 >> 3) & 14) | ((i3 >> 9) & 112) | ((i3 << 3) & 7168), 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z7;
                            color3 = color4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            color3 = color2;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoCheckboxKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoCheckbox2.BentoCheckbox_Sj8uqqQ$lambda$0(modifier3, z, z5, color3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    if ((i3 & 9363) != 9362) {
                        if (i6 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        CheckboxStyle checkBox2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCheckBox(composerStartRestartGroup, 0);
                        composer2 = composerStartRestartGroup;
                        boolean z72 = z6;
                        CheckboxKt.Checkbox(z3, function1, LocalShowPlaceholder.withBentoPlaceholder$default(modifier3, false, null, 3, null), z72, CheckboxDefaults.INSTANCE.m5735colors5tl4gsc(color4 == null ? color4.getValue() : checkBox2.m21737getCheckedColor0d7_KjU(), checkBox2.m21741getUncheckedColor0d7_KjU(), checkBox2.m21738getCheckmarkColor0d7_KjU(), checkBox2.m21739getDisabledCheckedColor0d7_KjU(), checkBox2.m21740getDisabledUncheckedColor0d7_KjU(), 0L, composer2, CheckboxDefaults.$stable << 18, 32), null, composer2, ((i3 >> 3) & 14) | ((i3 >> 9) & 112) | ((i3 << 3) & 7168), 32);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = z72;
                        color3 = color4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                color2 = color;
                if ((i2 & 16) != 0) {
                }
                if ((i3 & 9363) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            color2 = color;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        color2 = color;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
