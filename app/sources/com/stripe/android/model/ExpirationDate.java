package com.stripe.android.model;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.view.DateUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: ExpirationDate.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/ExpirationDate;", "", "()V", "Unvalidated", "Validated", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class ExpirationDate {
    public /* synthetic */ ExpirationDate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ExpirationDate.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate;", "", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/model/ExpirationDate$Validated;", "validate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMonth", "getYear", "isMonthValid", "Z", "()Z", "isComplete", "isComplete$payments_core_release", "isPartialEntry", "isPartialEntry$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Unvalidated extends ExpirationDate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Unvalidated EMPTY = new Unvalidated("", "");
        private final boolean isComplete;
        private final boolean isMonthValid;
        private final boolean isPartialEntry;
        private final String month;
        private final String year;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unvalidated)) {
                return false;
            }
            Unvalidated unvalidated = (Unvalidated) other;
            return Intrinsics.areEqual(this.month, unvalidated.month) && Intrinsics.areEqual(this.year, unvalidated.year);
        }

        public int hashCode() {
            return (this.month.hashCode() * 31) + this.year.hashCode();
        }

        public String toString() {
            return "Unvalidated(month=" + this.month + ", year=" + this.year + ")";
        }

        public final String getMonth() {
            return this.month;
        }

        public final String getYear() {
            return this.year;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String month, String year) {
            Object objM28550constructorimpl;
            super(null);
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(year, "year");
            this.month = month;
            this.year = year;
            boolean z = false;
            try {
                Result.Companion companion = Result.INSTANCE;
                int i = Integer.parseInt(month);
                objM28550constructorimpl = Result.m28550constructorimpl(Boolean.valueOf(1 <= i && i < 13));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            this.isMonthValid = ((Boolean) (Result.m28555isFailureimpl(objM28550constructorimpl) ? Boolean.FALSE : objM28550constructorimpl)).booleanValue();
            boolean z2 = this.month.length() + this.year.length() == 4;
            this.isComplete = z2;
            if (!z2 && this.month.length() + this.year.length() > 0) {
                z = true;
            }
            this.isPartialEntry = z;
        }

        /* renamed from: isMonthValid, reason: from getter */
        public final boolean getIsMonthValid() {
            return this.isMonthValid;
        }

        public final Validated validate() {
            Object objM28550constructorimpl;
            String str = this.month;
            String str2 = this.year;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(new Validated(Integer.parseInt(str), DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            return (Validated) objM28550constructorimpl;
        }

        /* renamed from: isComplete$payments_core_release, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: isPartialEntry$payments_core_release, reason: from getter */
        public final boolean getIsPartialEntry() {
            return this.isPartialEntry;
        }

        /* compiled from: ExpirationDate.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "getEMPTY", "()Lcom/stripe/android/model/ExpirationDate$Unvalidated;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "input", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Unvalidated getEMPTY() {
                return Unvalidated.EMPTY;
            }

            public final Unvalidated create(String input) throws IOException {
                Intrinsics.checkNotNullParameter(input, "input");
                for (int i = 0; i < input.length(); i++) {
                    char cCharAt = input.charAt(i);
                    if (!Character.isDigit(cCharAt) && !CharsKt.isWhitespace(cCharAt) && cCharAt != '/') {
                        return getEMPTY();
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = input.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt2 = input.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb.append(cCharAt2);
                    }
                }
                String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return new Unvalidated(StringsKt.take(string2, 2), StringsKt.drop(string2, 2));
            }
        }
    }

    private ExpirationDate() {
    }

    /* compiled from: ExpirationDate.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/model/ExpirationDate$Validated;", "Lcom/stripe/android/model/ExpirationDate;", "", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "year", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMonth", "getYear", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Validated extends ExpirationDate {
        private final int month;
        private final int year;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) other;
            return this.month == validated.month && this.year == validated.year;
        }

        public int hashCode() {
            return (Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year);
        }

        public String toString() {
            return "Validated(month=" + this.month + ", year=" + this.year + ")";
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public Validated(int i, int i2) {
            super(null);
            this.month = i;
            this.year = i2;
        }
    }
}
