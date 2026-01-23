package com.robinhood.android.cash.rhy.tab.p077v2.settings.limits;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaLimitsComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000326\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"MatchaLimits", "", "weeklySendLimit", "", "weeklyTransactionsLimit", "", "minTransactionAmount", "instantTransferFee", "showInfoSheet", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "title", "description", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MatchaLimitsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaLimits$lambda$5(String str, int i, String str2, String str3, Function2 function2, int i2, Composer composer, int i3) {
        MatchaLimits(str, i, str2, str3, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void MatchaLimits(final String weeklySendLimit, final int i, final String minTransactionAmount, final String instantTransferFee, final Function2<? super Integer, ? super Integer, Unit> showInfoSheet, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(weeklySendLimit, "weeklySendLimit");
        Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
        Intrinsics.checkNotNullParameter(instantTransferFee, "instantTransferFee");
        Intrinsics.checkNotNullParameter(showInfoSheet, "showInfoSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(-117166173);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(weeklySendLimit) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(minTransactionAmount) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(instantTransferFee) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showInfoSheet) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-117166173, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimits (MatchaLimitsComposable.kt:26)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C10285R.string.matcha_transfer_limits, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 24576, 0, 8172);
            AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_receiving_label, composerStartRestartGroup, 0), null, 2, null);
            AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_receiving_value, composerStartRestartGroup, 0), null, 2, null);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_16;
            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, new BentoIcon4.Size16(serverToBentoAssetMapper2), null, annotatedString2, null, null, null, null, false, false, 4053, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i5 = i3 & 57344;
            boolean z = i5 == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaLimitsComposable.MatchaLimits$lambda$4$lambda$1$lambda$0(showInfoSheet);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i6 = BentoDataRowState.$stable;
            BentoDataRowKt.BentoDataRow(bentoDataRowState, null, function0, composerStartRestartGroup, i6, 2);
            BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_sending_label, composerStartRestartGroup, 0), null, 2, null), null, new BentoIcon4.Size16(serverToBentoAssetMapper2), null, new AnnotatedString(weeklySendLimit, null, 2, null), null, null, null, null, false, false, 4053, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i5 == 16384;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchaLimitsComposable.MatchaLimits$lambda$4$lambda$3$lambda$2(showInfoSheet);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoDataRowKt.BentoDataRow(bentoDataRowState2, null, (Function0) objRememberedValue2, composerStartRestartGroup, i6, 2);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_frequency, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_weekly, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_weekly_transactions, new Object[]{Integer.valueOf(i)}, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_min_transaction_amount, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_amount, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(minTransactionAmount, null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_instant_fee, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion3.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            composerStartRestartGroup = composerStartRestartGroup;
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10285R.string.matcha_limits_amount, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(instantTransferFee, null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.limits.MatchaLimitsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaLimitsComposable.MatchaLimits$lambda$5(weeklySendLimit, i, minTransactionAmount, instantTransferFee, showInfoSheet, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaLimits$lambda$4$lambda$1$lambda$0(Function2 function2) {
        function2.invoke(Integer.valueOf(C10285R.string.matcha_limits_receiving), Integer.valueOf(C10285R.string.matcha_limits_receiving_detail));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaLimits$lambda$4$lambda$3$lambda$2(Function2 function2) {
        function2.invoke(Integer.valueOf(C10285R.string.matcha_limits_sending), Integer.valueOf(C10285R.string.matcha_limits_sending_detail));
        return Unit.INSTANCE;
    }
}
