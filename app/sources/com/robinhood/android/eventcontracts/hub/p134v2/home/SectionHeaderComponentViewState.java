package com.robinhood.android.eventcontracts.hub.p134v2.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubDefaultCategoryContentViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/SectionHeaderComponentViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubSectionGroup;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "sectionIdentifier", "getSectionIdentifier", "identifier", "getIdentifier", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionHeaderComponentViewState implements HubDefaultCategoryContentViewState3, HubDefaultCategoryContentViewState4 {
    public static final int $stable = 0;
    private final String title;

    public static /* synthetic */ SectionHeaderComponentViewState copy$default(SectionHeaderComponentViewState sectionHeaderComponentViewState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectionHeaderComponentViewState.title;
        }
        return sectionHeaderComponentViewState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final SectionHeaderComponentViewState copy(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SectionHeaderComponentViewState(title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SectionHeaderComponentViewState) && Intrinsics.areEqual(this.title, ((SectionHeaderComponentViewState) other).title);
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "SectionHeaderComponentViewState(title=" + this.title + ")";
    }

    public SectionHeaderComponentViewState(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState4
    public String getSectionIdentifier() {
        return this.title;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState3
    public String getIdentifier() {
        return "section-header-" + this.title;
    }
}
