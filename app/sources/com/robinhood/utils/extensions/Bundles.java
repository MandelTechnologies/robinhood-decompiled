package com.robinhood.utils.extensions;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bundles.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\"\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u001a\"\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u001a%\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\n*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\r\u001a(\u0010\u000e\u001a\u0004\u0018\u0001H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\r\u001a(\u0010\u000f\u001a\u0004\u0018\u0001H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"putParcelableList", "", "Landroid/os/Bundle;", "key", "", "value", "", "Landroid/os/Parcelable;", "putStringList", "putSerializableList", "Ljava/io/Serializable;", "getTypedSerializable", "T", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "serializable", "parcelable", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.BundlesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Bundles {
    public static final void putParcelableList(Bundle bundle, String key, List<? extends Parcelable> value) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof ArrayList) {
            bundle.putParcelableArrayList(key, (ArrayList) value);
        } else {
            bundle.putParcelableArrayList(key, (ArrayList) CollectionsKt.toCollection(value, new ArrayList()));
        }
    }

    public static final void putStringList(Bundle bundle, String key, List<String> list) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (list == null) {
            bundle.putStringArrayList(key, null);
            return;
        }
        ArrayList<String> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        if (arrayList == null) {
            arrayList = (ArrayList) CollectionsKt.toCollection(list, new ArrayList(list.size()));
        }
        bundle.putStringArrayList(key, arrayList);
    }

    public static final void putSerializableList(Bundle bundle, String key, List<? extends Serializable> list) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (list == null) {
            bundle.putSerializable(key, null);
            return;
        }
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        if (arrayList == null) {
            arrayList = (ArrayList) CollectionsKt.toCollection(list, new ArrayList(list.size()));
        }
        bundle.putSerializable(key, arrayList);
    }

    public static final <T extends Serializable> T getTypedSerializable(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return (T) bundle.getSerializable(str);
    }

    public static final /* synthetic */ <T extends Serializable> T serializable(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 34) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) bundle.getSerializable(key, Serializable.class);
        }
        T t = (T) bundle.getSerializable(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> T parcelable(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 34) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) bundle.getParcelable(key, Parcelable.class);
        }
        T t = (T) bundle.getParcelable(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
