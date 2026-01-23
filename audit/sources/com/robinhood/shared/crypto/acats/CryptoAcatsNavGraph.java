package com.robinhood.shared.crypto.acats;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.shared.crypto.acats.MigrationAssetsListDest;
import com.robinhood.shared.crypto.acats.MigrationSubmissionConfirmationDest;
import com.robinhood.shared.crypto.acats.MigrationSubmissionFailureDest;
import com.robinhood.shared.crypto.acats.MigrationSubmitAssetsDest;
import com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposable;
import com.robinhood.shared.crypto.acats.confirmation.MigrationSubmissionConfirmationComposable3;
import com.robinhood.shared.crypto.acats.explainer.MigrationExplainerComposable3;
import com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposable;
import com.robinhood.shared.crypto.acats.intro.MigrationIntroComposable3;
import com.robinhood.shared.crypto.acats.reviewassets.MigrationReviewAssetsComposable4;
import com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsNavGraph {
    public static final CryptoAcatsNavGraph INSTANCE = new CryptoAcatsNavGraph();
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$1613901309 = ComposableLambda3.composableLambdaInstance(1613901309, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$1613901309$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613901309, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$1613901309.<anonymous> (CryptoAcatsNavGraph.kt:29)");
            }
            MigrationIntroComposable3.MigrationIntroComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-395710618, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9394lambda$395710618 = ComposableLambda3.composableLambdaInstance(-395710618, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$-395710618$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-395710618, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$-395710618.<anonymous> (CryptoAcatsNavGraph.kt:35)");
            }
            MigrationExplainerComposable3.MigrationExplainerComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-632328443, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9395lambda$632328443 = ComposableLambda3.composableLambdaInstance(-632328443, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$-632328443$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632328443, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$-632328443.<anonymous> (CryptoAcatsNavGraph.kt:41)");
            }
            MigrationReviewAssetsComposable4.MigrationReviewAssetsComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-868946268, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9396lambda$868946268 = ComposableLambda3.composableLambdaInstance(-868946268, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$-868946268$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-868946268, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$-868946268.<anonymous> (CryptoAcatsNavGraph.kt:47)");
            }
            MigrationSubmitAssetsComposable5.MigrationSubmitAssetsComposable((MigrationSubmitAssetsDest.Args) ComposableCompanion.args(navBackStackEntry), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1105564093, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9391lambda$1105564093 = ComposableLambda3.composableLambdaInstance(-1105564093, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$-1105564093$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1105564093, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$-1105564093.<anonymous> (CryptoAcatsNavGraph.kt:55)");
            }
            MigrationAssetsListDest.Args args = (MigrationAssetsListDest.Args) ComposableCompanion.args(navBackStackEntry);
            MigrationAssetsListComposable.MigrationAssetsListComposable(args.getAssetListType(), args.getRows(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1342181918, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9392lambda$1342181918 = ComposableLambda3.composableLambdaInstance(-1342181918, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$-1342181918$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1342181918, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$-1342181918.<anonymous> (CryptoAcatsNavGraph.kt:64)");
            }
            MigrationSubmissionConfirmationComposable3.MigrationSubmissionConfirmationComposable((MigrationSubmissionConfirmationDest.Args) ComposableCompanion.args(navBackStackEntry), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1578799743, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9393lambda$1578799743 = ComposableLambda3.composableLambdaInstance(-1578799743, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt$lambda$-1578799743$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578799743, i, -1, "com.robinhood.shared.crypto.acats.ComposableSingletons$CryptoAcatsNavGraphKt.lambda$-1578799743.<anonymous> (CryptoAcatsNavGraph.kt:72)");
            }
            MigrationSubmissionFailureDest.Args args = (MigrationSubmissionFailureDest.Args) ComposableCompanion.args(navBackStackEntry);
            MigrationSubmissionFailureComposable.MigrationSubmissionFailureComposable(args.getFailureType(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1105564093$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24862getLambda$1105564093$feature_acats_externalRelease() {
        return f9391lambda$1105564093;
    }

    /* renamed from: getLambda$-1342181918$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24863getLambda$1342181918$feature_acats_externalRelease() {
        return f9392lambda$1342181918;
    }

    /* renamed from: getLambda$-1578799743$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24864getLambda$1578799743$feature_acats_externalRelease() {
        return f9393lambda$1578799743;
    }

    /* renamed from: getLambda$-395710618$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24865getLambda$395710618$feature_acats_externalRelease() {
        return f9394lambda$395710618;
    }

    /* renamed from: getLambda$-632328443$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24866getLambda$632328443$feature_acats_externalRelease() {
        return f9395lambda$632328443;
    }

    /* renamed from: getLambda$-868946268$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24867getLambda$868946268$feature_acats_externalRelease() {
        return f9396lambda$868946268;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$1613901309$feature_acats_externalRelease() {
        return lambda$1613901309;
    }
}
