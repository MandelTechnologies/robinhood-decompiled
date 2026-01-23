package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRow;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoToggleRow;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChartToggleSettingRow.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"ChartToggleSettingRow", "", AnnotatedPrivateKey.LABEL, "", "state", "", "onToggle", "Lkotlin/Function1;", "enabled", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewChartToggleSettingRow", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "localState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartToggleSettingRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartToggleSettingRow$lambda$3(String str, boolean z, Function1 function1, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartToggleSettingRow(str, z, function1, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartToggleSettingRow$lambda$4(int i, Composer composer, int i2) {
        PreviewChartToggleSettingRow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartToggleSettingRow(final String label, final boolean z, final Function1<? super Boolean, Unit> onToggle, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        boolean z5;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onToggle, "onToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1670226880);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onToggle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670226880, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRow (ChartToggleSettingRow.kt:26)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z5 = (i3 & 112) != 32;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-258461304, true, new C106941(modifier5, z4, (SnapshotState) objRememberedValue, onToggle, label), composerStartRestartGroup, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChartToggleSettingRow.ChartToggleSettingRow$lambda$3(label, z, onToggle, z2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z5) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-258461304, true, new C106941(modifier52, z4, (SnapshotState) objRememberedValue, onToggle, label), composerStartRestartGroup, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: ChartToggleSettingRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt$ChartToggleSettingRow$1 */
    static final class C106941 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ String $label;
        final /* synthetic */ SnapshotState<Boolean> $localState$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onToggle;

        /* JADX WARN: Multi-variable type inference failed */
        C106941(Modifier modifier, boolean z, SnapshotState<Boolean> snapshotState, Function1<? super Boolean, Unit> function1, String str) {
            this.$modifier = modifier;
            this.$enabled = z;
            this.$localState$delegate = snapshotState;
            this.$onToggle = function1;
            this.$label = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258461304, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRow.<anonymous> (ChartToggleSettingRow.kt:29)");
            }
            Modifier modifier = this.$modifier;
            boolean z = this.$enabled;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$localState$delegate) | composer.changed(this.$onToggle);
            final Function1<Boolean, Unit> function1 = this.$onToggle;
            final SnapshotState<Boolean> snapshotState = this.$localState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt$ChartToggleSettingRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartToggleSettingRow.C106941.invoke$lambda$1$lambda$0(function1, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier, z, null, null, (Function0) objRememberedValue, 6, null);
            final boolean z2 = this.$enabled;
            final String str = this.$label;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-618110485, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt.ChartToggleSettingRow.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    long jM21427getFg30d7_KjU;
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-618110485, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRow.<anonymous>.<anonymous> (ChartToggleSettingRow.kt:36)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 1, null);
                    TextStyle textM = bentoTheme.getTypography(composer2, i3).getTextM();
                    if (z2) {
                        composer2.startReplaceGroup(-1604411565);
                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1604338126);
                        jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(str, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer2, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final boolean z3 = this.$enabled;
            final SnapshotState<Boolean> snapshotState2 = this.$localState$delegate;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, null, composableLambdaRememberComposableLambda, null, null, ComposableLambda3.rememberComposableLambda(835800008, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt.ChartToggleSettingRow.1.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(835800008, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRow.<anonymous>.<anonymous> (ChartToggleSettingRow.kt:48)");
                    }
                    boolean zChartToggleSettingRow$lambda$1 = ChartToggleSettingRow.ChartToggleSettingRow$lambda$1(snapshotState2);
                    BentoToggleRow.Companion companion = BentoToggleRow.INSTANCE;
                    boolean z4 = z3;
                    ToggleRowStyle toggleRow = ((Styles) composer2.consume(Styles2.getLocalStyles())).getToggleRow(composer2, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    SwitchKt.Switch(zChartToggleSettingRow$lambda$1, null, null, null, z3, companion.create(z4, ToggleRowStyle.m22032copydaRQuJA$default(toggleRow, 0L, 0L, 0L, bentoTheme.getColors(composer2, i3).m21456getPositive0d7_KjU(), 0L, 0L, 0L, 0L, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i3).getNova(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i3).m21456getPositive0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 7415, null), composer2, (ToggleRowStyle.$stable << 3) | 384).switchColors(composer2, BentoToggleRow.$stable), null, composer2, 48, 76);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), false, true, false, null, composer, 102239232, 0, 1718);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState) {
            ChartToggleSettingRow.ChartToggleSettingRow$lambda$2(snapshotState, !ChartToggleSettingRow.ChartToggleSettingRow$lambda$1(snapshotState));
            function1.invoke(Boolean.valueOf(ChartToggleSettingRow.ChartToggleSettingRow$lambda$1(snapshotState)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartToggleSettingRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void PreviewChartToggleSettingRow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-997782963);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-997782963, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.PreviewChartToggleSettingRow (ChartToggleSettingRow.kt:68)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ChartToggleSettingRow2.INSTANCE.m1760x19d4a95(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ChartToggleSettingRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartToggleSettingRow.PreviewChartToggleSettingRow$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChartToggleSettingRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
