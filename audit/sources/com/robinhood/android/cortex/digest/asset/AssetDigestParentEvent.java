package com.robinhood.android.cortex.digest.asset;

import com.robinhood.android.cortex.models.asset.AssetDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestParentEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent;", "", "Timeout", "Loaded", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent$Loaded;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent$Timeout;", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface AssetDigestParentEvent {

    /* compiled from: AssetDigestParentEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent$Timeout;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Timeout implements AssetDigestParentEvent {
        public static final int $stable = 0;
        public static final Timeout INSTANCE = new Timeout();

        public boolean equals(Object other) {
            return this == other || (other instanceof Timeout);
        }

        public int hashCode() {
            return 208668286;
        }

        public String toString() {
            return "Timeout";
        }

        private Timeout() {
        }
    }

    /* compiled from: AssetDigestParentEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent$Loaded;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent;", "instrumentDigest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "<init>", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;)V", "getInstrumentDigest", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AssetDigestParentEvent {
        public static final int $stable = 8;
        private final AssetDigest.HasSignedAgreement instrumentDigest;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AssetDigest.HasSignedAgreement hasSignedAgreement, int i, Object obj) {
            if ((i & 1) != 0) {
                hasSignedAgreement = loaded.instrumentDigest;
            }
            return loaded.copy(hasSignedAgreement);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetDigest.HasSignedAgreement getInstrumentDigest() {
            return this.instrumentDigest;
        }

        public final Loaded copy(AssetDigest.HasSignedAgreement instrumentDigest) {
            Intrinsics.checkNotNullParameter(instrumentDigest, "instrumentDigest");
            return new Loaded(instrumentDigest);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.instrumentDigest, ((Loaded) other).instrumentDigest);
        }

        public int hashCode() {
            return this.instrumentDigest.hashCode();
        }

        public String toString() {
            return "Loaded(instrumentDigest=" + this.instrumentDigest + ")";
        }

        public Loaded(AssetDigest.HasSignedAgreement instrumentDigest) {
            Intrinsics.checkNotNullParameter(instrumentDigest, "instrumentDigest");
            this.instrumentDigest = instrumentDigest;
        }

        public final AssetDigest.HasSignedAgreement getInstrumentDigest() {
            return this.instrumentDigest;
        }
    }
}
