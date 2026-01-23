package com.robinhood.android.common.p088ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BindResources.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B%\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eR$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/Lazy;", "T", "V", "Lkotlin/properties/ReadOnlyProperty;", "initializer", "Lkotlin/Function2;", "Lkotlin/reflect/KProperty;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "value", "Ljava/lang/Object;", "getValue", "thisRef", "property", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
class Lazy<T, V> implements Interfaces2<T, V> {
    private final Function2<T, KProperty<?>, V> initializer;
    private V value;

    /* JADX WARN: Multi-variable type inference failed */
    public Lazy(Function2<? super T, ? super KProperty<?>, ? extends V> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // kotlin.properties.Interfaces2
    public V getValue(T thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.value == null) {
            this.value = this.initializer.invoke(thisRef, property);
        }
        return this.value;
    }
}
