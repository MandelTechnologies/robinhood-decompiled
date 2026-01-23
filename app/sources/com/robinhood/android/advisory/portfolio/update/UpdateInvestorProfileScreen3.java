package com.robinhood.android.advisory.portfolio.update;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileViewState;
import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonut3;
import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: UpdateInvestorProfileScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"UpdateInvestorProfileScreen", "", "viewState", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateInvestorProfileScreen$lambda$0(UpdateInvestorProfileViewState updateInvestorProfileViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpdateInvestorProfileScreen(updateInvestorProfileViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdateInvestorProfileScreen(final UpdateInvestorProfileViewState viewState, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        String serverValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1196078977);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1196078977, i3, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreen (UpdateInvestorProfileScreen.kt:33)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (!(viewState instanceof UpdateInvestorProfileViewState.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(1340514760);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Screen.Name name = Screen.Name.UPDATE_MANAGED_INVESTOR_PROFILE;
                    BrokerageAccountType brokerageAccountType = ((UpdateInvestorProfileViewState.Loaded) viewState).getBrokerageAccountType();
                    if (brokerageAccountType == null || (serverValue = brokerageAccountType.getServerValue()) == null) {
                        serverValue = "";
                    }
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(name, null, serverValue, null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-1922287170, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt.UpdateInvestorProfileScreen.1
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
                                ComposerKt.traceEventStart(-1922287170, i5, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreen.<anonymous> (UpdateInvestorProfileScreen.kt:48)");
                            }
                            Modifier modifier4 = modifier3;
                            final Function0<Unit> function0 = onBackClicked;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2146130562, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt.UpdateInvestorProfileScreen.1.1
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
                                        ComposerKt.traceEventStart(2146130562, i6, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreen.<anonymous>.<anonymous> (UpdateInvestorProfileScreen.kt:50)");
                                    }
                                    Function2<Composer, Integer, Unit> lambda$1370311407$feature_advisory_portfolio_externalDebug = UpdateInvestorProfileScreen.INSTANCE.getLambda$1370311407$feature_advisory_portfolio_externalDebug();
                                    final Function0<Unit> function02 = function0;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1370311407$feature_advisory_portfolio_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1427801021, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt.UpdateInvestorProfileScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                            invoke(bentoAppBarScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i7 & 6) == 0) {
                                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1427801021, i7, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreen.<anonymous>.<anonymous>.<anonymous> (UpdateInvestorProfileScreen.kt:59)");
                                            }
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            final Context context2 = context;
                            final UpdateInvestorProfileViewState updateInvestorProfileViewState = viewState;
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(2032520067, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt.UpdateInvestorProfileScreen.1.2
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
                                        ComposerKt.traceEventStart(2032520067, i6, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreen.<anonymous>.<anonymous> (UpdateInvestorProfileScreen.kt:96)");
                                    }
                                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-advisory-update-investor-profile", null, 2, null);
                                    AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context2);
                                    if (appCompatActivityFindActivityBaseContext == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), 0.0f, composer3, 0, 1), UtilsKt.getMicrogramLaunchArguments(((UpdateInvestorProfileViewState.Loaded) updateInvestorProfileViewState).getAccountNumber(), ((UpdateInvestorProfileViewState.Loaded) updateInvestorProfileViewState).getApplicationId(), ((UpdateInvestorProfileViewState.Loaded) updateInvestorProfileViewState).getBrokerageAccountType(), true), null, null, null, true, null, composer3, 12582912, 368);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54);
                            final UpdateInvestorProfileViewState updateInvestorProfileViewState2 = viewState;
                            final Context context3 = context;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-832669107, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt.UpdateInvestorProfileScreen.1.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                    int i7;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i6 & 6) == 0) {
                                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                                    } else {
                                        i7 = i6;
                                    }
                                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-832669107, i7, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreen.<anonymous>.<anonymous> (UpdateInvestorProfileScreen.kt:67)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.defaultScaffoldPadding(companion, paddingValues, composer3, ((i7 << 3) & 112) | 6), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                    UpdateInvestorProfileViewState updateInvestorProfileViewState3 = updateInvestorProfileViewState2;
                                    Context context4 = context3;
                                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    UpdateInvestorProfileViewState.Loaded loaded = (UpdateInvestorProfileViewState.Loaded) updateInvestorProfileViewState3;
                                    UpdateInvestorProfileDonutData donutData = loaded.getDonutData();
                                    composer3.startReplaceGroup(-1522405733);
                                    if (donutData != null) {
                                        UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut(donutData, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(column6.align(companion, companion2.getCenterHorizontally()), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 1, null), 0.0f, composer3, 0, 1), composer3, 0, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-advisory-update-investor-profile", null, 2, null);
                                    AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context4);
                                    if (appCompatActivityFindActivityBaseContext == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, null, UtilsKt.getMicrogramLaunchArguments(loaded.getAccountNumber(), loaded.getApplicationId(), loaded.getBrokerageAccountType(), false), null, null, null, true, null, composer3, 12582912, 372);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 805306800, 504);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(viewState instanceof UpdateInvestorProfileViewState.Loading)) {
                        composerStartRestartGroup.startReplaceGroup(-1619327557);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1344411460);
                    UpdateInvestorProfileLoadingScreen5.UpdateInvestorProfileLoadingScreen(onBackClicked, modifier3, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdateInvestorProfileScreen3.UpdateInvestorProfileScreen$lambda$0(viewState, onBackClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (!(viewState instanceof UpdateInvestorProfileViewState.Loaded)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
