package androidx.view.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.CompositionLocal2;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LocalActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalActivity", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/app/Activity;", "getLocalActivity", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "activity-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.activity.compose.LocalActivityKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class LocalActivity {
    private static final CompositionLocal6<Activity> LocalActivity = CompositionLocal3.compositionLocalWithComputedDefaultOf(new Function1<CompositionLocal2, Activity>() { // from class: androidx.activity.compose.LocalActivityKt$LocalActivity$1
        @Override // kotlin.jvm.functions.Function1
        public final Activity invoke(CompositionLocal2 compositionLocal2) {
            Context baseContext = (Context) compositionLocal2.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            return (Activity) baseContext;
        }
    });

    public static final CompositionLocal6<Activity> getLocalActivity() {
        return LocalActivity;
    }
}
