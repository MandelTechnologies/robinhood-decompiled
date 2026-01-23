package sprig.graphics;

import android.view.View;
import android.widget.EditText;
import com.userleap.internal.sessionreplay.ViewRedactor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lsprig/e/m;", "Lcom/userleap/internal/sessionreplay/ViewRedactor;", "Landroid/view/View;", "view", "", "shouldRedact", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.e.m */
/* loaded from: classes28.dex */
public final class C49021m implements ViewRedactor {
    @Override // com.userleap.internal.sessionreplay.ViewRedactor
    public boolean shouldRedact(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (view instanceof EditText) && ((EditText) view).getInputType() == 129;
    }
}
