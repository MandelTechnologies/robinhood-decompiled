package androidx.compose.runtime;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: SnapshotMutationPolicy.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Landroidx/compose/runtime/NeverEqualPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "()V", "equivalent", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "toString", "", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.runtime.NeverEqualPolicy, reason: use source file name */
/* loaded from: classes4.dex */
final class SnapshotMutationPolicy2 implements SnapshotMutationPolicy<Object> {
    public static final SnapshotMutationPolicy2 INSTANCE = new SnapshotMutationPolicy2();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object a, Object b) {
        return false;
    }

    private SnapshotMutationPolicy2() {
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
