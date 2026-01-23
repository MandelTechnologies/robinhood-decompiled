package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
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
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.NummusService;
import nummus.p512v1.TaxlotabilityResponseDto;
import nummus.p512v1.TaxlotabilityStateDto;
import retrofit2.Response;

/* compiled from: TaxlotabilityStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "Lcom/robinhood/store/Store;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "nummusService", "Lnummus/v1/NummusService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lnummus/v1/NummusService;Lcom/robinhood/store/StoreBundle;)V", "taxlotabilityEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore$Params;", "Lretrofit2/Response;", "Lnummus/v1/TaxlotabilityResponseDto;", "streamTaxlotability", "Lkotlinx/coroutines/flow/Flow;", "currencyPairId", "Ljava/util/UUID;", "Params", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TaxlotabilityStore extends Store {
    private final AppType appType;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final NummusService nummusService;
    private final Endpoint<Params, Response<TaxlotabilityResponseDto>> taxlotabilityEndpoint;

    /* compiled from: TaxlotabilityStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxlotabilityStore(AppType appType, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, NummusService nummusService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.appType = appType;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.nummusService = nummusService;
        this.taxlotabilityEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new TaxlotabilityStore2(this, null), getLogoutKillswitch(), new TaxlotabilityStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Flow<TaxlotabilityResponseDto> streamTaxlotability(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] != 1) {
            String string2 = currencyPairId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return FlowKt.flowOf(new TaxlotabilityResponseDto(string2, TaxlotabilityStateDto.STATE_UNSUPPORTED, null, null, 12, null));
        }
        final Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new TaxlotabilityStore$streamTaxlotability$$inlined$flatMapLatest$1(null, this, currencyPairId)), new TaxlotabilityStore$streamTaxlotability$$inlined$flatMapLatest$2(null, this, currencyPairId));
        return new Flow<TaxlotabilityResponseDto>() { // from class: com.robinhood.librobinhood.data.store.TaxlotabilityStore$streamTaxlotability$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.TaxlotabilityStore$streamTaxlotability$$inlined$mapNotNull$1$2 */
            public static final class C343642<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TaxlotabilityStore$streamTaxlotability$$inlined$mapNotNull$1$2", m3645f = "TaxlotabilityStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.TaxlotabilityStore$streamTaxlotability$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C343642.this.emit(null, this);
                    }
                }

                public C343642(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object objBody = ((Response) obj).body();
                        if (objBody != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(objBody, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(FlowCollector<? super TaxlotabilityResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowTransformLatest.collect(new C343642(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TaxlotabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore$Params;", "", "cryptoAccountId", "Ljava/util/UUID;", "currencyPairId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getCryptoAccountId", "()Ljava/util/UUID;", "getCurrencyPairId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Params {
        private final UUID cryptoAccountId;
        private final UUID currencyPairId;

        public static /* synthetic */ Params copy$default(Params params, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = params.cryptoAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = params.currencyPairId;
            }
            return params.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final Params copy(UUID cryptoAccountId, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Params(cryptoAccountId, currencyPairId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.cryptoAccountId, params.cryptoAccountId) && Intrinsics.areEqual(this.currencyPairId, params.currencyPairId);
        }

        public int hashCode() {
            UUID uuid = this.cryptoAccountId;
            return ((uuid == null ? 0 : uuid.hashCode()) * 31) + this.currencyPairId.hashCode();
        }

        public String toString() {
            return "Params(cryptoAccountId=" + this.cryptoAccountId + ", currencyPairId=" + this.currencyPairId + ")";
        }

        public Params(UUID uuid, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.cryptoAccountId = uuid;
            this.currencyPairId = currencyPairId;
        }

        public final UUID getCryptoAccountId() {
            return this.cryptoAccountId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }
}
