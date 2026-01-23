package coil.size;

import android.view.View;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;

/* compiled from: ViewSizeResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"ViewSizeResolver", "Lcoil/size/ViewSizeResolver;", "T", "Landroid/view/View;", "view", "subtractPadding", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroid/view/View;Z)Lcoil/size/ViewSizeResolver;", "coil-base_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* renamed from: coil.size.ViewSizeResolvers, reason: use source file name */
/* loaded from: classes16.dex */
public final class ViewSizeResolver4 {
    public static /* synthetic */ ViewSizeResolver create$default(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return create(view, z);
    }

    @JvmOverloads
    @JvmName
    public static final <T extends View> ViewSizeResolver<T> create(T t, boolean z) {
        return new RealViewSizeResolver(t, z);
    }
}
