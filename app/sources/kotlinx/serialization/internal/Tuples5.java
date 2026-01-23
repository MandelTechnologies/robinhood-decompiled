package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: Tuples.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0011\u001a\u00028\u00022\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00028\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00028\u0000*\u00028\u0002X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00028\u0001*\u00028\u0002X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "key", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "getValue", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@PublishedApi
@SourceDebugExtension
/* renamed from: kotlinx.serialization.internal.KeyValueSerializer, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class Tuples5<K, V, R> implements KSerializer<R> {
    private final KSerializer<K> keySerializer;
    private final KSerializer<V> valueSerializer;

    public /* synthetic */ Tuples5(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract K getKey(R r);

    protected abstract V getValue(R r);

    protected abstract R toResult(K key, V value);

    private Tuples5(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }

    protected final KSerializer<K> getKeySerializer() {
        return this.keySerializer;
    }

    protected final KSerializer<V> getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, R value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Encoding3 encoding3BeginStructure = encoder.beginStructure(getDescriptor());
        encoding3BeginStructure.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(value));
        encoding3BeginStructure.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(value));
        encoding3BeginStructure.endStructure(getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.KSerializer2
    public R deserialize(Decoding2 decoder) {
        R r;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor);
        if (!decodingBeginStructure.decodeSequentially()) {
            Object objDecodeSerializableElement$default = Tuples9.NULL;
            Object objDecodeSerializableElement$default2 = Tuples9.NULL;
            while (true) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        objDecodeSerializableElement$default = Decoding.DefaultImpls.decodeSerializableElement$default(decodingBeginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null);
                    } else if (iDecodeElementIndex == 1) {
                        objDecodeSerializableElement$default2 = Decoding.DefaultImpls.decodeSerializableElement$default(decodingBeginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null);
                    } else {
                        throw new SerializationExceptions2("Invalid index: " + iDecodeElementIndex);
                    }
                } else if (objDecodeSerializableElement$default != Tuples9.NULL) {
                    if (objDecodeSerializableElement$default2 == Tuples9.NULL) {
                        throw new SerializationExceptions2("Element 'value' is missing");
                    }
                    r = (R) toResult(objDecodeSerializableElement$default, objDecodeSerializableElement$default2);
                } else {
                    throw new SerializationExceptions2("Element 'key' is missing");
                }
            }
        } else {
            r = (R) toResult(Decoding.DefaultImpls.decodeSerializableElement$default(decodingBeginStructure, getDescriptor(), 0, getKeySerializer(), null, 8, null), Decoding.DefaultImpls.decodeSerializableElement$default(decodingBeginStructure, getDescriptor(), 1, getValueSerializer(), null, 8, null));
        }
        decodingBeginStructure.endStructure(descriptor);
        return r;
    }
}
