package com.robinhood.android.optionsupgrade;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingReadyToUpgradeFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"OptionOnboardingReadyToUpgradeRow", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "infoTagText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingReadyToUpgradeFragment3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingReadyToUpgradeRow$lambda$1(String str, Modifier modifier, String str2, int i, int i2, Composer composer, int i3) {
        OptionOnboardingReadyToUpgradeRow(str, modifier, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingReadyToUpgradeRow(final String text, Modifier modifier, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        final String str3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-230274003);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
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
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    final String str4 = i4 == 0 ? null : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-230274003, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeRow (OptionOnboardingReadyToUpgradeFragment.kt:120)");
                    }
                    composerStartRestartGroup.startReplaceGroup(2044991409);
                    ComposableLambda composableLambdaRememberComposableLambda = str4 != null ? ComposableLambda3.rememberComposableLambda(-262454780, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragmentKt$OptionOnboardingReadyToUpgradeRow$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-262454780, i6, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeRow.<anonymous>.<anonymous> (OptionOnboardingReadyToUpgradeFragment.kt:127)");
                            }
                            InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(str4, null, null, null, false, null, null, composer3, 1572864, 62);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    int i6 = ((i3 >> 3) & 14) | 3072;
                    str3 = str4;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifier4, null, null, ComposableLambda3.rememberComposableLambda(730116266, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragmentKt.OptionOnboardingReadyToUpgradeRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(730116266, i7, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeRow.<anonymous> (OptionOnboardingReadyToUpgradeFragment.kt:123)");
                            }
                            BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, composableLambdaRememberComposableLambda, null, false, false, false, null, composer2, i6, 0, 2006);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragmentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingReadyToUpgradeFragment3.OptionOnboardingReadyToUpgradeRow$lambda$1(text, modifier3, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            str2 = str;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(2044991409);
                ComposableLambda composableLambdaRememberComposableLambda2 = str4 != null ? ComposableLambda3.rememberComposableLambda(-262454780, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragmentKt$OptionOnboardingReadyToUpgradeRow$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i62) {
                        if ((i62 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-262454780, i62, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeRow.<anonymous>.<anonymous> (OptionOnboardingReadyToUpgradeFragment.kt:127)");
                        }
                        InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(str4, null, null, null, false, null, null, composer3, 1572864, 62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                int i62 = ((i3 >> 3) & 14) | 3072;
                str3 = str4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifier4, null, null, ComposableLambda3.rememberComposableLambda(730116266, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragmentKt.OptionOnboardingReadyToUpgradeRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(730116266, i7, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeRow.<anonymous> (OptionOnboardingReadyToUpgradeFragment.kt:123)");
                        }
                        BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, composableLambdaRememberComposableLambda2, null, false, false, false, null, composer2, i62, 0, 2006);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        str2 = str;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
