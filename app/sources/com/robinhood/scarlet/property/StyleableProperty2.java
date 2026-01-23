package com.robinhood.scarlet.property;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty4;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* compiled from: StyleableProperty.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.property.StyleableProperty$Companion$from$1, reason: use source file name */
/* loaded from: classes21.dex */
/* synthetic */ class StyleableProperty2<T, V> extends FunctionReferenceImpl implements Function1<T, V> {
    StyleableProperty2(Object obj) {
        super(1, obj, KProperty4.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final V invoke(T p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((KProperty4) this.receiver).get(p0);
    }
}
