package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionDetailsDto;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InvestmentsTrackerCategorySectionViewModel.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0000H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001aHÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerCategorySectionViewModel;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "type", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "open", "", ErrorBundle.DETAIL_ENTRY, "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "id", "", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "<init>", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;ZLbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;Ljava/lang/String;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;)V", "getType", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "getOpen", "()Z", "getDetails", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetailsDto;", "getId", "()Ljava/lang/String;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "copyForView", "displayLimit", "", "getDisplayLimit", "()I", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerCategorySectionViewModel implements InvestmentsTrackerComponent {
    public static final int $stable = 8;
    private final InvestmentsTrackerCategorySectionDetailsDto details;
    private final int displayLimit;
    private final ServerToBentoAssetMapper2 icon;
    private final String id;
    private final boolean open;
    private final SecurityFilter securityFilter;
    private final InvestmentsTrackerComponentType type;

    public static /* synthetic */ InvestmentsTrackerCategorySectionViewModel copy$default(InvestmentsTrackerCategorySectionViewModel investmentsTrackerCategorySectionViewModel, InvestmentsTrackerComponentType investmentsTrackerComponentType, boolean z, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, String str, SecurityFilter securityFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentType = investmentsTrackerCategorySectionViewModel.type;
        }
        if ((i & 2) != 0) {
            z = investmentsTrackerCategorySectionViewModel.open;
        }
        if ((i & 4) != 0) {
            investmentsTrackerCategorySectionDetailsDto = investmentsTrackerCategorySectionViewModel.details;
        }
        if ((i & 8) != 0) {
            str = investmentsTrackerCategorySectionViewModel.id;
        }
        if ((i & 16) != 0) {
            securityFilter = investmentsTrackerCategorySectionViewModel.securityFilter;
        }
        SecurityFilter securityFilter2 = securityFilter;
        InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto2 = investmentsTrackerCategorySectionDetailsDto;
        return investmentsTrackerCategorySectionViewModel.copy(investmentsTrackerComponentType, z, investmentsTrackerCategorySectionDetailsDto2, str, securityFilter2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getOpen() {
        return this.open;
    }

    /* renamed from: component3, reason: from getter */
    public final InvestmentsTrackerCategorySectionDetailsDto getDetails() {
        return this.details;
    }

    /* renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component5, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final InvestmentsTrackerCategorySectionViewModel copy(InvestmentsTrackerComponentType type2, boolean open, InvestmentsTrackerCategorySectionDetailsDto details, String id, SecurityFilter securityFilter) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerCategorySectionViewModel(type2, open, details, id, securityFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerCategorySectionViewModel)) {
            return false;
        }
        InvestmentsTrackerCategorySectionViewModel investmentsTrackerCategorySectionViewModel = (InvestmentsTrackerCategorySectionViewModel) other;
        return this.type == investmentsTrackerCategorySectionViewModel.type && this.open == investmentsTrackerCategorySectionViewModel.open && Intrinsics.areEqual(this.details, investmentsTrackerCategorySectionViewModel.details) && Intrinsics.areEqual(this.id, investmentsTrackerCategorySectionViewModel.id) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerCategorySectionViewModel.securityFilter);
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + Boolean.hashCode(this.open)) * 31) + this.details.hashCode()) * 31) + this.id.hashCode()) * 31) + this.securityFilter.hashCode();
    }

    public String toString() {
        return "InvestmentsTrackerCategorySectionViewModel(type=" + this.type + ", open=" + this.open + ", details=" + this.details + ", id=" + this.id + ", securityFilter=" + this.securityFilter + ")";
    }

    public InvestmentsTrackerCategorySectionViewModel(InvestmentsTrackerComponentType type2, boolean z, InvestmentsTrackerCategorySectionDetailsDto details, String id, SecurityFilter securityFilter) {
        int iMin;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.type = type2;
        this.open = z;
        this.details = details;
        this.id = id;
        this.securityFilter = securityFilter;
        if (z) {
            iMin = details.getRows().size();
        } else {
            iMin = Math.min(details.getRows().size(), details.getRow_display_minimum());
        }
        this.displayLimit = iMin;
        if (z) {
            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_UP_12;
        } else {
            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_DOWN_12;
        }
        this.icon = serverToBentoAssetMapper2;
    }

    public /* synthetic */ InvestmentsTrackerCategorySectionViewModel(InvestmentsTrackerComponentType investmentsTrackerComponentType, boolean z, InvestmentsTrackerCategorySectionDetailsDto investmentsTrackerCategorySectionDetailsDto, String str, SecurityFilter securityFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(investmentsTrackerComponentType, (i & 2) != 0 ? false : z, investmentsTrackerCategorySectionDetailsDto, str, securityFilter);
    }

    @Override // com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent
    public InvestmentsTrackerComponentType getType() {
        return this.type;
    }

    public final boolean getOpen() {
        return this.open;
    }

    public final InvestmentsTrackerCategorySectionDetailsDto getDetails() {
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
    public InvestmentsTrackerCategorySectionViewModel copyForView() {
        return copy$default(this, null, false, null, null, null, 31, null);
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }
}
