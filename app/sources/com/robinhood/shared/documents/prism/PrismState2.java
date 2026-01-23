package com.robinhood.shared.documents.prism;

import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, m3636d2 = {"toStringResource", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/shared/documents/prism/PrismState;", "toEventDataAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "feature-prism_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.documents.prism.PrismStateKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PrismState2 {

    /* compiled from: PrismState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.documents.prism.PrismStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrismState.values().length];
            try {
                iArr[PrismState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrismState.DARK_ENVIRONMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrismState.FACE_NOT_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrismState.FACE_NOT_STRAIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrismState.FACE_TOO_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrismState.FACE_TOO_FAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrismState.MULTIPLE_FACES_DETECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrismState.FACE_SCANNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PrismState.GLARE_DETECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PrismState.BLUR_DETECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PrismState.INSUFFICIENT_MOTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PrismState.PROCESSING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PrismState.SUCCESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PrismState.FAILURE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PrismState.ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource toStringResource(PrismState prismState) {
        Intrinsics.checkNotNullParameter(prismState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[prismState.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_started_status_detail, new Object[0]);
            case 2:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_dark_environment_status_detail, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_face_not_detected_status_detail, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_face_not_straight_status_detail, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_face_too_close_status_detail, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_face_too_far_status_detail, new Object[0]);
            case 7:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_multiple_faces_detected_status_detail, new Object[0]);
            case 8:
                return StringResource.INSTANCE.invoke("");
            case 9:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_glare_detected_status_detail, new Object[0]);
            case 10:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_blur_detected_status_detail, new Object[0]);
            case 11:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_insufficient_motion_status_detail, new Object[0]);
            case 12:
                return StringResource.INSTANCE.invoke(C38776R.string.prism_processing_status_detail, new Object[0]);
            case 13:
                return StringResource.INSTANCE.invoke("");
            case 14:
                return StringResource.INSTANCE.invoke("");
            case 15:
                return StringResource.INSTANCE.invoke("");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final UserInteractionEventData.Action toEventDataAction(PrismState prismState) {
        Intrinsics.checkNotNullParameter(prismState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[prismState.ordinal()]) {
            case 1:
                return UserInteractionEventData.Action.LOOKING_FOR_FACE;
            case 2:
                return UserInteractionEventData.Action.SELFIE_ENVIRONMENT_DARK;
            case 3:
                return UserInteractionEventData.Action.FACE_NOT_DETECTED;
            case 4:
                return UserInteractionEventData.Action.SELFIE_FACE_NOT_STRAIGHT;
            case 5:
                return UserInteractionEventData.Action.SELFIE_FACE_TOO_CLOSE;
            case 6:
                return UserInteractionEventData.Action.SELFIE_FACE_TOO_FAR;
            case 7:
                return UserInteractionEventData.Action.SELFIE_MULTIPLE_FACES_DETECTED;
            case 8:
                return UserInteractionEventData.Action.FACE_DETECTED_CAPTURING;
            case 9:
                return UserInteractionEventData.Action.SELFIE_GLARE_DETECTED;
            case 10:
                return UserInteractionEventData.Action.FACE_BLURRY;
            case 11:
            default:
                return null;
            case 12:
                return UserInteractionEventData.Action.PROCESSING_SELFIE;
            case 13:
                return UserInteractionEventData.Action.SELFIE_VERIFICATION_SUCCESS;
            case 14:
                return UserInteractionEventData.Action.SELFIE_VERIFICATION_FAILED;
        }
    }
}
