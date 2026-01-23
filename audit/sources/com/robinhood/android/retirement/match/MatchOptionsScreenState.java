package com.robinhood.android.retirement.match;

import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentPage;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchSelectionRow;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MatchOptionsScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/retirement/match/MatchOptionsScreenState;", "", "headerImageUrl", "", "title", "subtitle", "matchOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchSelectionRow;", DirectDepositBrokerageExperimentPage.FOOTER_CONTENT, "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "usePendingDowngradeLayout", "", "showGoldRejoinFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZ)V", "getHeaderImageUrl", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getMatchOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooterContent", "getUsePendingDowngradeLayout", "()Z", "getShowGoldRejoinFlow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MatchOptionsScreenState {
    public static final int $stable = 8;
    private final ImmutableList<UIComponent<GenericAction>> footerContent;
    private final String headerImageUrl;
    private final ImmutableList<ApiMatchSelectionRow> matchOptions;
    private final boolean showGoldRejoinFlow;
    private final String subtitle;
    private final String title;
    private final boolean usePendingDowngradeLayout;

    public static /* synthetic */ MatchOptionsScreenState copy$default(MatchOptionsScreenState matchOptionsScreenState, String str, String str2, String str3, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchOptionsScreenState.headerImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = matchOptionsScreenState.title;
        }
        if ((i & 4) != 0) {
            str3 = matchOptionsScreenState.subtitle;
        }
        if ((i & 8) != 0) {
            immutableList = matchOptionsScreenState.matchOptions;
        }
        if ((i & 16) != 0) {
            immutableList2 = matchOptionsScreenState.footerContent;
        }
        if ((i & 32) != 0) {
            z = matchOptionsScreenState.usePendingDowngradeLayout;
        }
        if ((i & 64) != 0) {
            z2 = matchOptionsScreenState.showGoldRejoinFlow;
        }
        boolean z3 = z;
        boolean z4 = z2;
        ImmutableList immutableList3 = immutableList2;
        String str4 = str3;
        return matchOptionsScreenState.copy(str, str2, str4, immutableList, immutableList3, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<ApiMatchSelectionRow> component4() {
        return this.matchOptions;
    }

    public final ImmutableList<UIComponent<GenericAction>> component5() {
        return this.footerContent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUsePendingDowngradeLayout() {
        return this.usePendingDowngradeLayout;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowGoldRejoinFlow() {
        return this.showGoldRejoinFlow;
    }

    public final MatchOptionsScreenState copy(String headerImageUrl, String title, String subtitle, ImmutableList<ApiMatchSelectionRow> matchOptions, ImmutableList<? extends UIComponent<? extends GenericAction>> footerContent, boolean usePendingDowngradeLayout, boolean showGoldRejoinFlow) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(matchOptions, "matchOptions");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        return new MatchOptionsScreenState(headerImageUrl, title, subtitle, matchOptions, footerContent, usePendingDowngradeLayout, showGoldRejoinFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchOptionsScreenState)) {
            return false;
        }
        MatchOptionsScreenState matchOptionsScreenState = (MatchOptionsScreenState) other;
        return Intrinsics.areEqual(this.headerImageUrl, matchOptionsScreenState.headerImageUrl) && Intrinsics.areEqual(this.title, matchOptionsScreenState.title) && Intrinsics.areEqual(this.subtitle, matchOptionsScreenState.subtitle) && Intrinsics.areEqual(this.matchOptions, matchOptionsScreenState.matchOptions) && Intrinsics.areEqual(this.footerContent, matchOptionsScreenState.footerContent) && this.usePendingDowngradeLayout == matchOptionsScreenState.usePendingDowngradeLayout && this.showGoldRejoinFlow == matchOptionsScreenState.showGoldRejoinFlow;
    }

    public int hashCode() {
        String str = this.headerImageUrl;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.matchOptions.hashCode()) * 31) + this.footerContent.hashCode()) * 31) + Boolean.hashCode(this.usePendingDowngradeLayout)) * 31) + Boolean.hashCode(this.showGoldRejoinFlow);
    }

    public String toString() {
        return "MatchOptionsScreenState(headerImageUrl=" + this.headerImageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", matchOptions=" + this.matchOptions + ", footerContent=" + this.footerContent + ", usePendingDowngradeLayout=" + this.usePendingDowngradeLayout + ", showGoldRejoinFlow=" + this.showGoldRejoinFlow + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchOptionsScreenState(String str, String title, String subtitle, ImmutableList<ApiMatchSelectionRow> matchOptions, ImmutableList<? extends UIComponent<? extends GenericAction>> footerContent, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(matchOptions, "matchOptions");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        this.headerImageUrl = str;
        this.title = title;
        this.subtitle = subtitle;
        this.matchOptions = matchOptions;
        this.footerContent = footerContent;
        this.usePendingDowngradeLayout = z;
        this.showGoldRejoinFlow = z2;
    }

    public /* synthetic */ MatchOptionsScreenState(String str, String str2, String str3, ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, immutableList, immutableList2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<ApiMatchSelectionRow> getMatchOptions() {
        return this.matchOptions;
    }

    public final ImmutableList<UIComponent<GenericAction>> getFooterContent() {
        return this.footerContent;
    }

    public final boolean getUsePendingDowngradeLayout() {
        return this.usePendingDowngradeLayout;
    }

    public final boolean getShowGoldRejoinFlow() {
        return this.showGoldRejoinFlow;
    }
}
