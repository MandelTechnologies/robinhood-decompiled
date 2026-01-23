package com.robinhood.shared.education.order;

import android.content.SharedPreferences;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityOrderSide3;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationManager.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000bJ\u001a\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0016\u001a\u00020\u0015J\u001f\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b\u0019J\u0006\u0010\u001a\u001a\u00020\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "", "<init>", "()V", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "getUserPrefs", "()Landroid/content/SharedPreferences;", "setUserPrefs", "(Landroid/content/SharedPreferences;)V", "shouldShowEducation", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "side", "Lcom/robinhood/models/db/OrderSide;", "equityOrderSide", "Lcom/robinhood/models/db/EquityOrderSide;", "isBuyToClose", "hasSeenEducation", "hideEducation", "", "hideRecurringEducation", "getPrefKey", "", "getPrefKey$lib_order_education_externalDebug", "hasSeenRecurringEducation", "Companion", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypeEducationManager {
    public static final String ORDER_TYPE_PREF_PREFIX = "order_type_education_shown_";
    public static final String RECURRING_ORDER_TYPE_PREF = "order_type_education_shown_recurring";
    private static final String RECURRING_ORDER_TYPE_PREF_SUFFIX = "recurring";

    @UserPrefs
    public SharedPreferences userPrefs;
    public static final int $stable = 8;

    public final SharedPreferences getUserPrefs() {
        SharedPreferences sharedPreferences = this.userPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SharedPreferencesModule.USER_PREFS_NAME);
        return null;
    }

    public final void setUserPrefs(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.userPrefs = sharedPreferences;
    }

    public static /* synthetic */ boolean shouldShowEducation$default(OrderTypeEducationManager orderTypeEducationManager, Order.Configuration configuration, OrderSide orderSide, EquityOrderSide equityOrderSide, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            orderSide = null;
        }
        if ((i & 4) != 0) {
            equityOrderSide = null;
        }
        return orderTypeEducationManager.shouldShowEducation(configuration, orderSide, equityOrderSide, z);
    }

    public final boolean shouldShowEducation(Order.Configuration configuration, OrderSide side, EquityOrderSide equityOrderSide, boolean isBuyToClose) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (side == null) {
            side = equityOrderSide != null ? EquityOrderSide3.toOrderSide(equityOrderSide) : null;
        }
        return (equityOrderSide == EquityOrderSide.SELL_SHORT || isBuyToClose || hasSeenEducation(configuration, side) || configuration == Order.Configuration.MARKET || configuration == Order.Configuration.SIMPLE_LIMIT) ? false : true;
    }

    public static /* synthetic */ boolean hasSeenEducation$default(OrderTypeEducationManager orderTypeEducationManager, Order.Configuration configuration, OrderSide orderSide, int i, Object obj) {
        if ((i & 2) != 0) {
            orderSide = null;
        }
        return orderTypeEducationManager.hasSeenEducation(configuration, orderSide);
    }

    public final boolean hasSeenEducation(Order.Configuration configuration, OrderSide side) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getUserPrefs().getBoolean(getPrefKey$lib_order_education_externalDebug(configuration, side), false);
    }

    public static /* synthetic */ boolean hasSeenEducation$default(OrderTypeEducationManager orderTypeEducationManager, Order.Configuration configuration, EquityOrderSide equityOrderSide, int i, Object obj) {
        if ((i & 2) != 0) {
            equityOrderSide = null;
        }
        return orderTypeEducationManager.hasSeenEducation(configuration, equityOrderSide);
    }

    public final boolean hasSeenEducation(Order.Configuration configuration, EquityOrderSide equityOrderSide) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getUserPrefs().getBoolean(getPrefKey$lib_order_education_externalDebug(configuration, equityOrderSide != null ? EquityOrderSide3.toOrderSide(equityOrderSide) : null), false);
    }

    public static /* synthetic */ void hideEducation$default(OrderTypeEducationManager orderTypeEducationManager, Order.Configuration configuration, OrderSide orderSide, int i, Object obj) {
        if ((i & 2) != 0) {
            orderSide = null;
        }
        orderTypeEducationManager.hideEducation(configuration, orderSide);
    }

    public final void hideEducation(Order.Configuration configuration, OrderSide side) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getUserPrefs().edit().putBoolean(getPrefKey$lib_order_education_externalDebug(configuration, side), true).apply();
    }

    public static /* synthetic */ void hideEducation$default(OrderTypeEducationManager orderTypeEducationManager, Order.Configuration configuration, EquityOrderSide equityOrderSide, int i, Object obj) {
        if ((i & 2) != 0) {
            equityOrderSide = null;
        }
        orderTypeEducationManager.hideEducation(configuration, equityOrderSide);
    }

    public final void hideEducation(Order.Configuration configuration, EquityOrderSide equityOrderSide) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getUserPrefs().edit().putBoolean(getPrefKey$lib_order_education_externalDebug(configuration, equityOrderSide != null ? EquityOrderSide3.toOrderSide(equityOrderSide) : null), true).apply();
    }

    public final void hideRecurringEducation() {
        getUserPrefs().edit().putBoolean(RECURRING_ORDER_TYPE_PREF, true).apply();
    }

    public final String getPrefKey$lib_order_education_externalDebug(Order.Configuration configuration, OrderSide side) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (side == null) {
            return ORDER_TYPE_PREF_PREFIX + configuration;
        }
        return ORDER_TYPE_PREF_PREFIX + configuration + "_" + side;
    }

    public final boolean hasSeenRecurringEducation() {
        return getUserPrefs().getBoolean(RECURRING_ORDER_TYPE_PREF, false);
    }
}
