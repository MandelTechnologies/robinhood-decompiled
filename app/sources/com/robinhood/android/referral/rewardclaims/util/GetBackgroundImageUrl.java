package com.robinhood.android.referral.rewardclaims.util;

import android.util.DisplayMetrics;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: GetBackgroundImageUrl.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"getBackgroundImageUrl", "Lokhttp3/HttpUrl;", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo$StyleInfo;", "displayMetrics", "Landroid/util/DisplayMetrics;", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardclaims.util.GetBackgroundImageUrlKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GetBackgroundImageUrl {
    public static final HttpUrl getBackgroundImageUrl(UiRewardCertificateInfo.StyleInfo styleInfo, DisplayMetrics displayMetrics) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(styleInfo, "<this>");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        int i = displayMetrics.densityDpi;
        if (i < 160) {
            str = "@1x";
        } else if (i < 240) {
            str = "@1.5x";
        } else if (i < 320) {
            str = "@2x";
        } else {
            str = "@3x";
        }
        Map<String, String> backgroundImage = styleInfo.getBackgroundImage();
        if (backgroundImage == null || (str2 = backgroundImage.get(str)) == null) {
            return null;
        }
        return HttpUrl.INSTANCE.get(str2);
    }
}
