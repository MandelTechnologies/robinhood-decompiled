package com.robinhood.android.p148fx.tooltip;

import com.robinhood.models.p325fx.api.ApiFxQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxQuoteState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "", "Success", "Error", "Loading", "Lcom/robinhood/android/fx/tooltip/FxQuoteState$Error;", "Lcom/robinhood/android/fx/tooltip/FxQuoteState$Loading;", "Lcom/robinhood/android/fx/tooltip/FxQuoteState$Success;", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface FxQuoteState {

    /* compiled from: FxQuoteState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxQuoteState$Success;", "Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "<init>", "(Lcom/robinhood/models/fx/api/ApiFxQuote;)V", "getFxQuote", "()Lcom/robinhood/models/fx/api/ApiFxQuote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements FxQuoteState {
        public static final int $stable = 8;
        private final ApiFxQuote fxQuote;

        public static /* synthetic */ Success copy$default(Success success, ApiFxQuote apiFxQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                apiFxQuote = success.fxQuote;
            }
            return success.copy(apiFxQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiFxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final Success copy(ApiFxQuote fxQuote) {
            Intrinsics.checkNotNullParameter(fxQuote, "fxQuote");
            return new Success(fxQuote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.fxQuote, ((Success) other).fxQuote);
        }

        public int hashCode() {
            return this.fxQuote.hashCode();
        }

        public String toString() {
            return "Success(fxQuote=" + this.fxQuote + ")";
        }

        public Success(ApiFxQuote fxQuote) {
            Intrinsics.checkNotNullParameter(fxQuote, "fxQuote");
            this.fxQuote = fxQuote;
        }

        public final ApiFxQuote getFxQuote() {
            return this.fxQuote;
        }
    }

    /* compiled from: FxQuoteState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxQuoteState$Error;", "Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements FxQuoteState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -129465900;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: FxQuoteState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/FxQuoteState$Loading;", "Lcom/robinhood/android/fx/tooltip/FxQuoteState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements FxQuoteState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1952960008;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }
}
