package com.robinhood.android.idl.common;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.IdlMultibindingModule;
import com.robinhood.idl.Dto;
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

/* compiled from: IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u00070\u0001:\u0001\u000fB8\u0012/\u0010\b\u001a+\u0012'\u0012%\u0012\u0004\u0012\u00020\u0003\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u000b0\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u0007H\u0016R7\u0010\b\u001a+\u0012'\u0012%\u0012\u0004\u0012\u00020\u0003\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory;", "Ldagger/internal/Factory;", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "dtoCreatorSupplierMap", "Ljavax/inject/Provider;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory */
/* loaded from: classes10.dex */
public final class C18555x3ae865c9 implements Factory<Map<String, Function0<ProtoAdapter<?>>>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> dtoCreatorSupplierMap;

    @JvmStatic
    public static final C18555x3ae865c9 create(Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Map<String, Function0<ProtoAdapter<?>>> provideProtoAdapterSupplierMap(Map<String, Function0<Dto.SerializableCreator<?, ?>>> map) {
        return INSTANCE.provideProtoAdapterSupplierMap(map);
    }

    public C18555x3ae865c9(Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> dtoCreatorSupplierMap) {
        Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
        this.dtoCreatorSupplierMap = dtoCreatorSupplierMap;
    }

    @Override // javax.inject.Provider
    public Map<String, Function0<ProtoAdapter<?>>> get() {
        Companion companion = INSTANCE;
        Map<String, Function0<Dto.SerializableCreator<?, ?>>> map = this.dtoCreatorSupplierMap.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.provideProtoAdapterSupplierMap(map);
    }

    /* compiled from: IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052/\u0010\u0006\u001a+\u0012'\u0012%\u0012\u0004\u0012\u00020\t\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0002\b\f0\bj\u0002`\r0\u0007H\u0007JR\u0010\u000e\u001a!\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\n¢\u0006\u0002\b\f0\bj\u0002`\u00102)\u0010\u0006\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0002\b\f0\bj\u0002`\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/idl/common/IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory;", "dtoCreatorSupplierMap", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "provideProtoAdapterSupplierMap", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.idl.common.IdlMultibindingModule_SupplierMapModule_ProvideProtoAdapterSupplierMapFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C18555x3ae865c9 create(Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> dtoCreatorSupplierMap) {
            Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
            return new C18555x3ae865c9(dtoCreatorSupplierMap);
        }

        @JvmStatic
        public final Map<String, Function0<ProtoAdapter<?>>> provideProtoAdapterSupplierMap(Map<String, Function0<Dto.SerializableCreator<?, ?>>> dtoCreatorSupplierMap) {
            Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
            Object objCheckNotNull = Preconditions.checkNotNull(IdlMultibindingModule.SupplierMapModule.INSTANCE.provideProtoAdapterSupplierMap(dtoCreatorSupplierMap), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Map) objCheckNotNull;
        }
    }
}
