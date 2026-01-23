package com.robinhood.idl.serialization;

import com.robinhood.idl.Dto;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModule4;
import kotlinx.serialization.modules.SerializersModuleBuilders2;

/* compiled from: AnyMessageSerializer.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a#\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006H\u0086\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0086\u0002¨\u0006\t"}, m3636d2 = {"plus", "Lkotlinx/serialization/modules/SerializersModule;", "serializer", "Lcom/robinhood/idl/serialization/AnyMessageSerializer;", "Lkotlinx/serialization/json/Json;", "bindings", "", "Lcom/robinhood/idl/Dto$SerializableCreator;", "binding", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.idl.serialization.AnyMessageSerializerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AnyMessageSerializer2 {
    public static final SerializersModule plus(SerializersModule serializersModule, AnyMessageSerializer serializer) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        AnyMessageSerializer anyMessageSerializer = (AnyMessageSerializer) SerializersModule.getContextual$default(serializersModule, Reflection.getOrCreateKotlinClass(AnyMessage.class), null, 2, null);
        if (anyMessageSerializer != null) {
            serializer = anyMessageSerializer.plus(serializer);
        }
        SerializersModuleBuilders2 serializersModuleBuilders2 = new SerializersModuleBuilders2();
        serializersModuleBuilders2.contextual(Reflection.getOrCreateKotlinClass(AnyMessage.class), serializer);
        return SerializersModule4.overwriteWith(serializersModule, serializersModuleBuilders2.build());
    }

    public static final Json plus(Json json, final AnyMessageSerializer serializer) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return Json6.Json(json, new Function1() { // from class: com.robinhood.idl.serialization.AnyMessageSerializerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnyMessageSerializer2.plus$lambda$1(serializer, (Json4) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit plus$lambda$1(AnyMessageSerializer anyMessageSerializer, Json4 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setSerializersModule(plus(Json.getSerializersModule(), anyMessageSerializer));
        return Unit.INSTANCE;
    }

    public static final Json plus(Json json, Iterable<? extends Dto.SerializableCreator<?, ?>> bindings) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        return plus(json, new AnyMessageSerializer(bindings));
    }

    public static final Json plus(Json json, Dto.SerializableCreator<?, ?> binding) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        return plus(json, new AnyMessageSerializer((Dto.SerializableCreator<?, ?>[]) new Dto.SerializableCreator[]{binding}));
    }
}
