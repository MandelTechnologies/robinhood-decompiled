package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: McwDataModels.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/Cta;", "", "title", "", "deeplink", "loggingIdentifier", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "getLoggingIdentifier", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Cta {
    public static final int $stable = 0;
    private final String deeplink;
    private final UserInteractionEventData.Action loggingAction;
    private final String loggingIdentifier;
    private final String title;

    public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, String str3, UserInteractionEventData.Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cta.title;
        }
        if ((i & 2) != 0) {
            str2 = cta.deeplink;
        }
        if ((i & 4) != 0) {
            str3 = cta.loggingIdentifier;
        }
        if ((i & 8) != 0) {
            action = cta.loggingAction;
        }
        return cta.copy(str, str2, str3, action);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final UserInteractionEventData.Action getLoggingAction() {
        return this.loggingAction;
    }

    public final Cta copy(String title, String deeplink, String loggingIdentifier, UserInteractionEventData.Action loggingAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(loggingAction, "loggingAction");
        return new Cta(title, deeplink, loggingIdentifier, loggingAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) other;
        return Intrinsics.areEqual(this.title, cta.title) && Intrinsics.areEqual(this.deeplink, cta.deeplink) && Intrinsics.areEqual(this.loggingIdentifier, cta.loggingIdentifier) && this.loggingAction == cta.loggingAction;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.deeplink.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31) + this.loggingAction.hashCode();
    }

    public String toString() {
        return "Cta(title=" + this.title + ", deeplink=" + this.deeplink + ", loggingIdentifier=" + this.loggingIdentifier + ", loggingAction=" + this.loggingAction + ")";
    }

    public Cta(String title, String deeplink, String loggingIdentifier, UserInteractionEventData.Action loggingAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(loggingAction, "loggingAction");
        this.title = title;
        this.deeplink = deeplink;
        this.loggingIdentifier = loggingIdentifier;
        this.loggingAction = loggingAction;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final UserInteractionEventData.Action getLoggingAction() {
        return this.loggingAction;
    }
}
