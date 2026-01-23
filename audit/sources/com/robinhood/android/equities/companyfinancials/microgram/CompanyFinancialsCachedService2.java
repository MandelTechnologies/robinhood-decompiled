package com.robinhood.android.equities.companyfinancials.microgram;

import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CompanyFinancialsCachedService.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsServiceModule;", "", "<init>", "()V", "bindService", "Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "componentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsServiceModule, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsCachedService2 {
    public static final int $stable = 0;
    public static final CompanyFinancialsCachedService2 INSTANCE = new CompanyFinancialsCachedService2();

    private CompanyFinancialsCachedService2() {
    }

    public final CompanyFinancialsCachedService bindService(@RootCoroutineScope CoroutineScope parentScope, MicrogramComponent.Factory componentFactory) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        return new CompanyFinancialsCachedService3(new MicrogramCachedComponentManager(parentScope, 0L, componentFactory, new RemoteMicrogramApplication("app-equity-company-financials", null, 2, null), null, 18, null));
    }
}
