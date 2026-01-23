package com.robinhood.android.futures.assethome.microgram;

import com.robinhood.android.models.futures.p189db.UiFuturesIntervalPerformance;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesPerformanceStore;
import futures_asset_home.proto.p462v1.FuturesAssetHomeClientService;
import futures_asset_home.proto.p462v1.GetFuturesIntervalPerformanceRequestDto;
import futures_asset_home.proto.p462v1.GetFuturesIntervalPerformanceResponseDto;
import java.util.UUID;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesAssetHomeClientServiceImp.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/microgram/FuturesAssetHomeClientServiceImp;", "Lfutures_asset_home/proto/v1/FuturesAssetHomeClientService;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresPerformanceStore", "Lcom/robinhood/store/futures/FuturesPerformanceStore;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/FuturesPerformanceStore;)V", "GetFuturesIntervalPerformance", "Lkotlinx/coroutines/flow/Flow;", "Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceResponseDto;", "request", "Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceRequestDto;", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAssetHomeClientServiceImp implements FuturesAssetHomeClientService {
    public static final int $stable = 8;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesPerformanceStore futuresPerformanceStore;

    public Flow<Response<GetFuturesIntervalPerformanceResponseDto>> GetFuturesIntervalPerformance(Request<GetFuturesIntervalPerformanceRequestDto> request) {
        return FuturesAssetHomeClientService.DefaultImpls.GetFuturesIntervalPerformance(this, request);
    }

    public FuturesAssetHomeClientServiceImp(FuturesAccountStore futuresAccountStore, FuturesPerformanceStore futuresPerformanceStore) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresPerformanceStore, "futuresPerformanceStore");
        this.futuresAccountStore = futuresAccountStore;
        this.futuresPerformanceStore = futuresPerformanceStore;
    }

    /* compiled from: FuturesAssetHomeClientServiceImp.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.microgram.FuturesAssetHomeClientServiceImp$GetFuturesIntervalPerformance$1", m3645f = "FuturesAssetHomeClientServiceImp.kt", m3646l = {26, 28}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.assethome.microgram.FuturesAssetHomeClientServiceImp$GetFuturesIntervalPerformance$1 */
    static final class C169771 extends ContinuationImpl7 implements Function2<FlowCollector<? super GetFuturesIntervalPerformanceResponseDto>, Continuation<? super Unit>, Object> {
        final /* synthetic */ GetFuturesIntervalPerformanceRequestDto $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C169771(GetFuturesIntervalPerformanceRequestDto getFuturesIntervalPerformanceRequestDto, Continuation<? super C169771> continuation) {
            super(2, continuation);
            this.$request = getFuturesIntervalPerformanceRequestDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C169771 c169771 = FuturesAssetHomeClientServiceImp.this.new C169771(this.$request, continuation);
            c169771.L$0 = obj;
            return c169771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super GetFuturesIntervalPerformanceResponseDto> flowCollector, Continuation<? super Unit> continuation) {
            return ((C169771) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r4, r10) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                FuturesAccountStore futuresAccountStore = FuturesAssetHomeClientServiceImp.this.futuresAccountStore;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FuturesAccountStore.getFuturesAccountIdOrNull$default(futuresAccountStore, null, this, 1, null);
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
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) obj;
            if (uuid != null) {
                final Flow flowStreamFuturesIntervalPerformance$default = FuturesPerformanceStore.streamFuturesIntervalPerformance$default(FuturesAssetHomeClientServiceImp.this.futuresPerformanceStore, uuid, IdlExtentions.toSpanDto(this.$request.getDisplay_span()), null, 4, null);
                Flow<GetFuturesIntervalPerformanceResponseDto> flow = new Flow<GetFuturesIntervalPerformanceResponseDto>() { // from class: com.robinhood.android.futures.assethome.microgram.FuturesAssetHomeClientServiceImp$GetFuturesIntervalPerformance$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.assethome.microgram.FuturesAssetHomeClientServiceImp$GetFuturesIntervalPerformance$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.microgram.FuturesAssetHomeClientServiceImp$GetFuturesIntervalPerformance$1$invokeSuspend$$inlined$map$1$2", m3645f = "FuturesAssetHomeClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.assethome.microgram.FuturesAssetHomeClientServiceImp$GetFuturesIntervalPerformance$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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
                                GetFuturesIntervalPerformanceResponseDto getFuturesIntervalPerformanceResponseDto = IdlExtentions.toGetFuturesIntervalPerformanceResponseDto((UiFuturesIntervalPerformance) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(getFuturesIntervalPerformanceResponseDto, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super GetFuturesIntervalPerformanceResponseDto> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamFuturesIntervalPerformance$default.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // futures_asset_home.proto.p462v1.FuturesAssetHomeClientService
    public Flow<GetFuturesIntervalPerformanceResponseDto> GetFuturesIntervalPerformance(GetFuturesIntervalPerformanceRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flow(new C169771(request, null));
    }
}
