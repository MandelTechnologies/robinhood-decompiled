package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import android.net.Uri;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment2;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment3;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EnrollmentChecklistV2DataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J5\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010 \u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2DataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "enrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "kycSuvWorkflowId", "Ljava/util/UUID;", "kycSuvIsMigrated", "", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;Ljava/util/UUID;Z)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getEnrollment", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "getKycSuvWorkflowId", "()Ljava/util/UUID;", "getKycSuvIsMigrated", "()Z", "isVerifyYourIdentityEnabled", "verifyYourIdentityPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "getVerifyYourIdentityPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "verifyYourIdentitySecondaryText", "getVerifyYourIdentitySecondaryText", "verifyYourIdentityIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getVerifyYourIdentityIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "isTwoFactorEnabled", "twoFactorIcon", "getTwoFactorIcon", "twoFactorPrimaryText", "getTwoFactorPrimaryText", "twoFactorRowLoggingIdentifier", "", "getTwoFactorRowLoggingIdentifier", "()Ljava/lang/String;", "kycRowLoggingIdentifier", "getKycRowLoggingIdentifier", "kycDeeplink", "Landroid/net/Uri;", "getKycDeeplink", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class EnrollmentChecklistV2DataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final ApiCryptoTransferEnrollment enrollment;
    private final boolean kycSuvIsMigrated;
    private final UUID kycSuvWorkflowId;

    /* compiled from: EnrollmentChecklistV2DataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTransferEnrollment3.values().length];
            try {
                iArr[ApiCryptoTransferEnrollment3.PENDING_APPROVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferEnrollment3.NOT_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoTransferEnrollment3.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCryptoTransferEnrollment3.ADDITIONAL_INFORMATION_REQUESTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCryptoTransferEnrollment3.REJECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiCryptoTransferEnrollment3.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiCryptoTransferEnrollment3.APPROVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnrollmentChecklistV2DataState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ EnrollmentChecklistV2DataState copy$default(EnrollmentChecklistV2DataState enrollmentChecklistV2DataState, AppType appType, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = enrollmentChecklistV2DataState.appType;
        }
        if ((i & 2) != 0) {
            apiCryptoTransferEnrollment = enrollmentChecklistV2DataState.enrollment;
        }
        if ((i & 4) != 0) {
            uuid = enrollmentChecklistV2DataState.kycSuvWorkflowId;
        }
        if ((i & 8) != 0) {
            z = enrollmentChecklistV2DataState.kycSuvIsMigrated;
        }
        return enrollmentChecklistV2DataState.copy(appType, apiCryptoTransferEnrollment, uuid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiCryptoTransferEnrollment getEnrollment() {
        return this.enrollment;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getKycSuvWorkflowId() {
        return this.kycSuvWorkflowId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getKycSuvIsMigrated() {
        return this.kycSuvIsMigrated;
    }

    public final EnrollmentChecklistV2DataState copy(AppType appType, ApiCryptoTransferEnrollment enrollment, UUID kycSuvWorkflowId, boolean kycSuvIsMigrated) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new EnrollmentChecklistV2DataState(appType, enrollment, kycSuvWorkflowId, kycSuvIsMigrated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollmentChecklistV2DataState)) {
            return false;
        }
        EnrollmentChecklistV2DataState enrollmentChecklistV2DataState = (EnrollmentChecklistV2DataState) other;
        return this.appType == enrollmentChecklistV2DataState.appType && Intrinsics.areEqual(this.enrollment, enrollmentChecklistV2DataState.enrollment) && Intrinsics.areEqual(this.kycSuvWorkflowId, enrollmentChecklistV2DataState.kycSuvWorkflowId) && this.kycSuvIsMigrated == enrollmentChecklistV2DataState.kycSuvIsMigrated;
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        int iHashCode2 = (iHashCode + (apiCryptoTransferEnrollment == null ? 0 : apiCryptoTransferEnrollment.hashCode())) * 31;
        UUID uuid = this.kycSuvWorkflowId;
        return ((iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 31) + Boolean.hashCode(this.kycSuvIsMigrated);
    }

    public String toString() {
        return "EnrollmentChecklistV2DataState(appType=" + this.appType + ", enrollment=" + this.enrollment + ", kycSuvWorkflowId=" + this.kycSuvWorkflowId + ", kycSuvIsMigrated=" + this.kycSuvIsMigrated + ")";
    }

    public EnrollmentChecklistV2DataState(AppType appType, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, UUID uuid, boolean z) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.enrollment = apiCryptoTransferEnrollment;
        this.kycSuvWorkflowId = uuid;
        this.kycSuvIsMigrated = z;
    }

    public /* synthetic */ EnrollmentChecklistV2DataState(AppType appType, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AppType.TRADER : appType, (i & 2) != 0 ? null : apiCryptoTransferEnrollment, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? false : z);
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final ApiCryptoTransferEnrollment getEnrollment() {
        return this.enrollment;
    }

    public final UUID getKycSuvWorkflowId() {
        return this.kycSuvWorkflowId;
    }

    public final boolean getKycSuvIsMigrated() {
        return this.kycSuvIsMigrated;
    }

    public final boolean isVerifyYourIdentityEnabled() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        if ((apiCryptoTransferEnrollment != null ? apiCryptoTransferEnrollment.getEnrollment_state() : null) != ApiCryptoTransferEnrollment3.NOT_STARTED) {
            ApiCryptoTransferEnrollment apiCryptoTransferEnrollment2 = this.enrollment;
            if ((apiCryptoTransferEnrollment2 != null ? apiCryptoTransferEnrollment2.getEnrollment_state() : null) != ApiCryptoTransferEnrollment3.STARTED) {
                ApiCryptoTransferEnrollment apiCryptoTransferEnrollment3 = this.enrollment;
                if ((apiCryptoTransferEnrollment3 != null ? apiCryptoTransferEnrollment3.getEnrollment_state() : null) != ApiCryptoTransferEnrollment3.ADDITIONAL_INFORMATION_REQUESTED) {
                    return false;
                }
            }
        }
        return (this.enrollment.getSuv_workflow_id() == null && ApiCryptoTransferEnrollment2.getCompleted(this.enrollment.getKyc())) ? false : true;
    }

    public final StringResource getVerifyYourIdentityPrimaryText() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_checklist_verify_identity, new Object[0]);
    }

    public final StringResource getVerifyYourIdentitySecondaryText() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        ApiCryptoTransferEnrollment3 enrollment_state = apiCryptoTransferEnrollment != null ? apiCryptoTransferEnrollment.getEnrollment_state() : null;
        switch (enrollment_state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enrollment_state.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_checklist_verify_identity_in_progress, new Object[0]);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_checklist_two_factor_eta, new Object[0]);
            default:
                return null;
        }
    }

    public final ServerToBentoAssetMapper2 getVerifyYourIdentityIcon() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        ApiCryptoTransferEnrollment3 enrollment_state = apiCryptoTransferEnrollment != null ? apiCryptoTransferEnrollment.getEnrollment_state() : null;
        int i = enrollment_state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enrollment_state.ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.HOURGLASS_24;
        }
        if (i != 7) {
            return null;
        }
        return ServerToBentoAssetMapper2.CHECKMARK_24;
    }

    public final boolean isTwoFactorEnabled() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        if (apiCryptoTransferEnrollment == null) {
            return false;
        }
        return (apiCryptoTransferEnrollment.getEnrollment_state() == ApiCryptoTransferEnrollment3.PENDING_APPROVAL || this.enrollment.getEnrollment_state() == ApiCryptoTransferEnrollment3.APPROVED) && !ApiCryptoTransferEnrollment2.getCompletedServerside(this.enrollment.getMfa());
    }

    public final ServerToBentoAssetMapper2 getTwoFactorIcon() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        ApiCryptoTransferEnrollment3 enrollment_state = apiCryptoTransferEnrollment != null ? apiCryptoTransferEnrollment.getEnrollment_state() : null;
        int i = enrollment_state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enrollment_state.ordinal()];
        if (i == 1 || i == 7) {
            if (ApiCryptoTransferEnrollment2.isCompleted(this.enrollment.getMfa())) {
                return ServerToBentoAssetMapper2.CHECKMARK_24;
            }
            return null;
        }
        if (i == 3 || i == 4) {
            return ServerToBentoAssetMapper2.LOCK_24;
        }
        return null;
    }

    public final StringResource getTwoFactorPrimaryText() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_enrollment_checklist_email_and_phone, new Object[0]);
    }

    public final String getTwoFactorRowLoggingIdentifier() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        if (apiCryptoTransferEnrollment == null) {
            return null;
        }
        return ApiCryptoTransferEnrollment2.isCompleted(apiCryptoTransferEnrollment.getMfa()) ? "mfa_completed" : "mfa-incomplete";
    }

    public final String getKycRowLoggingIdentifier() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        if (apiCryptoTransferEnrollment == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[apiCryptoTransferEnrollment.getEnrollment_state().ordinal()]) {
            case 1:
                return "kyc-pending";
            case 2:
            case 3:
            case 4:
            case 5:
                return "kyc-incomplete";
            case 6:
            case 7:
                return "kyc-completed";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Uri getKycDeeplink() {
        ApiCryptoTransferEnrollment.Kyc kyc;
        String deep_link;
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        if (apiCryptoTransferEnrollment == null || (kyc = apiCryptoTransferEnrollment.getKyc()) == null || (deep_link = kyc.getDeep_link()) == null) {
            return null;
        }
        return Uri.parse(deep_link);
    }
}
