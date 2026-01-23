package com.robinhood.shared.crypto.transfer.unified.sheet;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.shared.crypto.contracts.CryptoSettings;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HigherWithdrawalLimitBottomSheetContent.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"HigherWithdrawalLimitSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "amountAvailableForWithdrawal", "", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitBottomSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HigherWithdrawalLimitBottomSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HigherWithdrawalLimitSheetContent$lambda$5(RhModalBottomSheet5 rhModalBottomSheet5, String str, int i, Composer composer, int i2) {
        HigherWithdrawalLimitSheetContent(rhModalBottomSheet5, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HigherWithdrawalLimitSheetContent(RhModalBottomSheet5 rhModalBottomSheet5, final String str, Composer composer, final int i) {
        int i2;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1400515098);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1400515098, i2, -1, "com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitSheetContent (HigherWithdrawalLimitBottomSheetContent.kt:24)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 5, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierAlign = Column6.INSTANCE.align(companion, companion2.getCenterHorizontally());
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_limit_increase, composerStartRestartGroup, 0), modifierAlign, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(str == null ? "" : str, ModifiersKt.bentoPlaceholder$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), str == null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_limit_disclaimer, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8188);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitBottomSheetContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HigherWithdrawalLimitBottomSheetContent.HigherWithdrawalLimitSheetContent$lambda$4$lambda$1$lambda$0(navigator, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_review_transfer_limits_title, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 14) != 4) {
                if ((i4 & 8) != 0) {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                    if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitBottomSheetContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HigherWithdrawalLimitBottomSheetContent.HigherWithdrawalLimitSheetContent$lambda$4$lambda$3$lambda$2(rhModalBottomSheet52);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_not_now, composerStartRestartGroup, 0), false, null, false, composerStartRestartGroup, 0, 0, 59198);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                }
                z = false;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitBottomSheetContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HigherWithdrawalLimitBottomSheetContent.HigherWithdrawalLimitSheetContent$lambda$4$lambda$3$lambda$2(rhModalBottomSheet52);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_not_now, composerStartRestartGroup, 0), false, null, false, composerStartRestartGroup, 0, 0, 59198);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                rhModalBottomSheet52 = rhModalBottomSheet5;
            }
            z = true;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            rhModalBottomSheet52 = rhModalBottomSheet5;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.HigherWithdrawalLimitBottomSheetContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HigherWithdrawalLimitBottomSheetContent.HigherWithdrawalLimitSheetContent$lambda$5(rhModalBottomSheet52, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HigherWithdrawalLimitSheetContent$lambda$4$lambda$1$lambda$0(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, CryptoSettings.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HigherWithdrawalLimitSheetContent$lambda$4$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
