package com.robinhood.idl;

import android.os.Parcel;
import com.robinhood.idl.Dto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DtoParcelableCreator.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"writeToParcel", "", "D", "Lcom/robinhood/idl/Dto;", "P", "", "Lcom/robinhood/idl/Dto$Creator;", "value", "dest", "Landroid/os/Parcel;", "(Lcom/robinhood/idl/Dto$Creator;Lcom/robinhood/idl/Dto;Landroid/os/Parcel;)V", "lib-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.DtoParcelableCreatorKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class DtoParcelableCreator2 {
    public static final <D extends Dto<? extends P>, P> void writeToParcel(Dto.Creator<? extends D, P> creator, D value, Parcel dest) {
        Intrinsics.checkNotNullParameter(creator, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByteArray(creator.getProtoAdapter().encode(value.toProto()));
    }
}
