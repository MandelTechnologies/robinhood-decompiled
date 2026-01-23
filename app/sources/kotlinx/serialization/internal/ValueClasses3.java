package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: ValueClasses.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lkotlinx/serialization/internal/ULongSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ULong;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize-2TYgG_w", "(Lkotlinx/serialization/encoding/Encoder;J)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deserialize-I7RO_PI", "(Lkotlinx/serialization/encoding/Decoder;)J", "kotlinx-serialization-core"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@PublishedApi
/* renamed from: kotlinx.serialization.internal.ULongSerializer, reason: use source file name */
/* loaded from: classes23.dex */
public final class ValueClasses3 implements KSerializer<ULong> {
    public static final ValueClasses3 INSTANCE = new ValueClasses3();
    private static final SerialDescriptor descriptor = InlineClassDescriptor2.InlinePrimitiveDescriptor("kotlin.ULong", BuiltinSerializers.serializer(LongCompanionObject.INSTANCE));

    private ValueClasses3() {
    }

    @Override // kotlinx.serialization.KSerializer2
    public /* bridge */ /* synthetic */ Object deserialize(Decoding2 decoding2) {
        return ULong.m28604boximpl(m28895deserializeI7RO_PI(decoding2));
    }

    @Override // kotlinx.serialization.KSerializer3
    public /* bridge */ /* synthetic */ void serialize(Encoding4 encoding4, Object obj) {
        m28896serialize2TYgG_w(encoding4, ((ULong) obj).getData());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* renamed from: serialize-2TYgG_w, reason: not valid java name */
    public void m28896serialize2TYgG_w(Encoding4 encoder, long value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(getDescriptor()).encodeLong(value);
    }

    /* renamed from: deserialize-I7RO_PI, reason: not valid java name */
    public long m28895deserializeI7RO_PI(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ULong.m28605constructorimpl(decoder.decodeInline(getDescriptor()).decodeLong());
    }
}
