package com.robinhood.librobinhood.data.store.identi;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.prefs.HasConvertedToRhsPref;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Completable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018J\u000e\u0010\u0019\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "Lcom/robinhood/store/Store;", "isConvertedPref", "Lcom/robinhood/prefs/BooleanPreference;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/UserInfoStore;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/store/StoreBundle;)V", "getAgreedToEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "agreePostEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/identi/ApiUserAgreement$Request;", "Lcom/robinhood/models/api/identi/ApiUserAgreement;", "agree", "Lio/reactivex/Completable;", "request", "isAgreedToRhsMargin", "Lio/reactivex/Single;", "agreeToRhsMargin", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasSeenRhsConversionPage", "hasAgreedToCryptoInOnboarding", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class UserAgreementsStore extends Store {
    private final PostEndpoint<ApiUserAgreement.Request, ApiUserAgreement> agreePostEndpoint;
    private final Endpoint<String, Boolean> getAgreedToEndpoint;
    private final BooleanPreference isConvertedPref;
    private final UserInfoStore userInfoStore;

    /* compiled from: UserAgreementsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.UserAgreementsStore", m3645f = "UserAgreementsStore.kt", m3646l = {59, 60}, m3647m = "agreeToRhsMargin")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$agreeToRhsMargin$1 */
    static final class C348541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348541(Continuation<? super C348541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserAgreementsStore.this.agreeToRhsMargin(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgreementsStore(@HasConvertedToRhsPref BooleanPreference isConvertedPref, UserInfoStore userInfoStore, Identi identi2, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
        Intrinsics.checkNotNullParameter(userInfoStore, "userInfoStore");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.isConvertedPref = isConvertedPref;
        this.userInfoStore = userInfoStore;
        this.getAgreedToEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new UserAgreementsStore4(identi2, null), getLogoutKillswitch(), new UserAgreementsStore5(null), storeBundle.getClock(), null, 16, null);
        this.agreePostEndpoint = PostEndpoint.INSTANCE.create(new UserAgreementsStore2(identi2, null), new UserAgreementsStore3(null));
    }

    /* compiled from: UserAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$agree$1", m3645f = "UserAgreementsStore.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$agree$1 */
    static final class C348531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiUserAgreement.Request $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348531(ApiUserAgreement.Request request, Continuation<? super C348531> continuation) {
            super(2, continuation);
            this.$request = request;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserAgreementsStore.this.new C348531(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = UserAgreementsStore.this.agreePostEndpoint;
                ApiUserAgreement.Request request = this.$request;
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Completable agree(ApiUserAgreement.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C348531(request, null), 1, null);
    }

    /* compiled from: UserAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$isAgreedToRhsMargin$1", m3645f = "UserAgreementsStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$isAgreedToRhsMargin$1 */
    static final class C348561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C348561(Continuation<? super C348561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserAgreementsStore.this.new C348561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C348561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            UserInfoStore userInfoStore = UserAgreementsStore.this.userInfoStore;
            this.label = 1;
            Object objHasAgreedToRhsMargin = userInfoStore.hasAgreedToRhsMargin(this);
            return objHasAgreedToRhsMargin == coroutine_suspended ? coroutine_suspended : objHasAgreedToRhsMargin;
        }
    }

    public final Single<Boolean> isAgreedToRhsMargin() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348561(null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (com.robinhood.android.moria.network.PostEndpoint.DefaultImpls.post$default(r1, r2, null, r4, 2, null) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object agreeToRhsMargin(Continuation<? super Unit> continuation) {
        C348541 c348541;
        if (continuation instanceof C348541) {
            c348541 = (C348541) continuation;
            int i = c348541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348541.label = i - Integer.MIN_VALUE;
            } else {
                c348541 = new C348541(continuation);
            }
        }
        C348541 c3485412 = c348541;
        Object obj = c3485412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3485412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint<ApiUserAgreement.Request, ApiUserAgreement> postEndpoint = this.agreePostEndpoint;
            ApiUserAgreement.Request rhs = ApiUserAgreement.Request.INSTANCE.getRhs();
            c3485412.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, rhs, null, c3485412, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.isConvertedPref.set(true);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        PostEndpoint<ApiUserAgreement.Request, ApiUserAgreement> postEndpoint2 = this.agreePostEndpoint;
        ApiUserAgreement.Request rhsMargin = ApiUserAgreement.Request.INSTANCE.getRhsMargin();
        c3485412.label = 2;
    }

    public final Object hasSeenRhsConversionPage(Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.agreePostEndpoint, ApiUserAgreement.Request.INSTANCE.getRhs(), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    /* compiled from: UserAgreementsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$hasAgreedToCryptoInOnboarding$1", m3645f = "UserAgreementsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$hasAgreedToCryptoInOnboarding$1 */
    static final class C348551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C348551(Continuation<? super C348551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserAgreementsStore.this.new C348551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C348551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = UserAgreementsStore.this.getAgreedToEndpoint;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, "crypto_user_agreement", null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<Boolean> hasAgreedToCryptoInOnboarding() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348551(null), 1, null);
    }
}
