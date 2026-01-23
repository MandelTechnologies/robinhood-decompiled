package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapshotMutationPolicy.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002¨\u0006\u0005"}, m3636d2 = {"neverEqualPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "T", "referentialEqualityPolicy", "structuralEqualityPolicy", "runtime_release"}, m3637k = 5, m3638mv = {1, 9, 0}, m3640xi = 48, m3641xs = "androidx/compose/runtime/SnapshotStateKt")
/* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt, reason: use source file name */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotMutationPolicy4 {
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        SnapshotMutationPolicy3 snapshotMutationPolicy3 = SnapshotMutationPolicy3.INSTANCE;
        Intrinsics.checkNotNull(snapshotMutationPolicy3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return snapshotMutationPolicy3;
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        SnapshotMutationPolicy5 snapshotMutationPolicy5 = SnapshotMutationPolicy5.INSTANCE;
        Intrinsics.checkNotNull(snapshotMutationPolicy5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return snapshotMutationPolicy5;
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        SnapshotMutationPolicy2 snapshotMutationPolicy2 = SnapshotMutationPolicy2.INSTANCE;
        Intrinsics.checkNotNull(snapshotMutationPolicy2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return snapshotMutationPolicy2;
    }
}
