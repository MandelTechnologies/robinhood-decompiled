package com.robinhood.android.investmentstracker.viewmodels;

import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerDisclosureMarkdownViewModel.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0001H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerDisclosureMarkdownViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "id", "", "disclosureMarkdownText", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getId", "()Ljava/lang/String;", "getDisclosureMarkdownText", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerDisclosureMarkdownViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final String disclosureMarkdownText;
    private final String id;
    private final SecurityFilter securityFilter;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerDisclosureMarkdownViewModel copy$default(InvestmentsTrackerDisclosureMarkdownViewModel investmentsTrackerDisclosureMarkdownViewModel, InvestmentsTrackerComponentType investmentsTrackerComponentType, String str, String str2, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentType = investmentsTrackerDisclosureMarkdownViewModel.type;
        }
        if ((i & 2) != 0) {
            str = investmentsTrackerDisclosureMarkdownViewModel.id;
        }
        if ((i & 4) != 0) {
            str2 = investmentsTrackerDisclosureMarkdownViewModel.disclosureMarkdownText;
        }
        if ((i & 8) != 0) {
            securityFilter = investmentsTrackerDisclosureMarkdownViewModel.securityFilter;
        }
        return investmentsTrackerDisclosureMarkdownViewModel.copy(investmentsTrackerComponentType, str, str2, securityFilter);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclosureMarkdownText() {
        return this.disclosureMarkdownText;
    }

    /* renamed from: component4, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerDisclosureMarkdownViewModel copy(InvestmentsTrackerComponentType type2, String id, String disclosureMarkdownText, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(disclosureMarkdownText, "disclosureMarkdownText");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerDisclosureMarkdownViewModel(type2, id, disclosureMarkdownText, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerDisclosureMarkdownViewModel)) {
            return false;
        }
        InvestmentsTrackerDisclosureMarkdownViewModel investmentsTrackerDisclosureMarkdownViewModel = (InvestmentsTrackerDisclosureMarkdownViewModel) other;
        return this.type == investmentsTrackerDisclosureMarkdownViewModel.type && Intrinsics.areEqual(this.id, investmentsTrackerDisclosureMarkdownViewModel.id) && Intrinsics.areEqual(this.disclosureMarkdownText, investmentsTrackerDisclosureMarkdownViewModel.disclosureMarkdownText) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerDisclosureMarkdownViewModel.securityFilter);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.disclosureMarkdownText.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerDisclosureMarkdownViewModel(type=" + this.type + ", id=" + this.id + ", disclosureMarkdownText=" + this.disclosureMarkdownText + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerDisclosureMarkdownViewModel(InvestmentsTrackerComponentType type2, String id, String disclosureMarkdownText, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(disclosureMarkdownText, "disclosureMarkdownText");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.type = type2;
        this.id = id;
        this.disclosureMarkdownText = disclosureMarkdownText;
        this.securityFilter = securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public /* synthetic */ InvestmentsTrackerDisclosureMarkdownViewModel(InvestmentsTrackerComponentType investmentsTrackerComponentType, String str, String str2, SecurityFilter securityFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentsTrackerComponentType, (i & 2) != 0 ? "disclosure_markdown" : str, str2, securityFilter);
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public String getId() {
        return this.id;
    }

    public final String getDisclosureMarkdownText() {
        return this.disclosureMarkdownText;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponent copyForView() {
        return copy$default(this, null, null, null, null, 15, null);
    }
}
