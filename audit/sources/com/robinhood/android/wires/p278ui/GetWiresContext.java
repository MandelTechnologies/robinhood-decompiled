package com.robinhood.android.wires.p278ui;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetWiresContext.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"getWiresContext", "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "Landroidx/fragment/app/Fragment;", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.GetWiresContextKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class GetWiresContext {
    public static final WiresContext getWiresContext(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(contextRequireContext);
        Intrinsics.checkNotNull(appCompatActivityFindActivityBaseContext, "null cannot be cast to non-null type com.robinhood.android.wires.ui.WiresActivity");
        return ((WiresActivity) appCompatActivityFindActivityBaseContext).getWiresContext$feature_wires_externalDebug();
    }
}
