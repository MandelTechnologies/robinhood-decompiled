package cache.p044v1;

import cache.p044v1.CacheClientService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CacheClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcache/v1/RefreshResponseDto;", "request", "Lcache/v1/RefreshRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "cache.v1.CacheClientService_Adapter$RefreshEndpoint$call$1", m3645f = "CacheClientService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: cache.v1.CacheClientService_Adapter$RefreshEndpoint$call$1, reason: use source file name */
/* loaded from: classes16.dex */
final class CacheClientService_Adapter2 extends ContinuationImpl7 implements Function2<RefreshRequestDto, Continuation<? super RefreshResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CacheClientService_Adapter.RefreshEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CacheClientService_Adapter2(CacheClientService_Adapter.RefreshEndpoint refreshEndpoint, Continuation<? super CacheClientService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = refreshEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CacheClientService_Adapter2 cacheClientService_Adapter2 = new CacheClientService_Adapter2(this.this$0, continuation);
        cacheClientService_Adapter2.L$0 = obj;
        return cacheClientService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RefreshRequestDto refreshRequestDto, Continuation<? super RefreshResponseDto> continuation) {
        return ((CacheClientService_Adapter2) create(refreshRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RefreshRequestDto refreshRequestDto = (RefreshRequestDto) this.L$0;
        CacheClientService cacheClientService = this.this$0.service;
        this.label = 1;
        Object objRefresh = cacheClientService.Refresh(refreshRequestDto, this);
        return objRefresh == coroutine_suspended ? coroutine_suspended : objRefresh;
    }
}
