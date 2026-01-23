package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CitedReference.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference;", "", "citedReferenceType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReferenceType;", "getCitedReferenceType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReferenceType;", "LinkCitedReference", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference$LinkCitedReference;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CitedReference {
    CitedReferenceType getCitedReferenceType();

    /* compiled from: CitedReference.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference$LinkCitedReference;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReference;", "link", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationLink;", "recordId", "", AnnotatedPrivateKey.LABEL, "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationLink;Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationLink;", "getRecordId", "()Ljava/lang/String;", "getLabel", "citedReferenceType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReferenceType;", "getCitedReferenceType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReferenceType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class LinkCitedReference implements CitedReference {
        private final CitedReferenceType citedReferenceType;
        private final String label;
        private final CitationLink link;
        private final String recordId;

        public static /* synthetic */ LinkCitedReference copy$default(LinkCitedReference linkCitedReference, CitationLink citationLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                citationLink = linkCitedReference.link;
            }
            if ((i & 2) != 0) {
                str = linkCitedReference.recordId;
            }
            if ((i & 4) != 0) {
                str2 = linkCitedReference.label;
            }
            return linkCitedReference.copy(citationLink, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final CitationLink getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRecordId() {
            return this.recordId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final LinkCitedReference copy(CitationLink link, String recordId, String label) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new LinkCitedReference(link, recordId, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkCitedReference)) {
                return false;
            }
            LinkCitedReference linkCitedReference = (LinkCitedReference) other;
            return Intrinsics.areEqual(this.link, linkCitedReference.link) && Intrinsics.areEqual(this.recordId, linkCitedReference.recordId) && Intrinsics.areEqual(this.label, linkCitedReference.label);
        }

        public int hashCode() {
            int iHashCode = this.link.hashCode() * 31;
            String str = this.recordId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "LinkCitedReference(link=" + this.link + ", recordId=" + this.recordId + ", label=" + this.label + ")";
        }

        public LinkCitedReference(CitationLink link, String str, String str2) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.recordId = str;
            this.label = str2;
            this.citedReferenceType = CitedReferenceType.Link;
        }

        public /* synthetic */ LinkCitedReference(CitationLink citationLink, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(citationLink, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final CitationLink getLink() {
            return this.link;
        }

        public final String getRecordId() {
            return this.recordId;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations.CitedReference
        public CitedReferenceType getCitedReferenceType() {
            return this.citedReferenceType;
        }
    }
}
