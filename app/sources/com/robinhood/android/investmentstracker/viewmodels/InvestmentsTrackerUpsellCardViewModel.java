package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerComponentUpsellCardDto;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerUpsellCardViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0000H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerUpsellCardViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "id", "", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Ljava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getItem", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCardDto;", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getId", "()Ljava/lang/String;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerUpsellCardViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final String id;
    private final InvestmentsTrackerComponentUpsellCardDto item;
    private final SecurityFilter securityFilter;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerUpsellCardViewModel copy$default(InvestmentsTrackerUpsellCardViewModel investmentsTrackerUpsellCardViewModel, InvestmentsTrackerComponentUpsellCardDto investmentsTrackerComponentUpsellCardDto, InvestmentsTrackerComponentType investmentsTrackerComponentType, String str, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentUpsellCardDto = investmentsTrackerUpsellCardViewModel.item;
        }
        if ((i & 2) != 0) {
            investmentsTrackerComponentType = investmentsTrackerUpsellCardViewModel.type;
        }
        if ((i & 4) != 0) {
            str = investmentsTrackerUpsellCardViewModel.id;
        }
        if ((i & 8) != 0) {
            securityFilter = investmentsTrackerUpsellCardViewModel.securityFilter;
        }
        return investmentsTrackerUpsellCardViewModel.copy(investmentsTrackerComponentUpsellCardDto, investmentsTrackerComponentType, str, securityFilter);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentUpsellCardDto getItem() {
        return this.item;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerUpsellCardViewModel copy(InvestmentsTrackerComponentUpsellCardDto item, InvestmentsTrackerComponentType type2, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerUpsellCardViewModel(item, type2, id, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerUpsellCardViewModel)) {
            return false;
        }
        InvestmentsTrackerUpsellCardViewModel investmentsTrackerUpsellCardViewModel = (InvestmentsTrackerUpsellCardViewModel) other;
        return Intrinsics.areEqual(this.item, investmentsTrackerUpsellCardViewModel.item) && this.type == investmentsTrackerUpsellCardViewModel.type && Intrinsics.areEqual(this.id, investmentsTrackerUpsellCardViewModel.id) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerUpsellCardViewModel.securityFilter);
    }

    public int hashCode() {
        return (((((this.item.hashCode() * 31) + this.type.hashCode()) * 31) + this.id.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerUpsellCardViewModel(item=" + this.item + ", type=" + this.type + ", id=" + this.id + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerUpsellCardViewModel(InvestmentsTrackerComponentUpsellCardDto item, InvestmentsTrackerComponentType type2, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.item = item;
        this.type = type2;
        this.id = id;
        this.securityFilter = securityFilter;
    }

    public final InvestmentsTrackerComponentUpsellCardDto getItem() {
        return this.item;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
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
    public InvestmentsTrackerUpsellCardViewModel copyForView() {
        return copy$default(this, null, null, null, null, 15, null);
    }
}
