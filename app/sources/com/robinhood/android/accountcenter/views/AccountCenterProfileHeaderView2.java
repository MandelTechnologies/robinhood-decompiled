package com.robinhood.android.accountcenter.views;

import android.R;
import android.content.Context;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterProfileHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$bindUsername$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountCenterProfileHeaderView2 implements Function1<DayNightOverlay, Unit> {
    final /* synthetic */ AccountCenterProfileHeaderView this$0;

    AccountCenterProfileHeaderView2(AccountCenterProfileHeaderView accountCenterProfileHeaderView) {
        this.this$0 = accountCenterProfileHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
        invoke2(dayNightOverlay);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhTextView userNameText = this.this$0.getBinding().userNameText;
        Intrinsics.checkNotNullExpressionValue(userNameText, "userNameText");
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ScarletManager2.overrideAttribute(userNameText, R.attr.textColor, new ResourceValue(color, Integer.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1))));
    }
}
