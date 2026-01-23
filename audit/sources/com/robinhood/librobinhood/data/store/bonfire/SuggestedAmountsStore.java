package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.SuggestedAmountsLastUpdatedAtPref;
import com.robinhood.librobinhood.data.store.SuggestedAmountsPref;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: SuggestedAmountsStore.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!2\b\b\u0002\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001bJ\u0018\u0010$\u001a\u00020%2\b\b\u0002\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001b0\u001e\u0012\u0004\u0012\u00020\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "lastUpdatedAtPreference", "Lcom/robinhood/prefs/LongPreference;", "suggestedAmountsPreference", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/bonfire/transfer/ApiSuggestedAmountsResponse;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "transferBannerChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "query", "Lcom/robinhood/android/moria/db/Query;", "Lkotlin/Pair;", "", "get", "Lkotlinx/coroutines/flow/Flow;", "force", "guidedTransfersVariant", "refresh", "Lkotlinx/coroutines/Job;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SuggestedAmountsStore extends Store {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;
    private final Endpoint<String, ApiSuggestedAmountsResponse> endpoint;
    private final LongPreference lastUpdatedAtPreference;
    private final LazyMoshi moshi;
    private final Mutex mutex;
    private final Query<Tuples2<Boolean, String>, ApiSuggestedAmountsResponse> query;
    private final StringPreference suggestedAmountsPreference;
    private final SharedFlow2<ApiSuggestedAmountsResponse> transferBannerChannel;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedAmountsStore(TransfersBonfireApi transfersBonfireApi, @SuggestedAmountsLastUpdatedAtPref LongPreference lastUpdatedAtPreference, @SuggestedAmountsPref StringPreference suggestedAmountsPreference, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(lastUpdatedAtPreference, "lastUpdatedAtPreference");
        Intrinsics.checkNotNullParameter(suggestedAmountsPreference, "suggestedAmountsPreference");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.lastUpdatedAtPreference = lastUpdatedAtPreference;
        this.suggestedAmountsPreference = suggestedAmountsPreference;
        this.moshi = moshi;
        this.adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuggestedAmountsStore.adapter_delegate$lambda$0(this.f$0);
            }
        });
        this.transferBannerChannel = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.mutex = Mutex3.Mutex$default(false, 1, null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        SuggestedAmountsStore2 suggestedAmountsStore2 = new SuggestedAmountsStore2(transfersBonfireApi);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        SuggestedAmountsStore3 suggestedAmountsStore3 = new SuggestedAmountsStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.endpoint = companion.create(suggestedAmountsStore2, logoutKillswitch, suggestedAmountsStore3, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.query = Store.create$default(this, Query.INSTANCE, "suggestedAmountsQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SuggestedAmountsStore.query$lambda$1(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SuggestedAmountsStore.query$lambda$2(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ApiSuggestedAmountsResponse> getAdapter() {
        return (JsonAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter adapter_delegate$lambda$0(SuggestedAmountsStore suggestedAmountsStore) {
        LazyMoshi lazyMoshi = suggestedAmountsStore.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<ApiSuggestedAmountsResponse>() { // from class: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$adapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$1(SuggestedAmountsStore suggestedAmountsStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
        return BuildersKt__Builders_commonKt.launch$default(suggestedAmountsStore.getStoreScope(), null, null, new SuggestedAmountsStore4(suggestedAmountsStore, (String) tuples2.component2(), zBooleanValue, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$2(SuggestedAmountsStore suggestedAmountsStore, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.take(FlowKt.filterNotNull(suggestedAmountsStore.transferBannerChannel), 1);
    }

    public static /* synthetic */ Flow get$default(SuggestedAmountsStore suggestedAmountsStore, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return suggestedAmountsStore.get(z, str);
    }

    public final Flow<ApiSuggestedAmountsResponse> get(boolean force, String guidedTransfersVariant) {
        Intrinsics.checkNotNullParameter(guidedTransfersVariant, "guidedTransfersVariant");
        return this.query.asFlow(Tuples4.m3642to(Boolean.valueOf(force), guidedTransfersVariant));
    }

    public static /* synthetic */ Job refresh$default(SuggestedAmountsStore suggestedAmountsStore, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return suggestedAmountsStore.refresh(z, str);
    }

    public final Job refresh(boolean force, String guidedTransfersVariant) {
        Intrinsics.checkNotNullParameter(guidedTransfersVariant, "guidedTransfersVariant");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, guidedTransfersVariant, force, null, 4, null);
    }
}
