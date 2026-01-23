package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonLogicResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"LJsonLogicResult;", "", "()V", "Failure", "Success", "LJsonLogicResult$Failure;", "LJsonLogicResult$Success;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class JsonLogicResult {

    /* compiled from: JsonLogicResult.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"LJsonLogicResult$Success;", "LJsonLogicResult;", "", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final /* data */ class Success extends JsonLogicResult {
        private final Object value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Object value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    private JsonLogicResult() {
    }

    public /* synthetic */ JsonLogicResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: JsonLogicResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"LJsonLogicResult$Failure;", "LJsonLogicResult;", "()V", "EmptyExpression", "MissingOperation", "NullResult", "LJsonLogicResult$Failure$EmptyExpression;", "LJsonLogicResult$Failure$MissingOperation;", "LJsonLogicResult$Failure$NullResult;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static abstract class Failure extends JsonLogicResult {
        public /* synthetic */ Failure(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: JsonLogicResult.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"LJsonLogicResult$Failure$NullResult;", "LJsonLogicResult$Failure;", "()V", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
        public static final class NullResult extends Failure {
            public static final NullResult INSTANCE = new NullResult();

            private NullResult() {
                super(null);
            }
        }

        private Failure() {
            super(null);
        }

        /* compiled from: JsonLogicResult.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"LJsonLogicResult$Failure$EmptyExpression;", "LJsonLogicResult$Failure;", "()V", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
        public static final class EmptyExpression extends Failure {
            public static final EmptyExpression INSTANCE = new EmptyExpression();

            private EmptyExpression() {
                super(null);
            }
        }

        /* compiled from: JsonLogicResult.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"LJsonLogicResult$Failure$MissingOperation;", "LJsonLogicResult$Failure;", "()V", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
        public static final class MissingOperation extends Failure {
            public static final MissingOperation INSTANCE = new MissingOperation();

            private MissingOperation() {
                super(null);
            }
        }
    }
}
