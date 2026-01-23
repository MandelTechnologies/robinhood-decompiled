package coil.size;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: SizeResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"SizeResolver", "Lcoil/size/SizeResolver;", "size", "Lcoil/size/Size;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "coil-base_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* renamed from: coil.size.SizeResolvers, reason: use source file name */
/* loaded from: classes.dex */
public final class SizeResolver2 {
    @JvmName
    public static final SizeResolver create(Size size) {
        return new RealSizeResolver(size);
    }
}
