package com.robinhood.android.taxcenter.timelineinfo;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxTimelineInfoDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoDataState;", "", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "ctaContent", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getCtaContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TaxTimelineInfoDataState {
    public static final int $stable = 8;
    private final List<UIComponent<GenericAction>> content;
    private final List<UIComponent<GenericAction>> ctaContent;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxTimelineInfoDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxTimelineInfoDataState copy$default(TaxTimelineInfoDataState taxTimelineInfoDataState, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxTimelineInfoDataState.content;
        }
        if ((i & 2) != 0) {
            list2 = taxTimelineInfoDataState.ctaContent;
        }
        return taxTimelineInfoDataState.copy(list, list2);
    }

    public final List<UIComponent<GenericAction>> component1() {
        return this.content;
    }

    public final List<UIComponent<GenericAction>> component2() {
        return this.ctaContent;
    }

    public final TaxTimelineInfoDataState copy(List<? extends UIComponent<? extends GenericAction>> content, List<? extends UIComponent<? extends GenericAction>> ctaContent) {
        return new TaxTimelineInfoDataState(content, ctaContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxTimelineInfoDataState)) {
            return false;
        }
        TaxTimelineInfoDataState taxTimelineInfoDataState = (TaxTimelineInfoDataState) other;
        return Intrinsics.areEqual(this.content, taxTimelineInfoDataState.content) && Intrinsics.areEqual(this.ctaContent, taxTimelineInfoDataState.ctaContent);
    }

    public int hashCode() {
        List<UIComponent<GenericAction>> list = this.content;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UIComponent<GenericAction>> list2 = this.ctaContent;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "TaxTimelineInfoDataState(content=" + this.content + ", ctaContent=" + this.ctaContent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxTimelineInfoDataState(List<? extends UIComponent<? extends GenericAction>> list, List<? extends UIComponent<? extends GenericAction>> list2) {
        this.content = list;
        this.ctaContent = list2;
    }

    public /* synthetic */ TaxTimelineInfoDataState(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public final List<UIComponent<GenericAction>> getContent() {
        return this.content;
    }

    public final List<UIComponent<GenericAction>> getCtaContent() {
        return this.ctaContent;
    }
}
