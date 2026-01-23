package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: AboutV2ViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ViewState;", "", "aboutText", "", "infoList", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Info;", "expandBtnColor", "Lcom/robinhood/android/equitydetail/ui/about/v2/ExpandBtnColor;", "doesAboutTextOverflow", "", "isExpanded", "isLoading", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/equitydetail/ui/about/v2/ExpandBtnColor;ZZZ)V", "getAboutText", "()Ljava/lang/String;", "getInfoList", "()Lkotlinx/collections/immutable/PersistentList;", "getExpandBtnColor", "()Lcom/robinhood/android/equitydetail/ui/about/v2/ExpandBtnColor;", "getDoesAboutTextOverflow", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AboutV2ViewState {
    public static final int $stable = 0;
    private final String aboutText;
    private final boolean doesAboutTextOverflow;
    private final AboutV2ViewState2 expandBtnColor;
    private final ImmutableList3<AboutV2Info> infoList;
    private final boolean isExpanded;
    private final boolean isLoading;

    public static /* synthetic */ AboutV2ViewState copy$default(AboutV2ViewState aboutV2ViewState, String str, ImmutableList3 immutableList3, AboutV2ViewState2 aboutV2ViewState2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aboutV2ViewState.aboutText;
        }
        if ((i & 2) != 0) {
            immutableList3 = aboutV2ViewState.infoList;
        }
        if ((i & 4) != 0) {
            aboutV2ViewState2 = aboutV2ViewState.expandBtnColor;
        }
        if ((i & 8) != 0) {
            z = aboutV2ViewState.doesAboutTextOverflow;
        }
        if ((i & 16) != 0) {
            z2 = aboutV2ViewState.isExpanded;
        }
        if ((i & 32) != 0) {
            z3 = aboutV2ViewState.isLoading;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return aboutV2ViewState.copy(str, immutableList3, aboutV2ViewState2, z, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAboutText() {
        return this.aboutText;
    }

    public final ImmutableList3<AboutV2Info> component2() {
        return this.infoList;
    }

    /* renamed from: component3, reason: from getter */
    public final AboutV2ViewState2 getExpandBtnColor() {
        return this.expandBtnColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDoesAboutTextOverflow() {
        return this.doesAboutTextOverflow;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final AboutV2ViewState copy(String aboutText, ImmutableList3<AboutV2Info> infoList, AboutV2ViewState2 expandBtnColor, boolean doesAboutTextOverflow, boolean isExpanded, boolean isLoading) {
        Intrinsics.checkNotNullParameter(infoList, "infoList");
        Intrinsics.checkNotNullParameter(expandBtnColor, "expandBtnColor");
        return new AboutV2ViewState(aboutText, infoList, expandBtnColor, doesAboutTextOverflow, isExpanded, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AboutV2ViewState)) {
            return false;
        }
        AboutV2ViewState aboutV2ViewState = (AboutV2ViewState) other;
        return Intrinsics.areEqual(this.aboutText, aboutV2ViewState.aboutText) && Intrinsics.areEqual(this.infoList, aboutV2ViewState.infoList) && this.expandBtnColor == aboutV2ViewState.expandBtnColor && this.doesAboutTextOverflow == aboutV2ViewState.doesAboutTextOverflow && this.isExpanded == aboutV2ViewState.isExpanded && this.isLoading == aboutV2ViewState.isLoading;
    }

    public int hashCode() {
        String str = this.aboutText;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.infoList.hashCode()) * 31) + this.expandBtnColor.hashCode()) * 31) + Boolean.hashCode(this.doesAboutTextOverflow)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "AboutV2ViewState(aboutText=" + this.aboutText + ", infoList=" + this.infoList + ", expandBtnColor=" + this.expandBtnColor + ", doesAboutTextOverflow=" + this.doesAboutTextOverflow + ", isExpanded=" + this.isExpanded + ", isLoading=" + this.isLoading + ")";
    }

    public AboutV2ViewState(String str, ImmutableList3<AboutV2Info> infoList, AboutV2ViewState2 expandBtnColor, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(infoList, "infoList");
        Intrinsics.checkNotNullParameter(expandBtnColor, "expandBtnColor");
        this.aboutText = str;
        this.infoList = infoList;
        this.expandBtnColor = expandBtnColor;
        this.doesAboutTextOverflow = z;
        this.isExpanded = z2;
        this.isLoading = z3;
    }

    public final String getAboutText() {
        return this.aboutText;
    }

    public final ImmutableList3<AboutV2Info> getInfoList() {
        return this.infoList;
    }

    public final AboutV2ViewState2 getExpandBtnColor() {
        return this.expandBtnColor;
    }

    public final boolean getDoesAboutTextOverflow() {
        return this.doesAboutTextOverflow;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
