package com.robinhood.rosetta.converters.supportx;

import com.robinhood.models.api.ChannelAvailabilityReason;
import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.rosetta.eventlogging.CXIssue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Channels.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "Lcom/robinhood/models/api/PhoneChannelStatus;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "Lcom/robinhood/models/api/ChannelAvailabilityReason;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.supportx.ChannelsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Channels3 {

    /* compiled from: Channels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.supportx.ChannelsKt$WhenMappings */
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
                iArr[PhoneChannelStatus.ASSIGNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhoneChannelStatus.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PhoneChannelStatus.MISSED.ordinal()] = 5;
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
            int[] iArr2 = new int[ChannelAvailabilityReason.values().length];
            try {
                iArr2[ChannelAvailabilityReason.OUT_OF_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChannelAvailabilityReason.ALREADY_QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ChannelAvailabilityReason.HIGH_TRAFFIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ChannelAvailabilityReason.EXTREME_HIGH_TRAFFIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ChannelAvailabilityReason.EXPERIMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ChannelAvailabilityReason.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CXIssue.CallStatus toProtobuf(PhoneChannelStatus phoneChannelStatus) {
        Intrinsics.checkNotNullParameter(phoneChannelStatus, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[phoneChannelStatus.ordinal()]) {
            case 1:
                return CXIssue.CallStatus.SCHEDULED;
            case 2:
                return CXIssue.CallStatus.WAITING;
            case 3:
                return CXIssue.CallStatus.ASSIGNED;
            case 4:
                return CXIssue.CallStatus.CANCELLED;
            case 5:
                return CXIssue.CallStatus.MISSED;
            case 6:
                return CXIssue.CallStatus.COMPLETED;
            case 7:
                return CXIssue.CallStatus.DEESCALATED;
            case 8:
                return CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CXIssue.PhoneUnavailableReason toProtobuf(ChannelAvailabilityReason channelAvailabilityReason) {
        switch (channelAvailabilityReason == null ? -1 : WhenMappings.$EnumSwitchMapping$1[channelAvailabilityReason.ordinal()]) {
            case -1:
            case 6:
                return CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CXIssue.PhoneUnavailableReason.OUT_OF_HOURS;
            case 2:
                return CXIssue.PhoneUnavailableReason.ALREADY_QUEUED;
            case 3:
                return CXIssue.PhoneUnavailableReason.HIGH_TRAFFIC;
            case 4:
                return CXIssue.PhoneUnavailableReason.EXTREME_TRAFFIC;
            case 5:
                return CXIssue.PhoneUnavailableReason.EXPERIMENT;
        }
    }
}
