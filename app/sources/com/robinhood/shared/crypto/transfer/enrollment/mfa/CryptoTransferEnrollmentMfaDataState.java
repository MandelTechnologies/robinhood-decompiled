package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTransferEnrollmentMfaDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J)\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0014HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "enrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "isRefreshingEnrollment", "", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;Z)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getEnrollment", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "()Z", "isLoadingEnrollment", "isEnrollmentCompleted", "isEnrollmentCompleted$annotations", "()V", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "getTitleRes", "()I", "subtitleRes", "getSubtitleRes", "helperTextRes", "getHelperTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "mfaRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/MfaRow;", "getMfaRows", "()Lkotlinx/collections/immutable/ImmutableList;", "phoneRow", "getPhoneRow", "()Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/MfaRow;", "emailRow", "getEmailRow", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferEnrollmentMfaDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final ApiCryptoTransferEnrollment enrollment;
    private final Integer helperTextRes;
    private final boolean isLoadingEnrollment;
    private final boolean isRefreshingEnrollment;
    private final ImmutableList<MfaRow> mfaRows;

    /* compiled from: CryptoTransferEnrollmentMfaDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CryptoTransferEnrollmentMfaDataState copy$default(CryptoTransferEnrollmentMfaDataState cryptoTransferEnrollmentMfaDataState, AppType appType, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoTransferEnrollmentMfaDataState.appType;
        }
        if ((i & 2) != 0) {
            apiCryptoTransferEnrollment = cryptoTransferEnrollmentMfaDataState.enrollment;
        }
        if ((i & 4) != 0) {
            z = cryptoTransferEnrollmentMfaDataState.isRefreshingEnrollment;
        }
        return cryptoTransferEnrollmentMfaDataState.copy(appType, apiCryptoTransferEnrollment, z);
    }

    public static /* synthetic */ void isEnrollmentCompleted$annotations() {
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
    public final boolean getIsRefreshingEnrollment() {
        return this.isRefreshingEnrollment;
    }

    public final CryptoTransferEnrollmentMfaDataState copy(AppType appType, ApiCryptoTransferEnrollment enrollment, boolean isRefreshingEnrollment) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoTransferEnrollmentMfaDataState(appType, enrollment, isRefreshingEnrollment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferEnrollmentMfaDataState)) {
            return false;
        }
        CryptoTransferEnrollmentMfaDataState cryptoTransferEnrollmentMfaDataState = (CryptoTransferEnrollmentMfaDataState) other;
        return this.appType == cryptoTransferEnrollmentMfaDataState.appType && Intrinsics.areEqual(this.enrollment, cryptoTransferEnrollmentMfaDataState.enrollment) && this.isRefreshingEnrollment == cryptoTransferEnrollmentMfaDataState.isRefreshingEnrollment;
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        return ((iHashCode + (apiCryptoTransferEnrollment == null ? 0 : apiCryptoTransferEnrollment.hashCode())) * 31) + Boolean.hashCode(this.isRefreshingEnrollment);
    }

    public String toString() {
        return "CryptoTransferEnrollmentMfaDataState(appType=" + this.appType + ", enrollment=" + this.enrollment + ", isRefreshingEnrollment=" + this.isRefreshingEnrollment + ")";
    }

    public CryptoTransferEnrollmentMfaDataState(AppType appType, ApiCryptoTransferEnrollment apiCryptoTransferEnrollment, boolean z) {
        Integer numValueOf;
        int i;
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.enrollment = apiCryptoTransferEnrollment;
        this.isRefreshingEnrollment = z;
        boolean z2 = apiCryptoTransferEnrollment == null;
        this.isLoadingEnrollment = z2;
        if (z2) {
            numValueOf = null;
        } else if (isEnrollmentCompleted()) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_helper_done_rhc;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_helper_done;
                }
                numValueOf = Integer.valueOf(i);
            } else {
                throw new IllegalStateException("Unexpected app type");
            }
        } else {
            numValueOf = Integer.valueOf(C37934R.string.crypto_transfer_enrollment_mfa_checklist_helper);
        }
        this.helperTextRes = numValueOf;
        this.mfaRows = extensions2.persistentListOf(getPhoneRow(), getEmailRow());
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final ApiCryptoTransferEnrollment getEnrollment() {
        return this.enrollment;
    }

    public final boolean isRefreshingEnrollment() {
        return this.isRefreshingEnrollment;
    }

    public final boolean isEnrollmentCompleted() {
        ApiCryptoTransferEnrollment apiCryptoTransferEnrollment = this.enrollment;
        if (apiCryptoTransferEnrollment == null) {
            return false;
        }
        return ApiCryptoTransferEnrollment2.isCompleted(apiCryptoTransferEnrollment.getMfa());
    }

    public final int getTitleRes() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Unexpected app type");
        }
        if (i2 == 2) {
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_title_rhc;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_title;
        }
        return (!this.isLoadingEnrollment && isEnrollmentCompleted()) ? C37934R.string.crypto_transfer_enrollment_mfa_checklist_title_done : i;
    }

    public final int getSubtitleRes() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Unexpected app type");
        }
        if (i2 == 2) {
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_subtitle_rhc;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_subtitle;
        }
        return (!this.isLoadingEnrollment && isEnrollmentCompleted()) ? C37934R.string.crypto_transfer_enrollment_mfa_checklist_subtitle_done : i;
    }

    public final Integer getHelperTextRes() {
        return this.helperTextRes;
    }

    public final ImmutableList<MfaRow> getMfaRows() {
        return this.mfaRows;
    }

    private final MfaRow getPhoneRow() {
        int i;
        int i2;
        boolean zIsPhoneVerified = TrustMfas.isPhoneVerified(this.enrollment);
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i3 == 1) {
            throw new IllegalStateException("Unexpected app type");
        }
        if (i3 == 2) {
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_phone_row_primary_rhc;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_phone_row_primary;
        }
        if (TrustMfas.isPhoneVerified(this.enrollment)) {
            i2 = C37934R.string.f6205xa3690dde;
        } else {
            i2 = C37934R.string.crypto_transfer_enrollment_mfa_checklist_phone_row_secondary;
        }
        return new MfaRow(zIsPhoneVerified, i, i2);
    }

    private final MfaRow getEmailRow() {
        int i;
        int i2;
        boolean zIsEmailVerified = TrustMfas.isEmailVerified(this.enrollment);
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i3 == 1) {
            throw new IllegalStateException("Unexpected app type");
        }
        if (i3 == 2) {
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_email_row_primary_rhc;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C37934R.string.crypto_transfer_enrollment_mfa_checklist_email_row_primary;
        }
        if (TrustMfas.isEmailVerified(this.enrollment)) {
            i2 = C37934R.string.f6204x9e39ebf0;
        } else {
            i2 = C37934R.string.crypto_transfer_enrollment_mfa_checklist_email_row_secondary;
        }
        return new MfaRow(zIsEmailVerified, i, i2);
    }
}
