package com.robinhood.android.shareholderexperience.questionlist;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.models.serverdriven.experimental.api.ButtonType;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001aJ\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f\"\u0004\b\u0001\u0010\r*\u0002H\u000b2\b\u0010\u000e\u001a\u0004\u0018\u0001H\r2\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0000¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"getPrimaryColor", "", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata$Header;", "context", "Landroid/content/Context;", "getButtonStyleAttr", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonType;", "isLive", "", "bindOrHide", "", "V", "Landroid/view/View;", "T", "state", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "feature-shareholder-experience_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class UtilKt {
    public static final int getPrimaryColor(QaEventMetadata.Header header, Context context) {
        String primaryColor;
        Intrinsics.checkNotNullParameter(header, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        QaEventMetadata.Header.Branding branding = header.getBranding();
        return (branding == null || (primaryColor = branding.getPrimaryColor()) == null) ? ThemeColors.getThemeColor(context, C20690R.attr.colorBackground3) : Color.parseColor(primaryColor);
    }

    public static final int getButtonStyleAttr(ButtonType buttonType, boolean z) {
        Intrinsics.checkNotNullParameter(buttonType, "<this>");
        if (z) {
            return C28477R.attr.liveQuestionListCtaButtonStyle;
        }
        return buttonType == ButtonType.SECONDARY ? C28477R.attr.secondaryQuestionListCtaButtonStyle : C28477R.attr.primaryQuestionListCtaButtonStyle;
    }

    public static final <V extends View, T> void bindOrHide(V v, T t, Function2<? super V, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(v, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        v.setVisibility(t != null ? 0 : 8);
        if (t != null) {
            block.invoke(v, t);
        }
    }
}
