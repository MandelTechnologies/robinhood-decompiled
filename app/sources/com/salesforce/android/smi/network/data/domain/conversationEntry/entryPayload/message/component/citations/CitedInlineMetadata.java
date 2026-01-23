package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CitedInlineMetadata.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedInlineMetadata;", "", "claim", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationClaim;", "citedLocationOffset", "", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationClaim;I)V", "getClaim", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationClaim;", "getCitedLocationOffset", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CitedInlineMetadata {
    private final int citedLocationOffset;
    private final CitationClaim claim;

    public static /* synthetic */ CitedInlineMetadata copy$default(CitedInlineMetadata citedInlineMetadata, CitationClaim citationClaim, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            citationClaim = citedInlineMetadata.claim;
        }
        if ((i2 & 2) != 0) {
            i = citedInlineMetadata.citedLocationOffset;
        }
        return citedInlineMetadata.copy(citationClaim, i);
    }

    /* renamed from: component1, reason: from getter */
    public final CitationClaim getClaim() {
        return this.claim;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCitedLocationOffset() {
        return this.citedLocationOffset;
    }

    public final CitedInlineMetadata copy(CitationClaim claim, int citedLocationOffset) {
        return new CitedInlineMetadata(claim, citedLocationOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitedInlineMetadata)) {
            return false;
        }
        CitedInlineMetadata citedInlineMetadata = (CitedInlineMetadata) other;
        return Intrinsics.areEqual(this.claim, citedInlineMetadata.claim) && this.citedLocationOffset == citedInlineMetadata.citedLocationOffset;
    }

    public int hashCode() {
        CitationClaim citationClaim = this.claim;
        return ((citationClaim == null ? 0 : citationClaim.hashCode()) * 31) + Integer.hashCode(this.citedLocationOffset);
    }

    public String toString() {
        return "CitedInlineMetadata(claim=" + this.claim + ", citedLocationOffset=" + this.citedLocationOffset + ")";
    }

    public CitedInlineMetadata(CitationClaim citationClaim, int i) {
        this.claim = citationClaim;
        this.citedLocationOffset = i;
    }

    public final CitationClaim getClaim() {
        return this.claim;
    }

    public final int getCitedLocationOffset() {
        return this.citedLocationOffset;
    }
}
