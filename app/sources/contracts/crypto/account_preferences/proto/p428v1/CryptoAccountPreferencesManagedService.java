package contracts.crypto.account_preferences.proto.p428v1;

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

/* compiled from: CryptoAccountPreferencesManagedService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;", "", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequestDto;", "request", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelResponseDto;", "UpdateCryptoMonetizationModel", "(Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "StreamCryptoMonetizationModel", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelRequestDto;)Lkotlinx/coroutines/flow/Flow;", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService")
/* loaded from: classes18.dex */
public interface CryptoAccountPreferencesManagedService {

    /* compiled from: CryptoAccountPreferencesManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService$DefaultImpls", m3645f = "CryptoAccountPreferencesManagedService.kt", m3646l = {23}, m3647m = "UpdateCryptoMonetizationModel")
    /* renamed from: contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService$UpdateCryptoMonetizationModel$1 */
    static final class C438311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C438311(Continuation<? super C438311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.UpdateCryptoMonetizationModel(null, null, this);
        }
    }

    Flow<StreamCryptoMonetizationModelResponseDto> StreamCryptoMonetizationModel(StreamCryptoMonetizationModelRequestDto request);

    Object UpdateCryptoMonetizationModel(UpdateCryptoMonetizationModelRequestDto updateCryptoMonetizationModelRequestDto, Continuation<? super UpdateCryptoMonetizationModelResponseDto> continuation);

    /* compiled from: CryptoAccountPreferencesManagedService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object UpdateCryptoMonetizationModel(CryptoAccountPreferencesManagedService cryptoAccountPreferencesManagedService, Request<UpdateCryptoMonetizationModelRequestDto> request, Continuation<? super Response<UpdateCryptoMonetizationModelResponseDto>> continuation) {
            C438311 c438311;
            if (continuation instanceof C438311) {
                c438311 = (C438311) continuation;
                int i = c438311.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c438311.label = i - Integer.MIN_VALUE;
                } else {
                    c438311 = new C438311(continuation);
                }
            }
            Object objUpdateCryptoMonetizationModel = c438311.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c438311.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateCryptoMonetizationModel);
                UpdateCryptoMonetizationModelRequestDto data = request.getData();
                c438311.label = 1;
                objUpdateCryptoMonetizationModel = cryptoAccountPreferencesManagedService.UpdateCryptoMonetizationModel(data, c438311);
                if (objUpdateCryptoMonetizationModel == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateCryptoMonetizationModel);
            }
            return new Response(objUpdateCryptoMonetizationModel, null, 2, null);
        }

        public static Flow<Response<StreamCryptoMonetizationModelResponseDto>> StreamCryptoMonetizationModel(CryptoAccountPreferencesManagedService cryptoAccountPreferencesManagedService, Request<StreamCryptoMonetizationModelRequestDto> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            final Flow<StreamCryptoMonetizationModelResponseDto> flowStreamCryptoMonetizationModel = cryptoAccountPreferencesManagedService.StreamCryptoMonetizationModel(request.getData());
            return new Flow<Response<? extends StreamCryptoMonetizationModelResponseDto>>() { // from class: contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService$DefaultImpls$StreamCryptoMonetizationModel$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService$DefaultImpls$StreamCryptoMonetizationModel$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService$DefaultImpls$StreamCryptoMonetizationModel$$inlined$map$1$2", m3645f = "CryptoAccountPreferencesManagedService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService$DefaultImpls$StreamCryptoMonetizationModel$$inlined$map$1$2$1, reason: invalid class name */
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
                            Response response = new Response((StreamCryptoMonetizationModelResponseDto) obj, null, 2, null);
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
                public Object collect(FlowCollector<? super Response<? extends StreamCryptoMonetizationModelResponseDto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamCryptoMonetizationModel.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
    }
}
