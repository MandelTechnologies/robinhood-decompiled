package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: ValueClasses.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lkotlinx/serialization/internal/UShortSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShort;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize-i8woANY", "(Lkotlinx/serialization/encoding/Encoder;S)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deserialize-BwKQO78", "(Lkotlinx/serialization/encoding/Decoder;)S", "kotlinx-serialization-core"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@PublishedApi
/* renamed from: kotlinx.serialization.internal.UShortSerializer, reason: use source file name */
/* loaded from: classes23.dex */
public final class ValueClasses4 implements KSerializer<UShort> {
    public static final ValueClasses4 INSTANCE = new ValueClasses4();
    private static final SerialDescriptor descriptor = InlineClassDescriptor2.InlinePrimitiveDescriptor("kotlin.UShort", BuiltinSerializers.serializer(ShortCompanionObject.INSTANCE));

    private ValueClasses4() {
    }

    @Override // kotlinx.serialization.KSerializer2
    public /* bridge */ /* synthetic */ Object deserialize(Decoding2 decoding2) {
        return UShort.m28628boximpl(m28903deserializeBwKQO78(decoding2));
    }

    @Override // kotlinx.serialization.KSerializer3
    public /* bridge */ /* synthetic */ void serialize(Encoding4 encoding4, Object obj) {
        m28904serializei8woANY(encoding4, ((UShort) obj).getData());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* renamed from: serialize-i8woANY, reason: not valid java name */
    public void m28904serializei8woANY(Encoding4 encoder, short value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeShort(value);
    }

    /* renamed from: deserialize-BwKQO78, reason: not valid java name */
    public short m28903deserializeBwKQO78(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return UShort.m28629constructorimpl(decoder.decodeInline(getDescriptor()).decodeShort());
    }
}
