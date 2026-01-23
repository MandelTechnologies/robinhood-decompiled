package com.robinhood.android.lib.accountswitcher;

import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountSwitcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherKt$AccountSwitcher$3$1$2$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class AccountSwitcher8 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountSwitcher8(Object obj) {
        super(0, obj, AccountSwitcherCallbacks.class, "onAllAccountsSelected", "onAllAccountsSelected()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountSwitcherCallbacks) this.receiver).onAllAccountsSelected();
    }
}
