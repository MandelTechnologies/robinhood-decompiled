package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.models.api.ReferralCode;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantUpgradeSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;", "", "<init>", "()V", "Loading", "ShowInstantSplash", "Error", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState$Error;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState$Loading;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState$ShowInstantSplash;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class InstantUpgradeSplashDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ InstantUpgradeSplashDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InstantUpgradeSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState$Loading;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashState$Loading */
    public static final class Loading extends InstantUpgradeSplashDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private InstantUpgradeSplashDuxo2() {
    }

    /* compiled from: InstantUpgradeSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState$ShowInstantSplash;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;", "referralCode", "Lcom/robinhood/models/api/ReferralCode;", "<init>", "(Lcom/robinhood/models/api/ReferralCode;)V", "getReferralCode", "()Lcom/robinhood/models/api/ReferralCode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashState$ShowInstantSplash, reason: from toString */
    public static final /* data */ class ShowInstantSplash extends InstantUpgradeSplashDuxo2 {
        public static final int $stable = 8;
        private final ReferralCode referralCode;

        public static /* synthetic */ ShowInstantSplash copy$default(ShowInstantSplash showInstantSplash, ReferralCode referralCode, int i, Object obj) {
            if ((i & 1) != 0) {
                referralCode = showInstantSplash.referralCode;
            }
            return showInstantSplash.copy(referralCode);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralCode getReferralCode() {
            return this.referralCode;
        }

        public final ShowInstantSplash copy(ReferralCode referralCode) {
            Intrinsics.checkNotNullParameter(referralCode, "referralCode");
            return new ShowInstantSplash(referralCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInstantSplash) && Intrinsics.areEqual(this.referralCode, ((ShowInstantSplash) other).referralCode);
        }

        public int hashCode() {
            return this.referralCode.hashCode();
        }

        public String toString() {
            return "ShowInstantSplash(referralCode=" + this.referralCode + ")";
        }

        public final ReferralCode getReferralCode() {
            return this.referralCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInstantSplash(ReferralCode referralCode) {
            super(null);
            Intrinsics.checkNotNullParameter(referralCode, "referralCode");
            this.referralCode = referralCode;
        }
    }

    /* compiled from: InstantUpgradeSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState$Error;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;", "instantReferralCodeErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getInstantReferralCodeErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashState$Error, reason: from toString */
    public static final /* data */ class Error extends InstantUpgradeSplashDuxo2 {
        public static final int $stable = 8;
        private final UiEvent<Throwable> instantReferralCodeErrorEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = error.instantReferralCodeErrorEvent;
            }
            return error.copy(uiEvent);
        }

        public final UiEvent<Throwable> component1() {
            return this.instantReferralCodeErrorEvent;
        }

        public final Error copy(UiEvent<Throwable> instantReferralCodeErrorEvent) {
            Intrinsics.checkNotNullParameter(instantReferralCodeErrorEvent, "instantReferralCodeErrorEvent");
            return new Error(instantReferralCodeErrorEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.instantReferralCodeErrorEvent, ((Error) other).instantReferralCodeErrorEvent);
        }

        public int hashCode() {
            return this.instantReferralCodeErrorEvent.hashCode();
        }

        public String toString() {
            return "Error(instantReferralCodeErrorEvent=" + this.instantReferralCodeErrorEvent + ")";
        }

        public final UiEvent<Throwable> getInstantReferralCodeErrorEvent() {
            return this.instantReferralCodeErrorEvent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UiEvent<Throwable> instantReferralCodeErrorEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(instantReferralCodeErrorEvent, "instantReferralCodeErrorEvent");
            this.instantReferralCodeErrorEvent = instantReferralCodeErrorEvent;
        }
    }
}
