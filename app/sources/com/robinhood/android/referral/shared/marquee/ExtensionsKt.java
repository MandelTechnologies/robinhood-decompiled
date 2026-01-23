package com.robinhood.android.referral.shared.marquee;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"autoScroll", "", "Landroidx/recyclerview/widget/RecyclerView;", "handler", "Landroid/os/Handler;", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ExtensionsKt {
    public static final void autoScroll(final RecyclerView recyclerView, final Handler handler) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new Runnable() { // from class: com.robinhood.android.referral.shared.marquee.ExtensionsKt$autoScroll$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                recyclerView.scrollBy(1, 0);
                handler.postDelayed(this, 0L);
            }
        }, 0L);
    }
}
