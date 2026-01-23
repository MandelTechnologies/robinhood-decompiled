package com.robinhood.android.taxcenter.timelineinfo;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxTimelineInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState;", "", "<init>", "()V", "Loading", "Ready", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState$Loading;", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState$Ready;", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TaxTimelineInfoViewState {
    public static final int $stable = 0;

    public /* synthetic */ TaxTimelineInfoViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TaxTimelineInfoViewState() {
    }

    /* compiled from: TaxTimelineInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState$Loading;", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends TaxTimelineInfoViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1556441757;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: TaxTimelineInfoViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState$Ready;", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState;", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "ctaContent", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getCtaContent", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready extends TaxTimelineInfoViewState {
        public static final int $stable = 8;
        private final List<UIComponent<GenericAction>> content;
        private final List<UIComponent<GenericAction>> ctaContent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ready.content;
            }
            if ((i & 2) != 0) {
                list2 = ready.ctaContent;
            }
            return ready.copy(list, list2);
        }

        public final List<UIComponent<GenericAction>> component1() {
            return this.content;
        }

        public final List<UIComponent<GenericAction>> component2() {
            return this.ctaContent;
        }

        public final Ready copy(List<? extends UIComponent<? extends GenericAction>> content, List<? extends UIComponent<? extends GenericAction>> ctaContent) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Ready(content, ctaContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.content, ready.content) && Intrinsics.areEqual(this.ctaContent, ready.ctaContent);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            List<UIComponent<GenericAction>> list = this.ctaContent;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Ready(content=" + this.content + ", ctaContent=" + this.ctaContent + ")";
        }

        public final List<UIComponent<GenericAction>> getContent() {
            return this.content;
        }

        public final List<UIComponent<GenericAction>> getCtaContent() {
            return this.ctaContent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(List<? extends UIComponent<? extends GenericAction>> content, List<? extends UIComponent<? extends GenericAction>> list) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.ctaContent = list;
        }
    }
}
