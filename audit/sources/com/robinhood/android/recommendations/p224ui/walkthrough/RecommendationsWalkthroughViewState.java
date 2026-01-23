package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: RecommendationsWalkthroughViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\u009b\u0001\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u000fHÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010$\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010&\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0011\u0010'\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0014\u0010)\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010!¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughViewState;", "", "pages", "", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "currentPage", "backEvent", "Lcom/robinhood/udf/UiEvent;", "", "showSummaryEvent", "animateEvent", "animateProgress", "reverseAnimation", "", "startFrame", "", "endFrame", "portfolioWeights", "", "<init>", "(Ljava/util/List;Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZIILjava/util/List;)V", "getPages", "()Ljava/util/List;", "getCurrentPage", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "getBackEvent", "()Lcom/robinhood/udf/UiEvent;", "getShowSummaryEvent", "getAnimateEvent", "getAnimateProgress", "getReverseAnimation", "()Z", "getStartFrame", "()I", "getEndFrame", "getPortfolioWeights", "progress", "getProgress", "isProgressBarVisible", "hideToolbar", "getHideToolbar", "currentPageIndex", "getCurrentPageIndex", "getNavigationIconDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsWalkthroughViewState {
    private final UiEvent<Unit> animateEvent;
    private final UiEvent<Unit> animateProgress;
    private final UiEvent<Unit> backEvent;
    private final RecommendationsWalkthroughPage currentPage;
    private final int endFrame;
    private final List<RecommendationsWalkthroughPage> pages;
    private final List<Float> portfolioWeights;
    private final boolean reverseAnimation;
    private final UiEvent<Unit> showSummaryEvent;
    private final int startFrame;

    public RecommendationsWalkthroughViewState() {
        this(null, null, null, null, null, null, false, 0, 0, null, 1023, null);
    }

    public static /* synthetic */ RecommendationsWalkthroughViewState copy$default(RecommendationsWalkthroughViewState recommendationsWalkthroughViewState, List list, RecommendationsWalkthroughPage recommendationsWalkthroughPage, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z, int i, int i2, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = recommendationsWalkthroughViewState.pages;
        }
        if ((i3 & 2) != 0) {
            recommendationsWalkthroughPage = recommendationsWalkthroughViewState.currentPage;
        }
        if ((i3 & 4) != 0) {
            uiEvent = recommendationsWalkthroughViewState.backEvent;
        }
        if ((i3 & 8) != 0) {
            uiEvent2 = recommendationsWalkthroughViewState.showSummaryEvent;
        }
        if ((i3 & 16) != 0) {
            uiEvent3 = recommendationsWalkthroughViewState.animateEvent;
        }
        if ((i3 & 32) != 0) {
            uiEvent4 = recommendationsWalkthroughViewState.animateProgress;
        }
        if ((i3 & 64) != 0) {
            z = recommendationsWalkthroughViewState.reverseAnimation;
        }
        if ((i3 & 128) != 0) {
            i = recommendationsWalkthroughViewState.startFrame;
        }
        if ((i3 & 256) != 0) {
            i2 = recommendationsWalkthroughViewState.endFrame;
        }
        if ((i3 & 512) != 0) {
            list2 = recommendationsWalkthroughViewState.portfolioWeights;
        }
        int i4 = i2;
        List list3 = list2;
        boolean z2 = z;
        int i5 = i;
        UiEvent uiEvent5 = uiEvent3;
        UiEvent uiEvent6 = uiEvent4;
        return recommendationsWalkthroughViewState.copy(list, recommendationsWalkthroughPage, uiEvent, uiEvent2, uiEvent5, uiEvent6, z2, i5, i4, list3);
    }

    public final List<RecommendationsWalkthroughPage> component1() {
        return this.pages;
    }

    public final List<Float> component10() {
        return this.portfolioWeights;
    }

    /* renamed from: component2, reason: from getter */
    public final RecommendationsWalkthroughPage getCurrentPage() {
        return this.currentPage;
    }

    public final UiEvent<Unit> component3() {
        return this.backEvent;
    }

    public final UiEvent<Unit> component4() {
        return this.showSummaryEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.animateEvent;
    }

    public final UiEvent<Unit> component6() {
        return this.animateProgress;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getReverseAnimation() {
        return this.reverseAnimation;
    }

    /* renamed from: component8, reason: from getter */
    public final int getStartFrame() {
        return this.startFrame;
    }

    /* renamed from: component9, reason: from getter */
    public final int getEndFrame() {
        return this.endFrame;
    }

    public final RecommendationsWalkthroughViewState copy(List<? extends RecommendationsWalkthroughPage> pages, RecommendationsWalkthroughPage currentPage, UiEvent<Unit> backEvent, UiEvent<Unit> showSummaryEvent, UiEvent<Unit> animateEvent, UiEvent<Unit> animateProgress, boolean reverseAnimation, int startFrame, int endFrame, List<Float> portfolioWeights) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(portfolioWeights, "portfolioWeights");
        return new RecommendationsWalkthroughViewState(pages, currentPage, backEvent, showSummaryEvent, animateEvent, animateProgress, reverseAnimation, startFrame, endFrame, portfolioWeights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsWalkthroughViewState)) {
            return false;
        }
        RecommendationsWalkthroughViewState recommendationsWalkthroughViewState = (RecommendationsWalkthroughViewState) other;
        return Intrinsics.areEqual(this.pages, recommendationsWalkthroughViewState.pages) && Intrinsics.areEqual(this.currentPage, recommendationsWalkthroughViewState.currentPage) && Intrinsics.areEqual(this.backEvent, recommendationsWalkthroughViewState.backEvent) && Intrinsics.areEqual(this.showSummaryEvent, recommendationsWalkthroughViewState.showSummaryEvent) && Intrinsics.areEqual(this.animateEvent, recommendationsWalkthroughViewState.animateEvent) && Intrinsics.areEqual(this.animateProgress, recommendationsWalkthroughViewState.animateProgress) && this.reverseAnimation == recommendationsWalkthroughViewState.reverseAnimation && this.startFrame == recommendationsWalkthroughViewState.startFrame && this.endFrame == recommendationsWalkthroughViewState.endFrame && Intrinsics.areEqual(this.portfolioWeights, recommendationsWalkthroughViewState.portfolioWeights);
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode() * 31;
        RecommendationsWalkthroughPage recommendationsWalkthroughPage = this.currentPage;
        int iHashCode2 = (iHashCode + (recommendationsWalkthroughPage == null ? 0 : recommendationsWalkthroughPage.hashCode())) * 31;
        UiEvent<Unit> uiEvent = this.backEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.showSummaryEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.animateEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.animateProgress;
        return ((((((((iHashCode5 + (uiEvent4 != null ? uiEvent4.hashCode() : 0)) * 31) + Boolean.hashCode(this.reverseAnimation)) * 31) + Integer.hashCode(this.startFrame)) * 31) + Integer.hashCode(this.endFrame)) * 31) + this.portfolioWeights.hashCode();
    }

    public String toString() {
        return "RecommendationsWalkthroughViewState(pages=" + this.pages + ", currentPage=" + this.currentPage + ", backEvent=" + this.backEvent + ", showSummaryEvent=" + this.showSummaryEvent + ", animateEvent=" + this.animateEvent + ", animateProgress=" + this.animateProgress + ", reverseAnimation=" + this.reverseAnimation + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", portfolioWeights=" + this.portfolioWeights + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsWalkthroughViewState(List<? extends RecommendationsWalkthroughPage> pages, RecommendationsWalkthroughPage recommendationsWalkthroughPage, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, boolean z, int i, int i2, List<Float> portfolioWeights) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(portfolioWeights, "portfolioWeights");
        this.pages = pages;
        this.currentPage = recommendationsWalkthroughPage;
        this.backEvent = uiEvent;
        this.showSummaryEvent = uiEvent2;
        this.animateEvent = uiEvent3;
        this.animateProgress = uiEvent4;
        this.reverseAnimation = z;
        this.startFrame = i;
        this.endFrame = i2;
        this.portfolioWeights = portfolioWeights;
    }

    public /* synthetic */ RecommendationsWalkthroughViewState(List list, RecommendationsWalkthroughPage recommendationsWalkthroughPage, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z, int i, int i2, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? null : recommendationsWalkthroughPage, (i3 & 4) != 0 ? null : uiEvent, (i3 & 8) != 0 ? null : uiEvent2, (i3 & 16) != 0 ? null : uiEvent3, (i3 & 32) != 0 ? null : uiEvent4, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<RecommendationsWalkthroughPage> getPages() {
        return this.pages;
    }

    public final RecommendationsWalkthroughPage getCurrentPage() {
        return this.currentPage;
    }

    public final UiEvent<Unit> getBackEvent() {
        return this.backEvent;
    }

    public final UiEvent<Unit> getShowSummaryEvent() {
        return this.showSummaryEvent;
    }

    public final UiEvent<Unit> getAnimateEvent() {
        return this.animateEvent;
    }

    public final UiEvent<Unit> getAnimateProgress() {
        return this.animateProgress;
    }

    public final boolean getReverseAnimation() {
        return this.reverseAnimation;
    }

    public final int getStartFrame() {
        return this.startFrame;
    }

    public final int getEndFrame() {
        return this.endFrame;
    }

    public final List<Float> getPortfolioWeights() {
        return this.portfolioWeights;
    }

    public final int getProgress() {
        return MathKt.roundToInt((getCurrentPageIndex() / (this.pages.size() - 2)) * 100.0f);
    }

    public final boolean isProgressBarVisible() {
        RecommendationsWalkthroughPage recommendationsWalkthroughPage = this.currentPage;
        return (recommendationsWalkthroughPage != null ? recommendationsWalkthroughPage.getAnimationType() : null) != RecommendationsWalkthroughPage.AnimationType.PORTFOLIO_VIEW_WEIGHTED;
    }

    public final boolean getHideToolbar() {
        return !this.pages.isEmpty() && Intrinsics.areEqual(this.currentPage, CollectionsKt.last((List) this.pages));
    }

    private final int getCurrentPageIndex() {
        return CollectionsKt.indexOf((List<? extends RecommendationsWalkthroughPage>) this.pages, this.currentPage);
    }

    public final Drawable getNavigationIconDrawable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable themeDrawable = Contexts7.getThemeDrawable(context, Intrinsics.areEqual(this.currentPage, CollectionsKt.getOrNull(this.pages, 0)) ? C20690R.attr.iconClose24dp : C20690R.attr.iconArrowLeft24dp);
        if (themeDrawable != null) {
            themeDrawable.setTint(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        }
        return themeDrawable;
    }
}
