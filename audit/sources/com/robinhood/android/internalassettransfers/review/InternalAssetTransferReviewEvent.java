package com.robinhood.android.internalassettransfers.review;

import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferReviewEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;", "", "NavigateToConfirmationScreen", "NavigateToCustomSelectionScreen", "VerificationWorkflow", "NavigateToPreSubmissionWarnsScreen", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$NavigateToConfirmationScreen;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$NavigateToCustomSelectionScreen;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$NavigateToPreSubmissionWarnsScreen;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$VerificationWorkflow;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferReviewEvent {

    /* compiled from: InternalAssetTransferReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$NavigateToConfirmationScreen;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;", "assetTransferUuid", "", "<init>", "(Ljava/lang/String;)V", "getAssetTransferUuid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToConfirmationScreen implements InternalAssetTransferReviewEvent {
        public static final int $stable = 0;
        private final String assetTransferUuid;

        public static /* synthetic */ NavigateToConfirmationScreen copy$default(NavigateToConfirmationScreen navigateToConfirmationScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToConfirmationScreen.assetTransferUuid;
            }
            return navigateToConfirmationScreen.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetTransferUuid() {
            return this.assetTransferUuid;
        }

        public final NavigateToConfirmationScreen copy(String assetTransferUuid) {
            Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
            return new NavigateToConfirmationScreen(assetTransferUuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToConfirmationScreen) && Intrinsics.areEqual(this.assetTransferUuid, ((NavigateToConfirmationScreen) other).assetTransferUuid);
        }

        public int hashCode() {
            return this.assetTransferUuid.hashCode();
        }

        public String toString() {
            return "NavigateToConfirmationScreen(assetTransferUuid=" + this.assetTransferUuid + ")";
        }

        public NavigateToConfirmationScreen(String assetTransferUuid) {
            Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
            this.assetTransferUuid = assetTransferUuid;
        }

        public final String getAssetTransferUuid() {
            return this.assetTransferUuid;
        }
    }

    /* compiled from: InternalAssetTransferReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$NavigateToCustomSelectionScreen;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCustomSelectionScreen implements InternalAssetTransferReviewEvent {
        public static final int $stable = 0;
        public static final NavigateToCustomSelectionScreen INSTANCE = new NavigateToCustomSelectionScreen();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToCustomSelectionScreen);
        }

        public int hashCode() {
            return 1723622466;
        }

        public String toString() {
            return "NavigateToCustomSelectionScreen";
        }

        private NavigateToCustomSelectionScreen() {
        }
    }

    /* compiled from: InternalAssetTransferReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$VerificationWorkflow;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationWorkflow implements InternalAssetTransferReviewEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ VerificationWorkflow copy$default(VerificationWorkflow verificationWorkflow, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = verificationWorkflow.workflowId;
            }
            if ((i & 2) != 0) {
                z = verificationWorkflow.isMigrated;
            }
            return verificationWorkflow.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final VerificationWorkflow copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new VerificationWorkflow(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationWorkflow)) {
                return false;
            }
            VerificationWorkflow verificationWorkflow = (VerificationWorkflow) other;
            return Intrinsics.areEqual(this.workflowId, verificationWorkflow.workflowId) && this.isMigrated == verificationWorkflow.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "VerificationWorkflow(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public VerificationWorkflow(UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }

    /* compiled from: InternalAssetTransferReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent$NavigateToPreSubmissionWarnsScreen;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;", "alerts", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "<init>", "(Ljava/util/List;)V", "getAlerts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToPreSubmissionWarnsScreen implements InternalAssetTransferReviewEvent {
        public static final int $stable = 8;
        private final List<PresubmissionChecksAlertSheet> alerts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NavigateToPreSubmissionWarnsScreen copy$default(NavigateToPreSubmissionWarnsScreen navigateToPreSubmissionWarnsScreen, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = navigateToPreSubmissionWarnsScreen.alerts;
            }
            return navigateToPreSubmissionWarnsScreen.copy(list);
        }

        public final List<PresubmissionChecksAlertSheet> component1() {
            return this.alerts;
        }

        public final NavigateToPreSubmissionWarnsScreen copy(List<PresubmissionChecksAlertSheet> alerts) {
            Intrinsics.checkNotNullParameter(alerts, "alerts");
            return new NavigateToPreSubmissionWarnsScreen(alerts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToPreSubmissionWarnsScreen) && Intrinsics.areEqual(this.alerts, ((NavigateToPreSubmissionWarnsScreen) other).alerts);
        }

        public int hashCode() {
            return this.alerts.hashCode();
        }

        public String toString() {
            return "NavigateToPreSubmissionWarnsScreen(alerts=" + this.alerts + ")";
        }

        public NavigateToPreSubmissionWarnsScreen(List<PresubmissionChecksAlertSheet> alerts) {
            Intrinsics.checkNotNullParameter(alerts, "alerts");
            this.alerts = alerts;
        }

        public final List<PresubmissionChecksAlertSheet> getAlerts() {
            return this.alerts;
        }
    }
}
