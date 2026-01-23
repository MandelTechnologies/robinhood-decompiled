package com.robinhood.android.equities.microgram.service.shared;

import com.robinhood.coroutines.flow.BuildersKt;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.IssuerType;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.contracts.instrument_service.proto.p493v1.InstrumentService;
import microgram.contracts.instrument_service.proto.p493v1.StreamInstrumentRequestDto;
import microgram.contracts.instrument_service.proto.p493v1.StreamInstrumentResponseDto;
import rosetta.instrument.IPOAccessStatusDto;

/* compiled from: RealInstrumentService.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equities/microgram/service/shared/RealInstrumentService;", "Lmicrogram/contracts/instrument_service/proto/v1/InstrumentService;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "StreamInstrument", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto;", "request", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentRequestDto;", "lib-equity-microgram-service-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RealInstrumentService implements InstrumentService {
    public static final int $stable = 8;
    private final InstrumentStore instrumentStore;

    public Flow<Response<StreamInstrumentResponseDto>> StreamInstrument(Request<StreamInstrumentRequestDto> request) {
        return InstrumentService.DefaultImpls.StreamInstrument(this, request);
    }

    public RealInstrumentService(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.instrumentStore = instrumentStore;
    }

    @Override // microgram.contracts.instrument_service.proto.p493v1.InstrumentService
    public Flow<StreamInstrumentResponseDto> StreamInstrument(StreamInstrumentRequestDto request) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            uuid = StringsKt.toUuid(request.getInstrument_id());
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        if (uuid != null) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.instrumentStore.getInstrument(uuid)), Integer.MAX_VALUE, null, 2, null);
            return new Flow<StreamInstrumentResponseDto>() { // from class: com.robinhood.android.equities.microgram.service.shared.RealInstrumentService$StreamInstrument$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.microgram.service.shared.RealInstrumentService$StreamInstrument$$inlined$map$1$2 */
                public static final class C147292<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equities.microgram.service.shared.RealInstrumentService$StreamInstrument$$inlined$map$1$2", m3645f = "RealInstrumentService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.equities.microgram.service.shared.RealInstrumentService$StreamInstrument$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C147292.this.emit(null, this);
                        }
                    }

                    public C147292(FlowCollector flowCollector) {
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
                            Instrument instrument = (Instrument) obj;
                            String symbol = instrument.getSymbol();
                            String string2 = instrument.getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            IpoAccessStatus ipoAccessStatus = instrument.getIpoAccessStatus();
                            IPOAccessStatusDto dtoModel = ipoAccessStatus != null ? RealInstrumentService2.toDtoModel(ipoAccessStatus) : null;
                            IssuerType issuerType = instrument.getIssuerType();
                            StreamInstrumentResponseDto streamInstrumentResponseDto = new StreamInstrumentResponseDto(issuerType != null ? RealInstrumentService2.toDtoModel(issuerType) : null, dtoModel, string2, symbol);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(streamInstrumentResponseDto, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super StreamInstrumentResponseDto> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C147292(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        return BuildersKt.neverFlow();
    }
}
