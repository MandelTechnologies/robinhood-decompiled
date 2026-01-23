package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;

/* compiled from: TestTag.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"testTag", "Landroidx/compose/ui/Modifier;", "tag", "", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.platform.TestTagKt, reason: use source file name */
/* loaded from: classes.dex */
public final class TestTag3 {
    public static final Modifier testTag(Modifier modifier, String str) {
        return modifier.then(new TestTag2(str));
    }
}
