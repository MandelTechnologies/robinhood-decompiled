package com.robinhood.idl;

import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: Dto.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0005\u0006J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/idl/Dto;", "P", "", "toProto", "()Ljava/lang/Object;", "Creator", "SerializableCreator", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/idl/OneOfDto;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Dto<P> {

    /* compiled from: Dto.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\f\b\u0001\u0010\u0001 \u0001*\u0004\u0018\u00010\u0002*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0002J\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0002H&¢\u0006\u0002\u0010\rR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/idl/Dto$Creator;", "D", "", "P", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ljava/lang/Object;", "fromProto", "proto", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lcom/robinhood/idl/OneOfDto$Creator;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Creator<D, P> {
        D fromProto(P proto);

        ProtoAdapter<P> getProtoAdapter();

        D getZeroValue();
    }

    /* compiled from: Dto.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/idl/Dto$SerializableCreator;", "D", "P", "", "Lcom/robinhood/idl/Dto$Creator;", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/idl/MessageDto$Creator;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SerializableCreator<D, P> extends Creator<D, P> {
        KSerializer<D> getBinaryBase64Serializer();

        KSerializer<D> getDefaultSerializer();
    }

    P toProto();
}
