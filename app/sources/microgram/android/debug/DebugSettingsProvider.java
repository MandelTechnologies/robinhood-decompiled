package microgram.android.debug;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugSettingsProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/android/debug/DebugSettingsProvider;", "", "shouldApplicationBeStartedFromDebugger", "", "identifier", "", "None", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface DebugSettingsProvider {
    boolean shouldApplicationBeStartedFromDebugger(String identifier);

    /* compiled from: DebugSettingsProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/debug/DebugSettingsProvider$None;", "Lmicrogram/android/debug/DebugSettingsProvider;", "<init>", "()V", "shouldApplicationBeStartedFromDebugger", "", "identifier", "", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class None implements DebugSettingsProvider {
        public static final None INSTANCE = new None();

        @Override // microgram.android.debug.DebugSettingsProvider
        public boolean shouldApplicationBeStartedFromDebugger(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return false;
        }

        private None() {
        }
    }
}
