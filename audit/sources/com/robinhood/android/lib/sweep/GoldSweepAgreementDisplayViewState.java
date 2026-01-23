package com.robinhood.android.lib.sweep;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSweepAgreementDisplayViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Error;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Loaded;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Loading;", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class GoldSweepAgreementDisplayViewState {
    public static final int $stable = 0;

    public /* synthetic */ GoldSweepAgreementDisplayViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GoldSweepAgreementDisplayViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Loading;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldSweepAgreementDisplayViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -273987691;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private GoldSweepAgreementDisplayViewState() {
    }

    /* compiled from: GoldSweepAgreementDisplayViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Loaded;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState;", "headerText", "", "agreementMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeaderText", "()Ljava/lang/String;", "getAgreementMarkdown", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldSweepAgreementDisplayViewState {
        public static final int $stable = 0;
        private final String agreementMarkdown;
        private final String headerText;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.headerText;
            }
            if ((i & 2) != 0) {
                str2 = loaded.agreementMarkdown;
            }
            return loaded.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAgreementMarkdown() {
            return this.agreementMarkdown;
        }

        public final Loaded copy(String headerText, String agreementMarkdown) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            Intrinsics.checkNotNullParameter(agreementMarkdown, "agreementMarkdown");
            return new Loaded(headerText, agreementMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.headerText, loaded.headerText) && Intrinsics.areEqual(this.agreementMarkdown, loaded.agreementMarkdown);
        }

        public int hashCode() {
            return (this.headerText.hashCode() * 31) + this.agreementMarkdown.hashCode();
        }

        public String toString() {
            return "Loaded(headerText=" + this.headerText + ", agreementMarkdown=" + this.agreementMarkdown + ")";
        }

        public final String getHeaderText() {
            return this.headerText;
        }

        public final String getAgreementMarkdown() {
            return this.agreementMarkdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String headerText, String agreementMarkdown) {
            super(null);
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            Intrinsics.checkNotNullParameter(agreementMarkdown, "agreementMarkdown");
            this.headerText = headerText;
            this.agreementMarkdown = agreementMarkdown;
        }
    }

    /* compiled from: GoldSweepAgreementDisplayViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState$Error;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldSweepAgreementDisplayViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }
}
