package com.robinhood.android.equities.microgram.service.shared;

import com.robinhood.coroutines.flow.BuildersKt;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import microgram.contracts.etp_details_service.proto.p489v1.EtpDetailsService;
import microgram.contracts.etp_details_service.proto.p489v1.StreamEtpDetailsRequestDto;
import microgram.contracts.etp_details_service.proto.p489v1.StreamEtpDetailsResponseDto;
import p479j$.time.LocalDate;

/* compiled from: RealEtpDetailsService.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equities/microgram/service/shared/RealEtpDetailsService;", "Lmicrogram/contracts/etp_details_service/proto/v1/EtpDetailsService;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;)V", "StreamEtpDetails", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponseDto;", "request", "Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsRequestDto;", "lib-equity-microgram-service-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RealEtpDetailsService implements EtpDetailsService {
    public static final int $stable = 8;
    private final EtpDetailsStore etpDetailsStore;

    public Flow<Response<StreamEtpDetailsResponseDto>> StreamEtpDetails(Request<StreamEtpDetailsRequestDto> request) {
        return EtpDetailsService.DefaultImpls.StreamEtpDetails(this, request);
    }

    public RealEtpDetailsService(EtpDetailsStore etpDetailsStore) {
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        this.etpDetailsStore = etpDetailsStore;
    }

    @Override // microgram.contracts.etp_details_service.proto.p489v1.EtpDetailsService
    public Flow<StreamEtpDetailsResponseDto> StreamEtpDetails(final StreamEtpDetailsRequestDto request) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            uuid = StringsKt.toUuid(request.getInstrument_id());
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        if (uuid == null) {
            return BuildersKt.neverFlow();
        }
        final Flow<EtpDetails> flowAsFlow = this.etpDetailsStore.getStreamEtpDetails().asFlow(uuid);
        return new Flow<StreamEtpDetailsResponseDto>() { // from class: com.robinhood.android.equities.microgram.service.shared.RealEtpDetailsService$StreamEtpDetails$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.microgram.service.shared.RealEtpDetailsService$StreamEtpDetails$$inlined$map$1$2 */
            public static final class C147282<T> implements FlowCollector {
                final /* synthetic */ StreamEtpDetailsRequestDto $request$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.microgram.service.shared.RealEtpDetailsService$StreamEtpDetails$$inlined$map$1$2", m3645f = "RealEtpDetailsService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.microgram.service.shared.RealEtpDetailsService$StreamEtpDetails$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C147282.this.emit(null, this);
                    }
                }

                public C147282(FlowCollector flowCollector, StreamEtpDetailsRequestDto streamEtpDetailsRequestDto) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$request$inlined = streamEtpDetailsRequestDto;
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
                        EtpDetails etpDetails = (EtpDetails) obj;
                        String instrument_id = this.$request$inlined.getInstrument_id();
                        Float grossExpenseRatio = etpDetails.getGrossExpenseRatio();
                        IdlDecimal idlDecimal = grossExpenseRatio != null ? IdlDecimal2.toIdlDecimal(new BigDecimal(String.valueOf(grossExpenseRatio.floatValue()))) : null;
                        BigDecimal grossManagementFee = etpDetails.getGrossManagementFee();
                        IdlDecimal idlDecimal2 = grossManagementFee != null ? IdlDecimal2.toIdlDecimal(grossManagementFee) : null;
                        BigDecimal grossManagementFeeDiscount = etpDetails.getGrossManagementFeeDiscount();
                        IdlDecimal idlDecimal3 = grossManagementFeeDiscount != null ? IdlDecimal2.toIdlDecimal(grossManagementFeeDiscount) : null;
                        LocalDate grossManagementFeeDiscountExpirationDate = etpDetails.getGrossManagementFeeDiscountExpirationDate();
                        StreamEtpDetailsResponseDto streamEtpDetailsResponseDto = new StreamEtpDetailsResponseDto(instrument_id, idlDecimal3, idlDecimal2, grossManagementFeeDiscountExpirationDate != null ? new DateDto(grossManagementFeeDiscountExpirationDate.getYear(), grossManagementFeeDiscountExpirationDate.getMonthValue(), grossManagementFeeDiscountExpirationDate.getDayOfMonth()) : null, idlDecimal);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamEtpDetailsResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super StreamEtpDetailsResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C147282(flowCollector, request), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
