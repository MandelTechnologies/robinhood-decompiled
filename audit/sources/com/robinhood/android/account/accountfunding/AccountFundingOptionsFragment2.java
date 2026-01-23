package com.robinhood.android.account.accountfunding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountFundingOptionsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountFundingOptionsFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountFundingOptionsFragment2(Object obj) {
        super(0, obj, AccountFundingOptionsFragment.class, "onClose", "onClose()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountFundingOptionsFragment) this.receiver).onClose();
    }
}
