package com.robinhood.store.paymentinstrument;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV2;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: PaymentInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u001b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001b2\u0006\u0010\u001c\u001a\u00020\u0011J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "dao", "Lcom/robinhood/models/paymentinstrument/dao/PaymentInstrumentV2Dao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/models/paymentinstrument/dao/PaymentInstrumentV2Dao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/PaymentInstrumentType;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentsV2;", "endpointSingle", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrumentV2;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "querySingle", "stream", "Lio/reactivex/Observable;", "types", "streamFlow", "Lkotlinx/coroutines/flow/Flow;", "instrumentId", "poll", "instrumentType", "lib-store-payment-instrument_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PaymentInstrumentStore extends Store {
    private final PaymentInstrumentBonfireApi api;
    private final PaymentInstrumentV2Dao dao;
    private final Endpoint<List<PaymentInstrumentType>, ApiPaymentInstrumentsV2> endpoint;
    private final Endpoint<Tuples2<PaymentInstrumentType, String>, ApiPaymentInstrumentV2> endpointSingle;
    private final Query<List<? extends PaymentInstrumentType>, List<PaymentInstrumentV2>> query;
    private final Query<Tuples2<? extends PaymentInstrumentType, String>, PaymentInstrumentV2> querySingle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentInstrumentStore(PaymentInstrumentBonfireApi api, PaymentInstrumentV2Dao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        PaymentInstrumentStore2 paymentInstrumentStore2 = new PaymentInstrumentStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        PaymentInstrumentStore3 paymentInstrumentStore3 = new PaymentInstrumentStore3(this, null);
        Clock clock = storeBundle.getClock();
        PaymentInstrumentV2.Companion companion2 = PaymentInstrumentV2.INSTANCE;
        this.endpoint = companion.create(paymentInstrumentStore2, logoutKillswitch, paymentInstrumentStore3, clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.endpointSingle = companion.create(new PaymentInstrumentStore4(this, null), getLogoutKillswitch(), new PaymentInstrumentStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion3 = Query.INSTANCE;
        this.query = Store.create$default(this, companion3, "streamPaymentInstrumentsV2", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentInstrumentStore.query$lambda$0(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentInstrumentStore.query$lambda$1(this.f$0, (List) obj);
            }
        }, false, 8, null);
        this.querySingle = Store.create$default(this, companion3, "streamPaymentInstrumentV2", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentInstrumentStore.querySingle$lambda$2(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.paymentinstrument.PaymentInstrumentStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentInstrumentStore.querySingle$lambda$3(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(PaymentInstrumentStore paymentInstrumentStore, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(paymentInstrumentStore.endpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(PaymentInstrumentStore paymentInstrumentStore, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return paymentInstrumentStore.dao.getAll(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow querySingle$lambda$2(PaymentInstrumentStore paymentInstrumentStore, Tuples2 args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Endpoint<Tuples2<PaymentInstrumentType, String>, ApiPaymentInstrumentV2> endpoint = paymentInstrumentStore.endpointSingle;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, args, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow querySingle$lambda$3(PaymentInstrumentStore paymentInstrumentStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        PaymentInstrumentType paymentInstrumentType = (PaymentInstrumentType) tuples2.component1();
        return paymentInstrumentStore.dao.get(paymentInstrumentType.getServerValue(), (String) tuples2.component2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Observable stream$default(PaymentInstrumentStore paymentInstrumentStore, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ArraysKt.toList(PaymentInstrumentType.values());
        }
        return paymentInstrumentStore.stream((List<? extends PaymentInstrumentType>) list);
    }

    public final Observable<List<PaymentInstrumentV2>> stream(List<? extends PaymentInstrumentType> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        return this.query.asObservable(types);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow streamFlow$default(PaymentInstrumentStore paymentInstrumentStore, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ArraysKt.toList(PaymentInstrumentType.values());
        }
        return paymentInstrumentStore.streamFlow(list);
    }

    public final Flow<List<PaymentInstrumentV2>> streamFlow(List<? extends PaymentInstrumentType> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        return Context7.buffer$default(RxConvert.asFlow(this.query.asObservable(types)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<PaymentInstrumentV2> stream(String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Endpoint.DefaultImpls.refresh$default(this.endpoint, CollectionsKt.emptyList(), false, null, 6, null);
        return this.dao.get(instrumentId);
    }

    public final Flow<PaymentInstrumentV2> poll(PaymentInstrumentType instrumentType, String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.querySingle.asFlow(Tuples4.m3642to(instrumentType, instrumentId));
    }
}
