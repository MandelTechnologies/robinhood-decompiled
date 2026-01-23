package com.robinhood.shared.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.workflow.p358ui.screens.EmailChallengeScreen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailChallengeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/EmailChallengeFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "workflowId", "Ljava/util/UUID;", "workflowScreen", "Lcom/robinhood/models/workflow/ui/screens/EmailChallengeScreen;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/workflow/ui/screens/EmailChallengeScreen;)V", "getWorkflowId", "()Ljava/util/UUID;", "getWorkflowScreen", "()Lcom/robinhood/models/workflow/ui/screens/EmailChallengeScreen;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmailChallengeFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<EmailChallengeFragmentKey> CREATOR = new Creator();
    private final UUID workflowId;
    private final EmailChallengeScreen workflowScreen;

    /* compiled from: EmailChallengeFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EmailChallengeFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailChallengeFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailChallengeFragmentKey((UUID) parcel.readSerializable(), (EmailChallengeScreen) parcel.readParcelable(EmailChallengeFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailChallengeFragmentKey[] newArray(int i) {
            return new EmailChallengeFragmentKey[i];
        }
    }

    public static /* synthetic */ EmailChallengeFragmentKey copy$default(EmailChallengeFragmentKey emailChallengeFragmentKey, UUID uuid, EmailChallengeScreen emailChallengeScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = emailChallengeFragmentKey.workflowId;
        }
        if ((i & 2) != 0) {
            emailChallengeScreen = emailChallengeFragmentKey.workflowScreen;
        }
        return emailChallengeFragmentKey.copy(uuid, emailChallengeScreen);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getWorkflowId() {
        return this.workflowId;
    }

    /* renamed from: component2, reason: from getter */
    public final EmailChallengeScreen getWorkflowScreen() {
        return this.workflowScreen;
    }

    public final EmailChallengeFragmentKey copy(UUID workflowId, EmailChallengeScreen workflowScreen) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowScreen, "workflowScreen");
        return new EmailChallengeFragmentKey(workflowId, workflowScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailChallengeFragmentKey)) {
            return false;
        }
        EmailChallengeFragmentKey emailChallengeFragmentKey = (EmailChallengeFragmentKey) other;
        return Intrinsics.areEqual(this.workflowId, emailChallengeFragmentKey.workflowId) && Intrinsics.areEqual(this.workflowScreen, emailChallengeFragmentKey.workflowScreen);
    }

    public int hashCode() {
        return (this.workflowId.hashCode() * 31) + this.workflowScreen.hashCode();
    }

    public String toString() {
        return "EmailChallengeFragmentKey(workflowId=" + this.workflowId + ", workflowScreen=" + this.workflowScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.workflowId);
        dest.writeParcelable(this.workflowScreen, flags);
    }

    public EmailChallengeFragmentKey(UUID workflowId, EmailChallengeScreen workflowScreen) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowScreen, "workflowScreen");
        this.workflowId = workflowId;
        this.workflowScreen = workflowScreen;
    }

    public final UUID getWorkflowId() {
        return this.workflowId;
    }

    public final EmailChallengeScreen getWorkflowScreen() {
        return this.workflowScreen;
    }
}
