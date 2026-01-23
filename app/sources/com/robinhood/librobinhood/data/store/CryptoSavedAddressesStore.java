package com.robinhood.librobinhood.data.store;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.prefs.HasSeenAllowlistPrimerPref;
import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.api.transfer.ApiAllowlistingStatus;
import com.robinhood.models.api.transfer.ApiAllowlistingStatusRequest;
import com.robinhood.models.api.transfer.ApiCreateSavedAddress;
import com.robinhood.models.api.transfer.ApiSavedAddress;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
import com.robinhood.models.crypto.dao.AllowlistStatusDao;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CryptoSavedAddressesStore.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0+2\u0006\u0010,\u001a\u00020\"J\u0018\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0+2\b\u0010,\u001a\u0004\u0018\u00010\"J\u0010\u0010.\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\"J\u000e\u0010/\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\"J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140+J\u0018\u00101\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\"H\u0086@¢\u0006\u0002\u00102J\u0016\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u000206H\u0086@¢\u0006\u0002\u00107J&\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010;J\u001e\u0010<\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0086@¢\u0006\u0002\u0010?J\u0018\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u0014H\u0081@¢\u0006\u0004\bB\u0010CR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00130\rX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f0!0 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R0\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f0!0 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010$\u001a\u0004\b)\u0010&¨\u0006E"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "allowlistStatusDao", "Lcom/robinhood/models/crypto/dao/AllowlistStatusDao;", "cryptoTransfersApi", "Lcom/robinhood/models/api/retrofit/CryptoTransfersApi;", "hasSeenAllowlistPrimerPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/crypto/dao/AllowlistStatusDao;Lcom/robinhood/models/api/retrofit/CryptoTransfersApi;Lcom/robinhood/prefs/BooleanPreference;)V", "getRecentAddressesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/RecentAddressListRequest;", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "getSavedAddressesEndpoint", "Lcom/robinhood/librobinhood/data/store/SavedAddressListRequest;", "getAllowlistingStatusEndpoint", "", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "allowlistQuery", "Lcom/robinhood/android/moria/db/Query;", "setAllowlistingStatusEndpoint", "Lcom/robinhood/models/api/transfer/ApiAllowlistingStatusRequest;", "createSavedAddressEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/transfer/ApiCreateSavedAddress$Request;", "Lcom/robinhood/models/api/transfer/ApiCreateSavedAddress;", "deleteSavedAddressEndpoint", "Lcom/robinhood/librobinhood/data/store/DeleteSavedAddressRequest;", "savedAddresses", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "getSavedAddresses$annotations", "()V", "getSavedAddresses", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "recentAddresses", "getRecentAddresses$annotations", "getRecentAddresses", "streamCachedRecentAddresses", "Lkotlinx/coroutines/flow/Flow;", "currencyCode", "streamCachedSavedAddresses", "refreshSavedAddresses", "refreshRecentAddresses", "streamAllowlistStatus", "fetchSavedAddresses", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRecentAddresses", "setAllowlistingStatus", "enabled", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSavedAddress", PlaceTypes.ADDRESS, "nickname", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSavedAddress", "id", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllowlistStatus", "response", "saveAllowlistStatus$lib_store_crypto_externalDebug", "(Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoSavedAddressesStore extends Store {
    private static final String ALL_CURRENCIES_KEY = null;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Query<Unit, AllowlistStatus> allowlistQuery;
    private final AllowlistStatusDao allowlistStatusDao;
    private final PostEndpoint<ApiCreateSavedAddress.Request, ApiCreateSavedAddress> createSavedAddressEndpoint;
    private final CryptoTransfersApi cryptoTransfersApi;
    private final Endpoint<DeleteSavedAddressRequest, Unit> deleteSavedAddressEndpoint;
    private final Endpoint<Unit, AllowlistStatus> getAllowlistingStatusEndpoint;
    private final Endpoint<RecentAddressListRequest, ApiSavedAddresses> getRecentAddressesEndpoint;
    private final Endpoint<SavedAddressListRequest, ApiSavedAddresses> getSavedAddressesEndpoint;
    private final BooleanPreference hasSeenAllowlistPrimerPref;
    private final StateFlow2<Map<String, ApiSavedAddresses>> recentAddresses;
    private final StateFlow2<Map<String, ApiSavedAddresses>> savedAddresses;
    private final Endpoint<ApiAllowlistingStatusRequest, AllowlistStatus> setAllowlistingStatusEndpoint;

    /* compiled from: CryptoSavedAddressesStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore", m3645f = "CryptoSavedAddressesStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "deleteSavedAddress")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$deleteSavedAddress$1 */
    static final class C337551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C337551(Continuation<? super C337551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoSavedAddressesStore.this.deleteSavedAddress(null, null, this);
        }
    }

    public static /* synthetic */ void getRecentAddresses$annotations() {
    }

    public static /* synthetic */ void getSavedAddresses$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoSavedAddressesStore(StoreBundle storeBundle, AllowlistStatusDao allowlistStatusDao, CryptoTransfersApi cryptoTransfersApi, @HasSeenAllowlistPrimerPref BooleanPreference hasSeenAllowlistPrimerPref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(allowlistStatusDao, "allowlistStatusDao");
        Intrinsics.checkNotNullParameter(cryptoTransfersApi, "cryptoTransfersApi");
        Intrinsics.checkNotNullParameter(hasSeenAllowlistPrimerPref, "hasSeenAllowlistPrimerPref");
        this.allowlistStatusDao = allowlistStatusDao;
        this.cryptoTransfersApi = cryptoTransfersApi;
        this.hasSeenAllowlistPrimerPref = hasSeenAllowlistPrimerPref;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getRecentAddressesEndpoint = Endpoint.Companion.createWithParams$default(companion, new CryptoSavedAddressesStore$getRecentAddressesEndpoint$1(this, null), getLogoutKillswitch(), new CryptoSavedAddressesStore$getRecentAddressesEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getSavedAddressesEndpoint = Endpoint.Companion.createWithParams$default(companion, new CryptoSavedAddressesStore$getSavedAddressesEndpoint$1(this, null), getLogoutKillswitch(), new CryptoSavedAddressesStore$getSavedAddressesEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        Endpoint<Unit, AllowlistStatus> endpointCreate$default = Endpoint.Companion.create$default(companion, new CryptoSavedAddressesStore$getAllowlistingStatusEndpoint$1(this, null), getLogoutKillswitch(), new CryptoSavedAddressesStore$getAllowlistingStatusEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getAllowlistingStatusEndpoint = endpointCreate$default;
        this.allowlistQuery = Store.create$default(this, Query.INSTANCE, "AllowlistQuery", CollectionsKt.listOf(new RefreshEach(new CryptoSavedAddressesStore$allowlistQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoSavedAddressesStore.allowlistQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.setAllowlistingStatusEndpoint = Endpoint.Companion.create$default(companion, new CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$1(this, null), getLogoutKillswitch(), new CryptoSavedAddressesStore$setAllowlistingStatusEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.createSavedAddressEndpoint = PostEndpoint.INSTANCE.create(new CryptoSavedAddressesStore$createSavedAddressEndpoint$1(this, null), new CryptoSavedAddressesStore$createSavedAddressEndpoint$2(null));
        this.deleteSavedAddressEndpoint = Endpoint.Companion.create$default(companion, new CryptoSavedAddressesStore$deleteSavedAddressEndpoint$1(this, null), getLogoutKillswitch(), new CryptoSavedAddressesStore$deleteSavedAddressEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.savedAddresses = StateFlow4.MutableStateFlow(new LinkedHashMap());
        this.recentAddresses = StateFlow4.MutableStateFlow(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allowlistQuery$lambda$0(CryptoSavedAddressesStore cryptoSavedAddressesStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoSavedAddressesStore.allowlistStatusDao.stream();
    }

    public final StateFlow2<Map<String, ApiSavedAddresses>> getSavedAddresses() {
        return this.savedAddresses;
    }

    public final StateFlow2<Map<String, ApiSavedAddresses>> getRecentAddresses() {
        return this.recentAddresses;
    }

    public final Flow<ApiSavedAddresses> streamCachedRecentAddresses(final String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        final StateFlow2<Map<String, ApiSavedAddresses>> stateFlow2 = this.recentAddresses;
        return new Flow<ApiSavedAddresses>() { // from class: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedRecentAddresses$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedRecentAddresses$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $currencyCode$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedRecentAddresses$$inlined$mapNotNull$1$2", m3645f = "CryptoSavedAddressesStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedRecentAddresses$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$currencyCode$inlined = str;
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
                        Object obj3 = ((Map) obj).get(this.$currencyCode$inlined);
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ApiSavedAddresses> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, currencyCode), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<ApiSavedAddresses> streamCachedSavedAddresses(final String currencyCode) {
        final StateFlow2<Map<String, ApiSavedAddresses>> stateFlow2 = this.savedAddresses;
        return new Flow<ApiSavedAddresses>() { // from class: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedSavedAddresses$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ApiSavedAddresses> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, currencyCode), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedSavedAddresses$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $currencyCode$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedSavedAddresses$$inlined$mapNotNull$1$2", m3645f = "CryptoSavedAddressesStore.kt", m3646l = {73}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore$streamCachedSavedAddresses$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$currencyCode$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ApiSavedAddresses apiSavedAddresses;
                    ApiSavedAddresses apiSavedAddresses2;
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
                        Map map = (Map) obj;
                        if (!map.containsKey(this.$currencyCode$inlined)) {
                            if (!map.containsKey(CryptoSavedAddressesStore.ALL_CURRENCIES_KEY) || (apiSavedAddresses2 = (ApiSavedAddresses) map.get(CryptoSavedAddressesStore.ALL_CURRENCIES_KEY)) == null) {
                                apiSavedAddresses = null;
                            } else {
                                List<ApiSavedAddress> results = apiSavedAddresses2.getResults();
                                ArrayList arrayList = new ArrayList();
                                for (T t : results) {
                                    if (Intrinsics.areEqual(((ApiSavedAddress) t).getCurrencyCode(), this.$currencyCode$inlined)) {
                                        arrayList.add(t);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    apiSavedAddresses = new ApiSavedAddresses(arrayList);
                                }
                            }
                        } else {
                            apiSavedAddresses = (ApiSavedAddresses) map.get(this.$currencyCode$inlined);
                        }
                        if (apiSavedAddresses != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(apiSavedAddresses, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final void refreshSavedAddresses(String currencyCode) {
        Endpoint.DefaultImpls.refresh$default(this.getSavedAddressesEndpoint, new SavedAddressListRequest(currencyCode), true, null, 4, null);
    }

    public final void refreshRecentAddresses(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Endpoint.DefaultImpls.refresh$default(this.getRecentAddressesEndpoint, new RecentAddressListRequest(currencyCode), true, null, 4, null);
    }

    public final Flow<AllowlistStatus> streamAllowlistStatus() {
        return QueryKt.asFlow(this.allowlistQuery);
    }

    public final Object fetchSavedAddresses(String str, Continuation<? super ApiSavedAddresses> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getSavedAddressesEndpoint, new SavedAddressListRequest(str), null, continuation, 2, null);
    }

    public final Object fetchRecentAddresses(String str, Continuation<? super ApiSavedAddresses> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getRecentAddressesEndpoint, new RecentAddressListRequest(str), null, continuation, 2, null);
    }

    public final Object setAllowlistingStatus(boolean z, Continuation<? super AllowlistStatus> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.setAllowlistingStatusEndpoint, new ApiAllowlistingStatusRequest(z), null, continuation, 2, null);
    }

    public final Object createSavedAddress(String str, String str2, String str3, Continuation<? super ApiCreateSavedAddress> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.createSavedAddressEndpoint, new ApiCreateSavedAddress.Request(str, str2, str3), null, continuation, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSavedAddress(String str, UUID uuid, Continuation<? super Unit> continuation) throws Throwable {
        C337551 c337551;
        ApiSavedAddresses apiSavedAddresses;
        ApiSavedAddresses apiSavedAddresses2;
        StateFlow2<Map<String, ApiSavedAddresses>> stateFlow2;
        Map<String, ApiSavedAddresses> value;
        Endpoint<DeleteSavedAddressRequest, Unit> endpoint;
        DeleteSavedAddressRequest deleteSavedAddressRequest;
        Map<String, ApiSavedAddresses> value2;
        if (continuation instanceof C337551) {
            c337551 = (C337551) continuation;
            int i = c337551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c337551.label = i - Integer.MIN_VALUE;
            } else {
                c337551 = new C337551(continuation);
            }
        }
        C337551 c3375512 = c337551;
        Object obj = c3375512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3375512.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ApiSavedAddresses apiSavedAddresses3 = (ApiSavedAddresses) c3375512.L$1;
            String str2 = (String) c3375512.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                apiSavedAddresses = apiSavedAddresses3;
                str = str2;
                Throwable th2 = th;
                StateFlow2<Map<String, ApiSavedAddresses>> stateFlow22 = this.savedAddresses;
                do {
                    value2 = stateFlow22.getValue();
                } while (!stateFlow22.compareAndSet(value2, MapsKt.plus(MapsKt.toMutableMap(value2), Tuples4.m3642to(str, apiSavedAddresses))));
                throw th2;
            }
        }
        ResultKt.throwOnFailure(obj);
        apiSavedAddresses = this.savedAddresses.getValue().get(str);
        if (apiSavedAddresses != null) {
            List<ApiSavedAddress> results = apiSavedAddresses.getResults();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : results) {
                if (!Intrinsics.areEqual(((ApiSavedAddress) obj2).getId(), uuid)) {
                    arrayList.add(obj2);
                }
            }
            apiSavedAddresses2 = apiSavedAddresses.copy(arrayList);
            if (apiSavedAddresses2 == null) {
            }
            stateFlow2 = this.savedAddresses;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, MapsKt.plus(MapsKt.toMutableMap(value), Tuples4.m3642to(str, apiSavedAddresses2))));
            endpoint = this.deleteSavedAddressEndpoint;
            deleteSavedAddressRequest = new DeleteSavedAddressRequest(uuid);
            c3375512.L$0 = str;
            c3375512.L$1 = apiSavedAddresses;
            c3375512.label = 1;
            if (Endpoint.DefaultImpls.forceFetch$default(endpoint, deleteSavedAddressRequest, null, c3375512, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        apiSavedAddresses2 = new ApiSavedAddresses(CollectionsKt.emptyList());
        stateFlow2 = this.savedAddresses;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, MapsKt.plus(MapsKt.toMutableMap(value), Tuples4.m3642to(str, apiSavedAddresses2))));
        endpoint = this.deleteSavedAddressEndpoint;
        deleteSavedAddressRequest = new DeleteSavedAddressRequest(uuid);
        c3375512.L$0 = str;
        c3375512.L$1 = apiSavedAddresses;
        c3375512.label = 1;
        if (Endpoint.DefaultImpls.forceFetch$default(endpoint, deleteSavedAddressRequest, null, c3375512, 2, null) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveAllowlistStatus$lib_store_crypto_externalDebug(AllowlistStatus allowlistStatus, Continuation<? super Unit> continuation) {
        CryptoSavedAddressesStore$saveAllowlistStatus$1 cryptoSavedAddressesStore$saveAllowlistStatus$1;
        if (continuation instanceof CryptoSavedAddressesStore$saveAllowlistStatus$1) {
            cryptoSavedAddressesStore$saveAllowlistStatus$1 = (CryptoSavedAddressesStore$saveAllowlistStatus$1) continuation;
            int i = cryptoSavedAddressesStore$saveAllowlistStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoSavedAddressesStore$saveAllowlistStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                cryptoSavedAddressesStore$saveAllowlistStatus$1 = new CryptoSavedAddressesStore$saveAllowlistStatus$1(this, continuation);
            }
        }
        Object obj = cryptoSavedAddressesStore$saveAllowlistStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoSavedAddressesStore$saveAllowlistStatus$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AllowlistStatusDao allowlistStatusDao = this.allowlistStatusDao;
            cryptoSavedAddressesStore$saveAllowlistStatus$1.L$0 = allowlistStatus;
            cryptoSavedAddressesStore$saveAllowlistStatus$1.label = 1;
            obj = allowlistStatusDao.get(cryptoSavedAddressesStore$saveAllowlistStatus$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            allowlistStatus = (AllowlistStatus) cryptoSavedAddressesStore$saveAllowlistStatus$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AllowlistStatus allowlistStatus2 = (AllowlistStatus) obj;
        if ((allowlistStatus2 != null ? allowlistStatus2.getStatus() : null) == ApiAllowlistingStatus.Status.DISABLED && allowlistStatus.getStatus() == ApiAllowlistingStatus.Status.ENABLED) {
            this.hasSeenAllowlistPrimerPref.set(false);
        }
        this.allowlistStatusDao.insert(allowlistStatus);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoSavedAddressesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore$Companion;", "", "<init>", "()V", "ALL_CURRENCIES_KEY", "", "getALL_CURRENCIES_KEY", "()Ljava/lang/String;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getALL_CURRENCIES_KEY() {
            return CryptoSavedAddressesStore.ALL_CURRENCIES_KEY;
        }
    }
}
