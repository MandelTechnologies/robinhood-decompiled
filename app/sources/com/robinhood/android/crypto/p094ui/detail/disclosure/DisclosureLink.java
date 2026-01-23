package com.robinhood.android.crypto.p094ui.detail.disclosure;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/disclosure/DisclosureLink;", "", "textRes", "", "contentfulId", "", "<init>", "(ILjava/lang/String;)V", "getTextRes", "()I", "getContentfulId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DisclosureLink {
    public static final int $stable = 0;
    private final String contentfulId;
    private final int textRes;

    public static /* synthetic */ DisclosureLink copy$default(DisclosureLink disclosureLink, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = disclosureLink.textRes;
        }
        if ((i2 & 2) != 0) {
            str = disclosureLink.contentfulId;
        }
        return disclosureLink.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final DisclosureLink copy(int textRes, String contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        return new DisclosureLink(textRes, contentfulId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureLink)) {
            return false;
        }
        DisclosureLink disclosureLink = (DisclosureLink) other;
        return this.textRes == disclosureLink.textRes && Intrinsics.areEqual(this.contentfulId, disclosureLink.contentfulId);
    }

    public int hashCode() {
        return (Integer.hashCode(this.textRes) * 31) + this.contentfulId.hashCode();
    }

    public String toString() {
        return "DisclosureLink(textRes=" + this.textRes + ", contentfulId=" + this.contentfulId + ")";
    }

    public DisclosureLink(int i, String contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        this.textRes = i;
        this.contentfulId = contentfulId;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }
}
