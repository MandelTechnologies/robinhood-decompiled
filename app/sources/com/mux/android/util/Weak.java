package com.mux.android.util;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: Weak.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/mux/android/util/Weak;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "referent", "<init>", "(Ljava/lang/Object;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/ref/WeakReference;", "weakT", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "onSet", "Lkotlin/jvm/functions/Function1;", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
final class Weak<T> implements Interfaces3<Object, T> {
    private Function1<? super T, Unit> onSet;
    private WeakReference<T> weakT;

    public Weak(T t) {
        this.weakT = new WeakReference<>(t);
    }

    @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
    public T getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.weakT.get();
    }

    @Override // kotlin.properties.Interfaces3
    public void setValue(Object thisRef, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Function1<? super T, Unit> function1 = this.onSet;
        if (function1 != null) {
            function1.invoke(value);
        }
        this.weakT = new WeakReference<>(value);
    }
}
