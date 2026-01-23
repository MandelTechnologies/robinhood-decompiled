package com.robinhood.idl;

import com.robinhood.idl.Dto;
import com.squareup.wire.Message;
import kotlin.Metadata;

/* compiled from: Dto.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\u0006\b\u0001\u0012\u0002H\u0001\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/idl/MessageDto;", "P", "Lcom/squareup/wire/Message;", "Lcom/robinhood/idl/Dto;", "Creator", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.MessageDto, reason: use source file name */
/* loaded from: classes20.dex */
public interface Dto3<P extends Message<? extends P, ?>> extends Dto<P> {

    /* compiled from: Dto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0012\b\u0002\u0010\u0003*\f\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/idl/MessageDto$Creator;", "D", "Lcom/robinhood/idl/MessageDto;", "P", "Lcom/squareup/wire/Message;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.idl.MessageDto$Creator */
    public interface Creator<D extends Dto3<? extends P>, P extends Message<P, ?>> extends Dto.SerializableCreator<D, P> {
    }
}
