package com.robinhood.utils.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Sets.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m3636d2 = {"mutableEnumSetWhere", "Ljava/util/EnumSet;", "E", "", "predicate", "Lkotlin/Function1;", "", "enumSetWhere", "", "intersectedWith", "other", "asUnmodifiable", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.SetsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Sets2 {
    public static final /* synthetic */ <E extends Enum<E>> Set<E> enumSetWhere(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.reifiedOperationMarker(5, "E");
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) new ArrayList());
        Intrinsics.checkNotNullExpressionValue(enumSetCopyOf, "copyOf(...)");
        Set<E> setUnmodifiableSet = Collections.unmodifiableSet(enumSetCopyOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public static final /* synthetic */ <E extends Enum<E>> EnumSet<E> mutableEnumSetWhere(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.reifiedOperationMarker(5, "E");
        EnumSet<E> enumSetCopyOf = EnumSet.copyOf((Collection) new ArrayList());
        Intrinsics.checkNotNullExpressionValue(enumSetCopyOf, "copyOf(...)");
        return enumSetCopyOf;
    }

    public static final <E extends Enum<E>> EnumSet<E> intersectedWith(EnumSet<E> enumSet, Set<? extends E> other) {
        Intrinsics.checkNotNullParameter(enumSet, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        EnumSet<E> enumSetClone = enumSet.clone();
        enumSetClone.retainAll(other);
        Intrinsics.checkNotNullExpressionValue(enumSetClone, "apply(...)");
        return enumSetClone;
    }

    public static final <E> Set<E> asUnmodifiable(Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set<E> setUnmodifiableSet = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }
}
