package com.robinhood.android.gold.sage;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.gold.sage.GoldSageDestinations6;
import com.robinhood.android.gold.sage.data.GoldSageDestinationArgs;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.rosetta.eventlogging.Context;
import gold.proto.p464v1.CreateSageApplicationResponse;
import gold.proto.p464v1.GoldSageStartApplication;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldSageNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$4, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageNavGraph5 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ Function1<Throwable, Unit> $handleError;
    final /* synthetic */ Context $loggingContext;
    final /* synthetic */ String $sageId;

    /* JADX WARN: Multi-variable type inference failed */
    GoldSageNavGraph5(Function1<? super Throwable, Unit> function1, Context context, String str) {
        this.$handleError = function1;
        this.$loggingContext = context;
        this.$sageId = str;
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
            ComposerKt.traceEventStart(-62937420, i, -1, "com.robinhood.android.gold.sage.goldSageNavGraph.<anonymous>.<anonymous> (GoldSageNavGraph.kt:58)");
        }
        GoldSageStartApplication application = ((GoldSageDestinationArgs) ComposableCompanion.args(entry)).getGoldSageFlow().getApplication();
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldSageNavGraph5.invoke$lambda$1$lambda$0(navigator, (CreateSageApplicationResponse) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GoldSageStartApplicationComposable.GoldSageStartApplicationComposable(application, (Function1) objRememberedValue, this.$handleError, null, null, null, this.$loggingContext, this.$sageId, composer, 0, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, CreateSageApplicationResponse sageApplicationResponse) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(sageApplicationResponse, "sageApplicationResponse");
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(GoldSageDestinations6.INSTANCE, new GoldSageDestinations6.Args(sageApplicationResponse), null, null, 6, null), false, (Function1) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
