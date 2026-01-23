package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherMarkdownFullScreen.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/PreviewState;", "", "viewState", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "overrideToolbarTitle", "", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;", "<init>", "(Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;Ljava/lang/String;Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;)V", "getViewState", "()Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "getOverrideToolbarTitle", "()Ljava/lang/String;", "getPrimaryButton", "()Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final /* data */ class PreviewState {
    private final String overrideToolbarTitle;
    private final OtherMarkdownFragmentKey.PrimaryButton primaryButton;
    private final OtherMarkdownStateProvider3 viewState;

    public static /* synthetic */ PreviewState copy$default(PreviewState previewState, OtherMarkdownStateProvider3 otherMarkdownStateProvider3, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton, int i, Object obj) {
        if ((i & 1) != 0) {
            otherMarkdownStateProvider3 = previewState.viewState;
        }
        if ((i & 2) != 0) {
            str = previewState.overrideToolbarTitle;
        }
        if ((i & 4) != 0) {
            primaryButton = previewState.primaryButton;
        }
        return previewState.copy(otherMarkdownStateProvider3, str, primaryButton);
    }

    /* renamed from: component1, reason: from getter */
    public final OtherMarkdownStateProvider3 getViewState() {
        return this.viewState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOverrideToolbarTitle() {
        return this.overrideToolbarTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final OtherMarkdownFragmentKey.PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final PreviewState copy(OtherMarkdownStateProvider3 viewState, String overrideToolbarTitle, OtherMarkdownFragmentKey.PrimaryButton primaryButton) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return new PreviewState(viewState, overrideToolbarTitle, primaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewState)) {
            return false;
        }
        PreviewState previewState = (PreviewState) other;
        return Intrinsics.areEqual(this.viewState, previewState.viewState) && Intrinsics.areEqual(this.overrideToolbarTitle, previewState.overrideToolbarTitle) && Intrinsics.areEqual(this.primaryButton, previewState.primaryButton);
    }

    public int hashCode() {
        int iHashCode = this.viewState.hashCode() * 31;
        String str = this.overrideToolbarTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OtherMarkdownFragmentKey.PrimaryButton primaryButton = this.primaryButton;
        return iHashCode2 + (primaryButton != null ? primaryButton.hashCode() : 0);
    }

    public String toString() {
        return "PreviewState(viewState=" + this.viewState + ", overrideToolbarTitle=" + this.overrideToolbarTitle + ", primaryButton=" + this.primaryButton + ")";
    }

    public PreviewState(OtherMarkdownStateProvider3 viewState, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        this.viewState = viewState;
        this.overrideToolbarTitle = str;
        this.primaryButton = primaryButton;
    }

    public /* synthetic */ PreviewState(OtherMarkdownStateProvider3 otherMarkdownStateProvider3, String str, OtherMarkdownFragmentKey.PrimaryButton primaryButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(otherMarkdownStateProvider3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : primaryButton);
    }

    public final OtherMarkdownStateProvider3 getViewState() {
        return this.viewState;
    }

    public final String getOverrideToolbarTitle() {
        return this.overrideToolbarTitle;
    }

    public final OtherMarkdownFragmentKey.PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }
}
