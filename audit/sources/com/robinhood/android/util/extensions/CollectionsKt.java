package com.robinhood.android.util.extensions;

import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: Collections.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003¨\u0006\u0004"}, m3636d2 = {"toPersistentListOrEmpty", "Lkotlinx/collections/immutable/PersistentList;", "T", "", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CollectionsKt {
    public static final <T> ImmutableList3<T> toPersistentListOrEmpty(Iterable<? extends T> iterable) {
        ImmutableList3<T> persistentList;
        return (iterable == null || (persistentList = extensions2.toPersistentList(iterable)) == null) ? extensions2.persistentListOf() : persistentList;
    }
}
