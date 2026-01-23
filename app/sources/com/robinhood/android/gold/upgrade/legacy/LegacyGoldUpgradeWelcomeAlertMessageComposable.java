package com.robinhood.android.gold.upgrade.legacy;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeWelcomeAlertMessageComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a?\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"GoldUpgradeWelcomeAlertMessageComposable", "", "description", "", "title", "ctaText", "onClickCta", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease", "showAlertDialog", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeAlertMessageComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeWelcomeAlertMessageComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeAlertMessageComposable$lambda$9(String str, String str2, String str3, Function0 function0, int i, int i2, Composer composer, int i3) {
        GoldUpgradeWelcomeAlertMessageComposable(str, str2, str3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeWelcomeAlertMessageComposable(final String str, String str2, String str3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str4;
        int i4;
        String str5;
        int i5;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Function0<Unit> function04;
        final String str6;
        final String str7;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1396076373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str5 = str3;
                    i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        String str8 = i6 == 0 ? null : str4;
                        String str9 = i4 == 0 ? null : str5;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeAlertMessageComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function03 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1396076373, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeWelcomeAlertMessageComposable (LegacyGoldUpgradeWelcomeAlertMessageComposable.kt:20)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(str != null), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        if (GoldUpgradeWelcomeAlertMessageComposable$lambda$3(snapshotState) || str == null) {
                            function04 = function03;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1599610525);
                            String strStringResource = str8 == null ? StringResources_androidKt.stringResource(C18003R.string.gold_upgrade_confirmation_failed_title, composerStartRestartGroup, 0) : str8;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(str);
                            composerStartRestartGroup.startReplaceGroup(1599617099);
                            String strStringResource2 = str9 == null ? StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0) : str9;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            int i7 = i3 & 7168;
                            boolean z = i7 == 2048;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeAlertMessageComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable$lambda$6$lambda$5(function03, snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue3);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean z2 = i7 == 2048;
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeAlertMessageComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable$lambda$8$lambda$7(function03, snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function04 = function03;
                            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue4, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str8;
                        str7 = str9;
                        function05 = function04;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        str6 = str4;
                        str7 = str5;
                        function05 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeAlertMessageComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable$lambda$9(str, str6, str7, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function02 = function0;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (GoldUpgradeWelcomeAlertMessageComposable$lambda$3(snapshotState)) {
                        function04 = function03;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        str6 = str8;
                        str7 = str9;
                        function05 = function04;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str5 = str3;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str5 = str3;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void GoldUpgradeWelcomeAlertMessageComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeAlertMessageComposable$lambda$6$lambda$5(Function0 function0, SnapshotState snapshotState) {
        GoldUpgradeWelcomeAlertMessageComposable$lambda$4(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeAlertMessageComposable$lambda$8$lambda$7(Function0 function0, SnapshotState snapshotState) {
        GoldUpgradeWelcomeAlertMessageComposable$lambda$4(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean GoldUpgradeWelcomeAlertMessageComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
