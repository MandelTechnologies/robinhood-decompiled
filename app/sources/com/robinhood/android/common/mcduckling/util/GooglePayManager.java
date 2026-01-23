package com.robinhood.android.common.mcduckling.util;

import android.app.Application;
import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.ApiGooglePay;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: GooglePayManager.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0015J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0!H\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0!H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020$0!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "", "application", "Landroid/app/Application;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Landroid/app/Application;Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/librobinhood/data/store/identi/AddressStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", "tapAndPayClient", "Lcom/google/android/gms/tapandpay/TapAndPayClient;", "getPushTokenizeRequest", "Lio/reactivex/Single;", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "paymentCardId", "Ljava/util/UUID;", "viewToken", "Lcom/google/android/gms/tasks/Task;", "Landroid/app/PendingIntent;", "listTokens", "Lio/reactivex/Maybe;", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "getBillingAddress", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "getFullName", "", "getPhoneNumber", "getUserAddress", "Lcom/google/android/gms/tapandpay/issuer/UserAddress;", "getOpc", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GooglePayManager {
    private final AddressStore addressStore;
    private final Minerva minerva;
    private final PaymentCardStore paymentCardStore;
    private final ProfileInfoStore profileInfoStore;
    private final RxFactory rxFactory;
    private final TapAndPayClient tapAndPayClient;
    private final UserStore userStore;

    public GooglePayManager(Application application, Minerva minerva, PaymentCardStore paymentCardStore, ProfileInfoStore profileInfoStore, AddressStore addressStore, UserStore userStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.minerva = minerva;
        this.paymentCardStore = paymentCardStore;
        this.profileInfoStore = profileInfoStore;
        this.addressStore = addressStore;
        this.userStore = userStore;
        this.rxFactory = rxFactory;
        TapAndPayClient client = TapAndPay.getClient(application);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.tapAndPayClient = client;
    }

    public final Single<PushTokenizeRequest> getPushTokenizeRequest(UUID paymentCardId) {
        Intrinsics.checkNotNullParameter(paymentCardId, "paymentCardId");
        Observables observables = Observables.INSTANCE;
        Observable observableZip = Observable.zip(getUserAddress(), getOpc(paymentCardId), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager$getPushTokenizeRequest$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                PushTokenizeRequest.Builder builder = new PushTokenizeRequest.Builder();
                byte[] bytes = ((String) t2).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return (R) builder.setOpaquePaymentCard(bytes).setNetwork(3).setTokenServiceProvider(3).setDisplayName("Robinhood Debit Card").setUserAddress((UserAddress) t1).build();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        Single<PushTokenizeRequest> singleFirstOrError = observableZip.firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }

    public final Single<Task<PendingIntent>> viewToken() {
        Observables observables = Observables.INSTANCE;
        Observable<List<GooglePayTokenInfoWrapper>> observable = listTokens().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable observableZip = Observable.zip(observable, this.paymentCardStore.streamActiveRhyCard(), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager$viewToken$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                PaymentCard paymentCard = (PaymentCard) t2;
                for (GooglePayTokenInfoWrapper googlePayTokenInfoWrapper : (List) t1) {
                    if (Intrinsics.areEqual(googlePayTokenInfoWrapper.getFpanLastFour(), paymentCard.getLastFourDigits())) {
                        ViewTokenRequest viewTokenRequestBuild = new ViewTokenRequest.Builder().setTokenServiceProvider(3).setIssuerTokenId(googlePayTokenInfoWrapper.getIssuerTokenId()).build();
                        Intrinsics.checkNotNullExpressionValue(viewTokenRequestBuild, "build(...)");
                        return (R) this.this$0.tapAndPayClient.viewToken(viewTokenRequestBuild);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        return observableZip.firstOrError();
    }

    public final Maybe<List<GooglePayTokenInfoWrapper>> listTokens() {
        Maybe<List<GooglePayTokenInfoWrapper>> maybeCreate = Maybe.create(new MaybeOnSubscribe() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.listTokens.1
            @Override // io.reactivex.MaybeOnSubscribe
            public final void subscribe(final MaybeEmitter<List<GooglePayTokenInfoWrapper>> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                GooglePayManager.this.tapAndPayClient.listTokens().addOnCompleteListener(new OnCompleteListener() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.listTokens.1.1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task<List<TokenInfo>> task) {
                        Intrinsics.checkNotNullParameter(task, "task");
                        if (emitter.getDisposed() || !task.isSuccessful() || task.getResult() == null) {
                            return;
                        }
                        List<TokenInfo> result = task.getResult();
                        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
                        List<TokenInfo> list = result;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (TokenInfo tokenInfo : list) {
                            Intrinsics.checkNotNull(tokenInfo);
                            arrayList.add(GooglePayManager2.toGooglePayTokenInfoWrapper(tokenInfo));
                        }
                        emitter.onSuccess(arrayList);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.listTokens.1.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exception) {
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        if (emitter.getDisposed()) {
                            return;
                        }
                        ApiException apiException = exception instanceof ApiException ? (ApiException) exception : null;
                        if (apiException != null && apiException.getStatusCode() == 15002) {
                            emitter.onSuccess(CollectionsKt.emptyList());
                        } else {
                            emitter.onError(exception);
                        }
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeCreate, "create(...)");
        return maybeCreate;
    }

    private final Observable<ShippingAddress> getBillingAddress() {
        Observable<ShippingAddress> observableDistinctUntilChanged = ObservablesKt.flatten(this.addressStore.streamShippingAddresses()).filter(new Predicate() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.getBillingAddress.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ShippingAddress shippingAddress) {
                Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
                return shippingAddress.isBilling();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final Observable<String> getFullName() {
        Observable<String> observableDistinctUntilChanged = this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.getFullName.1
            @Override // io.reactivex.functions.Function
            public final String apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                return user.getFullName();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final Observable<String> getPhoneNumber() {
        Observable<String> observableDistinctUntilChanged = this.profileInfoStore.streamProfileInfo().map(new Function() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.getPhoneNumber.1
            @Override // io.reactivex.functions.Function
            public final String apply(UiProfileInfo uiProfileInfo) {
                Intrinsics.checkNotNullParameter(uiProfileInfo, "uiProfileInfo");
                return uiProfileInfo.getPhoneNumber();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final Observable<UserAddress> getUserAddress() {
        this.userStore.refresh(false);
        this.addressStore.refreshShippingAddress(true);
        this.profileInfoStore.refreshProfileInfo(false);
        Observables observables = Observables.INSTANCE;
        Observable observableZip = Observable.zip(getBillingAddress(), getFullName(), getPhoneNumber(), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager$getUserAddress$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                String str = (String) t3;
                ShippingAddress shippingAddress = (ShippingAddress) t1;
                UserAddress.Builder address1 = UserAddress.newBuilder().setName((String) t2).setAddress1(shippingAddress.getAddress().getLine1());
                String line2 = shippingAddress.getAddress().getLine2();
                if (line2 == null) {
                    line2 = "";
                }
                UserAddress.Builder locality = address1.setAddress2(line2).setLocality(shippingAddress.getAddress().getCity());
                String region = shippingAddress.getAddress().getRegion();
                return (R) locality.setAdministrativeArea(region != null ? region : "").setCountryCode(shippingAddress.getAddress().getCountry().getIso3166CountryCode()).setPostalCode(StringsKt.slice(shippingAddress.getAddress().getPostalCode().toString(), new PrimitiveRanges2(0, 4))).setPhoneNumber(str).build();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(source1, …neFunction(t1, t2, t3) })");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        UserAddress userAddressBuild = UserAddress.newBuilder().build();
        Intrinsics.checkNotNullExpressionValue(userAddressBuild, "build(...)");
        return com.robinhood.p370rx.ObservablesKt.onTimeoutEmit(observableZip, 1000L, timeUnit, userAddressBuild);
    }

    private final Observable<String> getOpc(UUID paymentCardId) {
        this.paymentCardStore.refresh(false);
        Observable<String> map = RxFactory.DefaultImpls.rxObservable$default(this.rxFactory, null, new C112791(paymentCardId, null), 1, null).map(new Function() { // from class: com.robinhood.android.common.mcduckling.util.GooglePayManager.getOpc.2
            @Override // io.reactivex.functions.Function
            public final String apply(ApiGooglePay apiGooglePay) {
                Intrinsics.checkNotNullParameter(apiGooglePay, "apiGooglePay");
                return apiGooglePay.getOpaque_payment_card();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: GooglePayManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/api/minerva/ApiGooglePay;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.mcduckling.util.GooglePayManager$getOpc$1", m3645f = "GooglePayManager.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.mcduckling.util.GooglePayManager$getOpc$1 */
    static final class C112791 extends ContinuationImpl7 implements Function2<Produce4<? super ApiGooglePay>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $paymentCardId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112791(UUID uuid, Continuation<? super C112791> continuation) {
            super(2, continuation);
            this.$paymentCardId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C112791 c112791 = GooglePayManager.this.new C112791(this.$paymentCardId, continuation);
            c112791.L$0 = obj;
            return c112791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ApiGooglePay> produce4, Continuation<? super Unit> continuation) {
            return ((C112791) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.send(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                Minerva minerva = GooglePayManager.this.minerva;
                UUID uuid = this.$paymentCardId;
                this.L$0 = produce4;
                this.label = 1;
                obj = minerva.opcGooglePayProvisioning(uuid, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }
}
