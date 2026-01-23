package com.robinhood.utils.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Parcelable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00072\u001c\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u0002H\u00060\tH\u0086\bø\u0001\u0000J4\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00072\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00060\u000eH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/extensions/Parcelables;", "", "<init>", "()V", "classLoaderCreator", "Landroid/os/Parcelable$ClassLoaderCreator;", "T", "Landroid/os/Parcelable;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lkotlin/Function2;", "Landroid/os/Parcel;", "Ljava/lang/ClassLoader;", "creator", "Landroid/os/Parcelable$Creator;", "Lkotlin/Function1;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Parcelables {
    public static final Parcelables INSTANCE = new Parcelables();

    private Parcelables() {
    }

    public final /* synthetic */ <T extends Parcelable> Parcelable.ClassLoaderCreator<T> classLoaderCreator(final Function2<? super Parcel, ? super ClassLoader, ? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.needClassReification();
        return (Parcelable.ClassLoaderCreator<T>) new Parcelable.ClassLoaderCreator<T>() { // from class: com.robinhood.utils.extensions.Parcelables.classLoaderCreator.1
            /* JADX WARN: Incorrect return type in method signature: (Landroid/os/Parcel;Ljava/lang/ClassLoader;)TT; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public Parcelable createFromParcel(Parcel source, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(source, "source");
                return (Parcelable) create.invoke(source, loader);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/os/Parcel;)TT; */
            @Override // android.os.Parcelable.Creator
            public Parcelable createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return createFromParcel(source, (ClassLoader) null);
            }

            /* JADX WARN: Incorrect return type in method signature: (I)[TT; */
            @Override // android.os.Parcelable.Creator
            public Parcelable[] newArray(int size) {
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Parcelable[size];
            }
        };
    }

    public final /* synthetic */ <T extends Parcelable> Parcelable.Creator<T> creator(final Function1<? super Parcel, ? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.needClassReification();
        return (Parcelable.Creator<T>) new Parcelable.Creator<T>() { // from class: com.robinhood.utils.extensions.Parcelables.creator.1
            /* JADX WARN: Incorrect return type in method signature: (Landroid/os/Parcel;)TT; */
            @Override // android.os.Parcelable.Creator
            public Parcelable createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return (Parcelable) create.invoke(source);
            }

            /* JADX WARN: Incorrect return type in method signature: (I)[TT; */
            @Override // android.os.Parcelable.Creator
            public Parcelable[] newArray(int size) {
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Parcelable[size];
            }
        };
    }
}
