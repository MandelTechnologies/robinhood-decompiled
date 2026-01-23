package com.robinhood.utils.system;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloseGuard.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/system/NoopCloseGuard;", "Lcom/robinhood/utils/system/CloseGuard;", "<init>", "()V", "open", "", "closer", "", "warnIfOpen", "close", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.system.NoopCloseGuard, reason: use source file name */
/* loaded from: classes12.dex */
final class CloseGuard3 extends CloseGuard {
    public static final CloseGuard3 INSTANCE = new CloseGuard3();

    @Override // com.robinhood.utils.system.CloseGuard
    public void close() {
    }

    @Override // com.robinhood.utils.system.CloseGuard
    public void open(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
    }

    @Override // com.robinhood.utils.system.CloseGuard
    public void warnIfOpen() {
    }

    private CloseGuard3() {
        super(null);
    }
}
