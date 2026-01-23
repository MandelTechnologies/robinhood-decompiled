package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsOptionValidationResponse;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsOptionValidationResponse2;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse2;
import com.robinhood.models.api.bonfire.ApiAcatsAccountNumberValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsDtcNumberValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationResponse;
import com.robinhood.models.api.bonfire.ApiAcatsValidationResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: AcatsValidationStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00142\u0006\u0010\u0017\u001a\u00020\nJ\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00142\u0006\u0010\u0019\u001a\u00020\rJ\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u000fJ\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u001c0\u001c0\u00142\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "Lcom/robinhood/store/Store;", "acatsApi", "Lcom/robinhood/android/acats/api/AcatsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/acats/api/AcatsApi;Lcom/robinhood/store/StoreBundle;)V", "accountEligibilityEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsValidationResponse;", "dtcNumberValidationEndpoint", "Lcom/robinhood/models/api/bonfire/ApiAcatsDtcNumberValidationRequest;", "accountNumberValidationEndpoint", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountNumberValidationRequest;", "optionValidationEndpoint", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationRequest;", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationResponse;", "getAccountEligibility", "Lio/reactivex/Single;", "Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "kotlin.jvm.PlatformType", "rhsAccountNumber", "postDtcNumberValidationRequest", "request", "postAccountNumberValidationRequest", "postOptionValidationRequest", "Lcom/robinhood/models/acats/db/ui/UiAcatsOptionValidationResponse;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AcatsValidationStore extends Store {
    private final AcatsApi acatsApi;
    private final PostEndpoint<String, ApiAcatsValidationResponse> accountEligibilityEndpoint;
    private final PostEndpoint<ApiAcatsAccountNumberValidationRequest, ApiAcatsValidationResponse> accountNumberValidationEndpoint;
    private final PostEndpoint<ApiAcatsDtcNumberValidationRequest, ApiAcatsValidationResponse> dtcNumberValidationEndpoint;
    private final PostEndpoint<ApiAcatsOptionValidationRequest, ApiAcatsOptionValidationResponse> optionValidationEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsValidationStore(AcatsApi acatsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(acatsApi, "acatsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.acatsApi = acatsApi;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.accountEligibilityEndpoint = companion.create(new AcatsValidationStore2(this, null), new AcatsValidationStore3(null));
        this.dtcNumberValidationEndpoint = companion.create(new AcatsValidationStore6(this, null), new AcatsValidationStore7(null));
        this.accountNumberValidationEndpoint = companion.create(new AcatsValidationStore4(this, null), new AcatsValidationStore5(null));
        this.optionValidationEndpoint = companion.create(new AcatsValidationStore8(this, null), new AcatsValidationStore9(null));
    }

    /* compiled from: AcatsValidationStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$getAccountEligibility$1", m3645f = "AcatsValidationStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$getAccountEligibility$1 */
    static final class C344791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiAcatsValidationResponse>, Object> {
        final /* synthetic */ String $rhsAccountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344791(String str, Continuation<? super C344791> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsValidationStore.this.new C344791(this.$rhsAccountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiAcatsValidationResponse> continuation) {
            return ((C344791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = AcatsValidationStore.this.accountEligibilityEndpoint;
                String str = this.$rhsAccountNumber;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, str, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiAcatsValidationResponse2.toUiModel((ApiAcatsValidationResponse) obj);
        }
    }

    public final Single<UiAcatsValidationResponse> getAccountEligibility(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Single<UiAcatsValidationResponse> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344791(rhsAccountNumber, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: AcatsValidationStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$postDtcNumberValidationRequest$1", m3645f = "AcatsValidationStore.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$postDtcNumberValidationRequest$1 */
    static final class C344811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiAcatsValidationResponse>, Object> {
        final /* synthetic */ ApiAcatsDtcNumberValidationRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344811(ApiAcatsDtcNumberValidationRequest apiAcatsDtcNumberValidationRequest, Continuation<? super C344811> continuation) {
            super(2, continuation);
            this.$request = apiAcatsDtcNumberValidationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsValidationStore.this.new C344811(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiAcatsValidationResponse> continuation) {
            return ((C344811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = AcatsValidationStore.this.dtcNumberValidationEndpoint;
                ApiAcatsDtcNumberValidationRequest apiAcatsDtcNumberValidationRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiAcatsDtcNumberValidationRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiAcatsValidationResponse2.toUiModel((ApiAcatsValidationResponse) obj);
        }
    }

    public final Single<UiAcatsValidationResponse> postDtcNumberValidationRequest(ApiAcatsDtcNumberValidationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<UiAcatsValidationResponse> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344811(request, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: AcatsValidationStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/ui/UiAcatsValidationResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$postAccountNumberValidationRequest$1", m3645f = "AcatsValidationStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$postAccountNumberValidationRequest$1 */
    static final class C344801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiAcatsValidationResponse>, Object> {
        final /* synthetic */ ApiAcatsAccountNumberValidationRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344801(ApiAcatsAccountNumberValidationRequest apiAcatsAccountNumberValidationRequest, Continuation<? super C344801> continuation) {
            super(2, continuation);
            this.$request = apiAcatsAccountNumberValidationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsValidationStore.this.new C344801(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiAcatsValidationResponse> continuation) {
            return ((C344801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = AcatsValidationStore.this.accountNumberValidationEndpoint;
                ApiAcatsAccountNumberValidationRequest apiAcatsAccountNumberValidationRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiAcatsAccountNumberValidationRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiAcatsValidationResponse2.toUiModel((ApiAcatsValidationResponse) obj);
        }
    }

    public final Single<UiAcatsValidationResponse> postAccountNumberValidationRequest(ApiAcatsAccountNumberValidationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<UiAcatsValidationResponse> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344801(request, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: AcatsValidationStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/ui/UiAcatsOptionValidationResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$postOptionValidationRequest$1", m3645f = "AcatsValidationStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore$postOptionValidationRequest$1 */
    static final class C344821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiAcatsOptionValidationResponse>, Object> {
        final /* synthetic */ ApiAcatsOptionValidationRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344821(ApiAcatsOptionValidationRequest apiAcatsOptionValidationRequest, Continuation<? super C344821> continuation) {
            super(2, continuation);
            this.$request = apiAcatsOptionValidationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsValidationStore.this.new C344821(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiAcatsOptionValidationResponse> continuation) {
            return ((C344821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = AcatsValidationStore.this.optionValidationEndpoint;
                ApiAcatsOptionValidationRequest apiAcatsOptionValidationRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiAcatsOptionValidationRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiAcatsOptionValidationResponse2.toUiModel((ApiAcatsOptionValidationResponse) obj);
        }
    }

    public final Single<UiAcatsOptionValidationResponse> postOptionValidationRequest(ApiAcatsOptionValidationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<UiAcatsOptionValidationResponse> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344821(request, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }
}
