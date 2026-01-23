package com.withpersona.sdk2.inquiry.shared.utils;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.withpersona.sdk2.inquiry.shared.R$layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitUtils.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"installSplitApkIfNeeded", "", "context", "Landroid/content/Context;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.utils.SplitUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SplitUtils {
    public static final void installSplitApkIfNeeded(Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.getResources().getLayout(R$layout.pi2_navigation_bar);
        } catch (Resources.NotFoundException unused) {
            SplitCompat.installActivity(context);
        }
    }
}
