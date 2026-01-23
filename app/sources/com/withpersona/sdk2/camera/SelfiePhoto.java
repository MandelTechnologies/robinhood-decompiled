package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfiePhoto.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"com/withpersona/sdk2/camera/SelfiePhoto$Pose", "", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Center", "Left", "Right", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose$Center;", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose$Left;", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose$Right;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.SelfiePhoto$Pose, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class SelfiePhoto {
    private final Bitmap bitmap;

    public /* synthetic */ SelfiePhoto(Bitmap bitmap, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap);
    }

    /* compiled from: SelfiePhoto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose$Center;", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.SelfiePhoto$Pose$Center */
    public static final class Center extends SelfiePhoto {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Center(Bitmap bitmap) {
            super(bitmap, null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }
    }

    private SelfiePhoto(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* compiled from: SelfiePhoto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose$Left;", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.SelfiePhoto$Pose$Left */
    public static final class Left extends SelfiePhoto {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Left(Bitmap bitmap) {
            super(bitmap, null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }
    }

    /* compiled from: SelfiePhoto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose$Right;", "Lcom/withpersona/sdk2/camera/SelfiePhoto$Pose;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.SelfiePhoto$Pose$Right */
    public static final class Right extends SelfiePhoto {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Right(Bitmap bitmap) {
            super(bitmap, null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }
    }
}
