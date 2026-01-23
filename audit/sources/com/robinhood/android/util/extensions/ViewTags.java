package com.robinhood.android.util.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: ViewTags.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0005\"\b\b\u0000\u0010\u0007*\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\tJ:\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0000\u0010\u0007*\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00070\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/util/extensions/ViewTags;", "", "<init>", "()V", "property", "Lkotlin/properties/ReadWriteProperty;", "Landroid/view/View;", "T", "key", "", "initializer", "Lkotlin/Function1;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ViewTags {
    public static final ViewTags INSTANCE = new ViewTags();

    private ViewTags() {
    }

    public final <T> Interfaces3<View, T> property(final int key) {
        return new Interfaces3<View, T>() { // from class: com.robinhood.android.util.extensions.ViewTags.property.1
            @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((View) obj, (KProperty<?>) kProperty);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.properties.Interfaces3
            public /* bridge */ /* synthetic */ void setValue(View view, KProperty kProperty, Object obj) {
                setValue2(view, (KProperty<?>) kProperty, (KProperty) obj);
            }

            public T getValue(View thisRef, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(property, "property");
                return (T) thisRef.getTag(key);
            }

            /* renamed from: setValue, reason: avoid collision after fix types in other method */
            public void setValue2(View thisRef, KProperty<?> property, T value) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(property, "property");
                thisRef.setTag(key, value);
            }
        };
    }

    public final <T> Interfaces3<View, T> property(final int key, final Function1<? super View, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new Interfaces3<View, T>() { // from class: com.robinhood.android.util.extensions.ViewTags.property.2
            @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
            public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                return getValue((View) obj, (KProperty<?>) kProperty);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.properties.Interfaces3
            public /* bridge */ /* synthetic */ void setValue(View view, KProperty kProperty, Object obj) {
                setValue2(view, (KProperty<?>) kProperty, (KProperty) obj);
            }

            public T getValue(View thisRef, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(property, "property");
                T t = (T) thisRef.getTag(key);
                if (t != null) {
                    return t;
                }
                T tInvoke = initializer.invoke(thisRef);
                thisRef.setTag(key, tInvoke);
                return tInvoke;
            }

            /* renamed from: setValue, reason: avoid collision after fix types in other method */
            public void setValue2(View thisRef, KProperty<?> property, T value) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(property, "property");
                Intrinsics.checkNotNullParameter(value, "value");
                thisRef.setTag(key, value);
            }
        };
    }
}
