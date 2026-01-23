package string;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReplaceMode.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lstring/AllReplace;", "Lstring/ReplaceMode;", "replaceData", "Lstring/ReplaceData;", "(Lstring/ReplaceData;)V", "getReplaceData", "()Lstring/ReplaceData;", "invoke", "", "Companion", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: string.AllReplace, reason: use source file name */
/* loaded from: classes28.dex */
final class ReplaceMode2 extends ReplaceMode {
    private final ReplaceData replaceData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplaceMode2(ReplaceData replaceData) {
        super(null);
        Intrinsics.checkNotNullParameter(replaceData, "replaceData");
        this.replaceData = replaceData;
    }

    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return StringsKt.replace$default(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), false, 4, (Object) null);
    }
}
