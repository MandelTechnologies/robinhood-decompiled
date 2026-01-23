package androidx.room.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SchemaInfoUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Landroidx/room/util/ForeignKeyWithSequence;", "", "", "id", "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "compareTo", "(Landroidx/room/util/ForeignKeyWithSequence;)I", "I", "getId", "()I", "getSequence", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "getTo", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: androidx.room.util.ForeignKeyWithSequence, reason: use source file name */
/* loaded from: classes4.dex */
final class SchemaInfoUtil implements Comparable<SchemaInfoUtil> {
    private final String from;
    private final int id;
    private final int sequence;
    private final String to;

    public SchemaInfoUtil(int i, int i2, String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.id = i;
        this.sequence = i2;
        this.from = from;
        this.to = to;
    }

    public final int getId() {
        return this.id;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getTo() {
        return this.to;
    }

    @Override // java.lang.Comparable
    public int compareTo(SchemaInfoUtil other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.id - other.id;
        return i == 0 ? this.sequence - other.sequence : i;
    }
}
