package com.robinhood.utils.system;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SystemServiceLocator.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002J\"\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0002¢\u0006\u0002\u0010\fR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/system/SystemServiceLocator;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface SystemServiceLocator<T> extends Interfaces2<Context, T> {
    String getServiceName();

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    T getValue2(Context thisRef, KProperty<?> property);

    @Override // kotlin.properties.Interfaces2
    /* synthetic */ Object getValue(Context context, KProperty kProperty);

    /* compiled from: SystemServiceLocator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static <T> T getValue(SystemServiceLocator<T> systemServiceLocator, Context thisRef, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            String serviceName = systemServiceLocator.getServiceName();
            T t = (T) thisRef.getSystemService(serviceName);
            return t != null ? t : (T) thisRef.getApplicationContext().getSystemService(serviceName);
        }
    }
}
