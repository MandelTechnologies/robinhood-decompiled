package com.robinhood.librobinhood.data.store.identi;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiShippingAddress;
import com.robinhood.models.api.identi.ApiAddress;
import com.robinhood.models.api.identi.ApiAddressValidationRequest;
import com.robinhood.models.api.identi.ApiAddressValidationResult;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UiAddressKt;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddressStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0017H\u0002J\u0016\u0010$\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002J\f\u0010&\u001a\u00020\u0013*\u00020\u001cH\u0002J\u0010\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020)J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0+J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170-2\u0006\u0010#\u001a\u00020.J\u0010\u0010/\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020)J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130+J\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120+J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0-2\u0006\u0010#\u001a\u000203J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020!0-2\u0006\u0010#\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0013\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0014\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "Lcom/robinhood/store/Store;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "bonfire", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;)V", "residentialAddressCache", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/ui/identi/ResidentialAddress;", "residentialAddressSaveAction", "Lkotlin/reflect/KFunction1;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "shippingAddressCache", "", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "shippingAddressSaveAction", "residentialAddressEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/identi/ApiAddress;", "residentialAddressPostEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "shippingAddressEndpoint", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiShippingAddress;", "shippingAddressPostEndpoint", "Lcom/robinhood/models/api/ApiShippingAddress$Request;", "addressValidationEndpoint", "Lcom/robinhood/models/api/identi/ApiAddressValidationRequest;", "Lcom/robinhood/models/api/identi/ApiAddressValidationResult;", "saveResidentialAddress", PlaceTypes.ADDRESS, "saveShippingAddress", "addresses", "toShippingAddress", "refreshResidentialAddress", "force", "", "streamResidentialAddress", "Lio/reactivex/Observable;", "submitResidentialAddress", "Lio/reactivex/Single;", "Lcom/robinhood/models/ui/identi/UiAddress;", "refreshShippingAddress", "streamMostRecentShippingAddress", "streamShippingAddresses", "submitShippingAddress", "Lcom/robinhood/models/ui/identi/UsAddress;", "validateAddress", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AddressStore extends Store {
    private final PostEndpoint<ApiAddressValidationRequest, ApiAddressValidationResult> addressValidationEndpoint;
    private final BonfireApi bonfire;
    private final BehaviorRelay<ResidentialAddress> residentialAddressCache;
    private final Endpoint<Unit, ApiAddress> residentialAddressEndpoint;
    private final PostEndpoint<ApiAddress, ApiAddress> residentialAddressPostEndpoint;
    private final KFunction<Unit> residentialAddressSaveAction;
    private final BehaviorRelay<List<ShippingAddress>> shippingAddressCache;
    private final Endpoint<Unit, PaginatedResult<ApiShippingAddress>> shippingAddressEndpoint;
    private final PostEndpoint<ApiShippingAddress.Request, ApiShippingAddress> shippingAddressPostEndpoint;
    private final KFunction<Unit> shippingAddressSaveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressStore(Identi identi2, BonfireApi bonfire2, StoreBundle storeBundle) {
        super(storeBundle, UiAddress.INSTANCE);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfire = bonfire2;
        BehaviorRelay<ResidentialAddress> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.residentialAddressCache = behaviorRelayCreate;
        this.residentialAddressSaveAction = new AddressStore$residentialAddressSaveAction$1(behaviorRelayCreate);
        BehaviorRelay<List<ShippingAddress>> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.shippingAddressCache = behaviorRelayCreate2;
        this.shippingAddressSaveAction = new AddressStore$shippingAddressSaveAction$1(behaviorRelayCreate2);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.residentialAddressEndpoint = Endpoint.Companion.create$default(companion, new AddressStore$residentialAddressEndpoint$1(identi2, null), getLogoutKillswitch(), new AddressStore$residentialAddressEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.residentialAddressPostEndpoint = companion2.create(new AddressStore$residentialAddressPostEndpoint$1(identi2, null), new AddressStore$residentialAddressPostEndpoint$2(this, null));
        this.shippingAddressEndpoint = Endpoint.Companion.create$default(companion, new AddressStore$shippingAddressEndpoint$1(this, null), getLogoutKillswitch(), new AddressStore$shippingAddressEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.shippingAddressPostEndpoint = companion2.create(new AddressStore$shippingAddressPostEndpoint$1(this, null), new AddressStore$shippingAddressPostEndpoint$2(this, null));
        this.addressValidationEndpoint = companion2.create(new AddressStore$addressValidationEndpoint$1(identi2, null), new AddressStore$addressValidationEndpoint$2(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveResidentialAddress(ApiAddress address) {
        ((Function1) this.residentialAddressSaveAction).invoke(new ResidentialAddress(UiAddressKt.toUiAddress(address)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveShippingAddress(List<ApiShippingAddress> addresses) {
        Function1 function1 = (Function1) this.shippingAddressSaveAction;
        List<ApiShippingAddress> list = addresses;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toShippingAddress((ApiShippingAddress) it.next()));
        }
        function1.invoke(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShippingAddress toShippingAddress(ApiShippingAddress apiShippingAddress) {
        return new ShippingAddress(apiShippingAddress.getId(), apiShippingAddress.is_billing(), UiAddressKt.toUiModel(apiShippingAddress), apiShippingAddress.is_valid_soft_check());
    }

    public static /* synthetic */ void refreshResidentialAddress$default(AddressStore addressStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        addressStore.refreshResidentialAddress(z);
    }

    public final void refreshResidentialAddress(boolean force) {
        Endpoint8.refresh$default(this.residentialAddressEndpoint, force, null, 2, null);
    }

    public final Observable<ResidentialAddress> streamResidentialAddress() {
        Observable<ResidentialAddress> observableHide = this.residentialAddressCache.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* compiled from: AddressStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiAddress;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.AddressStore$submitResidentialAddress$1", m3645f = "AddressStore.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.AddressStore$submitResidentialAddress$1 */
    static final class C348141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAddress>, Object> {
        final /* synthetic */ UiAddress $address;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348141(UiAddress uiAddress, Continuation<? super C348141> continuation) {
            super(2, continuation);
            this.$address = uiAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddressStore.this.new C348141(this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAddress> continuation) {
            return ((C348141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = AddressStore.this.residentialAddressPostEndpoint;
            ApiAddress apiAddress = this.$address.toApiAddress();
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiAddress, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiAddress> submitResidentialAddress(UiAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348141(address, null), 1, null);
    }

    public static /* synthetic */ void refreshShippingAddress$default(AddressStore addressStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        addressStore.refreshShippingAddress(z);
    }

    public final void refreshShippingAddress(boolean force) {
        Endpoint8.refresh$default(this.shippingAddressEndpoint, force, null, 2, null);
    }

    public final Observable<ShippingAddress> streamMostRecentShippingAddress() {
        Observable map = streamShippingAddresses().map(new Function() { // from class: com.robinhood.librobinhood.data.store.identi.AddressStore.streamMostRecentShippingAddress.1
            @Override // io.reactivex.functions.Function
            public final ShippingAddress apply(List<ShippingAddress> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ShippingAddress) CollectionsKt.first((List) it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<ShippingAddress>> streamShippingAddresses() {
        Observable<List<ShippingAddress>> observableHide = this.shippingAddressCache.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* compiled from: AddressStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiShippingAddress;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.AddressStore$submitShippingAddress$1", m3645f = "AddressStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.AddressStore$submitShippingAddress$1 */
    static final class C348151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiShippingAddress>, Object> {
        final /* synthetic */ UsAddress $address;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348151(UsAddress usAddress, Continuation<? super C348151> continuation) {
            super(2, continuation);
            this.$address = usAddress;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddressStore.this.new C348151(this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiShippingAddress> continuation) {
            return ((C348151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = AddressStore.this.shippingAddressPostEndpoint;
            ApiShippingAddress.Request request = this.$address.toRequest();
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiShippingAddress> submitShippingAddress(UsAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348151(address, null), 1, null);
    }

    /* compiled from: AddressStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiAddressValidationResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.AddressStore$validateAddress$1", m3645f = "AddressStore.kt", m3646l = {136}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.AddressStore$validateAddress$1 */
    static final class C348161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiAddressValidationResult>, Object> {
        final /* synthetic */ ApiAddressValidationRequest $address;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348161(ApiAddressValidationRequest apiAddressValidationRequest, Continuation<? super C348161> continuation) {
            super(2, continuation);
            this.$address = apiAddressValidationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddressStore.this.new C348161(this.$address, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiAddressValidationResult> continuation) {
            return ((C348161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = AddressStore.this.addressValidationEndpoint;
            ApiAddressValidationRequest apiAddressValidationRequest = this.$address;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiAddressValidationRequest, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiAddressValidationResult> validateAddress(ApiAddressValidationRequest address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348161(address, null), 1, null);
    }
}
