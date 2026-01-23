package com.robinhood.android.security.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetLockscreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/SetLockscreen;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "launchMode", "Lcom/robinhood/android/security/contracts/SetLockscreen$LockscreenLaunchMode;", "<init>", "(Lcom/robinhood/android/security/contracts/SetLockscreen$LockscreenLaunchMode;)V", "getLaunchMode", "()Lcom/robinhood/android/security/contracts/SetLockscreen$LockscreenLaunchMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "LockscreenLaunchMode", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SetLockscreen implements IntentKey {
    private final LockscreenLaunchMode launchMode;

    public static /* synthetic */ SetLockscreen copy$default(SetLockscreen setLockscreen, LockscreenLaunchMode lockscreenLaunchMode, int i, Object obj) {
        if ((i & 1) != 0) {
            lockscreenLaunchMode = setLockscreen.launchMode;
        }
        return setLockscreen.copy(lockscreenLaunchMode);
    }

    /* renamed from: component1, reason: from getter */
    public final LockscreenLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final SetLockscreen copy(LockscreenLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new SetLockscreen(launchMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetLockscreen) && this.launchMode == ((SetLockscreen) other).launchMode;
    }

    public int hashCode() {
        return this.launchMode.hashCode();
    }

    public String toString() {
        return "SetLockscreen(launchMode=" + this.launchMode + ")";
    }

    public SetLockscreen(LockscreenLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.launchMode = launchMode;
    }

    public final LockscreenLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetLockscreen.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/SetLockscreen$LockscreenLaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCH_BIOMETRICS", "LAUNCH_PIN", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class LockscreenLaunchMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LockscreenLaunchMode[] $VALUES;
        public static final LockscreenLaunchMode LAUNCH_BIOMETRICS = new LockscreenLaunchMode("LAUNCH_BIOMETRICS", 0);
        public static final LockscreenLaunchMode LAUNCH_PIN = new LockscreenLaunchMode("LAUNCH_PIN", 1);

        private static final /* synthetic */ LockscreenLaunchMode[] $values() {
            return new LockscreenLaunchMode[]{LAUNCH_BIOMETRICS, LAUNCH_PIN};
        }

        public static EnumEntries<LockscreenLaunchMode> getEntries() {
            return $ENTRIES;
        }

        private LockscreenLaunchMode(String str, int i) {
        }

        static {
            LockscreenLaunchMode[] lockscreenLaunchModeArr$values = $values();
            $VALUES = lockscreenLaunchModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(lockscreenLaunchModeArr$values);
        }

        public static LockscreenLaunchMode valueOf(String str) {
            return (LockscreenLaunchMode) Enum.valueOf(LockscreenLaunchMode.class, str);
        }

        public static LockscreenLaunchMode[] values() {
            return (LockscreenLaunchMode[]) $VALUES.clone();
        }
    }
}
