package com.robinhood.android.shareholderexperience;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"bindToolbar", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "header", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata$Header;", AnalyticsStrings.BUTTON_TITLE_IPO_ACCESS_RESULTS_ALLOCATED_SHARE, "Landroidx/fragment/app/Fragment;", "shareCopy", "", "feature-shareholder-experience_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UtilKt {
    public static final void bindToolbar(BaseFragment baseFragment, QaEventMetadata.Header header) {
        Boolean foregroundIsDark;
        int systemUiVisibility;
        View loadingView;
        Toolbar toolbar;
        Drawable navigationIcon;
        Toolbar toolbar2;
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        RhToolbar rhToolbar = baseFragment.getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setTitle(header.getShortTitle());
        }
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int primaryColor = com.robinhood.android.shareholderexperience.questionlist.UtilKt.getPrimaryColor(header, contextRequireContext);
        baseFragment.requireActivity().getWindow().setStatusBarColor(primaryColor);
        RhToolbar rhToolbar2 = baseFragment.getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setBackgroundTintList(ColorStateList.valueOf(primaryColor));
        }
        QaEventMetadata.Header.Branding branding = header.getBranding();
        if (branding == null || (foregroundIsDark = branding.getForegroundIsDark()) == null) {
            return;
        }
        boolean zBooleanValue = foregroundIsDark.booleanValue();
        int i = zBooleanValue ? -16777216 : -1;
        RhToolbar rhToolbar3 = baseFragment.getRhToolbar();
        if (rhToolbar3 != null && (toolbar2 = rhToolbar3.getToolbar()) != null) {
            toolbar2.setTitleTextColor(i);
        }
        RhToolbar rhToolbar4 = baseFragment.getRhToolbar();
        if (rhToolbar4 != null && (toolbar = rhToolbar4.getToolbar()) != null && (navigationIcon = toolbar.getNavigationIcon()) != null) {
            navigationIcon.setTint(i);
        }
        RhToolbar rhToolbar5 = baseFragment.getRhToolbar();
        if (rhToolbar5 != null && (loadingView = rhToolbar5.getLoadingView()) != null) {
            ScarletManager2.overrideAttribute(loadingView, android.R.attr.indeterminateTint, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(i)));
        }
        View decorView = baseFragment.requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (zBooleanValue) {
            systemUiVisibility = decorView.getSystemUiVisibility() | 8192;
        } else {
            systemUiVisibility = decorView.getSystemUiVisibility() & (-8193);
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }

    public static final void share(Fragment fragment, String shareCopy) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(shareCopy, "shareCopy");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", shareCopy);
        intent.setType("text/plain");
        fragment.startActivity(Intent.createChooser(intent, null));
    }
}
