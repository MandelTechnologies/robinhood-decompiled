package io.ktor.util;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Attributes.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002*J\b\u0007\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\b\u0012\u0004\u0012\u0002H\u00050\u00062\b\u0012\u0004\u0012\u0002H\u00050\u0006B*\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u001c\b\n\u0012\u0018\b\u000bB\u0014\b\u000b\u0012\u0006\b\f\u0012\u0002\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e¨\u0006\u000f"}, m3636d2 = {"putAll", "", "Lio/ktor/util/Attributes;", "other", "EquatableAttributeKey", "T", "Lio/ktor/util/AttributeKey;", "Lkotlin/Deprecated;", "message", "Please use `AttributeKey` class instead", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "AttributeKey", "ktor-utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.util.AttributesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Attributes3 {
    public static final void putAll(Attributes attributes, Attributes other) {
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<T> it = other.getAllKeys().iterator();
        while (it.hasNext()) {
            Attributes2 attributes2 = (Attributes2) it.next();
            Intrinsics.checkNotNull(attributes2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            attributes.put(attributes2, other.get(attributes2));
        }
    }
}
