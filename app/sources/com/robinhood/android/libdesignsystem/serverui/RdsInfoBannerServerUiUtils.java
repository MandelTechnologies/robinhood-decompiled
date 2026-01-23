package com.robinhood.android.libdesignsystem.serverui;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.models.serverdriven.p347db.InfoBannerStyle;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsInfoBannerServerUiUtils.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¨\u0006\r"}, m3636d2 = {"bindView", "", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "newText", "Lcom/robinhood/models/serverdriven/db/RichText;", "newIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "newCtaText", "", "newStyle", "Lcom/robinhood/models/serverdriven/db/InfoBannerStyle;", "newOnCtaClick", "Lkotlin/Function0;", "lib-sdui-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.RdsInfoBannerServerUiUtilsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RdsInfoBannerServerUiUtils {
    public static /* synthetic */ void bindView$default(RdsInfoBannerView rdsInfoBannerView, RichText richText, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, InfoBannerStyle infoBannerStyle, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            richText = null;
        }
        if ((i & 2) != 0) {
            serverToBentoAssetMapper2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            infoBannerStyle = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        bindView(rdsInfoBannerView, richText, serverToBentoAssetMapper2, str, infoBannerStyle, function0);
    }

    public static final void bindView(RdsInfoBannerView rdsInfoBannerView, RichText richText, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, InfoBannerStyle infoBannerStyle, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(rdsInfoBannerView, "<this>");
        if (serverToBentoAssetMapper2 != null) {
            rdsInfoBannerView.setIcon(ContextCompat.getDrawable(rdsInfoBannerView.getContext(), serverToBentoAssetMapper2.getResourceId()));
        }
        if (richText != null) {
            Context context = rdsInfoBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsInfoBannerView.setText(RichTexts.toSpannableString$default(richText, context, null, false, null, 14, null));
        }
        if (str != null) {
            rdsInfoBannerView.setCtaText(str);
        }
        OnClickListeners.onClick(rdsInfoBannerView, function0);
        if (infoBannerStyle != null) {
            ServerToBentoColorMapper serverToBentoColorMapper = ServerToBentoColorMapper.INSTANCE;
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = serverToBentoColorMapper.mapDayNightSelectorServerColor(infoBannerStyle.getTextColor().getLight(), infoBannerStyle.getTextColor().getDark());
            if (resourceReferences4MapDayNightSelectorServerColor == null) {
                resourceReferences4MapDayNightSelectorServerColor = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, C13997R.attr.colorForegroundInfoBanner);
            }
            rdsInfoBannerView.setTextColor(resourceReferences4MapDayNightSelectorServerColor);
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor2 = serverToBentoColorMapper.mapDayNightSelectorServerColor(infoBannerStyle.getBackgroundColor().getLight(), infoBannerStyle.getBackgroundColor().getDark());
            if (resourceReferences4MapDayNightSelectorServerColor2 == null) {
                resourceReferences4MapDayNightSelectorServerColor2 = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, C13997R.attr.colorBackgroundInfoBanner);
            }
            ScarletManager2.overrideAttribute(rdsInfoBannerView, android.R.attr.backgroundTint, resourceReferences4MapDayNightSelectorServerColor2);
        }
    }
}
