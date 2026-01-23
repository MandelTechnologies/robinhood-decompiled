package com.robinhood.android.pathfinder.sdui.p212ui;

import com.robinhood.models.serverdriven.experimental.api.PageTemplate;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderSduiViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiViewState;", "", "pageTemplate", "Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction;", "showLoading", "", "sendInputErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;ZLcom/robinhood/udf/UiEvent;)V", "getPageTemplate", "()Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;", "getShowLoading", "()Z", "getSendInputErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "title", "", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-pathfinder-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PathfinderSduiViewState {
    public static final int $stable = 8;
    private final PageTemplate<PathfinderAction> pageTemplate;
    private final UiEvent<Throwable> sendInputErrorEvent;
    private final boolean showLoading;
    private final String title;

    public PathfinderSduiViewState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PathfinderSduiViewState copy$default(PathfinderSduiViewState pathfinderSduiViewState, PageTemplate pageTemplate, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            pageTemplate = pathfinderSduiViewState.pageTemplate;
        }
        if ((i & 2) != 0) {
            z = pathfinderSduiViewState.showLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = pathfinderSduiViewState.sendInputErrorEvent;
        }
        return pathfinderSduiViewState.copy(pageTemplate, z, uiEvent);
    }

    public final PageTemplate<PathfinderAction> component1() {
        return this.pageTemplate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UiEvent<Throwable> component3() {
        return this.sendInputErrorEvent;
    }

    public final PathfinderSduiViewState copy(PageTemplate<? extends PathfinderAction> pageTemplate, boolean showLoading, UiEvent<Throwable> sendInputErrorEvent) {
        return new PathfinderSduiViewState(pageTemplate, showLoading, sendInputErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathfinderSduiViewState)) {
            return false;
        }
        PathfinderSduiViewState pathfinderSduiViewState = (PathfinderSduiViewState) other;
        return Intrinsics.areEqual(this.pageTemplate, pathfinderSduiViewState.pageTemplate) && this.showLoading == pathfinderSduiViewState.showLoading && Intrinsics.areEqual(this.sendInputErrorEvent, pathfinderSduiViewState.sendInputErrorEvent);
    }

    public int hashCode() {
        PageTemplate<PathfinderAction> pageTemplate = this.pageTemplate;
        int iHashCode = (((pageTemplate == null ? 0 : pageTemplate.hashCode()) * 31) + Boolean.hashCode(this.showLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.sendInputErrorEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "PathfinderSduiViewState(pageTemplate=" + this.pageTemplate + ", showLoading=" + this.showLoading + ", sendInputErrorEvent=" + this.sendInputErrorEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PathfinderSduiViewState(PageTemplate<? extends PathfinderAction> pageTemplate, boolean z, UiEvent<Throwable> uiEvent) {
        this.pageTemplate = pageTemplate;
        this.showLoading = z;
        this.sendInputErrorEvent = uiEvent;
        this.title = pageTemplate != 0 ? pageTemplate.getTitle() : null;
    }

    public /* synthetic */ PathfinderSduiViewState(PageTemplate pageTemplate, boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pageTemplate, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiEvent);
    }

    public final PageTemplate<PathfinderAction> getPageTemplate() {
        return this.pageTemplate;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final UiEvent<Throwable> getSendInputErrorEvent() {
        return this.sendInputErrorEvent;
    }

    public final String getTitle() {
        return this.title;
    }
}
