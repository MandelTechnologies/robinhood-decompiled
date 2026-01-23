package com.robinhood.android.futures.analytics;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a$\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\t"}, m3636d2 = {"ladderMarketButtonDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side;", "enabled", "", "ladderSelectedRowButtonDescriptor", "orderType", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;", "lib-futures-analytics_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.analytics.LadderLoggingUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LadderLoggingUtils {
    public static final UserInteractionEventDescriptor ladderMarketButtonDescriptor(UserInteractionEventDescriptor userInteractionEventDescriptor, FuturesOrderButtonContext.Side side, boolean z) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Context context = userInteractionEventDescriptor.getContext();
        return UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, context != null ? Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesOrderButtonContext(side, FuturesOrderButtonContext.OrderType.MARKET, z, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -2049, 16383, null) : null, new Component(Component.ComponentType.BUTTON, FuturesAnalyticsStrings.LADDER_MARKET_ORDER_BUTTON_IDENTIFIER, null, 4, null), null, 39, null);
    }

    public static /* synthetic */ UserInteractionEventDescriptor ladderSelectedRowButtonDescriptor$default(UserInteractionEventDescriptor userInteractionEventDescriptor, FuturesOrderButtonContext.Side side, FuturesOrderButtonContext.OrderType orderType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return ladderSelectedRowButtonDescriptor(userInteractionEventDescriptor, side, orderType, z);
    }

    public static final UserInteractionEventDescriptor ladderSelectedRowButtonDescriptor(UserInteractionEventDescriptor userInteractionEventDescriptor, FuturesOrderButtonContext.Side side, FuturesOrderButtonContext.OrderType orderType, boolean z) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Context context = userInteractionEventDescriptor.getContext();
        return UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, context != null ? Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesOrderButtonContext(side, orderType, z, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -2049, 16383, null) : null, new Component(Component.ComponentType.BUTTON, FuturesAnalyticsStrings.LADDER_SELECT_BAR_ROW_BUTTON, null, 4, null), null, 39, null);
    }
}
