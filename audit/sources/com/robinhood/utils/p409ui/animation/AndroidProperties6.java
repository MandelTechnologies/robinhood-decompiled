package com.robinhood.utils.p409ui.animation;

import android.util.Property;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty4;

/* compiled from: AndroidProperties.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\b¨\u0006\u0006"}, m3636d2 = {"asAndroidProperty", "Landroid/util/Property;", "T", "R", "", "Lkotlin/reflect/KMutableProperty1;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.animation.AndroidPropertiesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AndroidProperties6 {
    public static final /* synthetic */ <T, R> Property<T, R> asAndroidProperty(final KProperty4<T, R> kProperty4) {
        Intrinsics.checkNotNullParameter(kProperty4, "<this>");
        AndroidProperties androidProperties = AndroidProperties.INSTANCE;
        final String name = kProperty4.getName();
        Intrinsics.reifiedOperationMarker(4, "R");
        Intrinsics.needClassReification();
        final Class<Object> cls = Object.class;
        return new Property<T, R>(name, cls) { // from class: com.robinhood.utils.ui.animation.AndroidPropertiesKt$asAndroidProperty$$inlined$create$1
            @Override // android.util.Property
            public boolean isReadOnly() {
                return false;
            }

            @Override // android.util.Property
            public R get(T view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return (R) kProperty4.get(view);
            }

            @Override // android.util.Property
            public void set(T view, R value) {
                Intrinsics.checkNotNullParameter(view, "view");
                kProperty4.set(view, value);
            }
        };
    }
}
