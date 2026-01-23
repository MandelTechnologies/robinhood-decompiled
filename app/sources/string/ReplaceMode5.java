package string;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: ReplaceMode.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, m3636d2 = {"replace", "", "oldValue", "newValue", "times", "", "operations-stdlib"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: string.ReplaceModeKt, reason: use source file name */
/* loaded from: classes28.dex */
public final class ReplaceMode5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String replace(String str, String str2, String str3, int i) {
        return i > 0 ? replace(StringsKt.replaceFirst$default(str, str2, str3, false, 4, null), str2, str3, i - 1) : str;
    }
}
