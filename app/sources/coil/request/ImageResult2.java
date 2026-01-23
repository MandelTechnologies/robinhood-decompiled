package coil.request;

import android.graphics.drawable.Drawable;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageResult.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcoil/request/ErrorResult;", "Lcoil/request/ImageResult;", "Landroid/graphics/drawable/Drawable;", ResourceTypes.DRAWABLE, "Lcoil/request/ImageRequest;", "request", "", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: coil.request.ErrorResult, reason: use source file name */
/* loaded from: classes16.dex */
public final class ImageResult2 extends ImageResult {
    private final Drawable drawable;
    private final ImageRequest request;
    private final Throwable throwable;

    @Override // coil.request.ImageResult
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil.request.ImageResult
    public ImageRequest getRequest() {
        return this.request;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public ImageResult2(Drawable drawable, ImageRequest imageRequest, Throwable th) {
        super(null);
        this.drawable = drawable;
        this.request = imageRequest;
        this.throwable = th;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageResult2)) {
            return false;
        }
        ImageResult2 imageResult2 = (ImageResult2) other;
        return Intrinsics.areEqual(getDrawable(), imageResult2.getDrawable()) && Intrinsics.areEqual(getRequest(), imageResult2.getRequest()) && Intrinsics.areEqual(this.throwable, imageResult2.throwable);
    }

    public int hashCode() {
        Drawable drawable = getDrawable();
        return ((((drawable != null ? drawable.hashCode() : 0) * 31) + getRequest().hashCode()) * 31) + this.throwable.hashCode();
    }
}
