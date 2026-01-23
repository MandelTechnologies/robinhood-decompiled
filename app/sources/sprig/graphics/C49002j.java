package sprig.graphics;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lsprig/c/j;", "Lsprig/c/i;", "", "packageName", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Landroid/content/Context;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.c.j */
/* loaded from: classes28.dex */
public final class C49002j implements InterfaceC49001i {

    /* renamed from: a, reason: from kotlin metadata */
    private final Context context;

    public C49002j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // sprig.graphics.InterfaceC49001i
    /* renamed from: a */
    public String mo4140a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = this.context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        Intrinsics.checkNotNullExpressionValue(str, "context.packageManager.g…ckageName, 0).versionName");
        return str;
    }
}
