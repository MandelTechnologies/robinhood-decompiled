package com.robinhood.android.support.call;

import com.robinhood.android.support.call.SupportCallStatusViewState3;
import com.robinhood.android.support.call.SupportCallStatusViewState4;
import com.robinhood.android.support.call.channelavailability.UnavailableChannelData;
import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.support.C39996R;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallStatusViewState.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\t\u0010C\u001a\u00020\rHÂ\u0003J\t\u0010D\u001a\u00020\rHÂ\u0003J\t\u0010E\u001a\u00020\u0011HÂ\u0003J\u0091\u0001\u0010F\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010G\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020*HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010'\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusViewState;", "", "cancelSuccessEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/userleap/survey/Survey;", "cancelFailedEvent", "", "requeueSuccessEvent", "requeueFailedEvent", "channelUnavailableEvent", "Lcom/robinhood/android/support/call/channelavailability/UnavailableChannelData;", "isLoggedIn", "", "isCanceling", "isRequeueing", "status", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZLcom/robinhood/android/support/call/SupportCallStatusLoadStatus;)V", "getCancelSuccessEvent", "()Lcom/robinhood/udf/UiEvent;", "getCancelFailedEvent", "getRequeueSuccessEvent", "getRequeueFailedEvent", "getChannelUnavailableEvent", "()Z", "successStatus", "Lcom/robinhood/android/support/call/SupportCallStatusLoadStatus$Success;", "buttonStates", "Lkotlin/Pair;", "Lcom/robinhood/android/support/call/ButtonState;", "primaryButtonState", "getPrimaryButtonState", "()Lcom/robinhood/android/support/call/ButtonState;", "secondaryButtonState", "getSecondaryButtonState", "showLoading", "getShowLoading", "canShowStaleStatusBanner", "getCanShowStaleStatusBanner", "title", "", "getTitle", "()Ljava/lang/String;", "subtitle", "Lcom/robinhood/models/serverdriven/db/RichText;", "getSubtitle", "()Lcom/robinhood/models/serverdriven/db/RichText;", "illustration", "Lcom/robinhood/android/support/call/Illustration;", "getIllustration", "()Lcom/robinhood/android/support/call/Illustration;", "issue", "Lcom/robinhood/models/ui/Issue$Phone;", "getIssue", "()Lcom/robinhood/models/ui/Issue$Phone;", "inquiryId", "Ljava/util/UUID;", "getInquiryId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SupportCallStatusViewState {
    public static final int $stable = 8;
    private final Tuples2<ButtonState, ButtonState> buttonStates;
    private final boolean canShowStaleStatusBanner;
    private final UiEvent<Unit> cancelFailedEvent;
    private final UiEvent<Optional<Survey>> cancelSuccessEvent;
    private final UiEvent<UnavailableChannelData> channelUnavailableEvent;
    private final SupportCallStatusViewState3 illustration;
    private final UUID inquiryId;
    private final boolean isCanceling;
    private final boolean isLoggedIn;
    private final boolean isRequeueing;
    private final Issue.Phone issue;
    private final ButtonState primaryButtonState;
    private final UiEvent<Unit> requeueFailedEvent;
    private final UiEvent<Unit> requeueSuccessEvent;
    private final ButtonState secondaryButtonState;
    private final boolean showLoading;
    private final SupportCallStatusViewState4 status;
    private final RichText subtitle;
    private final SupportCallStatusViewState4.Success successStatus;
    private final String title;

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneChannelStatus.values().length];
            try {
                iArr[PhoneChannelStatus.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneChannelStatus.ASSIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneChannelStatus.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhoneChannelStatus.MISSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PhoneChannelStatus.SCHEDULED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PhoneChannelStatus.COMPLETED.ordinal()] = 6;
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

    public SupportCallStatusViewState() {
        this(null, null, null, null, null, false, false, false, null, 511, null);
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getIsCanceling() {
        return this.isCanceling;
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getIsRequeueing() {
        return this.isRequeueing;
    }

    /* renamed from: component9, reason: from getter */
    private final SupportCallStatusViewState4 getStatus() {
        return this.status;
    }

    public static /* synthetic */ SupportCallStatusViewState copy$default(SupportCallStatusViewState supportCallStatusViewState, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, boolean z, boolean z2, boolean z3, SupportCallStatusViewState4 supportCallStatusViewState4, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = supportCallStatusViewState.cancelSuccessEvent;
        }
        if ((i & 2) != 0) {
            uiEvent2 = supportCallStatusViewState.cancelFailedEvent;
        }
        if ((i & 4) != 0) {
            uiEvent3 = supportCallStatusViewState.requeueSuccessEvent;
        }
        if ((i & 8) != 0) {
            uiEvent4 = supportCallStatusViewState.requeueFailedEvent;
        }
        if ((i & 16) != 0) {
            uiEvent5 = supportCallStatusViewState.channelUnavailableEvent;
        }
        if ((i & 32) != 0) {
            z = supportCallStatusViewState.isLoggedIn;
        }
        if ((i & 64) != 0) {
            z2 = supportCallStatusViewState.isCanceling;
        }
        if ((i & 128) != 0) {
            z3 = supportCallStatusViewState.isRequeueing;
        }
        if ((i & 256) != 0) {
            supportCallStatusViewState4 = supportCallStatusViewState.status;
        }
        boolean z4 = z3;
        SupportCallStatusViewState4 supportCallStatusViewState42 = supportCallStatusViewState4;
        boolean z5 = z;
        boolean z6 = z2;
        UiEvent uiEvent6 = uiEvent5;
        UiEvent uiEvent7 = uiEvent3;
        return supportCallStatusViewState.copy(uiEvent, uiEvent2, uiEvent7, uiEvent4, uiEvent6, z5, z6, z4, supportCallStatusViewState42);
    }

    public final UiEvent<Optional<Survey>> component1() {
        return this.cancelSuccessEvent;
    }

    public final UiEvent<Unit> component2() {
        return this.cancelFailedEvent;
    }

    public final UiEvent<Unit> component3() {
        return this.requeueSuccessEvent;
    }

    public final UiEvent<Unit> component4() {
        return this.requeueFailedEvent;
    }

    public final UiEvent<UnavailableChannelData> component5() {
        return this.channelUnavailableEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public final SupportCallStatusViewState copy(UiEvent<Optional<Survey>> cancelSuccessEvent, UiEvent<Unit> cancelFailedEvent, UiEvent<Unit> requeueSuccessEvent, UiEvent<Unit> requeueFailedEvent, UiEvent<UnavailableChannelData> channelUnavailableEvent, boolean isLoggedIn, boolean isCanceling, boolean isRequeueing, SupportCallStatusViewState4 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new SupportCallStatusViewState(cancelSuccessEvent, cancelFailedEvent, requeueSuccessEvent, requeueFailedEvent, channelUnavailableEvent, isLoggedIn, isCanceling, isRequeueing, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportCallStatusViewState)) {
            return false;
        }
        SupportCallStatusViewState supportCallStatusViewState = (SupportCallStatusViewState) other;
        return Intrinsics.areEqual(this.cancelSuccessEvent, supportCallStatusViewState.cancelSuccessEvent) && Intrinsics.areEqual(this.cancelFailedEvent, supportCallStatusViewState.cancelFailedEvent) && Intrinsics.areEqual(this.requeueSuccessEvent, supportCallStatusViewState.requeueSuccessEvent) && Intrinsics.areEqual(this.requeueFailedEvent, supportCallStatusViewState.requeueFailedEvent) && Intrinsics.areEqual(this.channelUnavailableEvent, supportCallStatusViewState.channelUnavailableEvent) && this.isLoggedIn == supportCallStatusViewState.isLoggedIn && this.isCanceling == supportCallStatusViewState.isCanceling && this.isRequeueing == supportCallStatusViewState.isRequeueing && Intrinsics.areEqual(this.status, supportCallStatusViewState.status);
    }

    public int hashCode() {
        UiEvent<Optional<Survey>> uiEvent = this.cancelSuccessEvent;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        UiEvent<Unit> uiEvent2 = this.cancelFailedEvent;
        int iHashCode2 = (iHashCode + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.requeueSuccessEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.requeueFailedEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<UnavailableChannelData> uiEvent5 = this.channelUnavailableEvent;
        return ((((((((iHashCode4 + (uiEvent5 != null ? uiEvent5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isCanceling)) * 31) + Boolean.hashCode(this.isRequeueing)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SupportCallStatusViewState(cancelSuccessEvent=" + this.cancelSuccessEvent + ", cancelFailedEvent=" + this.cancelFailedEvent + ", requeueSuccessEvent=" + this.requeueSuccessEvent + ", requeueFailedEvent=" + this.requeueFailedEvent + ", channelUnavailableEvent=" + this.channelUnavailableEvent + ", isLoggedIn=" + this.isLoggedIn + ", isCanceling=" + this.isCanceling + ", isRequeueing=" + this.isRequeueing + ", status=" + this.status + ")";
    }

    public SupportCallStatusViewState(UiEvent<Optional<Survey>> uiEvent, UiEvent<Unit> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, UiEvent<UnavailableChannelData> uiEvent5, boolean z, boolean z2, boolean z3, SupportCallStatusViewState4 status) {
        SupportCallStatusViewState3 drawable;
        Issue.Phone status2;
        Issue.Phone status3;
        Issue.Phone status4;
        Intrinsics.checkNotNullParameter(status, "status");
        this.cancelSuccessEvent = uiEvent;
        this.cancelFailedEvent = uiEvent2;
        this.requeueSuccessEvent = uiEvent3;
        this.requeueFailedEvent = uiEvent4;
        this.channelUnavailableEvent = uiEvent5;
        this.isLoggedIn = z;
        this.isCanceling = z2;
        this.isRequeueing = z3;
        this.status = status;
        SupportCallStatusViewState4.Success success = status instanceof SupportCallStatusViewState4.Success ? (SupportCallStatusViewState4.Success) status : null;
        this.successStatus = success;
        Tuples2<ButtonState, ButtonState> tuples2CreateButtonStates = success != null ? success.createButtonStates(z2, z3) : null;
        this.buttonStates = tuples2CreateButtonStates;
        this.primaryButtonState = tuples2CreateButtonStates != null ? tuples2CreateButtonStates.getFirst() : null;
        this.secondaryButtonState = tuples2CreateButtonStates != null ? tuples2CreateButtonStates.getSecond() : null;
        this.showLoading = status instanceof SupportCallStatusViewState4.Loading;
        this.canShowStaleStatusBanner = z;
        this.title = (success == null || (status4 = success.getStatus()) == null) ? null : status4.getDisplayTitle();
        this.subtitle = (success == null || (status3 = success.getStatus()) == null) ? null : status3.getDisplayDescription();
        PhoneChannelStatus channelStatus = (success == null || (status2 = success.getStatus()) == null) ? null : status2.getChannelStatus();
        switch (channelStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[channelStatus.ordinal()]) {
            case -1:
            case 7:
            case 8:
                drawable = new SupportCallStatusViewState3.Drawable(C39996R.drawable.svg_call_status_default);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                drawable = new SupportCallStatusViewState3.Lottie(LottieUrl.SUPPORT_CALL_WAITING, true);
                break;
            case 2:
                drawable = new SupportCallStatusViewState3.Lottie(LottieUrl.SUPPORT_CALL_ASSIGNED, true);
                break;
            case 3:
                drawable = new SupportCallStatusViewState3.Lottie(LottieUrl.SUPPORT_CALL_CANCELLED, false);
                break;
            case 4:
                drawable = new SupportCallStatusViewState3.Lottie(LottieUrl.SUPPORT_CALL_MISSED, false);
                break;
            case 5:
            case 6:
                drawable = new SupportCallStatusViewState3.Lottie(LottieUrl.SUPPORT_CALL_COMPLETED, false);
                break;
        }
        this.illustration = drawable;
        Issue.Phone status5 = success != null ? success.getStatus() : null;
        this.issue = status5;
        this.inquiryId = status5 != null ? status5.getInquiryId() : null;
    }

    public final UiEvent<Optional<Survey>> getCancelSuccessEvent() {
        return this.cancelSuccessEvent;
    }

    public final UiEvent<Unit> getCancelFailedEvent() {
        return this.cancelFailedEvent;
    }

    public final UiEvent<Unit> getRequeueSuccessEvent() {
        return this.requeueSuccessEvent;
    }

    public final UiEvent<Unit> getRequeueFailedEvent() {
        return this.requeueFailedEvent;
    }

    public final UiEvent<UnavailableChannelData> getChannelUnavailableEvent() {
        return this.channelUnavailableEvent;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public /* synthetic */ SupportCallStatusViewState(UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, boolean z, boolean z2, boolean z3, SupportCallStatusViewState4 supportCallStatusViewState4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : uiEvent2, (i & 4) != 0 ? null : uiEvent3, (i & 8) != 0 ? null : uiEvent4, (i & 16) != 0 ? null : uiEvent5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? SupportCallStatusViewState4.Loading.INSTANCE : supportCallStatusViewState4);
    }

    public final ButtonState getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public final ButtonState getSecondaryButtonState() {
        return this.secondaryButtonState;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getCanShowStaleStatusBanner() {
        return this.canShowStaleStatusBanner;
    }

    public final String getTitle() {
        return this.title;
    }

    public final RichText getSubtitle() {
        return this.subtitle;
    }

    public final SupportCallStatusViewState3 getIllustration() {
        return this.illustration;
    }

    public final Issue.Phone getIssue() {
        return this.issue;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }
}
