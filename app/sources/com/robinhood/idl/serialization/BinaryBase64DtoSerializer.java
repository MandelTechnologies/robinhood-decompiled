package com.robinhood.idl.serialization;

import com.robinhood.idl.Dto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import okio.ByteString;

/* compiled from: BinaryBase64DtoSerializer.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/idl/serialization/BinaryBase64DtoSerializer;", "D", "Lcom/robinhood/idl/Dto;", "P", "", "Lkotlinx/serialization/KSerializer;", "creator", "Lcom/robinhood/idl/Dto$Creator;", "<init>", "(Lcom/robinhood/idl/Dto$Creator;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/robinhood/idl/Dto;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Lcom/robinhood/idl/Dto;)V", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BinaryBase64DtoSerializer<D extends Dto<? extends P>, P> implements KSerializer<D> {
    private final Dto.Creator<D, P> creator;
    private final SerialDescriptor descriptor;

    /* JADX WARN: Multi-variable type inference failed */
    public BinaryBase64DtoSerializer(Dto.Creator<? extends D, P> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.creator = creator;
        this.descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("Base64String[" + creator.getProtoAdapter().getTypeUrl() + "]", SerialKinds2.STRING.INSTANCE);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer2
    public D deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(decoder.decodeString());
        if (byteStringDecodeBase64 == null) {
            throw new IllegalArgumentException("Not a valid base64 string");
        }
        Dto.Creator<D, P> creator = this.creator;
        return creator.fromProto(creator.getProtoAdapter().decode(byteStringDecodeBase64));
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, D value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(this.creator.getProtoAdapter().encodeByteString(value.toProto()).base64());
    }
}
