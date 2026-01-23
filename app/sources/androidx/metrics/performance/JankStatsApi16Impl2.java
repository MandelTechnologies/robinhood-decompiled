package androidx.metrics.performance;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.metrics.performance.JankStatsBaseImpl;
import com.robinhood.android.investFlow.InvestFlowConstants;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JankStatsApi16Impl.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Companion", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.metrics.performance.DelegatingOnPreDrawListener, reason: use source file name */
/* loaded from: classes4.dex */
public class JankStatsApi16Impl2 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Field choreographerLastFrameTimeField;

    /* compiled from: JankStatsApi16Impl.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener$Companion;", "", "()V", "choreographerLastFrameTimeField", "Ljava/lang/reflect/Field;", "getChoreographerLastFrameTimeField", "()Ljava/lang/reflect/Field;", "getExpectedFrameDuration", "", "view", "Landroid/view/View;", "metrics-performance_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: androidx.metrics.performance.DelegatingOnPreDrawListener$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Field getChoreographerLastFrameTimeField() {
            return JankStatsApi16Impl2.choreographerLastFrameTimeField;
        }

        public final long getExpectedFrameDuration(View view) {
            JankStatsBaseImpl.Companion companion = JankStatsBaseImpl.INSTANCE;
            if (companion.getFrameDuration() < 0) {
                Window window = null;
                if ((view != null ? view.getContext() : null) instanceof Activity) {
                    Context context = view.getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                    window = ((Activity) context).getWindow();
                }
                float f = 60.0f;
                float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f = refreshRate;
                }
                companion.setFrameDuration((long) ((1000 / f) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT));
            }
            return companion.getFrameDuration();
        }
    }

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        Intrinsics.checkNotNullExpressionValue(declaredField, "Choreographer::class.jav…ld(\"mLastFrameTimeNanos\")");
        choreographerLastFrameTimeField = declaredField;
        declaredField.setAccessible(true);
    }
}
