package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiOptionChainCollateral;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.dao.OptionCollateralDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: CollateralStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0018J\u001e\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CollateralStore;", "Lcom/robinhood/store/Store;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionCollateralDao;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionCollateralDao;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "orderRequestJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/db/OptionChainCollateral;", "", "getEquityOrderCollateral", "Lcom/robinhood/models/api/ApiCollateral;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "quantity", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionOrderCollateral", "optionOrderRequest", "(Lcom/robinhood/models/api/ApiOptionOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionChainCollateral", "Lio/reactivex/Observable;", "optionChainId", "refreshChainCollateral", "force", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CollateralStore extends Store {
    private final OptionCollateralDao dao;
    private final OptionsApi optionsApi;
    private final JsonAdapter<ApiOptionOrderRequest> orderRequestJsonAdapter;
    private final Function1<OptionChainCollateral, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollateralStore(OptionsApi optionsApi, StoreBundle storeBundle, final OptionCollateralDao dao, LazyMoshi moshi) {
        super(storeBundle, OptionChainCollateral.INSTANCE);
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.optionsApi = optionsApi;
        this.dao = dao;
        Types types = Types.INSTANCE;
        this.orderRequestJsonAdapter = moshi.adapter(new TypeToken<ApiOptionOrderRequest>() { // from class: com.robinhood.librobinhood.data.store.CollateralStore$special$$inlined$getAdapter$1
        }.getType());
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<OptionChainCollateral, Unit>() { // from class: com.robinhood.librobinhood.data.store.CollateralStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OptionChainCollateral optionChainCollateral) {
                m22600invoke(optionChainCollateral);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22600invoke(OptionChainCollateral optionChainCollateral) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(optionChainCollateral);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
    }

    public final Object getEquityOrderCollateral(String str, UUID uuid, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, Continuation<? super ApiCollateral> continuation) {
        return this.optionsApi.getEquityOrderCollateral(Account.INSTANCE.getUrl(str), Instrument.INSTANCE.getUrl(uuid), equityOrderSide.getServerValue(), bigDecimal, continuation);
    }

    public final Object getOptionOrderCollateral(ApiOptionOrderRequest apiOptionOrderRequest, Continuation<? super ApiCollateral> continuation) {
        String json = this.orderRequestJsonAdapter.toJson(apiOptionOrderRequest);
        OptionsApi optionsApi = this.optionsApi;
        UUID order_to_replace_id = apiOptionOrderRequest.getOrder_to_replace_id();
        Intrinsics.checkNotNull(json);
        return optionsApi.getOptionsOrderCollateral(order_to_replace_id, json, continuation);
    }

    public final Observable<OptionChainCollateral> getOptionChainCollateral(String accountNumber, UUID optionChainId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getOptionChainCollateral(accountNumber, optionChainId))));
    }

    public final void refreshChainCollateral(boolean force, final UUID optionChainId, String accountNumber) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new CollateralStore2(this, optionChainId, accountNumber, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.CollateralStore$refreshChainCollateral$network$2
            @Override // io.reactivex.functions.Function
            public final OptionChainCollateral apply(ApiOptionChainCollateral it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toDbCollateral(optionChainId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ScopedSubscriptionKt.subscribeIn(refresh(map).saveAction(this.saveAction).key(optionChainId + " collateral").force(force).toMaybe(getNetworkWrapper()), getStoreScope());
    }
}
