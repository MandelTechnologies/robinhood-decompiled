package com.withpersona.sdk2.inquiry.selfie;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.SelfiePhoto;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SelfieAnalyzeWorker.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000f\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;", "pose", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "captureOnPoseDetected", "", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "<init>", "(Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;ZLcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;)V", "numRetries", "", "doesSameWorkAs", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "calculatePoseScore", "", "Lcom/withpersona/sdk2/camera/selfie/SelfieFrameInfo;", "Output", "Factory", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SelfieAnalyzeWorker implements Worker<Output> {
    private final boolean captureOnPoseDetected;
    private int numRetries;
    private final Selfie.Pose pose;
    private final SdkFilesManager sdkFilesManager;
    private final SelfieDirectionFeed selfieDirectionFeed;

    /* compiled from: SelfieAnalyzeWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker;", "pose", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "captureOnPoseDetected", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        SelfieAnalyzeWorker create(Selfie.Pose pose, boolean captureOnPoseDetected);
    }

    /* compiled from: SelfieAnalyzeWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[Selfie.Pose.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Selfie.Pose.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Selfie.Pose.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelfieAnalyzeWorker(SelfieDirectionFeed selfieDirectionFeed, Selfie.Pose pose, boolean z, SdkFilesManager sdkFilesManager) {
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(pose, "pose");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.pose = pose;
        this.captureOnPoseDetected = z;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (!(otherWorker instanceof SelfieAnalyzeWorker)) {
            return false;
        }
        SelfieAnalyzeWorker selfieAnalyzeWorker = (SelfieAnalyzeWorker) otherWorker;
        return selfieAnalyzeWorker.pose == this.pose && selfieAnalyzeWorker.captureOnPoseDetected == this.captureOnPoseDetected;
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        final Flow flowDrop = FlowKt.drop(this.selfieDirectionFeed, 1);
        return FlowKt.flowOn(new Flow<Output>() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2 */
            public static final class C437242<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SelfieAnalyzeWorker this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", m3645f = "SelfieAnalyzeWorker.kt", m3646l = {89, 100}, m3647m = "emit")
                /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C437242.this.emit(null, this);
                    }
                }

                public C437242(FlowCollector flowCollector, SelfieAnalyzeWorker selfieAnalyzeWorker) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = selfieAnalyzeWorker;
                }

                /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
                
                    if (r10.emit(r5, r0) == r1) goto L46;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r10v4 */
                /* JADX WARN: Type inference failed for: r10v5 */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r10v7 */
                /* JADX WARN: Type inference failed for: r10v8 */
                /* JADX WARN: Type inference failed for: r10v9 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object selfieDetectionError;
                    Object selfieDetectionError2;
                    FlowCollector flowCollector;
                    ?? r10;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector2 = this.$this_unsafeFlow;
                        SelfieFrameInfo selfieFrameInfo = (SelfieFrameInfo) obj;
                        SelfiePhoto selfiePhoto = selfieFrameInfo.getSelfiePhoto();
                        if (selfiePhoto != null) {
                            if (Selfie2.m3251to(selfiePhoto) == this.this$0.pose) {
                                if (this.this$0.captureOnPoseDetected) {
                                    Object objSaveSelfie = Selfie2.saveSelfie(selfiePhoto, this.this$0.sdkFilesManager);
                                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objSaveSelfie);
                                    if (thM28553exceptionOrNullimpl == null) {
                                        selfieDetectionError2 = new SelfieAnalyzeWorker.Output.Detected((Selfie) objSaveSelfie, 1.0f, selfieFrameInfo.getBrightnessInfo());
                                        r10 = flowCollector2;
                                    } else {
                                        selfieDetectionError2 = new SelfieAnalyzeWorker.Output.RuntimeError(thM28553exceptionOrNullimpl);
                                        r10 = flowCollector2;
                                    }
                                } else {
                                    selfieDetectionError2 = new SelfieAnalyzeWorker.Output.Detected(null, 1.0f, selfieFrameInfo.getBrightnessInfo());
                                    r10 = flowCollector2;
                                }
                            } else {
                                SelfieError selfieError = SelfieError.IncorrectPose;
                                SelfieAnalyzeWorker selfieAnalyzeWorker = this.this$0;
                                selfieDetectionError2 = new SelfieAnalyzeWorker.Output.SelfieDetectionError(selfieError, selfieAnalyzeWorker.calculatePoseScore(selfieFrameInfo, selfieAnalyzeWorker.pose), selfieFrameInfo.getBrightnessInfo());
                                r10 = flowCollector2;
                            }
                        } else {
                            SelfieError error = selfieFrameInfo.getError();
                            SelfieError selfieError2 = SelfieError.FaceDetectionUnsupported;
                            if (error == selfieError2) {
                                this.this$0.numRetries++;
                                if (this.this$0.numRetries >= 6) {
                                    selfieDetectionError = new SelfieAnalyzeWorker.Output.SelfieDetectionError(selfieError2, 0.0f, selfieFrameInfo.getBrightnessInfo());
                                } else {
                                    anonymousClass1.L$0 = flowCollector2;
                                    anonymousClass1.label = 1;
                                    if (DelayKt.delay(500L, anonymousClass1) != coroutine_suspended) {
                                        flowCollector = flowCollector2;
                                    }
                                    return coroutine_suspended;
                                }
                            } else {
                                SelfieError error2 = selfieFrameInfo.getError();
                                if (error2 == null) {
                                    error2 = SelfieError.Other;
                                }
                                SelfieAnalyzeWorker selfieAnalyzeWorker2 = this.this$0;
                                selfieDetectionError = new SelfieAnalyzeWorker.Output.SelfieDetectionError(error2, selfieAnalyzeWorker2.calculatePoseScore(selfieFrameInfo, selfieAnalyzeWorker2.pose), selfieFrameInfo.getBrightnessInfo());
                            }
                            selfieDetectionError2 = selfieDetectionError;
                            r10 = flowCollector2;
                        }
                        if (selfieDetectionError2 != null) {
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector = (FlowCollector) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    r10 = flowCollector;
                    selfieDetectionError2 = null;
                    if (selfieDetectionError2 != null) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SelfieAnalyzeWorker.Output> flowCollector, Continuation continuation) {
                Object objCollect = flowDrop.collect(new C437242(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculatePoseScore(SelfieFrameInfo selfieFrameInfo, Selfie.Pose pose) {
        if (selfieFrameInfo.getFacesInFrame() != 1) {
            return 0.0f;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
        if (i == 1) {
            boolean z = (selfieFrameInfo.getIsFaceTooClose() || selfieFrameInfo.getIsFaceTooFar()) ? false : true;
            boolean isFaceCentered = selfieFrameInfo.getIsFaceCentered();
            float fCoerceIn = RangesKt.coerceIn((Math.abs(selfieFrameInfo.getFaceAngle()) - 10.0f) / 90.0f, 0.0f, 1.0f);
            float f = z ? 0.33f : 0.0f;
            if (isFaceCentered) {
                f += 0.17f;
            }
            return fCoerceIn > 0.0f ? f + (fCoerceIn * 0.5f) : f;
        }
        if (i == 2) {
            if (selfieFrameInfo.getIsFaceTooClose() || selfieFrameInfo.getIsFaceTooFar() || !selfieFrameInfo.getIsFaceCentered()) {
                return 0.0f;
            }
            return 1.0f - Math.min(Math.abs((15.0f - selfieFrameInfo.getFaceAngle()) / 15.0f), 1.0f);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (selfieFrameInfo.getIsFaceTooClose() || selfieFrameInfo.getIsFaceTooFar() || !selfieFrameInfo.getIsFaceCentered()) {
            return 0.0f;
        }
        return 1.0f - Math.min(Math.abs(((-15.0f) - selfieFrameInfo.getFaceAngle()) / (-15.0f)), 1.0f);
    }

    /* compiled from: SelfieAnalyzeWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output;", "", "<init>", "()V", "Detected", "SelfieDetectionError", "RuntimeError", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output$Detected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output$RuntimeError;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output$SelfieDetectionError;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Output() {
        }

        /* compiled from: SelfieAnalyzeWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output$Detected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output;", "selfie", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "poseScore", "", "brightnessInfo", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V", "getSelfie", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "getPoseScore", "()F", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Detected extends Output {
            private final SelfieBrightnessInfo brightnessInfo;
            private final float poseScore;
            private final Selfie selfie;

            public final Selfie getSelfie() {
                return this.selfie;
            }

            public final float getPoseScore() {
                return this.poseScore;
            }

            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            public Detected(Selfie selfie, float f, SelfieBrightnessInfo selfieBrightnessInfo) {
                super(null);
                this.selfie = selfie;
                this.poseScore = f;
                this.brightnessInfo = selfieBrightnessInfo;
            }
        }

        /* compiled from: SelfieAnalyzeWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output$SelfieDetectionError;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output;", "error", "Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "poseScore", "", "brightnessInfo", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "<init>", "(Lcom/withpersona/sdk2/camera/selfie/SelfieError;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V", "getError", "()Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "getPoseScore", "()F", "getBrightnessInfo", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class SelfieDetectionError extends Output {
            private final SelfieBrightnessInfo brightnessInfo;
            private final SelfieError error;
            private final float poseScore;

            public final SelfieError getError() {
                return this.error;
            }

            public final float getPoseScore() {
                return this.poseScore;
            }

            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelfieDetectionError(SelfieError error, float f, SelfieBrightnessInfo selfieBrightnessInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.poseScore = f;
                this.brightnessInfo = selfieBrightnessInfo;
            }
        }

        /* compiled from: SelfieAnalyzeWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output$RuntimeError;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieAnalyzeWorker$Output;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class RuntimeError extends Output {
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RuntimeError(Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }
}
