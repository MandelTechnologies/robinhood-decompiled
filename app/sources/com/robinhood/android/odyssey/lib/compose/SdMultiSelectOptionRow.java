package com.robinhood.android.odyssey.lib.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSelectionConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdMultiSelectOptionRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SdMultiSelectOptionRow", "", "selected", "", "enabled", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "checkboxPosition", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdMultiSelectOptionRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdMultiSelectOptionRow$lambda$1(boolean z, boolean z2, ApiSdOption apiSdOption, ApiSelectionConfig.CheckboxPosition checkboxPosition, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SdMultiSelectOptionRow(z, z2, apiSdOption, checkboxPosition, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SdMultiSelectOptionRow(final boolean z, boolean z2, final ApiSdOption option, final ApiSelectionConfig.CheckboxPosition checkboxPosition, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final boolean z3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(checkboxPosition, "checkboxPosition");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145997514);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(option) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(checkboxPosition.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1145997514, i3, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRow (SdMultiSelectOptionRow.kt:21)");
                }
                z3 = z2;
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), z3, null, null, onClick, 6, null);
                composerStartRestartGroup.startReplaceGroup(-1791968627);
                ComposableLambda composableLambdaRememberComposableLambda = checkboxPosition != ApiSelectionConfig.CheckboxPosition.LEFT ? ComposableLambda3.rememberComposableLambda(-699237057, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt.SdMultiSelectOptionRow.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-699237057, i5, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRow.<anonymous> (SdMultiSelectOptionRow.kt:31)");
                        }
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, z, z3, null, null, composer3, 24576, 9);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(527843225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt.SdMultiSelectOptionRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        long jM21427getFg30d7_KjU;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(527843225, i5, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRow.<anonymous> (SdMultiSelectOptionRow.kt:41)");
                        }
                        String display_label = option.getDisplay_label();
                        if (z3) {
                            composer3.startReplaceGroup(451202299);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                        } else {
                            composer3.startReplaceGroup(451203132);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(display_label, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                final String description = option.getDescription();
                composerStartRestartGroup.startReplaceGroup(-1791948863);
                ComposableLambda composableLambdaRememberComposableLambda3 = description != null ? null : ComposableLambda3.rememberComposableLambda(-2022661981, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt$SdMultiSelectOptionRow$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        long jM21427getFg30d7_KjU;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2022661981, i5, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRow.<anonymous>.<anonymous> (SdMultiSelectOptionRow.kt:49)");
                        }
                        String str = description;
                        if (z3) {
                            composer3.startReplaceGroup(1842025158);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composer3.startReplaceGroup(1842026022);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1791939577);
                ComposableLambda composableLambdaRememberComposableLambda4 = checkboxPosition == ApiSelectionConfig.CheckboxPosition.RIGHT ? ComposableLambda3.rememberComposableLambda(-265273413, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt.SdMultiSelectOptionRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-265273413, i5, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRow.<anonymous> (SdMultiSelectOptionRow.kt:58)");
                        }
                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, z, false, null, null, composer3, 24576, 13);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, null, composableLambdaRememberComposableLambda4, false, false, false, null, composer2, 3072, 0, 1954);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final boolean z4 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SdMultiSelectOptionRow.SdMultiSelectOptionRow$lambda$1(z, z4, option, checkboxPosition, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), z3, null, null, onClick, 6, null);
            composerStartRestartGroup.startReplaceGroup(-1791968627);
            if (checkboxPosition != ApiSelectionConfig.CheckboxPosition.LEFT) {
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(527843225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRowKt.SdMultiSelectOptionRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    long jM21427getFg30d7_KjU;
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(527843225, i5, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionRow.<anonymous> (SdMultiSelectOptionRow.kt:41)");
                    }
                    String display_label = option.getDisplay_label();
                    if (z3) {
                        composer3.startReplaceGroup(451202299);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                    } else {
                        composer3.startReplaceGroup(451203132);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                    }
                    composer3.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(display_label, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            final String description2 = option.getDescription();
            composerStartRestartGroup.startReplaceGroup(-1791948863);
            if (description2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1791939577);
            if (checkboxPosition == ApiSelectionConfig.CheckboxPosition.RIGHT) {
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default2, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda22, composableLambdaRememberComposableLambda3, null, composableLambdaRememberComposableLambda4, false, false, false, null, composer2, 3072, 0, 1954);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
