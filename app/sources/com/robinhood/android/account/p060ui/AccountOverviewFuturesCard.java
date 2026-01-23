package com.robinhood.android.account.p060ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewContents;
import com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewContents2;
import com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks;
import com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountOverviewFuturesCard.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"FuturesSection", "", "state", "Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;", "callbacks", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/FuturesSectionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/FuturesSectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-account-overview_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.ui.AccountOverviewFuturesCardKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountOverviewFuturesCard {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesSection$lambda$7(AccountOverviewRhdSectionState accountOverviewRhdSectionState, AccountOverviewRhdCallbacks2 accountOverviewRhdCallbacks2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesSection(accountOverviewRhdSectionState, accountOverviewRhdCallbacks2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesSection(final AccountOverviewRhdSectionState state, final AccountOverviewRhdCallbacks2 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final AccountOverviewContents2 accountOverviewFuturesCtaType;
        final Modifier modifier3;
        final AccountOverviewContents2 accountOverviewEcCtaType;
        float fM21592getMediumD9Ej5fM;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(226432498);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(226432498, i3, -1, "com.robinhood.android.account.ui.FuturesSection (AccountOverviewFuturesCard.kt:33)");
                }
                RhdAccountDataState rhdState = state.getRhdState();
                Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier4, 0.0f, false, composerStartRestartGroup, (i3 >> 6) & 14, 3);
                Modifier modifier5 = modifier4;
                composerStartRestartGroup = composerStartRestartGroup;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                AccountOverviewComponents.AccountOverviewSectionTitle(null, StringResources_androidKt.stringResource(AccountOverviewContents.accountTitleLabel(rhdState, state.getEcSupported()), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(AccountOverviewContents.getAccountStatusLabel(rhdState), composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 0, 25);
                AccountOverviewComponents.AccountOverviewSectionSummary(null, StringResources6.getTextAsString(AccountOverviewContents.accountOverviewSummary(rhdState, state.getEcSupported(), state.getCryptoSupported()), composerStartRestartGroup, StringResource.$stable), composerStartRestartGroup, 0, 1);
                accountOverviewFuturesCtaType = AccountOverviewContents.getAccountOverviewFuturesCtaType(rhdState);
                composerStartRestartGroup.startReplaceGroup(-367351986);
                if (accountOverviewFuturesCtaType != null) {
                    String strStringResource = StringResources_androidKt.stringResource(accountOverviewFuturesCtaType.getStringRes(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composerStartRestartGroup.changed(accountOverviewFuturesCtaType.ordinal()) | composerStartRestartGroup.changedInstance(callbacks);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewFuturesCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewFuturesCard.FuturesSection$lambda$6$lambda$2$lambda$1$lambda$0(accountOverviewFuturesCtaType, callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AccountOverviewComponents.AccountOverviewSectionCta(null, strStringResource, false, false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 13);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-367344802);
                if (state.getEcSupported() && (accountOverviewEcCtaType = AccountOverviewContents.getAccountOverviewEcCtaType(rhdState)) != null) {
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    if (accountOverviewFuturesCtaType == null) {
                        composerStartRestartGroup.startReplaceGroup(-378425879);
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-378332600);
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, fM21592getMediumD9Ej5fM, 0.0f, 0.0f, 13, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(accountOverviewEcCtaType.getStringRes(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(accountOverviewEcCtaType.ordinal()) | composerStartRestartGroup.changedInstance(callbacks);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewFuturesCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewFuturesCard.FuturesSection$lambda$6$lambda$5$lambda$4$lambda$3(accountOverviewEcCtaType, callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewFuturesCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountOverviewFuturesCard.FuturesSection$lambda$7(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            RhdAccountDataState rhdState2 = state.getRhdState();
            Modifier modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ2 = AccountOverviewComponents.m10805defaultAccountOverviewSectionPaddinguFdPcIQ(modifier4, 0.0f, false, composerStartRestartGroup, (i3 >> 6) & 14, 3);
            Modifier modifier52 = modifier4;
            composerStartRestartGroup = composerStartRestartGroup;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM10805defaultAccountOverviewSectionPaddinguFdPcIQ2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                AccountOverviewComponents.AccountOverviewSectionTitle(null, StringResources_androidKt.stringResource(AccountOverviewContents.accountTitleLabel(rhdState2, state.getEcSupported()), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(AccountOverviewContents.getAccountStatusLabel(rhdState2), composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 0, 25);
                AccountOverviewComponents.AccountOverviewSectionSummary(null, StringResources6.getTextAsString(AccountOverviewContents.accountOverviewSummary(rhdState2, state.getEcSupported(), state.getCryptoSupported()), composerStartRestartGroup, StringResource.$stable), composerStartRestartGroup, 0, 1);
                accountOverviewFuturesCtaType = AccountOverviewContents.getAccountOverviewFuturesCtaType(rhdState2);
                composerStartRestartGroup.startReplaceGroup(-367351986);
                if (accountOverviewFuturesCtaType != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-367344802);
                if (state.getEcSupported()) {
                    BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    if (accountOverviewFuturesCtaType == null) {
                    }
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, fM21592getMediumD9Ej5fM, 0.0f, 0.0f, 13, null);
                    String strStringResource22 = StringResources_androidKt.stringResource(accountOverviewEcCtaType.getStringRes(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(accountOverviewEcCtaType.ordinal()) | composerStartRestartGroup.changedInstance(callbacks);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewFuturesCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountOverviewFuturesCard.FuturesSection$lambda$6$lambda$5$lambda$4$lambda$3(accountOverviewEcCtaType, callbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource22, modifierM5146paddingqDBjuR0$default2, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesSection$lambda$6$lambda$2$lambda$1$lambda$0(AccountOverviewContents2 accountOverviewContents2, AccountOverviewRhdCallbacks2 accountOverviewRhdCallbacks2) {
        AccountOverviewRhdCallbacks.onCtaClick(accountOverviewContents2, accountOverviewRhdCallbacks2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesSection$lambda$6$lambda$5$lambda$4$lambda$3(AccountOverviewContents2 accountOverviewContents2, AccountOverviewRhdCallbacks2 accountOverviewRhdCallbacks2) {
        AccountOverviewRhdCallbacks.onCtaClick(accountOverviewContents2, accountOverviewRhdCallbacks2);
        return Unit.INSTANCE;
    }
}
