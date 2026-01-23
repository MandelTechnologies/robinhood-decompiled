package com.robinhood.android.pathfinder.corepages.reviewagreement;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/AgreementInfo;", "", "contentfulId", "", "agreementType", "agreementTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getAgreementType", "getAgreementTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AgreementInfo {
    public static final int $stable = 0;
    private final String agreementTitle;
    private final String agreementType;
    private final String contentfulId;

    public static /* synthetic */ AgreementInfo copy$default(AgreementInfo agreementInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementInfo.contentfulId;
        }
        if ((i & 2) != 0) {
            str2 = agreementInfo.agreementType;
        }
        if ((i & 4) != 0) {
            str3 = agreementInfo.agreementTitle;
        }
        return agreementInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementType() {
        return this.agreementType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementTitle() {
        return this.agreementTitle;
    }

    public final AgreementInfo copy(String contentfulId, String agreementType, String agreementTitle) {
        return new AgreementInfo(contentfulId, agreementType, agreementTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementInfo)) {
            return false;
        }
        AgreementInfo agreementInfo = (AgreementInfo) other;
        return Intrinsics.areEqual(this.contentfulId, agreementInfo.contentfulId) && Intrinsics.areEqual(this.agreementType, agreementInfo.agreementType) && Intrinsics.areEqual(this.agreementTitle, agreementInfo.agreementTitle);
    }

    public int hashCode() {
        String str = this.contentfulId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreementType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agreementTitle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AgreementInfo(contentfulId=" + this.contentfulId + ", agreementType=" + this.agreementType + ", agreementTitle=" + this.agreementTitle + ")";
    }

    public AgreementInfo(String str, String str2, String str3) {
        this.contentfulId = str;
        this.agreementType = str2;
        this.agreementTitle = str3;
    }

    public final String getAgreementTitle() {
        return this.agreementTitle;
    }

    public final String getAgreementType() {
        return this.agreementType;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }
}
