package com.robinhood.android.investorprofile.p162ui.profile;

import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$ComposeContent$1$5$1 */
/* loaded from: classes10.dex */
/* synthetic */ class C19699x9fed278f extends FunctionReferenceImpl implements Function1<AccountSwitcherData, Unit> {
    C19699x9fed278f(Object obj) {
        super(1, obj, InvestmentProfileSettingsBonfireIdentiFragment.class, "onAccountSelectionDropdownClicked", "onAccountSelectionDropdownClicked(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountSwitcherData accountSwitcherData) {
        invoke2(accountSwitcherData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountSwitcherData p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvestmentProfileSettingsBonfireIdentiFragment) this.receiver).onAccountSelectionDropdownClicked(p0);
    }
}
