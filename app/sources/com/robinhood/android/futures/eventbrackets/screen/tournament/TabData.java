package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventsTournamentBracketViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/TabData;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TabData {
    public static final int $stable = StringResource.$stable;
    private final StringResource title;

    public static /* synthetic */ TabData copy$default(TabData tabData, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = tabData.title;
        }
        return tabData.copy(stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final TabData copy(StringResource title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TabData(title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TabData) && Intrinsics.areEqual(this.title, ((TabData) other).title);
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "TabData(title=" + this.title + ")";
    }

    public TabData(StringResource title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
    }

    public final StringResource getTitle() {
        return this.title;
    }
}
