package crypto.fee_tier.proto.p434v1;

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

/* compiled from: CryptoFeeTierInfoManagedService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "StreamCryptoFeeTierInfo", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoRequestDto;", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoResponseDto;", "GetCryptoFeeTierInfo", "(Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService")
/* loaded from: classes18.dex */
public interface CryptoFeeTierInfoManagedService {

    /* compiled from: CryptoFeeTierInfoManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService$DefaultImpls", m3645f = "CryptoFeeTierInfoManagedService.kt", m3646l = {35}, m3647m = "GetCryptoFeeTierInfo")
    /* renamed from: crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService$GetCryptoFeeTierInfo$1 */
    static final class C441431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C441431(Continuation<? super C441431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCryptoFeeTierInfo(null, null, this);
        }
    }

    Object GetCryptoFeeTierInfo(GetCryptoFeeTierInfoRequestDto getCryptoFeeTierInfoRequestDto, Continuation<? super GetCryptoFeeTierInfoResponseDto> continuation);

    Flow<StreamCryptoFeeTierInfoResponseDto> StreamCryptoFeeTierInfo(StreamCryptoFeeTierInfoRequestDto request);

    /* compiled from: CryptoFeeTierInfoManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Flow<Response<StreamCryptoFeeTierInfoResponseDto>> StreamCryptoFeeTierInfo(CryptoFeeTierInfoManagedService cryptoFeeTierInfoManagedService, Request<StreamCryptoFeeTierInfoRequestDto> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            final Flow<StreamCryptoFeeTierInfoResponseDto> flowStreamCryptoFeeTierInfo = cryptoFeeTierInfoManagedService.StreamCryptoFeeTierInfo(request.getData());
            return new Flow<Response<? extends StreamCryptoFeeTierInfoResponseDto>>() { // from class: crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService$DefaultImpls$StreamCryptoFeeTierInfo$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService$DefaultImpls$StreamCryptoFeeTierInfo$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService$DefaultImpls$StreamCryptoFeeTierInfo$$inlined$map$1$2", m3645f = "CryptoFeeTierInfoManagedService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService$DefaultImpls$StreamCryptoFeeTierInfo$$inlined$map$1$2$1, reason: invalid class name */
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
                            Response response = new Response((StreamCryptoFeeTierInfoResponseDto) obj, null, 2, null);
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
                public Object collect(FlowCollector<? super Response<? extends StreamCryptoFeeTierInfoResponseDto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamCryptoFeeTierInfo.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCryptoFeeTierInfo(CryptoFeeTierInfoManagedService cryptoFeeTierInfoManagedService, Request<GetCryptoFeeTierInfoRequestDto> request, Continuation<? super Response<GetCryptoFeeTierInfoResponseDto>> continuation) {
            C441431 c441431;
            if (continuation instanceof C441431) {
                c441431 = (C441431) continuation;
                int i = c441431.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c441431.label = i - Integer.MIN_VALUE;
                } else {
                    c441431 = new C441431(continuation);
                }
            }
            Object objGetCryptoFeeTierInfo = c441431.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c441431.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCryptoFeeTierInfo);
                GetCryptoFeeTierInfoRequestDto data = request.getData();
                c441431.label = 1;
                objGetCryptoFeeTierInfo = cryptoFeeTierInfoManagedService.GetCryptoFeeTierInfo(data, c441431);
                if (objGetCryptoFeeTierInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCryptoFeeTierInfo);
            }
            return new Response(objGetCryptoFeeTierInfo, null, 2, null);
        }
    }
}
