package com.robinhood.android.taxcertification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxInfoConfirmViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnDisplayState;", "", "<init>", "()V", "Loading", "Hide", "Failure", "Success", "Lcom/robinhood/android/taxcertification/SsnDisplayState$Failure;", "Lcom/robinhood/android/taxcertification/SsnDisplayState$Hide;", "Lcom/robinhood/android/taxcertification/SsnDisplayState$Loading;", "Lcom/robinhood/android/taxcertification/SsnDisplayState$Success;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.SsnDisplayState, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class TaxInfoConfirmViewState3 {
    public /* synthetic */ TaxInfoConfirmViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: TaxInfoConfirmViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnDisplayState$Loading;", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnDisplayState$Loading */
    public static final class Loading extends TaxInfoConfirmViewState3 {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private TaxInfoConfirmViewState3() {
    }

    /* compiled from: TaxInfoConfirmViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnDisplayState$Hide;", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnDisplayState$Hide */
    public static final class Hide extends TaxInfoConfirmViewState3 {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super(null);
        }
    }

    /* compiled from: TaxInfoConfirmViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnDisplayState$Failure;", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnDisplayState$Failure */
    public static final class Failure extends TaxInfoConfirmViewState3 {
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(null);
        }
    }

    /* compiled from: TaxInfoConfirmViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnDisplayState$Success;", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "lastFourDigits", "", "<init>", "(Ljava/lang/String;)V", "getLastFourDigits", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnDisplayState$Success, reason: from toString */
    public static final /* data */ class Success extends TaxInfoConfirmViewState3 {
        private final String lastFourDigits;

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.lastFourDigits;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastFourDigits() {
            return this.lastFourDigits;
        }

        public final Success copy(String lastFourDigits) {
            Intrinsics.checkNotNullParameter(lastFourDigits, "lastFourDigits");
            return new Success(lastFourDigits);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.lastFourDigits, ((Success) other).lastFourDigits);
        }

        public int hashCode() {
            return this.lastFourDigits.hashCode();
        }

        public String toString() {
            return "Success(lastFourDigits=" + this.lastFourDigits + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String lastFourDigits) {
            super(null);
            Intrinsics.checkNotNullParameter(lastFourDigits, "lastFourDigits");
            this.lastFourDigits = lastFourDigits;
        }

        public final String getLastFourDigits() {
            return this.lastFourDigits;
        }
    }
}
