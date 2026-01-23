package com.robinhood.android.common.p088ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BindViewDelegate.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001\u0011B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BindViewProperty;", "T", "V", "Lkotlin/properties/ReadOnlyProperty;", "initializer", "Lkotlin/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "clear", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "EMPTY", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.BindViewProperty, reason: use source file name */
/* loaded from: classes2.dex */
public final class BindViewDelegate3<T, V> implements Interfaces2<T, V> {
    public static final int $stable = 8;
    private final Function1<T, V> initializer;
    private Object value;

    /* compiled from: BindViewDelegate.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BindViewProperty$EMPTY;", "", "<init>", "()V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.ui.BindViewProperty$EMPTY */
    private static final class EMPTY {
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BindViewDelegate3(Function1<? super T, ? extends V> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this.value = EMPTY.INSTANCE;
    }

    public final void clear() {
        this.value = EMPTY.INSTANCE;
    }

    @Override // kotlin.properties.Interfaces2
    public V getValue(T thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.areEqual(this.value, EMPTY.INSTANCE)) {
            this.value = this.initializer.invoke(thisRef);
        }
        return (V) this.value;
    }
}
