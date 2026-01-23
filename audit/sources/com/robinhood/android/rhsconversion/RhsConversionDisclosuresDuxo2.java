package com.robinhood.android.rhsconversion;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhsConversionDisclosuresDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent;", "", "<init>", "()V", "Success", "Error", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent$Error;", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent$Success;", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhsconversion.RhsConversionDisclosuresEvent, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class RhsConversionDisclosuresDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ RhsConversionDisclosuresDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RhsConversionDisclosuresDuxo2() {
    }

    /* compiled from: RhsConversionDisclosuresDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent$Success;", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhsconversion.RhsConversionDisclosuresEvent$Success */
    public static final /* data */ class Success extends RhsConversionDisclosuresDuxo2 {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -734327219;
        }

        public String toString() {
            return "Success";
        }

        private Success() {
            super(null);
        }
    }

    /* compiled from: RhsConversionDisclosuresDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent$Error;", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhsconversion.RhsConversionDisclosuresEvent$Error */
    public static final class Error extends RhsConversionDisclosuresDuxo2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
