package com.robinhood.shared.crypto.transfer.enrollment.navigation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment3;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentDestination;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentEventReducer.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\b\u001a\u00020\t*\u00020\u000eH\u0002J\f\u0010\b\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\b\u001a\u00020\t*\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReducer;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "reduce", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentDestination;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "event", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Start;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Agreement;", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEvent$Checklist;", "checkForCompletion", "enrollment", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EnrollmentEventReducer {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    /* compiled from: EnrollmentEventReducer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ApiCryptoTransferConfig.TransferStates.EnrollmentState.values().length];
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.EnrollmentState.ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.EnrollmentState.PRODUCT_INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.EnrollmentState.ENROLLMENT_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.EnrollmentState.ENROLLMENT_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCryptoTransferConfig.TransferStates.EnrollmentState.ENROLLMENT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoTransferAction.values().length];
            try {
                iArr2[CryptoTransferAction.RECEIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CryptoTransferAction.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CryptoTransferAction.ENROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CryptoTransferAction.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CryptoTransferAction.SAVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiCryptoTransferEnrollment3.values().length];
            try {
                iArr3[ApiCryptoTransferEnrollment3.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ApiCryptoTransferEnrollment3.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ApiCryptoTransferEnrollment3.PENDING_APPROVAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ApiCryptoTransferEnrollment3.APPROVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ApiCryptoTransferEnrollment3.COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ApiCryptoTransferEnrollment3.STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ApiCryptoTransferEnrollment3.ADDITIONAL_INFORMATION_REQUESTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public EnrollmentEventReducer(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final EventLogger getEventLogger() {
        return this.eventLogger;
    }

    public final EnrollmentDestination reduce(CryptoTransferAction action, EnrollmentEvent event) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof EnrollmentEvent.Start) {
            return reduce((EnrollmentEvent.Start) event);
        }
        if (event instanceof EnrollmentEvent.IntroLoaded) {
            return new EnrollmentDestination.Intro(((EnrollmentEvent.IntroLoaded) event).getFiles());
        }
        if (Intrinsics.areEqual(event, EnrollmentEvent.StartEnrollment.INSTANCE)) {
            return EnrollmentDestination.Protection.INSTANCE;
        }
        if (Intrinsics.areEqual(event, EnrollmentEvent.AckScamWarning.INSTANCE)) {
            return EnrollmentDestination.Agreement.INSTANCE;
        }
        if (event instanceof EnrollmentEvent.Agreement) {
            return reduce((EnrollmentEvent.Agreement) event);
        }
        if (event instanceof EnrollmentEvent.Checklist) {
            return reduce((EnrollmentEvent.Checklist) event);
        }
        if (event instanceof EnrollmentEvent.CheckForCompletion) {
            return checkForCompletion(action, ((EnrollmentEvent.CheckForCompletion) event).getEnrollment());
        }
        if (Intrinsics.areEqual(event, EnrollmentEvent.ToPreviousStep.INSTANCE)) {
            return EnrollmentDestination.PopBack.INSTANCE;
        }
        if (event instanceof EnrollmentEvent.Done) {
            return new EnrollmentDestination.Exit(((EnrollmentEvent.Done) event).getExitDeeplink());
        }
        if (!Intrinsics.areEqual(event, EnrollmentEvent.ErrorAcknowledged.INSTANCE) && !Intrinsics.areEqual(event, EnrollmentEvent.Exit.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return new EnrollmentDestination.Exit(null);
    }

    private final EnrollmentDestination reduce(EnrollmentEvent.Start start) {
        int i = WhenMappings.$EnumSwitchMapping$0[start.getEnrollmentState().ordinal()];
        if (i == 1) {
            return EnrollmentDestination.Protection.INSTANCE;
        }
        if (i == 2) {
            return EnrollmentDestination.IntroLoading.INSTANCE;
        }
        if (i == 3) {
            return EnrollmentDestination.Pending.INSTANCE;
        }
        if (i == 4) {
            return EnrollmentDestination.Completed.INSTANCE;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return EnrollmentDestination.Error.INSTANCE;
    }

    private final EnrollmentDestination reduce(EnrollmentEvent.Agreement agreement) {
        if (Intrinsics.areEqual(agreement, EnrollmentEvent.Agreement.AckedAgreement.INSTANCE)) {
            return EnrollmentDestination.Checklist.INSTANCE;
        }
        if (Intrinsics.areEqual(agreement, EnrollmentEvent.Agreement.Skip.INSTANCE)) {
            return new EnrollmentDestination.Exit(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnrollmentDestination reduce(EnrollmentEvent.Checklist checklist) {
        if (checklist instanceof EnrollmentEvent.Checklist.DocumentRequest) {
            return new EnrollmentDestination.DocumentUpload(((EnrollmentEvent.Checklist.DocumentRequest) checklist).getDeeplinkUri());
        }
        if (Intrinsics.areEqual(checklist, EnrollmentEvent.Checklist.TwoFactorAuthSetup.INSTANCE)) {
            return EnrollmentDestination.TwoFactorAuth.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnrollmentDestination checkForCompletion(CryptoTransferAction action, ApiCryptoTransferEnrollment enrollment) {
        boolean zCanFinalizeEnrollment = enrollment.canFinalizeEnrollment();
        switch (WhenMappings.$EnumSwitchMapping$2[enrollment.getEnrollment_state().ordinal()]) {
            case 1:
            case 2:
                return EnrollmentDestination.Error.INSTANCE;
            case 3:
                if (!zCanFinalizeEnrollment && (action == CryptoTransferAction.RECEIVE || action == CryptoTransferAction.SEND)) {
                    return EnrollmentDestination.Checklist.INSTANCE;
                }
                return EnrollmentDestination.Pending.INSTANCE;
            case 4:
            case 5:
                if (!zCanFinalizeEnrollment) {
                    return EnrollmentDestination.Checklist.INSTANCE;
                }
                EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(null, null, null, UserInteractionEventData.Action.CRYPTO_TRANSFER_ENROLLMENT_SUCCESS, null, null, null, 119, null), false, false, 6, null);
                int i = WhenMappings.$EnumSwitchMapping$1[action.ordinal()];
                if (i == 1) {
                    return EnrollmentDestination.NavigateToReceive.INSTANCE;
                }
                if (i == 2) {
                    return EnrollmentDestination.NavigateToSend.INSTANCE;
                }
                if (i == 3) {
                    return EnrollmentDestination.Completed.INSTANCE;
                }
                if (i == 4 || i == 5) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
            case 7:
                return EnrollmentDestination.Checklist.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
