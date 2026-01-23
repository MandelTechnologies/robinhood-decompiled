package com.robinhood.scarlet.view;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: UnqualifiedClassTag.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"isUnqualifiedClassTag", "", "", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.view.UnqualifiedClassTagKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class UnqualifiedClassTag2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUnqualifiedClassTag(String str) {
        return str.length() > 0 && Character.isUpperCase(StringsKt.first(str)) && !StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null);
    }
}
