package androidx.compose.runtime.snapshots;

import androidx.collection.LongList2;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SnapshotId.jvm.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fJ\u000e\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;", "", ResourceTypes.ARRAY, "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "([J)V", "list", "Landroidx/collection/MutableLongList;", "add", "", "id", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "toArray", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SnapshotIdArrayBuilder {
    private final LongList2 list;

    public SnapshotIdArrayBuilder(long[] jArr) {
        LongList2 longList2;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            longList2 = new LongList2(jArrCopyOf.length);
            longList2.addAll(longList2._size, jArrCopyOf);
        } else {
            longList2 = new LongList2(0, 1, null);
        }
        this.list = longList2;
    }

    public final void add(long id) {
        this.list.add(id);
    }

    public final long[] toArray() {
        LongList2 longList2 = this.list;
        int i = longList2._size;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = longList2.content;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
