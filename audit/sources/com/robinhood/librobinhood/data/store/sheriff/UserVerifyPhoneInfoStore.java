package com.robinhood.librobinhood.data.store.sheriff;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.sheriff.ApiUserVerifyPhoneInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserVerifyPhoneInfoStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/sheriff/UserVerifyPhoneInfoStore;", "Lcom/robinhood/store/Store;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/store/StoreBundle;)V", "userVerifyPhoneInfoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyPhoneInfo;", "getUserVerifyPhoneInfoForced", "Lio/reactivex/Single;", "lib-store-sheriff_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class UserVerifyPhoneInfoStore extends Store {
    private final Sheriff sheriff;
    private final Endpoint<Unit, ApiUserVerifyPhoneInfo> userVerifyPhoneInfoEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserVerifyPhoneInfoStore(Sheriff sheriff, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.sheriff = sheriff;
        this.userVerifyPhoneInfoEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new UserVerifyPhoneInfoStore2(this, null), getLogoutKillswitch(), new UserVerifyPhoneInfoStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: UserVerifyPhoneInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyPhoneInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.sheriff.UserVerifyPhoneInfoStore$getUserVerifyPhoneInfoForced$1", m3645f = "UserVerifyPhoneInfoStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.sheriff.UserVerifyPhoneInfoStore$getUserVerifyPhoneInfoForced$1 */
    static final class C348781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiUserVerifyPhoneInfo>, Object> {
        int label;

        C348781(Continuation<? super C348781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserVerifyPhoneInfoStore.this.new C348781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiUserVerifyPhoneInfo> continuation) {
            return ((C348781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = UserVerifyPhoneInfoStore.this.userVerifyPhoneInfoEndpoint;
            this.label = 1;
            Object objForceFetch$default = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiUserVerifyPhoneInfo> getUserVerifyPhoneInfoForced() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C348781(null), 1, null);
    }
}
