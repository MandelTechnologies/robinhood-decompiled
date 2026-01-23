package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* compiled from: Delegates.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/DistinctObservableProperty;", "V", "Lkotlin/properties/ObservableProperty;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "beforeChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes12.dex */
public class DistinctObservableProperty<V> extends ObservableProperty<V> {
    public DistinctObservableProperty(V v) {
        super(v);
    }

    @Override // kotlin.properties.ObservableProperty
    protected final boolean beforeChange(KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(property, "property");
        return !Intrinsics.areEqual(newValue, oldValue);
    }
}
