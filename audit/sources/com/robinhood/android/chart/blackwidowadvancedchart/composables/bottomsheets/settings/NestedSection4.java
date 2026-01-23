package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: NestedSection.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"NestedSection", "", AnnotatedPrivateKey.LABEL, "", "onShowNestedSection", "Lkotlin/Function0;", "enabled", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "NestedSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class NestedSection4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NestedSection$lambda$3(String str, Function0 function0, boolean z, int i, Composer composer, int i2) {
        NestedSection(str, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NestedSectionPreview$lambda$4(int i, Composer composer, int i2) {
        NestedSectionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NestedSection(final String label, final Function0<Unit> onShowNestedSection, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onShowNestedSection, "onShowNestedSection");
        Composer composerStartRestartGroup = composer.startRestartGroup(1531996832);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowNestedSection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1531996832, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSection (NestedSection.kt:22)");
            }
            composerStartRestartGroup.startReplaceGroup(-924819146);
            Modifier modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
            Intrinsics.checkNotNull(modifierM4893clickableXHw0xAI$default, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            if (z) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z2 = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NestedSection4.NestedSection$lambda$2$lambda$1$lambda$0(onShowNestedSection);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, (Function0) objRememberedValue, 7, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5144paddingVpY3zN4$default(modifierM4893clickableXHw0xAI$default, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, ComposableLambda3.rememberComposableLambda(-241255075, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionKt.NestedSection.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    long jM21427getFg30d7_KjU;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-241255075, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSection.<anonymous> (NestedSection.kt:33)");
                    }
                    String str = label;
                    if (z) {
                        composer3.startReplaceGroup(-1749559991);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1749494488);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1894230112, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionKt.NestedSection.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    long jM21427getFg30d7_KjU;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1894230112, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSection.<anonymous> (NestedSection.kt:43)");
                    }
                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16);
                    if (z) {
                        composer3.startReplaceGroup(-565855099);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-565788635);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21427getFg30d7_KjU, null, null, false, composer3, BentoIcon4.Size16.$stable | 48, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), false, false, true, null, composer2, 806882304, 0, 1462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NestedSection4.NestedSection$lambda$3(label, onShowNestedSection, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NestedSection$lambda$2$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void NestedSectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-798965887);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-798965887, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionPreview (NestedSection.kt:58)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, NestedSection2.INSTANCE.m1768xce6b3669(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.NestedSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NestedSection4.NestedSectionPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
