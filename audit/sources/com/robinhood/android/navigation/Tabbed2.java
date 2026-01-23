package com.robinhood.android.navigation;

import android.content.Context;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tabbed.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"isShownInTab", "", "Landroid/content/Context;", "lib-navigation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.TabbedKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Tabbed2 {
    public static final boolean isShownInTab(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return BaseContexts.findActivityBaseContext(context) instanceof Tabbed;
    }
}
