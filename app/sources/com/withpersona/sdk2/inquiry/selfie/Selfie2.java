package com.withpersona.sdk2.inquiry.selfie;

import android.graphics.Bitmap;
import com.withpersona.sdk2.camera.SelfiePhoto;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: Selfie.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\u0010\n\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u000b¨\u0006\f"}, m3636d2 = {"to", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "getPathName", "", "saveSelfie", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "(Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "selfie_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class Selfie2 {

    /* compiled from: Selfie.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
            try {
                iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: to */
    public static final Selfie.Pose m3251to(SelfiePhoto selfiePhoto) {
        Intrinsics.checkNotNullParameter(selfiePhoto, "<this>");
        if (selfiePhoto instanceof SelfiePhoto.Center) {
            return Selfie.Pose.Center;
        }
        if (selfiePhoto instanceof SelfiePhoto.Left) {
            return Selfie.Pose.Left;
        }
        if (selfiePhoto instanceof SelfiePhoto.Right) {
            return Selfie.Pose.Right;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getPathName(Selfie.Pose pose) {
        Intrinsics.checkNotNullParameter(pose, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
        if (i == 1) {
            return "center";
        }
        if (i == 2) {
            return "left";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "right";
    }

    public static final Object saveSelfie(SelfiePhoto selfiePhoto, SdkFilesManager sdkFilesManager) {
        Intrinsics.checkNotNullParameter(selfiePhoto, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File fileNewRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
            Bitmap bitmap = selfiePhoto.getBitmap();
            FileOutputStream fileOutputStream = new FileOutputStream(fileNewRandomSessionFile);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                Closeable.closeFinally(fileOutputStream, null);
                Result.Companion companion = Result.INSTANCE;
                String absolutePath = fileNewRandomSessionFile.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                return Result.m28550constructorimpl(new Selfie.SelfieImage(absolutePath, Selfie.CaptureMethod.AUTO, m3251to(selfiePhoto), jCurrentTimeMillis));
            } finally {
            }
        } catch (IOException e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(e));
        }
    }

    /* renamed from: to */
    public static final Selfie.Pose m3252to(NextStep.Selfie.SelfiePose selfiePose) {
        Intrinsics.checkNotNullParameter(selfiePose, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[selfiePose.ordinal()];
        if (i == 1) {
            return Selfie.Pose.Center;
        }
        if (i == 2) {
            return Selfie.Pose.Left;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Selfie.Pose.Right;
    }
}
