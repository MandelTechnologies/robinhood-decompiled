package com.twilio.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicFU4;

/* compiled from: DelegatesExtensions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J,\u0010\t\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012R/\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/twilio/util/AtomicNotNullVar;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "()V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Lkotlinx/atomicfu/AtomicRef;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.AtomicNotNullVar, reason: use source file name */
/* loaded from: classes11.dex */
final class DelegatesExtensions<T> implements Interfaces3<Object, T> {

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final AtomicFU4 value = AtomicFU.atomic((Object) null);

    private final T getValue() {
        return (T) this.value.getValue();
    }

    private final void setValue(T t) {
        this.value.setValue(t);
    }

    @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
    public T getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T value = getValue();
        if (value != null) {
            return value;
        }
        throw new IllegalStateException(("Property " + property.getName() + " should be initialized before get.").toString());
    }

    @Override // kotlin.properties.Interfaces3
    public void setValue(Object thisRef, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        setValue(value);
    }
}
