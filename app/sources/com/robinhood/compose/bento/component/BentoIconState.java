package com.robinhood.compose.bento.component;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoIcon.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconState;", "", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "contentDescription", "", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;Ljava/lang/String;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "getContentDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoIconState {
    public static final int $stable = 0;
    private final String contentDescription;
    private final BentoIcon4 icon;

    public static /* synthetic */ BentoIconState copy$default(BentoIconState bentoIconState, BentoIcon4 bentoIcon4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bentoIcon4 = bentoIconState.icon;
        }
        if ((i & 2) != 0) {
            str = bentoIconState.contentDescription;
        }
        return bentoIconState.copy(bentoIcon4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final BentoIconState copy(BentoIcon4 icon, String contentDescription) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new BentoIconState(icon, contentDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoIconState)) {
            return false;
        }
        BentoIconState bentoIconState = (BentoIconState) other;
        return Intrinsics.areEqual(this.icon, bentoIconState.icon) && Intrinsics.areEqual(this.contentDescription, bentoIconState.contentDescription);
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        String str = this.contentDescription;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BentoIconState(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ")";
    }

    public BentoIconState(BentoIcon4 icon, String str) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.icon = icon;
        this.contentDescription = str;
    }

    public /* synthetic */ BentoIconState(BentoIcon4 bentoIcon4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bentoIcon4, (i & 2) != 0 ? null : str);
    }

    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }
}
