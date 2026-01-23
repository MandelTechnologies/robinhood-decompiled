package com.robinhood.android.transfers.recurring.p270ui.experiment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubFragment;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations2;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations3;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations4;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations7;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateComposable5;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecurringDepositHubFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u000f\u001a\u00020\u00102@\u0010\u0011\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00100\u0013j\u0007`\u001b¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001a0\u0012H\u0017¢\u0006\u0002\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001fH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006&²\u0006\f\u0010'\u001a\u0004\u0018\u00010(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onPrimaryButtonClicked", "dialogId", "", "passthroughArgs", "Landroid/os/Bundle;", "onDialogDismissed", "id", "Args", "Companion", "feature-recurring-deposits_externalDebug", "currentBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "didLaunchExtraCashOnStart"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositHubFragment extends BaseComposeNavHostFragment implements RhDialogFragment.OnDismissListener {
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(RecurringDepositHubFragment recurringDepositHubFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        recurringDepositHubFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(-946645414);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(navGraphsBuilders) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946645414, i2, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent (RecurringDepositHubFragment.kt:61)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(-1980273894, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1980273894, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous> (RecurringDepositHubFragment.kt:65)");
                    }
                    final RecurringDepositHubFragment recurringDepositHubFragment = RecurringDepositHubFragment.this;
                    final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet = navGraphsBuilders;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2076323419, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            NavDestination destination;
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2076323419, i4, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous>.<anonymous> (RecurringDepositHubFragment.kt:66)");
                            }
                            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer3, BackHandler5.$stable);
                            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                            NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composer3, 0);
                            NavBackStackEntry navBackStackEntryInvoke$lambda$0 = invoke$lambda$0(NavHostController2.currentBackStackEntryAsState(navHostControllerRememberNavController, composer3, 0));
                            final String route = (navBackStackEntryInvoke$lambda$0 == null || (destination = navBackStackEntryInvoke$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1890989929, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1890989929, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubFragment.kt:78)");
                                    }
                                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null);
                                    final String str = route;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1888252950, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i6) {
                                            if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1888252950, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubFragment.kt:80)");
                                            }
                                            String str2 = str;
                                            composer5.startReplaceGroup(2134889458);
                                            String strStringResource = (Intrinsics.areEqual(str2, RecurringDepositExtraCashDestinations2.INSTANCE.getRoutePath()) || Intrinsics.areEqual(str2, RecurringDepositExtraCashDestinations4.INSTANCE.getRoutePath()) || Intrinsics.areEqual(str2, RecurringDepositExtraCashDestinations3.INSTANCE.getRoutePath()) || Intrinsics.areEqual(str2, RecurringDepositExtraCashDestinations7.INSTANCE.getRoutePath())) ? StringResources_androidKt.stringResource(C30439R.string.create_recurring_deposit_extra_cash_toolbar_title, composer5, 0) : "";
                                            composer5.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextL(), composer5, 0, 0, 8190);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54);
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1673649770, true, new AnonymousClass2(onBackPressedDispatcher), composer4, 54);
                                    final String str2 = route;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifierWrapContentHeight$default, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(-701218341, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.1.1.1.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                            invoke(boxScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoAppBar, Composer composer5, int i6) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i6 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-701218341, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubFragment.kt:96)");
                                            }
                                            String str3 = str2;
                                            Float fValueOf = Intrinsics.areEqual(str3, RecurringDepositExtraCashDestinations2.INSTANCE.getRoutePath()) ? Float.valueOf(0.25f) : Intrinsics.areEqual(str3, RecurringDepositExtraCashDestinations4.INSTANCE.getRoutePath()) ? Float.valueOf(0.5f) : Intrinsics.areEqual(str3, RecurringDepositExtraCashDestinations3.INSTANCE.getRoutePath()) ? Float.valueOf(0.75f) : Intrinsics.areEqual(str3, RecurringDepositExtraCashDestinations7.INSTANCE.getRoutePath()) ? Float.valueOf(1.0f) : null;
                                            if (fValueOf != null) {
                                                BentoProgressBar2.m20698BentoProgressBarjB83MbM(fValueOf.floatValue(), null, 1, 0L, 0L, false, composer5, 384, 58);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), false, false, null, null, 0L, null, composer4, 1597878, 0, 1960);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: RecurringDepositHubFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

                                    AnonymousClass2(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        this.$backPressedDispatcher = onBackPressedDispatcher;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                        invoke(bentoAppBarScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i & 6) == 0) {
                                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1673649770, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubFragment.kt:113)");
                                        }
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return RecurringDepositHubFragment.C304671.AnonymousClass1.C506051.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                                        if (onBackPressedDispatcher != null) {
                                            onBackPressedDispatcher.onBackPressed();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-2028228364, true, new AnonymousClass2(route, navHostControllerRememberNavController, recurringDepositHubFragment, immutableSet), composer3, 54), composer3, 805306422, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RecurringDepositHubFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ String $currentRoute;
                            final /* synthetic */ NavHostController $navController;
                            final /* synthetic */ ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> $navGraphsBuilders;
                            final /* synthetic */ RecurringDepositHubFragment this$0;

                            AnonymousClass2(String str, NavHostController navHostController, RecurringDepositHubFragment recurringDepositHubFragment, ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet) {
                                this.$currentRoute = str;
                                this.$navController = navHostController;
                                this.this$0 = recurringDepositHubFragment;
                                this.$navGraphsBuilders = immutableSet;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean invoke$lambda$8(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(NavHostController navHostController, final RecurringDepositHubFragment recurringDepositHubFragment, NavGraphBuilder mutableSetOf, NavHostController it) {
                                Intrinsics.checkNotNullParameter(mutableSetOf, "$this$mutableSetOf");
                                Intrinsics.checkNotNullParameter(it, "it");
                                KeyEventDispatcher.Component componentRequireActivity = recurringDepositHubFragment.requireActivity();
                                Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.android.transfers.recurring.ui.experiment.extracash.create.CreateCallbacks");
                                RecurringDepositHubNavGraph.recurringDepositHubNavGraph(mutableSetOf, navHostController, (CreateComposable5) componentRequireActivity, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RecurringDepositHubFragment.C304671.AnonymousClass1.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$1(recurringDepositHubFragment, (String) obj);
                                    }
                                }, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RecurringDepositHubFragment.C304671.AnonymousClass1.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(recurringDepositHubFragment, (Survey) obj);
                                    }
                                });
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3$lambda$1(RecurringDepositHubFragment recurringDepositHubFragment, String id) {
                                Intrinsics.checkNotNullParameter(id, "id");
                                com.robinhood.android.navigation.Navigator navigator = recurringDepositHubFragment.getNavigator();
                                Context contextRequireContext = recurringDepositHubFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.AutomaticDepositDetail(id), false, false, false, false, null, false, null, null, 1012, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3$lambda$2(RecurringDepositHubFragment recurringDepositHubFragment, Survey survey) {
                                Intrinsics.checkNotNullParameter(survey, "survey");
                                recurringDepositHubFragment.getUserLeapManager().presentSurveyIfNecessary(recurringDepositHubFragment, survey);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final SnapshotState invoke$lambda$7$lambda$6() {
                                return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void invoke$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2028228364, i2, -1, "com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment.NavHostComposeContent.<anonymous>.<anonymous>.<anonymous> (RecurringDepositHubFragment.kt:123)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                if (this.$currentRoute != null) {
                                    modifierPadding = PaddingKt.m5146paddingqDBjuR0$default(modifierPadding, 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null);
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierPadding, 0.0f, 1, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$navController) | composer.changedInstance(this.this$0);
                                final NavHostController navHostController = this.$navController;
                                final RecurringDepositHubFragment recurringDepositHubFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return RecurringDepositHubFragment.C304671.AnonymousClass1.AnonymousClass2.invoke$lambda$4$lambda$3(navHostController, recurringDepositHubFragment, (NavGraphBuilder) obj, (NavHostController) obj2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                Set setMutableSetOf = SetsKt.mutableSetOf((Function2) objRememberedValue);
                                setMutableSetOf.addAll(this.$navGraphsBuilders);
                                GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.toPersistentSet(setMutableSetOf), RecurringDepositHubDestinations2.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierFillMaxSize$default, composer, ComposableDestination.$stable << 6, 0);
                                Object[] objArr = new Object[0];
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$NavHostComposeContent$1$1$2$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RecurringDepositHubFragment.C304671.AnonymousClass1.AnonymousClass2.invoke$lambda$7$lambda$6();
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composer, 3072, 6);
                                Boolean boolValueOf = Boolean.valueOf(invoke$lambda$8(snapshotState));
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changed(snapshotState) | composer.changedInstance(this.$navController);
                                RecurringDepositHubFragment recurringDepositHubFragment2 = this.this$0;
                                NavHostController navHostController2 = this.$navController;
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new RecurringDepositHubFragment2(recurringDepositHubFragment2, navHostController2, snapshotState, null);
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        private static final NavBackStackEntry invoke$lambda$0(SnapshotState4<NavBackStackEntry> snapshotState4) {
                            return snapshotState4.getValue();
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringDepositHubFragment.NavHostComposeContent$lambda$0(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (getId() == C11048R.id.dialog_id_generic_error) {
            onDialogDismissed(getId());
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        onBackPressed();
    }

    /* compiled from: RecurringDepositHubFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubFragment$Args;", "Landroid/os/Parcelable;", "launchRecurringExtraCashOnStart", "", "<init>", "(Z)V", "getLaunchRecurringExtraCashOnStart", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean launchRecurringExtraCashOnStart;

        /* compiled from: RecurringDepositHubFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.launchRecurringExtraCashOnStart;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLaunchRecurringExtraCashOnStart() {
            return this.launchRecurringExtraCashOnStart;
        }

        public final Args copy(boolean launchRecurringExtraCashOnStart) {
            return new Args(launchRecurringExtraCashOnStart);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.launchRecurringExtraCashOnStart == ((Args) other).launchRecurringExtraCashOnStart;
        }

        public int hashCode() {
            return Boolean.hashCode(this.launchRecurringExtraCashOnStart);
        }

        public String toString() {
            return "Args(launchRecurringExtraCashOnStart=" + this.launchRecurringExtraCashOnStart + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.launchRecurringExtraCashOnStart ? 1 : 0);
        }

        public Args(boolean z) {
            this.launchRecurringExtraCashOnStart = z;
        }

        public final boolean getLaunchRecurringExtraCashOnStart() {
            return this.launchRecurringExtraCashOnStart;
        }
    }

    /* compiled from: RecurringDepositHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubFragment;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/RecurringDepositHubFragment$Args;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringDepositHubFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringDepositHubFragment recurringDepositHubFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringDepositHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringDepositHubFragment newInstance(Args args) {
            return (RecurringDepositHubFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringDepositHubFragment recurringDepositHubFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringDepositHubFragment, args);
        }
    }
}
