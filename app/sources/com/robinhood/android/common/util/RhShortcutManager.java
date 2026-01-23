package com.robinhood.android.common.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhShortcutManager.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/util/RhShortcutManager;", "", "initialize", "", "reportUse", "shortcut", "Lcom/robinhood/android/common/util/RhShortcut;", "Noop", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface RhShortcutManager {
    void initialize();

    void reportUse(RhShortcut shortcut);

    /* compiled from: RhShortcutManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/util/RhShortcutManager$Noop;", "Lcom/robinhood/android/common/util/RhShortcutManager;", "<init>", "()V", "initialize", "", "reportUse", "shortcut", "Lcom/robinhood/android/common/util/RhShortcut;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Noop implements RhShortcutManager {
        public static final int $stable = 0;
        public static final Noop INSTANCE = new Noop();

        @Override // com.robinhood.android.common.util.RhShortcutManager
        public void initialize() {
        }

        @Override // com.robinhood.android.common.util.RhShortcutManager
        public void reportUse(RhShortcut shortcut) {
            Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        }

        private Noop() {
        }
    }
}
