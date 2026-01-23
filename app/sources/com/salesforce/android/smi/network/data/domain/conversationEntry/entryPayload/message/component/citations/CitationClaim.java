package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

/* compiled from: CitationClaim.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationClaim;", "", "claimStartOffset", "", "claimEndOffset", "<init>", "(II)V", "getClaimStartOffset", "()I", "getClaimEndOffset", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CitationClaim {
    private final int claimEndOffset;
    private final int claimStartOffset;

    public static /* synthetic */ CitationClaim copy$default(CitationClaim citationClaim, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = citationClaim.claimStartOffset;
        }
        if ((i3 & 2) != 0) {
            i2 = citationClaim.claimEndOffset;
        }
        return citationClaim.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getClaimStartOffset() {
        return this.claimStartOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final int getClaimEndOffset() {
        return this.claimEndOffset;
    }

    public final CitationClaim copy(int claimStartOffset, int claimEndOffset) {
        return new CitationClaim(claimStartOffset, claimEndOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitationClaim)) {
            return false;
        }
        CitationClaim citationClaim = (CitationClaim) other;
        return this.claimStartOffset == citationClaim.claimStartOffset && this.claimEndOffset == citationClaim.claimEndOffset;
    }

    public int hashCode() {
        return (Integer.hashCode(this.claimStartOffset) * 31) + Integer.hashCode(this.claimEndOffset);
    }

    public String toString() {
        return "CitationClaim(claimStartOffset=" + this.claimStartOffset + ", claimEndOffset=" + this.claimEndOffset + ")";
    }

    public CitationClaim(int i, int i2) {
        this.claimStartOffset = i;
        this.claimEndOffset = i2;
    }

    public final int getClaimStartOffset() {
        return this.claimStartOffset;
    }

    public final int getClaimEndOffset() {
        return this.claimEndOffset;
    }
}
