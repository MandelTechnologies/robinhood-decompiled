package com.robinhood.android.beneficiaries.p067ui.selectaccount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.beneficiaries.p067ui.selectaccount.BeneficiarySelectAccountViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: BeneficiarySelectAccountContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiarySelectAccountContent2 {
    public static final BeneficiarySelectAccountContent2 INSTANCE = new BeneficiarySelectAccountContent2();

    /* renamed from: lambda$-535538139, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8669lambda$535538139 = ComposableLambda3.composableLambdaInstance(-535538139, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt$lambda$-535538139$1
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
                ComposerKt.traceEventStart(-535538139, i, -1, "com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt.lambda$-535538139.<anonymous> (BeneficiarySelectAccountContent.kt:48)");
            }
            BeneficiarySelectAccountViewState.Loading loading = BeneficiarySelectAccountViewState.Loading.INSTANCE;
            String title = loading.getLoadingMock().getTitle();
            String subtitleMarkdown = loading.getLoadingMock().getSubtitleMarkdown();
            AccountSelectorData accountSelectorData = loading.getLoadingMock().getAccountSelectorData();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountSelectorCallbacks() { // from class: com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt$lambda$-535538139$1$1$1
                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks
                    public final void onAccountSelected(String str) {
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BeneficiarySelectAccountContent.SelectAccountContent(title, subtitleMarkdown, accountSelectorData, (AccountSelectorCallbacks) objRememberedValue, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-176238370, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8668lambda$176238370 = ComposableLambda3.composableLambdaInstance(-176238370, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt$lambda$-176238370$1
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
                ComposerKt.traceEventStart(-176238370, i, -1, "com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt.lambda$-176238370.<anonymous> (BeneficiarySelectAccountContent.kt:118)");
            }
            BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
            ManagementType managementType = ManagementType.SELF_DIRECTED;
            Instant instantOfEpochSecond = Instant.ofEpochSecond(1L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            StringResource.Companion companion = StringResource.INSTANCE;
            AccountSelectorRowData accountSelectorRowData = new AccountSelectorRowData(brokerageAccountType, managementType, instantOfEpochSecond, null, "111111", companion.invoke("My Big Account"), companion.invoke("No beneficiary"), ServerToBentoAssetMapper2.FINANCE_24, null, null, false, 1800, null);
            BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.IRA_ROTH;
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(1L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            StringResource stringResourceInvoke = companion.invoke("My Roth Account");
            StringResource stringResourceInvoke2 = companion.invoke("1 beneficiary");
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.RETIREMENT_24;
            AccountSelectorRowData accountSelectorRowData2 = new AccountSelectorRowData(brokerageAccountType2, managementType, instantOfEpochSecond2, null, "222222", stringResourceInvoke, stringResourceInvoke2, serverToBentoAssetMapper2, null, null, false, 1800, null);
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(1L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            BeneficiarySelectAccountViewState.Content content = new BeneficiarySelectAccountViewState.Content("Hello world", "With great power comes great responsibility", new AccountSelectorData(extensions2.persistentListOf(accountSelectorRowData, accountSelectorRowData2, new AccountSelectorRowData(brokerageAccountType2, managementType, instantOfEpochSecond3, null, "333333", companion.invoke("Traditional IRA"), companion.invoke("2 beneficiaries"), serverToBentoAssetMapper2, null, null, false, 1800, null))));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountSelectorCallbacks() { // from class: com.robinhood.android.beneficiaries.ui.selectaccount.ComposableSingletons$BeneficiarySelectAccountContentKt$lambda$-176238370$1$1$1
                    @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks
                    public final void onAccountSelected(String str) {
                        Intrinsics.checkNotNullParameter(str, "<unused var>");
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BeneficiarySelectAccountContent.LoadingOrAccountSelector(content, (AccountSelectorCallbacks) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-176238370$feature_beneficiaries_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11423getLambda$176238370$feature_beneficiaries_externalDebug() {
        return f8668lambda$176238370;
    }

    /* renamed from: getLambda$-535538139$feature_beneficiaries_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11424getLambda$535538139$feature_beneficiaries_externalDebug() {
        return f8669lambda$535538139;
    }
}
