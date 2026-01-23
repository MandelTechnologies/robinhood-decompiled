package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.shareholderx.models.p401db.ShareholderEntryPointResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ShareholderQaEventViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "entryPointResponse", "Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse;)V", "getEntryPointResponse", "()Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShareholderQaEventViewData extends DetailData {
    public static final int $stable = 8;
    private final ShareholderEntryPointResponse entryPointResponse;

    public static /* synthetic */ ShareholderQaEventViewData copy$default(ShareholderQaEventViewData shareholderQaEventViewData, ShareholderEntryPointResponse shareholderEntryPointResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            shareholderEntryPointResponse = shareholderQaEventViewData.entryPointResponse;
        }
        return shareholderQaEventViewData.copy(shareholderEntryPointResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final ShareholderEntryPointResponse getEntryPointResponse() {
        return this.entryPointResponse;
    }

    public final ShareholderQaEventViewData copy(ShareholderEntryPointResponse entryPointResponse) {
        Intrinsics.checkNotNullParameter(entryPointResponse, "entryPointResponse");
        return new ShareholderQaEventViewData(entryPointResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShareholderQaEventViewData) && Intrinsics.areEqual(this.entryPointResponse, ((ShareholderQaEventViewData) other).entryPointResponse);
    }

    public int hashCode() {
        return this.entryPointResponse.hashCode();
    }

    public String toString() {
        return "ShareholderQaEventViewData(entryPointResponse=" + this.entryPointResponse + ")";
    }

    public final ShareholderEntryPointResponse getEntryPointResponse() {
        return this.entryPointResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderQaEventViewData(ShareholderEntryPointResponse entryPointResponse) {
        super(null);
        Intrinsics.checkNotNullParameter(entryPointResponse, "entryPointResponse");
        this.entryPointResponse = entryPointResponse;
    }
}
