package com.robinhood.android.lib.stepupverification;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationWorkflow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/VerificationWorkflow;", "Landroid/os/Parcelable;", "workflowId", "Ljava/util/UUID;", "flow", "", "flowVersion", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getWorkflowId", "()Ljava/util/UUID;", "getFlow", "()Ljava/lang/String;", "getFlowVersion", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VerificationWorkflow implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VerificationWorkflow> CREATOR = new Creator();
    private final String flow;
    private final String flowVersion;
    private final UUID workflowId;

    /* compiled from: VerificationWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationWorkflow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationWorkflow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerificationWorkflow((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerificationWorkflow[] newArray(int i) {
            return new VerificationWorkflow[i];
        }
    }

    public static /* synthetic */ VerificationWorkflow copy$default(VerificationWorkflow verificationWorkflow, UUID uuid, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = verificationWorkflow.workflowId;
        }
        if ((i & 2) != 0) {
            str = verificationWorkflow.flow;
        }
        if ((i & 4) != 0) {
            str2 = verificationWorkflow.flowVersion;
        }
        return verificationWorkflow.copy(uuid, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getWorkflowId() {
        return this.workflowId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlowVersion() {
        return this.flowVersion;
    }

    public final VerificationWorkflow copy(UUID workflowId, String flow, String flowVersion) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new VerificationWorkflow(workflowId, flow, flowVersion);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationWorkflow)) {
            return false;
        }
        VerificationWorkflow verificationWorkflow = (VerificationWorkflow) other;
        return Intrinsics.areEqual(this.workflowId, verificationWorkflow.workflowId) && Intrinsics.areEqual(this.flow, verificationWorkflow.flow) && Intrinsics.areEqual(this.flowVersion, verificationWorkflow.flowVersion);
    }

    public int hashCode() {
        int iHashCode = ((this.workflowId.hashCode() * 31) + this.flow.hashCode()) * 31;
        String str = this.flowVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VerificationWorkflow(workflowId=" + this.workflowId + ", flow=" + this.flow + ", flowVersion=" + this.flowVersion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.workflowId);
        dest.writeString(this.flow);
        dest.writeString(this.flowVersion);
    }

    public VerificationWorkflow(UUID workflowId, String flow, String str) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.workflowId = workflowId;
        this.flow = flow;
        this.flowVersion = str;
    }

    public final UUID getWorkflowId() {
        return this.workflowId;
    }

    public /* synthetic */ VerificationWorkflow(UUID uuid, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? SuvConstants.DEFAULT_FLOW_ID : str, (i & 4) != 0 ? null : str2);
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getFlowVersion() {
        return this.flowVersion;
    }
}
