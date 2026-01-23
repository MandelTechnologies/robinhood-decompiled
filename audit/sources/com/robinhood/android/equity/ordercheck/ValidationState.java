package com.robinhood.android.equity.ordercheck;

import kotlin.Metadata;

/* compiled from: ValidationState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ValidationState;", "", "Initial", "Validating", "Validated", "ValidationError", "Lcom/robinhood/android/equity/ordercheck/ValidationState$Initial;", "Lcom/robinhood/android/equity/ordercheck/ValidationState$Validated;", "Lcom/robinhood/android/equity/ordercheck/ValidationState$Validating;", "Lcom/robinhood/android/equity/ordercheck/ValidationState$ValidationError;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ValidationState {

    /* compiled from: ValidationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ValidationState$Initial;", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Initial implements ValidationState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        public boolean equals(Object other) {
            return this == other || (other instanceof Initial);
        }

        public int hashCode() {
            return -1181283025;
        }

        public String toString() {
            return "Initial";
        }

        private Initial() {
        }
    }

    /* compiled from: ValidationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ValidationState$Validating;", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Validating implements ValidationState {
        public static final int $stable = 0;
        public static final Validating INSTANCE = new Validating();

        public boolean equals(Object other) {
            return this == other || (other instanceof Validating);
        }

        public int hashCode() {
            return 444876424;
        }

        public String toString() {
            return "Validating";
        }

        private Validating() {
        }
    }

    /* compiled from: ValidationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ValidationState$Validated;", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Validated implements ValidationState {
        public static final int $stable = 0;
        public static final Validated INSTANCE = new Validated();

        public boolean equals(Object other) {
            return this == other || (other instanceof Validated);
        }

        public int hashCode() {
            return 2092560697;
        }

        public String toString() {
            return "Validated";
        }

        private Validated() {
        }
    }

    /* compiled from: ValidationState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ValidationState$ValidationError;", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationError implements ValidationState {
        public static final int $stable = 0;
        public static final ValidationError INSTANCE = new ValidationError();

        public boolean equals(Object other) {
            return this == other || (other instanceof ValidationError);
        }

        public int hashCode() {
            return 2015664122;
        }

        public String toString() {
            return "ValidationError";
        }

        private ValidationError() {
        }
    }
}
