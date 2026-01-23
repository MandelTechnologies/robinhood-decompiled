package com.robinhood.android.support.call.extensions;

import android.annotation.SuppressLint;
import android.content.Context;
import com.robinhood.models.p355ui.BannerStyleData;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.text.Capitalization;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerStyleDatas.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getColorAttr", "", "Lcom/robinhood/models/ui/BannerStyleData;", "context", "Landroid/content/Context;", "(Lcom/robinhood/models/ui/BannerStyleData;Landroid/content/Context;)Ljava/lang/Integer;", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.extensions.BannerStyleDatasKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BannerStyleDatas {
    @SuppressLint({"DefaultLocale", "DiscouragedApi"})
    public static final Integer getColorAttr(BannerStyleData bannerStyleData, Context context) {
        Intrinsics.checkNotNullParameter(bannerStyleData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int identifier = context.getResources().getIdentifier("paletteColor" + Capitalization.capitalizeFirstChar(bannerStyleData.getBackgroundColor(), Locale.US), ResourceTypes.ATTRIBUTE, context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return Integer.valueOf(identifier);
    }
}
