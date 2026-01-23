package com.robinhood.android.accountcenter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountCenterAccountDetailBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.AccountCenterAccountDetailBottomSheetFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterAccountDetailBottomSheetFragment7 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountCenterAccountDetailBottomSheetFragment7(Object obj) {
        super(0, obj, AccountCenterAccountDetailBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountCenterAccountDetailBottomSheetFragment) this.receiver).dismiss();
    }
}
