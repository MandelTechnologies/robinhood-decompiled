package com.robinhood.android.equities.taxlots.microgram;

import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.extensions.StringsKt;
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
import microgram.contracts.quote_service.proto.p503v1.QuoteServiceService;
import microgram.contracts.quote_service.proto.p503v1.StreamEquityQuoteRequestDto;
import microgram.contracts.quote_service.proto.p503v1.StreamEquityQuoteResponseDto;

/* compiled from: RealQuoteService.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/microgram/RealQuoteService;", "Lmicrogram/contracts/quote_service/proto/v1/QuoteServiceService;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "StreamEquityQuote", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/quote_service/proto/v1/StreamEquityQuoteResponseDto;", "request", "Lmicrogram/contracts/quote_service/proto/v1/StreamEquityQuoteRequestDto;", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RealQuoteService implements QuoteServiceService {
    public static final int $stable = 8;
    private final QuoteStore quoteStore;

    public Flow<Response<StreamEquityQuoteResponseDto>> StreamEquityQuote(Request<StreamEquityQuoteRequestDto> request) {
        return QuoteServiceService.DefaultImpls.StreamEquityQuote(this, request);
    }

    public RealQuoteService(QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.quoteStore = quoteStore;
    }

    @Override // microgram.contracts.quote_service.proto.p503v1.QuoteServiceService
    public Flow<StreamEquityQuoteResponseDto> StreamEquityQuote(final StreamEquityQuoteRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Flow<Quote> flowAsFlow = this.quoteStore.getStreamQuote().asFlow(StringsKt.toUuid(request.getInstrument_id()));
        return new Flow<StreamEquityQuoteResponseDto>() { // from class: com.robinhood.android.equities.taxlots.microgram.RealQuoteService$StreamEquityQuote$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealQuoteService$StreamEquityQuote$$inlined$map$1$2 */
            public static final class C148742<T> implements FlowCollector {
                final /* synthetic */ StreamEquityQuoteRequestDto $request$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.microgram.RealQuoteService$StreamEquityQuote$$inlined$map$1$2", m3645f = "RealQuoteService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equities.taxlots.microgram.RealQuoteService$StreamEquityQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C148742.this.emit(null, this);
                    }
                }

                public C148742(FlowCollector flowCollector, StreamEquityQuoteRequestDto streamEquityQuoteRequestDto) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$request$inlined = streamEquityQuoteRequestDto;
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
                        StreamEquityQuoteResponseDto streamEquityQuoteResponseDto = new StreamEquityQuoteResponseDto(this.$request$inlined.getInstrument_id(), IdlDecimal2.toIdlDecimal(((Quote) obj).getLastTradePrice().getDecimalValue()));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamEquityQuoteResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super StreamEquityQuoteResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C148742(flowCollector, request), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
