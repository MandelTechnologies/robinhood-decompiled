package string;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReplaceMode.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lstring/ReplaceData;", "", "", "replaceCandidate", "oldString", "newString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReplaceCandidate", "getOldString", "getNewString", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class ReplaceData {
    private final String newString;
    private final String oldString;
    private final String replaceCandidate;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplaceData)) {
            return false;
        }
        ReplaceData replaceData = (ReplaceData) other;
        return Intrinsics.areEqual(this.replaceCandidate, replaceData.replaceCandidate) && Intrinsics.areEqual(this.oldString, replaceData.oldString) && Intrinsics.areEqual(this.newString, replaceData.newString);
    }

    public int hashCode() {
        return (((this.replaceCandidate.hashCode() * 31) + this.oldString.hashCode()) * 31) + this.newString.hashCode();
    }

    public String toString() {
        return "ReplaceData(replaceCandidate=" + this.replaceCandidate + ", oldString=" + this.oldString + ", newString=" + this.newString + ")";
    }

    public ReplaceData(String replaceCandidate, String oldString, String newString) {
        Intrinsics.checkNotNullParameter(replaceCandidate, "replaceCandidate");
        Intrinsics.checkNotNullParameter(oldString, "oldString");
        Intrinsics.checkNotNullParameter(newString, "newString");
        this.replaceCandidate = replaceCandidate;
        this.oldString = oldString;
        this.newString = newString;
    }

    public final String getReplaceCandidate() {
        return this.replaceCandidate;
    }

    public final String getOldString() {
        return this.oldString;
    }

    public final String getNewString() {
        return this.newString;
    }
}
