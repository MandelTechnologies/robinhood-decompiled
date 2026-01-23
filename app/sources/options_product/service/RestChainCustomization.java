package options_product.service;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestChainCustomization.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Loptions_product/service/RestChainCustomization;", "Loptions_product/service/ChainCustomization;", "Loptions_product/service/ChainCustomizationRetrofit;", "retrofit", "<init>", "(Loptions_product/service/ChainCustomizationRetrofit;)V", "Loptions_product/service/SbsChainCustomizationResponseDto;", "GetSbsChainCustomization", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "", "request", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/UpdateSbsChainCustomizationRequestDto;", "UpdateSbsChainCustomization", "(Loptions_product/service/UpdateSbsChainCustomizationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/ChainCustomizationRetrofit;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RestChainCustomization implements ChainCustomization {
    private final ChainCustomizationRetrofit retrofit;

    /* compiled from: RestChainCustomization.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestChainCustomization", m3645f = "RestChainCustomization.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "GetSbsChainCustomization")
    /* renamed from: options_product.service.RestChainCustomization$GetSbsChainCustomization$1 */
    static final class C475781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475781(Continuation<? super C475781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChainCustomization.this.GetSbsChainCustomization(this);
        }
    }

    /* compiled from: RestChainCustomization.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestChainCustomization", m3645f = "RestChainCustomization.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "GetSbsChainCustomization")
    /* renamed from: options_product.service.RestChainCustomization$GetSbsChainCustomization$2 */
    static final class C475792 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475792(Continuation<? super C475792> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChainCustomization.this.GetSbsChainCustomization(null, this);
        }
    }

    /* compiled from: RestChainCustomization.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestChainCustomization", m3645f = "RestChainCustomization.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "UpdateSbsChainCustomization")
    /* renamed from: options_product.service.RestChainCustomization$UpdateSbsChainCustomization$1 */
    static final class C475801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475801(Continuation<? super C475801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChainCustomization.this.UpdateSbsChainCustomization((UpdateSbsChainCustomizationRequestDto) null, this);
        }
    }

    /* compiled from: RestChainCustomization.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "options_product.service.RestChainCustomization", m3645f = "RestChainCustomization.kt", m3646l = {155}, m3647m = "UpdateSbsChainCustomization")
    /* renamed from: options_product.service.RestChainCustomization$UpdateSbsChainCustomization$2 */
    static final class C475812 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C475812(Continuation<? super C475812> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChainCustomization.this.UpdateSbsChainCustomization((Request<UpdateSbsChainCustomizationRequestDto>) null, this);
        }
    }

    public RestChainCustomization(ChainCustomizationRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.ChainCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSbsChainCustomization(Continuation<? super SbsChainCustomizationResponseDto> continuation) {
        C475781 c475781;
        if (continuation instanceof C475781) {
            c475781 = (C475781) continuation;
            int i = c475781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475781.label = i - Integer.MIN_VALUE;
            } else {
                c475781 = new C475781(continuation);
            }
        }
        Object objGetSbsChainCustomization = c475781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSbsChainCustomization);
            Request<Unit> request = new Request<>(Unit.INSTANCE, null, 2, null);
            c475781.label = 1;
            objGetSbsChainCustomization = GetSbsChainCustomization(request, c475781);
            if (objGetSbsChainCustomization == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSbsChainCustomization);
        }
        return ((Response) objGetSbsChainCustomization).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSbsChainCustomization(Request<Unit> request, Continuation<? super Response<SbsChainCustomizationResponseDto>> continuation) {
        C475792 c475792;
        if (continuation instanceof C475792) {
            c475792 = (C475792) continuation;
            int i = c475792.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475792.label = i - Integer.MIN_VALUE;
            } else {
                c475792 = new C475792(continuation);
            }
        }
        Object objGetSbsChainCustomization = c475792.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475792.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSbsChainCustomization);
            ChainCustomizationRetrofit chainCustomizationRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c475792.label = 1;
            objGetSbsChainCustomization = chainCustomizationRetrofit.GetSbsChainCustomization(metadata, c475792);
            if (objGetSbsChainCustomization == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSbsChainCustomization);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSbsChainCustomization);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // options_product.service.ChainCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateSbsChainCustomization(UpdateSbsChainCustomizationRequestDto updateSbsChainCustomizationRequestDto, Continuation<? super SbsChainCustomizationResponseDto> continuation) {
        C475801 c475801;
        if (continuation instanceof C475801) {
            c475801 = (C475801) continuation;
            int i = c475801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475801.label = i - Integer.MIN_VALUE;
            } else {
                c475801 = new C475801(continuation);
            }
        }
        Object objUpdateSbsChainCustomization = c475801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateSbsChainCustomization);
            Request<UpdateSbsChainCustomizationRequestDto> request = new Request<>(updateSbsChainCustomizationRequestDto, null, 2, null);
            c475801.label = 1;
            objUpdateSbsChainCustomization = UpdateSbsChainCustomization(request, c475801);
            if (objUpdateSbsChainCustomization == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateSbsChainCustomization);
        }
        return ((Response) objUpdateSbsChainCustomization).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateSbsChainCustomization(Request<UpdateSbsChainCustomizationRequestDto> request, Continuation<? super Response<SbsChainCustomizationResponseDto>> continuation) {
        C475812 c475812;
        if (continuation instanceof C475812) {
            c475812 = (C475812) continuation;
            int i = c475812.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c475812.label = i - Integer.MIN_VALUE;
            } else {
                c475812 = new C475812(continuation);
            }
        }
        Object objUpdateSbsChainCustomization = c475812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c475812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateSbsChainCustomization);
            ChainCustomizationRetrofit chainCustomizationRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            UpdateSbsChainCustomizationRequestDto data = request.getData();
            c475812.label = 1;
            objUpdateSbsChainCustomization = chainCustomizationRetrofit.UpdateSbsChainCustomization(metadata, data, c475812);
            if (objUpdateSbsChainCustomization == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateSbsChainCustomization);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateSbsChainCustomization);
    }
}
