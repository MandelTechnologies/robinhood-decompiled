package androidx.compose.runtime.snapshots;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Snapshot.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000eR&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006R$\u0010\u0013\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "()V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "J", "getSnapshotId$runtime_release", "()J", "setSnapshotId$runtime_release", "next", "Landroidx/compose/runtime/snapshots/StateRecord;", "getNext$runtime_release", "setNext$runtime_release", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class StateRecord {
    private StateRecord next;
    private long snapshotId;

    public abstract void assign(StateRecord value);

    public abstract StateRecord create();

    public StateRecord(long j) {
        this.snapshotId = j;
    }

    /* renamed from: getSnapshotId$runtime_release, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void setSnapshotId$runtime_release(long j) {
        this.snapshotId = j;
    }

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    /* renamed from: getNext$runtime_release, reason: from getter */
    public final StateRecord getNext() {
        return this.next;
    }

    public final void setNext$runtime_release(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public StateRecord create(long snapshotId) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = snapshotId;
        return stateRecordCreate;
    }
}
