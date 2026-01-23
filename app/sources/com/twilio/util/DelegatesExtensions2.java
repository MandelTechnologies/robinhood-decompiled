package com.twilio.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;

/* compiled from: DelegatesExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"atomicNotNull", "Lkotlin/properties/ReadWriteProperty;", "", "T", "Lkotlin/properties/Delegates;", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.DelegatesExtensionsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DelegatesExtensions2 {
    public static final <T> Interfaces3<Object, T> atomicNotNull(Delegates delegates) {
        Intrinsics.checkNotNullParameter(delegates, "<this>");
        return new DelegatesExtensions();
    }
}
