package com.robinhood.android.options.extensions;

import android.content.res.Resources;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiAggregateOptionPositionFulls.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getExpirationDateString", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "resources", "Landroid/content/res/Resources;", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.extensions.UiAggregateOptionPositionFullsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiAggregateOptionPositionFulls {
    public static final String getExpirationDateString(UiAggregateOptionPositionFull uiAggregateOptionPositionFull, Resources resources) {
        Intrinsics.checkNotNullParameter(uiAggregateOptionPositionFull, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionInstrumentDetails2.getExpirationStringWithoutExp(resources, uiAggregateOptionPositionFull.getExpirationDateRange(), uiAggregateOptionPositionFull.getOptionChain().getSettleOnOpen());
    }
}
