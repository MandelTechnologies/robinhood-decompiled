package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.android.moria.p196db.Query;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.CryptoL2QuoteStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.models.api.ApiCryptoOrderInputType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.math.BigDecimals7;
import contracts.crypto.quote.proto.p429v1.CryptoQuoteService;
import contracts.crypto.quote.proto.p429v1.StreamCryptoQuoteRequestDto;
import contracts.crypto.quote.proto.p429v1.StreamCryptoQuoteResponseDto;
import contracts.crypto.trade.proto.p431v1.UserInputsDto;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import rosetta.nummus.MonetizationModelDto;
import rosetta.nummus.order.InputModeDto;
import rosetta.nummus.order.SideDto;

/* compiled from: CryptoQuoteServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoQuoteServiceImpl;", "Lcontracts/crypto/quote/proto/v1/CryptoQuoteService;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoL2QuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoL2QuoteStore;)V", "StreamCryptoQuote", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/crypto/quote/proto/v1/StreamCryptoQuoteResponseDto;", "request", "Lcontracts/crypto/quote/proto/v1/StreamCryptoQuoteRequestDto;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoQuoteServiceImpl implements CryptoQuoteService {
    public static final int $stable = 8;
    private final CryptoL2QuoteStore cryptoL2QuoteStore;
    private final CryptoQuoteStore cryptoQuoteStore;

    /* compiled from: CryptoQuoteServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[InputModeDto.values().length];
            try {
                iArr[InputModeDto.INPUT_MODE_ASSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputModeDto.INPUT_MODE_QUOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputModeDto.INPUT_MODE__UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SideDto.values().length];
            try {
                iArr2[SideDto.SIDE_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SideDto.SIDE_SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SideDto.SIDE__UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MonetizationModelDto.values().length];
            try {
                iArr3[MonetizationModelDto.MONETIZATION_MODEL_FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MonetizationModelDto.MONETIZATION_MODEL_REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[MonetizationModelDto.MONETIZATION_MODEL_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public Flow<Response<StreamCryptoQuoteResponseDto>> StreamCryptoQuote(Request<StreamCryptoQuoteRequestDto> request) {
        return CryptoQuoteService.DefaultImpls.StreamCryptoQuote(this, request);
    }

    public CryptoQuoteServiceImpl(CryptoQuoteStore cryptoQuoteStore, CryptoL2QuoteStore cryptoL2QuoteStore) {
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoL2QuoteStore, "cryptoL2QuoteStore");
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoL2QuoteStore = cryptoL2QuoteStore;
    }

    @Override // contracts.crypto.quote.proto.p429v1.CryptoQuoteService
    public Flow<StreamCryptoQuoteResponseDto> StreamCryptoQuote(StreamCryptoQuoteRequestDto request) {
        MonetizationModel monetizationModel;
        final Flow<CryptoQuote> flowAsFlow;
        ApiCryptoOrderInputType apiCryptoOrderInputType;
        OrderSide orderSide;
        MonetizationModel monetizationModel2;
        Intrinsics.checkNotNullParameter(request, "request");
        UserInputsDto user_inputs = request.getUser_inputs();
        if (user_inputs == null) {
            flowAsFlow = this.cryptoQuoteStore.getPollCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(StringsKt.toUuid(request.getCurrency_pair_id()), null, null, 6, null));
        } else {
            UserInputsDto.CryptoOrderPricesDto crypto_order_prices = user_inputs.getCrypto_order_prices();
            if ((crypto_order_prices != null ? crypto_order_prices.getPrices() : null) instanceof UserInputsDto.CryptoOrderPricesDto.PricesDto.Market) {
                CryptoL2QuoteStore cryptoL2QuoteStore = this.cryptoL2QuoteStore;
                UUID uuid = StringsKt.toUuid(request.getCurrency_pair_id());
                int i = WhenMappings.$EnumSwitchMapping$0[user_inputs.getInput_mode().ordinal()];
                if (i == 1) {
                    apiCryptoOrderInputType = ApiCryptoOrderInputType.BASE;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Required input_mode");
                    }
                    apiCryptoOrderInputType = ApiCryptoOrderInputType.QUOTE;
                }
                int i2 = WhenMappings.$EnumSwitchMapping$1[user_inputs.getOrder_side().ordinal()];
                if (i2 == 1) {
                    orderSide = OrderSide.BUY;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Required order_side");
                    }
                    orderSide = OrderSide.SELL;
                }
                IdlDecimal quantity = user_inputs.getQuantity();
                BigDecimal bigDecimalOrZero = BigDecimals7.orZero(quantity != null ? quantity.toBigDecimalOrNull() : null);
                int i3 = WhenMappings.$EnumSwitchMapping$2[user_inputs.getMonetization_model().ordinal()];
                if (i3 == 1) {
                    monetizationModel2 = MonetizationModel.FEE;
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    monetizationModel2 = MonetizationModel.REBATE;
                }
                flowAsFlow = Context7.buffer$default(RxConvert.asFlow(cryptoL2QuoteStore.pollCryptoL2Quote(new CryptoL2QuoteStore.Params(uuid, apiCryptoOrderInputType, orderSide, bigDecimalOrZero, monetizationModel2, null, 32, null))), Integer.MAX_VALUE, null, 2, null);
            } else {
                Query<CryptoQuoteStore.CryptoQuoteArgs, CryptoQuote> pollCryptoQuote = this.cryptoQuoteStore.getPollCryptoQuote();
                UUID uuid2 = StringsKt.toUuid(request.getCurrency_pair_id());
                if (WhenMappings.$EnumSwitchMapping$2[user_inputs.getMonetization_model().ordinal()] == 1) {
                    monetizationModel = MonetizationModel.FEE;
                } else {
                    monetizationModel = MonetizationModel.REBATE;
                }
                flowAsFlow = pollCryptoQuote.asFlow(new CryptoQuoteStore.CryptoQuoteArgs(uuid2, monetizationModel, null, 4, null));
            }
        }
        return new Flow<StreamCryptoQuoteResponseDto>() { // from class: com.robinhood.shared.trade.crypto.microgram.CryptoQuoteServiceImpl$StreamCryptoQuote$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoQuoteServiceImpl$StreamCryptoQuote$$inlined$map$1$2 */
            public static final class C401292<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.microgram.CryptoQuoteServiceImpl$StreamCryptoQuote$$inlined$map$1$2", m3645f = "CryptoQuoteServiceImpl.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoQuoteServiceImpl$StreamCryptoQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C401292.this.emit(null, this);
                    }
                }

                public C401292(FlowCollector flowCollector) {
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
                        Quote quote = (Quote) obj;
                        StreamCryptoQuoteResponseDto streamCryptoQuoteResponseDto = new StreamCryptoQuoteResponseDto(IdlDecimal2.toIdlDecimal(quote.getBidPrice().getDecimalValue()), IdlDecimal2.toIdlDecimal(quote.getMarkPrice().getDecimalValue()), IdlDecimal2.toIdlDecimal(quote.getAskPrice().getDecimalValue()));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamCryptoQuoteResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super StreamCryptoQuoteResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C401292(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
