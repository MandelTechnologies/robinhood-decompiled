package com.robinhood.android.portfolio.curatedlist.createScreenerOrList;

import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateCardRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/BadgeData;", "", "text", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "<init>", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoIcons;)V", "getText", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-curated-list_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BadgeData {
    public static final int $stable = BentoIcon4.$stable;
    private final BentoIcon4 icon;
    private final String text;

    public static /* synthetic */ BadgeData copy$default(BadgeData badgeData, String str, BentoIcon4 bentoIcon4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = badgeData.text;
        }
        if ((i & 2) != 0) {
            bentoIcon4 = badgeData.icon;
        }
        return badgeData.copy(str, bentoIcon4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    public final BadgeData copy(String text, BentoIcon4 icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new BadgeData(text, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeData)) {
            return false;
        }
        BadgeData badgeData = (BadgeData) other;
        return Intrinsics.areEqual(this.text, badgeData.text) && Intrinsics.areEqual(this.icon, badgeData.icon);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "BadgeData(text=" + this.text + ", icon=" + this.icon + ")";
    }

    public BadgeData(String text, BentoIcon4 icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.text = text;
        this.icon = icon;
    }

    public final String getText() {
        return this.text;
    }

    public final BentoIcon4 getIcon() {
        return this.icon;
    }
}
