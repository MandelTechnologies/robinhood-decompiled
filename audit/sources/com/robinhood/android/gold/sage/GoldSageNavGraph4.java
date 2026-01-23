package com.robinhood.android.gold.sage;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.gold.sage.data.GoldSageDestinationArgs;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.rosetta.eventlogging.Context;
import gold.proto.p464v1.GoldSageTimeline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldSageNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$3, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageNavGraph4 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ Context $loggingContext;

    GoldSageNavGraph4(Context context) {
        this.$loggingContext = context;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-711164877, i, -1, "com.robinhood.android.gold.sage.goldSageNavGraph.<anonymous>.<anonymous> (GoldSageNavGraph.kt:50)");
        }
        final GoldSageDestinationArgs goldSageDestinationArgs = (GoldSageDestinationArgs) ComposableCompanion.args(entry);
        GoldSageTimeline timeline = goldSageDestinationArgs.getGoldSageFlow().getTimeline();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = ((((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256) | composer.changedInstance(goldSageDestinationArgs);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldSageNavGraph4.invoke$lambda$1$lambda$0(navigator, goldSageDestinationArgs);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GoldSageTimelineComposable3.GoldSageTimelineComposable(timeline, (Function0) objRememberedValue, null, null, this.$loggingContext, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, GoldSageDestinationArgs goldSageDestinationArgs) throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(GoldSageDestinations4.INSTANCE, goldSageDestinationArgs, null, null, 6, null), false, (Function1) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
