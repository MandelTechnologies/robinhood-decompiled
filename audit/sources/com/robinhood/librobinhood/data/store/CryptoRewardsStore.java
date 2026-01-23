package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.shared.crypto.microgram.service.CryptoRewardsCachedService;
import com.robinhood.shared.models.idl.p390ui.UiIdlCacheEntry;
import com.robinhood.shared.store.idl.IdlKeyValueStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonRequestDto;
import contracts.crypto.rewards.proto.p430v1.GetCryptoDetailRewardButtonResponseDto;
import contracts.crypto.rewards.proto.p430v1.GetHomeRewardsButtonResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoRewardsStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "Lcom/robinhood/store/Store;", "idlCacheStore", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "cryptoRewardsCachedService", "Lcom/robinhood/shared/crypto/microgram/service/CryptoRewardsCachedService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/store/idl/IdlKeyValueStore;Lcom/robinhood/shared/crypto/microgram/service/CryptoRewardsCachedService;Lcom/robinhood/store/StoreBundle;)V", "homeRewardsButtonEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "queryHomeRewardsButton", "Lcom/robinhood/android/moria/db/Query;", "streamHomeRewardButton", "Lkotlinx/coroutines/flow/Flow;", "cdpRewardsButtonEndpoint", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "queryCdpRewardsButton", "streamCdpRewardButton", "currencyPairId", "Ljava/util/UUID;", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoRewardsStore extends Store {
    public static final String IDL_CDP_CACHE_KEY_PREFIX = "rhc-cdp-rewards-button-";
    public static final String IDL_HOME_CACHE_KEY = "rhc-home-rewards-button";
    private final Endpoint<GetCryptoDetailRewardButtonRequestDto, GetCryptoDetailRewardButtonResponseDto> cdpRewardsButtonEndpoint;
    private final CryptoRewardsCachedService cryptoRewardsCachedService;
    private final Endpoint<Unit, GetHomeRewardsButtonResponseDto> homeRewardsButtonEndpoint;
    private final IdlKeyValueStore idlCacheStore;
    private final Query<GetCryptoDetailRewardButtonRequestDto, GetCryptoDetailRewardButtonResponseDto> queryCdpRewardsButton;
    private final Query<Unit, GetHomeRewardsButtonResponseDto> queryHomeRewardsButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoRewardsStore(IdlKeyValueStore idlCacheStore, CryptoRewardsCachedService cryptoRewardsCachedService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(idlCacheStore, "idlCacheStore");
        Intrinsics.checkNotNullParameter(cryptoRewardsCachedService, "cryptoRewardsCachedService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.idlCacheStore = idlCacheStore;
        this.cryptoRewardsCachedService = cryptoRewardsCachedService;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.homeRewardsButtonEndpoint = Endpoint.Companion.create$default(companion, new CryptoRewardsStore4(this, null), getLogoutKillswitch(), new CryptoRewardsStore5(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.queryHomeRewardsButton = Store.create$default(this, companion2, "getHomeRewardsButton", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoRewardsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRewardsStore.queryHomeRewardsButton$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoRewardsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRewardsStore.queryHomeRewardsButton$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.cdpRewardsButtonEndpoint = Endpoint.Companion.create$default(companion, new CryptoRewardsStore2(this, null), getLogoutKillswitch(), new CryptoRewardsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.queryCdpRewardsButton = Store.create$default(this, companion2, "queryCdpRewardsButton", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoRewardsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRewardsStore.queryCdpRewardsButton$lambda$3(this.f$0, (GetCryptoDetailRewardButtonRequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoRewardsStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRewardsStore.queryCdpRewardsButton$lambda$5(this.f$0, (GetCryptoDetailRewardButtonRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryHomeRewardsButton$lambda$0(CryptoRewardsStore cryptoRewardsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(cryptoRewardsStore.homeRewardsButtonEndpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryHomeRewardsButton$lambda$2(CryptoRewardsStore cryptoRewardsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Flow flowStream = cryptoRewardsStore.idlCacheStore.stream(IDL_HOME_CACHE_KEY, Reflection.getOrCreateKotlinClass(GetHomeRewardsButtonResponseDto.class));
        return new Flow<GetHomeRewardsButtonResponseDto>() { // from class: com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryHomeRewardsButton$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryHomeRewardsButton$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryHomeRewardsButton$lambda$2$$inlined$map$1$2", m3645f = "CryptoRewardsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryHomeRewardsButton$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto = uiIdlCacheEntry != null ? (GetHomeRewardsButtonResponseDto) uiIdlCacheEntry.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getHomeRewardsButtonResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetHomeRewardsButtonResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStream.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<GetHomeRewardsButtonResponseDto> streamHomeRewardButton() {
        return this.queryHomeRewardsButton.asFlow(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryCdpRewardsButton$lambda$3(CryptoRewardsStore cryptoRewardsStore, GetCryptoDetailRewardButtonRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(cryptoRewardsStore.cdpRewardsButtonEndpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryCdpRewardsButton$lambda$5(CryptoRewardsStore cryptoRewardsStore, GetCryptoDetailRewardButtonRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Flow flowStream = cryptoRewardsStore.idlCacheStore.stream(IDL_CDP_CACHE_KEY_PREFIX + request.getCurrency_pair_id(), Reflection.getOrCreateKotlinClass(GetCryptoDetailRewardButtonResponseDto.class));
        return new Flow<GetCryptoDetailRewardButtonResponseDto>() { // from class: com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryCdpRewardsButton$lambda$5$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryCdpRewardsButton$lambda$5$$inlined$map$1$2 */
            public static final class C337512<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryCdpRewardsButton$lambda$5$$inlined$map$1$2", m3645f = "CryptoRewardsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoRewardsStore$queryCdpRewardsButton$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C337512.this.emit(null, this);
                    }
                }

                public C337512(FlowCollector flowCollector) {
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
                        UiIdlCacheEntry uiIdlCacheEntry = (UiIdlCacheEntry) obj;
                        GetCryptoDetailRewardButtonResponseDto getCryptoDetailRewardButtonResponseDto = uiIdlCacheEntry != null ? (GetCryptoDetailRewardButtonResponseDto) uiIdlCacheEntry.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(getCryptoDetailRewardButtonResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super GetCryptoDetailRewardButtonResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStream.collect(new C337512(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<GetCryptoDetailRewardButtonResponseDto> streamCdpRewardButton(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Query<GetCryptoDetailRewardButtonRequestDto, GetCryptoDetailRewardButtonResponseDto> query = this.queryCdpRewardsButton;
        String string2 = currencyPairId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return query.asFlow(new GetCryptoDetailRewardButtonRequestDto(string2));
    }
}
