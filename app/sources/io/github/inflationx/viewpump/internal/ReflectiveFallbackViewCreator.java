package io.github.inflationx.viewpump.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import io.github.inflationx.viewpump.FallbackViewCreator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: -ReflectiveFallbackViewCreator.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ReflectiveFallbackViewCreator;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "()V", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "Companion", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.github.inflationx.viewpump.internal.-ReflectiveFallbackViewCreator, reason: invalid class name */
/* loaded from: classes14.dex */
public final class ReflectiveFallbackViewCreator implements FallbackViewCreator {
    private static final Class<? extends Object>[] CONSTRUCTOR_SIGNATURE_1 = {Context.class};
    private static final Class<? extends Object>[] CONSTRUCTOR_SIGNATURE_2 = {Context.class, AttributeSet.class};

    @Override // io.github.inflationx.viewpump.FallbackViewCreator
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) throws Exception {
        Constructor constructor;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(name).asSubclass(View.class);
            try {
                Class<? extends Object>[] clsArr = CONSTRUCTOR_SIGNATURE_2;
                constructor = clsAsSubclass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                Intrinsics.checkNotNullExpressionValue(constructor, "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_2)");
                objArr = new Object[]{context, attrs};
            } catch (NoSuchMethodException unused) {
                Class<? extends Object>[] clsArr2 = CONSTRUCTOR_SIGNATURE_1;
                constructor = clsAsSubclass.getConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                Intrinsics.checkNotNullExpressionValue(constructor, "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_1)");
                objArr = new Context[]{context};
            }
            constructor.setAccessible(true);
            return (View) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e) {
            if (e instanceof ClassNotFoundException) {
                e.printStackTrace();
                return null;
            }
            if (e instanceof NoSuchMethodException) {
                e.printStackTrace();
                return null;
            }
            if (e instanceof IllegalAccessException) {
                e.printStackTrace();
                return null;
            }
            if (e instanceof InstantiationException) {
                e.printStackTrace();
                return null;
            }
            if (e instanceof InvocationTargetException) {
                e.printStackTrace();
                return null;
            }
            throw e;
        }
    }
}
