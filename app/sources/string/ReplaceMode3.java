package string;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReplaceMode.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lstring/FewReplace;", "Lstring/ReplaceMode;", "Lstring/ReplaceData;", "replaceData", "", "times", "<init>", "(Lstring/ReplaceData;I)V", "", "invoke", "()Ljava/lang/String;", "Lstring/ReplaceData;", "getReplaceData", "()Lstring/ReplaceData;", "I", "getTimes", "()I", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: string.FewReplace, reason: use source file name */
/* loaded from: classes28.dex */
final class ReplaceMode3 extends ReplaceMode {
    private final ReplaceData replaceData;
    private final int times;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplaceMode3(ReplaceData replaceData, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(replaceData, "replaceData");
        this.replaceData = replaceData;
        this.times = i;
    }

    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ReplaceMode5.replace(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), this.times);
    }
}
