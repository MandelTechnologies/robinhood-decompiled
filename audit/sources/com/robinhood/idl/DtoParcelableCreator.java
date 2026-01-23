package com.robinhood.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto;
import java.lang.reflect.Array;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DtoParcelableCreator.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0012\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u00020\u0004*\b\b\u0001\u0010\u0003*\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/idl/DtoParcelableCreator;", "D", "Lcom/robinhood/idl/Dto;", "P", "Landroid/os/Parcelable;", "", "Landroid/os/Parcelable$Creator;", "dtoCreator", "Lcom/robinhood/idl/Dto$Creator;", "<init>", "(Lcom/robinhood/idl/Dto$Creator;)V", "createFromParcel", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)Lcom/robinhood/idl/Dto;", "newArray", "", "size", "", "(I)[Lcom/robinhood/idl/Dto;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class DtoParcelableCreator<D extends Dto<? extends P> & Parcelable, P> implements Parcelable.Creator<D> {
    private final Dto.Creator<D, P> dtoCreator;

    /* JADX WARN: Multi-variable type inference failed */
    public DtoParcelableCreator(Dto.Creator<? extends D, P> dtoCreator) {
        Intrinsics.checkNotNullParameter(dtoCreator, "dtoCreator");
        this.dtoCreator = dtoCreator;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/os/Parcel;)TD; */
    @Override // android.os.Parcelable.Creator
    public Dto createFromParcel(Parcel source) {
        P pDecode;
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArrCreateByteArray = source.createByteArray();
        if (bArrCreateByteArray == null || (pDecode = this.dtoCreator.getProtoAdapter().decode(bArrCreateByteArray)) == null) {
            return null;
        }
        return (Dto) this.dtoCreator.fromProto(pDecode);
    }

    /* JADX WARN: Incorrect return type in method signature: (I)[TD; */
    @Override // android.os.Parcelable.Creator
    public Dto[] newArray(int size) throws NegativeArraySizeException {
        Object objNewInstance = Array.newInstance(this.dtoCreator.getZeroValue().getClass(), size);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<D of com.robinhood.idl.DtoParcelableCreator?>");
        return (Dto[]) objNewInstance;
    }
}
