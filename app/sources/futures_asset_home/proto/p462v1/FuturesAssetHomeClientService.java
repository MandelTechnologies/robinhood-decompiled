package futures_asset_home.proto.p462v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import microgram.annotation.ManagedServices;

/* compiled from: FuturesAssetHomeClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesAssetHomeClientService;", "", "Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceResponseDto;", "GetFuturesIntervalPerformance", "(Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceRequestDto;)Lkotlinx/coroutines/flow/Flow;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "futures_asset_home.proto.v1.FuturesAssetHomeClientService")
/* loaded from: classes18.dex */
public interface FuturesAssetHomeClientService {
    Flow<GetFuturesIntervalPerformanceResponseDto> GetFuturesIntervalPerformance(GetFuturesIntervalPerformanceRequestDto request);

    /* compiled from: FuturesAssetHomeClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Flow<Response<GetFuturesIntervalPerformanceResponseDto>> GetFuturesIntervalPerformance(FuturesAssetHomeClientService futuresAssetHomeClientService, Request<GetFuturesIntervalPerformanceRequestDto> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            final Flow<GetFuturesIntervalPerformanceResponseDto> flowGetFuturesIntervalPerformance = futuresAssetHomeClientService.GetFuturesIntervalPerformance(request.getData());
            return new Flow<Response<? extends GetFuturesIntervalPerformanceResponseDto>>() { // from class: futures_asset_home.proto.v1.FuturesAssetHomeClientService$DefaultImpls$GetFuturesIntervalPerformance$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: futures_asset_home.proto.v1.FuturesAssetHomeClientService$DefaultImpls$GetFuturesIntervalPerformance$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "futures_asset_home.proto.v1.FuturesAssetHomeClientService$DefaultImpls$GetFuturesIntervalPerformance$$inlined$map$1$2", m3645f = "FuturesAssetHomeClientService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: futures_asset_home.proto.v1.FuturesAssetHomeClientService$DefaultImpls$GetFuturesIntervalPerformance$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Response response = new Response((GetFuturesIntervalPerformanceResponseDto) obj, null, 2, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(response, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Response<? extends GetFuturesIntervalPerformanceResponseDto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowGetFuturesIntervalPerformance.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
    }
}
