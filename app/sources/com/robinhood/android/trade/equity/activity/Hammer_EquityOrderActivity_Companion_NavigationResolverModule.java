package com.robinhood.android.trade.equity.activity;

import com.robinhood.android.navigation.Navigation;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Hammer_EquityOrderActivity_Companion_NavigationResolverModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/Hammer_EquityOrderActivity_Companion_NavigationResolverModule;", "", "<init>", "()V", "getter", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "provide_EquityOrderActivityIntentKey_DirectIpo", "provide_EquityOrderActivityIntentKey_ModifyExisting", "provide_EquityOrderActivityIntentKey_ModifyExistingWithConfig", "provide_EquityOrderActivityIntentKey_PreIpo", "provide_EquityOrderActivityIntentKey_WithId", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Hammer_EquityOrderActivity_Companion_NavigationResolverModule {
    public static final int $stable = 0;
    public static final Hammer_EquityOrderActivity_Companion_NavigationResolverModule INSTANCE = new Hammer_EquityOrderActivity_Companion_NavigationResolverModule();
    private static final Function0<NavigationResolver> getter = NavigationResolver.INSTANCE.lazyGetter("com.robinhood.android.trade.equity.activity.EquityOrderActivity", "Companion");

    private Hammer_EquityOrderActivity_Companion_NavigationResolverModule() {
    }

    @Navigation
    public final Function0<NavigationResolver> provide_EquityOrderActivityIntentKey_DirectIpo() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_EquityOrderActivityIntentKey_ModifyExisting() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_EquityOrderActivityIntentKey_ModifyExistingWithConfig() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_EquityOrderActivityIntentKey_PreIpo() {
        return getter;
    }

    @Navigation
    public final Function0<NavigationResolver> provide_EquityOrderActivityIntentKey_WithId() {
        return getter;
    }
}
