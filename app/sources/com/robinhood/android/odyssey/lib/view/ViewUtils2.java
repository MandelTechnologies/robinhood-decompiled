package com.robinhood.android.odyssey.lib.view;

import android.view.View;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.serverdriven.api.ApiThemedColor;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"overrideColor", "", "Landroid/view/View;", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "targetAttr", "", "Lcom/robinhood/models/serverdriven/api/ApiThemedColor;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.ViewUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ViewUtils2 {
    public static final void overrideColor(View view, ThemedColor color, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        ScarletManager2.overrideAttribute(view, i, ServerToBentoColorMapper.INSTANCE.mapColor(color));
    }

    public static final void overrideColor(View view, ApiThemedColor color, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        ScarletManager2.overrideAttribute(view, i, ServerToBentoColorMapper.INSTANCE.mapColor(color.toDbModel()));
    }
}
