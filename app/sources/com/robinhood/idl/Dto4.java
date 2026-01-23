package com.robinhood.idl;

import com.robinhood.idl.Dto;
import com.squareup.wire.Message;
import kotlin.Metadata;

/* compiled from: Dto.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/idl/OneOfDto;", "Lcom/robinhood/idl/Dto;", "", "toProto", "Creator", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.OneOfDto, reason: use source file name */
/* loaded from: classes20.dex */
public interface Dto4 extends Dto {
    @Override // com.robinhood.idl.Dto
    Void toProto();

    /* compiled from: Dto.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.idl.OneOfDto$DefaultImpls */
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
        public static Void toProto(Dto4 dto4) {
            throw new IllegalStateException("OneOfDto objects can not be converted to proto");
        }
    }

    /* compiled from: Dto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bf\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u0002*\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/idl/OneOfDto$Creator;", "D", "Lcom/robinhood/idl/OneOfDto;", "P", "Lcom/squareup/wire/Message;", "Lcom/robinhood/idl/Dto$Creator;", "zeroValue", "", "getZeroValue", "()Ljava/lang/Void;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.idl.OneOfDto$Creator */
    /* loaded from: classes15.dex */
    public interface Creator<D extends Dto4, P extends Message<P, ?>> extends Dto.Creator<D, P> {
        @Override // com.robinhood.idl.Dto.Creator
        Void getZeroValue();

        /* compiled from: Dto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.idl.OneOfDto$Creator$DefaultImpls */
        public static final class DefaultImpls {
            public static <D extends Dto4, P extends Message<P, ?>> Void getZeroValue(Creator<? extends D, P> creator) {
                throw new IllegalStateException("OneOfDto objects do not have a zeroValue");
            }
        }
    }
}
