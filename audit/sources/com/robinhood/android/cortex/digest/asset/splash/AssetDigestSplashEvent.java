package com.robinhood.android.cortex.digest.asset.splash;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestSplashEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent;", "", "SkipSplash", "Error", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent$Error;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent$SkipSplash;", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface AssetDigestSplashEvent {

    /* compiled from: AssetDigestSplashEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent$SkipSplash;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent;", "hasSignedAgreement", "", "hasGoldOrNotRequired", "<init>", "(ZZ)V", "getHasSignedAgreement", "()Z", "getHasGoldOrNotRequired", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SkipSplash implements AssetDigestSplashEvent {
        public static final int $stable = 0;
        private final boolean hasGoldOrNotRequired;
        private final boolean hasSignedAgreement;

        public static /* synthetic */ SkipSplash copy$default(SkipSplash skipSplash, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = skipSplash.hasSignedAgreement;
            }
            if ((i & 2) != 0) {
                z2 = skipSplash.hasGoldOrNotRequired;
            }
            return skipSplash.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasSignedAgreement() {
            return this.hasSignedAgreement;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasGoldOrNotRequired() {
            return this.hasGoldOrNotRequired;
        }

        public final SkipSplash copy(boolean hasSignedAgreement, boolean hasGoldOrNotRequired) {
            return new SkipSplash(hasSignedAgreement, hasGoldOrNotRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkipSplash)) {
                return false;
            }
            SkipSplash skipSplash = (SkipSplash) other;
            return this.hasSignedAgreement == skipSplash.hasSignedAgreement && this.hasGoldOrNotRequired == skipSplash.hasGoldOrNotRequired;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasSignedAgreement) * 31) + Boolean.hashCode(this.hasGoldOrNotRequired);
        }

        public String toString() {
            return "SkipSplash(hasSignedAgreement=" + this.hasSignedAgreement + ", hasGoldOrNotRequired=" + this.hasGoldOrNotRequired + ")";
        }

        public SkipSplash(boolean z, boolean z2) {
            this.hasSignedAgreement = z;
            this.hasGoldOrNotRequired = z2;
        }

        public final boolean getHasSignedAgreement() {
            return this.hasSignedAgreement;
        }

        public final boolean getHasGoldOrNotRequired() {
            return this.hasGoldOrNotRequired;
        }
    }

    /* compiled from: AssetDigestSplashEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent$Error;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements AssetDigestSplashEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
