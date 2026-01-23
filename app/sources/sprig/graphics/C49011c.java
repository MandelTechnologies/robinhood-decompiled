package sprig.graphics;

import android.view.View;
import com.singular.sdk.internal.Constants;
import com.userleap.internal.sessionreplay.ViewRedactor;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lsprig/e/c;", "Lcom/userleap/internal/sessionreplay/ViewRedactor;", "Landroid/view/View;", "view", "", "shouldRedact", "", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/util/List;", "classNames", "<init>", "(Ljava/util/List;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.c */
/* loaded from: classes28.dex */
public final class C49011c implements ViewRedactor {

    /* renamed from: a, reason: from kotlin metadata */
    private final List<String> classNames;

    public C49011c(List<String> classNames) {
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.classNames = classNames;
    }

    @Override // com.userleap.internal.sessionreplay.ViewRedactor
    public boolean shouldRedact(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List<String> list = this.classNames;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                String name = view.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) str, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
