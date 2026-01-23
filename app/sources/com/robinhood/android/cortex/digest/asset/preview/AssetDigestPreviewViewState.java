package com.robinhood.android.cortex.digest.asset.preview;

import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: AssetDigestPreviewViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR'\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011R\u0011\u0010&\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;", "", "j$/time/Instant", "now", "", "lastSeenEpochSecond", "Lkotlin/Pair;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "digestAndVariant", "<init>", "(Lj$/time/Instant;Ljava/lang/Long;Lkotlin/Pair;)V", "component1", "()Lj$/time/Instant;", "component2", "()Ljava/lang/Long;", "component3", "()Lkotlin/Pair;", "copy", "(Lj$/time/Instant;Ljava/lang/Long;Lkotlin/Pair;)Lcom/robinhood/android/cortex/digest/asset/preview/AssetDigestPreviewViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getNow", "Ljava/lang/Long;", "getLastSeenEpochSecond", "Lkotlin/Pair;", "getDigestAndVariant", "getHasSeenAnimation", "()Z", "hasSeenAnimation", "lib-cortex-digest-asset-preview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AssetDigestPreviewViewState {
    public static final int $stable = 8;
    private final Tuples2<AssetDigest, AssetDigestValuePropsExperiment2> digestAndVariant;
    private final Long lastSeenEpochSecond;
    private final Instant now;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetDigestPreviewViewState copy$default(AssetDigestPreviewViewState assetDigestPreviewViewState, Instant instant, Long l, Tuples2 tuples2, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = assetDigestPreviewViewState.now;
        }
        if ((i & 2) != 0) {
            l = assetDigestPreviewViewState.lastSeenEpochSecond;
        }
        if ((i & 4) != 0) {
            tuples2 = assetDigestPreviewViewState.digestAndVariant;
        }
        return assetDigestPreviewViewState.copy(instant, l, tuples2);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getNow() {
        return this.now;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getLastSeenEpochSecond() {
        return this.lastSeenEpochSecond;
    }

    public final Tuples2<AssetDigest, AssetDigestValuePropsExperiment2> component3() {
        return this.digestAndVariant;
    }

    public final AssetDigestPreviewViewState copy(Instant now, Long lastSeenEpochSecond, Tuples2<? extends AssetDigest, ? extends AssetDigestValuePropsExperiment2> digestAndVariant) {
        Intrinsics.checkNotNullParameter(now, "now");
        return new AssetDigestPreviewViewState(now, lastSeenEpochSecond, digestAndVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetDigestPreviewViewState)) {
            return false;
        }
        AssetDigestPreviewViewState assetDigestPreviewViewState = (AssetDigestPreviewViewState) other;
        return Intrinsics.areEqual(this.now, assetDigestPreviewViewState.now) && Intrinsics.areEqual(this.lastSeenEpochSecond, assetDigestPreviewViewState.lastSeenEpochSecond) && Intrinsics.areEqual(this.digestAndVariant, assetDigestPreviewViewState.digestAndVariant);
    }

    public int hashCode() {
        int iHashCode = this.now.hashCode() * 31;
        Long l = this.lastSeenEpochSecond;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Tuples2<AssetDigest, AssetDigestValuePropsExperiment2> tuples2 = this.digestAndVariant;
        return iHashCode2 + (tuples2 != null ? tuples2.hashCode() : 0);
    }

    public String toString() {
        return "AssetDigestPreviewViewState(now=" + this.now + ", lastSeenEpochSecond=" + this.lastSeenEpochSecond + ", digestAndVariant=" + this.digestAndVariant + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetDigestPreviewViewState(Instant now, Long l, Tuples2<? extends AssetDigest, ? extends AssetDigestValuePropsExperiment2> tuples2) {
        Intrinsics.checkNotNullParameter(now, "now");
        this.now = now;
        this.lastSeenEpochSecond = l;
        this.digestAndVariant = tuples2;
    }

    public /* synthetic */ AssetDigestPreviewViewState(Instant instant, Long l, Tuples2 tuples2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, l, (i & 4) != 0 ? null : tuples2);
    }

    public final Instant getNow() {
        return this.now;
    }

    public final Long getLastSeenEpochSecond() {
        return this.lastSeenEpochSecond;
    }

    public final Tuples2<AssetDigest, AssetDigestValuePropsExperiment2> getDigestAndVariant() {
        return this.digestAndVariant;
    }

    public final boolean getHasSeenAnimation() {
        Long l = this.lastSeenEpochSecond;
        if (l == null) {
            return false;
        }
        Instant instantOfEpochSecond = Instant.ofEpochSecond(l.longValue());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        ZoneIds zoneIds = ZoneIds.INSTANCE;
        return Intrinsics.areEqual(Instants.toLocalDate(instantOfEpochSecond, zoneIds.getUTC()), Instants.toLocalDate(this.now, zoneIds.getUTC()));
    }
}
