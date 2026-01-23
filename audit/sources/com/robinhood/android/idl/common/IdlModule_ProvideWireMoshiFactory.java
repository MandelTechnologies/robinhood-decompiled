package com.robinhood.android.idl.common;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.Moshi;
import com.squareup.wire.ProtoAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdlModule_ProvideWireMoshiFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB4\u0012+\u0010\u0003\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0002\b\t0\u0005j\u0002`\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R3\u0010\u0003\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0002\b\t0\u0005j\u0002`\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlModule_ProvideWireMoshiFactory;", "Ldagger/internal/Factory;", "Lcom/squareup/moshi/Moshi;", "protoAdapterSupplierMap", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IdlModule_ProvideWireMoshiFactory implements Factory<Moshi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap;

    @JvmStatic
    public static final IdlModule_ProvideWireMoshiFactory create(Provider<Map<String, Function0<ProtoAdapter<?>>>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Moshi provideWireMoshi(Map<String, Function0<ProtoAdapter<?>>> map) {
        return INSTANCE.provideWireMoshi(map);
    }

    public IdlModule_ProvideWireMoshiFactory(Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        this.protoAdapterSupplierMap = protoAdapterSupplierMap;
    }

    @Override // javax.inject.Provider
    public Moshi get() {
        Companion companion = INSTANCE;
        Map<String, Function0<ProtoAdapter<?>>> map = this.protoAdapterSupplierMap.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.provideWireMoshi(map);
    }

    /* compiled from: IdlModule_ProvideWireMoshiFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u00052+\u0010\u0006\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0002\b\f0\bj\u0002`\r0\u0007H\u0007J/\u0010\u000e\u001a\u00020\u000f2%\u0010\u0006\u001a!\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0002\b\f0\bj\u0002`\rH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlModule_ProvideWireMoshiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/idl/common/IdlModule_ProvideWireMoshiFactory;", "protoAdapterSupplierMap", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "provideWireMoshi", "Lcom/squareup/moshi/Moshi;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdlModule_ProvideWireMoshiFactory create(Provider<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
            Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
            return new IdlModule_ProvideWireMoshiFactory(protoAdapterSupplierMap);
        }

        @JvmStatic
        public final Moshi provideWireMoshi(Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap) {
            Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
            Object objCheckNotNull = Preconditions.checkNotNull(IdlModule.INSTANCE.provideWireMoshi(protoAdapterSupplierMap), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Moshi) objCheckNotNull;
        }
    }
}
