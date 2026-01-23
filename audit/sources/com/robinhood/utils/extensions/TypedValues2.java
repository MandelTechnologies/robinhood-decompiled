package com.robinhood.utils.extensions;

import android.os.Build;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypedValues.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"isColorInt", "", "Landroid/util/TypedValue;", "(Landroid/util/TypedValue;)Z", "setEmpty", "", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.TypedValuesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class TypedValues2 {
    public static final boolean isColorInt(TypedValue typedValue) {
        Intrinsics.checkNotNullParameter(typedValue, "<this>");
        return TypedValues.INSTANCE.isColorInt(typedValue.type);
    }

    public static final void setEmpty(TypedValue typedValue) {
        Intrinsics.checkNotNullParameter(typedValue, "<this>");
        typedValue.type = 0;
        typedValue.string = null;
        typedValue.data = 0;
        typedValue.assetCookie = 0;
        typedValue.resourceId = 0;
        typedValue.changingConfigurations = -1;
        typedValue.density = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            typedValue.sourceResourceId = 0;
        }
    }
}
