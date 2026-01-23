package com.robinhood.utils.p409ui.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidProperties.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\u0006\b\u0001\u0010\u0007\u0018\u00012\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u000b¢\u0006\u0002\b\f2\u001f\b\u0004\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/ui/animation/AndroidProperties;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Landroid/util/Property;", "T", "R", "name", "", "getValue", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setValue", "Lkotlin/Function2;", "", "DRAWABLE_ALPHA", "Landroid/graphics/drawable/Drawable;", "", "getDRAWABLE_ALPHA", "()Landroid/util/Property;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class AndroidProperties {
    private static final Property<Drawable, Integer> DRAWABLE_ALPHA;
    public static final AndroidProperties INSTANCE = new AndroidProperties();
    public static final int $stable = 8;

    private AndroidProperties() {
    }

    static {
        final String str = "alpha";
        final Class<Integer> cls = Integer.class;
        DRAWABLE_ALPHA = new Property<Drawable, Integer>(str, cls) { // from class: com.robinhood.utils.ui.animation.AndroidProperties$special$$inlined$create$1
            @Override // android.util.Property
            public boolean isReadOnly() {
                return false;
            }

            @Override // android.util.Property
            public Integer get(Drawable view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return Integer.valueOf(view.getAlpha());
            }

            @Override // android.util.Property
            public void set(Drawable view, Integer value) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.setAlpha(value.intValue());
            }
        };
    }

    public final /* synthetic */ <T, R> Property<T, R> create(String name, final Function1<? super T, ? extends R> getValue, final Function2<? super T, ? super R, Unit> setValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        Intrinsics.checkNotNullParameter(setValue, "setValue");
        Intrinsics.reifiedOperationMarker(4, "R");
        Intrinsics.needClassReification();
        return new Property<T, R>(name, Object.class) { // from class: com.robinhood.utils.ui.animation.AndroidProperties.create.1
            @Override // android.util.Property
            public boolean isReadOnly() {
                return false;
            }

            @Override // android.util.Property
            public R get(T view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return getValue.invoke(view);
            }

            @Override // android.util.Property
            public void set(T view, R value) {
                Intrinsics.checkNotNullParameter(view, "view");
                setValue.invoke(view, value);
            }
        };
    }

    public final Property<Drawable, Integer> getDRAWABLE_ALPHA() {
        return DRAWABLE_ALPHA;
    }
}
