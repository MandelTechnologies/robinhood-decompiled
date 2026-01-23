package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.layout.util.DensityCompatHelper;
import androidx.window.layout.util.WindowMetricsCompatHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowMetricsCalculatorCompat.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroidx/window/layout/util/DensityCompatHelper;", "densityCompatHelper", "<init>", "(Landroidx/window/layout/util/DensityCompatHelper;)V", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "(Landroid/content/Context;)Landroidx/window/layout/WindowMetrics;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Landroidx/window/layout/WindowMetrics;", "Landroidx/window/layout/util/DensityCompatHelper;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "insetsTypeMasks", "Ljava/util/ArrayList;", "getInsetsTypeMasks$window_release", "()Ljava/util/ArrayList;", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    private final DensityCompatHelper densityCompatHelper;
    private final ArrayList<Integer> insetsTypeMasks;

    public WindowMetricsCalculatorCompat(DensityCompatHelper densityCompatHelper) {
        Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
        this.densityCompatHelper = densityCompatHelper;
        this.insetsTypeMasks = CollectionsKt.arrayListOf(Integer.valueOf(WindowInsetsCompat.Type.statusBars()), Integer.valueOf(WindowInsetsCompat.Type.navigationBars()), Integer.valueOf(WindowInsetsCompat.Type.captionBar()), Integer.valueOf(WindowInsetsCompat.Type.ime()), Integer.valueOf(WindowInsetsCompat.Type.systemGestures()), Integer.valueOf(WindowInsetsCompat.Type.mandatorySystemGestures()), Integer.valueOf(WindowInsetsCompat.Type.tappableElement()), Integer.valueOf(WindowInsetsCompat.Type.displayCutout()));
    }

    public /* synthetic */ WindowMetricsCalculatorCompat(DensityCompatHelper densityCompatHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DensityCompatHelper.INSTANCE.getInstance() : densityCompatHelper);
    }

    public WindowMetrics computeCurrentWindowMetrics(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return WindowMetricsCompatHelper.INSTANCE.getInstance().currentWindowMetrics(context, this.densityCompatHelper);
    }

    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return WindowMetricsCompatHelper.INSTANCE.getInstance().currentWindowMetrics(activity, this.densityCompatHelper);
    }
}
