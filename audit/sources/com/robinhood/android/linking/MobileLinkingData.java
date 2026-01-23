package com.robinhood.android.linking;

import com.robinhood.android.store.linking.LinkingGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/linking/MobileLinkingData;", "", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "callbacks", "Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;Lcom/robinhood/android/linking/MobileLinkingCallbacks;)V", "getLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "getCallbacks", "()Lcom/robinhood/android/linking/MobileLinkingCallbacks;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MobileLinkingData {
    public static final int $stable = 8;
    private final MobileLinkingData2 callbacks;
    private final LinkingGroup linkingGroup;

    public static /* synthetic */ MobileLinkingData copy$default(MobileLinkingData mobileLinkingData, LinkingGroup linkingGroup, MobileLinkingData2 mobileLinkingData2, int i, Object obj) {
        if ((i & 1) != 0) {
            linkingGroup = mobileLinkingData.linkingGroup;
        }
        if ((i & 2) != 0) {
            mobileLinkingData2 = mobileLinkingData.callbacks;
        }
        return mobileLinkingData.copy(linkingGroup, mobileLinkingData2);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkingGroup getLinkingGroup() {
        return this.linkingGroup;
    }

    /* renamed from: component2, reason: from getter */
    public final MobileLinkingData2 getCallbacks() {
        return this.callbacks;
    }

    public final MobileLinkingData copy(LinkingGroup linkingGroup, MobileLinkingData2 callbacks) {
        Intrinsics.checkNotNullParameter(linkingGroup, "linkingGroup");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        return new MobileLinkingData(linkingGroup, callbacks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLinkingData)) {
            return false;
        }
        MobileLinkingData mobileLinkingData = (MobileLinkingData) other;
        return Intrinsics.areEqual(this.linkingGroup, mobileLinkingData.linkingGroup) && Intrinsics.areEqual(this.callbacks, mobileLinkingData.callbacks);
    }

    public int hashCode() {
        return (this.linkingGroup.hashCode() * 31) + this.callbacks.hashCode();
    }

    public String toString() {
        return "MobileLinkingData(linkingGroup=" + this.linkingGroup + ", callbacks=" + this.callbacks + ")";
    }

    public MobileLinkingData(LinkingGroup linkingGroup, MobileLinkingData2 callbacks) {
        Intrinsics.checkNotNullParameter(linkingGroup, "linkingGroup");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.linkingGroup = linkingGroup;
        this.callbacks = callbacks;
    }

    public final LinkingGroup getLinkingGroup() {
        return this.linkingGroup;
    }

    public final MobileLinkingData2 getCallbacks() {
        return this.callbacks;
    }
}
