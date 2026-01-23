package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CitationContent.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitationContent;", "", "citations", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/Citation;", "<init>", "(Ljava/util/List;)V", "getCitations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CitationContent {
    private final List<Citation> citations;

    /* JADX WARN: Multi-variable type inference failed */
    public CitationContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CitationContent copy$default(CitationContent citationContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = citationContent.citations;
        }
        return citationContent.copy(list);
    }

    public final List<Citation> component1() {
        return this.citations;
    }

    public final CitationContent copy(List<Citation> citations) {
        Intrinsics.checkNotNullParameter(citations, "citations");
        return new CitationContent(citations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CitationContent) && Intrinsics.areEqual(this.citations, ((CitationContent) other).citations);
    }

    public int hashCode() {
        return this.citations.hashCode();
    }

    public String toString() {
        return "CitationContent(citations=" + this.citations + ")";
    }

    public CitationContent(List<Citation> citations) {
        Intrinsics.checkNotNullParameter(citations, "citations");
        this.citations = citations;
    }

    public /* synthetic */ CitationContent(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Citation> getCitations() {
        return this.citations;
    }
}
