package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CitedDetails.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails;", "", "citedDetailsType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetailsType;", "getCitedDetailsType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetailsType;", "InlineMetadataCitedDetails", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails$InlineMetadataCitedDetails;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CitedDetails {
    CitedDetailsType getCitedDetailsType();

    /* compiled from: CitedDetails.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails$InlineMetadataCitedDetails;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetails;", "inlineMetadata", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedInlineMetadata;", "<init>", "(Ljava/util/List;)V", "getInlineMetadata", "()Ljava/util/List;", "citedDetailsType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetailsType;", "getCitedDetailsType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetailsType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class InlineMetadataCitedDetails implements CitedDetails {
        private final CitedDetailsType citedDetailsType;
        private final List<CitedInlineMetadata> inlineMetadata;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineMetadataCitedDetails copy$default(InlineMetadataCitedDetails inlineMetadataCitedDetails, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = inlineMetadataCitedDetails.inlineMetadata;
            }
            return inlineMetadataCitedDetails.copy(list);
        }

        public final List<CitedInlineMetadata> component1() {
            return this.inlineMetadata;
        }

        public final InlineMetadataCitedDetails copy(List<CitedInlineMetadata> inlineMetadata) {
            Intrinsics.checkNotNullParameter(inlineMetadata, "inlineMetadata");
            return new InlineMetadataCitedDetails(inlineMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineMetadataCitedDetails) && Intrinsics.areEqual(this.inlineMetadata, ((InlineMetadataCitedDetails) other).inlineMetadata);
        }

        public int hashCode() {
            return this.inlineMetadata.hashCode();
        }

        public String toString() {
            return "InlineMetadataCitedDetails(inlineMetadata=" + this.inlineMetadata + ")";
        }

        public InlineMetadataCitedDetails(List<CitedInlineMetadata> inlineMetadata) {
            Intrinsics.checkNotNullParameter(inlineMetadata, "inlineMetadata");
            this.inlineMetadata = inlineMetadata;
            this.citedDetailsType = CitedDetailsType.InlineMetadata;
        }

        public final List<CitedInlineMetadata> getInlineMetadata() {
            return this.inlineMetadata;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations.CitedDetails
        public CitedDetailsType getCitedDetailsType() {
            return this.citedDetailsType;
        }
    }
}
