package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: StrategiesUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/advisory/StrategiesUpsellStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "dismissedStrategiesUpsellBannerPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/store/StoreBundle;)V", "dao", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel;", "upsellEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "upsellQuery", "Lcom/robinhood/android/moria/db/Query;", "streamBanner", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;", "accountNumber", "dismissBanner", "", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class StrategiesUpsellStore extends Store {
    private final AdvisoryService advisoryService;
    private final Map<String, StateFlow2<RecsForRetirementStrategiesUpsellViewModel>> dao;
    private final StringToBooleanMapPreference dismissedStrategiesUpsellBannerPref;
    private final Endpoint<String, RecsForRetirementStrategiesUpsellViewModel> upsellEndpoint;
    private final Query<String, RecsForRetirementStrategiesUpsellViewModel> upsellQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategiesUpsellStore(AdvisoryService advisoryService, @HasDismissedRecsForRetirementStrategiesUpsellPref StringToBooleanMapPreference dismissedStrategiesUpsellBannerPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(dismissedStrategiesUpsellBannerPref, "dismissedStrategiesUpsellBannerPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.dismissedStrategiesUpsellBannerPref = dismissedStrategiesUpsellBannerPref;
        this.dao = new LinkedHashMap();
        Endpoint<String, RecsForRetirementStrategiesUpsellViewModel> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new StrategiesUpsellStore2(this, null), getLogoutKillswitch(), new StrategiesUpsellStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.upsellEndpoint = endpointCreate$default;
        this.upsellQuery = Store.create$default(this, Query.INSTANCE, "rxrUpsellQuery", CollectionsKt.listOf(new RefreshEach(new StrategiesUpsellStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.advisory.StrategiesUpsellStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StrategiesUpsellStore.upsellQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow upsellQuery$lambda$1(StrategiesUpsellStore strategiesUpsellStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<RecsForRetirementStrategiesUpsellViewModel>> map = strategiesUpsellStore.dao;
        StateFlow2<RecsForRetirementStrategiesUpsellViewModel> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<RecsForRetirementStrategiesUpsellViewModel.Banner> streamBanner(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.dismissedStrategiesUpsellBannerPref.streamChanges()), Integer.MAX_VALUE, null, 2, null), new StrategiesUpsellStore$streamBanner$$inlined$flatMapLatest$1(null, accountNumber, this));
    }

    public final void dismissBanner(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.dismissedStrategiesUpsellBannerPref.set(accountNumber, true);
    }
}
