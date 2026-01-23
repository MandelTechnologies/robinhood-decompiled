package com.robinhood.utils.extensions;

import android.os.Parcel;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Parcels.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014\u001a:\u0010\u0015\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0017¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000b*\u00020\u0004¢\u0006\u0002\u0010\u001a\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\u000f*\u00020\u0004\u001a\n\u0010\u001c\u001a\u00020\u0011*\u00020\u0004\u001a\n\u0010\u001d\u001a\u00020\u0014*\u00020\u0004\u001a\u001b\u0010\u001e\u001a\u0002H\u0002\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u001f*\u00020\u0004¢\u0006\u0002\u0010 \u001a'\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0006\b\u0000\u0010#\u0018\u0001*\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, m3636d2 = {"writeNullable", "", "T", "", "Landroid/os/Parcel;", "value", "write", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Landroid/os/Parcel;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "writeNullableInt", "", "(Landroid/os/Parcel;Ljava/lang/Integer;)V", "writeBigDecimal", "bigDecimal", "Ljava/math/BigDecimal;", "writeBooleanCompat", "", "writeSparseIntArray", ResourceTypes.ARRAY, "Landroid/util/SparseIntArray;", "readNullable", "read", "Lkotlin/Function1;", "(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "readNullableInt", "(Landroid/os/Parcel;)Ljava/lang/Integer;", "readBigDecimal", "readBooleanCompat", "readSparseIntArray", "readTypedSerializable", "Ljava/io/Serializable;", "(Landroid/os/Parcel;)Ljava/io/Serializable;", "readTypedSparseArray", "Landroid/util/SparseArray;", "E", "classLoader", "Ljava/lang/ClassLoader;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.ParcelsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Parcels {
    public static final <T> void writeNullable(Parcel parcel, T t, Function2<? super Parcel, ? super T, Unit> write) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        Intrinsics.checkNotNullParameter(write, "write");
        if (t == null) {
            writeBooleanCompat(parcel, false);
        } else {
            writeBooleanCompat(parcel, true);
            write.invoke(parcel, t);
        }
    }

    public static final void writeNullableInt(Parcel parcel, Integer num) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        if (num == null) {
            writeBooleanCompat(parcel, false);
        } else {
            writeBooleanCompat(parcel, true);
            parcel.writeInt(num.intValue());
        }
    }

    public static final void writeBigDecimal(Parcel parcel, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        parcel.writeString(Any2.toOutput(bigDecimal));
    }

    public static final void writeBooleanCompat(Parcel parcel, boolean z) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        parcel.writeByte(z ? (byte) 1 : (byte) 0);
    }

    public static final void writeSparseIntArray(Parcel parcel, SparseIntArray array2) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        Intrinsics.checkNotNullParameter(array2, "array");
        parcel.writeInt(array2.size());
        int size = array2.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = array2.keyAt(i);
            int iValueAt = array2.valueAt(i);
            parcel.writeInt(iKeyAt);
            parcel.writeInt(iValueAt);
        }
    }

    public static final <T> T readNullable(Parcel parcel, Function1<? super Parcel, ? extends T> read) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        Intrinsics.checkNotNullParameter(read, "read");
        if (readBooleanCompat(parcel)) {
            return read.invoke(parcel);
        }
        return null;
    }

    public static final Integer readNullableInt(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        if (readBooleanCompat(parcel)) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static final BigDecimal readBigDecimal(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        String string2 = parcel.readString();
        if (string2 == null) {
            return null;
        }
        return new BigDecimal(string2);
    }

    public static final boolean readBooleanCompat(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        return parcel.readByte() == 1;
    }

    public static final SparseIntArray readSparseIntArray(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        int i = parcel.readInt();
        SparseIntArray sparseIntArray = new SparseIntArray(i);
        while (i > 0) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
            i--;
        }
        return sparseIntArray;
    }

    public static final <T extends Serializable> T readTypedSerializable(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        return (T) parcel.readSerializable();
    }

    public static /* synthetic */ SparseArray readTypedSparseArray$default(Parcel parcel, ClassLoader classLoader, int i, Object obj) {
        if ((i & 1) != 0) {
            Intrinsics.reifiedOperationMarker(4, "E");
            classLoader = Object.class.getClassLoader();
        }
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        SparseArray sparseArray = parcel.readSparseArray(classLoader);
        Intrinsics.checkNotNull(sparseArray);
        return sparseArray;
    }

    public static final /* synthetic */ <E> SparseArray<E> readTypedSparseArray(Parcel parcel, ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        SparseArray<E> sparseArray = parcel.readSparseArray(classLoader);
        Intrinsics.checkNotNull(sparseArray);
        return sparseArray;
    }
}
