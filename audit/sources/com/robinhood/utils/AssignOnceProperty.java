package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: Delegates.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\u00028\u0000X\u0082\u000e¢\u0006\n\n\u0002\u0010\b\u0012\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/utils/AssignOnceProperty;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "<init>", "()V", "value", "getValue$annotations", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Companion", "Impl", "SynchronizedImpl", "Lcom/robinhood/utils/AssignOnceProperty$Impl;", "Lcom/robinhood/utils/AssignOnceProperty$SynchronizedImpl;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
abstract class AssignOnceProperty<T> implements Interfaces3<Object, T> {
    private static final Object UNASSIGNED = new Object();
    private T value;

    public /* synthetic */ AssignOnceProperty(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static /* synthetic */ void getValue$annotations() {
    }

    private AssignOnceProperty() {
        this.value = (T) UNASSIGNED;
    }

    @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
    public T getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.areEqual(this.value, UNASSIGNED)) {
            throw new IllegalStateException(("Property has not been assigned: " + property).toString());
        }
        return this.value;
    }

    @Override // kotlin.properties.Interfaces3
    public void setValue(Object thisRef, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (!Intrinsics.areEqual(value, UNASSIGNED)) {
            throw new IllegalStateException(("Property has already been assigned: " + property).toString());
        }
        this.value = value;
    }

    /* compiled from: Delegates.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/utils/AssignOnceProperty$Impl;", "T", "Lcom/robinhood/utils/AssignOnceProperty;", "<init>", "()V", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Impl<T> extends AssignOnceProperty<T> {
        public Impl() {
            super(null);
        }
    }

    /* compiled from: Delegates.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0005\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/AssignOnceProperty$SynchronizedImpl;", "T", "Lcom/robinhood/utils/AssignOnceProperty;", "<init>", "()V", "getValue", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SynchronizedImpl<T> extends AssignOnceProperty<T> {
        public SynchronizedImpl() {
            super(null);
        }

        @Override // com.robinhood.utils.AssignOnceProperty, kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
        public synchronized T getValue(Object thisRef, KProperty<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return (T) super.getValue(thisRef, property);
        }

        @Override // com.robinhood.utils.AssignOnceProperty, kotlin.properties.Interfaces3
        public synchronized void setValue(Object thisRef, KProperty<?> property, T value) {
            Intrinsics.checkNotNullParameter(property, "property");
            super.setValue(thisRef, property, value);
        }
    }
}
