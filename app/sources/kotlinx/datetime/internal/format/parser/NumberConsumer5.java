package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NumberConsumer.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bJ\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "errorMessage", "", "Conflicting", "ExpectedInt", "TooFewDigits", "TooManyDigits", "WrongConstant", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumptionError, reason: use source file name */
/* loaded from: classes14.dex */
public interface NumberConsumer5 {
    String errorMessage();

    /* compiled from: NumberConsumer.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$ExpectedInt;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "()V", "errorMessage", "", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumptionError$ExpectedInt */
    public static final class ExpectedInt implements NumberConsumer5 {
        public static final ExpectedInt INSTANCE = new ExpectedInt();

        private ExpectedInt() {
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumer5
        public String errorMessage() {
            return "expected an Int value";
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$TooManyDigits;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "maxDigits", "<init>", "(I)V", "", "errorMessage", "()Ljava/lang/String;", "I", "getMaxDigits", "()I", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumptionError$TooManyDigits */
    public static final class TooManyDigits implements NumberConsumer5 {
        private final int maxDigits;

        public TooManyDigits(int i) {
            this.maxDigits = i;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumer5
        public String errorMessage() {
            return "expected at most " + this.maxDigits + " digits";
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$TooFewDigits;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "minDigits", "<init>", "(I)V", "", "errorMessage", "()Ljava/lang/String;", "I", "getMinDigits", "()I", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumptionError$TooFewDigits */
    public static final class TooFewDigits implements NumberConsumer5 {
        private final int minDigits;

        public TooFewDigits(int i) {
            this.minDigits = i;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumer5
        public String errorMessage() {
            return "expected at least " + this.minDigits + " digits";
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$WrongConstant;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "expected", "<init>", "(Ljava/lang/String;)V", "errorMessage", "()Ljava/lang/String;", "Ljava/lang/String;", "getExpected", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumptionError$WrongConstant */
    public static final class WrongConstant implements NumberConsumer5 {
        private final String expected;

        public WrongConstant(String expected) {
            Intrinsics.checkNotNullParameter(expected, "expected");
            this.expected = expected;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumer5
        public String errorMessage() {
            return "expected '" + this.expected + '\'';
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$Conflicting;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "conflicting", "<init>", "(Ljava/lang/Object;)V", "", "errorMessage", "()Ljava/lang/String;", "Ljava/lang/Object;", "getConflicting", "()Ljava/lang/Object;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumptionError$Conflicting */
    public static final class Conflicting implements NumberConsumer5 {
        private final Object conflicting;

        public Conflicting(Object conflicting) {
            Intrinsics.checkNotNullParameter(conflicting, "conflicting");
            this.conflicting = conflicting;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumer5
        public String errorMessage() {
            return "attempted to overwrite the existing value '" + this.conflicting + '\'';
        }
    }
}
