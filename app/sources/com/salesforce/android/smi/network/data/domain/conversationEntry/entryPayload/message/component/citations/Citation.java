package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Citation.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/Citation;", "", "citedReference", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference;", "citedDetails", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails;)V", "getCitedReference", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference;", "getCitedDetails", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Citation {
    private final CitedDetails citedDetails;
    private final CitedReference citedReference;

    public static /* synthetic */ Citation copy$default(Citation citation, CitedReference citedReference, CitedDetails citedDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            citedReference = citation.citedReference;
        }
        if ((i & 2) != 0) {
            citedDetails = citation.citedDetails;
        }
        return citation.copy(citedReference, citedDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final CitedReference getCitedReference() {
        return this.citedReference;
    }

    /* renamed from: component2, reason: from getter */
    public final CitedDetails getCitedDetails() {
        return this.citedDetails;
    }

    public final Citation copy(CitedReference citedReference, CitedDetails citedDetails) {
        Intrinsics.checkNotNullParameter(citedReference, "citedReference");
        return new Citation(citedReference, citedDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Citation)) {
            return false;
        }
        Citation citation = (Citation) other;
        return Intrinsics.areEqual(this.citedReference, citation.citedReference) && Intrinsics.areEqual(this.citedDetails, citation.citedDetails);
    }

    public int hashCode() {
        int iHashCode = this.citedReference.hashCode() * 31;
        CitedDetails citedDetails = this.citedDetails;
        return iHashCode + (citedDetails == null ? 0 : citedDetails.hashCode());
    }

    public String toString() {
        return "Citation(citedReference=" + this.citedReference + ", citedDetails=" + this.citedDetails + ")";
    }

    public Citation(CitedReference citedReference, CitedDetails citedDetails) {
        Intrinsics.checkNotNullParameter(citedReference, "citedReference");
        this.citedReference = citedReference;
        this.citedDetails = citedDetails;
    }

    public /* synthetic */ Citation(CitedReference citedReference, CitedDetails citedDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(citedReference, (i & 2) != 0 ? null : citedDetails);
    }

    public final CitedReference getCitedReference() {
        return this.citedReference;
    }

    public final CitedDetails getCitedDetails() {
        return this.citedDetails;
    }
}
