package com.robinhood.scarlet.property;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty4;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* compiled from: StyleableProperty.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.property.StyleableProperty$Companion$from$2, reason: use source file name */
/* loaded from: classes21.dex */
/* synthetic */ class StyleableProperty3<T, V> extends FunctionReferenceImpl implements Function2<T, V, Unit> {
    StyleableProperty3(Object obj) {
        super(2, obj, KProperty4.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
        invoke2((StyleableProperty3<T, V>) obj, obj2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T p0, V v) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((KProperty4) this.receiver).set(p0, v);
    }
}
