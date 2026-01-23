package com.robinhood.android.gold.sage;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.gold.sage.data.GoldSageDestinationArgs;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.rosetta.eventlogging.Context;
import gold.proto.p464v1.GoldSageSplash;
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
/* renamed from: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageNavGraph3 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ Context $loggingContext;

    GoldSageNavGraph3(Context context) {
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
            ComposerKt.traceEventStart(-1359392334, i, -1, "com.robinhood.android.gold.sage.goldSageNavGraph.<anonymous>.<anonymous> (GoldSageNavGraph.kt:40)");
        }
        final GoldSageDestinationArgs goldSageDestinationArgs = (GoldSageDestinationArgs) ComposableCompanion.args(entry);
        final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
        GoldSageSplash splash = goldSageDestinationArgs.getGoldSageFlow().getSplash();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = ((((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256) | composer.changedInstance(goldSageDestinationArgs);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldSageNavGraph3.invoke$lambda$1$lambda$0(navigator, goldSageDestinationArgs);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(uriHandler);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldSageNavGraph3.invoke$lambda$3$lambda$2(uriHandler, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GoldSageSplashComposable3.GoldSageSplashComposable(splash, function0, (Function1) objRememberedValue2, null, false, null, this.$loggingContext, composer, 0, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, GoldSageDestinationArgs goldSageDestinationArgs) throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(GoldSageDestinations5.INSTANCE, goldSageDestinationArgs, null, null, 6, null), false, (Function1) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(UriHandler uriHandler, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        uriHandler.openUri(url);
        return Unit.INSTANCE;
    }
}
