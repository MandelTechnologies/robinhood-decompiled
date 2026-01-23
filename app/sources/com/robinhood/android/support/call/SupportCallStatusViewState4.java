package com.robinhood.android.support.call;

import com.robinhood.android.support.call.ButtonState;
import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.models.p355ui.Issue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallStatusViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus;", "", "<init>", "()V", "Loading", "Success", "Failed", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Failed;", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Loading;", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Success;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.SupportCallStatusLoadStatus, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class SupportCallStatusViewState4 {
    public static final int $stable = 0;

    public /* synthetic */ SupportCallStatusViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Loading;", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.SupportCallStatusLoadStatus$Loading */
    public static final class Loading extends SupportCallStatusViewState4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private SupportCallStatusViewState4() {
    }

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Success;", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus;", "status", "Lcom/robinhood/models/ui/Issue$Phone;", "<init>", "(Lcom/robinhood/models/ui/Issue$Phone;)V", "getStatus", "()Lcom/robinhood/models/ui/Issue$Phone;", "createButtonStates", "Lkotlin/Pair;", "Lcom/robinhood/android/support/call/ButtonState;", "isCanceling", "", "isRequeuing", "createCancelButtonState", "createRequeueButtonState", "isRequeueing", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.SupportCallStatusLoadStatus$Success */
    public static final class Success extends SupportCallStatusViewState4 {
        public static final int $stable = 8;
        private final Issue.Phone status;

        /* compiled from: SupportCallStatusViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.support.call.SupportCallStatusLoadStatus$Success$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                    iArr[PhoneChannelStatus.ASSIGNED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PhoneChannelStatus.MISSED.ordinal()] = 4;
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
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Issue.Phone status) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public final Issue.Phone getStatus() {
            return this.status;
        }

        public final Tuples2<ButtonState, ButtonState> createButtonStates(boolean isCanceling, boolean isRequeuing) {
            PhoneChannelStatus channelStatus = this.status.getChannelStatus();
            switch (WhenMappings.$EnumSwitchMapping$0[channelStatus.ordinal()]) {
                case 1:
                case 2:
                    return Tuples4.m3642to(new ButtonState(ButtonState.Action.RETURN_TO_ROBINHOOD, false, channelStatus), createCancelButtonState(isCanceling));
                case 3:
                    return Tuples4.m3642to(new ButtonState(ButtonState.Action.RETURN_TO_ROBINHOOD, false, channelStatus), null);
                case 4:
                    return Tuples4.m3642to(createRequeueButtonState(isRequeuing), createCancelButtonState(isCanceling));
                case 5:
                    return Tuples4.m3642to(new ButtonState(ButtonState.Action.RETURN_TO_ROBINHOOD, false, channelStatus), null);
                case 6:
                    return Tuples4.m3642to(new ButtonState(ButtonState.Action.RETURN_TO_ROBINHOOD, false, channelStatus), null);
                case 7:
                    return Tuples4.m3642to(new ButtonState(ButtonState.Action.RETURN_TO_ROBINHOOD, false, channelStatus), null);
                case 8:
                    return Tuples4.m3642to(null, null);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final ButtonState createCancelButtonState(boolean isCanceling) {
            if (this.status.isCancellable()) {
                return new ButtonState(ButtonState.Action.CANCEL, isCanceling, this.status.getChannelStatus());
            }
            return null;
        }

        private final ButtonState createRequeueButtonState(boolean isRequeueing) {
            if (this.status.isRequeueable()) {
                return new ButtonState(ButtonState.Action.REQUEUE, isRequeueing, this.status.getChannelStatus());
            }
            return null;
        }
    }

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Failed;", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.SupportCallStatusLoadStatus$Failed */
    public static final class Failed extends SupportCallStatusViewState4 {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }
}
