package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.advisory.p304db.deposit.AdvisoryDepositGoldValueProps;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AdvisoryDashboardDepositsStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\nR\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryDashboardDepositsStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/store/StoreBundle;)V", "goldValuePropsMap", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/deposit/AdvisoryDepositGoldValueProps;", "goldValuePropsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "goldValuePropsQuery", "Lcom/robinhood/android/moria/db/Query;", "streamGoldValueProps", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AdvisoryDashboardDepositsStore extends Store {
    private final Endpoint<String, AdvisoryDepositGoldValueProps> goldValuePropsEndpoint;
    private final Map<String, StateFlow2<AdvisoryDepositGoldValueProps>> goldValuePropsMap;
    private final Query<String, AdvisoryDepositGoldValueProps> goldValuePropsQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryDashboardDepositsStore(AdvisoryService advisoryService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldValuePropsMap = new LinkedHashMap();
        this.goldValuePropsEndpoint = Endpoint.INSTANCE.create(new AdvisoryDashboardDepositsStore2(advisoryService, null), getLogoutKillswitch(), new AdvisoryDashboardDepositsStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
        this.goldValuePropsQuery = Store.create$default(this, Query.INSTANCE, "goldValuePropsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryDashboardDepositsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryDashboardDepositsStore.goldValuePropsQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryDashboardDepositsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryDashboardDepositsStore.goldValuePropsQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow goldValuePropsQuery$lambda$0(AdvisoryDashboardDepositsStore advisoryDashboardDepositsStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Endpoint.DefaultImpls.poll$default(advisoryDashboardDepositsStore.goldValuePropsEndpoint, accountNumber, Durations.FIVE_MINUTES, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow goldValuePropsQuery$lambda$2(AdvisoryDashboardDepositsStore advisoryDashboardDepositsStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<AdvisoryDepositGoldValueProps>> map = advisoryDashboardDepositsStore.goldValuePropsMap;
        StateFlow2<AdvisoryDepositGoldValueProps> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<AdvisoryDepositGoldValueProps> streamGoldValueProps(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.goldValuePropsQuery.asFlow(accountNumber);
    }
}
