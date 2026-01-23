package com.robinhood.android.support.call;

import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.C39996R;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallStatusViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/support/call/ButtonState;", "", "action", "Lcom/robinhood/android/support/call/ButtonState$Action;", "isLoading", "", "state", "Lcom/robinhood/models/api/PhoneChannelStatus;", "<init>", "(Lcom/robinhood/android/support/call/ButtonState$Action;ZLcom/robinhood/models/api/PhoneChannelStatus;)V", "getAction", "()Lcom/robinhood/android/support/call/ButtonState$Action;", "()Z", "buttonText", "", "getButtonText", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Action", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ButtonState {
    public static final int $stable = 0;
    private final Action action;
    private final boolean isLoading;
    private final PhoneChannelStatus state;

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PhoneChannelStatus.values().length];
            try {
                iArr[PhoneChannelStatus.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneChannelStatus.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneChannelStatus.MISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhoneChannelStatus.ASSIGNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PhoneChannelStatus.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PhoneChannelStatus.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PhoneChannelStatus.DEESCALATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PhoneChannelStatus.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Action.values().length];
            try {
                iArr2[Action.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Action.RETURN_TO_ROBINHOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Action.REQUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Action.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final PhoneChannelStatus getState() {
        return this.state;
    }

    public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, Action action, boolean z, PhoneChannelStatus phoneChannelStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            action = buttonState.action;
        }
        if ((i & 2) != 0) {
            z = buttonState.isLoading;
        }
        if ((i & 4) != 0) {
            phoneChannelStatus = buttonState.state;
        }
        return buttonState.copy(action, z, phoneChannelStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ButtonState copy(Action action, boolean isLoading, PhoneChannelStatus state) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(state, "state");
        return new ButtonState(action, isLoading, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonState)) {
            return false;
        }
        ButtonState buttonState = (ButtonState) other;
        return this.action == buttonState.action && this.isLoading == buttonState.isLoading && this.state == buttonState.state;
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "ButtonState(action=" + this.action + ", isLoading=" + this.isLoading + ", state=" + this.state + ")";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/support/call/ButtonState$Action;", "", "eventAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getEventAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "CANCEL", "RETURN_TO_ROBINHOOD", "REQUEUE", "EMAIL", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private final UserInteractionEventData.Action eventAction;
        public static final Action CANCEL = new Action("CANCEL", 0, UserInteractionEventData.Action.CANCEL_CX_CALL);
        public static final Action RETURN_TO_ROBINHOOD = new Action("RETURN_TO_ROBINHOOD", 1, UserInteractionEventData.Action.VIEW_HOME);
        public static final Action REQUEUE = new Action("REQUEUE", 2, UserInteractionEventData.Action.REQUEUE_CX_CALL);
        public static final Action EMAIL = new Action("EMAIL", 3, UserInteractionEventData.Action.VIEW_CX_EMAIL_SUPPORT);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{CANCEL, RETURN_TO_ROBINHOOD, REQUEUE, EMAIL};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i, UserInteractionEventData.Action action) {
            this.eventAction = action;
        }

        public final UserInteractionEventData.Action getEventAction() {
            return this.eventAction;
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public ButtonState(Action action, boolean z, PhoneChannelStatus state) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(state, "state");
        this.action = action;
        this.isLoading = z;
        this.state = state;
    }

    public final Action getAction() {
        return this.action;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final int getButtonText() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.action.ordinal()];
        if (i == 1) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return C39996R.string.support_call_status_cancel;
                case 4:
                case 5:
                case 6:
                case 7:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(this.state);
                    throw new ExceptionsH();
                case 8:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(this.state);
                    throw new ExceptionsH();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i != 2) {
            if (i == 3) {
                return C39996R.string.support_call_status_requeue;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return C39996R.string.support_call_status_email;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                return C39996R.string.support_call_status_return_robinhood;
            case 3:
            case 8:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.state);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
