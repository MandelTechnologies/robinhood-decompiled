package io.bitdrift.capture.providers.session;

import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.providers.session.SessionStrategy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionStrategyConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;", "", "()V", "ActivityBased", "Fixed", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration$ActivityBased;", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration$Fixed;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class SessionStrategyConfiguration {
    public /* synthetic */ SessionStrategyConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SessionStrategyConfiguration() {
    }

    /* compiled from: SessionStrategyConfiguration.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\u0006\u0010\u0014\u001a\u00020\u0006J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration$Fixed;", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;", "sessionStrategy", "Lio/bitdrift/capture/providers/session/SessionStrategy$Fixed;", "onSessionIdChanged", "Lkotlin/Function1;", "", "", "(Lio/bitdrift/capture/providers/session/SessionStrategy$Fixed;Lkotlin/jvm/functions/Function1;)V", "getOnSessionIdChanged", "()Lkotlin/jvm/functions/Function1;", "getSessionStrategy", "()Lio/bitdrift/capture/providers/session/SessionStrategy$Fixed;", "component1", "component2", "copy", "equals", "", "other", "", "generateSessionId", "hashCode", "", "toString", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Fixed extends SessionStrategyConfiguration {
        private final Function1<String, Unit> onSessionIdChanged;
        private final SessionStrategy.Fixed sessionStrategy;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fixed copy$default(Fixed fixed, SessionStrategy.Fixed fixed2, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                fixed2 = fixed.sessionStrategy;
            }
            if ((i & 2) != 0) {
                function1 = fixed.onSessionIdChanged;
            }
            return fixed.copy(fixed2, function1);
        }

        /* renamed from: component1, reason: from getter */
        public final SessionStrategy.Fixed getSessionStrategy() {
            return this.sessionStrategy;
        }

        public final Function1<String, Unit> component2() {
            return this.onSessionIdChanged;
        }

        public final Fixed copy(SessionStrategy.Fixed sessionStrategy, Function1<? super String, Unit> onSessionIdChanged) {
            Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
            Intrinsics.checkNotNullParameter(onSessionIdChanged, "onSessionIdChanged");
            return new Fixed(sessionStrategy, onSessionIdChanged);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fixed)) {
                return false;
            }
            Fixed fixed = (Fixed) other;
            return Intrinsics.areEqual(this.sessionStrategy, fixed.sessionStrategy) && Intrinsics.areEqual(this.onSessionIdChanged, fixed.onSessionIdChanged);
        }

        public int hashCode() {
            return (this.sessionStrategy.hashCode() * 31) + this.onSessionIdChanged.hashCode();
        }

        public String toString() {
            return "Fixed(sessionStrategy=" + this.sessionStrategy + ", onSessionIdChanged=" + this.onSessionIdChanged + ')';
        }

        public final SessionStrategy.Fixed getSessionStrategy() {
            return this.sessionStrategy;
        }

        public final Function1<String, Unit> getOnSessionIdChanged() {
            return this.onSessionIdChanged;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Fixed(SessionStrategy.Fixed sessionStrategy, Function1<? super String, Unit> onSessionIdChanged) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
            Intrinsics.checkNotNullParameter(onSessionIdChanged, "onSessionIdChanged");
            this.sessionStrategy = sessionStrategy;
            this.onSessionIdChanged = onSessionIdChanged;
        }

        public final String generateSessionId() {
            String strInvoke = this.sessionStrategy.getSessionIdGenerator().invoke();
            this.onSessionIdChanged.invoke(strInvoke);
            return strInvoke;
        }
    }

    /* compiled from: SessionStrategyConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0006J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m3636d2 = {"Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration$ActivityBased;", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;", "sessionStrategy", "Lio/bitdrift/capture/providers/session/SessionStrategy$ActivityBased;", "onSessionIdChanged", "Lkotlin/Function1;", "", "", "mainThreadHandler", "Lio/bitdrift/capture/common/MainThreadHandler;", "(Lio/bitdrift/capture/providers/session/SessionStrategy$ActivityBased;Lkotlin/jvm/functions/Function1;Lio/bitdrift/capture/common/MainThreadHandler;)V", "getMainThreadHandler", "()Lio/bitdrift/capture/common/MainThreadHandler;", "getOnSessionIdChanged", "()Lkotlin/jvm/functions/Function1;", "getSessionStrategy", "()Lio/bitdrift/capture/providers/session/SessionStrategy$ActivityBased;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "inactivityThresholdMins", "", "sessionIdChanged", "sessionId", "toString", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ActivityBased extends SessionStrategyConfiguration {
        private final MainThreadHandler mainThreadHandler;
        private final Function1<String, Unit> onSessionIdChanged;
        private final SessionStrategy.ActivityBased sessionStrategy;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivityBased copy$default(ActivityBased activityBased, SessionStrategy.ActivityBased activityBased2, Function1 function1, MainThreadHandler mainThreadHandler, int i, Object obj) {
            if ((i & 1) != 0) {
                activityBased2 = activityBased.sessionStrategy;
            }
            if ((i & 2) != 0) {
                function1 = activityBased.onSessionIdChanged;
            }
            if ((i & 4) != 0) {
                mainThreadHandler = activityBased.mainThreadHandler;
            }
            return activityBased.copy(activityBased2, function1, mainThreadHandler);
        }

        /* renamed from: component1, reason: from getter */
        public final SessionStrategy.ActivityBased getSessionStrategy() {
            return this.sessionStrategy;
        }

        public final Function1<String, Unit> component2() {
            return this.onSessionIdChanged;
        }

        /* renamed from: component3, reason: from getter */
        public final MainThreadHandler getMainThreadHandler() {
            return this.mainThreadHandler;
        }

        public final ActivityBased copy(SessionStrategy.ActivityBased sessionStrategy, Function1<? super String, Unit> onSessionIdChanged, MainThreadHandler mainThreadHandler) {
            Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
            Intrinsics.checkNotNullParameter(onSessionIdChanged, "onSessionIdChanged");
            Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
            return new ActivityBased(sessionStrategy, onSessionIdChanged, mainThreadHandler);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivityBased)) {
                return false;
            }
            ActivityBased activityBased = (ActivityBased) other;
            return Intrinsics.areEqual(this.sessionStrategy, activityBased.sessionStrategy) && Intrinsics.areEqual(this.onSessionIdChanged, activityBased.onSessionIdChanged) && Intrinsics.areEqual(this.mainThreadHandler, activityBased.mainThreadHandler);
        }

        public int hashCode() {
            return (((this.sessionStrategy.hashCode() * 31) + this.onSessionIdChanged.hashCode()) * 31) + this.mainThreadHandler.hashCode();
        }

        public String toString() {
            return "ActivityBased(sessionStrategy=" + this.sessionStrategy + ", onSessionIdChanged=" + this.onSessionIdChanged + ", mainThreadHandler=" + this.mainThreadHandler + ')';
        }

        public final SessionStrategy.ActivityBased getSessionStrategy() {
            return this.sessionStrategy;
        }

        public final Function1<String, Unit> getOnSessionIdChanged() {
            return this.onSessionIdChanged;
        }

        public /* synthetic */ ActivityBased(SessionStrategy.ActivityBased activityBased, Function1 function1, MainThreadHandler mainThreadHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(activityBased, function1, (i & 4) != 0 ? new MainThreadHandler() : mainThreadHandler);
        }

        public final MainThreadHandler getMainThreadHandler() {
            return this.mainThreadHandler;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActivityBased(SessionStrategy.ActivityBased sessionStrategy, Function1<? super String, Unit> onSessionIdChanged, MainThreadHandler mainThreadHandler) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
            Intrinsics.checkNotNullParameter(onSessionIdChanged, "onSessionIdChanged");
            Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
            this.sessionStrategy = sessionStrategy;
            this.onSessionIdChanged = onSessionIdChanged;
            this.mainThreadHandler = mainThreadHandler;
        }

        public final long inactivityThresholdMins() {
            return this.sessionStrategy.getInactivityThresholdMins();
        }

        public final void sessionIdChanged(String sessionId) {
            Unit unit;
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.onSessionIdChanged.invoke(sessionId);
            try {
                Result.Companion companion = Result.INSTANCE;
                Function1<String, Unit> onSessionIdChanged = this.sessionStrategy.getOnSessionIdChanged();
                if (onSessionIdChanged != null) {
                    onSessionIdChanged.invoke(sessionId);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m28550constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
