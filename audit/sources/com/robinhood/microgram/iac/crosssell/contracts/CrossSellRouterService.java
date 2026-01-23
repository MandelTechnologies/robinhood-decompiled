package com.robinhood.microgram.iac.crosssell.contracts;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: CrossSellRouterService.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nH'¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;", "", "launchDemoHalfSheet", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollBottomSheets", "Lkotlinx/coroutines/flow/Flow;", "location", "", "optionalParams", "", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.microgram.iac.crosssell.CrossSellRouterService")
/* loaded from: classes13.dex */
public interface CrossSellRouterService {
    Object launchDemoHalfSheet(Continuation<? super Unit> continuation);

    Flow<Unit> pollBottomSheets(String location, Map<String, String> optionalParams);

    /* compiled from: CrossSellRouterService.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow pollBottomSheets$default(CrossSellRouterService crossSellRouterService, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollBottomSheets");
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return crossSellRouterService.pollBottomSheets(str, map);
        }
    }
}
