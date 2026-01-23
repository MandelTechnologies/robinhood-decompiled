package com.robinhood.android.crypto.tab.p093ui.pnl;

import com.robinhood.android.models.portfolio.api.AssetClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import p479j$.time.Month;

/* compiled from: CryptoHomePnlEntryPointDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDataState;", "", "", "hasSeenNewBadge", "j$/time/LocalDate", "currentDate", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "supportedAssetTypes", "<init>", "(ZLj$/time/LocalDate;Ljava/util/List;)V", "component1", "()Z", "component2", "()Lj$/time/LocalDate;", "component3", "()Ljava/util/List;", "copy", "(ZLj$/time/LocalDate;Ljava/util/List;)Lcom/robinhood/android/crypto/tab/ui/pnl/CryptoHomePnlEntryPointDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasSeenNewBadge", "Lj$/time/LocalDate;", "getCurrentDate", "Ljava/util/List;", "getSupportedAssetTypes", "getShouldShowNewBadge", "shouldShowNewBadge", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomePnlEntryPointDataState {
    public static final int $stable = 8;
    private final LocalDate currentDate;
    private final boolean hasSeenNewBadge;
    private final List<AssetClass> supportedAssetTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomePnlEntryPointDataState copy$default(CryptoHomePnlEntryPointDataState cryptoHomePnlEntryPointDataState, boolean z, LocalDate localDate, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoHomePnlEntryPointDataState.hasSeenNewBadge;
        }
        if ((i & 2) != 0) {
            localDate = cryptoHomePnlEntryPointDataState.currentDate;
        }
        if ((i & 4) != 0) {
            list = cryptoHomePnlEntryPointDataState.supportedAssetTypes;
        }
        return cryptoHomePnlEntryPointDataState.copy(z, localDate, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSeenNewBadge() {
        return this.hasSeenNewBadge;
    }

    /* renamed from: component2, reason: from getter */
    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    public final List<AssetClass> component3() {
        return this.supportedAssetTypes;
    }

    public final CryptoHomePnlEntryPointDataState copy(boolean hasSeenNewBadge, LocalDate currentDate, List<? extends AssetClass> supportedAssetTypes) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        return new CryptoHomePnlEntryPointDataState(hasSeenNewBadge, currentDate, supportedAssetTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomePnlEntryPointDataState)) {
            return false;
        }
        CryptoHomePnlEntryPointDataState cryptoHomePnlEntryPointDataState = (CryptoHomePnlEntryPointDataState) other;
        return this.hasSeenNewBadge == cryptoHomePnlEntryPointDataState.hasSeenNewBadge && Intrinsics.areEqual(this.currentDate, cryptoHomePnlEntryPointDataState.currentDate) && Intrinsics.areEqual(this.supportedAssetTypes, cryptoHomePnlEntryPointDataState.supportedAssetTypes);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasSeenNewBadge) * 31) + this.currentDate.hashCode()) * 31) + this.supportedAssetTypes.hashCode();
    }

    public String toString() {
        return "CryptoHomePnlEntryPointDataState(hasSeenNewBadge=" + this.hasSeenNewBadge + ", currentDate=" + this.currentDate + ", supportedAssetTypes=" + this.supportedAssetTypes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomePnlEntryPointDataState(boolean z, LocalDate currentDate, List<? extends AssetClass> supportedAssetTypes) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        this.hasSeenNewBadge = z;
        this.currentDate = currentDate;
        this.supportedAssetTypes = supportedAssetTypes;
    }

    public final boolean getHasSeenNewBadge() {
        return this.hasSeenNewBadge;
    }

    public final LocalDate getCurrentDate() {
        return this.currentDate;
    }

    public /* synthetic */ CryptoHomePnlEntryPointDataState(boolean z, LocalDate localDate, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, localDate, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<AssetClass> getSupportedAssetTypes() {
        return this.supportedAssetTypes;
    }

    public final boolean getShouldShowNewBadge() {
        return !this.hasSeenNewBadge && this.currentDate.isBefore(LocalDate.m3378of(2026, Month.JULY, 1));
    }
}
