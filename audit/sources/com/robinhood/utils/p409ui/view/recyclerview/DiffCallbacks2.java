package com.robinhood.utils.p409ui.view.recyclerview;

import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiffCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"toAsyncDifferConfig", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "T", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.view.recyclerview.DiffCallbacksKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class DiffCallbacks2 {
    public static final <T> AsyncDifferConfig<? super T> toAsyncDifferConfig(DiffUtil.ItemCallback<? super T> itemCallback) {
        Intrinsics.checkNotNullParameter(itemCallback, "<this>");
        AsyncDifferConfig<? super T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(itemCallback).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        return asyncDifferConfigBuild;
    }
}
