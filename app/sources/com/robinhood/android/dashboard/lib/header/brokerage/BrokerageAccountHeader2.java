package com.robinhood.android.dashboard.lib.header.brokerage;

import com.robinhood.android.lib.accountswitcher.AccountSwitcherBottomSheet5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrokerageAccountHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeaderKt$BrokerageAccountHeader$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class BrokerageAccountHeader2 extends FunctionReferenceImpl implements Function1<AccountSwitcherBottomSheet5, Unit> {
    BrokerageAccountHeader2(Object obj) {
        super(1, obj, DashboardHeaderDuxo.class, "consumeAccountSwitcherAction", "consumeAccountSwitcherAction(Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherModalBottomSheetAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountSwitcherBottomSheet5 accountSwitcherBottomSheet5) {
        invoke2(accountSwitcherBottomSheet5);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountSwitcherBottomSheet5 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((DashboardHeaderDuxo) this.receiver).consumeAccountSwitcherAction(p0);
    }
}
