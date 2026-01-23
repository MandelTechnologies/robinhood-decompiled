package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuOfOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "menuOfOptionsState", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;Lcom/robinhood/shared/app/type/AppType;)V", "getMenuOfOptionsState", "()Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MenuOfOptionsViewState implements LoggableViewState {
    public static final int $stable = 8;
    private final AppType appType;
    private final MenuOfOptionsState menuOfOptionsState;

    public static /* synthetic */ MenuOfOptionsViewState copy$default(MenuOfOptionsViewState menuOfOptionsViewState, MenuOfOptionsState menuOfOptionsState, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            menuOfOptionsState = menuOfOptionsViewState.menuOfOptionsState;
        }
        if ((i & 2) != 0) {
            appType = menuOfOptionsViewState.appType;
        }
        return menuOfOptionsViewState.copy(menuOfOptionsState, appType);
    }

    /* renamed from: component1, reason: from getter */
    public final MenuOfOptionsState getMenuOfOptionsState() {
        return this.menuOfOptionsState;
    }

    /* renamed from: component2, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    public final MenuOfOptionsViewState copy(MenuOfOptionsState menuOfOptionsState, AppType appType) {
        Intrinsics.checkNotNullParameter(menuOfOptionsState, "menuOfOptionsState");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new MenuOfOptionsViewState(menuOfOptionsState, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuOfOptionsViewState)) {
            return false;
        }
        MenuOfOptionsViewState menuOfOptionsViewState = (MenuOfOptionsViewState) other;
        return Intrinsics.areEqual(this.menuOfOptionsState, menuOfOptionsViewState.menuOfOptionsState) && this.appType == menuOfOptionsViewState.appType;
    }

    public int hashCode() {
        return (this.menuOfOptionsState.hashCode() * 31) + this.appType.hashCode();
    }

    public String toString() {
        return "MenuOfOptionsViewState(menuOfOptionsState=" + this.menuOfOptionsState + ", appType=" + this.appType + ")";
    }

    public MenuOfOptionsViewState(MenuOfOptionsState menuOfOptionsState, AppType appType) {
        Intrinsics.checkNotNullParameter(menuOfOptionsState, "menuOfOptionsState");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.menuOfOptionsState = menuOfOptionsState;
        this.appType = appType;
    }

    public final MenuOfOptionsState getMenuOfOptionsState() {
        return this.menuOfOptionsState;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        MenuOfOptionsState menuOfOptionsState = this.menuOfOptionsState;
        if (menuOfOptionsState instanceof MenuOfOptionsState.Loading) {
            return new LoggableViewState2.Loading("DASHBOARD_CHART");
        }
        if (menuOfOptionsState instanceof MenuOfOptionsState.Error) {
            return new LoggableViewState2.Failed("DASHBOARD_CHART");
        }
        if (menuOfOptionsState instanceof MenuOfOptionsState.MenuOfOptions) {
            return new LoggableViewState2.Completed("DASHBOARD_CHART", null, 2, null);
        }
        if (menuOfOptionsState instanceof MenuOfOptionsState.Invested) {
            return new LoggableViewState2.Completed(null, null, 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
