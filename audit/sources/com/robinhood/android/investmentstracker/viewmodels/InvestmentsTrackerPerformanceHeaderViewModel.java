package com.robinhood.android.investmentstracker.viewmodels;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerPerformanceChartViewModel.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0000H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "header", "", "amount", "amountOverrideDisplayText", "showTooltip", "", "id", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getHeader", "()Ljava/lang/String;", "getAmount", "getAmountOverrideDisplayText", "getShowTooltip", "()Z", "getId", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerPerformanceHeaderViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final String amount;
    private final String amountOverrideDisplayText;
    private final String header;
    private final String id;
    private final SecurityFilter securityFilter;
    private final boolean showTooltip;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerPerformanceHeaderViewModel copy$default(InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel, InvestmentsTrackerComponentType investmentsTrackerComponentType, String str, String str2, String str3, boolean z, String str4, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentType = investmentsTrackerPerformanceHeaderViewModel.type;
        }
        if ((i & 2) != 0) {
            str = investmentsTrackerPerformanceHeaderViewModel.header;
        }
        if ((i & 4) != 0) {
            str2 = investmentsTrackerPerformanceHeaderViewModel.amount;
        }
        if ((i & 8) != 0) {
            str3 = investmentsTrackerPerformanceHeaderViewModel.amountOverrideDisplayText;
        }
        if ((i & 16) != 0) {
            z = investmentsTrackerPerformanceHeaderViewModel.showTooltip;
        }
        if ((i & 32) != 0) {
            str4 = investmentsTrackerPerformanceHeaderViewModel.id;
        }
        if ((i & 64) != 0) {
            securityFilter = investmentsTrackerPerformanceHeaderViewModel.securityFilter;
        }
        String str5 = str4;
        SecurityFilter securityFilter2 = securityFilter;
        boolean z2 = z;
        String str6 = str2;
        return investmentsTrackerPerformanceHeaderViewModel.copy(investmentsTrackerComponentType, str, str6, str3, z2, str5, securityFilter2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAmountOverrideDisplayText() {
        return this.amountOverrideDisplayText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowTooltip() {
        return this.showTooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerPerformanceHeaderViewModel copy(InvestmentsTrackerComponentType type2, String header, String amount, String amountOverrideDisplayText, boolean showTooltip, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerPerformanceHeaderViewModel(type2, header, amount, amountOverrideDisplayText, showTooltip, id, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerPerformanceHeaderViewModel)) {
            return false;
        }
        InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel = (InvestmentsTrackerPerformanceHeaderViewModel) other;
        return this.type == investmentsTrackerPerformanceHeaderViewModel.type && Intrinsics.areEqual(this.header, investmentsTrackerPerformanceHeaderViewModel.header) && Intrinsics.areEqual(this.amount, investmentsTrackerPerformanceHeaderViewModel.amount) && Intrinsics.areEqual(this.amountOverrideDisplayText, investmentsTrackerPerformanceHeaderViewModel.amountOverrideDisplayText) && this.showTooltip == investmentsTrackerPerformanceHeaderViewModel.showTooltip && Intrinsics.areEqual(this.id, investmentsTrackerPerformanceHeaderViewModel.id) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerPerformanceHeaderViewModel.securityFilter);
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.header.hashCode()) * 31) + this.amount.hashCode()) * 31;
        String str = this.amountOverrideDisplayText;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showTooltip)) * 31) + this.id.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerPerformanceHeaderViewModel(type=" + this.type + ", header=" + this.header + ", amount=" + this.amount + ", amountOverrideDisplayText=" + this.amountOverrideDisplayText + ", showTooltip=" + this.showTooltip + ", id=" + this.id + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerPerformanceHeaderViewModel(InvestmentsTrackerComponentType type2, String header, String amount, String str, boolean z, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.type = type2;
        this.header = header;
        this.amount = amount;
        this.amountOverrideDisplayText = str;
        this.showTooltip = z;
        this.id = id;
        this.securityFilter = securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAmountOverrideDisplayText() {
        return this.amountOverrideDisplayText;
    }

    public final boolean getShowTooltip() {
        return this.showTooltip;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public String getId() {
        return this.id;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerPerformanceHeaderViewModel copyForView() {
        return copy$default(this, null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }
}
