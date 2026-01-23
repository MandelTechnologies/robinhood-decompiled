package com.robinhood.utils.moshi;

import com.robinhood.utils.moshi.jsonadapter.ObjectJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* compiled from: JsonAdapterBinding.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\r\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "", "type", "Ljava/lang/reflect/Type;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V", "getType", "()Ljava/lang/reflect/Type;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class JsonAdapterBinding {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final JsonAdapter<?> adapter;
    private final Type type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonAdapterBinding copy$default(JsonAdapterBinding jsonAdapterBinding, Type type2, JsonAdapter jsonAdapter, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = jsonAdapterBinding.type;
        }
        if ((i & 2) != 0) {
            jsonAdapter = jsonAdapterBinding.adapter;
        }
        return jsonAdapterBinding.copy(type2, jsonAdapter);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final JsonAdapter<?> component2() {
        return this.adapter;
    }

    public final JsonAdapterBinding copy(Type type2, JsonAdapter<?> adapter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new JsonAdapterBinding(type2, adapter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonAdapterBinding)) {
            return false;
        }
        JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) other;
        return Intrinsics.areEqual(this.type, jsonAdapterBinding.type) && Intrinsics.areEqual(this.adapter, jsonAdapterBinding.adapter);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.adapter.hashCode();
    }

    public String toString() {
        return "JsonAdapterBinding(type=" + this.type + ", adapter=" + this.adapter + ")";
    }

    public JsonAdapterBinding(Type type2, JsonAdapter<?> adapter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.type = type2;
        this.adapter = adapter;
    }

    public final Type getType() {
        return this.type;
    }

    public final JsonAdapter<?> getAdapter() {
        return this.adapter;
    }

    /* compiled from: JsonAdapterBinding.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0006\u0018\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0086\nJ\"\u0010\t\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\u0006\u0010\n\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/moshi/JsonAdapterBinding$Companion;", "", "<init>", "()V", "invoke", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "T", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "ofObject", "instance", "(Ljava/lang/Object;)Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ <T> JsonAdapterBinding invoke(JsonAdapter<T> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.reifiedOperationMarker(6, "T");
            return new JsonAdapterBinding(ReflectJvmMapping.getJavaType(null), adapter);
        }

        public final /* synthetic */ <T> JsonAdapterBinding ofObject(T instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.reifiedOperationMarker(4, "T");
            return new JsonAdapterBinding(Object.class, new ObjectJsonAdapter(instance));
        }
    }
}
