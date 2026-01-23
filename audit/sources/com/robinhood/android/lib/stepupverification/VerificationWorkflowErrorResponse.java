package com.robinhood.android.lib.stepupverification;

import com.robinhood.android.lib.stepupverification.VerificationWorkflowGrpcErrorResponse;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationWorkflowErrorResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowErrorResponse;", "", "verificationWorkflow", "Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowErrorResponse$VerificationWorkflow;", "<init>", "(Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowErrorResponse$VerificationWorkflow;)V", "getVerificationWorkflow", "()Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowErrorResponse$VerificationWorkflow;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "VerificationWorkflow", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VerificationWorkflowErrorResponse {
    public static final int $stable = 8;
    private final VerificationWorkflow verificationWorkflow;

    public static /* synthetic */ VerificationWorkflowErrorResponse copy$default(VerificationWorkflowErrorResponse verificationWorkflowErrorResponse, VerificationWorkflow verificationWorkflow, int i, Object obj) {
        if ((i & 1) != 0) {
            verificationWorkflow = verificationWorkflowErrorResponse.verificationWorkflow;
        }
        return verificationWorkflowErrorResponse.copy(verificationWorkflow);
    }

    /* renamed from: component1, reason: from getter */
    public final VerificationWorkflow getVerificationWorkflow() {
        return this.verificationWorkflow;
    }

    public final VerificationWorkflowErrorResponse copy(@Json(name = "verification_workflow") VerificationWorkflow verificationWorkflow) {
        Intrinsics.checkNotNullParameter(verificationWorkflow, "verificationWorkflow");
        return new VerificationWorkflowErrorResponse(verificationWorkflow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VerificationWorkflowErrorResponse) && Intrinsics.areEqual(this.verificationWorkflow, ((VerificationWorkflowErrorResponse) other).verificationWorkflow);
    }

    public int hashCode() {
        return this.verificationWorkflow.hashCode();
    }

    public String toString() {
        return "VerificationWorkflowErrorResponse(verificationWorkflow=" + this.verificationWorkflow + ")";
    }

    public VerificationWorkflowErrorResponse(@Json(name = "verification_workflow") VerificationWorkflow verificationWorkflow) {
        Intrinsics.checkNotNullParameter(verificationWorkflow, "verificationWorkflow");
        this.verificationWorkflow = verificationWorkflow;
    }

    public final VerificationWorkflow getVerificationWorkflow() {
        return this.verificationWorkflow;
    }

    /* compiled from: VerificationWorkflowErrorResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowErrorResponse$VerificationWorkflow;", "Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowGrpcErrorResponse$Details;", "id", "Ljava/util/UUID;", "workflowStatus", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;)V", "getId", "()Ljava/util/UUID;", "getWorkflowStatus", "()Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationWorkflow extends VerificationWorkflowGrpcErrorResponse.Details {
        public static final int $stable = 8;
        private final UUID id;
        private final VerificationWorkflowResult workflowStatus;

        public static /* synthetic */ VerificationWorkflow copy$default(VerificationWorkflow verificationWorkflow, UUID uuid, VerificationWorkflowResult verificationWorkflowResult, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verificationWorkflow.id;
            }
            if ((i & 2) != 0) {
                verificationWorkflowResult = verificationWorkflow.workflowStatus;
            }
            return verificationWorkflow.copy(uuid, verificationWorkflowResult);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final VerificationWorkflowResult getWorkflowStatus() {
            return this.workflowStatus;
        }

        public final VerificationWorkflow copy(@Json(name = "id") UUID id, @Json(name = "workflow_status") VerificationWorkflowResult workflowStatus) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(workflowStatus, "workflowStatus");
            return new VerificationWorkflow(id, workflowStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationWorkflow)) {
                return false;
            }
            VerificationWorkflow verificationWorkflow = (VerificationWorkflow) other;
            return Intrinsics.areEqual(this.id, verificationWorkflow.id) && this.workflowStatus == verificationWorkflow.workflowStatus;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.workflowStatus.hashCode();
        }

        public String toString() {
            return "VerificationWorkflow(id=" + this.id + ", workflowStatus=" + this.workflowStatus + ")";
        }

        public final UUID getId() {
            return this.id;
        }

        public final VerificationWorkflowResult getWorkflowStatus() {
            return this.workflowStatus;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationWorkflow(@Json(name = "id") UUID id, @Json(name = "workflow_status") VerificationWorkflowResult workflowStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(workflowStatus, "workflowStatus");
            this.id = id;
            this.workflowStatus = workflowStatus;
        }
    }
}
