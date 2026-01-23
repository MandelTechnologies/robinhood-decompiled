package com.robinhood.android.idl.common;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: IdlModule_ProvideSerializersModuleFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB8\u0012/\u0010\u0003\u001a+\u0012'\u0012%\u0012\u0004\u0012\u00020\u0006\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0002\b\t0\u0005j\u0002`\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R7\u0010\u0003\u001a+\u0012'\u0012%\u0012\u0004\u0012\u00020\u0006\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0002\b\t0\u0005j\u0002`\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlModule_ProvideSerializersModuleFactory;", "Ldagger/internal/Factory;", "Lkotlinx/serialization/modules/SerializersModule;", "dtoCreatorSupplierMap", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IdlModule_ProvideSerializersModuleFactory implements Factory<SerializersModule> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> dtoCreatorSupplierMap;

    @JvmStatic
    public static final IdlModule_ProvideSerializersModuleFactory create(Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final SerializersModule provideSerializersModule(Map<String, Function0<Dto.SerializableCreator<?, ?>>> map) {
        return INSTANCE.provideSerializersModule(map);
    }

    public IdlModule_ProvideSerializersModuleFactory(Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> dtoCreatorSupplierMap) {
        Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
        this.dtoCreatorSupplierMap = dtoCreatorSupplierMap;
    }

    @Override // javax.inject.Provider
    public SerializersModule get() {
        Companion companion = INSTANCE;
        Map<String, Function0<Dto.SerializableCreator<?, ?>>> map = this.dtoCreatorSupplierMap.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.provideSerializersModule(map);
    }

    /* compiled from: IdlModule_ProvideSerializersModuleFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052/\u0010\u0006\u001a+\u0012'\u0012%\u0012\u0004\u0012\u00020\t\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0002\b\f0\bj\u0002`\r0\u0007H\u0007J3\u0010\u000e\u001a\u00020\u000f2)\u0010\u0006\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n¢\u0006\u0002\b\f0\bj\u0002`\rH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlModule_ProvideSerializersModuleFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/idl/common/IdlModule_ProvideSerializersModuleFactory;", "dtoCreatorSupplierMap", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "provideSerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdlModule_ProvideSerializersModuleFactory create(Provider<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> dtoCreatorSupplierMap) {
            Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
            return new IdlModule_ProvideSerializersModuleFactory(dtoCreatorSupplierMap);
        }

        @JvmStatic
        public final SerializersModule provideSerializersModule(Map<String, Function0<Dto.SerializableCreator<?, ?>>> dtoCreatorSupplierMap) {
            Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
            Object objCheckNotNull = Preconditions.checkNotNull(IdlModule.INSTANCE.provideSerializersModule(dtoCreatorSupplierMap), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (SerializersModule) objCheckNotNull;
        }
    }
}
