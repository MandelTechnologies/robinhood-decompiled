package com.robinhood.shared.store.idl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.models.idl.dao.IdlCacheDao;
import com.robinhood.store.StoreBundle;
import com.squareup.wire.ProtoAdapter;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdlKeyValueStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BP\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012+\u0010\b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0002\b\r0\tj\u0002`\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010\b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0002\b\r0\tj\u0002`\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/store/idl/IdlKeyValueStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "idlCacheDao", "Lcom/robinhood/shared/models/idl/dao/IdlCacheDao;", "protoAdapterSupplierMap", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-idl_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IdlKeyValueStore_Factory implements Factory<IdlKeyValueStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IdlCacheDao> idlCacheDao;
    private final Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final IdlKeyValueStore_Factory create(Provider<StoreBundle> provider, Provider<IdlCacheDao> provider2, Provider<Map<String, Function0<ProtoAdapter<?>>>> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final IdlKeyValueStore newInstance(StoreBundle storeBundle, IdlCacheDao idlCacheDao, Map<String, Function0<ProtoAdapter<?>>> map) {
        return INSTANCE.newInstance(storeBundle, idlCacheDao, map);
    }

    public IdlKeyValueStore_Factory(Provider<StoreBundle> storeBundle, Provider<IdlCacheDao> idlCacheDao, Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(idlCacheDao, "idlCacheDao");
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        this.storeBundle = storeBundle;
        this.idlCacheDao = idlCacheDao;
        this.protoAdapterSupplierMap = protoAdapterSupplierMap;
    }

    @Override // javax.inject.Provider
    public IdlKeyValueStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        IdlCacheDao idlCacheDao = this.idlCacheDao.get();
        Intrinsics.checkNotNullExpressionValue(idlCacheDao, "get(...)");
        Map<String, Function0<ProtoAdapter<?>>> map = this.protoAdapterSupplierMap.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.newInstance(storeBundle, idlCacheDao, map);
    }

    /* compiled from: IdlKeyValueStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072+\u0010\u000b\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e¢\u0006\u0002\b\u00100\fj\u0002`\u00110\u0007H\u0007J?\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2%\u0010\u000b\u001a!\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e¢\u0006\u0002\b\u00100\fj\u0002`\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/store/idl/IdlKeyValueStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/store/idl/IdlKeyValueStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "idlCacheDao", "Lcom/robinhood/shared/models/idl/dao/IdlCacheDao;", "protoAdapterSupplierMap", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "newInstance", "Lcom/robinhood/shared/store/idl/IdlKeyValueStore;", "lib-store-idl_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdlKeyValueStore_Factory create(Provider<StoreBundle> storeBundle, Provider<IdlCacheDao> idlCacheDao, Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(idlCacheDao, "idlCacheDao");
            Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
            return new IdlKeyValueStore_Factory(storeBundle, idlCacheDao, protoAdapterSupplierMap);
        }

        @JvmStatic
        public final IdlKeyValueStore newInstance(StoreBundle storeBundle, IdlCacheDao idlCacheDao, Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(idlCacheDao, "idlCacheDao");
            Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
            return new IdlKeyValueStore(storeBundle, idlCacheDao, protoAdapterSupplierMap);
        }
    }
}
