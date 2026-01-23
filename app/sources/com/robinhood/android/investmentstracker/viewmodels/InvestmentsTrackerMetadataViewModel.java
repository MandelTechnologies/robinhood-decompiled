package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerComponentMetadataDetailsDto;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InvestmentsTrackerMetadataViewModel.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0000H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerMetadataViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", ErrorBundle.DETAIL_ENTRY, "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "id", "", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;Ljava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getDetails", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsDto;", "getId", "()Ljava/lang/String;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerMetadataViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final InvestmentsTrackerComponentMetadataDetailsDto details;
    private final String id;
    private final SecurityFilter securityFilter;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerMetadataViewModel copy$default(InvestmentsTrackerMetadataViewModel investmentsTrackerMetadataViewModel, InvestmentsTrackerComponentType investmentsTrackerComponentType, InvestmentsTrackerComponentMetadataDetailsDto investmentsTrackerComponentMetadataDetailsDto, String str, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentType = investmentsTrackerMetadataViewModel.type;
        }
        if ((i & 2) != 0) {
            investmentsTrackerComponentMetadataDetailsDto = investmentsTrackerMetadataViewModel.details;
        }
        if ((i & 4) != 0) {
            str = investmentsTrackerMetadataViewModel.id;
        }
        if ((i & 8) != 0) {
            securityFilter = investmentsTrackerMetadataViewModel.securityFilter;
        }
        return investmentsTrackerMetadataViewModel.copy(investmentsTrackerComponentType, investmentsTrackerComponentMetadataDetailsDto, str, securityFilter);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentsTrackerComponentMetadataDetailsDto getDetails() {
        return this.details;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerMetadataViewModel copy(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentMetadataDetailsDto details, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerMetadataViewModel(type2, details, id, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerMetadataViewModel)) {
            return false;
        }
        InvestmentsTrackerMetadataViewModel investmentsTrackerMetadataViewModel = (InvestmentsTrackerMetadataViewModel) other;
        return this.type == investmentsTrackerMetadataViewModel.type && Intrinsics.areEqual(this.details, investmentsTrackerMetadataViewModel.details) && Intrinsics.areEqual(this.id, investmentsTrackerMetadataViewModel.id) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerMetadataViewModel.securityFilter);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.details.hashCode()) * 31) + this.id.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerMetadataViewModel(type=" + this.type + ", details=" + this.details + ", id=" + this.id + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerMetadataViewModel(InvestmentsTrackerComponentType type2, InvestmentsTrackerComponentMetadataDetailsDto details, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.type = type2;
        this.details = details;
        this.id = id;
        this.securityFilter = securityFilter;
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public final InvestmentsTrackerComponentMetadataDetailsDto getDetails() {
        return this.details;
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
    public InvestmentsTrackerMetadataViewModel copyForView() {
        return copy$default(this, null, null, null, null, 15, null);
    }
}
