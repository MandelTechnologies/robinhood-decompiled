package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: Tuples.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "decodeSequentially", "composite", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeStructure", "kotlinx-serialization-core"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@PublishedApi
/* renamed from: kotlinx.serialization.internal.TripleSerializer, reason: use source file name */
/* loaded from: classes14.dex */
public final class Tuples8<A, B, C> implements KSerializer<Tuples3<? extends A, ? extends B, ? extends C>> {
    private final KSerializer<A> aSerializer;
    private final KSerializer<B> bSerializer;
    private final KSerializer<C> cSerializer;
    private final SerialDescriptor descriptor;

    public Tuples8(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.aSerializer = aSerializer;
        this.bSerializer = bSerializer;
        this.cSerializer = cSerializer;
        this.descriptor = SerialDescriptors3.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.TripleSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Tuples8.descriptor$lambda$0(this.f$0, (SerialDescriptors) obj);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$0(Tuples8 tuples8, SerialDescriptors buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        SerialDescriptors.element$default(buildClassSerialDescriptor, "first", tuples8.aSerializer.getDescriptor(), null, false, 12, null);
        SerialDescriptors.element$default(buildClassSerialDescriptor, "second", tuples8.bSerializer.getDescriptor(), null, false, 12, null);
        SerialDescriptors.element$default(buildClassSerialDescriptor, "third", tuples8.cSerializer.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, Tuples3<? extends A, ? extends B, ? extends C> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Encoding3 encoding3BeginStructure = encoder.beginStructure(getDescriptor());
        encoding3BeginStructure.encodeSerializableElement(getDescriptor(), 0, this.aSerializer, value.getFirst());
        encoding3BeginStructure.encodeSerializableElement(getDescriptor(), 1, this.bSerializer, value.getSecond());
        encoding3BeginStructure.encodeSerializableElement(getDescriptor(), 2, this.cSerializer, value.getThird());
        encoding3BeginStructure.endStructure(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer2
    public Tuples3<A, B, C> deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Decoding decodingBeginStructure = decoder.beginStructure(getDescriptor());
        if (decodingBeginStructure.decodeSequentially()) {
            return decodeSequentially(decodingBeginStructure);
        }
        return decodeStructure(decodingBeginStructure);
    }

    private final Tuples3<A, B, C> decodeSequentially(Decoding composite) {
        Object objDecodeSerializableElement$default = Decoding.DefaultImpls.decodeSerializableElement$default(composite, getDescriptor(), 0, this.aSerializer, null, 8, null);
        Object objDecodeSerializableElement$default2 = Decoding.DefaultImpls.decodeSerializableElement$default(composite, getDescriptor(), 1, this.bSerializer, null, 8, null);
        Object objDecodeSerializableElement$default3 = Decoding.DefaultImpls.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
        composite.endStructure(getDescriptor());
        return new Tuples3<>(objDecodeSerializableElement$default, objDecodeSerializableElement$default2, objDecodeSerializableElement$default3);
    }

    private final Tuples3<A, B, C> decodeStructure(Decoding composite) {
        Decoding decoding;
        Object objDecodeSerializableElement$default = Tuples9.NULL;
        Object objDecodeSerializableElement$default2 = Tuples9.NULL;
        Object objDecodeSerializableElement$default3 = Tuples9.NULL;
        while (true) {
            int iDecodeElementIndex = composite.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex == -1) {
                composite.endStructure(getDescriptor());
                if (objDecodeSerializableElement$default != Tuples9.NULL) {
                    if (objDecodeSerializableElement$default2 != Tuples9.NULL) {
                        if (objDecodeSerializableElement$default3 == Tuples9.NULL) {
                            throw new SerializationExceptions2("Element 'third' is missing");
                        }
                        return new Tuples3<>(objDecodeSerializableElement$default, objDecodeSerializableElement$default2, objDecodeSerializableElement$default3);
                    }
                    throw new SerializationExceptions2("Element 'second' is missing");
                }
                throw new SerializationExceptions2("Element 'first' is missing");
            }
            if (iDecodeElementIndex == 0) {
                decoding = composite;
                objDecodeSerializableElement$default = Decoding.DefaultImpls.decodeSerializableElement$default(decoding, getDescriptor(), 0, this.aSerializer, null, 8, null);
            } else if (iDecodeElementIndex == 1) {
                decoding = composite;
                objDecodeSerializableElement$default2 = Decoding.DefaultImpls.decodeSerializableElement$default(decoding, getDescriptor(), 1, this.bSerializer, null, 8, null);
            } else if (iDecodeElementIndex == 2) {
                objDecodeSerializableElement$default3 = Decoding.DefaultImpls.decodeSerializableElement$default(composite, getDescriptor(), 2, this.cSerializer, null, 8, null);
            } else {
                throw new SerializationExceptions2("Unexpected index " + iDecodeElementIndex);
            }
            composite = decoding;
        }
    }
}
