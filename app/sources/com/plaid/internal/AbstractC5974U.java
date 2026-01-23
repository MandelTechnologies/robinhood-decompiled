package com.plaid.internal;

import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* renamed from: com.plaid.internal.U */
/* loaded from: classes16.dex */
public abstract class AbstractC5974U<T> {

    /* renamed from: a */
    public final String f1733a;

    /* renamed from: com.plaid.internal.U$a */
    public static final class a extends AbstractC5974U<C5826D6> {

        /* renamed from: b */
        public static final a f1734b = new a();

        public a() {
            super(Reflection.getOrCreateKotlinClass(C5826D6.class));
        }
    }

    public AbstractC5974U(KClass kClass) {
        String simpleName = JvmClassMapping.getJavaClass(kClass).getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.f1733a = simpleName;
    }
}
