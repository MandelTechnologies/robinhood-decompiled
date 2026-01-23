package com.robinhood.shared.unverifiedaccountrecovery.phone;

import com.robinhood.models.api.pathfinder.input.FlowState;
import com.robinhood.models.p355ui.pathfinder.contexts.SmsMfaEnrollOtpContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderSmsMfaEnrollOtpViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState;", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollOtpContext;", "inputState", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollOtpContext;Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;)V", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollOtpContext;", "getInputState", "()Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputState", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PathfinderSmsMfaEnrollOtpViewState {
    public static final int $stable = 8;
    private final SmsMfaEnrollOtpContext context;
    private final InputState inputState;

    public static /* synthetic */ PathfinderSmsMfaEnrollOtpViewState copy$default(PathfinderSmsMfaEnrollOtpViewState pathfinderSmsMfaEnrollOtpViewState, SmsMfaEnrollOtpContext smsMfaEnrollOtpContext, InputState inputState, int i, Object obj) {
        if ((i & 1) != 0) {
            smsMfaEnrollOtpContext = pathfinderSmsMfaEnrollOtpViewState.context;
        }
        if ((i & 2) != 0) {
            inputState = pathfinderSmsMfaEnrollOtpViewState.inputState;
        }
        return pathfinderSmsMfaEnrollOtpViewState.copy(smsMfaEnrollOtpContext, inputState);
    }

    /* renamed from: component1, reason: from getter */
    public final SmsMfaEnrollOtpContext getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final InputState getInputState() {
        return this.inputState;
    }

    public final PathfinderSmsMfaEnrollOtpViewState copy(SmsMfaEnrollOtpContext context, InputState inputState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        return new PathfinderSmsMfaEnrollOtpViewState(context, inputState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathfinderSmsMfaEnrollOtpViewState)) {
            return false;
        }
        PathfinderSmsMfaEnrollOtpViewState pathfinderSmsMfaEnrollOtpViewState = (PathfinderSmsMfaEnrollOtpViewState) other;
        return Intrinsics.areEqual(this.context, pathfinderSmsMfaEnrollOtpViewState.context) && Intrinsics.areEqual(this.inputState, pathfinderSmsMfaEnrollOtpViewState.inputState);
    }

    public int hashCode() {
        return (this.context.hashCode() * 31) + this.inputState.hashCode();
    }

    public String toString() {
        return "PathfinderSmsMfaEnrollOtpViewState(context=" + this.context + ", inputState=" + this.inputState + ")";
    }

    public PathfinderSmsMfaEnrollOtpViewState(SmsMfaEnrollOtpContext context, InputState inputState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        this.context = context;
        this.inputState = inputState;
    }

    public final SmsMfaEnrollOtpContext getContext() {
        return this.context;
    }

    public /* synthetic */ PathfinderSmsMfaEnrollOtpViewState(SmsMfaEnrollOtpContext smsMfaEnrollOtpContext, InputState inputState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(smsMfaEnrollOtpContext, (i & 2) != 0 ? InputState.NotSent.INSTANCE : inputState);
    }

    public final InputState getInputState() {
        return this.inputState;
    }

    /* compiled from: PathfinderSmsMfaEnrollOtpViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "", "<init>", "()V", "NotSent", "Sending", "SendSucceeded", "SendFailed", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$NotSent;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$SendFailed;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$SendSucceeded;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$Sending;", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class InputState {
        public static final int $stable = 0;

        public /* synthetic */ InputState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PathfinderSmsMfaEnrollOtpViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$NotSent;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NotSent extends InputState {
            public static final int $stable = 0;
            public static final NotSent INSTANCE = new NotSent();

            private NotSent() {
                super(null);
            }
        }

        private InputState() {
        }

        /* compiled from: PathfinderSmsMfaEnrollOtpViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$Sending;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Sending extends InputState {
            public static final int $stable = 0;
            public static final Sending INSTANCE = new Sending();

            private Sending() {
                super(null);
            }
        }

        /* compiled from: PathfinderSmsMfaEnrollOtpViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$SendSucceeded;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SendSucceeded extends InputState {
            public static final int $stable = 0;
            public static final SendSucceeded INSTANCE = new SendSucceeded();

            private SendSucceeded() {
                super(null);
            }
        }

        /* compiled from: PathfinderSmsMfaEnrollOtpViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState$SendFailed;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState$InputState;", "flowState", "Lcom/robinhood/models/api/pathfinder/input/FlowState;", "<init>", "(Lcom/robinhood/models/api/pathfinder/input/FlowState;)V", "getFlowState", "()Lcom/robinhood/models/api/pathfinder/input/FlowState;", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SendFailed extends InputState {
            public static final int $stable = 0;
            private final FlowState flowState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendFailed(FlowState flowState) {
                super(null);
                Intrinsics.checkNotNullParameter(flowState, "flowState");
                this.flowState = flowState;
            }

            public final FlowState getFlowState() {
                return this.flowState;
            }
        }
    }
}
