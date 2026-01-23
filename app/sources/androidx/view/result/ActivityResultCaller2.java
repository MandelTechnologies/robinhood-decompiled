package androidx.view.result;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityResultCaller.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lkotlin/Unit;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "activity_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1, reason: use source file name */
/* loaded from: classes4.dex */
public final class ActivityResultCaller2 extends ActivityResultContract<Unit, Object> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Unit input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        throw null;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public Object parseResult(int resultCode, Intent intent) {
        throw null;
    }
}
