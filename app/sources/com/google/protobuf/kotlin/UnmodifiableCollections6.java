package com.google.protobuf.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: UnmodifiableCollections.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableSet;", "E", "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "delegate", "", "(Ljava/util/Collection;)V", "java_kotlin-shared_runtime"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: com.google.protobuf.kotlin.UnmodifiableSet, reason: use source file name */
/* loaded from: classes27.dex */
public final class UnmodifiableCollections6<E> extends UnmodifiableCollections<E> implements Set<E>, KMarkers {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableCollections6(Collection<? extends E> delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
