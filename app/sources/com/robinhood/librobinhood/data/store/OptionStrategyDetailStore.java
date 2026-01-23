package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiOptionPositionReturnRequest;
import com.robinhood.models.api.ApiOptionPositionReturnRequestLegacy;
import com.robinhood.models.api.ApiOptionSimulatedReturnRequestParams;
import com.robinhood.models.api.ApiOptionStrategyBreakeven;
import com.robinhood.models.api.ApiOptionStrategyBreakevenLegacy;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequest;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequestLegacy;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.util.Money;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: OptionStrategyDetailStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001e2\u0006\u0010\u0014\u001a\u00020\u001cJ\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020 H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020$H\u0086@¢\u0006\u0002\u0010'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001d0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionsBonfireApi", "Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;)V", "moneyJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/util/Money;", "getOptionStrategyBreakevenLegacy", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequestLegacy;", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenLegacy;", "fetchOptionStrategyBreakevenLegacy", "params", "(Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequestLegacy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionStrategyBreakeven", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequest;", "Lcom/robinhood/models/api/ApiOptionStrategyBreakeven;", "fetchOptionStrategyBreakeven", "(Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionsSimulatedReturn", "Lcom/robinhood/models/api/ApiOptionSimulatedReturnRequestParams;", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;", "Lio/reactivex/Observable;", "getOptionTodayTotalReturnLegacy", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequestLegacy;", "fetchOptionTodayTotalReturnLegacy", "(Lcom/robinhood/models/api/ApiOptionPositionReturnRequestLegacy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionTodayTotalReturn", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponse;", "fetchOptionTodayTotalReturn", "(Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionStrategyDetailStore extends Store {
    private final Endpoint<ApiOptionStrategyBreakevenRequest, ApiOptionStrategyBreakeven> getOptionStrategyBreakeven;
    private final Endpoint<ApiOptionStrategyBreakevenRequestLegacy, ApiOptionStrategyBreakevenLegacy> getOptionStrategyBreakevenLegacy;
    private final Endpoint<ApiOptionPositionReturnRequest, ApiOptionTodayTotalReturnResponse> getOptionTodayTotalReturn;
    private final Endpoint<ApiOptionPositionReturnRequestLegacy, ApiOptionTodayTotalReturnResponse2> getOptionTodayTotalReturnLegacy;
    private final Endpoint<ApiOptionSimulatedReturnRequestParams, ApiOptionTodayTotalReturnResponse2> getOptionsSimulatedReturn;
    private final JsonAdapter<Money> moneyJsonAdapter;
    private final OptionsApi optionsApi;
    private final OptionsBonfireApi optionsBonfireApi;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionStrategyBreakeven$lambda$1(Long l) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionStrategyBreakevenLegacy$lambda$0(Long l) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionTodayTotalReturn$lambda$4(Long l) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionTodayTotalReturnLegacy$lambda$3(Long l) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionsSimulatedReturn$lambda$2(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyDetailStore(StoreBundle storeBundle, LazyMoshi moshi, OptionsApi optionsApi, OptionsBonfireApi optionsBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionsBonfireApi, "optionsBonfireApi");
        this.optionsApi = optionsApi;
        this.optionsBonfireApi = optionsBonfireApi;
        Types types = Types.INSTANCE;
        this.moneyJsonAdapter = moshi.adapter(new TypeToken<Money>() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$special$$inlined$getAdapter$1
        }.getType());
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getOptionStrategyBreakevenLegacy = companion.create(new OptionStrategyDetailStore4(this, null), getLogoutKillswitch(), new OptionStrategyDetailStore5(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyDetailStore.getOptionStrategyBreakevenLegacy$lambda$0((Long) obj));
            }
        });
        this.getOptionStrategyBreakeven = companion.create(new OptionStrategyDetailStore2(this, null), getLogoutKillswitch(), new OptionStrategyDetailStore3(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyDetailStore.getOptionStrategyBreakeven$lambda$1((Long) obj));
            }
        });
        this.getOptionsSimulatedReturn = companion.create(new C341361(null), getLogoutKillswitch(), new C341372(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyDetailStore.getOptionsSimulatedReturn$lambda$2((Long) obj));
            }
        });
        this.getOptionTodayTotalReturnLegacy = companion.create(new OptionStrategyDetailStore8(this, null), getLogoutKillswitch(), new OptionStrategyDetailStore9(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyDetailStore.getOptionTodayTotalReturnLegacy$lambda$3((Long) obj));
            }
        });
        this.getOptionTodayTotalReturn = companion.create(new OptionStrategyDetailStore6(this, null), getLogoutKillswitch(), new OptionStrategyDetailStore7(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionStrategyDetailStore.getOptionTodayTotalReturn$lambda$4((Long) obj));
            }
        });
    }

    public final Object fetchOptionStrategyBreakevenLegacy(ApiOptionStrategyBreakevenRequestLegacy apiOptionStrategyBreakevenRequestLegacy, Continuation<? super ApiOptionStrategyBreakevenLegacy> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getOptionStrategyBreakevenLegacy, apiOptionStrategyBreakevenRequestLegacy, null, continuation, 2, null);
    }

    public final Object fetchOptionStrategyBreakeven(ApiOptionStrategyBreakevenRequest apiOptionStrategyBreakevenRequest, Continuation<? super ApiOptionStrategyBreakeven> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getOptionStrategyBreakeven, apiOptionStrategyBreakevenRequest, null, continuation, 2, null);
    }

    /* compiled from: OptionStrategyDetailStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;", "<destruct>", "Lcom/robinhood/models/api/ApiOptionSimulatedReturnRequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionsSimulatedReturn$1", m3645f = "OptionStrategyDetailStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionsSimulatedReturn$1 */
    static final class C341361 extends ContinuationImpl7 implements Function2<ApiOptionSimulatedReturnRequestParams, Continuation<? super ApiOptionTodayTotalReturnResponse2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C341361(Continuation<? super C341361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C341361 c341361 = OptionStrategyDetailStore.this.new C341361(continuation);
            c341361.L$0 = obj;
            return c341361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionSimulatedReturnRequestParams apiOptionSimulatedReturnRequestParams, Continuation<? super ApiOptionTodayTotalReturnResponse2> continuation) {
            return ((C341361) create(apiOptionSimulatedReturnRequestParams, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ApiOptionSimulatedReturnRequestParams apiOptionSimulatedReturnRequestParams = (ApiOptionSimulatedReturnRequestParams) this.L$0;
            int tradeMultiplier = apiOptionSimulatedReturnRequestParams.getTradeMultiplier();
            Instant watchedAt = apiOptionSimulatedReturnRequestParams.getWatchedAt();
            Money markPrice = apiOptionSimulatedReturnRequestParams.getMarkPrice();
            Money previousClosePrice = apiOptionSimulatedReturnRequestParams.getPreviousClosePrice();
            Money simulatedOpenPrice = apiOptionSimulatedReturnRequestParams.getSimulatedOpenPrice();
            OrderDirection direction = apiOptionSimulatedReturnRequestParams.getDirection();
            OptionsBonfireApi optionsBonfireApi = OptionStrategyDetailStore.this.optionsBonfireApi;
            String json = OptionStrategyDetailStore.this.moneyJsonAdapter.toJson(markPrice);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            String json2 = OptionStrategyDetailStore.this.moneyJsonAdapter.toJson(previousClosePrice);
            Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
            String json3 = OptionStrategyDetailStore.this.moneyJsonAdapter.toJson(simulatedOpenPrice);
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            this.label = 1;
            Object optionsSimulatedReturn = optionsBonfireApi.getOptionsSimulatedReturn(tradeMultiplier, watchedAt, json, json2, json3, direction, this);
            return optionsSimulatedReturn == coroutine_suspended ? coroutine_suspended : optionsSimulatedReturn;
        }
    }

    /* compiled from: OptionStrategyDetailStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionsSimulatedReturn$2", m3645f = "OptionStrategyDetailStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionsSimulatedReturn$2 */
    static final class C341372 extends ContinuationImpl7 implements Function2<ApiOptionTodayTotalReturnResponse2, Continuation<? super Unit>, Object> {
        int label;

        C341372(Continuation<? super C341372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C341372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiOptionTodayTotalReturnResponse2 apiOptionTodayTotalReturnResponse2, Continuation<? super Unit> continuation) {
            return ((C341372) create(apiOptionTodayTotalReturnResponse2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Observable<ApiOptionTodayTotalReturnResponse2> getOptionsSimulatedReturn(ApiOptionSimulatedReturnRequestParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return asObservable(Endpoint.DefaultImpls.poll$default(this.getOptionsSimulatedReturn, params, null, null, 6, null));
    }

    public final Object fetchOptionTodayTotalReturnLegacy(ApiOptionPositionReturnRequestLegacy apiOptionPositionReturnRequestLegacy, Continuation<? super ApiOptionTodayTotalReturnResponse2> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getOptionTodayTotalReturnLegacy, apiOptionPositionReturnRequestLegacy, null, continuation, 2, null);
    }

    public final Object fetchOptionTodayTotalReturn(ApiOptionPositionReturnRequest apiOptionPositionReturnRequest, Continuation<? super ApiOptionTodayTotalReturnResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getOptionTodayTotalReturn, apiOptionPositionReturnRequest, null, continuation, 2, null);
    }
}
