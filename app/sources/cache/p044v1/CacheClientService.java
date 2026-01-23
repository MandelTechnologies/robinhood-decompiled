package cache.p044v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: CacheClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcache/v1/CacheClientService;", "", "Lcache/v1/RefreshRequestDto;", "request", "Lcache/v1/RefreshResponseDto;", "Refresh", "(Lcache/v1/RefreshRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cache.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "cache.v1.CacheClientService")
/* loaded from: classes16.dex */
public interface CacheClientService {

    /* compiled from: CacheClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "cache.v1.CacheClientService$DefaultImpls", m3645f = "CacheClientService.kt", m3646l = {24}, m3647m = "Refresh")
    /* renamed from: cache.v1.CacheClientService$Refresh$1 */
    static final class C45381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45381(Continuation<? super C45381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.Refresh(null, null, this);
        }
    }

    Object Refresh(RefreshRequestDto refreshRequestDto, Continuation<? super RefreshResponseDto> continuation);

    /* compiled from: CacheClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object Refresh(CacheClientService cacheClientService, Request<RefreshRequestDto> request, Continuation<? super Response<RefreshResponseDto>> continuation) {
            C45381 c45381;
            if (continuation instanceof C45381) {
                c45381 = (C45381) continuation;
                int i = c45381.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c45381.label = i - Integer.MIN_VALUE;
                } else {
                    c45381 = new C45381(continuation);
                }
            }
            Object objRefresh = c45381.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c45381.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRefresh);
                RefreshRequestDto data = request.getData();
                c45381.label = 1;
                objRefresh = cacheClientService.Refresh(data, c45381);
                if (objRefresh == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRefresh);
            }
            return new Response(objRefresh, null, 2, null);
        }
    }
}
