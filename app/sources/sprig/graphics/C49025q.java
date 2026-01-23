package sprig.graphics;

import android.view.View;
import com.singular.sdk.internal.Constants;
import com.userleap.internal.sessionreplay.ViewRedactor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lsprig/e/q;", "Lcom/userleap/internal/sessionreplay/ViewRedactor;", "Landroid/view/View;", "view", "", "shouldRedact", "", "Ljava/lang/Class;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/util/List;", "viewTypes", "<init>", "(Ljava/util/List;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.q */
/* loaded from: classes28.dex */
public final class C49025q implements ViewRedactor {

    /* renamed from: a, reason: from kotlin metadata */
    private final List<Class<? extends View>> viewTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public C49025q(List<? extends Class<? extends View>> viewTypes) {
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        this.viewTypes = viewTypes;
    }

    @Override // com.userleap.internal.sessionreplay.ViewRedactor
    public boolean shouldRedact(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List<Class<? extends View>> list = this.viewTypes;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(view)) {
                return true;
            }
        }
        return false;
    }
}
