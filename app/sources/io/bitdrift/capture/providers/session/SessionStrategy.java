package io.bitdrift.capture.providers.session;

import io.bitdrift.capture.providers.session.SessionStrategyConfiguration;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionStrategy.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0002\b\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lio/bitdrift/capture/providers/session/SessionStrategy;", "", "()V", "createSessionStrategyConfiguration", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;", "onSessionIdChanged", "Lkotlin/Function1;", "", "", "createSessionStrategyConfiguration$platform_jvm_capture_capture_logger_lib_kt", "ActivityBased", "Fixed", "Lio/bitdrift/capture/providers/session/SessionStrategy$ActivityBased;", "Lio/bitdrift/capture/providers/session/SessionStrategy$Fixed;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class SessionStrategy {
    public /* synthetic */ SessionStrategy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SessionStrategy() {
    }

    /* compiled from: SessionStrategy.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lio/bitdrift/capture/providers/session/SessionStrategy$Fixed;", "Lio/bitdrift/capture/providers/session/SessionStrategy;", "sessionIdGenerator", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getSessionIdGenerator", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Fixed extends SessionStrategy {
        private final Function0<String> sessionIdGenerator;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public Fixed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fixed copy$default(Fixed fixed, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = fixed.sessionIdGenerator;
            }
            return fixed.copy(function0);
        }

        public final Function0<String> component1() {
            return this.sessionIdGenerator;
        }

        public final Fixed copy(Function0<String> sessionIdGenerator) {
            Intrinsics.checkNotNullParameter(sessionIdGenerator, "sessionIdGenerator");
            return new Fixed(sessionIdGenerator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fixed) && Intrinsics.areEqual(this.sessionIdGenerator, ((Fixed) other).sessionIdGenerator);
        }

        public int hashCode() {
            return this.sessionIdGenerator.hashCode();
        }

        public String toString() {
            return "Fixed(sessionIdGenerator=" + this.sessionIdGenerator + ')';
        }

        public /* synthetic */ Fixed(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Function0<String>() { // from class: io.bitdrift.capture.providers.session.SessionStrategy.Fixed.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    String string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    return string2;
                }
            } : function0);
        }

        public final Function0<String> getSessionIdGenerator() {
            return this.sessionIdGenerator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Fixed(Function0<String> sessionIdGenerator) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionIdGenerator, "sessionIdGenerator");
            this.sessionIdGenerator = sessionIdGenerator;
        }
    }

    /* compiled from: SessionStrategy.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/providers/session/SessionStrategy$ActivityBased;", "Lio/bitdrift/capture/providers/session/SessionStrategy;", "inactivityThresholdMins", "", "onSessionIdChanged", "Lkotlin/Function1;", "", "", "(JLkotlin/jvm/functions/Function1;)V", "getInactivityThresholdMins", "()J", "getOnSessionIdChanged", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ActivityBased extends SessionStrategy {
        private final long inactivityThresholdMins;
        private final Function1<String, Unit> onSessionIdChanged;

        @JvmOverloads
        public ActivityBased() {
            this(0L, null, 3, null);
        }

        @JvmOverloads
        public ActivityBased(long j) {
            this(j, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityBased copy$default(ActivityBased activityBased, long j, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                j = activityBased.inactivityThresholdMins;
            }
            if ((i & 2) != 0) {
                function1 = activityBased.onSessionIdChanged;
            }
            return activityBased.copy(j, function1);
        }

        /* renamed from: component1, reason: from getter */
        public final long getInactivityThresholdMins() {
            return this.inactivityThresholdMins;
        }

        public final Function1<String, Unit> component2() {
            return this.onSessionIdChanged;
        }

        public final ActivityBased copy(long inactivityThresholdMins, Function1<? super String, Unit> onSessionIdChanged) {
            return new ActivityBased(inactivityThresholdMins, onSessionIdChanged);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivityBased)) {
                return false;
            }
            ActivityBased activityBased = (ActivityBased) other;
            return this.inactivityThresholdMins == activityBased.inactivityThresholdMins && Intrinsics.areEqual(this.onSessionIdChanged, activityBased.onSessionIdChanged);
        }

        public int hashCode() {
            int iM3323m = D8$$SyntheticClass5.m3323m(this.inactivityThresholdMins) * 31;
            Function1<String, Unit> function1 = this.onSessionIdChanged;
            return iM3323m + (function1 == null ? 0 : function1.hashCode());
        }

        public String toString() {
            return "ActivityBased(inactivityThresholdMins=" + this.inactivityThresholdMins + ", onSessionIdChanged=" + this.onSessionIdChanged + ')';
        }

        public /* synthetic */ ActivityBased(long j, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 30L : j, (i & 2) != 0 ? null : function1);
        }

        public final long getInactivityThresholdMins() {
            return this.inactivityThresholdMins;
        }

        public final Function1<String, Unit> getOnSessionIdChanged() {
            return this.onSessionIdChanged;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public ActivityBased(long j, Function1<? super String, Unit> function1) {
            super(null);
            this.inactivityThresholdMins = j;
            this.onSessionIdChanged = function1;
        }
    }

    /* renamed from: createSessionStrategyConfiguration$platform_jvm_capture_capture_logger_lib_kt */
    public final SessionStrategyConfiguration m3322xd02edeb1(Function1<? super String, Unit> onSessionIdChanged) {
        Intrinsics.checkNotNullParameter(onSessionIdChanged, "onSessionIdChanged");
        if (this instanceof Fixed) {
            return new SessionStrategyConfiguration.Fixed((Fixed) this, onSessionIdChanged);
        }
        if (this instanceof ActivityBased) {
            return new SessionStrategyConfiguration.ActivityBased((ActivityBased) this, onSessionIdChanged, null, 4, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
