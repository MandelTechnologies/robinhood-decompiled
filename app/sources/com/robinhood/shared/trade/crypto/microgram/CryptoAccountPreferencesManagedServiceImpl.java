package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoDetailIacHeroCardInvalidator;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService;
import contracts.crypto.account_preferences.proto.p428v1.StreamCryptoMonetizationModelRequestDto;
import contracts.crypto.account_preferences.proto.p428v1.StreamCryptoMonetizationModelResponseDto;
import contracts.crypto.account_preferences.proto.p428v1.UpdateCryptoMonetizationModelErrorDto;
import contracts.crypto.account_preferences.proto.p428v1.UpdateCryptoMonetizationModelRequestDto;
import contracts.crypto.account_preferences.proto.p428v1.UpdateCryptoMonetizationModelResponseDto;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import rosetta.nummus.MonetizationModelDto;

/* compiled from: CryptoAccountPreferencesManagedServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoAccountPreferencesManagedServiceImpl;", "Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoDetailIacHeroCardInvalidator", "Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoDetailIacHeroCardInvalidator;)V", "UpdateCryptoMonetizationModel", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelResponseDto;", "request", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequestDto;", "(Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "StreamCryptoMonetizationModel", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelRequestDto;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoAccountPreferencesManagedServiceImpl implements CryptoAccountPreferencesManagedService {
    public static final int $stable = 8;
    private final CryptoAccountPreferencesStore cryptoAccountPreferencesStore;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator;

    /* compiled from: CryptoAccountPreferencesManagedServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl", m3645f = "CryptoAccountPreferencesManagedServiceImpl.kt", m3646l = {39, 48, 56}, m3647m = "UpdateCryptoMonetizationModel")
    /* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl$UpdateCryptoMonetizationModel$1 */
    static final class C401271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C401271(Continuation<? super C401271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoAccountPreferencesManagedServiceImpl.this.UpdateCryptoMonetizationModel((UpdateCryptoMonetizationModelRequestDto) null, this);
        }
    }

    /* compiled from: CryptoAccountPreferencesManagedServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonetizationModelDto.values().length];
            try {
                iArr[MonetizationModelDto.MONETIZATION_MODEL_REBATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModelDto.MONETIZATION_MODEL_FEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MonetizationModelDto.MONETIZATION_MODEL_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Flow<Response<StreamCryptoMonetizationModelResponseDto>> StreamCryptoMonetizationModel(Request<StreamCryptoMonetizationModelRequestDto> request) {
        return CryptoAccountPreferencesManagedService.DefaultImpls.StreamCryptoMonetizationModel(this, request);
    }

    public Object UpdateCryptoMonetizationModel(Request<UpdateCryptoMonetizationModelRequestDto> request, Continuation<? super Response<UpdateCryptoMonetizationModelResponseDto>> continuation) {
        return CryptoAccountPreferencesManagedService.DefaultImpls.UpdateCryptoMonetizationModel(this, request, continuation);
    }

    public CryptoAccountPreferencesManagedServiceImpl(CryptoAccountPreferencesStore cryptoAccountPreferencesStore, CryptoAccountStore cryptoAccountStore, CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator) {
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoDetailIacHeroCardInvalidator, "cryptoDetailIacHeroCardInvalidator");
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoDetailIacHeroCardInvalidator = cryptoDetailIacHeroCardInvalidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateCryptoMonetizationModel(UpdateCryptoMonetizationModelRequestDto updateCryptoMonetizationModelRequestDto, Continuation<? super UpdateCryptoMonetizationModelResponseDto> continuation) throws Throwable {
        C401271 c401271;
        MonetizationModel monetizationModel;
        Object objM22602updateMonetizationModelPreferencegIAlus;
        Object obj;
        CryptoDetailIacHeroCardInvalidator cryptoDetailIacHeroCardInvalidator;
        Set<String> of;
        UpdateCryptoMonetizationModelRequestDto updateCryptoMonetizationModelRequestDto2;
        if (continuation instanceof C401271) {
            c401271 = (C401271) continuation;
            int i = c401271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c401271.label = i - Integer.MIN_VALUE;
            } else {
                c401271 = new C401271(continuation);
            }
        }
        Object objFirstOrNull = c401271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c401271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<CryptoAccount> flowStreamAccount = this.cryptoAccountStore.streamAccount();
            c401271.L$0 = updateCryptoMonetizationModelRequestDto;
            c401271.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamAccount, c401271);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c401271.L$1;
                updateCryptoMonetizationModelRequestDto2 = (UpdateCryptoMonetizationModelRequestDto) c401271.L$0;
                ResultKt.throwOnFailure(objFirstOrNull);
                if (!Result.m28556isSuccessimpl(obj)) {
                    return new UpdateCryptoMonetizationModelResponseDto(updateCryptoMonetizationModelRequestDto2.getMonetization_model(), null, 2, null);
                }
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
                if (thM28553exceptionOrNullimpl == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                throw thM28553exceptionOrNullimpl;
            }
            updateCryptoMonetizationModelRequestDto = (UpdateCryptoMonetizationModelRequestDto) c401271.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            objM22602updateMonetizationModelPreferencegIAlus = ((Result) objFirstOrNull).getValue();
            Object obj2 = objM22602updateMonetizationModelPreferencegIAlus;
            UpdateCryptoMonetizationModelRequestDto updateCryptoMonetizationModelRequestDto3 = updateCryptoMonetizationModelRequestDto;
            obj = obj2;
            cryptoDetailIacHeroCardInvalidator = this.cryptoDetailIacHeroCardInvalidator;
            of = SetsKt.setOf((Object[]) new String[]{IacHeroCard.CRYPTO_SER_ENGAGEMENT_CARD, IacHeroCard.CRYPTO_SER_DEPOSIT_INCENTIVE_CARD, IacHeroCard.CRYPTO_SER_LTO_PROMO_CARD});
            c401271.L$0 = updateCryptoMonetizationModelRequestDto3;
            c401271.L$1 = obj;
            c401271.label = 3;
            if (cryptoDetailIacHeroCardInvalidator.invalidateIacHeroCard(of, c401271) != coroutine_suspended) {
                updateCryptoMonetizationModelRequestDto2 = updateCryptoMonetizationModelRequestDto3;
                if (!Result.m28556isSuccessimpl(obj)) {
                }
            }
            return coroutine_suspended;
        }
        updateCryptoMonetizationModelRequestDto = (UpdateCryptoMonetizationModelRequestDto) c401271.L$0;
        ResultKt.throwOnFailure(objFirstOrNull);
        if (objFirstOrNull == null) {
            return new UpdateCryptoMonetizationModelResponseDto(null, new UpdateCryptoMonetizationModelErrorDto(new UpdateCryptoMonetizationModelErrorDto.TypeDto.NoCryptoAccount(new UpdateCryptoMonetizationModelErrorDto.NoCryptoAccountDto())), 1, null);
        }
        CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.cryptoAccountPreferencesStore;
        int i3 = WhenMappings.$EnumSwitchMapping$0[updateCryptoMonetizationModelRequestDto.getMonetization_model().ordinal()];
        if (i3 == 1) {
            monetizationModel = MonetizationModel.REBATE;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unspecified monetization model not allowed");
            }
            monetizationModel = MonetizationModel.FEE;
        }
        c401271.L$0 = updateCryptoMonetizationModelRequestDto;
        c401271.label = 2;
        objM22602updateMonetizationModelPreferencegIAlus = cryptoAccountPreferencesStore.m22602updateMonetizationModelPreferencegIAlus(monetizationModel, c401271);
        if (objM22602updateMonetizationModelPreferencegIAlus != coroutine_suspended) {
            Object obj22 = objM22602updateMonetizationModelPreferencegIAlus;
            UpdateCryptoMonetizationModelRequestDto updateCryptoMonetizationModelRequestDto32 = updateCryptoMonetizationModelRequestDto;
            obj = obj22;
            cryptoDetailIacHeroCardInvalidator = this.cryptoDetailIacHeroCardInvalidator;
            of = SetsKt.setOf((Object[]) new String[]{IacHeroCard.CRYPTO_SER_ENGAGEMENT_CARD, IacHeroCard.CRYPTO_SER_DEPOSIT_INCENTIVE_CARD, IacHeroCard.CRYPTO_SER_LTO_PROMO_CARD});
            c401271.L$0 = updateCryptoMonetizationModelRequestDto32;
            c401271.L$1 = obj;
            c401271.label = 3;
            if (cryptoDetailIacHeroCardInvalidator.invalidateIacHeroCard(of, c401271) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: CryptoAccountPreferencesManagedServiceImpl.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl$StreamCryptoMonetizationModel$1", m3645f = "CryptoAccountPreferencesManagedServiceImpl.kt", m3646l = {77, 77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoAccountPreferencesManagedServiceImpl$StreamCryptoMonetizationModel$1 */
    static final class C401251 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C401251(Continuation<? super C401251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C401251 c401251 = CryptoAccountPreferencesManagedServiceImpl.this.new C401251(continuation);
            c401251.L$0 = obj;
            return c401251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C401251) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L18;
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
                Flow<CryptoAccount> flowStreamAccount = CryptoAccountPreferencesManagedServiceImpl.this.cryptoAccountStore.streamAccount();
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
            Boolean boolBoxBoolean = boxing.boxBoolean(obj != null);
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Override // contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService
    public Flow<StreamCryptoMonetizationModelResponseDto> StreamCryptoMonetizationModel(StreamCryptoMonetizationModelRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.transformLatest(FlowKt.flow(new C401251(null)), new C40123x2a9cc981(null, this));
    }
}
