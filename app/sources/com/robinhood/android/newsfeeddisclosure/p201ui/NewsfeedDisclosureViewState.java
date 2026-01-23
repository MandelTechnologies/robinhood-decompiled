package com.robinhood.android.newsfeeddisclosure.p201ui;

import com.robinhood.models.p355ui.UiExpandableContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureViewState;", "", "content", "Lcom/robinhood/models/ui/UiExpandableContent;", "showLoading", "", "showError", "showContent", "<init>", "(Lcom/robinhood/models/ui/UiExpandableContent;ZZZ)V", "getContent", "()Lcom/robinhood/models/ui/UiExpandableContent;", "getShowLoading", "()Z", "getShowError", "getShowContent", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NewsfeedDisclosureViewState {
    public static final int $stable = 8;
    private final UiExpandableContent content;
    private final boolean showContent;
    private final boolean showError;
    private final boolean showLoading;

    public NewsfeedDisclosureViewState() {
        this(null, false, false, false, 15, null);
    }

    public static /* synthetic */ NewsfeedDisclosureViewState copy$default(NewsfeedDisclosureViewState newsfeedDisclosureViewState, UiExpandableContent uiExpandableContent, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            uiExpandableContent = newsfeedDisclosureViewState.content;
        }
        if ((i & 2) != 0) {
            z = newsfeedDisclosureViewState.showLoading;
        }
        if ((i & 4) != 0) {
            z2 = newsfeedDisclosureViewState.showError;
        }
        if ((i & 8) != 0) {
            z3 = newsfeedDisclosureViewState.showContent;
        }
        return newsfeedDisclosureViewState.copy(uiExpandableContent, z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UiExpandableContent getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowContent() {
        return this.showContent;
    }

    public final NewsfeedDisclosureViewState copy(UiExpandableContent content, boolean showLoading, boolean showError, boolean showContent) {
        return new NewsfeedDisclosureViewState(content, showLoading, showError, showContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsfeedDisclosureViewState)) {
            return false;
        }
        NewsfeedDisclosureViewState newsfeedDisclosureViewState = (NewsfeedDisclosureViewState) other;
        return Intrinsics.areEqual(this.content, newsfeedDisclosureViewState.content) && this.showLoading == newsfeedDisclosureViewState.showLoading && this.showError == newsfeedDisclosureViewState.showError && this.showContent == newsfeedDisclosureViewState.showContent;
    }

    public int hashCode() {
        UiExpandableContent uiExpandableContent = this.content;
        return ((((((uiExpandableContent == null ? 0 : uiExpandableContent.hashCode()) * 31) + Boolean.hashCode(this.showLoading)) * 31) + Boolean.hashCode(this.showError)) * 31) + Boolean.hashCode(this.showContent);
    }

    public String toString() {
        return "NewsfeedDisclosureViewState(content=" + this.content + ", showLoading=" + this.showLoading + ", showError=" + this.showError + ", showContent=" + this.showContent + ")";
    }

    public NewsfeedDisclosureViewState(UiExpandableContent uiExpandableContent, boolean z, boolean z2, boolean z3) {
        this.content = uiExpandableContent;
        this.showLoading = z;
        this.showError = z2;
        this.showContent = z3;
    }

    public /* synthetic */ NewsfeedDisclosureViewState(UiExpandableContent uiExpandableContent, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiExpandableContent, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public final UiExpandableContent getContent() {
        return this.content;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowContent() {
        return this.showContent;
    }
}
