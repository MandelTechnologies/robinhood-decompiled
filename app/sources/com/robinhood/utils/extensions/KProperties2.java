package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;
import kotlin.reflect.KProperty4;
import kotlin.reflect.KProperty6;
import kotlin.reflect.KProperty7;

/* compiled from: KProperties.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a<\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u0002H\u0001H\u0086\u0002¢\u0006\u0002\u0010\f\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00010\u000e2\u0006\u0010\u0003\u001a\u0002H\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0086\u0002¢\u0006\u0002\u0010\u000f\u001aF\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0003\u001a\u0002H\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u0002H\u0001H\u0086\u0002¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"getValue", "R", "Lkotlin/reflect/KProperty0;", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Lkotlin/reflect/KProperty0;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "Lkotlin/reflect/KMutableProperty0;", "value", "(Lkotlin/reflect/KMutableProperty0;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "T", "Lkotlin/reflect/KProperty1;", "(Lkotlin/reflect/KProperty1;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "Lkotlin/reflect/KMutableProperty1;", "(Lkotlin/reflect/KMutableProperty1;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.KPropertiesKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class KProperties2 {
    public static final <R> R getValue(KProperty6<? extends R> kProperty6, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(kProperty6, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return kProperty6.get();
    }

    public static final <R> void setValue(KProperty3<R> kProperty3, Object obj, KProperty<?> property, R r) {
        Intrinsics.checkNotNullParameter(kProperty3, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        kProperty3.set(r);
    }

    public static final <T, R> R getValue(KProperty7<T, ? extends R> kProperty7, T t, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(kProperty7, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return kProperty7.get(t);
    }

    public static final <T, R> void setValue(KProperty4<T, R> kProperty4, T t, KProperty<?> property, R r) {
        Intrinsics.checkNotNullParameter(kProperty4, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        kProperty4.set(t, r);
    }
}
