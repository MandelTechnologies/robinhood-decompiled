package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTier;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo4;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo5;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo6;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoDto;
import crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoErrorTypeDto;
import crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService;
import crypto.fee_tier.proto.p434v1.DepositIncentivePromoDto;
import crypto.fee_tier.proto.p434v1.FeeTierDto;
import crypto.fee_tier.proto.p434v1.FeeTierPromoDto;
import crypto.fee_tier.proto.p434v1.FeeTierSourceDto;
import crypto.fee_tier.proto.p434v1.FeeTierStatusDto;
import crypto.fee_tier.proto.p434v1.GetCryptoFeeTierInfoErrorResponseDto;
import crypto.fee_tier.proto.p434v1.GetCryptoFeeTierInfoRequestDto;
import crypto.fee_tier.proto.p434v1.GetCryptoFeeTierInfoResponseDto;
import crypto.fee_tier.proto.p434v1.GetCryptoFeeTierInfoSuccessResponseDto;
import crypto.fee_tier.proto.p434v1.IntroductoryPromoDto;
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoRequestDto;
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoResponseDto;
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoSuccessResponseDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.FeeTierPromoDto;
import p479j$.time.Instant;

/* compiled from: CryptoFeeTierInfoManagedServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0012\u001a\u00020\u0017*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u001b*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierInfoManagedServiceImpl;", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "cryptoFeeTierStore", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;)V", "StreamCryptoFeeTierInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "request", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoRequestDto;", "GetCryptoFeeTierInfo", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoResponseDto;", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoRequestDto;", "(Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamCryptoFeeTierInfo", "protoModel", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoDto;", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "getProtoModel", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;)Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoDto;", "Lnummus/v1/FeeTierDto;", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTier;", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTier;)Lnummus/v1/FeeTierDto;", "legacyModel", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "getLegacyModel", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTier;)Lcrypto/fee_tier/proto/v1/FeeTierDto;", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoFeeTierInfoManagedServiceImpl implements CryptoFeeTierInfoManagedService {
    private static final boolean SUPPORT_FEE_TIER_INFO_IDL = false;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoFeeTierStore cryptoFeeTierStore;

    /* compiled from: CryptoFeeTierInfoManagedServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl", m3645f = "CryptoFeeTierInfoManagedServiceImpl.kt", m3646l = {86, 97}, m3647m = "GetCryptoFeeTierInfo")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$GetCryptoFeeTierInfo$1 */
    static final class C348051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348051(Continuation<? super C348051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoFeeTierInfoManagedServiceImpl.this.GetCryptoFeeTierInfo((GetCryptoFeeTierInfoRequestDto) null, this);
        }
    }

    /* compiled from: CryptoFeeTierInfoManagedServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoFeeTierInfo5.values().length];
            try {
                iArr[CryptoFeeTierInfo5.TRADING_VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeTierInfo5.DEPOSIT_INCENTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoFeeTierInfo5.RH_EMPLOYEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoFeeTierInfo5.INTRODUCTORY_PROMO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CryptoFeeTierInfo5.UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoFeeTierInfo6.values().length];
            try {
                iArr2[CryptoFeeTierInfo6.FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CryptoFeeTierInfo6.FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CryptoFeeTierInfo6.FEE_TIER_STATUS_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Object GetCryptoFeeTierInfo(Request<GetCryptoFeeTierInfoRequestDto> request, Continuation<? super Response<GetCryptoFeeTierInfoResponseDto>> continuation) {
        return CryptoFeeTierInfoManagedService.DefaultImpls.GetCryptoFeeTierInfo(this, request, continuation);
    }

    public Flow<Response<StreamCryptoFeeTierInfoResponseDto>> StreamCryptoFeeTierInfo(Request<StreamCryptoFeeTierInfoRequestDto> request) {
        return CryptoFeeTierInfoManagedService.DefaultImpls.StreamCryptoFeeTierInfo(this, request);
    }

    public CryptoFeeTierInfoManagedServiceImpl(CryptoFeeTierStore cryptoFeeTierStore, CryptoAccountStore cryptoAccountStore) {
        Intrinsics.checkNotNullParameter(cryptoFeeTierStore, "cryptoFeeTierStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        this.cryptoFeeTierStore = cryptoFeeTierStore;
        this.cryptoAccountStore = cryptoAccountStore;
    }

    /* compiled from: CryptoFeeTierInfoManagedServiceImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$StreamCryptoFeeTierInfo$1", m3645f = "CryptoFeeTierInfoManagedServiceImpl.kt", m3646l = {62, 63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$StreamCryptoFeeTierInfo$1 */
    static final class C348061 extends ContinuationImpl7 implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C348061(Continuation<? super C348061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C348061 c348061 = CryptoFeeTierInfoManagedServiceImpl.this.new C348061(continuation);
            c348061.L$0 = obj;
            return c348061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
            return ((C348061) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L19;
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
                Flow<CryptoAccount> flowStreamAccount = CryptoFeeTierInfoManagedServiceImpl.this.cryptoAccountStore.streamAccount();
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamAccount, this);
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
            CryptoAccount cryptoAccount = (CryptoAccount) obj;
            String id = cryptoAccount != null ? cryptoAccount.getId() : null;
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Override // crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService
    public Flow<StreamCryptoFeeTierInfoResponseDto> StreamCryptoFeeTierInfo(StreamCryptoFeeTierInfoRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.flow(new C348061(null))), new C34803xb699f782(null, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r6 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoFeeTierInfo(GetCryptoFeeTierInfoRequestDto getCryptoFeeTierInfoRequestDto, Continuation<? super GetCryptoFeeTierInfoResponseDto> continuation) {
        C348051 c348051;
        Object value;
        GetCryptoFeeTierInfoResponseDto.ResponseDto error;
        if (continuation instanceof C348051) {
            c348051 = (C348051) continuation;
            int i = c348051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348051.label = i - Integer.MIN_VALUE;
            } else {
                c348051 = new C348051(continuation);
            }
        }
        Object objFirstOrNull = c348051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<CryptoAccount> flowStreamAccount = this.cryptoAccountStore.streamAccount();
            c348051.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamAccount, c348051);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            value = ((Result) objFirstOrNull).getValue();
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) (Result.m28555isFailureimpl(value) ? null : value);
            if (cryptoFeeTierInfo != null) {
                error = new GetCryptoFeeTierInfoResponseDto.ResponseDto.Success(new GetCryptoFeeTierInfoSuccessResponseDto(getProtoModel(cryptoFeeTierInfo)));
            } else {
                error = new GetCryptoFeeTierInfoResponseDto.ResponseDto.Error(new GetCryptoFeeTierInfoErrorResponseDto(CryptoFeeTierInfoErrorTypeDto.CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED));
            }
            return new GetCryptoFeeTierInfoResponseDto(error);
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        CryptoAccount cryptoAccount = (CryptoAccount) objFirstOrNull;
        if ((cryptoAccount != null ? cryptoAccount.getId() : null) == null) {
            return new GetCryptoFeeTierInfoResponseDto(new GetCryptoFeeTierInfoResponseDto.ResponseDto.Error(new GetCryptoFeeTierInfoErrorResponseDto(CryptoFeeTierInfoErrorTypeDto.CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT)));
        }
        CryptoFeeTierStore cryptoFeeTierStore = this.cryptoFeeTierStore;
        c348051.label = 2;
        Object objM22810getCryptoFeeTierInfoIoAF18A = cryptoFeeTierStore.m22810getCryptoFeeTierInfoIoAF18A(c348051);
        value = objM22810getCryptoFeeTierInfoIoAF18A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<StreamCryptoFeeTierInfoResponseDto> streamCryptoFeeTierInfo() {
        final Flow<CryptoFeeTierInfo> flowStreamCryptoFeeTierInfo = this.cryptoFeeTierStore.streamCryptoFeeTierInfo();
        return new Flow<StreamCryptoFeeTierInfoResponseDto>() { // from class: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$streamCryptoFeeTierInfo$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super StreamCryptoFeeTierInfoResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamCryptoFeeTierInfo.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$streamCryptoFeeTierInfo$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CryptoFeeTierInfoManagedServiceImpl this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$streamCryptoFeeTierInfo$$inlined$map$1$2", m3645f = "CryptoFeeTierInfoManagedServiceImpl.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierInfoManagedServiceImpl$streamCryptoFeeTierInfo$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, CryptoFeeTierInfoManagedServiceImpl cryptoFeeTierInfoManagedServiceImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = cryptoFeeTierInfoManagedServiceImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    MoneyDto moneyDto;
                    FeeTierSourceDto feeTierSourceDto;
                    FeeTierStatusDto feeTierStatusDto;
                    Iterator<CryptoFeeTierInfo4> it;
                    FeeTierSourceDto feeTierSourceDto2;
                    FeeTierDto feeTierDto;
                    FeeTierPromoDto feeTierPromoDto;
                    FeeTierStatusDto feeTierStatusDto2;
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
                        CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) obj;
                        FeeTierDto legacyModel = this.this$0.getLegacyModel(cryptoFeeTierInfo.getCurrentFeeTier());
                        CryptoFeeTier previousFeeTier = cryptoFeeTierInfo.getPreviousFeeTier();
                        FeeTierDto legacyModel2 = previousFeeTier != null ? this.this$0.getLegacyModel(previousFeeTier) : null;
                        CryptoFeeTier nextFeeTier = cryptoFeeTierInfo.getNextFeeTier();
                        FeeTierDto legacyModel3 = nextFeeTier != null ? this.this$0.getLegacyModel(nextFeeTier) : null;
                        CryptoFeeTier projectedDowngradeFeeTier = cryptoFeeTierInfo.getProjectedDowngradeFeeTier();
                        FeeTierDto legacyModel4 = projectedDowngradeFeeTier != null ? this.this$0.getLegacyModel(projectedDowngradeFeeTier) : null;
                        int evaluationPeriodDays = cryptoFeeTierInfo.getEvaluationPeriodDays();
                        Long lockupPeriodInSec = cryptoFeeTierInfo.getLockupPeriodInSec();
                        Integer numBoxInt = lockupPeriodInSec != null ? boxing.boxInt((int) lockupPeriodInSec.longValue()) : null;
                        ImmutableList<CryptoFeeTier> availableTiers = cryptoFeeTierInfo.getAvailableTiers();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableTiers, 10));
                        Iterator<CryptoFeeTier> it2 = availableTiers.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(this.this$0.getLegacyModel(it2.next()));
                        }
                        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(cryptoFeeTierInfo.getCurrentPeriodTradingAmount().getDecimalValue());
                        String currencyCode = cryptoFeeTierInfo.getCurrentPeriodTradingAmount().getCurrency().getCurrencyCode();
                        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                        MoneyDto moneyDto2 = new MoneyDto(idlDecimal, CurrencyDto.valueOf(currencyCode));
                        Money requiredTradingAmountForNextTier = cryptoFeeTierInfo.getRequiredTradingAmountForNextTier();
                        if (requiredTradingAmountForNextTier != null) {
                            IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(requiredTradingAmountForNextTier.getDecimalValue());
                            String currencyCode2 = requiredTradingAmountForNextTier.getCurrency().getCurrencyCode();
                            Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
                            moneyDto = new MoneyDto(idlDecimal2, CurrencyDto.valueOf(currencyCode2));
                        } else {
                            moneyDto = null;
                        }
                        BigDecimal tradingVolumeTierProgress = cryptoFeeTierInfo.getTradingVolumeTierProgress();
                        IdlDecimal idlDecimal3 = tradingVolumeTierProgress != null ? IdlDecimal2.toIdlDecimal(tradingVolumeTierProgress) : null;
                        Instant currentTierExpirationDateTime = cryptoFeeTierInfo.getCurrentTierExpirationDateTime();
                        Instant projectedDowngradeDateTime = cryptoFeeTierInfo.getProjectedDowngradeDateTime();
                        int i3 = CryptoFeeTierInfoManagedServiceImpl.WhenMappings.$EnumSwitchMapping$0[cryptoFeeTierInfo.getCurrentTierSource().ordinal()];
                        if (i3 == 1) {
                            feeTierSourceDto = FeeTierSourceDto.FEE_TIER_SOURCE_TRADING_VOLUME;
                        } else if (i3 == 2) {
                            feeTierSourceDto = FeeTierSourceDto.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE;
                        } else if (i3 == 3) {
                            feeTierSourceDto = FeeTierSourceDto.FEE_TIER_SOURCE_RH_EMPLOYEE;
                        } else if (i3 == 4) {
                            feeTierSourceDto = FeeTierSourceDto.FEE_TIER_SOURCE_INTRODUCTORY_PROMO;
                        } else {
                            if (i3 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            feeTierSourceDto = FeeTierSourceDto.FEE_TIER_SOURCE_UNSPECIFIED;
                        }
                        CryptoFeeTierInfo6 feeTierStatus = cryptoFeeTierInfo.getFeeTierStatus();
                        int i4 = feeTierStatus == null ? -1 : CryptoFeeTierInfoManagedServiceImpl.WhenMappings.$EnumSwitchMapping$1[feeTierStatus.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1) {
                                feeTierStatusDto2 = FeeTierStatusDto.FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD;
                            } else if (i4 == 2) {
                                feeTierStatusDto2 = FeeTierStatusDto.FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER;
                            } else {
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                feeTierStatusDto2 = FeeTierStatusDto.FEE_TIER_STATUS_UNSPECIFIED;
                            }
                            feeTierStatusDto = feeTierStatusDto2;
                        } else {
                            feeTierStatusDto = null;
                        }
                        ImmutableList<CryptoFeeTierInfo4> promos = cryptoFeeTierInfo.getPromos();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(promos, 10));
                        Iterator<CryptoFeeTierInfo4> it3 = promos.iterator();
                        while (it3.hasNext()) {
                            CryptoFeeTierInfo4 next = it3.next();
                            if (next instanceof CryptoFeeTierInfo4.DepositIncentive) {
                                it = it3;
                                CryptoFeeTierInfo4.DepositIncentive depositIncentive = (CryptoFeeTierInfo4.DepositIncentive) next;
                                boolean zIsPromoClaimed = depositIncentive.isPromoClaimed();
                                boolean zIsAccountEligibleForPromo = depositIncentive.isAccountEligibleForPromo();
                                Instant promoStartTime = depositIncentive.getPromoStartTime();
                                Instant promoEndTime = depositIncentive.getPromoEndTime();
                                feeTierSourceDto2 = feeTierSourceDto;
                                IdlDecimal idlDecimal4 = IdlDecimal2.toIdlDecimal(depositIncentive.getRequiredDepositFiatAmount().getDecimalValue());
                                feeTierDto = legacyModel;
                                String currencyCode3 = depositIncentive.getRequiredDepositFiatAmount().getCurrency().getCurrencyCode();
                                Intrinsics.checkNotNullExpressionValue(currencyCode3, "getCurrencyCode(...)");
                                feeTierPromoDto = new FeeTierPromoDto(new FeeTierPromoDto.PromoDto.DepositIncentive(new DepositIncentivePromoDto(zIsPromoClaimed, zIsAccountEligibleForPromo, promoStartTime, promoEndTime, new MoneyDto(idlDecimal4, CurrencyDto.valueOf(currencyCode3)), this.this$0.getLegacyModel(depositIncentive.getTargetTier()), depositIncentive.getLockUpPeriodDays())));
                            } else {
                                it = it3;
                                feeTierSourceDto2 = feeTierSourceDto;
                                feeTierDto = legacyModel;
                                if (!(next instanceof CryptoFeeTierInfo4.IntroductoryPromo)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CryptoFeeTierInfo4.IntroductoryPromo introductoryPromo = (CryptoFeeTierInfo4.IntroductoryPromo) next;
                                boolean zIsPromoClaimed2 = introductoryPromo.isPromoClaimed();
                                boolean zIsAccountEligibleForPromo2 = introductoryPromo.isAccountEligibleForPromo();
                                feeTierPromoDto = new FeeTierPromoDto(new FeeTierPromoDto.PromoDto.IntroductoryPromo(new IntroductoryPromoDto(zIsPromoClaimed2, this.this$0.getLegacyModel(introductoryPromo.getTargetTier()), introductoryPromo.getLockUpPeriodDays(), introductoryPromo.getPromoStartTime(), introductoryPromo.getPromoEndTime(), zIsAccountEligibleForPromo2)));
                            }
                            arrayList2.add(feeTierPromoDto);
                            it3 = it;
                            feeTierSourceDto = feeTierSourceDto2;
                            legacyModel = feeTierDto;
                        }
                        StreamCryptoFeeTierInfoResponseDto streamCryptoFeeTierInfoResponseDto = new StreamCryptoFeeTierInfoResponseDto(new StreamCryptoFeeTierInfoResponseDto.ResponseDto.Success(new StreamCryptoFeeTierInfoSuccessResponseDto(legacyModel, evaluationPeriodDays, moneyDto2, moneyDto, arrayList, arrayList2, currentTierExpirationDateTime, feeTierSourceDto, idlDecimal3, numBoxInt, legacyModel3, legacyModel2, feeTierStatusDto, projectedDowngradeDateTime, legacyModel4)));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(streamCryptoFeeTierInfoResponseDto, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoFeeTierInfoDto getProtoModel(CryptoFeeTierInfo cryptoFeeTierInfo) {
        MoneyDto moneyDto;
        nummus.p512v1.FeeTierSourceDto feeTierSourceDto;
        nummus.p512v1.FeeTierStatusDto feeTierStatusDto;
        nummus.p512v1.FeeTierDto feeTierDto;
        int i;
        Instant instant;
        nummus.p512v1.FeeTierPromoDto feeTierPromoDto;
        nummus.p512v1.FeeTierStatusDto feeTierStatusDto2;
        nummus.p512v1.FeeTierDto protoModel = getProtoModel(cryptoFeeTierInfo.getCurrentFeeTier());
        CryptoFeeTier previousFeeTier = cryptoFeeTierInfo.getPreviousFeeTier();
        nummus.p512v1.FeeTierDto protoModel2 = previousFeeTier != null ? getProtoModel(previousFeeTier) : null;
        CryptoFeeTier nextFeeTier = cryptoFeeTierInfo.getNextFeeTier();
        nummus.p512v1.FeeTierDto protoModel3 = nextFeeTier != null ? getProtoModel(nextFeeTier) : null;
        CryptoFeeTier projectedDowngradeFeeTier = cryptoFeeTierInfo.getProjectedDowngradeFeeTier();
        nummus.p512v1.FeeTierDto protoModel4 = projectedDowngradeFeeTier != null ? getProtoModel(projectedDowngradeFeeTier) : null;
        int evaluationPeriodDays = cryptoFeeTierInfo.getEvaluationPeriodDays();
        Long lockupPeriodInSec = cryptoFeeTierInfo.getLockupPeriodInSec();
        Integer numValueOf = lockupPeriodInSec != null ? Integer.valueOf((int) lockupPeriodInSec.longValue()) : null;
        ImmutableList<CryptoFeeTier> availableTiers = cryptoFeeTierInfo.getAvailableTiers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableTiers, 10));
        Iterator<CryptoFeeTier> it = availableTiers.iterator();
        while (it.hasNext()) {
            arrayList.add(getProtoModel(it.next()));
        }
        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(cryptoFeeTierInfo.getCurrentPeriodTradingAmount().getDecimalValue());
        String currencyCode = cryptoFeeTierInfo.getCurrentPeriodTradingAmount().getCurrency().getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        MoneyDto moneyDto2 = new MoneyDto(idlDecimal, CurrencyDto.valueOf(currencyCode));
        Money requiredTradingAmountForNextTier = cryptoFeeTierInfo.getRequiredTradingAmountForNextTier();
        if (requiredTradingAmountForNextTier != null) {
            IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(requiredTradingAmountForNextTier.getDecimalValue());
            String currencyCode2 = requiredTradingAmountForNextTier.getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
            moneyDto = new MoneyDto(idlDecimal2, CurrencyDto.valueOf(currencyCode2));
        } else {
            moneyDto = null;
        }
        BigDecimal tradingVolumeTierProgress = cryptoFeeTierInfo.getTradingVolumeTierProgress();
        IdlDecimal idlDecimal3 = tradingVolumeTierProgress != null ? IdlDecimal2.toIdlDecimal(tradingVolumeTierProgress) : null;
        Instant currentTierExpirationDateTime = cryptoFeeTierInfo.getCurrentTierExpirationDateTime();
        Instant projectedDowngradeDateTime = cryptoFeeTierInfo.getProjectedDowngradeDateTime();
        int i2 = WhenMappings.$EnumSwitchMapping$0[cryptoFeeTierInfo.getCurrentTierSource().ordinal()];
        if (i2 == 1) {
            feeTierSourceDto = nummus.p512v1.FeeTierSourceDto.FEE_TIER_SOURCE_TRADING_VOLUME;
        } else if (i2 == 2) {
            feeTierSourceDto = nummus.p512v1.FeeTierSourceDto.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE;
        } else if (i2 == 3) {
            feeTierSourceDto = nummus.p512v1.FeeTierSourceDto.FEE_TIER_SOURCE_RH_EMPLOYEE;
        } else if (i2 == 4) {
            feeTierSourceDto = nummus.p512v1.FeeTierSourceDto.FEE_TIER_SOURCE_INTRODUCTORY_PROMO;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            feeTierSourceDto = nummus.p512v1.FeeTierSourceDto.FEE_TIER_SOURCE_UNSPECIFIED;
        }
        CryptoFeeTierInfo6 feeTierStatus = cryptoFeeTierInfo.getFeeTierStatus();
        int i3 = feeTierStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[feeTierStatus.ordinal()];
        if (i3 != -1) {
            if (i3 == 1) {
                feeTierStatusDto2 = nummus.p512v1.FeeTierStatusDto.FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD;
            } else if (i3 == 2) {
                feeTierStatusDto2 = nummus.p512v1.FeeTierStatusDto.FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                feeTierStatusDto2 = nummus.p512v1.FeeTierStatusDto.FEE_TIER_STATUS_UNSPECIFIED;
            }
            feeTierStatusDto = feeTierStatusDto2;
        } else {
            feeTierStatusDto = null;
        }
        ImmutableList<CryptoFeeTierInfo4> promos = cryptoFeeTierInfo.getPromos();
        Instant instant2 = currentTierExpirationDateTime;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(promos, 10));
        Iterator<CryptoFeeTierInfo4> it2 = promos.iterator();
        while (it2.hasNext()) {
            CryptoFeeTierInfo4 next = it2.next();
            Iterator<CryptoFeeTierInfo4> it3 = it2;
            if (next instanceof CryptoFeeTierInfo4.DepositIncentive) {
                feeTierDto = protoModel;
                i = evaluationPeriodDays;
                CryptoFeeTierInfo4.DepositIncentive depositIncentive = (CryptoFeeTierInfo4.DepositIncentive) next;
                boolean zIsPromoClaimed = depositIncentive.isPromoClaimed();
                boolean zIsAccountEligibleForPromo = depositIncentive.isAccountEligibleForPromo();
                String string2 = depositIncentive.getPromoStartTime().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = depositIncentive.getPromoEndTime().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                IdlDecimal idlDecimal4 = IdlDecimal2.toIdlDecimal(depositIncentive.getRequiredDepositFiatAmount().getDecimalValue());
                instant = instant2;
                String currencyCode3 = depositIncentive.getRequiredDepositFiatAmount().getCurrency().getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode3, "getCurrencyCode(...)");
                feeTierPromoDto = new nummus.p512v1.FeeTierPromoDto(new FeeTierPromoDto.PromoDto.DepositIncentive(new nummus.p512v1.DepositIncentivePromoDto(zIsPromoClaimed, zIsAccountEligibleForPromo, string2, string3, new MoneyDto(idlDecimal4, CurrencyDto.valueOf(currencyCode3)), getProtoModel(depositIncentive.getTargetTier()), depositIncentive.getLockUpPeriodDays(), null, 128, null)));
            } else {
                feeTierDto = protoModel;
                i = evaluationPeriodDays;
                instant = instant2;
                if (!(next instanceof CryptoFeeTierInfo4.IntroductoryPromo)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoFeeTierInfo4.IntroductoryPromo introductoryPromo = (CryptoFeeTierInfo4.IntroductoryPromo) next;
                boolean zIsPromoClaimed2 = introductoryPromo.isPromoClaimed();
                boolean zIsAccountEligibleForPromo2 = introductoryPromo.isAccountEligibleForPromo();
                String string4 = introductoryPromo.getPromoStartTime().toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                String string5 = introductoryPromo.getPromoEndTime().toString();
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                feeTierPromoDto = new nummus.p512v1.FeeTierPromoDto(new FeeTierPromoDto.PromoDto.IntroductoryPromo(new nummus.p512v1.IntroductoryPromoDto(zIsPromoClaimed2, zIsAccountEligibleForPromo2, getProtoModel(introductoryPromo.getTargetTier()), introductoryPromo.getLockUpPeriodDays(), null, string4, string5, 16, null)));
            }
            arrayList2.add(feeTierPromoDto);
            it2 = it3;
            protoModel = feeTierDto;
            evaluationPeriodDays = i;
            instant2 = instant;
        }
        return new CryptoFeeTierInfoDto(protoModel, evaluationPeriodDays, moneyDto2, moneyDto, arrayList, arrayList2, instant2, feeTierSourceDto, idlDecimal3, numValueOf, protoModel3, protoModel2, feeTierStatusDto, projectedDowngradeDateTime, protoModel4);
    }

    private final nummus.p512v1.FeeTierDto getProtoModel(CryptoFeeTier cryptoFeeTier) {
        BigDecimal decimalValue;
        String tierId = cryptoFeeTier.getTierId();
        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(cryptoFeeTier.getFeeRatio());
        IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(cryptoFeeTier.getMinVolume().getDecimalValue());
        Money maxVolume = cryptoFeeTier.getMaxVolume();
        MoneyDto moneyDto = null;
        IdlDecimal idlDecimal3 = (maxVolume == null || (decimalValue = maxVolume.getDecimalValue()) == null) ? null : IdlDecimal2.toIdlDecimal(decimalValue);
        IdlDecimal idlDecimal4 = IdlDecimal2.toIdlDecimal(cryptoFeeTier.getMinVolume().getDecimalValue());
        String currencyCode = cryptoFeeTier.getMinVolume().getCurrency().getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        MoneyDto moneyDto2 = new MoneyDto(idlDecimal4, CurrencyDto.valueOf(currencyCode));
        Money maxVolume2 = cryptoFeeTier.getMaxVolume();
        if (maxVolume2 != null) {
            IdlDecimal idlDecimal5 = IdlDecimal2.toIdlDecimal(maxVolume2.getDecimalValue());
            String currencyCode2 = maxVolume2.getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
            moneyDto = new MoneyDto(idlDecimal5, CurrencyDto.valueOf(currencyCode2));
        }
        return new nummus.p512v1.FeeTierDto(tierId, idlDecimal, idlDecimal2, idlDecimal3, moneyDto2, moneyDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeeTierDto getLegacyModel(CryptoFeeTier cryptoFeeTier) {
        BigDecimal decimalValue;
        String tierId = cryptoFeeTier.getTierId();
        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(cryptoFeeTier.getFeeRatio());
        IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(cryptoFeeTier.getMinVolume().getDecimalValue());
        Money maxVolume = cryptoFeeTier.getMaxVolume();
        return new FeeTierDto(tierId, idlDecimal, (maxVolume == null || (decimalValue = maxVolume.getDecimalValue()) == null) ? null : IdlDecimal2.toIdlDecimal(decimalValue), idlDecimal2);
    }
}
