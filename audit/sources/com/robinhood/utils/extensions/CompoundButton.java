package com.robinhood.utils.extensions;

import android.content.res.ColorStateList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompoundButton.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"setButtonTint", "", "Landroid/widget/CompoundButton;", ResourceTypes.COLOR, "", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.CompoundButtonKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CompoundButton {
    public static final void setButtonTint(android.widget.CompoundButton compoundButton, int i) {
        Intrinsics.checkNotNullParameter(compoundButton, "<this>");
        compoundButton.setButtonTintList(ColorStateList.valueOf(i));
    }
}
