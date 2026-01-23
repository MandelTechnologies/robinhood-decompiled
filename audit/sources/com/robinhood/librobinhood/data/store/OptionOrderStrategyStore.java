package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.ApiOptionOrderStrategies;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: OptionOrderStrategyStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\f\u0010\u0019\u001a\u00020\u0011*\u00020\u0016H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "legListAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore$RequestLeg;", "fetchOptionOrderStrategies", "Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "legs", "", "Lcom/robinhood/models/api/ApiOptionOrderRequest$Leg;", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOptionOrderStrategyDisplayName", "toRequestParam", "toRequestParams", "", "RequestLeg", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionOrderStrategyStore extends Store {
    private final OptionsBonfireApi bonfireApi;
    private final ExperimentsStore experimentsStore;
    private final JsonAdapter<List<RequestLeg>> legListAdapter;
    private final OptionsApi optionsApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderStrategyStore(OptionsBonfireApi bonfireApi, OptionsApi optionsApi, ExperimentsStore experimentsStore, StoreBundle storeBundle, LazyMoshi moshi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.bonfireApi = bonfireApi;
        this.optionsApi = optionsApi;
        this.experimentsStore = experimentsStore;
        Types types = Types.INSTANCE;
        this.legListAdapter = moshi.adapter(new TypeToken<List<? extends RequestLeg>>() { // from class: com.robinhood.librobinhood.data.store.OptionOrderStrategyStore$special$$inlined$getAdapter$1
        }.getType());
    }

    public final Object fetchOptionOrderStrategies(Iterable<ApiOptionOrderRequest.Leg> iterable, Continuation<? super ApiOptionOrderStrategies> continuation) {
        return this.optionsApi.getOptionOrderStrategies(toRequestParams(iterable), continuation);
    }

    public final Object fetchOptionOrderStrategyDisplayName(Iterable<ApiOptionOrderRequest.Leg> iterable, Continuation<? super ApiOptionOrderStrategies> continuation) {
        return this.bonfireApi.getOptionOrderStrategyDisplayName(toRequestParams(iterable), continuation);
    }

    private final RequestLeg toRequestParam(ApiOptionOrderRequest.Leg leg) {
        List listSplit$default = StringsKt.split$default((CharSequence) leg.getOption(), new char[]{'/'}, false, 0, 6, (Object) null);
        ListIterator listIterator = listSplit$default.listIterator(listSplit$default.size());
        while (listIterator.hasPrevious()) {
            String str = (String) listIterator.previous();
            if (str.length() > 0) {
                return new RequestLeg(str, leg.getPosition_effect(), leg.getRatio_quantity(), leg.getSide());
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    private final String toRequestParams(Iterable<ApiOptionOrderRequest.Leg> iterable) {
        JsonAdapter<List<RequestLeg>> jsonAdapter = this.legListAdapter;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator<ApiOptionOrderRequest.Leg> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(toRequestParam(it.next()));
        }
        String json = jsonAdapter.toJson(arrayList);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    /* compiled from: OptionOrderStrategyStore.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore$RequestLeg;", "", "option_id", "", "position_effect", "Lcom/robinhood/models/db/OrderPositionEffect;", "ratio_quantity", "", "side", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderPositionEffect;ILcom/robinhood/models/db/OrderSide;)V", "getOption_id", "()Ljava/lang/String;", "getPosition_effect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getRatio_quantity", "()I", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestLeg {
        private final String option_id;
        private final OrderPositionEffect position_effect;
        private final int ratio_quantity;
        private final OrderSide side;

        public static /* synthetic */ RequestLeg copy$default(RequestLeg requestLeg, String str, OrderPositionEffect orderPositionEffect, int i, OrderSide orderSide, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = requestLeg.option_id;
            }
            if ((i2 & 2) != 0) {
                orderPositionEffect = requestLeg.position_effect;
            }
            if ((i2 & 4) != 0) {
                i = requestLeg.ratio_quantity;
            }
            if ((i2 & 8) != 0) {
                orderSide = requestLeg.side;
            }
            return requestLeg.copy(str, orderPositionEffect, i, orderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOption_id() {
            return this.option_id;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderPositionEffect getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        public final RequestLeg copy(String option_id, OrderPositionEffect position_effect, int ratio_quantity, OrderSide side) {
            Intrinsics.checkNotNullParameter(option_id, "option_id");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            return new RequestLeg(option_id, position_effect, ratio_quantity, side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestLeg)) {
                return false;
            }
            RequestLeg requestLeg = (RequestLeg) other;
            return Intrinsics.areEqual(this.option_id, requestLeg.option_id) && this.position_effect == requestLeg.position_effect && this.ratio_quantity == requestLeg.ratio_quantity && this.side == requestLeg.side;
        }

        public int hashCode() {
            return (((((this.option_id.hashCode() * 31) + this.position_effect.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31) + this.side.hashCode();
        }

        public String toString() {
            return "RequestLeg(option_id=" + this.option_id + ", position_effect=" + this.position_effect + ", ratio_quantity=" + this.ratio_quantity + ", side=" + this.side + ")";
        }

        public RequestLeg(String option_id, OrderPositionEffect position_effect, int i, OrderSide side) {
            Intrinsics.checkNotNullParameter(option_id, "option_id");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            this.option_id = option_id;
            this.position_effect = position_effect;
            this.ratio_quantity = i;
            this.side = side;
        }

        public final String getOption_id() {
            return this.option_id;
        }

        public final OrderPositionEffect getPosition_effect() {
            return this.position_effect;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final OrderSide getSide() {
            return this.side;
        }
    }
}
