package com.robinhood.android.feature.account.onboarding.accounttype;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionRow;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountTypeSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt$lambda$1966345129$1, reason: use source file name */
/* loaded from: classes3.dex */
final class AccountTypeSelectionComposable8 implements Function2<Composer, Integer, Unit> {
    public static final AccountTypeSelectionComposable8 INSTANCE = new AccountTypeSelectionComposable8();

    AccountTypeSelectionComposable8() {
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
            ComposerKt.traceEventStart(1966345129, i, -1, "com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt.lambda$1966345129.<anonymous> (AccountTypeSelectionComposable.kt:389)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new AccountTypeSelectionRow("Individual", "Invest for your future goals", true, "individual", new AccountTypeSelectionRow.RowType.Account(BrokerageAccountType.INDIVIDUAL)), new AccountTypeSelectionRow("Joint", "Invest for your current or future goals with a co-owner", true, "joint", new AccountTypeSelectionRow.RowType.Account(BrokerageAccountType.JOINT_TENANCY_WITH_ROS)), new AccountTypeSelectionRow("Retirement", "Invest for future goals in a tax-advantaged account", false, "retirement", AccountTypeSelectionRow.RowType.Retirement.INSTANCE));
        AccountTypeSelectionCallbacks accountTypeSelectionCallbacks = new AccountTypeSelectionCallbacks() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt$lambda$1966345129$1.1
            @Override // com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks
            public void onBrokerageAccountTypeSelected(BrokerageAccountType brokerageAccountType) {
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            }

            @Override // com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks
            public void onCustodialAccountTypeSelected() {
            }

            @Override // com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks
            public void onRetirementAccountTypeSelected() {
            }
        };
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.ComposableSingletons$AccountTypeSelectionComposableKt$lambda$1966345129$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountTypeSelectionComposable8.invoke$lambda$1$lambda$0((AccountTypeSelectionRow) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AccountTypeSelectionComposable.AccountTypeSelectionList("Choose an account type", "", immutableList3PersistentListOf, accountTypeSelectionCallbacks, (Function1) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, 24630, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AccountTypeSelectionRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
