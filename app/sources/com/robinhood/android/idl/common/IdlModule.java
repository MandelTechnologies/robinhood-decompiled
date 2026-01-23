package com.robinhood.android.idl.common;

import com.robinhood.android.idl.common.json.DtoJsonAdapterFactory;
import com.robinhood.idl.Dto;
import com.robinhood.idl.serialization.AnyMessageSerializer;
import com.robinhood.utils.moshi.jsonadapter.ObjectJsonAdapter;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.TypesJVM5;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilders2;

/* compiled from: IdlModule.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052%\u0010\u0006\u001a!\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\u0002\b\u000b0\u0007j\u0002`\fH\u0007J3\u0010\r\u001a\u00020\u000e2)\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\t¢\u0006\u0002\b\u000b0\u0007j\u0002`\u0011H\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlModule;", "", "<init>", "()V", "provideWireMoshi", "Lcom/squareup/moshi/Moshi;", "protoAdapterSupplierMap", "", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "provideSerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "dtoCreatorSupplierMap", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class IdlModule {
    public static final IdlModule INSTANCE = new IdlModule();

    @WireMoshi
    public final Moshi provideWireMoshi(Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap) {
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(builderAdd.add(TypesJVM5.getJavaType(Reflection.typeOf(Unit.class)), new ObjectJsonAdapter(Unit.INSTANCE)), "add(typeOf<T>().javaType, adapter)");
        builderAdd.add((JsonAdapter.Factory) new DtoJsonAdapterFactory());
        builderAdd.add(SupplierMaps2.jsonAdapterFactory$default(protoAdapterSupplierMap, false, 1, null));
        builderAdd.add((JsonAdapter.Factory) new KotlinJsonAdapter2());
        Moshi moshiBuild = builderAdd.build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    private IdlModule() {
    }

    public final SerializersModule provideSerializersModule(Map<String, Function0<Dto.SerializableCreator<?, ?>>> dtoCreatorSupplierMap) {
        Intrinsics.checkNotNullParameter(dtoCreatorSupplierMap, "dtoCreatorSupplierMap");
        SerializersModuleBuilders2 serializersModuleBuilders2 = new SerializersModuleBuilders2();
        serializersModuleBuilders2.contextual(Reflection.getOrCreateKotlinClass(AnyMessage.class), new AnyMessageSerializer(dtoCreatorSupplierMap));
        return serializersModuleBuilders2.build();
    }
}
