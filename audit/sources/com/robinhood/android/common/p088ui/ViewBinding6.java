package com.robinhood.android.common.p088ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ViewBinding.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0096\u0002¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ViewBindingProperty;", "T", "", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/view/View;", "factory", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/view/View;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.ui.ViewBindingProperty, reason: use source file name */
/* loaded from: classes2.dex */
public final class ViewBinding6<T> implements Interfaces2<View, T> {
    public static final int $stable = 8;
    private T binding;
    private final Function1<View, T> factory;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewBinding6(Function1<? super View, ? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
    }

    @Override // kotlin.properties.Interfaces2
    public /* bridge */ /* synthetic */ Object getValue(View view, KProperty kProperty) {
        return getValue2(view, (KProperty<?>) kProperty);
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public T getValue2(View thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t = this.binding;
        if (t != null) {
            return t;
        }
        T tInvoke = this.factory.invoke(thisRef);
        this.binding = tInvoke;
        return tInvoke;
    }
}
