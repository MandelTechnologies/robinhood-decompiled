package com.robinhood.android.accountcenter.views;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountCenterCreditAppBannerView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterCreditAppBannerView$Content$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterCreditAppBannerView2 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountCenterCreditAppBannerView2(Object obj) {
        super(0, obj, AccountCenterCreditAppBannerView.class, "startCreditApplication", "startCreditApplication()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountCenterCreditAppBannerView) this.receiver).startCreditApplication();
    }
}
