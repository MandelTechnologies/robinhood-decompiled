package com.robinhood.android.navigation.compose.navtype;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParcelableNavType.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/navtype/ParcelableNavType;", "T", "Landroid/os/Parcelable;", "Landroidx/navigation/NavType;", "kClassType", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "name", "", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "parseValue", "value", "(Ljava/lang/String;)Landroid/os/Parcelable;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "deserialize", "(Landroid/os/Parcelable;)Ljava/lang/String;", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ParcelableNavType<T extends Parcelable> extends NavType<T> {
    public static final int $stable = 8;
    private final Class<T> kClassType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableNavType(Class<T> kClassType) {
        super(false);
        Intrinsics.checkNotNullParameter(kClassType, "kClassType");
        this.kClassType = kClassType;
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        String name = this.kClassType.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // androidx.navigation.NavType
    public T get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) bundle.getParcelable(key);
    }

    @Override // androidx.navigation.NavType
    public T parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T t = (T) ParcelableNavType2.unmarshallBase64(this.kClassType, value);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.robinhood.android.navigation.compose.navtype.ParcelableNavType");
        return t;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, T value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelable(key, value);
    }

    public final String deserialize(T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ParcelableNavType2.marshallBase64(value);
    }
}
