package com.robinhood.android.support.conciergeplus;

import android.net.Uri;
import com.robinhood.android.support.conciergeplus.ConciergePlusPages;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergePlusTargets.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"rhWebKeyFor", "Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "page", "Lcom/robinhood/android/support/conciergeplus/ConciergePlusPages$Page;", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.conciergeplus.ConciergePlusTargetsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergePlusTargets5 {
    public static final RhWebIntentKey rhWebKeyFor(ConciergePlusPages.Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Uri uriBuild = new Uri.Builder().scheme("robinhood").authority("rh_web").appendQueryParameter("page", page.getSlug()).build();
        Intrinsics.checkNotNull(uriBuild);
        return new RhWebIntentKey(false, false, true, uriBuild, false, false, false, false, true, 64, null);
    }
}
