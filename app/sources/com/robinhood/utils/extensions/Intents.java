package com.robinhood.utils.extensions;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Intents.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a \u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a \u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u001a\"\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u001a#\u0010\f\u001a\u0002H\r\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u000e\u001a(\u0010\u000f\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\n*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u000e\u001a(\u0010\u0011\u001a\u0004\u0018\u0001H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"getStringExtraOrThrow", "", "Landroid/content/Intent;", "name", "putParcelableListExtra", "", "value", "", "Landroid/os/Parcelable;", "putSerializableListExtra", "Ljava/io/Serializable;", "putStringListExtra", "getSerializable", "T", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/io/Serializable;", "serializable", "key", "parcelable", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes12.dex */
public final class Intents {
    public static final String getStringExtraOrThrow(Intent intent, String name) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String stringExtra = intent.getStringExtra(name);
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void putParcelableListExtra(Intent intent, String name, List<? extends Parcelable> value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList<? extends Parcelable> arrayList = value instanceof ArrayList ? (ArrayList) value : null;
        if (arrayList == null) {
            arrayList = (ArrayList) CollectionsKt.toCollection(value, new ArrayList(value.size()));
        }
        intent.putParcelableArrayListExtra(name, arrayList);
    }

    public static final void putSerializableListExtra(Intent intent, String name, List<? extends Serializable> value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = value instanceof ArrayList ? (ArrayList) value : null;
        if (arrayList == null) {
            arrayList = (ArrayList) CollectionsKt.toCollection(value, new ArrayList(value.size()));
        }
        intent.putExtra(name, arrayList);
    }

    public static final void putStringListExtra(Intent intent, String name, List<String> list) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (list == null) {
            intent.putExtra(name, (Serializable) null);
            return;
        }
        ArrayList<String> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        if (arrayList == null) {
            arrayList = (ArrayList) CollectionsKt.toCollection(list, new ArrayList(list.size()));
        }
        intent.putStringArrayListExtra(name, arrayList);
    }

    public static final <T extends Serializable> T getSerializable(Intent intent, String name) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return (T) intent.getSerializableExtra(name);
    }

    public static final /* synthetic */ <T extends Serializable> T serializable(Intent intent, String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 34) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) intent.getSerializableExtra(key, Serializable.class);
        }
        T t = (T) intent.getSerializableExtra(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> T parcelable(Intent intent, String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 34) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) intent.getParcelableExtra(key, Parcelable.class);
        }
        T t = (T) intent.getParcelableExtra(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
