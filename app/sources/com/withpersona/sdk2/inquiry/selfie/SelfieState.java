package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState2;
import com.withpersona.sdk2.inquiry.selfie.SelfieState3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieState.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138 X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0010()*+,-./01234567¨\u00068"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Landroid/os/Parcelable;", "<init>", "()V", "", "didGoBack", "Z", "getDidGoBack$selfie_release", "()Z", "setDidGoBack$selfie_release", "(Z)V", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "getSelfies$selfie_release", "()Ljava/util/List;", "selfies", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "ShowInstructions", "WaitForCameraFeed", "RestartCamera", "WaitForWebRtcSetup", "ShowPoseHint", "StartCapture", "StartCaptureFaceDetected", "CountdownToCapture", "CountdownToManualCapture", "FlashState", "Capture", "CaptureTransition", "FinalizeLocalVideoCapture", "FinalizeWebRtc", "WebRtcFinished", "ReviewCaptures", "Submit", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public abstract class SelfieState implements Parcelable {
    private boolean didGoBack;

    public /* synthetic */ SelfieState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: getBackState$selfie_release */
    public abstract SelfieState getBackState();

    /* renamed from: getCameraFacingMode$selfie_release */
    public abstract CameraProperties.FacingMode getCameraFacingMode();

    public abstract List<Selfie> getSelfies$selfie_release();

    private SelfieState() {
    }

    public final void setDidGoBack$selfie_release(boolean z) {
        this.didGoBack = z;
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Ljava/util/List;", "getSelfies$selfie_release", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ShowInstructions extends SelfieState {
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final List<Selfie> selfies;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowInstructions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowInstructions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowInstructions((SelfieState) parcel.readParcelable(ShowInstructions.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowInstructions[] newArray(int i) {
                return new ShowInstructions[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        public /* synthetic */ ShowInstructions(SelfieState selfieState, CameraProperties.FacingMode facingMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(selfieState, (i & 2) != 0 ? CameraProperties.FacingMode.User : facingMode);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowInstructions(SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b2\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010'R&\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00078\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b7\u0010,\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010.¨\u0006;"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasRequestedCameraPermissions", "()Z", "getHasRequestedAudioPermissions", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Ljava/util/List;", "getPosesNeeded", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getAutoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "getSelfies$selfie_release", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class WaitForCameraFeed extends SelfieState implements SelfieState2 {
        public static final Parcelable.Creator<WaitForCameraFeed> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final boolean hasRequestedAudioPermissions;
        private final boolean hasRequestedCameraPermissions;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final List<Selfie.Pose> posesNeeded;
        private final List<Selfie> selfies;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WaitForCameraFeed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WaitForCameraFeed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                SelfieState selfieState = (SelfieState) parcel.readParcelable(WaitForCameraFeed.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                return new WaitForCameraFeed(z, z2, selfieState, arrayList, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WaitForCameraFeed[] newArray(int i) {
                return new WaitForCameraFeed[i];
            }
        }

        public static /* synthetic */ WaitForCameraFeed copy$default(WaitForCameraFeed waitForCameraFeed, boolean z, boolean z2, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z3, CameraProperties.FacingMode facingMode, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = waitForCameraFeed.hasRequestedCameraPermissions;
            }
            if ((i & 2) != 0) {
                z2 = waitForCameraFeed.hasRequestedAudioPermissions;
            }
            if ((i & 4) != 0) {
                selfieState = waitForCameraFeed.backState;
            }
            if ((i & 8) != 0) {
                list = waitForCameraFeed.posesNeeded;
            }
            if ((i & 16) != 0) {
                poseConfigs = waitForCameraFeed.poseConfigs;
            }
            if ((i & 32) != 0) {
                z3 = waitForCameraFeed.autoCaptureSupported;
            }
            if ((i & 64) != 0) {
                facingMode = waitForCameraFeed.cameraFacingMode;
            }
            if ((i & 128) != 0) {
                z4 = waitForCameraFeed.isFlashEnabled;
            }
            CameraProperties.FacingMode facingMode2 = facingMode;
            boolean z5 = z4;
            PoseConfigs poseConfigs2 = poseConfigs;
            boolean z6 = z3;
            return waitForCameraFeed.copy(z, z2, selfieState, list, poseConfigs2, z6, facingMode2, z5);
        }

        public final WaitForCameraFeed copy(boolean hasRequestedCameraPermissions, boolean hasRequestedAudioPermissions, SelfieState backState, List<? extends Selfie.Pose> posesNeeded, PoseConfigs poseConfigs, boolean autoCaptureSupported, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new WaitForCameraFeed(hasRequestedCameraPermissions, hasRequestedAudioPermissions, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForCameraFeed)) {
                return false;
            }
            WaitForCameraFeed waitForCameraFeed = (WaitForCameraFeed) other;
            return this.hasRequestedCameraPermissions == waitForCameraFeed.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == waitForCameraFeed.hasRequestedAudioPermissions && Intrinsics.areEqual(this.backState, waitForCameraFeed.backState) && Intrinsics.areEqual(this.posesNeeded, waitForCameraFeed.posesNeeded) && Intrinsics.areEqual(this.poseConfigs, waitForCameraFeed.poseConfigs) && this.autoCaptureSupported == waitForCameraFeed.autoCaptureSupported && this.cameraFacingMode == waitForCameraFeed.cameraFacingMode && this.isFlashEnabled == waitForCameraFeed.isFlashEnabled;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "WaitForCameraFeed(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            dest.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            List<Selfie.Pose> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<Selfie.Pose> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState2.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState2.DefaultImpls.getCurrentPoseOrNull(this);
        }

        public /* synthetic */ WaitForCameraFeed(boolean z, boolean z2, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z3, CameraProperties.FacingMode facingMode, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, selfieState, list, poseConfigs, (i & 32) != 0 ? true : z3, facingMode, (i & 128) != 0 ? false : z4);
        }

        public final boolean getHasRequestedCameraPermissions() {
            return this.hasRequestedCameraPermissions;
        }

        public final boolean getHasRequestedAudioPermissions() {
            return this.hasRequestedAudioPermissions;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForCameraFeed(boolean z, boolean z2, SelfieState selfieState, List<? extends Selfie.Pose> posesNeeded, PoseConfigs poseConfigs, boolean z3, CameraProperties.FacingMode cameraFacingMode, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z;
            this.hasRequestedAudioPermissions = z2;
            this.backState = selfieState;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z3;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z4;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R&\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006-"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "hasRequestedCameraPermissions", "hasRequestedAudioPermissions", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasRequestedCameraPermissions", "()Z", "getHasRequestedAudioPermissions", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Ljava/util/List;", "getSelfies$selfie_release", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class RestartCamera extends SelfieState {
        public static final Parcelable.Creator<RestartCamera> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final boolean hasRequestedAudioPermissions;
        private final boolean hasRequestedCameraPermissions;
        private final List<Selfie> selfies;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RestartCamera> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RestartCamera createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestartCamera(parcel.readInt() != 0, parcel.readInt() != 0, (SelfieState) parcel.readParcelable(RestartCamera.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RestartCamera[] newArray(int i) {
                return new RestartCamera[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestartCamera)) {
                return false;
            }
            RestartCamera restartCamera = (RestartCamera) other;
            return this.hasRequestedCameraPermissions == restartCamera.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == restartCamera.hasRequestedAudioPermissions && Intrinsics.areEqual(this.backState, restartCamera.backState) && this.cameraFacingMode == restartCamera.cameraFacingMode;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasRequestedCameraPermissions) * 31) + Boolean.hashCode(this.hasRequestedAudioPermissions)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        public String toString() {
            return "RestartCamera(hasRequestedCameraPermissions=" + this.hasRequestedCameraPermissions + ", hasRequestedAudioPermissions=" + this.hasRequestedAudioPermissions + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            dest.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        public /* synthetic */ RestartCamera(boolean z, boolean z2, SelfieState selfieState, CameraProperties.FacingMode facingMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, selfieState, facingMode);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RestartCamera(boolean z, boolean z2, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.hasRequestedCameraPermissions = z;
            this.hasRequestedAudioPermissions = z2;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b\u0013\u0010;R&\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\n8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\b@\u00103\u0012\u0004\bB\u0010C\u001a\u0004\bA\u00105¨\u0006D"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "", "webRtcJwt", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWebRtcJwt", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "J", "getStartSelfieTimestamp", "()J", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Ljava/util/List;", "getPosesNeeded", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Z", "getAutoCaptureSupported", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "getSelfies$selfie_release", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class WaitForWebRtcSetup extends SelfieState implements SelfieState2 {
        public static final Parcelable.Creator<WaitForWebRtcSetup> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final List<Selfie.Pose> posesNeeded;
        private final List<Selfie> selfies;
        private final long startSelfieTimestamp;
        private final String webRtcJwt;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WaitForWebRtcSetup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WaitForWebRtcSetup createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                long j = parcel.readLong();
                SelfieState selfieState = (SelfieState) parcel.readParcelable(WaitForWebRtcSetup.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new WaitForWebRtcSetup(string2, cameraProperties, j, selfieState, arrayList, poseConfigsCreateFromParcel, z2, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WaitForWebRtcSetup[] newArray(int i) {
                return new WaitForWebRtcSetup[i];
            }
        }

        public static /* synthetic */ WaitForWebRtcSetup copy$default(WaitForWebRtcSetup waitForWebRtcSetup, String str, CameraProperties cameraProperties, long j, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode facingMode, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = waitForWebRtcSetup.webRtcJwt;
            }
            if ((i & 2) != 0) {
                cameraProperties = waitForWebRtcSetup.cameraProperties;
            }
            if ((i & 4) != 0) {
                j = waitForWebRtcSetup.startSelfieTimestamp;
            }
            if ((i & 8) != 0) {
                selfieState = waitForWebRtcSetup.backState;
            }
            if ((i & 16) != 0) {
                list = waitForWebRtcSetup.posesNeeded;
            }
            if ((i & 32) != 0) {
                poseConfigs = waitForWebRtcSetup.poseConfigs;
            }
            if ((i & 64) != 0) {
                z = waitForWebRtcSetup.autoCaptureSupported;
            }
            if ((i & 128) != 0) {
                facingMode = waitForWebRtcSetup.cameraFacingMode;
            }
            if ((i & 256) != 0) {
                z2 = waitForWebRtcSetup.isFlashEnabled;
            }
            CameraProperties.FacingMode facingMode2 = facingMode;
            boolean z3 = z2;
            long j2 = j;
            return waitForWebRtcSetup.copy(str, cameraProperties, j2, selfieState, list, poseConfigs, z, facingMode2, z3);
        }

        public final WaitForWebRtcSetup copy(String webRtcJwt, CameraProperties cameraProperties, long startSelfieTimestamp, SelfieState backState, List<? extends Selfie.Pose> posesNeeded, PoseConfigs poseConfigs, boolean autoCaptureSupported, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new WaitForWebRtcSetup(webRtcJwt, cameraProperties, startSelfieTimestamp, backState, posesNeeded, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForWebRtcSetup)) {
                return false;
            }
            WaitForWebRtcSetup waitForWebRtcSetup = (WaitForWebRtcSetup) other;
            return Intrinsics.areEqual(this.webRtcJwt, waitForWebRtcSetup.webRtcJwt) && Intrinsics.areEqual(this.cameraProperties, waitForWebRtcSetup.cameraProperties) && this.startSelfieTimestamp == waitForWebRtcSetup.startSelfieTimestamp && Intrinsics.areEqual(this.backState, waitForWebRtcSetup.backState) && Intrinsics.areEqual(this.posesNeeded, waitForWebRtcSetup.posesNeeded) && Intrinsics.areEqual(this.poseConfigs, waitForWebRtcSetup.poseConfigs) && this.autoCaptureSupported == waitForWebRtcSetup.autoCaptureSupported && this.cameraFacingMode == waitForWebRtcSetup.cameraFacingMode && this.isFlashEnabled == waitForWebRtcSetup.isFlashEnabled;
        }

        public int hashCode() {
            String str = this.webRtcJwt;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((((iHashCode + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.posesNeeded.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "WaitForWebRtcSetup(webRtcJwt=" + this.webRtcJwt + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            List<Selfie.Pose> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<Selfie.Pose> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState2.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState2.DefaultImpls.getCurrentPoseOrNull(this);
        }

        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForWebRtcSetup(String str, CameraProperties cameraProperties, long j, SelfieState selfieState, List<? extends Selfie.Pose> posesNeeded, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode cameraFacingMode, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.webRtcJwt = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.posesNeeded = posesNeeded;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z2;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b\u0013\u0010/¨\u0006?"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSelfies$selfie_release", "()Ljava/util/List;", "getPosesNeeded", "Z", "getAutoCaptureSupported", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "J", "getStartSelfieTimestamp", "()J", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ShowPoseHint extends SelfieState implements SelfieState2 {
        public static final Parcelable.Creator<ShowPoseHint> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final List<Selfie.Pose> posesNeeded;
        private final List<Selfie> selfies;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowPoseHint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowPoseHint createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ShowPoseHint.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                if (parcel.readInt() != 0) {
                    cls = ShowPoseHint.class;
                    z = true;
                } else {
                    cls = ShowPoseHint.class;
                    z = false;
                }
                return new ShowPoseHint(arrayList, arrayList2, z, (CameraProperties) parcel.readParcelable(cls.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(cls.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShowPoseHint[] newArray(int i) {
                return new ShowPoseHint[i];
            }
        }

        public static /* synthetic */ ShowPoseHint copy$default(ShowPoseHint showPoseHint, List list, List list2, boolean z, CameraProperties cameraProperties, long j, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = showPoseHint.selfies;
            }
            if ((i & 2) != 0) {
                list2 = showPoseHint.posesNeeded;
            }
            if ((i & 4) != 0) {
                z = showPoseHint.autoCaptureSupported;
            }
            if ((i & 8) != 0) {
                cameraProperties = showPoseHint.cameraProperties;
            }
            if ((i & 16) != 0) {
                j = showPoseHint.startSelfieTimestamp;
            }
            if ((i & 32) != 0) {
                selfieState = showPoseHint.backState;
            }
            if ((i & 64) != 0) {
                poseConfigs = showPoseHint.poseConfigs;
            }
            if ((i & 128) != 0) {
                facingMode = showPoseHint.cameraFacingMode;
            }
            if ((i & 256) != 0) {
                z2 = showPoseHint.isFlashEnabled;
            }
            long j2 = j;
            boolean z3 = z;
            CameraProperties cameraProperties2 = cameraProperties;
            return showPoseHint.copy(list, list2, z3, cameraProperties2, j2, selfieState, poseConfigs, facingMode, z2);
        }

        public final ShowPoseHint copy(List<? extends Selfie> selfies, List<? extends Selfie.Pose> posesNeeded, boolean autoCaptureSupported, CameraProperties cameraProperties, long startSelfieTimestamp, SelfieState backState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new ShowPoseHint(selfies, posesNeeded, autoCaptureSupported, cameraProperties, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPoseHint)) {
                return false;
            }
            ShowPoseHint showPoseHint = (ShowPoseHint) other;
            return Intrinsics.areEqual(this.selfies, showPoseHint.selfies) && Intrinsics.areEqual(this.posesNeeded, showPoseHint.posesNeeded) && this.autoCaptureSupported == showPoseHint.autoCaptureSupported && Intrinsics.areEqual(this.cameraProperties, showPoseHint.cameraProperties) && this.startSelfieTimestamp == showPoseHint.startSelfieTimestamp && Intrinsics.areEqual(this.backState, showPoseHint.backState) && Intrinsics.areEqual(this.poseConfigs, showPoseHint.poseConfigs) && this.cameraFacingMode == showPoseHint.cameraFacingMode && this.isFlashEnabled == showPoseHint.isFlashEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.selfies.hashCode() * 31) + this.posesNeeded.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "ShowPoseHint(selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<Selfie.Pose> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<Selfie.Pose> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState2.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState2.DefaultImpls.getCurrentPoseOrNull(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowPoseHint(List<? extends Selfie> selfies, List<? extends Selfie.Pose> posesNeeded, boolean z, CameraProperties cameraProperties, long j, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.autoCaptureSupported = z;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z2;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u009e\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010-\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010:R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0010\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\bA\u00101R\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bB\u0010@R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0018\u001a\u00020\u00178\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b\u0019\u00101R&\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u000b8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bP\u0010;\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010=¨\u0006T"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CaptureState;", "", "centered", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "selfieError", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "", "startCaptureTimestamp", "autoCaptureSupported", "startSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ZLcom/withpersona/sdk2/camera/selfie/SelfieError;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ZLcom/withpersona/sdk2/camera/selfie/SelfieError;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCentered", "()Z", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "getSelfieError", "()Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "F", "getPoseScore", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Ljava/util/List;", "getPosesNeeded", "()Ljava/util/List;", "J", "getStartCaptureTimestamp", "()J", "getAutoCaptureSupported", "getStartSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "getSelfies$selfie_release", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class StartCapture extends SelfieState implements SelfieState3 {
        public static final Parcelable.Creator<StartCapture> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final SelfieBrightnessInfo brightnessInfo;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final boolean centered;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final float poseScore;
        private final List<Selfie.Pose> posesNeeded;
        private final SelfieError selfieError;
        private final List<Selfie> selfies;
        private final long startCaptureTimestamp;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StartCapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                SelfieError selfieErrorValueOf = parcel.readInt() == 0 ? null : SelfieError.valueOf(parcel.readString());
                float f = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(StartCapture.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                return new StartCapture(z, selfieErrorValueOf, f, selfieBrightnessInfo, arrayList, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (CameraProperties) parcel.readParcelable(StartCapture.class.getClassLoader()), (SelfieState) parcel.readParcelable(StartCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartCapture[] newArray(int i) {
                return new StartCapture[i];
            }
        }

        public final StartCapture copy(boolean centered, SelfieError selfieError, float poseScore, SelfieBrightnessInfo brightnessInfo, List<? extends Selfie.Pose> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, CameraProperties cameraProperties, SelfieState backState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new StartCapture(centered, selfieError, poseScore, brightnessInfo, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCapture)) {
                return false;
            }
            StartCapture startCapture = (StartCapture) other;
            return this.centered == startCapture.centered && this.selfieError == startCapture.selfieError && Float.compare(this.poseScore, startCapture.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, startCapture.brightnessInfo) && Intrinsics.areEqual(this.posesNeeded, startCapture.posesNeeded) && this.startCaptureTimestamp == startCapture.startCaptureTimestamp && this.autoCaptureSupported == startCapture.autoCaptureSupported && this.startSelfieTimestamp == startCapture.startSelfieTimestamp && Intrinsics.areEqual(this.cameraProperties, startCapture.cameraProperties) && Intrinsics.areEqual(this.backState, startCapture.backState) && Intrinsics.areEqual(this.poseConfigs, startCapture.poseConfigs) && this.cameraFacingMode == startCapture.cameraFacingMode && this.isFlashEnabled == startCapture.isFlashEnabled;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.centered) * 31;
            SelfieError selfieError = this.selfieError;
            int iHashCode2 = (((iHashCode + (selfieError == null ? 0 : selfieError.hashCode())) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode3 = (((((((((((iHashCode2 + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((iHashCode3 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "StartCapture(centered=" + this.centered + ", selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.centered ? 1 : 0);
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(selfieError.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<Selfie.Pose> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<Selfie.Pose> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState3.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfig getCurrentPoseConfig() {
            return SelfieState3.DefaultImpls.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState3.DefaultImpls.getCurrentPoseOrNull(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public boolean getManualCaptureEnabled() {
            return SelfieState3.DefaultImpls.getManualCaptureEnabled(this);
        }

        public /* synthetic */ StartCapture(boolean z, SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, long j, boolean z2, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? SelfieError.FaceNotCentered : selfieError, f, selfieBrightnessInfo, list, j, (i & 64) != 0 ? true : z2, j2, cameraProperties, selfieState, poseConfigs, facingMode, z3);
        }

        public final SelfieError getSelfieError() {
            return this.selfieError;
        }

        public final float getPoseScore() {
            return this.poseScore;
        }

        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCapture(boolean z, SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List<? extends Selfie.Pose> posesNeeded, long j, boolean z2, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.centered = z;
            this.selfieError = selfieError;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z2;
            this.startSelfieTimestamp = j2;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z3;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010!J\u001a\u0010*\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\b\u0016\u0010DR&\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\f8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bI\u00109\u0012\u0004\bK\u0010L\u001a\u0004\bJ\u0010;¨\u0006M"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "", "startCaptureTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getStartCaptureTimestamp", "()J", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "F", "getPoseScore", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Ljava/util/List;", "getPosesNeeded", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Z", "getAutoCaptureSupported", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "getSelfies$selfie_release", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class StartCaptureFaceDetected extends SelfieState implements SelfieState2 {
        public static final Parcelable.Creator<StartCaptureFaceDetected> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final SelfieBrightnessInfo brightnessInfo;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final float poseScore;
        private final List<Selfie.Pose> posesNeeded;
        private final List<Selfie> selfies;
        private final long startCaptureTimestamp;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StartCaptureFaceDetected> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartCaptureFaceDetected createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                long j = parcel.readLong();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                long j2 = parcel.readLong();
                float f = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                SelfieState selfieState = (SelfieState) parcel.readParcelable(StartCaptureFaceDetected.class.getClassLoader());
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new StartCaptureFaceDetected(j, cameraProperties, j2, f, selfieBrightnessInfo, arrayList, selfieState, poseConfigsCreateFromParcel, z2, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartCaptureFaceDetected[] newArray(int i) {
                return new StartCaptureFaceDetected[i];
            }
        }

        public final StartCaptureFaceDetected copy(long startCaptureTimestamp, CameraProperties cameraProperties, long startSelfieTimestamp, float poseScore, SelfieBrightnessInfo brightnessInfo, List<? extends Selfie.Pose> posesNeeded, SelfieState backState, PoseConfigs poseConfigs, boolean autoCaptureSupported, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new StartCaptureFaceDetected(startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCaptureFaceDetected)) {
                return false;
            }
            StartCaptureFaceDetected startCaptureFaceDetected = (StartCaptureFaceDetected) other;
            return this.startCaptureTimestamp == startCaptureFaceDetected.startCaptureTimestamp && Intrinsics.areEqual(this.cameraProperties, startCaptureFaceDetected.cameraProperties) && this.startSelfieTimestamp == startCaptureFaceDetected.startSelfieTimestamp && Float.compare(this.poseScore, startCaptureFaceDetected.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, startCaptureFaceDetected.brightnessInfo) && Intrinsics.areEqual(this.posesNeeded, startCaptureFaceDetected.posesNeeded) && Intrinsics.areEqual(this.backState, startCaptureFaceDetected.backState) && Intrinsics.areEqual(this.poseConfigs, startCaptureFaceDetected.poseConfigs) && this.autoCaptureSupported == startCaptureFaceDetected.autoCaptureSupported && this.cameraFacingMode == startCaptureFaceDetected.cameraFacingMode && this.isFlashEnabled == startCaptureFaceDetected.isFlashEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((Long.hashCode(this.startCaptureTimestamp) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode2 = (((iHashCode + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "StartCaptureFaceDetected(startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<Selfie.Pose> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<Selfie.Pose> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState2.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfig getCurrentPoseConfig() {
            return SelfieState2.DefaultImpls.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState2.DefaultImpls.getCurrentPoseOrNull(this);
        }

        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        public final float getPoseScore() {
            return this.poseScore;
        }

        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCaptureFaceDetected(long j, CameraProperties cameraProperties, long j2, float f, SelfieBrightnessInfo selfieBrightnessInfo, List<? extends Selfie.Pose> posesNeeded, SelfieState selfieState, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode cameraFacingMode, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.startCaptureTimestamp = j;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = posesNeeded;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z2;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\u009e\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010-\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b:\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0019\u001a\u00020\u00188\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\b\u001a\u0010LR&\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00108\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bQ\u0010A\u0012\u0004\bS\u0010T\u001a\u0004\bR\u0010C¨\u0006U"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CameraState;", "", "countDown", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "selfieError", "", "startCaptureTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "", "autoCaptureSupported", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ILcom/withpersona/sdk2/camera/selfie/SelfieError;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ILcom/withpersona/sdk2/camera/selfie/SelfieError;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCountDown", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "getSelfieError", "()Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "J", "getStartCaptureTimestamp", "()J", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "F", "getPoseScore", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Ljava/util/List;", "getPosesNeeded", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Z", "getAutoCaptureSupported", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "getSelfies$selfie_release", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CountdownToCapture extends SelfieState implements SelfieState2 {
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final SelfieBrightnessInfo brightnessInfo;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final int countDown;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final float poseScore;
        private final List<Selfie.Pose> posesNeeded;
        private final SelfieError selfieError;
        private final List<Selfie> selfies;
        private final long startCaptureTimestamp;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CountdownToCapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                SelfieError selfieErrorValueOf = parcel.readInt() == 0 ? null : SelfieError.valueOf(parcel.readString());
                long j = parcel.readLong();
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                long j2 = parcel.readLong();
                float f = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                SelfieState selfieState = (SelfieState) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                PoseConfigs poseConfigsCreateFromParcel = PoseConfigs.CREATOR.createFromParcel(parcel);
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new CountdownToCapture(i, selfieErrorValueOf, j, cameraProperties, j2, f, selfieBrightnessInfo, arrayList, selfieState, poseConfigsCreateFromParcel, z2, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountdownToCapture[] newArray(int i) {
                return new CountdownToCapture[i];
            }
        }

        public final CountdownToCapture copy(int countDown, SelfieError selfieError, long startCaptureTimestamp, CameraProperties cameraProperties, long startSelfieTimestamp, float poseScore, SelfieBrightnessInfo brightnessInfo, List<? extends Selfie.Pose> posesNeeded, SelfieState backState, PoseConfigs poseConfigs, boolean autoCaptureSupported, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new CountdownToCapture(countDown, selfieError, startCaptureTimestamp, cameraProperties, startSelfieTimestamp, poseScore, brightnessInfo, posesNeeded, backState, poseConfigs, autoCaptureSupported, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return this.countDown == countdownToCapture.countDown && this.selfieError == countdownToCapture.selfieError && this.startCaptureTimestamp == countdownToCapture.startCaptureTimestamp && Intrinsics.areEqual(this.cameraProperties, countdownToCapture.cameraProperties) && this.startSelfieTimestamp == countdownToCapture.startSelfieTimestamp && Float.compare(this.poseScore, countdownToCapture.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, countdownToCapture.brightnessInfo) && Intrinsics.areEqual(this.posesNeeded, countdownToCapture.posesNeeded) && Intrinsics.areEqual(this.backState, countdownToCapture.backState) && Intrinsics.areEqual(this.poseConfigs, countdownToCapture.poseConfigs) && this.autoCaptureSupported == countdownToCapture.autoCaptureSupported && this.cameraFacingMode == countdownToCapture.cameraFacingMode && this.isFlashEnabled == countdownToCapture.isFlashEnabled;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            SelfieError selfieError = this.selfieError;
            int iHashCode2 = (((((((((iHashCode + (selfieError == null ? 0 : selfieError.hashCode())) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode3 = (((iHashCode2 + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.posesNeeded.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((iHashCode3 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "CountdownToCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", posesNeeded=" + this.posesNeeded + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.countDown);
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(selfieError.name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<Selfie.Pose> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<Selfie.Pose> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState2.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfig getCurrentPoseConfig() {
            return SelfieState2.DefaultImpls.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState2.DefaultImpls.getCurrentPoseOrNull(this);
        }

        public /* synthetic */ CountdownToCapture(int i, SelfieError selfieError, long j, CameraProperties cameraProperties, long j2, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, SelfieState selfieState, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode facingMode, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : selfieError, j, cameraProperties, j2, f, selfieBrightnessInfo, list, selfieState, poseConfigs, z, facingMode, z2);
        }

        public final int getCountDown() {
            return this.countDown;
        }

        public final SelfieError getSelfieError() {
            return this.selfieError;
        }

        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        public final float getPoseScore() {
            return this.poseScore;
        }

        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(int i, SelfieError selfieError, long j, CameraProperties cameraProperties, long j2, float f, SelfieBrightnessInfo selfieBrightnessInfo, List<? extends Selfie.Pose> posesNeeded, SelfieState selfieState, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode cameraFacingMode, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.countDown = i;
            this.selfieError = selfieError;
            this.startCaptureTimestamp = j;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = posesNeeded;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z2;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u0088\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b<\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0015\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b\u0016\u0010;R&\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\t8\u0010X\u0090\u0004¢\u0006\u0012\n\u0004\bG\u00103\u0012\u0004\bI\u0010J\u001a\u0004\bH\u00105¨\u0006K"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CaptureState;", "", "countDown", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "selfieError", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "<init>", "(ILcom/withpersona/sdk2/camera/selfie/SelfieError;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(ILcom/withpersona/sdk2/camera/selfie/SelfieError;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCountDown", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "getSelfieError", "()Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "Ljava/util/List;", "getPosesNeeded", "()Ljava/util/List;", "J", "getStartCaptureTimestamp", "()J", "Z", "getAutoCaptureSupported", "()Z", "getStartSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "getSelfies$selfie_release", "getSelfies$selfie_release$annotations", "()V", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CountdownToManualCapture extends SelfieState implements SelfieState3 {
        public static final Parcelable.Creator<CountdownToManualCapture> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final int countDown;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final List<Selfie.Pose> posesNeeded;
        private final SelfieError selfieError;
        private final List<Selfie> selfies;
        private final long startCaptureTimestamp;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CountdownToManualCapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountdownToManualCapture createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                long j;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                SelfieError selfieErrorValueOf = parcel.readInt() == 0 ? null : SelfieError.valueOf(parcel.readString());
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = false;
                    j = j2;
                    z3 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                    j = j2;
                    z3 = false;
                }
                return new CountdownToManualCapture(i, selfieErrorValueOf, cameraProperties, arrayList, j, z3, parcel.readLong(), (SelfieState) parcel.readParcelable(CountdownToManualCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? z2 : z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountdownToManualCapture[] newArray(int i) {
                return new CountdownToManualCapture[i];
            }
        }

        public static /* synthetic */ CountdownToManualCapture copy$default(CountdownToManualCapture countdownToManualCapture, int i, SelfieError selfieError, CameraProperties cameraProperties, List list, long j, boolean z, long j2, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = countdownToManualCapture.countDown;
            }
            return countdownToManualCapture.copy(i, (i2 & 2) != 0 ? countdownToManualCapture.selfieError : selfieError, (i2 & 4) != 0 ? countdownToManualCapture.cameraProperties : cameraProperties, (i2 & 8) != 0 ? countdownToManualCapture.posesNeeded : list, (i2 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : j, (i2 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : z, (i2 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : j2, (i2 & 128) != 0 ? countdownToManualCapture.backState : selfieState, (i2 & 256) != 0 ? countdownToManualCapture.poseConfigs : poseConfigs, (i2 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : facingMode, (i2 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : z2);
        }

        public final CountdownToManualCapture copy(int countDown, SelfieError selfieError, CameraProperties cameraProperties, List<? extends Selfie.Pose> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, SelfieState backState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new CountdownToManualCapture(countDown, selfieError, cameraProperties, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, backState, poseConfigs, cameraFacingMode, isFlashEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToManualCapture)) {
                return false;
            }
            CountdownToManualCapture countdownToManualCapture = (CountdownToManualCapture) other;
            return this.countDown == countdownToManualCapture.countDown && this.selfieError == countdownToManualCapture.selfieError && Intrinsics.areEqual(this.cameraProperties, countdownToManualCapture.cameraProperties) && Intrinsics.areEqual(this.posesNeeded, countdownToManualCapture.posesNeeded) && this.startCaptureTimestamp == countdownToManualCapture.startCaptureTimestamp && this.autoCaptureSupported == countdownToManualCapture.autoCaptureSupported && this.startSelfieTimestamp == countdownToManualCapture.startSelfieTimestamp && Intrinsics.areEqual(this.backState, countdownToManualCapture.backState) && Intrinsics.areEqual(this.poseConfigs, countdownToManualCapture.poseConfigs) && this.cameraFacingMode == countdownToManualCapture.cameraFacingMode && this.isFlashEnabled == countdownToManualCapture.isFlashEnabled;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.countDown) * 31;
            SelfieError selfieError = this.selfieError;
            int iHashCode2 = (((((((((((iHashCode + (selfieError == null ? 0 : selfieError.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((((((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled);
        }

        public String toString() {
            return "CountdownToManualCapture(countDown=" + this.countDown + ", selfieError=" + this.selfieError + ", cameraProperties=" + this.cameraProperties + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.countDown);
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(selfieError.name());
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<Selfie.Pose> list = this.posesNeeded;
            dest.writeInt(list.size());
            Iterator<Selfie.Pose> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState3.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfig getCurrentPoseConfig() {
            return SelfieState3.DefaultImpls.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState3.DefaultImpls.getCurrentPoseOrNull(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public boolean getManualCaptureEnabled() {
            return SelfieState3.DefaultImpls.getManualCaptureEnabled(this);
        }

        public /* synthetic */ CountdownToManualCapture(int i, SelfieError selfieError, CameraProperties cameraProperties, List list, long j, boolean z, long j2, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : selfieError, cameraProperties, list, j, (i2 & 32) != 0 ? true : z, j2, selfieState, poseConfigs, facingMode, z2);
        }

        public final int getCountDown() {
            return this.countDown;
        }

        public final SelfieError getSelfieError() {
            return this.selfieError;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToManualCapture(int i, SelfieError selfieError, CameraProperties cameraProperties, List<? extends Selfie.Pose> posesNeeded, long j, boolean z, long j2, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.countDown = i;
            this.selfieError = selfieError;
            this.cameraProperties = cameraProperties;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z2;
            this.selfies = CollectionsKt.emptyList();
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FlashState;", "", "<init>", "(Ljava/lang/String;I)V", "Disabled", "Enabled", "FlashOn", "ReadyToCapture", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FlashState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FlashState[] $VALUES;
        public static final FlashState Disabled = new FlashState("Disabled", 0);
        public static final FlashState Enabled = new FlashState("Enabled", 1);
        public static final FlashState FlashOn = new FlashState("FlashOn", 2);
        public static final FlashState ReadyToCapture = new FlashState("ReadyToCapture", 3);

        private static final /* synthetic */ FlashState[] $values() {
            return new FlashState[]{Disabled, Enabled, FlashOn, ReadyToCapture};
        }

        public static EnumEntries<FlashState> getEntries() {
            return $ENTRIES;
        }

        private FlashState(String str, int i) {
        }

        static {
            FlashState[] flashStateArr$values = $values();
            $VALUES = flashStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(flashStateArr$values);
        }

        public static FlashState valueOf(String str) {
            return (FlashState) Enum.valueOf(FlashState.class, str);
        }

        public static FlashState[] values() {
            return (FlashState[]) $VALUES.clone();
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'J®\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010'J\u001a\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u00107R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010:R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b>\u0010=R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bE\u0010AR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0019\u001a\u00020\u00188\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u001a\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\b\u001a\u0010DR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/CaptureState;", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "selfieError", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "posesNeeded", "", "startCaptureTimestamp", "", "autoCaptureSupported", "startSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "backState", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "isFlashEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FlashState;", "flashState", "<init>", "(Lcom/withpersona/sdk2/camera/selfie/SelfieError;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$FlashState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lcom/withpersona/sdk2/camera/selfie/SelfieError;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$FlashState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "getSelfieError", "()Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "F", "getPoseScore", "()F", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "Ljava/util/List;", "getSelfies$selfie_release", "()Ljava/util/List;", "getPosesNeeded", "J", "getStartCaptureTimestamp", "()J", "Z", "getAutoCaptureSupported", "()Z", "getStartSelfieTimestamp", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "getPoseConfigs", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FlashState;", "getFlashState", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FlashState;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Capture extends SelfieState implements SelfieState3 {
        public static final Parcelable.Creator<Capture> CREATOR = new Creator();
        private final boolean autoCaptureSupported;
        private final SelfieState backState;
        private final SelfieBrightnessInfo brightnessInfo;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final FlashState flashState;
        private final boolean isFlashEnabled;
        private final PoseConfigs poseConfigs;
        private final float poseScore;
        private final List<Selfie.Pose> posesNeeded;
        private final SelfieError selfieError;
        private final List<Selfie> selfies;
        private final long startCaptureTimestamp;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Capture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Capture createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                long j;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SelfieError selfieErrorValueOf = parcel.readInt() == 0 ? null : SelfieError.valueOf(parcel.readString());
                float f = parcel.readFloat();
                SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(Capture.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Capture.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Selfie.Pose.valueOf(parcel.readString()));
                }
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = false;
                    j = j2;
                    z3 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                    j = j2;
                    z3 = false;
                }
                return new Capture(selfieErrorValueOf, f, selfieBrightnessInfo, arrayList, arrayList2, j, z3, parcel.readLong(), (CameraProperties) parcel.readParcelable(Capture.class.getClassLoader()), (SelfieState) parcel.readParcelable(Capture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? z2 : z, FlashState.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Capture[] newArray(int i) {
                return new Capture[i];
            }
        }

        public final Capture copy(SelfieError selfieError, float poseScore, SelfieBrightnessInfo brightnessInfo, List<? extends Selfie> selfies, List<? extends Selfie.Pose> posesNeeded, long startCaptureTimestamp, boolean autoCaptureSupported, long startSelfieTimestamp, CameraProperties cameraProperties, SelfieState backState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean isFlashEnabled, FlashState flashState) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            return new Capture(selfieError, poseScore, brightnessInfo, selfies, posesNeeded, startCaptureTimestamp, autoCaptureSupported, startSelfieTimestamp, cameraProperties, backState, poseConfigs, cameraFacingMode, isFlashEnabled, flashState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Capture)) {
                return false;
            }
            Capture capture = (Capture) other;
            return this.selfieError == capture.selfieError && Float.compare(this.poseScore, capture.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, capture.brightnessInfo) && Intrinsics.areEqual(this.selfies, capture.selfies) && Intrinsics.areEqual(this.posesNeeded, capture.posesNeeded) && this.startCaptureTimestamp == capture.startCaptureTimestamp && this.autoCaptureSupported == capture.autoCaptureSupported && this.startSelfieTimestamp == capture.startSelfieTimestamp && Intrinsics.areEqual(this.cameraProperties, capture.cameraProperties) && Intrinsics.areEqual(this.backState, capture.backState) && Intrinsics.areEqual(this.poseConfigs, capture.poseConfigs) && this.cameraFacingMode == capture.cameraFacingMode && this.isFlashEnabled == capture.isFlashEnabled && this.flashState == capture.flashState;
        }

        public int hashCode() {
            SelfieError selfieError = this.selfieError;
            int iHashCode = (((selfieError == null ? 0 : selfieError.hashCode()) * 31) + Float.hashCode(this.poseScore)) * 31;
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int iHashCode2 = (((((((((((((iHashCode + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31) + this.selfies.hashCode()) * 31) + this.posesNeeded.hashCode()) * 31) + Long.hashCode(this.startCaptureTimestamp)) * 31) + Boolean.hashCode(this.autoCaptureSupported)) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31) + this.cameraProperties.hashCode()) * 31;
            SelfieState selfieState = this.backState;
            return ((((((((iHashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31) + this.poseConfigs.hashCode()) * 31) + this.cameraFacingMode.hashCode()) * 31) + Boolean.hashCode(this.isFlashEnabled)) * 31) + this.flashState.hashCode();
        }

        public String toString() {
            return "Capture(selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", flashState=" + this.flashState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(selfieError.name());
            }
            dest.writeFloat(this.poseScore);
            dest.writeParcelable(this.brightnessInfo, flags);
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<Selfie.Pose> list2 = this.posesNeeded;
            dest.writeInt(list2.size());
            Iterator<Selfie.Pose> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeLong(this.startCaptureTimestamp);
            dest.writeInt(this.autoCaptureSupported ? 1 : 0);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeParcelable(this.backState, flags);
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashEnabled ? 1 : 0);
            dest.writeString(this.flashState.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPose() {
            return SelfieState3.DefaultImpls.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfig getCurrentPoseConfig() {
            return SelfieState3.DefaultImpls.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public Selfie.Pose getCurrentPoseOrNull() {
            return SelfieState3.DefaultImpls.getCurrentPoseOrNull(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public boolean getManualCaptureEnabled() {
            return SelfieState3.DefaultImpls.getManualCaptureEnabled(this);
        }

        public final SelfieError getSelfieError() {
            return this.selfieError;
        }

        public final float getPoseScore() {
            return this.poseScore;
        }

        public final SelfieBrightnessInfo getBrightnessInfo() {
            return this.brightnessInfo;
        }

        public /* synthetic */ Capture(SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, long j, boolean z, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2, FlashState flashState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : selfieError, f, selfieBrightnessInfo, (i & 8) != 0 ? CollectionsKt.emptyList() : list, list2, j, (i & 64) != 0 ? true : z, j2, cameraProperties, selfieState, poseConfigs, facingMode, z2, (i & 8192) != 0 ? FlashState.Disabled : flashState);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public List<Selfie.Pose> getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState3
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        public PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState2
        /* renamed from: isFlashEnabled, reason: from getter */
        public boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final FlashState getFlashState() {
            return this.flashState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Capture(SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List<? extends Selfie> selfies, List<? extends Selfie.Pose> posesNeeded, long j, boolean z, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode cameraFacingMode, boolean z2, FlashState flashState) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(posesNeeded, "posesNeeded");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            this.selfieError = selfieError;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.selfies = selfies;
            this.posesNeeded = posesNeeded;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z;
            this.startSelfieTimestamp = j2;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashEnabled = z2;
            this.flashState = flashState;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8PX\u0090\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "nextState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "completedPose", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "", "isFlashOn", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getNextState", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "getCompletedPose", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "getBackState$selfie_release", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Z", "()Z", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "getSelfies$selfie_release", "()Ljava/util/List;", "getSelfies$selfie_release$annotations", "()V", "selfies", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class CaptureTransition extends SelfieState {
        public static final Parcelable.Creator<CaptureTransition> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final Selfie.Pose completedPose;
        private final boolean isFlashOn;
        private final SelfieState nextState;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CaptureTransition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CaptureTransition createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CaptureTransition((SelfieState) parcel.readParcelable(CaptureTransition.class.getClassLoader()), Selfie.Pose.valueOf(parcel.readString()), (SelfieState) parcel.readParcelable(CaptureTransition.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CaptureTransition[] newArray(int i) {
                return new CaptureTransition[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.nextState, flags);
            dest.writeString(this.completedPose.name());
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
            dest.writeInt(this.isFlashOn ? 1 : 0);
        }

        public final SelfieState getNextState() {
            return this.nextState;
        }

        public final Selfie.Pose getCompletedPose() {
            return this.completedPose;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* renamed from: isFlashOn, reason: from getter */
        public final boolean getIsFlashOn() {
            return this.isFlashOn;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureTransition(SelfieState nextState, Selfie.Pose completedPose, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(nextState, "nextState");
            Intrinsics.checkNotNullParameter(completedPose, "completedPose");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.nextState = nextState;
            this.completedPose = completedPose;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
            this.isFlashOn = z;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.nextState.getSelfies$selfie_release();
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010,R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b\t\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b0\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106¨\u00067"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "minDurationMs", "", "isDelayComplete", "isFinalizeComplete", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "startSelfieTimestamp", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "cameraFacingMode", "<init>", "(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSelfies$selfie_release", "()Ljava/util/List;", "J", "getMinDurationMs", "()J", "Z", "()Z", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends SelfieState {
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final boolean isDelayComplete;
        private final boolean isFinalizeComplete;
        private final long minDurationMs;
        private final List<Selfie> selfies;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeLocalVideoCapture createFromParcel(Parcel parcel) {
                boolean z;
                long j;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = true;
                    j = j2;
                    z2 = true;
                } else {
                    z = true;
                    j = j2;
                    z2 = false;
                }
                return new FinalizeLocalVideoCapture(arrayList, j, z2, parcel.readInt() != 0 ? z : false, (CameraProperties) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeLocalVideoCapture[] newArray(int i) {
                return new FinalizeLocalVideoCapture[i];
            }
        }

        public static /* synthetic */ FinalizeLocalVideoCapture copy$default(FinalizeLocalVideoCapture finalizeLocalVideoCapture, List list, long j, boolean z, boolean z2, CameraProperties cameraProperties, long j2, SelfieState selfieState, CameraProperties.FacingMode facingMode, int i, Object obj) {
            if ((i & 1) != 0) {
                list = finalizeLocalVideoCapture.selfies;
            }
            if ((i & 2) != 0) {
                j = finalizeLocalVideoCapture.minDurationMs;
            }
            if ((i & 4) != 0) {
                z = finalizeLocalVideoCapture.isDelayComplete;
            }
            if ((i & 8) != 0) {
                z2 = finalizeLocalVideoCapture.isFinalizeComplete;
            }
            if ((i & 16) != 0) {
                cameraProperties = finalizeLocalVideoCapture.cameraProperties;
            }
            if ((i & 32) != 0) {
                j2 = finalizeLocalVideoCapture.startSelfieTimestamp;
            }
            if ((i & 64) != 0) {
                selfieState = finalizeLocalVideoCapture.backState;
            }
            if ((i & 128) != 0) {
                facingMode = finalizeLocalVideoCapture.cameraFacingMode;
            }
            long j3 = j2;
            CameraProperties cameraProperties2 = cameraProperties;
            boolean z3 = z;
            return finalizeLocalVideoCapture.copy(list, j, z3, z2, cameraProperties2, j3, selfieState, facingMode);
        }

        public final FinalizeLocalVideoCapture copy(List<? extends Selfie> selfies, long minDurationMs, boolean isDelayComplete, boolean isFinalizeComplete, CameraProperties cameraProperties, long startSelfieTimestamp, SelfieState backState, CameraProperties.FacingMode cameraFacingMode) {
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            return new FinalizeLocalVideoCapture(selfies, minDurationMs, isDelayComplete, isFinalizeComplete, cameraProperties, startSelfieTimestamp, backState, cameraFacingMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return Intrinsics.areEqual(this.selfies, finalizeLocalVideoCapture.selfies) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete && this.isFinalizeComplete == finalizeLocalVideoCapture.isFinalizeComplete && Intrinsics.areEqual(this.cameraProperties, finalizeLocalVideoCapture.cameraProperties) && this.startSelfieTimestamp == finalizeLocalVideoCapture.startSelfieTimestamp && Intrinsics.areEqual(this.backState, finalizeLocalVideoCapture.backState) && this.cameraFacingMode == finalizeLocalVideoCapture.cameraFacingMode;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.selfies.hashCode() * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete)) * 31) + Boolean.hashCode(this.isFinalizeComplete)) * 31) + this.cameraProperties.hashCode()) * 31) + Long.hashCode(this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return ((iHashCode + (selfieState == null ? 0 : selfieState.hashCode())) * 31) + this.cameraFacingMode.hashCode();
        }

        public String toString() {
            return "FinalizeLocalVideoCapture(selfies=" + this.selfies + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ", isFinalizeComplete=" + this.isFinalizeComplete + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeLong(this.minDurationMs);
            dest.writeInt(this.isDelayComplete ? 1 : 0);
            dest.writeInt(this.isFinalizeComplete ? 1 : 0);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FinalizeLocalVideoCapture(List list, long j, boolean z, boolean z2, CameraProperties cameraProperties, long j2, SelfieState selfieState, CameraProperties.FacingMode facingMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            CameraProperties.FacingMode facingMode2;
            SelfieState selfieState2;
            long j3;
            CameraProperties cameraProperties2;
            boolean z3;
            z = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                facingMode2 = facingMode;
                selfieState2 = selfieState;
                j3 = j2;
                cameraProperties2 = cameraProperties;
                z3 = false;
            } else {
                facingMode2 = facingMode;
                selfieState2 = selfieState;
                j3 = j2;
                cameraProperties2 = cameraProperties;
                z3 = z2;
            }
            this(list, j, z, z3, cameraProperties2, j3, selfieState2, facingMode2);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* renamed from: isDelayComplete, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        /* renamed from: isFinalizeComplete, reason: from getter */
        public final boolean getIsFinalizeComplete() {
            return this.isFinalizeComplete;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(List<? extends Selfie> selfies, long j, boolean z, boolean z2, CameraProperties cameraProperties, long j2, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.minDurationMs = j;
            this.isDelayComplete = z;
            this.isFinalizeComplete = z2;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "", "backState", "cameraFacingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "getSelfies$selfie_release", "()Ljava/util/List;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "()J", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class FinalizeWebRtc extends SelfieState {
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final List<Selfie> selfies;
        private final long startSelfieTimestamp;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FinalizeWebRtc> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeWebRtc createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                return new FinalizeWebRtc(arrayList, (CameraProperties) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FinalizeWebRtc[] newArray(int i) {
                return new FinalizeWebRtc[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeWebRtc(List<? extends Selfie> selfies, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "webRtcObjectId", "", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "", "backState", "cameraFacingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "getSelfies$selfie_release", "()Ljava/util/List;", "getWebRtcObjectId", "()Ljava/lang/String;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "()J", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class WebRtcFinished extends SelfieState {
        public static final Parcelable.Creator<WebRtcFinished> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final List<Selfie> selfies;
        private final long startSelfieTimestamp;
        private final String webRtcObjectId;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WebRtcFinished> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcFinished createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(WebRtcFinished.class.getClassLoader()));
                }
                return new WebRtcFinished(arrayList, parcel.readString(), (CameraProperties) parcel.readParcelable(WebRtcFinished.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(WebRtcFinished.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcFinished[] newArray(int i) {
                return new WebRtcFinished[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WebRtcFinished(List<? extends Selfie> selfies, String webRtcObjectId, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(webRtcObjectId, "webRtcObjectId");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = webRtcObjectId;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000eX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfiesToReview", "webRtcObjectId", "", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "", "backState", "cameraFacingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "getSelfies$selfie_release", "()Ljava/util/List;", "getSelfiesToReview", "getWebRtcObjectId", "()Ljava/lang/String;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "()J", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ReviewCaptures extends SelfieState {
        public static final Parcelable.Creator<ReviewCaptures> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final List<Selfie> selfies;
        private final List<Selfie> selfiesToReview;
        private final long startSelfieTimestamp;
        private final String webRtcObjectId;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReviewCaptures> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewCaptures createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                }
                return new ReviewCaptures(arrayList, arrayList2, parcel.readString(), (CameraProperties) parcel.readParcelable(ReviewCaptures.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(ReviewCaptures.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewCaptures[] newArray(int i) {
                return new ReviewCaptures[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<Selfie> list2 = this.selfiesToReview;
            dest.writeInt(list2.size());
            Iterator<Selfie> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        public final List<Selfie> getSelfiesToReview() {
            return this.selfiesToReview;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewCaptures(List<? extends Selfie> selfies, List<? extends Selfie> selfiesToReview, String str, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(selfiesToReview, "selfiesToReview");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.selfiesToReview = selfiesToReview;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }
    }

    /* compiled from: SelfieState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "webRtcObjectId", "", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "", "backState", "cameraFacingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;)V", "getSelfies$selfie_release", "()Ljava/util/List;", "getWebRtcObjectId", "()Ljava/lang/String;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "getStartSelfieTimestamp", "()J", "getBackState$selfie_release", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "getCameraFacingMode$selfie_release", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Submit extends SelfieState {
        public static final Parcelable.Creator<Submit> CREATOR = new Creator();
        private final SelfieState backState;
        private final CameraProperties.FacingMode cameraFacingMode;
        private final CameraProperties cameraProperties;
        private final List<Selfie> selfies;
        private final long startSelfieTimestamp;
        private final String webRtcObjectId;

        /* compiled from: SelfieState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Submit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(arrayList, parcel.readString(), (CameraProperties) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(Submit.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Submit[] newArray(int i) {
                return new Submit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Selfie> list = this.selfies;
            dest.writeInt(list.size());
            Iterator<Selfie> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeLong(this.startSelfieTimestamp);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.cameraFacingMode.name());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public List<Selfie> getSelfies$selfie_release() {
            return this.selfies;
        }

        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getBackState$selfie_release, reason: from getter */
        public SelfieState getBackState() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        /* renamed from: getCameraFacingMode$selfie_release, reason: from getter */
        public CameraProperties.FacingMode getCameraFacingMode() {
            return this.cameraFacingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(List<? extends Selfie> selfies, String str, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode cameraFacingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(selfies, "selfies");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(cameraFacingMode, "cameraFacingMode");
            this.selfies = selfies;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = cameraFacingMode;
        }
    }
}
