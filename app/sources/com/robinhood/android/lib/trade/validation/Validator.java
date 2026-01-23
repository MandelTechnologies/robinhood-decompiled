package com.robinhood.android.lib.trade.validation;

import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.validation.Validator;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: Validator.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0000*\u00020\u00022\u00020\u0002:\u0005\u0011\u0012\u0013\u0014\u0015B3\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010R$\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator;", "InputT", "", "ResolverT", "checks", "", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "<init>", "([Lcom/robinhood/android/lib/trade/validation/Validator$Check;)V", "[Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "validate", "Lcom/robinhood/android/lib/trade/validation/Validator$FailureQueue;", "input", "(Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/validation/Validator$FailureQueue;", "validateWithContext", "Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "(Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "FailureQueue", "ValidationContext", "Check", "Failure", "Action", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public class Validator<InputT, ResolverT> {
    public static final int $stable = 8;
    private final Check<InputT, ResolverT>[] checks;

    /* compiled from: Validator.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0002\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0003\u0010\u0003 \u0000*\u00020\u00022\u00020\u0002J#\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "InputT", "", "ResolverT", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "input", "(Ljava/lang/Object;)Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Check<InputT, ResolverT> {
        Failure<InputT, ResolverT> check(InputT input);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Validator(Check<? super InputT, ? super ResolverT>... checks) {
        Intrinsics.checkNotNullParameter(checks, "checks");
        this.checks = checks;
    }

    public final FailureQueue<InputT, ResolverT> validate(final InputT input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new FailureQueue<>((ArrayDeque) SequencesKt.toCollection(SequencesKt.filterNotNull(SequencesKt.map(ArraysKt.asSequence(this.checks), new Function1() { // from class: com.robinhood.android.lib.trade.validation.Validator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Validator.validate$lambda$0(input, (Validator.Check) obj);
            }
        })), new ArrayDeque()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Failure validate$lambda$0(Object obj, Check it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.check(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ValidationContext<InputT, ResolverT> validateWithContext(final InputT input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new ValidationContext<>(SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.map(ArraysKt.asSequence(this.checks), new Function1() { // from class: com.robinhood.android.lib.trade.validation.Validator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Validator.validateWithContext$lambda$1(input, (Validator.Check) obj);
            }
        }))), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Failure validateWithContext$lambda$1(Object obj, Check it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.check(obj);
    }

    /* compiled from: Validator.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\n\b\u0002\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0003\u0010\u0003 \u0000*\u00020\u00022\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006J\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$FailureQueue;", "InputT", "", "ResolverT", "failures", "Ljava/util/Queue;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "<init>", "(Ljava/util/Queue;)V", "peek", "poll", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FailureQueue<InputT, ResolverT> {
        public static final int $stable = 8;
        private final Queue<Failure<InputT, ResolverT>> failures;

        public FailureQueue(Queue<Failure<InputT, ResolverT>> failures) {
            Intrinsics.checkNotNullParameter(failures, "failures");
            this.failures = failures;
        }

        public final Failure<InputT, ResolverT> peek() {
            return this.failures.peek();
        }

        public final Failure<InputT, ResolverT> poll() {
            return this.failures.poll();
        }
    }

    /* compiled from: Validator.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\n\b\u0002\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0003\u0010\u0003 \u0000*\u00020\u00022\u00020\u0002B3\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\b\b\u0004\u0010\u0010*\u00028\u0002\"\b\b\u0005\u0010\u0011*\u00028\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u0006J\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000J\u001b\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u0005HÂ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003JA\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "InputT", "", "ResolverT", "failures", "", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "skippedFailures", "", "", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "failure", "getFailure", "()Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "skipFailure", "InputT2", "ResolverT2", "skipCurrentFailure", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationContext<InputT, ResolverT> {
        public static final int $stable = 8;
        private final List<Failure<InputT, ResolverT>> failures;
        private final Set<String> skippedFailures;

        /* JADX WARN: Multi-variable type inference failed */
        public ValidationContext() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        private final List<Failure<InputT, ResolverT>> component1() {
            return this.failures;
        }

        private final Set<String> component2() {
            return this.skippedFailures;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationContext copy$default(ValidationContext validationContext, List list, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                list = validationContext.failures;
            }
            if ((i & 2) != 0) {
                set = validationContext.skippedFailures;
            }
            return validationContext.copy(list, set);
        }

        public final ValidationContext<InputT, ResolverT> copy(List<? extends Failure<? super InputT, ? super ResolverT>> failures, Set<String> skippedFailures) {
            Intrinsics.checkNotNullParameter(failures, "failures");
            Intrinsics.checkNotNullParameter(skippedFailures, "skippedFailures");
            return new ValidationContext<>(failures, skippedFailures);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationContext)) {
                return false;
            }
            ValidationContext validationContext = (ValidationContext) other;
            return Intrinsics.areEqual(this.failures, validationContext.failures) && Intrinsics.areEqual(this.skippedFailures, validationContext.skippedFailures);
        }

        public int hashCode() {
            return (this.failures.hashCode() * 31) + this.skippedFailures.hashCode();
        }

        public String toString() {
            return "ValidationContext(failures=" + this.failures + ", skippedFailures=" + this.skippedFailures + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ValidationContext(List<? extends Failure<? super InputT, ? super ResolverT>> failures, Set<String> skippedFailures) {
            Intrinsics.checkNotNullParameter(failures, "failures");
            Intrinsics.checkNotNullParameter(skippedFailures, "skippedFailures");
            this.failures = failures;
            this.skippedFailures = skippedFailures;
        }

        public /* synthetic */ ValidationContext(List list, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? SetsKt.emptySet() : set);
        }

        public final Failure<InputT, ResolverT> getFailure() {
            return (Failure) SequencesKt.firstOrNull(SequencesKt.filterNot(CollectionsKt.asSequence(this.failures), new Function1() { // from class: com.robinhood.android.lib.trade.validation.Validator$ValidationContext$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Validator.ValidationContext._get_failure_$lambda$0(this.f$0, (Validator.Failure) obj));
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean _get_failure_$lambda$0(ValidationContext validationContext, Failure failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return validationContext.skippedFailures.contains(failure.getCheckIdentifier());
        }

        public final <InputT2 extends InputT, ResolverT2 extends ResolverT> ValidationContext<InputT, ResolverT> skipFailure(Failure<? super InputT2, ? super ResolverT2> failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return copy$default(this, null, SetsKt.plus(this.skippedFailures, failure.getCheckIdentifier()), 1, null);
        }

        public final ValidationContext<InputT, ResolverT> skipCurrentFailure() {
            Failure<InputT, ResolverT> failure = getFailure();
            return failure == null ? this : skipFailure(failure);
        }
    }

    /* compiled from: Validator.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0002\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0003\u0010\u0003 \u0000*\u00020\u00022\u00020\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H&¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "InputT", "", "ResolverT", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "(Lcom/robinhood/android/common/ui/BaseActivity;Ljava/lang/Object;)V", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "(Ljava/lang/Object;Landroid/os/Bundle;)Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "onNegativeResponse", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Failure<InputT, ResolverT> {
        String getCheckIdentifier();

        Action<InputT> onNegativeResponse(ResolverT resolver, Bundle passthroughArgs);

        Action<InputT> onPositiveResponse(ResolverT resolver, Bundle passthroughArgs);

        void showAlert(BaseActivity activity, InputT input);

        /* compiled from: Validator.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static <InputT, ResolverT> Action<InputT> onPositiveResponse(Failure<? super InputT, ? super ResolverT> failure, ResolverT resolver, Bundle bundle) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Action.Abort.INSTANCE;
            }

            public static <InputT, ResolverT> Action<InputT> onNegativeResponse(Failure<? super InputT, ? super ResolverT> failure, ResolverT resolver, Bundle bundle) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Action.Abort.INSTANCE;
            }
        }
    }

    /* compiled from: Validator.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0002\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "InputT", "", "<init>", "()V", "Abort", "Skip", "RetryWhen", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$Abort;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$Skip;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Action<InputT> {
        public static final int $stable = 0;

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }

        /* compiled from: Validator.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$Action$Abort;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "", "<init>", "()V", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Abort extends Action<Object> {
            public static final int $stable = 0;
            public static final Abort INSTANCE = new Abort();

            private Abort() {
                super(null);
            }
        }

        /* compiled from: Validator.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$Action$Skip;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "", "<init>", "()V", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Skip extends Action<Object> {
            public static final int $stable = 0;
            public static final Skip INSTANCE = new Skip();

            private Skip() {
                super(null);
            }
        }

        /* compiled from: Validator.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\n\b\u0003\u0010\u0001 \u0000*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0003¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "InputT", "", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "predicate", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "matches", "input", "(Ljava/lang/Object;)Z", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RetryWhen<InputT> extends Action<InputT> {
            public static final int $stable = 0;
            private final Function1<InputT, Boolean> predicate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public RetryWhen(Function1<? super InputT, Boolean> predicate) {
                super(null);
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                this.predicate = predicate;
            }

            public final boolean matches(InputT input) {
                Intrinsics.checkNotNullParameter(input, "input");
                return this.predicate.invoke(input).booleanValue();
            }
        }
    }
}
