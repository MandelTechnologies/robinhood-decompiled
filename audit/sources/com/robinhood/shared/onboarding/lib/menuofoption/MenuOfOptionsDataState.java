package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceV2;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsState;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuOfOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsDataState;", "", "sortingHateState", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/store/AsyncResult;Lcom/robinhood/shared/app/type/AppType;)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "menuOfOptionsState", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "getMenuOfOptionsState", "()Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MenuOfOptionsDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final AsyncResult<SortingHatRecord> sortingHateState;

    private final AsyncResult<SortingHatRecord> component1() {
        return this.sortingHateState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuOfOptionsDataState copy$default(MenuOfOptionsDataState menuOfOptionsDataState, AsyncResult asyncResult, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            asyncResult = menuOfOptionsDataState.sortingHateState;
        }
        if ((i & 2) != 0) {
            appType = menuOfOptionsDataState.appType;
        }
        return menuOfOptionsDataState.copy(asyncResult, appType);
    }

    /* renamed from: component2, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    public final MenuOfOptionsDataState copy(AsyncResult<SortingHatRecord> sortingHateState, AppType appType) {
        Intrinsics.checkNotNullParameter(sortingHateState, "sortingHateState");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new MenuOfOptionsDataState(sortingHateState, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuOfOptionsDataState)) {
            return false;
        }
        MenuOfOptionsDataState menuOfOptionsDataState = (MenuOfOptionsDataState) other;
        return Intrinsics.areEqual(this.sortingHateState, menuOfOptionsDataState.sortingHateState) && this.appType == menuOfOptionsDataState.appType;
    }

    public int hashCode() {
        return (this.sortingHateState.hashCode() * 31) + this.appType.hashCode();
    }

    public String toString() {
        return "MenuOfOptionsDataState(sortingHateState=" + this.sortingHateState + ", appType=" + this.appType + ")";
    }

    public MenuOfOptionsDataState(AsyncResult<SortingHatRecord> sortingHateState, AppType appType) {
        Intrinsics.checkNotNullParameter(sortingHateState, "sortingHateState");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.sortingHateState = sortingHateState;
        this.appType = appType;
    }

    public /* synthetic */ MenuOfOptionsDataState(AsyncResult asyncResult, AppType appType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AsyncResult.Loading.INSTANCE : asyncResult, appType);
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final MenuOfOptionsState getMenuOfOptionsState() {
        AsyncResult<SortingHatRecord> asyncResult = this.sortingHateState;
        if (asyncResult instanceof AsyncResult.Failure) {
            return MenuOfOptionsState.Error.INSTANCE;
        }
        if (asyncResult instanceof AsyncResult.Loading) {
            return MenuOfOptionsState.Loading.INSTANCE;
        }
        if (!(asyncResult instanceof AsyncResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        SortingHatExperienceV2 experience = ((SortingHatRecord) ((AsyncResult.Success) asyncResult).getValue()).getExperience();
        if (experience instanceof SortingHatExperienceV2.Invested) {
            return MenuOfOptionsState.Invested.INSTANCE;
        }
        if (!(experience instanceof SortingHatExperienceV2.MenuOfOptions)) {
            throw new NoWhenBranchMatchedException();
        }
        return new MenuOfOptionsState.MenuOfOptions((SortingHatExperienceV2.MenuOfOptions) experience);
    }
}
