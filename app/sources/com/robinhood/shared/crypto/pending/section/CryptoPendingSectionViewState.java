package com.robinhood.shared.crypto.pending.section;

import com.robinhood.shared.crypto.pending.rows.PendingData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoPendingSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "pendingDataList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "isShowMoreVisible", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getPendingDataList", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoPendingSectionViewState {
    public static final int $stable = PendingData.$stable | StringResource.$stable;
    private final boolean isShowMoreVisible;
    private final ImmutableList<PendingData> pendingDataList;
    private final StringResource title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoPendingSectionViewState copy$default(CryptoPendingSectionViewState cryptoPendingSectionViewState, StringResource stringResource, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoPendingSectionViewState.title;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoPendingSectionViewState.pendingDataList;
        }
        if ((i & 4) != 0) {
            z = cryptoPendingSectionViewState.isShowMoreVisible;
        }
        return cryptoPendingSectionViewState.copy(stringResource, immutableList, z);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<PendingData> component2() {
        return this.pendingDataList;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsShowMoreVisible() {
        return this.isShowMoreVisible;
    }

    public final CryptoPendingSectionViewState copy(StringResource title, ImmutableList<PendingData> pendingDataList, boolean isShowMoreVisible) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingDataList, "pendingDataList");
        return new CryptoPendingSectionViewState(title, pendingDataList, isShowMoreVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPendingSectionViewState)) {
            return false;
        }
        CryptoPendingSectionViewState cryptoPendingSectionViewState = (CryptoPendingSectionViewState) other;
        return Intrinsics.areEqual(this.title, cryptoPendingSectionViewState.title) && Intrinsics.areEqual(this.pendingDataList, cryptoPendingSectionViewState.pendingDataList) && this.isShowMoreVisible == cryptoPendingSectionViewState.isShowMoreVisible;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.pendingDataList.hashCode()) * 31) + Boolean.hashCode(this.isShowMoreVisible);
    }

    public String toString() {
        return "CryptoPendingSectionViewState(title=" + this.title + ", pendingDataList=" + this.pendingDataList + ", isShowMoreVisible=" + this.isShowMoreVisible + ")";
    }

    public CryptoPendingSectionViewState(StringResource title, ImmutableList<PendingData> pendingDataList, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingDataList, "pendingDataList");
        this.title = title;
        this.pendingDataList = pendingDataList;
        this.isShowMoreVisible = z;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final ImmutableList<PendingData> getPendingDataList() {
        return this.pendingDataList;
    }

    public final boolean isShowMoreVisible() {
        return this.isShowMoreVisible;
    }
}
