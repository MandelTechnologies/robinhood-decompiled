package androidx.compose.foundation.relocation;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;

/* compiled from: BringIntoViewRequester.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"BringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "Landroidx/compose/ui/Modifier;", "foundation_release"}, m3637k = 5, m3638mv = {1, 9, 0}, m3640xi = 48, m3641xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt__BringIntoViewRequesterKt, reason: use source file name */
/* loaded from: classes4.dex */
final /* synthetic */ class BringIntoViewRequester5 {
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequester3();
    }

    public static final Modifier bringIntoViewRequester(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return modifier.then(new BringIntoViewRequester2(bringIntoViewRequester));
    }
}
