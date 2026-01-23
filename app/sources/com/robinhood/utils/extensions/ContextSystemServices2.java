package com.robinhood.utils.extensions;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ContextSystemServices.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/extensions/Contexts;", "", "<init>", "()V", "systemService", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "T", "name", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.Contexts, reason: use source file name */
/* loaded from: classes21.dex */
public final class ContextSystemServices2 {
    public static final ContextSystemServices2 INSTANCE = new ContextSystemServices2();

    private ContextSystemServices2() {
    }

    public final <T> Interfaces2<Context, T> systemService(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Interfaces2<Context, T>() { // from class: com.robinhood.utils.extensions.Contexts.systemService.1
            @Override // kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
                return getValue2(context, (KProperty<?>) kProperty);
            }

            /* renamed from: getValue, reason: avoid collision after fix types in other method */
            public T getValue2(Context thisRef, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(property, "property");
                T t = (T) thisRef.getSystemService(name);
                return t != null ? t : (T) thisRef.getApplicationContext().getSystemService(name);
            }
        };
    }
}
