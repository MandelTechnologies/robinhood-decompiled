package com.twilio.twilsock.util;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: MultiMap.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0019\u001aB!\b\u0012\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/twilio/twilsock/util/MultiMap;", "K", "V", "", WebsocketGatewayConstants.DATA_KEY, "", "", "(Ljava/util/Map;)V", "()V", "map", "", "", "get", "key", "(Ljava/lang/Object;)Ljava/util/Set;", "putAll", "", "values", "", "(Ljava/lang/Object;Ljava/util/Collection;)V", "set", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "", "Companion", "MultiMapSerializer", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = MultiMapSerializer.class)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MultiMap<K, V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<K, Set<V>> map;

    public /* synthetic */ MultiMap(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* compiled from: MultiMap.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u00050\u0004\"\u0004\b\u0002\u0010\u0006\"\u0004\b\u0003\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004HÆ\u0001¨\u0006\n"}, m3636d2 = {"Lcom/twilio/twilsock/util/MultiMap$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/util/MultiMap;", "T0", "T1", "typeSerial0", "typeSerial1", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T0, T1> KSerializer<MultiMap<T0, T1>> serializer(KSerializer<T0> typeSerial0, KSerializer<T1> typeSerial1) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            Intrinsics.checkNotNullParameter(typeSerial1, "typeSerial1");
            return new MultiMapSerializer(typeSerial0, typeSerial1);
        }
    }

    public MultiMap() {
        this.map = new LinkedHashMap();
    }

    private MultiMap(Map<K, ? extends Set<? extends V>> map) {
        this();
        for (Map.Entry<K, ? extends Set<? extends V>> entry : map.entrySet()) {
            putAll(entry.getKey(), entry.getValue());
        }
    }

    public String toString() {
        return this.map.toString();
    }

    public final Set<V> get(K key) {
        return this.map.get(key);
    }

    public final void set(K key, V value) {
        putAll(key, CollectionsKt.listOf(value));
    }

    public final void putAll(K key, Collection<? extends V> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        Set<V> linkedHashSet = this.map.get(key);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            this.map.put(key, linkedHashSet);
        }
        linkedHashSet.addAll(values);
    }

    /* compiled from: MultiMap.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000e0\r0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/twilio/twilsock/util/MultiMap$MultiMapSerializer;", "K", "V", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/util/MultiMap;", "keySerializer", "valueSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serializer", "", "", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class MultiMapSerializer<K, V> implements KSerializer<MultiMap<K, V>> {
        private final SerialDescriptor descriptor;
        private final KSerializer<Map<K, Set<V>>> serializer;

        public MultiMapSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
            Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
            KSerializer<Map<K, Set<V>>> kSerializerMapSerializer = BuiltinSerializers.MapSerializer(keySerializer, BuiltinSerializers.SetSerializer(valueSerializer));
            this.serializer = kSerializerMapSerializer;
            this.descriptor = kSerializerMapSerializer.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MultiMap<K, V> value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(this.serializer, ((MultiMap) value).map);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MultiMap<K, V> deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MultiMap<>((Map) decoder.decodeSerializableValue(this.serializer), null);
        }
    }
}
