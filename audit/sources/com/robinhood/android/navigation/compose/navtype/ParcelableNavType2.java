package com.robinhood.android.navigation.compose.navtype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ParcelableNavType.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\u0082\b¢\u0006\u0002\u0010\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\bH\u0002\u001a+\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\b*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"use", "R", "Landroid/os/Parcel;", "block", "Lkotlin/Function1;", "(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "marshallBase64", "", "Landroid/os/Parcelable;", "unmarshallBase64", "T", "Ljava/lang/Class;", "text", "(Ljava/lang/Class;Ljava/lang/String;)Landroid/os/Parcelable;", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.compose.navtype.ParcelableNavTypeKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ParcelableNavType2 {
    private static final <R> R use(Parcel parcel, Function1<? super Parcel, ? extends R> function1) {
        try {
            return function1.invoke(parcel);
        } finally {
            InlineMarker.finallyStart(1);
            parcel.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String marshallBase64(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        try {
            parcelObtain.writeParcelable(parcelable, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            String strEncodeToString = Base64.encodeToString(bArrMarshall, 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Parcelable> T unmarshallBase64(Class<T> cls, String str) {
        byte[] bArrDecode = Base64.decode(str, 11);
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        try {
            parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
            parcelObtain.setDataPosition(0);
            return (T) parcelObtain.readParcelable(cls.getClassLoader());
        } finally {
            parcelObtain.recycle();
        }
    }
}
