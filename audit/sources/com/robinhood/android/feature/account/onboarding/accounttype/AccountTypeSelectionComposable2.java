package com.robinhood.android.feature.account.onboarding.accounttype;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTypeSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class AccountTypeSelectionComposable2 extends FunctionReferenceImpl implements Function1<AccountTypeSelectionRow, Unit> {
    AccountTypeSelectionComposable2(Object obj) {
        super(1, obj, AccountTypeSelectionDuxo.class, "verifyAccountEligibility", "verifyAccountEligibility(Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountTypeSelectionRow accountTypeSelectionRow) {
        invoke2(accountTypeSelectionRow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountTypeSelectionRow p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AccountTypeSelectionDuxo) this.receiver).verifyAccountEligibility(p0);
    }
}
