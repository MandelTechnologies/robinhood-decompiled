package com.twilio.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpirableValue.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m3636d2 = {"expirableValue", "Lkotlin/properties/ReadWriteProperty;", "", "T", "Lkotlin/properties/Delegates;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ttl", "Lkotlin/time/Duration;", "expirableValue-SxA4cEA", "(Lkotlin/properties/Delegates;Lkotlinx/coroutines/CoroutineScope;J)Lkotlin/properties/ReadWriteProperty;", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.ExpirableValueKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ExpirableValue {
    /* renamed from: expirableValue-SxA4cEA, reason: not valid java name */
    public static final <T> Interfaces3<Object, T> m27239expirableValueSxA4cEA(Delegates expirableValue, CoroutineScope scope, long j) {
        Intrinsics.checkNotNullParameter(expirableValue, "$this$expirableValue");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new ExpirableValue2(scope, j);
    }
}
