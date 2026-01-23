package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import java.util.List;
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
import p479j$.time.Duration;

/* compiled from: CryptoPulseStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u001c\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "Lcom/robinhood/store/Store;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/crypto/v1/CryptoService;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/store/StoreBundle;)V", "getDefaultCryptoAccountId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPulsePreview", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "getPulseFeed", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "streamPulseFeed", "Lkotlinx/coroutines/flow/Flow;", "getPulseFeedEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "getInitialPulseFeedRefresh", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "currencyPairIds", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamPulseFeedRefresh", "getCryptoPulseFeedRefreshEndpoint", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore$GetCryptoPulseFeedRefreshParams;", "GetCryptoPulseFeedRefreshParams", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoPulseStore extends Store {
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoService cryptoService;
    private final Endpoint<GetCryptoPulseFeedRefreshParams, GetCryptoPulseFeedRefreshResponseDto> getCryptoPulseFeedRefreshEndpoint;
    private final Endpoint<Unit, GetCryptoPulseFeedResponseDto> getPulseFeedEndpoint;

    /* compiled from: CryptoPulseStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPulseStore", m3645f = "CryptoPulseStore.kt", m3646l = {37}, m3647m = "getDefaultCryptoAccountId")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoPulseStore$getDefaultCryptoAccountId$1 */
    static final class C337461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C337461(Continuation<? super C337461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoPulseStore.this.getDefaultCryptoAccountId(this);
        }
    }

    /* compiled from: CryptoPulseStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPulseStore", m3645f = "CryptoPulseStore.kt", m3646l = {45, 43}, m3647m = "getPulsePreview")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoPulseStore$getPulsePreview$1 */
    static final class C337471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C337471(Continuation<? super C337471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoPulseStore.this.getPulsePreview(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPulseStore(CryptoService cryptoService, CryptoAccountStore cryptoAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoService = cryptoService;
        this.cryptoAccountStore = cryptoAccountStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getPulseFeedEndpoint = Endpoint.Companion.create$default(companion, new CryptoPulseStore4(this, null), getLogoutKillswitch(), new CryptoPulseStore5(null), storeBundle.getClock(), null, 16, null);
        this.getCryptoPulseFeedRefreshEndpoint = Endpoint.Companion.create$default(companion, new CryptoPulseStore2(this, null), getLogoutKillswitch(), new CryptoPulseStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDefaultCryptoAccountId(Continuation<? super String> continuation) {
        C337461 c337461;
        if (continuation instanceof C337461) {
            c337461 = (C337461) continuation;
            int i = c337461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337461.label = i - Integer.MIN_VALUE;
            } else {
                c337461 = new C337461(continuation);
            }
        }
        Object objFirst = c337461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c337461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            final Flow<Optional<CryptoAccount>> flowStreamAccountOptional = this.cryptoAccountStore.streamAccountOptional();
            Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<CryptoAccount>() { // from class: com.robinhood.librobinhood.data.store.CryptoPulseStore$getDefaultCryptoAccountId$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoPulseStore$getDefaultCryptoAccountId$$inlined$map$1$2 */
                public static final class C337452<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoPulseStore$getDefaultCryptoAccountId$$inlined$map$1$2", m3645f = "CryptoPulseStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoPulseStore$getDefaultCryptoAccountId$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C337452.this.emit(null, this);
                        }
                    }

                    public C337452(FlowCollector flowCollector) {
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
                            Object orNull = ((Optional) obj).getOrNull();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super CryptoAccount> flowCollector, Continuation continuation2) {
                    Object objCollect = flowStreamAccountOptional.collect(new C337452(flowCollector), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            c337461.label = 1;
            objFirst = FlowKt.first(flowFilterNotNull, c337461);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return ((CryptoAccount) objFirst).getId();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPulsePreview(Continuation<? super GetCryptoPulsePreviewResponseDto> continuation) {
        C337471 c337471;
        CryptoService cryptoService;
        if (continuation instanceof C337471) {
            c337471 = (C337471) continuation;
            int i = c337471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337471.label = i - Integer.MIN_VALUE;
            } else {
                c337471 = new C337471(continuation);
            }
        }
        Object defaultCryptoAccountId = c337471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c337471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(defaultCryptoAccountId);
            cryptoService = this.cryptoService;
            c337471.L$0 = cryptoService;
            c337471.label = 1;
            defaultCryptoAccountId = getDefaultCryptoAccountId(c337471);
            if (defaultCryptoAccountId != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(defaultCryptoAccountId);
            return defaultCryptoAccountId;
        }
        cryptoService = (CryptoService) c337471.L$0;
        ResultKt.throwOnFailure(defaultCryptoAccountId);
        GetCryptoPulsePreviewRequestDto getCryptoPulsePreviewRequestDto = new GetCryptoPulsePreviewRequestDto((String) defaultCryptoAccountId);
        c337471.L$0 = null;
        c337471.label = 2;
        Object objGetCryptoPulsePreview = cryptoService.GetCryptoPulsePreview(getCryptoPulsePreviewRequestDto, c337471);
        return objGetCryptoPulsePreview == coroutine_suspended ? coroutine_suspended : objGetCryptoPulsePreview;
    }

    public final Object getPulseFeed(Continuation<? super GetCryptoPulseFeedResponseDto> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getPulseFeedEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    public final Flow<GetCryptoPulseFeedResponseDto> streamPulseFeed() {
        Endpoint<Unit, GetCryptoPulseFeedResponseDto> endpoint = this.getPulseFeedEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfSeconds, null, 4, null);
    }

    public final Object getInitialPulseFeedRefresh(List<String> list, Continuation<? super GetCryptoPulseFeedRefreshResponseDto> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getCryptoPulseFeedRefreshEndpoint, new GetCryptoPulseFeedRefreshParams(list, true), null, continuation, 2, null);
    }

    public final Flow<GetCryptoPulseFeedRefreshResponseDto> streamPulseFeedRefresh(List<String> currencyPairIds) {
        Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
        return Endpoint.DefaultImpls.poll$default(this.getCryptoPulseFeedRefreshEndpoint, new GetCryptoPulseFeedRefreshParams(currencyPairIds, false), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoPulseStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoPulseStore$GetCryptoPulseFeedRefreshParams;", "", "currencyPairIds", "", "", "includeDigest", "", "<init>", "(Ljava/util/List;Z)V", "getCurrencyPairIds", "()Ljava/util/List;", "getIncludeDigest", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetCryptoPulseFeedRefreshParams {
        private final List<String> currencyPairIds;
        private final boolean includeDigest;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetCryptoPulseFeedRefreshParams copy$default(GetCryptoPulseFeedRefreshParams getCryptoPulseFeedRefreshParams, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = getCryptoPulseFeedRefreshParams.currencyPairIds;
            }
            if ((i & 2) != 0) {
                z = getCryptoPulseFeedRefreshParams.includeDigest;
            }
            return getCryptoPulseFeedRefreshParams.copy(list, z);
        }

        public final List<String> component1() {
            return this.currencyPairIds;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIncludeDigest() {
            return this.includeDigest;
        }

        public final GetCryptoPulseFeedRefreshParams copy(List<String> currencyPairIds, boolean includeDigest) {
            Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
            return new GetCryptoPulseFeedRefreshParams(currencyPairIds, includeDigest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetCryptoPulseFeedRefreshParams)) {
                return false;
            }
            GetCryptoPulseFeedRefreshParams getCryptoPulseFeedRefreshParams = (GetCryptoPulseFeedRefreshParams) other;
            return Intrinsics.areEqual(this.currencyPairIds, getCryptoPulseFeedRefreshParams.currencyPairIds) && this.includeDigest == getCryptoPulseFeedRefreshParams.includeDigest;
        }

        public int hashCode() {
            return (this.currencyPairIds.hashCode() * 31) + Boolean.hashCode(this.includeDigest);
        }

        public String toString() {
            return "GetCryptoPulseFeedRefreshParams(currencyPairIds=" + this.currencyPairIds + ", includeDigest=" + this.includeDigest + ")";
        }

        public GetCryptoPulseFeedRefreshParams(List<String> currencyPairIds, boolean z) {
            Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
            this.currencyPairIds = currencyPairIds;
            this.includeDigest = z;
        }

        public final List<String> getCurrencyPairIds() {
            return this.currencyPairIds;
        }

        public final boolean getIncludeDigest() {
            return this.includeDigest;
        }
    }
}
