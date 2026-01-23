package kotlinx.datetime.internal;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: mathJvm.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "safeMultiply", "(JJ)J", "", "(II)I", "safeAdd", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.MathJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class mathJvm {
    public static final long safeMultiply(long j, long j2) {
        return Math.multiplyExact(j, j2);
    }

    public static final int safeMultiply(int i, int i2) {
        return Math.multiplyExact(i, i2);
    }

    public static final long safeAdd(long j, long j2) {
        return Math.addExact(j, j2);
    }
}
