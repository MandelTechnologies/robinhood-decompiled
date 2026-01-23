package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InvestmentsTrackerCategoryPercentageViewModel.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0000H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerCategoryPercentageViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", ErrorBundle.DETAIL_ENTRY, "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "displayAllItems", "", "shouldDisplay", "id", "", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;ZZLjava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getDetails", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;", "getDisplayAllItems", "()Z", "getShouldDisplay", "getId", "()Ljava/lang/String;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerCategoryPercentageViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto details;
    private final boolean displayAllItems;
    private final String id;
    private final SecurityFilter securityFilter;
    private final boolean shouldDisplay;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerCategoryPercentageViewModel copy$default(InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel, InvestmentsTrackerComponentType investmentsTrackerComponentType, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, boolean z, boolean z2, String str, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentType = investmentsTrackerCategoryPercentageViewModel.type;
        }
        if ((i & 2) != 0) {
            investmentsTrackerComponentCategoryPercentageCellDetailsDto = investmentsTrackerCategoryPercentageViewModel.details;
        }
        if ((i & 4) != 0) {
            z = investmentsTrackerCategoryPercentageViewModel.displayAllItems;
        }
        if ((i & 8) != 0) {
            z2 = investmentsTrackerCategoryPercentageViewModel.shouldDisplay;
        }
        if ((i & 16) != 0) {
            str = investmentsTrackerCategoryPercentageViewModel.id;
        }
        if ((i & 32) != 0) {
            securityFilter = investmentsTrackerCategoryPercentageViewModel.securityFilter;
        }
        String str2 = str;
        SecurityFilter securityFilter2 = securityFilter;
        return investmentsTrackerCategoryPercentageViewModel.copy(investmentsTrackerComponentType, investmentsTrackerComponentCategoryPercentageCellDetailsDto, z, z2, str2, securityFilter2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto getDetails() {
        return this.details;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDisplayAllItems() {
        return this.displayAllItems;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldDisplay() {
        return this.shouldDisplay;
    }

    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerCategoryPercentageViewModel copy(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto details, boolean displayAllItems, boolean shouldDisplay, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerCategoryPercentageViewModel(type2, details, displayAllItems, shouldDisplay, id, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerCategoryPercentageViewModel)) {
            return false;
        }
        InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel = (InvestmentsTrackerCategoryPercentageViewModel) other;
        return this.type == investmentsTrackerCategoryPercentageViewModel.type && Intrinsics.areEqual(this.details, investmentsTrackerCategoryPercentageViewModel.details) && this.displayAllItems == investmentsTrackerCategoryPercentageViewModel.displayAllItems && this.shouldDisplay == investmentsTrackerCategoryPercentageViewModel.shouldDisplay && Intrinsics.areEqual(this.id, investmentsTrackerCategoryPercentageViewModel.id) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerCategoryPercentageViewModel.securityFilter);
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.details.hashCode()) * 31) + Boolean.hashCode(this.displayAllItems)) * 31) + Boolean.hashCode(this.shouldDisplay)) * 31) + this.id.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerCategoryPercentageViewModel(type=" + this.type + ", details=" + this.details + ", displayAllItems=" + this.displayAllItems + ", shouldDisplay=" + this.shouldDisplay + ", id=" + this.id + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerCategoryPercentageViewModel(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto details, boolean z, boolean z2, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.type = type2;
        this.details = details;
        this.displayAllItems = z;
        this.shouldDisplay = z2;
        this.id = id;
        this.securityFilter = securityFilter;
    }

    public /* synthetic */ InvestmentsTrackerCategoryPercentageViewModel(InvestmentsTrackerComponentType investmentsTrackerComponentType, InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto, boolean z, boolean z2, String str, SecurityFilter securityFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentsTrackerComponentType, investmentsTrackerComponentCategoryPercentageCellDetailsDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, str, securityFilter);
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public final InvestmentsTrackerComponentCategoryPercentageCellDetailsDto getDetails() {
        return this.details;
    }

    public final boolean getDisplayAllItems() {
        return this.displayAllItems;
    }

    public final boolean getShouldDisplay() {
        return this.shouldDisplay;
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
    public InvestmentsTrackerCategoryPercentageViewModel copyForView() {
        return copy$default(this, null, null, false, false, null, null, 63, null);
    }
}
