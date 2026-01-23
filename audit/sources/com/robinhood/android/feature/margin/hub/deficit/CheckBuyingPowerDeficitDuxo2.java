package com.robinhood.android.feature.margin.hub.deficit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckBuyingPowerDeficitDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerEvent;", "", "<init>", "()V", "NavigateToDestination", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerEvent$NavigateToDestination;", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerEvent, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class CheckBuyingPowerDeficitDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ CheckBuyingPowerDeficitDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CheckBuyingPowerDeficitDuxo2() {
    }

    /* compiled from: CheckBuyingPowerDeficitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerEvent$NavigateToDestination;", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerEvent;", "accountNumber", "", "showMarginResolutionScreen", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getShowMarginResolutionScreen", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerEvent$NavigateToDestination, reason: from toString */
    public static final /* data */ class NavigateToDestination extends CheckBuyingPowerDeficitDuxo2 {
        public static final int $stable = 0;
        private final String accountNumber;
        private final boolean showMarginResolutionScreen;

        public static /* synthetic */ NavigateToDestination copy$default(NavigateToDestination navigateToDestination, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDestination.accountNumber;
            }
            if ((i & 2) != 0) {
                z = navigateToDestination.showMarginResolutionScreen;
            }
            return navigateToDestination.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowMarginResolutionScreen() {
            return this.showMarginResolutionScreen;
        }

        public final NavigateToDestination copy(String accountNumber, boolean showMarginResolutionScreen) {
            return new NavigateToDestination(accountNumber, showMarginResolutionScreen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToDestination)) {
                return false;
            }
            NavigateToDestination navigateToDestination = (NavigateToDestination) other;
            return Intrinsics.areEqual(this.accountNumber, navigateToDestination.accountNumber) && this.showMarginResolutionScreen == navigateToDestination.showMarginResolutionScreen;
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.showMarginResolutionScreen);
        }

        public String toString() {
            return "NavigateToDestination(accountNumber=" + this.accountNumber + ", showMarginResolutionScreen=" + this.showMarginResolutionScreen + ")";
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getShowMarginResolutionScreen() {
            return this.showMarginResolutionScreen;
        }

        public NavigateToDestination(String str, boolean z) {
            super(null);
            this.accountNumber = str;
            this.showMarginResolutionScreen = z;
        }
    }
}
