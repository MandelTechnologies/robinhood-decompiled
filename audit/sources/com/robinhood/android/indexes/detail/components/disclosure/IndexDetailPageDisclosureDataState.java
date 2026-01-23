package com.robinhood.android.indexes.detail.components.disclosure;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/disclosure/IndexDetailPageDisclosureDataState;", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "<init>", "(Ljava/lang/String;)V", "getDisclosure", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageDisclosureDataState {
    public static final int $stable = 0;
    private final String disclosure;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexDetailPageDisclosureDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IndexDetailPageDisclosureDataState copy$default(IndexDetailPageDisclosureDataState indexDetailPageDisclosureDataState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indexDetailPageDisclosureDataState.disclosure;
        }
        return indexDetailPageDisclosureDataState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final IndexDetailPageDisclosureDataState copy(String disclosure) {
        return new IndexDetailPageDisclosureDataState(disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IndexDetailPageDisclosureDataState) && Intrinsics.areEqual(this.disclosure, ((IndexDetailPageDisclosureDataState) other).disclosure);
    }

    public int hashCode() {
        String str = this.disclosure;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IndexDetailPageDisclosureDataState(disclosure=" + this.disclosure + ")";
    }

    public IndexDetailPageDisclosureDataState(String str) {
        this.disclosure = str;
    }

    public /* synthetic */ IndexDetailPageDisclosureDataState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getDisclosure() {
        return this.disclosure;
    }
}
