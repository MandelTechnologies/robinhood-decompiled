package com.robinhood.idl.serialization;

import com.robinhood.idl.Dto3;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: AnyMessageSerializer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/idl/serialization/NothingDtoCreator;", "Lcom/robinhood/idl/MessageDto$Creator;", "", "<init>", "()V", "notImplemented", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "zeroValue", "getZeroValue", "()Ljava/lang/Void;", "fromProto", "proto", "NothingProtoAdapter", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.serialization.NothingDtoCreator, reason: use source file name */
/* loaded from: classes15.dex */
final class AnyMessageSerializer3 implements Dto3.Creator {
    public static final AnyMessageSerializer3 INSTANCE = new AnyMessageSerializer3();

    private AnyMessageSerializer3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Void notImplemented() {
        throw new Standard2("This is a dummy and not intended to be called.");
    }

    @Override // com.robinhood.idl.Dto.Creator
    public ProtoAdapter getProtoAdapter() {
        return NothingProtoAdapter.INSTANCE;
    }

    @Override // com.robinhood.idl.Dto.SerializableCreator
    public KSerializer getDefaultSerializer() {
        notImplemented();
        throw new ExceptionsH();
    }

    @Override // com.robinhood.idl.Dto.SerializableCreator
    public KSerializer getBinaryBase64Serializer() {
        notImplemented();
        throw new ExceptionsH();
    }

    @Override // com.robinhood.idl.Dto.Creator
    public Void getZeroValue() {
        notImplemented();
        throw new ExceptionsH();
    }

    @Override // com.robinhood.idl.Dto.Creator
    public Void fromProto(Void proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        notImplemented();
        throw new ExceptionsH();
    }

    /* compiled from: AnyMessageSerializer.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/idl/serialization/NothingDtoCreator$NothingProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "encodedSize", "", "value", "encode", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.idl.serialization.NothingDtoCreator$NothingProtoAdapter */
    private static final class NothingProtoAdapter extends ProtoAdapter {
        public static final NothingProtoAdapter INSTANCE = new NothingProtoAdapter();

        private NothingProtoAdapter() {
            super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(Void.class), "com.robinhood.idl/kotlin.Nothing", Syntax.PROTO_3);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Void value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AnyMessageSerializer3.INSTANCE.notImplemented();
            throw new ExceptionsH();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Void encode(ProtoWriter writer, Void value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            AnyMessageSerializer3.INSTANCE.notImplemented();
            throw new ExceptionsH();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Void encode(ReverseProtoWriter writer, Void value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            AnyMessageSerializer3.INSTANCE.notImplemented();
            throw new ExceptionsH();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Void decode(ProtoReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            AnyMessageSerializer3.INSTANCE.notImplemented();
            throw new ExceptionsH();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Void redact(Void value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AnyMessageSerializer3.INSTANCE.notImplemented();
            throw new ExceptionsH();
        }
    }
}
