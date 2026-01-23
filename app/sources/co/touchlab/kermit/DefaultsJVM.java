package co.touchlab.kermit;

import kotlin.Metadata;

/* compiled from: DefaultsJVM.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"", "lock", "Ljava/lang/Object;", "", "internalDefaultTag", "Ljava/lang/String;", "value", "getDefaultTag", "()Ljava/lang/String;", "setDefaultTag", "(Ljava/lang/String;)V", "defaultTag", "kermit_debug"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: co.touchlab.kermit.DefaultsJVMKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class DefaultsJVM {
    private static volatile String internalDefaultTag = "";
    private static final Object lock = new Object();

    public static final String getDefaultTag() {
        return internalDefaultTag;
    }
}
