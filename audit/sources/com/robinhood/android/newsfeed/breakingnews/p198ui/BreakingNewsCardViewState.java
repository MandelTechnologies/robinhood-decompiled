package com.robinhood.android.newsfeed.breakingnews.p198ui;

import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BreakingNewsCardWrapper.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardViewState;", "", "breakingNews", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "<init>", "(Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;)V", "getBreakingNews", "()Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-breakingnews-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BreakingNewsCardViewState {
    public static final int $stable = 8;
    private final BreakingNews breakingNews;

    /* JADX WARN: Multi-variable type inference failed */
    public BreakingNewsCardViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BreakingNewsCardViewState copy$default(BreakingNewsCardViewState breakingNewsCardViewState, BreakingNews breakingNews, int i, Object obj) {
        if ((i & 1) != 0) {
            breakingNews = breakingNewsCardViewState.breakingNews;
        }
        return breakingNewsCardViewState.copy(breakingNews);
    }

    /* renamed from: component1, reason: from getter */
    public final BreakingNews getBreakingNews() {
        return this.breakingNews;
    }

    public final BreakingNewsCardViewState copy(BreakingNews breakingNews) {
        return new BreakingNewsCardViewState(breakingNews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BreakingNewsCardViewState) && Intrinsics.areEqual(this.breakingNews, ((BreakingNewsCardViewState) other).breakingNews);
    }

    public int hashCode() {
        BreakingNews breakingNews = this.breakingNews;
        if (breakingNews == null) {
            return 0;
        }
        return breakingNews.hashCode();
    }

    public String toString() {
        return "BreakingNewsCardViewState(breakingNews=" + this.breakingNews + ")";
    }

    public BreakingNewsCardViewState(BreakingNews breakingNews) {
        this.breakingNews = breakingNews;
    }

    public /* synthetic */ BreakingNewsCardViewState(BreakingNews breakingNews, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : breakingNews);
    }

    public final BreakingNews getBreakingNews() {
        return this.breakingNews;
    }
}
