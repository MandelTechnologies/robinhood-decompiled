package com.robinhood.android.idl.common.json;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.wire.Message;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: DtoJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/json/DtoJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "Companion", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class DtoJsonAdapterFactory implements JsonAdapter.Factory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) throws IllegalAccessException, IllegalArgumentException {
        Object objIdentity;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type2);
        Object obj = null;
        if (!Dto.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] genericInterfaces = rawType.getGenericInterfaces();
        Intrinsics.checkNotNullExpressionValue(genericInterfaces, "getGenericInterfaces(...)");
        Type type3 = null;
        boolean z = false;
        for (Type type4 : genericInterfaces) {
            Intrinsics.checkNotNull(type4);
            Class<?> rawType2 = _MoshiKotlinTypesExtensionsKt.getRawType(type4);
            if (Intrinsics.areEqual(rawType2, Dto3.class) || Intrinsics.areEqual(rawType2, Dto2.class)) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z = true;
                type3 = type4;
            }
        }
        if (z) {
            Intrinsics.checkNotNull(type3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            Type[] actualTypeArguments = ((ParameterizedType) type3).getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
            Type type5 = (Type) ArraysKt.single(actualTypeArguments);
            Object obj2 = rawType.getDeclaredField("Companion").get(null);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.robinhood.idl.Dto.Creator<kotlin.Nothing, kotlin.Nothing>");
            Dto.Creator creator = (Dto.Creator) obj2;
            Iterator<T> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Annotation) next) instanceof ToJsonTransform) {
                    obj = next;
                    break;
                }
            }
            ToJsonTransform toJsonTransform = (ToJsonTransform) obj;
            if (toJsonTransform != null) {
                annotations = SetsKt.minus((Set<? extends ToJsonTransform>) annotations, toJsonTransform);
            }
            if (toJsonTransform != null) {
                objIdentity = INSTANCE.getFastObjectInstance(Reflection.getOrCreateKotlinClass(toJsonTransform.objectClass()));
                if (objIdentity == null) {
                    objIdentity = UnaryOperator.identity();
                }
            }
            Intrinsics.checkNotNull(objIdentity, "null cannot be cast to non-null type java.util.function.UnaryOperator<kotlin.Nothing>");
            JsonAdapter jsonAdapterAdapter = moshi.adapter(type5, annotations);
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            return new Adapter(jsonAdapterAdapter, creator, (UnaryOperator) objIdentity);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* compiled from: DtoJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B7\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/idl/common/json/DtoJsonAdapterFactory$Adapter;", "D", "Lcom/robinhood/idl/Dto;", "P", "Lcom/squareup/wire/Message;", "Lcom/squareup/moshi/JsonAdapter;", "delegate", "creator", "Lcom/robinhood/idl/Dto$Creator;", "transformer", "Ljava/util/function/UnaryOperator;", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/robinhood/idl/Dto$Creator;Ljava/util/function/UnaryOperator;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Lcom/robinhood/idl/Dto;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Lcom/robinhood/idl/Dto;)V", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class Adapter<D extends Dto<? extends P>, P extends Message<P, ?>> extends JsonAdapter<D> {
        private final Dto.Creator<D, P> creator;
        private final JsonAdapter<P> delegate;
        private final UnaryOperator<P> transformer;

        /* JADX WARN: Multi-variable type inference failed */
        public Adapter(JsonAdapter<P> delegate, Dto.Creator<? extends D, P> creator, UnaryOperator<P> transformer) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(creator, "creator");
            Intrinsics.checkNotNullParameter(transformer, "transformer");
            this.delegate = delegate;
            this.creator = creator;
            this.transformer = transformer;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public D fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            P pFromJson = this.delegate.fromJson(reader);
            if (pFromJson != null) {
                return this.creator.fromProto(pFromJson);
            }
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, D value) throws IOException {
            Message message;
            Intrinsics.checkNotNullParameter(writer, "writer");
            this.delegate.toJson(writer, (JsonWriter) ((value == null || (message = (Message) value.toProto()) == null) ? null : (Message) this.transformer.apply(message)));
        }
    }

    /* compiled from: DtoJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/idl/common/json/DtoJsonAdapterFactory$Companion;", "", "<init>", "()V", "fastObjectInstance", "Lkotlin/reflect/KClass;", "getFastObjectInstance", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getFastObjectInstance(KClass<?> kClass) {
            return JvmClassMapping.getJavaClass(kClass).getDeclaredField("INSTANCE").get(null);
        }
    }
}
