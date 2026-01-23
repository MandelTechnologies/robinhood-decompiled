package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HoldingsDrillDownViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/DisclosureBottomSheet;", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "sweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "<init>", "(Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;)V", "getDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getSweepEnrollmentData", "()Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DisclosureBottomSheet {
    public static final int $stable = 8;
    private final Disclosure disclosure;
    private final SweepEnrollmentData sweepEnrollmentData;

    public static /* synthetic */ DisclosureBottomSheet copy$default(DisclosureBottomSheet disclosureBottomSheet, Disclosure disclosure, SweepEnrollmentData sweepEnrollmentData, int i, Object obj) {
        if ((i & 1) != 0) {
            disclosure = disclosureBottomSheet.disclosure;
        }
        if ((i & 2) != 0) {
            sweepEnrollmentData = disclosureBottomSheet.sweepEnrollmentData;
        }
        return disclosureBottomSheet.copy(disclosure, sweepEnrollmentData);
    }

    /* renamed from: component1, reason: from getter */
    public final Disclosure getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component2, reason: from getter */
    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }

    public final DisclosureBottomSheet copy(Disclosure disclosure, SweepEnrollmentData sweepEnrollmentData) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(sweepEnrollmentData, "sweepEnrollmentData");
        return new DisclosureBottomSheet(disclosure, sweepEnrollmentData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureBottomSheet)) {
            return false;
        }
        DisclosureBottomSheet disclosureBottomSheet = (DisclosureBottomSheet) other;
        return Intrinsics.areEqual(this.disclosure, disclosureBottomSheet.disclosure) && Intrinsics.areEqual(this.sweepEnrollmentData, disclosureBottomSheet.sweepEnrollmentData);
    }

    public int hashCode() {
        return (this.disclosure.hashCode() * 31) + this.sweepEnrollmentData.hashCode();
    }

    public String toString() {
        return "DisclosureBottomSheet(disclosure=" + this.disclosure + ", sweepEnrollmentData=" + this.sweepEnrollmentData + ")";
    }

    public DisclosureBottomSheet(Disclosure disclosure, SweepEnrollmentData sweepEnrollmentData) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(sweepEnrollmentData, "sweepEnrollmentData");
        this.disclosure = disclosure;
        this.sweepEnrollmentData = sweepEnrollmentData;
    }

    public final Disclosure getDisclosure() {
        return this.disclosure;
    }

    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }
}
