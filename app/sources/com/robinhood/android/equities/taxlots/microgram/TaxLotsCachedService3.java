package com.robinhood.android.equities.taxlots.microgram;

import com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramCachedComponentManager;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;

/* compiled from: TaxLotsCachedService.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsServiceModule;", "", "<init>", "()V", "bindService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "componentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.microgram.TaxLotsServiceModule, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsCachedService3 {
    public static final int $stable = 0;
    public static final TaxLotsCachedService3 INSTANCE = new TaxLotsCachedService3();

    private TaxLotsCachedService3() {
    }

    public final TaxLotsCachedService bindService(@RootCoroutineScope CoroutineScope parentScope, MicrogramComponent.Factory componentFactory) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        RealEquityOrderContextService realEquityOrderContextService = new RealEquityOrderContextService();
        return new TaxLotsCachedService2(new MicrogramCachedComponentManager(parentScope, 0L, componentFactory, new RemoteMicrogramApplication("app-equity-trading-tax-lots", null, 2, null), MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(EquityOrderContextService.class), realEquityOrderContextService)), 2, null), realEquityOrderContextService);
    }
}
