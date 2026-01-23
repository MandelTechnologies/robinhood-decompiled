package com.robinhood.android.idl.common;

import com.robinhood.idl.Dto;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DtoUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0000\u001a=\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001a?\u0010\t\u001a\u0004\u0018\u0001H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00020\r\"\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"unpackOrThrow", "D", "Lcom/robinhood/idl/Dto;", "P", "", "Lcom/squareup/wire/AnyMessage;", "dtoCreator", "Lcom/robinhood/idl/Dto$Creator;", "(Lcom/squareup/wire/AnyMessage;Lcom/robinhood/idl/Dto$Creator;)Lcom/robinhood/idl/Dto;", "unpackOrNull", "countFieldIsTrue", "", "field", "", "", "lib-serialization_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.idl.common.DtoUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DtoUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <D extends Dto<? extends P>, P> D unpackOrThrow(AnyMessage anyMessage, Dto.Creator<? extends D, P> dtoCreator) {
        Intrinsics.checkNotNullParameter(anyMessage, "<this>");
        Intrinsics.checkNotNullParameter(dtoCreator, "dtoCreator");
        return (D) dtoCreator.fromProto(anyMessage.unpack(dtoCreator.getProtoAdapter()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <D extends Dto<? extends P>, P> D unpackOrNull(AnyMessage anyMessage, Dto.Creator<? extends D, P> dtoCreator) {
        Intrinsics.checkNotNullParameter(anyMessage, "<this>");
        Intrinsics.checkNotNullParameter(dtoCreator, "dtoCreator");
        Object objUnpackOrNull = anyMessage.unpackOrNull(dtoCreator.getProtoAdapter());
        if (objUnpackOrNull != null) {
            return (D) dtoCreator.fromProto(objUnpackOrNull);
        }
        return null;
    }

    public static final int countFieldIsTrue(boolean... field) {
        Intrinsics.checkNotNullParameter(field, "field");
        int i = 0;
        for (boolean z : field) {
            if (z) {
                i++;
            }
        }
        return i;
    }
}
