package com.robinhood.shared.crypto.acats;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.crypto.acats.CryptoAcatsComposable;
import com.robinhood.shared.crypto.acats.MigrationAssetsListDest;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoAcatsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002"}, m3636d2 = {"CryptoAcatsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease", "currentBackStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAcatsComposable$lambda$1(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoAcatsComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoAcatsComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-901892466);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-901892466, i3, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable (CryptoAcatsComposable.kt:33)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            final SnapshotState4<NavBackStackEntry> snapshotState4CurrentBackStackEntryAsState = NavHostController2.currentBackStackEntryAsState(navHostControllerRememberNavController, composerStartRestartGroup, 0);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, "bitstamp", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, -1, -1, -1, -1, -1, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(-747401095, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt.CryptoAcatsComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-747401095, i5, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous> (CryptoAcatsComposable.kt:40)");
                    }
                    Boolean bool = Boolean.FALSE;
                    final Modifier modifier4 = modifier3;
                    final NavHostController navHostController = navHostControllerRememberNavController;
                    final SnapshotState4<NavBackStackEntry> snapshotState4 = snapshotState4CurrentBackStackEntryAsState;
                    BentoTheme2.BentoTheme(bool, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1360272321, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt.CryptoAcatsComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1360272321, i6, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:41)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                            final NavHostController navHostController2 = navHostController;
                            final SnapshotState4<NavBackStackEntry> snapshotState42 = snapshotState4;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(-1213709955, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt.CryptoAcatsComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1213709955, i7, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:44)");
                                    }
                                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                                    final NavHostController navHostController3 = navHostController2;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(367033392, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt.CryptoAcatsComposable.1.1.1.1

                                        /* compiled from: CryptoAcatsComposable.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        /* renamed from: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$1$1$WhenMappings */
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[AssetListType.values().length];
                                                try {
                                                    iArr[AssetListType.TRANSFERABLE_CRYPTO.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[AssetListType.NON_TRANSFERABLE_CASH.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[AssetListType.NON_TRANSFERABLE_CRYPTO.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                $EnumSwitchMapping$0 = iArr;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i8) {
                                            String strStringResource;
                                            MigrationAssetsListDest.Args args;
                                            Bundle arguments;
                                            Parcelable parcelable;
                                            NavDestination destination;
                                            if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(367033392, i8, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:46)");
                                            }
                                            SnapshotState4<NavBackStackEntry> snapshotState4CurrentBackStackEntryAsState2 = NavHostController2.currentBackStackEntryAsState(navHostController3, composer5, 0);
                                            NavBackStackEntry navBackStackEntryInvoke$lambda$0 = invoke$lambda$0(snapshotState4CurrentBackStackEntryAsState2);
                                            String route = (navBackStackEntryInvoke$lambda$0 == null || (destination = navBackStackEntryInvoke$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                                            if (Intrinsics.areEqual(route, MigrationExplainerDest.INSTANCE.getRoutePath()) || Intrinsics.areEqual(route, MigrationReviewAssetsDest.INSTANCE.getRoutePath()) || Intrinsics.areEqual(route, MigrationSubmitAssetsDest.INSTANCE.getRoutePath())) {
                                                composer5.startReplaceGroup(-694471004);
                                                strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_migration_explainer_appbar_title, composer5, 0);
                                                composer5.endReplaceGroup();
                                            } else {
                                                strStringResource = "";
                                                if (route == null || !StringsKt.startsWith$default(route, StringsKt.substringBefore$default(MigrationAssetsListDest.INSTANCE.getRoutePath(), "{", (String) null, 2, (Object) null), false, 2, (Object) null)) {
                                                    composer5.startReplaceGroup(-692892114);
                                                    composer5.endReplaceGroup();
                                                } else {
                                                    composer5.startReplaceGroup(-694176411);
                                                    NavBackStackEntry navBackStackEntryInvoke$lambda$02 = invoke$lambda$0(snapshotState4CurrentBackStackEntryAsState2);
                                                    if (navBackStackEntryInvoke$lambda$02 == null || (arguments = navBackStackEntryInvoke$lambda$02.getArguments()) == null) {
                                                        args = null;
                                                    } else {
                                                        if (Build.VERSION.SDK_INT >= 34) {
                                                            parcelable = (Parcelable) arguments.getParcelable("rh_navigation_args", MigrationAssetsListDest.Args.class);
                                                        } else {
                                                            Parcelable parcelable2 = arguments.getParcelable("rh_navigation_args");
                                                            if (!(parcelable2 instanceof MigrationAssetsListDest.Args)) {
                                                                parcelable2 = null;
                                                            }
                                                            parcelable = (MigrationAssetsListDest.Args) parcelable2;
                                                        }
                                                        args = (MigrationAssetsListDest.Args) parcelable;
                                                    }
                                                    AssetListType assetListType = args != null ? args.getAssetListType() : null;
                                                    int i9 = assetListType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[assetListType.ordinal()];
                                                    if (i9 == -1) {
                                                        composer5.startReplaceGroup(-693007186);
                                                        composer5.endReplaceGroup();
                                                    } else if (i9 == 1) {
                                                        composer5.startReplaceGroup(531811921);
                                                        strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_assets_list_transferable_crypto_title, composer5, 0);
                                                        composer5.endReplaceGroup();
                                                    } else if (i9 == 2) {
                                                        composer5.startReplaceGroup(531819667);
                                                        strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_assets_list_non_transferable_cash_title, composer5, 0);
                                                        composer5.endReplaceGroup();
                                                    } else {
                                                        if (i9 != 3) {
                                                            composer5.startReplaceGroup(531809217);
                                                            composer5.endReplaceGroup();
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        composer5.startReplaceGroup(531827541);
                                                        strStringResource = StringResources_androidKt.stringResource(C37511R.string.crypto_acats_assets_list_non_transferable_crypto_title, composer5, 0);
                                                        composer5.endReplaceGroup();
                                                    }
                                                    composer5.endReplaceGroup();
                                                }
                                            }
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16382);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        private static final NavBackStackEntry invoke$lambda$0(SnapshotState4<NavBackStackEntry> snapshotState43) {
                                            return snapshotState43.getValue();
                                        }
                                    }, composer4, 54);
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-390489252, true, new AnonymousClass2(snapshotState42), composer4, 54);
                                    final SnapshotState4<NavBackStackEntry> snapshotState43 = snapshotState42;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(428546763, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt.CryptoAcatsComposable.1.1.1.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                            invoke(boxScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoAppBar, Composer composer5, int i8) {
                                            NavDestination destination;
                                            NavDestination destination2;
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i8 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(428546763, i8, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:105)");
                                            }
                                            NavBackStackEntry navBackStackEntryCryptoAcatsComposable$lambda$0 = CryptoAcatsComposable.CryptoAcatsComposable$lambda$0(snapshotState43);
                                            String route = (navBackStackEntryCryptoAcatsComposable$lambda$0 == null || (destination2 = navBackStackEntryCryptoAcatsComposable$lambda$0.getDestination()) == null) ? null : destination2.getRoute();
                                            MigrationExplainerDest migrationExplainerDest = MigrationExplainerDest.INSTANCE;
                                            boolean z = Intrinsics.areEqual(route, migrationExplainerDest.getRoutePath()) || Intrinsics.areEqual(route, MigrationReviewAssetsDest.INSTANCE.getRoutePath()) || Intrinsics.areEqual(route, MigrationSubmitAssetsDest.INSTANCE.getRoutePath());
                                            NavBackStackEntry navBackStackEntryCryptoAcatsComposable$lambda$02 = CryptoAcatsComposable.CryptoAcatsComposable$lambda$0(snapshotState43);
                                            String route2 = (navBackStackEntryCryptoAcatsComposable$lambda$02 == null || (destination = navBackStackEntryCryptoAcatsComposable$lambda$02.getDestination()) == null) ? null : destination.getRoute();
                                            final float f = Intrinsics.areEqual(route2, migrationExplainerDest.getRoutePath()) ? 0.3f : Intrinsics.areEqual(route2, MigrationReviewAssetsDest.INSTANCE.getRoutePath()) ? 0.6f : Intrinsics.areEqual(route2, MigrationSubmitAssetsDest.INSTANCE.getRoutePath()) ? 1.0f : 0.0f;
                                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-1096934157, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt.CryptoAcatsComposable.1.1.1.3.1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, Integer num) {
                                                    invoke(animatedVisibilityScope, composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer6, int i9) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1096934157, i9, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:125)");
                                                    }
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i10 = BentoTheme.$stable;
                                                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(1, f, 2, null, bentoTheme.getColors(composer6, i10).m21425getFg0d7_KjU(), bentoTheme.getColors(composer6, i10).m21427getFg30d7_KjU(), false, composer6, 390, 72);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer5, 54), composer5, 200064, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), false, false, appBarType, null, 0L, null, composer4, 12607878, 0, 1898);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: CryptoAcatsComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                    final /* synthetic */ SnapshotState4<NavBackStackEntry> $currentBackStackEntry$delegate;

                                    AnonymousClass2(SnapshotState4<NavBackStackEntry> snapshotState4) {
                                        this.$currentBackStackEntry$delegate = snapshotState4;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                        invoke(bentoAppBarScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Activity activity) {
                                        if (activity != null) {
                                            activity.finish();
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                        int i2;
                                        NavDestination destination;
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 6) == 0) {
                                            i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-390489252, i2, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:85)");
                                        }
                                        NavBackStackEntry navBackStackEntryCryptoAcatsComposable$lambda$0 = CryptoAcatsComposable.CryptoAcatsComposable$lambda$0(this.$currentBackStackEntry$delegate);
                                        String route = (navBackStackEntryCryptoAcatsComposable$lambda$0 == null || (destination = navBackStackEntryCryptoAcatsComposable$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                                        final Activity activity = (Activity) composer.consume(LocalActivity.getLocalActivity());
                                        if (!Intrinsics.areEqual(route, MigrationSubmissionConfirmationDest.INSTANCE.getRoutePath())) {
                                            boolean z = false;
                                            if (route != null && StringsKt.startsWith$default(route, StringsKt.substringBefore$default(MigrationSubmissionFailureDest.INSTANCE.getRoutePath(), "{", (String) null, 2, (Object) null), false, 2, (Object) null)) {
                                                z = true;
                                            }
                                            if (z) {
                                                composer.startReplaceGroup(2001582475);
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance = composer.changedInstance(activity);
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$1$2$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return CryptoAcatsComposable.C375091.AnonymousClass1.C506651.AnonymousClass2.invoke$lambda$1$lambda$0(activity);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                                composer.endReplaceGroup();
                                            } else {
                                                composer.startReplaceGroup(2001811255);
                                                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
                                                final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance2 = composer.changedInstance(onBackPressedDispatcher);
                                                Object objRememberedValue2 = composer.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$1$2$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return CryptoAcatsComposable.C375091.AnonymousClass1.C506651.AnonymousClass2.invoke$lambda$3$lambda$2(onBackPressedDispatcher);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer.endReplaceGroup();
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                                composer.endReplaceGroup();
                                            }
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        if (onBackPressedDispatcher != null) {
                                            onBackPressedDispatcher.onBackPressed();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-149634670, true, new AnonymousClass2(navHostController, snapshotState4), composer3, 54), composer3, 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoAcatsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState4<NavBackStackEntry> $currentBackStackEntry$delegate;
                            final /* synthetic */ NavHostController $navHostController;

                            AnonymousClass2(NavHostController navHostController, SnapshotState4<NavBackStackEntry> snapshotState4) {
                                this.$navHostController = navHostController;
                                this.$currentBackStackEntry$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(NavGraphBuilder persistentSetOf, NavHostController navController) {
                                Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                                Intrinsics.checkNotNullParameter(navController, "navController");
                                CryptoAcatsNavGraph9.cryptoAcatsNavGraph(persistentSetOf, navController);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues it, Composer composer, int i) {
                                NavDestination destination;
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((i & 6) == 0) {
                                    i |= composer.changed(it) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-149634670, i, -1, "com.robinhood.shared.crypto.acats.CryptoAcatsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoAcatsComposable.kt:137)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, it);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CryptoAcatsComposable.C375091.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0((NavGraphBuilder) obj, (NavHostController) obj2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                boolean z = true;
                                GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navHostController, extensions2.persistentSetOf((Function2) objRememberedValue), CryptoAcatsRootDest.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierPadding, composer, (ComposableDestination.$stable << 6) | 48, 0);
                                final Activity activity = (Activity) composer.consume(LocalActivity.getLocalActivity());
                                NavBackStackEntry navBackStackEntryCryptoAcatsComposable$lambda$0 = CryptoAcatsComposable.CryptoAcatsComposable$lambda$0(this.$currentBackStackEntry$delegate);
                                String route = (navBackStackEntryCryptoAcatsComposable$lambda$0 == null || (destination = navBackStackEntryCryptoAcatsComposable$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                                if (!Intrinsics.areEqual(route, MigrationSubmissionConfirmationDest.INSTANCE.getRoutePath()) && !Intrinsics.areEqual(route, MigrationSubmissionFailureDest.INSTANCE.getRoutePath())) {
                                    z = false;
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(activity);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$CryptoAcatsComposable$1$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoAcatsComposable.C375091.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(activity);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BackHandler.BackHandler(z, (Function0) objRememberedValue2, composer, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(Activity activity) {
                                if (activity != null) {
                                    activity.finish();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.CryptoAcatsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoAcatsComposable.CryptoAcatsComposable$lambda$1(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry CryptoAcatsComposable$lambda$0(SnapshotState4<NavBackStackEntry> snapshotState4) {
        return snapshotState4.getValue();
    }
}
