package com.robinhood.android.crypto.settings;

import kotlin.Metadata;

/* compiled from: CryptoSettingsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/AllowlistSheetState;", "", "isEnabling", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AllowlistSheetState {
    public static final int $stable = 0;
    private final boolean isEnabling;

    public static /* synthetic */ AllowlistSheetState copy$default(AllowlistSheetState allowlistSheetState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = allowlistSheetState.isEnabling;
        }
        return allowlistSheetState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabling() {
        return this.isEnabling;
    }

    public final AllowlistSheetState copy(boolean isEnabling) {
        return new AllowlistSheetState(isEnabling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AllowlistSheetState) && this.isEnabling == ((AllowlistSheetState) other).isEnabling;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabling);
    }

    public String toString() {
        return "AllowlistSheetState(isEnabling=" + this.isEnabling + ")";
    }

    public AllowlistSheetState(boolean z) {
        this.isEnabling = z;
    }

    public final boolean isEnabling() {
        return this.isEnabling;
    }
}
