package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.utils.datetime.Durations;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ProfitAndLossSupportedAssetTypes.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "", "", "accountNumber", "", "Lcom/robinhood/android/portfolio/pnl/db/SupportedAssetClass;", "assetTypes", "j$/time/Instant", "receivedAt", "<init>", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;)V", "", "isStale", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lj$/time/Instant;", "copy", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;)Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Ljava/util/List;", "getAssetTypes", "Lj$/time/Instant;", "getReceivedAt", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfitAndLossSupportedAssetTypes {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountNumber;
    private final List<SupportedAssetClass> assetTypes;
    private final Instant receivedAt;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfitAndLossSupportedAssetTypes copy$default(ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes, String str, List list, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profitAndLossSupportedAssetTypes.accountNumber;
        }
        if ((i & 2) != 0) {
            list = profitAndLossSupportedAssetTypes.assetTypes;
        }
        if ((i & 4) != 0) {
            instant = profitAndLossSupportedAssetTypes.receivedAt;
        }
        return profitAndLossSupportedAssetTypes.copy(str, list, instant);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<SupportedAssetClass> component2() {
        return this.assetTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getReceivedAt() {
        return this.receivedAt;
    }

    public final ProfitAndLossSupportedAssetTypes copy(String accountNumber, List<SupportedAssetClass> assetTypes, Instant receivedAt) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        return new ProfitAndLossSupportedAssetTypes(accountNumber, assetTypes, receivedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossSupportedAssetTypes)) {
            return false;
        }
        ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes = (ProfitAndLossSupportedAssetTypes) other;
        return Intrinsics.areEqual(this.accountNumber, profitAndLossSupportedAssetTypes.accountNumber) && Intrinsics.areEqual(this.assetTypes, profitAndLossSupportedAssetTypes.assetTypes) && Intrinsics.areEqual(this.receivedAt, profitAndLossSupportedAssetTypes.receivedAt);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.assetTypes.hashCode()) * 31) + this.receivedAt.hashCode();
    }

    public String toString() {
        return "ProfitAndLossSupportedAssetTypes(accountNumber=" + this.accountNumber + ", assetTypes=" + this.assetTypes + ", receivedAt=" + this.receivedAt + ")";
    }

    public ProfitAndLossSupportedAssetTypes(String accountNumber, List<SupportedAssetClass> assetTypes, Instant receivedAt) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetTypes, "assetTypes");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        this.accountNumber = accountNumber;
        this.assetTypes = assetTypes;
        this.receivedAt = receivedAt;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<SupportedAssetClass> getAssetTypes() {
        return this.assetTypes;
    }

    public final Instant getReceivedAt() {
        return this.receivedAt;
    }

    public final boolean isStale() {
        return Durations.since(this.receivedAt).compareTo(INSTANCE.getNormalStaleTimeout()) > 0;
    }

    /* compiled from: ProfitAndLossSupportedAssetTypes.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes$Companion;", "Lcom/robinhood/models/db/StaleConfig;", "<init>", "()V", "j$/time/Duration", "getNormalStaleTimeout", "()Lj$/time/Duration;", "normalStaleTimeout", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StaleConfig {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getShortStaleTimeout() {
            return StaleConfig.DefaultImpls.getShortStaleTimeout(this);
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getNormalStaleTimeout() {
            return Durations.INSTANCE.getONE_MINUTE();
        }
    }
}
