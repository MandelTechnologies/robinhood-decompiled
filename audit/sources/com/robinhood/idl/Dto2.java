package com.robinhood.idl;

import com.robinhood.idl.Dto;
import com.squareup.wire.WireEnum;
import java.lang.Enum;
import kotlin.Metadata;

/* compiled from: Dto.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/idl/EnumDto;", "P", "", "Lcom/squareup/wire/WireEnum;", "Lcom/robinhood/idl/Dto;", "Creator", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.EnumDto, reason: use source file name */
/* loaded from: classes20.dex */
public interface Dto2<P extends Enum<? extends P> & WireEnum> extends Dto<P> {

    /* compiled from: Dto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u001a\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003*\u0014\b\u0002\u0010\u0004*\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0002*\u00020\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/idl/EnumDto$Creator;", "D", "", "Lcom/robinhood/idl/EnumDto;", "P", "Lcom/squareup/wire/WireEnum;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.idl.EnumDto$Creator */
    public interface Creator<D extends Enum<? extends D> & Dto2<? extends P>, P extends Enum<? extends P> & WireEnum> extends Dto.SerializableCreator<D, P> {
    }
}
