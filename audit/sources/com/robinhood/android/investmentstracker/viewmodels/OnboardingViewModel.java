package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingViewModel.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;", "", WebsocketGatewayConstants.DATA_KEY, "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "currentPage", "", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;I)V", "getData", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "getCurrentPage", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OnboardingViewModel {
    public static final int $stable = 8;
    private final int currentPage;
    private final InvestmentsTrackerOnboardingDataDto data;

    public static /* synthetic */ OnboardingViewModel copy$default(OnboardingViewModel onboardingViewModel, InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            investmentsTrackerOnboardingDataDto = onboardingViewModel.data;
        }
        if ((i2 & 2) != 0) {
            i = onboardingViewModel.currentPage;
        }
        return onboardingViewModel.copy(investmentsTrackerOnboardingDataDto, i);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerOnboardingDataDto getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final OnboardingViewModel copy(InvestmentsTrackerOnboardingDataDto data, int currentPage) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new OnboardingViewModel(data, currentPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingViewModel)) {
            return false;
        }
        OnboardingViewModel onboardingViewModel = (OnboardingViewModel) other;
        return Intrinsics.areEqual(this.data, onboardingViewModel.data) && this.currentPage == onboardingViewModel.currentPage;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Integer.hashCode(this.currentPage);
    }

    public String toString() {
        return "OnboardingViewModel(data=" + this.data + ", currentPage=" + this.currentPage + ")";
    }

    public OnboardingViewModel(InvestmentsTrackerOnboardingDataDto data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.currentPage = i;
    }

    public final InvestmentsTrackerOnboardingDataDto getData() {
        return this.data;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }
}
