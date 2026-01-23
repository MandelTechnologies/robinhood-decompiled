package com.robinhood.android.lib.pathfinder.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ImageTypes.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType;", "", "<init>", "()V", "Drawable", "Lottie", "None", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType$Drawable;", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType$Lottie;", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType$None;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.extensions.ImageRenderType, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class ImageTypes {
    public static final int $stable = 0;

    public /* synthetic */ ImageTypes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ImageTypes.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType$Drawable;", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType;", "drawableRes", "", "<init>", "(I)V", "getDrawableRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.extensions.ImageRenderType$Drawable, reason: from toString */
    public static final /* data */ class Drawable extends ImageTypes {
        public static final int $stable = 0;
        private final int drawableRes;

        public static /* synthetic */ Drawable copy$default(Drawable drawable, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = drawable.drawableRes;
            }
            return drawable.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDrawableRes() {
            return this.drawableRes;
        }

        public final Drawable copy(int drawableRes) {
            return new Drawable(drawableRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Drawable) && this.drawableRes == ((Drawable) other).drawableRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.drawableRes);
        }

        public String toString() {
            return "Drawable(drawableRes=" + this.drawableRes + ")";
        }

        public Drawable(int i) {
            super(null);
            this.drawableRes = i;
        }

        public final int getDrawableRes() {
            return this.drawableRes;
        }
    }

    private ImageTypes() {
    }

    /* compiled from: ImageTypes.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType$Lottie;", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType;", "lottieJsonRes", "", "<init>", "(I)V", "getLottieJsonRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.extensions.ImageRenderType$Lottie, reason: from toString */
    public static final /* data */ class Lottie extends ImageTypes {
        public static final int $stable = 0;
        private final int lottieJsonRes;

        public static /* synthetic */ Lottie copy$default(Lottie lottie, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = lottie.lottieJsonRes;
            }
            return lottie.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLottieJsonRes() {
            return this.lottieJsonRes;
        }

        public final Lottie copy(int lottieJsonRes) {
            return new Lottie(lottieJsonRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Lottie) && this.lottieJsonRes == ((Lottie) other).lottieJsonRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.lottieJsonRes);
        }

        public String toString() {
            return "Lottie(lottieJsonRes=" + this.lottieJsonRes + ")";
        }

        public Lottie(int i) {
            super(null);
            this.lottieJsonRes = i;
        }

        public final int getLottieJsonRes() {
            return this.lottieJsonRes;
        }
    }

    /* compiled from: ImageTypes.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType$None;", "Lcom/robinhood/android/lib/pathfinder/extensions/ImageRenderType;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.extensions.ImageRenderType$None */
    public static final class None extends ImageTypes {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }
}
