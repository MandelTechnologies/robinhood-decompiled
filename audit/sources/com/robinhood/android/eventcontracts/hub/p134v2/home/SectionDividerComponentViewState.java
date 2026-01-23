package com.robinhood.android.eventcontracts.hub.p134v2.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: HubDefaultCategoryContentViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/SectionDividerComponentViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "identifier", "getIdentifier", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionDividerComponentViewState implements HubDefaultCategoryContentViewState3 {
    public static final int $stable = 0;
    private final String label;

    public static /* synthetic */ SectionDividerComponentViewState copy$default(SectionDividerComponentViewState sectionDividerComponentViewState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectionDividerComponentViewState.label;
        }
        return sectionDividerComponentViewState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final SectionDividerComponentViewState copy(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new SectionDividerComponentViewState(label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SectionDividerComponentViewState) && Intrinsics.areEqual(this.label, ((SectionDividerComponentViewState) other).label);
    }

    public int hashCode() {
        return this.label.hashCode();
    }

    public String toString() {
        return "SectionDividerComponentViewState(label=" + this.label + ")";
    }

    public SectionDividerComponentViewState(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState3
    public String getIdentifier() {
        return "section-divider-" + this.label;
    }
}
