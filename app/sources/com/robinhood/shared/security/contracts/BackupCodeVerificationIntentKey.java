package com.robinhood.shared.security.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupCodeVerificationIntentKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/BackupCodeVerificationIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "input", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "<init>", "(Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;)V", "getInput", "()Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class BackupCodeVerificationIntentKey implements IntentKey {
    private final BackupCodeVerificationInput input;

    public static /* synthetic */ BackupCodeVerificationIntentKey copy$default(BackupCodeVerificationIntentKey backupCodeVerificationIntentKey, BackupCodeVerificationInput backupCodeVerificationInput, int i, Object obj) {
        if ((i & 1) != 0) {
            backupCodeVerificationInput = backupCodeVerificationIntentKey.input;
        }
        return backupCodeVerificationIntentKey.copy(backupCodeVerificationInput);
    }

    /* renamed from: component1, reason: from getter */
    public final BackupCodeVerificationInput getInput() {
        return this.input;
    }

    public final BackupCodeVerificationIntentKey copy(BackupCodeVerificationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new BackupCodeVerificationIntentKey(input);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BackupCodeVerificationIntentKey) && Intrinsics.areEqual(this.input, ((BackupCodeVerificationIntentKey) other).input);
    }

    public int hashCode() {
        return this.input.hashCode();
    }

    public String toString() {
        return "BackupCodeVerificationIntentKey(input=" + this.input + ")";
    }

    public BackupCodeVerificationIntentKey(BackupCodeVerificationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.input = input;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final BackupCodeVerificationInput getInput() {
        return this.input;
    }
}
