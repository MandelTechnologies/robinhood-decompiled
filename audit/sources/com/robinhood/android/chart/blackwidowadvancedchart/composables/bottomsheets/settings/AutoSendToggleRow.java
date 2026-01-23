package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRow;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoSendToggleRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"AutoSendToggleRow", "", "checked", "", "onAutoSendToggled", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewAutoSendToggleRow", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AutoSendToggleRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSendToggleRow$lambda$0(boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AutoSendToggleRow(z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAutoSendToggleRow$lambda$1(int i, Composer composer, int i2) {
        PreviewAutoSendToggleRow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: AutoSendToggleRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRowKt$AutoSendToggleRow$1 */
    static final class C106871 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $checked;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onAutoSendToggled;

        /* JADX WARN: Multi-variable type inference failed */
        C106871(Modifier modifier, boolean z, Function1<? super Boolean, Unit> function1) {
            this.$modifier = modifier;
            this.$checked = z;
            this.$onAutoSendToggled = function1;
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
                ComposerKt.traceEventStart(-852279293, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRow.<anonymous> (AutoSendToggleRow.kt:22)");
            }
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRowKt$AutoSendToggleRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AutoSendToggleRow.C106871.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null);
            BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(null, StringResources_androidKt.stringResource(C10963R.string.auto_send_title, composer, 0), new BentoToggleRowState.Text.Plain(StringResources_androidKt.stringResource(C10963R.string.auto_send_secondary_text, composer, 0)), false, this.$checked, null, null, false, false, false, 1001, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAutoSendToggled) | composer.changed(this.$checked);
            final Function1<Boolean, Unit> function1 = this.$onAutoSendToggled;
            final boolean z = this.$checked;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRowKt$AutoSendToggleRow$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AutoSendToggleRow.C106871.invoke$lambda$3$lambda$2(function1, z, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoToggleRow3.BentoToggleRow(bentoToggleRowState, (Function1) objRememberedValue2, modifierSemantics$default, composer, BentoToggleRowState.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "autosend_toggle");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, boolean z, boolean z2) {
            function1.invoke(Boolean.valueOf(!z));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoSendToggleRow(final boolean z, final Function1<? super Boolean, Unit> onAutoSendToggled, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAutoSendToggled, "onAutoSendToggled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1705720757);
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
            i3 |= composerStartRestartGroup.changedInstance(onAutoSendToggled) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1705720757, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRow (AutoSendToggleRow.kt:20)");
                }
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-852279293, true, new C106871(modifier4, z, onAutoSendToggled), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AutoSendToggleRow.AutoSendToggleRow$lambda$0(z, onAutoSendToggled, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-852279293, true, new C106871(modifier4, z, onAutoSendToggled), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewAutoSendToggleRow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(944607149);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(944607149, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.PreviewAutoSendToggleRow (AutoSendToggleRow.kt:41)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.NEGATIVE, AutoSendToggleRow2.INSTANCE.m1754x2013bca6(), composerStartRestartGroup, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.AutoSendToggleRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutoSendToggleRow.PreviewAutoSendToggleRow$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
