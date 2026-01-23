package com.robinhood.store.futures;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: FuturesLocaleStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesLocaleStore;", "", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;)V", "streamFuturesLocale", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/futures/FuturesLocale;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesLocaleStore {
    private final UserStore userStore;

    public FuturesLocaleStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.userStore = userStore;
    }

    public final Flow<FuturesLocaleStore2> streamFuturesLocale() {
        Observable observableDistinctUntilChanged = this.userStore.getUser().map(new Function() { // from class: com.robinhood.store.futures.FuturesLocaleStore.streamFuturesLocale.1
            @Override // io.reactivex.functions.Function
            public final FuturesLocaleStore2 apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CountryCode.Supported locality = it.getOrigin().getLocality();
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                    return FuturesLocaleStore2.f6324US;
                }
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    return FuturesLocaleStore2.f6323UK;
                }
                if (!Intrinsics.areEqual(locality, CountryCode.Supported.Austria.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Belgium.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Bulgaria.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Croatia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Cyprus.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Czechia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Denmark.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Estonia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Finland.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.France.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Germany.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Greece.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.HongKongSARChina.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Hungary.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Iceland.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.India.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Indonesia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Ireland.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Italy.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Latvia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Liechtenstein.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Lithuania.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Luxembourg.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Malaysia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Malta.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Netherlands.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Norway.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Poland.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Portugal.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Romania.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Singapore.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Slovakia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Slovenia.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Spain.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Sweden.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Taiwan.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Thailand.INSTANCE) && !Intrinsics.areEqual(locality, CountryCode.Supported.Vietnam.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return FuturesLocaleStore2.UNSUPPORTED;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
    }
}
