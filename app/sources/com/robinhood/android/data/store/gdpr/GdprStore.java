package com.robinhood.android.data.store.gdpr;

import com.robinhood.android.api.gdpr.GdprApi;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: GdprStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R8\u0010\u0016\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/data/store/gdpr/GdprStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/gdpr/GdprApi;", "gdprApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/gdpr/GdprApi;Lcom/robinhood/store/StoreBundle;)V", "Lkotlin/Pair;", "Lcom/robinhood/android/gdpr/GdprConsent;", "j$/time/Instant", "getConsent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consent", "updatedAt", "postConsent", "(Lcom/robinhood/android/gdpr/GdprConsent;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/api/gdpr/GdprApi;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "postEndpoint", "lib-store-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprStore extends Store {
    private final GdprApi gdprApi;
    private final Endpoint<Unit, Tuples2<GdprConsent, Instant>> getEndpoint;
    private final Endpoint<Tuples2<GdprConsent, Instant>, Tuples2<GdprConsent, Instant>> postEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GdprStore(GdprApi gdprApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(gdprApi, "gdprApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.gdprApi = gdprApi;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getEndpoint = Endpoint.Companion.create$default(companion, new GdprStore2(this, null), getLogoutKillswitch(), new GdprStore3(null), storeBundle.getClock(), null, 16, null);
        this.postEndpoint = Endpoint.Companion.createWithParams$default(companion, new GdprStore4(this, null), getLogoutKillswitch(), new GdprStore5(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object getConsent(Continuation<? super Tuples2<GdprConsent, Instant>> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Object postConsent(GdprConsent gdprConsent, Instant instant, Continuation<? super Tuples2<GdprConsent, Instant>> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.postEndpoint, new Tuples2(gdprConsent, instant), null, continuation, 2, null);
    }
}
