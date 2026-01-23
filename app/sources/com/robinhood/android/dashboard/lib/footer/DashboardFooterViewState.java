package com.robinhood.android.dashboard.lib.footer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: DashboardFooterDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/footer/DashboardFooterViewState;", "", "footerContents", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/UIComponentDto;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getFooterContents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardFooterViewState {
    public static final int $stable = 8;
    private final ImmutableList<UIComponentDto> footerContents;

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardFooterViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardFooterViewState copy$default(DashboardFooterViewState dashboardFooterViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = dashboardFooterViewState.footerContents;
        }
        return dashboardFooterViewState.copy(immutableList);
    }

    public final ImmutableList<UIComponentDto> component1() {
        return this.footerContents;
    }

    public final DashboardFooterViewState copy(ImmutableList<UIComponentDto> footerContents) {
        Intrinsics.checkNotNullParameter(footerContents, "footerContents");
        return new DashboardFooterViewState(footerContents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DashboardFooterViewState) && Intrinsics.areEqual(this.footerContents, ((DashboardFooterViewState) other).footerContents);
    }

    public int hashCode() {
        return this.footerContents.hashCode();
    }

    public String toString() {
        return "DashboardFooterViewState(footerContents=" + this.footerContents + ")";
    }

    public DashboardFooterViewState(ImmutableList<UIComponentDto> footerContents) {
        Intrinsics.checkNotNullParameter(footerContents, "footerContents");
        this.footerContents = footerContents;
    }

    public /* synthetic */ DashboardFooterViewState(ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<UIComponentDto> getFooterContents() {
        return this.footerContents;
    }
}
