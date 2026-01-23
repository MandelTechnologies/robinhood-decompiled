package com.robinhood.tooltips;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/tooltips/DefaultTooltipChannel;", "Lcom/robinhood/tooltips/TooltipChannel;", "priority", "", "<init>", "(I)V", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DefaultTooltipChannel extends TooltipChannel {
    public static final int $stable = 0;

    public DefaultTooltipChannel(int i) {
        super(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, i);
    }
}
