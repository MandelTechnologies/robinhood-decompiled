package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.librobinhood.data.prefs.EquityOrderExpireDateFetchDatePref;
import com.robinhood.librobinhood.data.prefs.EquityOrderExpireDatePref;
import com.robinhood.models.api.ApiOrderExpireDate;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.ZoneIds;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZonedDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;

/* compiled from: EquityOrderExpireDateStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "equitiesBrokeback", "Lcom/robinhood/prefs/StringPreference;", "orderExpireDatePref", "orderExpireDateFetchDatePref", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;)V", "j$/time/Clock", Card.Icon.CLOCK, "", "staleDecider$lib_store_equity_shared_externalDebug", "(Lj$/time/Clock;)Z", "staleDecider", "Lcom/robinhood/models/api/ApiOrderExpireDate;", "getExpireDate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EquityOrderExpireDateStore extends Store {
    private final Endpoint<Unit, ApiOrderExpireDate> endpoint;
    private final EquitiesBrokeback equitiesBrokeback;
    private final StringPreference orderExpireDateFetchDatePref;
    private final StringPreference orderExpireDatePref;

    /* compiled from: EquityOrderExpireDateStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore", m3645f = "EquityOrderExpireDateStore.kt", m3646l = {55}, m3647m = "getExpireDate")
    /* renamed from: com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore$getExpireDate$1 */
    static final class C338311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C338311(Continuation<? super C338311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityOrderExpireDateStore.this.getExpireDate(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderExpireDateStore(StoreBundle storeBundle, EquitiesBrokeback equitiesBrokeback, @EquityOrderExpireDatePref StringPreference orderExpireDatePref, @EquityOrderExpireDateFetchDatePref StringPreference orderExpireDateFetchDatePref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(orderExpireDatePref, "orderExpireDatePref");
        Intrinsics.checkNotNullParameter(orderExpireDateFetchDatePref, "orderExpireDateFetchDatePref");
        this.equitiesBrokeback = equitiesBrokeback;
        this.orderExpireDatePref = orderExpireDatePref;
        this.orderExpireDateFetchDatePref = orderExpireDateFetchDatePref;
        this.endpoint = Endpoint.INSTANCE.create(new EquityOrderExpireDateStore2(this, null), getLogoutKillswitch(), new EquityOrderExpireDateStore3(this, null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityOrderExpireDateStore.endpoint$lambda$0(this.f$0, (Long) obj));
            }
        });
    }

    public static /* synthetic */ boolean staleDecider$lib_store_equity_shared_externalDebug$default(EquityOrderExpireDateStore equityOrderExpireDateStore, Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            clock = Clock.systemDefaultZone();
        }
        return equityOrderExpireDateStore.staleDecider$lib_store_equity_shared_externalDebug(clock);
    }

    public final boolean staleDecider$lib_store_equity_shared_externalDebug(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        String str = this.orderExpireDateFetchDatePref.get();
        if (str != null) {
            Instant instant = Instant.parse(str);
            ZoneIds zoneIds = ZoneIds.INSTANCE;
            ZonedDateTime zonedDateTimeAtZone = instant.atZone(zoneIds.getUTC());
            ZonedDateTime zonedDateTimeAtZone2 = Instant.now(clock).atZone(zoneIds.getUTC());
            if (zonedDateTimeAtZone.compareTo((ChronoZonedDateTime<?>) zonedDateTimeAtZone2) > 0) {
                return false;
            }
            if (zonedDateTimeAtZone.getYear() == zonedDateTimeAtZone2.getYear() && zonedDateTimeAtZone.getDayOfYear() == zonedDateTimeAtZone2.getDayOfYear()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean endpoint$lambda$0(EquityOrderExpireDateStore equityOrderExpireDateStore, Long l) {
        return staleDecider$lib_store_equity_shared_externalDebug$default(equityOrderExpireDateStore, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getExpireDate(Continuation<? super ApiOrderExpireDate> continuation) {
        C338311 c338311;
        if (continuation instanceof C338311) {
            c338311 = (C338311) continuation;
            int i = c338311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338311.label = i - Integer.MIN_VALUE;
            } else {
                c338311 = new C338311(continuation);
            }
        }
        C338311 c3383112 = c338311;
        Object objFetch$default = c3383112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3383112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetch$default);
            Endpoint<Unit, ApiOrderExpireDate> endpoint = this.endpoint;
            Unit unit = Unit.INSTANCE;
            c3383112.label = 1;
            objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, unit, null, c3383112, 2, null);
            if (objFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetch$default);
        }
        ApiOrderExpireDate apiOrderExpireDate = (ApiOrderExpireDate) objFetch$default;
        return apiOrderExpireDate == null ? new ApiOrderExpireDate(this.orderExpireDatePref.get()) : apiOrderExpireDate;
    }
}
