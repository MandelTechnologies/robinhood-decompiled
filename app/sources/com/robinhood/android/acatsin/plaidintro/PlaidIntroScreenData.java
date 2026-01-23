package com.robinhood.android.acatsin.plaidintro;

import acats_aggregation.service.p001v1.PlaidIntroSelectionDto;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AcatsInPlaidIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/PlaidIntroScreenData;", "", "bodyContent", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "plaidSelection", "Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "manualSelection", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;)V", "getBodyContent", "()Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "getFooterContent", "getPlaidSelection", "()Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "getManualSelection", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class PlaidIntroScreenData {
    public static final int $stable = 8;
    private final UIComponentDto.ConcreteDto bodyContent;
    private final UIComponentDto.ConcreteDto footerContent;
    private final PlaidIntroSelectionDto manualSelection;
    private final PlaidIntroSelectionDto plaidSelection;

    public static /* synthetic */ PlaidIntroScreenData copy$default(PlaidIntroScreenData plaidIntroScreenData, UIComponentDto.ConcreteDto concreteDto, UIComponentDto.ConcreteDto concreteDto2, PlaidIntroSelectionDto plaidIntroSelectionDto, PlaidIntroSelectionDto plaidIntroSelectionDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            concreteDto = plaidIntroScreenData.bodyContent;
        }
        if ((i & 2) != 0) {
            concreteDto2 = plaidIntroScreenData.footerContent;
        }
        if ((i & 4) != 0) {
            plaidIntroSelectionDto = plaidIntroScreenData.plaidSelection;
        }
        if ((i & 8) != 0) {
            plaidIntroSelectionDto2 = plaidIntroScreenData.manualSelection;
        }
        return plaidIntroScreenData.copy(concreteDto, concreteDto2, plaidIntroSelectionDto, plaidIntroSelectionDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final UIComponentDto.ConcreteDto getBodyContent() {
        return this.bodyContent;
    }

    /* renamed from: component2, reason: from getter */
    public final UIComponentDto.ConcreteDto getFooterContent() {
        return this.footerContent;
    }

    /* renamed from: component3, reason: from getter */
    public final PlaidIntroSelectionDto getPlaidSelection() {
        return this.plaidSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final PlaidIntroSelectionDto getManualSelection() {
        return this.manualSelection;
    }

    public final PlaidIntroScreenData copy(UIComponentDto.ConcreteDto bodyContent, UIComponentDto.ConcreteDto footerContent, PlaidIntroSelectionDto plaidSelection, PlaidIntroSelectionDto manualSelection) {
        Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        Intrinsics.checkNotNullParameter(plaidSelection, "plaidSelection");
        Intrinsics.checkNotNullParameter(manualSelection, "manualSelection");
        return new PlaidIntroScreenData(bodyContent, footerContent, plaidSelection, manualSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaidIntroScreenData)) {
            return false;
        }
        PlaidIntroScreenData plaidIntroScreenData = (PlaidIntroScreenData) other;
        return Intrinsics.areEqual(this.bodyContent, plaidIntroScreenData.bodyContent) && Intrinsics.areEqual(this.footerContent, plaidIntroScreenData.footerContent) && Intrinsics.areEqual(this.plaidSelection, plaidIntroScreenData.plaidSelection) && Intrinsics.areEqual(this.manualSelection, plaidIntroScreenData.manualSelection);
    }

    public int hashCode() {
        return (((((this.bodyContent.hashCode() * 31) + this.footerContent.hashCode()) * 31) + this.plaidSelection.hashCode()) * 31) + this.manualSelection.hashCode();
    }

    public String toString() {
        return "PlaidIntroScreenData(bodyContent=" + this.bodyContent + ", footerContent=" + this.footerContent + ", plaidSelection=" + this.plaidSelection + ", manualSelection=" + this.manualSelection + ")";
    }

    public PlaidIntroScreenData(UIComponentDto.ConcreteDto bodyContent, UIComponentDto.ConcreteDto footerContent, PlaidIntroSelectionDto plaidSelection, PlaidIntroSelectionDto manualSelection) {
        Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        Intrinsics.checkNotNullParameter(plaidSelection, "plaidSelection");
        Intrinsics.checkNotNullParameter(manualSelection, "manualSelection");
        this.bodyContent = bodyContent;
        this.footerContent = footerContent;
        this.plaidSelection = plaidSelection;
        this.manualSelection = manualSelection;
    }

    public final UIComponentDto.ConcreteDto getBodyContent() {
        return this.bodyContent;
    }

    public final UIComponentDto.ConcreteDto getFooterContent() {
        return this.footerContent;
    }

    public final PlaidIntroSelectionDto getPlaidSelection() {
        return this.plaidSelection;
    }

    public final PlaidIntroSelectionDto getManualSelection() {
        return this.manualSelection;
    }
}
