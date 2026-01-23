package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.C19501R;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.viewmodels.ManageExternalAccountsViewModel;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerManageExternalAccounts.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"InvestmentsTrackerManageExternalAccounts", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/ManageExternalAccountsViewModel;", "nativeActionHandler", "Lkotlin/Function2;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/ManageExternalAccountsViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerManageExternalAccountsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerManageExternalAccounts {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerManageExternalAccounts$lambda$3(ManageExternalAccountsViewModel manageExternalAccountsViewModel, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerManageExternalAccounts(manageExternalAccountsViewModel, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerManageExternalAccounts(final ManageExternalAccountsViewModel item, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-607703971);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-607703971, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerManageExternalAccounts (InvestmentsTrackerManageExternalAccounts.kt:18)");
                }
                serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(item.getDetails().getIcon());
                if (serverToBentoAssetMapper2FromServerValue != null) {
                    BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, item.getDetails().getHeader(), item.getDetails().getSubtitle(), (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2FromServerValue, StringResources_androidKt.stringResource(C19501R.string.unlink_secondary, composerStartRestartGroup, 0), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU()), (Function0) null, 8, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i3 & 112) == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerManageExternalAccountsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentsTrackerManageExternalAccounts.m2130xce133f0a(nativeActionHandler);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifier4, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 >> 6) & 14) | 384 | (BentoBaseRowState.$stable << 3), 56);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerManageExternalAccountsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerManageExternalAccounts.InvestmentsTrackerManageExternalAccounts$lambda$3(item, nativeActionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(item.getDetails().getIcon());
            if (serverToBentoAssetMapper2FromServerValue != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerManageExternalAccounts$lambda$2$lambda$1$lambda$0 */
    public static final Unit m2130xce133f0a(Function2 function2) {
        function2.invoke(InvestmentsTrackerNativeAction.MANAGE_ACCOUNTS_CLICKED, "");
        return Unit.INSTANCE;
    }
}
