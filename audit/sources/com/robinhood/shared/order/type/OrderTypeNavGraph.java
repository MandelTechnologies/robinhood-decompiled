package com.robinhood.shared.order.type;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: OrderTypeNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.ComposableSingletons$OrderTypeNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeNavGraph {
    public static final OrderTypeNavGraph INSTANCE = new OrderTypeNavGraph();

    /* renamed from: lambda$-1410630193, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9464lambda$1410630193 = ComposableLambda3.composableLambdaInstance(-1410630193, false, OrderTypeNavGraph2.INSTANCE);

    /* renamed from: getLambda$-1410630193$lib_order_type_externalDebug, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m25565getLambda$1410630193$lib_order_type_externalDebug() {
        return f9464lambda$1410630193;
    }
}
