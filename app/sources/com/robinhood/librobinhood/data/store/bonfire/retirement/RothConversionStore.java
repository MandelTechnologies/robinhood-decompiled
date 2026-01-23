package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RothConversionStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/store/StoreBundle;)V", "infoQuery", "Lkotlin/Function0;", "Lio/reactivex/Observable;", "Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel;", "getInfoQuery", "()Lkotlin/jvm/functions/Function0;", "transferInfoQuery", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "getTransferInfoQuery", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RothConversionStore extends Store {
    private final Function0<Observable<RothConversionInfoViewModel>> infoQuery;
    private final RetirementApi retirementApi;
    private final Function0<Observable<ApiRothConversionTransferInfo>> transferInfoQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RothConversionStore(RetirementApi retirementApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        this.infoQuery = new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RothConversionStore.infoQuery$lambda$0(this.f$0);
            }
        };
        this.transferInfoQuery = new Function0() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RothConversionStore.transferInfoQuery$lambda$1(this.f$0);
            }
        };
    }

    public final Function0<Observable<RothConversionInfoViewModel>> getInfoQuery() {
        return this.infoQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable infoQuery$lambda$0(RothConversionStore rothConversionStore) {
        return RxFactory.DefaultImpls.rxObservable$default(rothConversionStore, null, new RothConversionStore2(rothConversionStore, null), 1, null);
    }

    public final Function0<Observable<ApiRothConversionTransferInfo>> getTransferInfoQuery() {
        return this.transferInfoQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable transferInfoQuery$lambda$1(RothConversionStore rothConversionStore) {
        return RxFactory.DefaultImpls.rxObservable$default(rothConversionStore, null, new RothConversionStore3(rothConversionStore, null), 1, null);
    }
}
