package androidx.compose.runtime.snapshots;

import androidx.collection.ScatterSet2;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver3;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Snapshot.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivate", "()V", "dispose", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", CryptoAccount.STATUS_DEACTIVATED, "Z", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function12, MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo6427nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() throws Throwable {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new SnapshotApplyResult.Failure(this);
        }
        ScatterSet2<StateObject> modified$runtime_release = getModified$runtime_release();
        long snapshotId = getSnapshotId();
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges = modified$runtime_release != null ? SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (modified$runtime_release == null || modified$runtime_release.get_size() == 0) {
                    nestedMutableSnapshot = this;
                    closeAndReleasePinning$runtime_release();
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime_release = nestedMutableSnapshot.innerApplyLocked$runtime_release(this.parent.getSnapshotId(), modified$runtime_release, mapOptimisticMerges, this.parent.getInvalid());
                    if (!Intrinsics.areEqual(snapshotApplyResultInnerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                        return snapshotApplyResultInnerApplyLocked$runtime_release;
                    }
                    ScatterSet2<StateObject> modified$runtime_release2 = nestedMutableSnapshot.parent.getModified$runtime_release();
                    if (modified$runtime_release2 != null) {
                        modified$runtime_release2.addAll(modified$runtime_release);
                    } else {
                        nestedMutableSnapshot.parent.setModified(modified$runtime_release);
                        setModified(null);
                    }
                }
                if (nestedMutableSnapshot.parent.getSnapshotId() < snapshotId) {
                    nestedMutableSnapshot.parent.advance$runtime_release();
                }
                MutableSnapshot mutableSnapshot = nestedMutableSnapshot.parent;
                mutableSnapshot.setInvalid$runtime_release(mutableSnapshot.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
                nestedMutableSnapshot.parent.recordPrevious$runtime_release(snapshotId);
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshot$runtime_release(takeoverPinnedSnapshot$runtime_release());
                nestedMutableSnapshot.parent.recordPreviousList$runtime_release(getPreviousIds());
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshots$runtime_release(getPreviousPinnedSnapshots());
                Unit unit = Unit.INSTANCE;
                setApplied$runtime_release(true);
                deactivate();
                SnapshotObserver3.dispatchObserverOnApplied(this, modified$runtime_release);
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo6428nestedDeactivated$runtime_release(this);
    }
}
