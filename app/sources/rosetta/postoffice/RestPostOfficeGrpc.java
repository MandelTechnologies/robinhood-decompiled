package rosetta.postoffice;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestPostOfficeGrpc.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lrosetta/postoffice/RestPostOfficeGrpc;", "Lrosetta/postoffice/PostOfficeGrpc;", "retrofit", "Lrosetta/postoffice/PostOfficeGrpcRetrofit;", "<init>", "(Lrosetta/postoffice/PostOfficeGrpcRetrofit;)V", "ShouldBadge", "Lrosetta/postoffice/ShouldBadgeResponseDto;", "request", "Lrosetta/postoffice/ShouldBadgeRequestDto;", "(Lrosetta/postoffice/ShouldBadgeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SawBadge", "Lrosetta/postoffice/SawBadgeResponseDto;", "Lrosetta/postoffice/SawBadgeRequestDto;", "(Lrosetta/postoffice/SawBadgeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RestPostOfficeGrpc implements PostOfficeGrpc {
    private final PostOfficeGrpcRetrofit retrofit;

    /* compiled from: RestPostOfficeGrpc.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.postoffice.RestPostOfficeGrpc", m3645f = "RestPostOfficeGrpc.kt", m3646l = {36}, m3647m = "SawBadge")
    /* renamed from: rosetta.postoffice.RestPostOfficeGrpc$SawBadge$1 */
    static final class C489061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C489061(Continuation<? super C489061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPostOfficeGrpc.this.SawBadge((SawBadgeRequestDto) null, this);
        }
    }

    /* compiled from: RestPostOfficeGrpc.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.postoffice.RestPostOfficeGrpc", m3645f = "RestPostOfficeGrpc.kt", m3646l = {42}, m3647m = "SawBadge")
    /* renamed from: rosetta.postoffice.RestPostOfficeGrpc$SawBadge$2 */
    static final class C489072 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C489072(Continuation<? super C489072> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPostOfficeGrpc.this.SawBadge((Request<SawBadgeRequestDto>) null, this);
        }
    }

    /* compiled from: RestPostOfficeGrpc.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.postoffice.RestPostOfficeGrpc", m3645f = "RestPostOfficeGrpc.kt", m3646l = {20}, m3647m = "ShouldBadge")
    /* renamed from: rosetta.postoffice.RestPostOfficeGrpc$ShouldBadge$1 */
    static final class C489081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C489081(Continuation<? super C489081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPostOfficeGrpc.this.ShouldBadge((ShouldBadgeRequestDto) null, this);
        }
    }

    /* compiled from: RestPostOfficeGrpc.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "rosetta.postoffice.RestPostOfficeGrpc", m3645f = "RestPostOfficeGrpc.kt", m3646l = {26}, m3647m = "ShouldBadge")
    /* renamed from: rosetta.postoffice.RestPostOfficeGrpc$ShouldBadge$2 */
    static final class C489092 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C489092(Continuation<? super C489092> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestPostOfficeGrpc.this.ShouldBadge((Request<ShouldBadgeRequestDto>) null, this);
        }
    }

    public RestPostOfficeGrpc(PostOfficeGrpcRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rosetta.postoffice.PostOfficeGrpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ShouldBadge(ShouldBadgeRequestDto shouldBadgeRequestDto, Continuation<? super ShouldBadgeResponseDto> continuation) {
        C489081 c489081;
        if (continuation instanceof C489081) {
            c489081 = (C489081) continuation;
            int i = c489081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c489081.label = i - Integer.MIN_VALUE;
            } else {
                c489081 = new C489081(continuation);
            }
        }
        Object objShouldBadge = c489081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c489081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objShouldBadge);
            Request<ShouldBadgeRequestDto> request = new Request<>(shouldBadgeRequestDto, null, 2, null);
            c489081.label = 1;
            objShouldBadge = ShouldBadge(request, c489081);
            if (objShouldBadge == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objShouldBadge);
        }
        return ((Response) objShouldBadge).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ShouldBadge(Request<ShouldBadgeRequestDto> request, Continuation<? super Response<ShouldBadgeResponseDto>> continuation) {
        C489092 c489092;
        if (continuation instanceof C489092) {
            c489092 = (C489092) continuation;
            int i = c489092.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c489092.label = i - Integer.MIN_VALUE;
            } else {
                c489092 = new C489092(continuation);
            }
        }
        Object objShouldBadge = c489092.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c489092.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objShouldBadge);
            PostOfficeGrpcRetrofit postOfficeGrpcRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String user_uuid = !Intrinsics.areEqual(request.getData().getUser_uuid(), "") ? request.getData().getUser_uuid() : null;
            c489092.label = 1;
            objShouldBadge = postOfficeGrpcRetrofit.ShouldBadge(metadata, user_uuid, c489092);
            if (objShouldBadge == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objShouldBadge);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objShouldBadge);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rosetta.postoffice.PostOfficeGrpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SawBadge(SawBadgeRequestDto sawBadgeRequestDto, Continuation<? super SawBadgeResponseDto> continuation) {
        C489061 c489061;
        if (continuation instanceof C489061) {
            c489061 = (C489061) continuation;
            int i = c489061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c489061.label = i - Integer.MIN_VALUE;
            } else {
                c489061 = new C489061(continuation);
            }
        }
        Object objSawBadge = c489061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c489061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSawBadge);
            Request<SawBadgeRequestDto> request = new Request<>(sawBadgeRequestDto, null, 2, null);
            c489061.label = 1;
            objSawBadge = SawBadge(request, c489061);
            if (objSawBadge == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSawBadge);
        }
        return ((Response) objSawBadge).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SawBadge(Request<SawBadgeRequestDto> request, Continuation<? super Response<SawBadgeResponseDto>> continuation) {
        C489072 c489072;
        if (continuation instanceof C489072) {
            c489072 = (C489072) continuation;
            int i = c489072.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c489072.label = i - Integer.MIN_VALUE;
            } else {
                c489072 = new C489072(continuation);
            }
        }
        Object objSawBadge = c489072.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c489072.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSawBadge);
            PostOfficeGrpcRetrofit postOfficeGrpcRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SawBadgeRequestDto data = request.getData();
            c489072.label = 1;
            objSawBadge = postOfficeGrpcRetrofit.SawBadge(metadata, data, c489072);
            if (objSawBadge == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSawBadge);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSawBadge);
    }
}
