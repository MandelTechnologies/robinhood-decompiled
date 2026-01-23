package com.robinhood.android.advisory.insights.hub;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.robinhood.android.advisory.contracts.AdvisoryInsightDetailKey;
import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.advisory.insight.InsightIconGradientBackground;
import com.robinhood.android.advisory.insights.C8770R;
import com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen;
import com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.cortex.contracts.PortfolioDigestFragmentKey;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.RemoteIcon;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryInsightsHubScreen.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"TAG_LOADING", "", "AdvisoryInsightsHubScreen", "", "viewState", "Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/insights/hub/AdvisoryInsightsHubViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-insights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightsHubScreen {
    public static final String TAG_LOADING = "AdvisoryInsightsHub_Loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryInsightsHubScreen$lambda$0(AdvisoryInsightsHubViewState advisoryInsightsHubViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryInsightsHubScreen(advisoryInsightsHubViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryInsightsHubScreen(final AdvisoryInsightsHubViewState viewState, final Function0<Unit> onBackClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(768736489);
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
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(768736489, i3, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen (AdvisoryInsightsHubScreen.kt:65)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-850505307, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-850505307, i5, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous> (AdvisoryInsightsHubScreen.kt:72)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        Function2<Composer, Integer, Unit> lambda$316549400$feature_advisory_insights_externalDebug = AdvisoryInsightsHubScreen7.INSTANCE.getLambda$316549400$feature_advisory_insights_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$316549400$feature_advisory_insights_externalDebug, null, ComposableLambda3.rememberComposableLambda(2040582980, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2040582980, i6, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:74)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), ComposableLambda3.rememberComposableLambda(-512462653, true, new AnonymousClass2(viewState, navigator, context), composer3, 54), null, false, false, appBarType, null, 0L, null, composer3, 12586374, 0, 1906);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AdvisoryInsightsHubScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ AdvisoryInsightsHubViewState $viewState;

                        AnonymousClass2(AdvisoryInsightsHubViewState advisoryInsightsHubViewState, Navigator navigator, Context context) {
                            this.$viewState = advisoryInsightsHubViewState;
                            this.$navigator = navigator;
                            this.$context = context;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-512462653, i, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:87)");
                            }
                            AdvisoryInsightsHubViewState advisoryInsightsHubViewState = this.$viewState;
                            AdvisoryInsightsHubViewState.Loaded loaded = advisoryInsightsHubViewState instanceof AdvisoryInsightsHubViewState.Loaded ? (AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState : null;
                            final PortfolioDigest.HasOnboarded cortexDigest = loaded != null ? loaded.getCortexDigest() : null;
                            if (cortexDigest != null) {
                                final Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                                Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()));
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(cortexDigest);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryInsightsHubScreen.C88131.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(navigator, context, cortexDigest);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CORTEX_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8770R.string.insights_hub_cortex_cta, composer, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16366);
                                composer.endNode();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$1$lambda$0(Navigator navigator, Context context, PortfolioDigest.HasOnboarded hasOnboarded) {
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new PortfolioDigestFragmentKey.WithDigest(hasOnboarded, "strategies-insights-hub", false, 4, null), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1383569670, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i5 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1383569670, i5, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous> (AdvisoryInsightsHubScreen.kt:126)");
                        }
                        boolean z = viewState instanceof AdvisoryInsightsHubViewState.Loading;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        final AdvisoryInsightsHubViewState advisoryInsightsHubViewState = viewState;
                        final Navigator navigator2 = navigator;
                        final Context context2 = context;
                        final ImageLoader imageLoader = imageLoaderRememberImageLoader;
                        LocalShowPlaceholder.Loadable(z, modifierPadding, null, ComposableLambda3.rememberComposableLambda(-1290559350, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1290559350, i6, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:132)");
                                }
                                AdvisoryInsightsHubViewState advisoryInsightsHubViewState2 = advisoryInsightsHubViewState;
                                if (advisoryInsightsHubViewState2 instanceof AdvisoryInsightsHubViewState.Loaded) {
                                    composer4.startReplaceGroup(1494012114);
                                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_INSIGHTS_HUB, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(1361334701, true, new C495771(paddingValues, advisoryInsightsHubViewState, navigator2, context2, imageLoader), composer4, 54), composer4, 48);
                                    composer4.endReplaceGroup();
                                } else {
                                    if (!(advisoryInsightsHubViewState2 instanceof AdvisoryInsightsHubViewState.Loading)) {
                                        composer4.startReplaceGroup(1018023154);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(1502879726);
                                    LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, AdvisoryInsightsHubScreen.TAG_LOADING), true, false, 0, composer4, 54, 12);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: AdvisoryInsightsHubScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C495771 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Context $context;
                                final /* synthetic */ ImageLoader $imageLoader;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ PaddingValues $paddingValues;
                                final /* synthetic */ AdvisoryInsightsHubViewState $viewState;

                                C495771(PaddingValues paddingValues, AdvisoryInsightsHubViewState advisoryInsightsHubViewState, Navigator navigator, Context context, ImageLoader imageLoader) {
                                    this.$paddingValues = paddingValues;
                                    this.$viewState = advisoryInsightsHubViewState;
                                    this.$navigator = navigator;
                                    this.$context = context;
                                    this.$imageLoader = imageLoader;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1361334701, i, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:141)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), 0.0f, 1, null), this.$paddingValues);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$imageLoader);
                                    final AdvisoryInsightsHubViewState advisoryInsightsHubViewState = this.$viewState;
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    final ImageLoader imageLoader = this.$imageLoader;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AdvisoryInsightsHubScreen.C88142.AnonymousClass1.C495771.invoke$lambda$5$lambda$4(advisoryInsightsHubViewState, navigator, context, imageLoader, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4(final AdvisoryInsightsHubViewState advisoryInsightsHubViewState, final Navigator navigator, final Context context, final ImageLoader imageLoader, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    final ImmutableList<AdvisoryInsight> insights = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState).getInsights();
                                    final C8809x3c716dd c8809x3c716dd = new Function1() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$invoke$lambda$5$lambda$4$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Void invoke(AdvisoryInsight advisoryInsight) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            return invoke((AdvisoryInsight) obj);
                                        }
                                    };
                                    LazyColumn.items(insights.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$invoke$lambda$5$lambda$4$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final Object invoke(int i) {
                                            return c8809x3c716dd.invoke(insights.get(i));
                                        }
                                    }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$invoke$lambda$5$lambda$4$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                            int i3;
                                            if ((i2 & 6) == 0) {
                                                i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                                            } else {
                                                i3 = i2;
                                            }
                                            if ((i2 & 48) == 0) {
                                                i3 |= composer.changed(i) ? 32 : 16;
                                            }
                                            if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                            }
                                            final AdvisoryInsight advisoryInsight = (AdvisoryInsight) insights.get(i);
                                            composer.startReplaceGroup(-363449004);
                                            final RemoteIcon remoteIcon = advisoryInsight.getContentViewModel().getDashboardHighlight().getRemoteIcon();
                                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(advisoryInsight.getContentViewModel().getIconName());
                                            if (serverToBentoAssetMapper2FromServerValue == null || serverToBentoAssetMapper2FromServerValue == ServerToBentoAssetMapper2.UNKNOWN) {
                                                serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.SPARKLE_DOUBLE_24;
                                            }
                                            final ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = serverToBentoAssetMapper2FromServerValue;
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(advisoryInsightsHubViewState) | composer.changedInstance(advisoryInsight);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                final Navigator navigator2 = navigator;
                                                final Context context2 = context;
                                                final AdvisoryInsightsHubViewState advisoryInsightsHubViewState2 = advisoryInsightsHubViewState;
                                                objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$1$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        Navigator navigator3 = navigator2;
                                                        Context context3 = context2;
                                                        String accountNumber = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState2).getAccountNumber();
                                                        InsightNavArg insightNavArg = new InsightNavArg(advisoryInsight.getId(), advisoryInsight.getPageType());
                                                        ImmutableList<AdvisoryInsight> insights2 = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState2).getInsights();
                                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(insights2, 10));
                                                        for (AdvisoryInsight advisoryInsight2 : insights2) {
                                                            arrayList.add(new InsightNavArg(advisoryInsight2.getId(), advisoryInsight2.getPageType()));
                                                        }
                                                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator3, context3, new AdvisoryInsightDetailKey(accountNumber, insightNavArg, arrayList), false, false, false, false, null, true, null, null, 892, null);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, advisoryInsight.getContentViewModel().getContentfulId(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                                            float f = 4;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierAutoLogEvents$default, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(24), 0.0f, 10, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            if (composer.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer.startReusableNode();
                                            if (composer.getInserting()) {
                                                composer.createNode(constructor);
                                            } else {
                                                composer.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                            Row6 row6 = Row6.INSTANCE;
                                            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16);
                                            long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance2 = composer.changedInstance(advisoryInsight);
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1<ContentDrawScope, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$1$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                                        invoke2(contentDrawScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(ContentDrawScope drawWithContent) {
                                                        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                                                        if (advisoryInsight.isSeen()) {
                                                            return;
                                                        }
                                                        drawWithContent.drawContent();
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            BentoIcon2.m20644BentoIconFU0evQE(size16, "", jM21456getPositive0d7_KjU, DrawModifierKt.drawWithContent(companion, (Function1) objRememberedValue2), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
                                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                                            final AdvisoryInsightsHubViewState advisoryInsightsHubViewState3 = advisoryInsightsHubViewState;
                                            final ImageLoader imageLoader2 = imageLoader;
                                            BentoBaseRowLayout.BentoBaseRowLayout(modifierM5146paddingqDBjuR0$default2, null, ComposableLambda3.rememberComposableLambda(1000325119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$2
                                                public final void invoke(Composer composer2, int i4) {
                                                    long jM21425getFg0d7_KjU;
                                                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                        composer2.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1000325119, i4, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:208)");
                                                    }
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    Modifier modifierClip = Clip.clip(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(48)), RoundedCornerShape2.getCircleShape());
                                                    composer2.startReplaceGroup(-760222566);
                                                    Brush insightIconGradientBackgroundBrush = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState3).getUseGradientStyling() ? InsightIconGradientBackground.getInsightIconGradientBackgroundBrush() : new SolidColor(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21372getBg20d7_KjU(), null);
                                                    composer2.endReplaceGroup();
                                                    Modifier modifierBackground$default = Background3.background$default(modifierClip, insightIconGradientBackgroundBrush, null, 0.0f, 6, null);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    RemoteIcon remoteIcon2 = remoteIcon;
                                                    ImageLoader imageLoader3 = imageLoader2;
                                                    ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                                                    AdvisoryInsightsHubViewState advisoryInsightsHubViewState4 = advisoryInsightsHubViewState3;
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierBackground$default);
                                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                        Composables.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor2);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    if (remoteIcon2 != null) {
                                                        composer2.startReplaceGroup(713137743);
                                                        ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getIsDay() ? remoteIcon2.getLightUrl() : remoteIcon2.getDarkUrl(), imageLoader3, null, null, ContentScale.INSTANCE.getFit(), 0, null, composer2, 24576, 108), (String) null, Clip.clip(companion3, RoundedCornerShape2.getCircleShape()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                                                        composer2.endReplaceGroup();
                                                    } else {
                                                        composer2.startReplaceGroup(714206003);
                                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper22);
                                                        if (((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState4).getUseGradientStyling()) {
                                                            composer2.startReplaceGroup(714518235);
                                                            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getNova();
                                                            composer2.endReplaceGroup();
                                                        } else {
                                                            composer2.startReplaceGroup(714664989);
                                                            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                            composer2.endReplaceGroup();
                                                        }
                                                        BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                                                        composer2.endReplaceGroup();
                                                    }
                                                    composer2.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer, 54), ComposableLambda3.rememberComposableLambda(1873860766, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$3
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i4) {
                                                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                        composer2.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1873860766, i4, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:249)");
                                                    }
                                                    String topLineText = advisoryInsight.getContentViewModel().getDashboardHighlight().getTopLineText();
                                                    if (topLineText == null) {
                                                        topLineText = LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(advisoryInsight.getCreateAt(), null, 1, null));
                                                    }
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i5 = BentoTheme.$stable;
                                                    BentoText2.m20747BentoText38GnDrw(topLineText, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8186);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer, 54), ComposableLambda3.rememberComposableLambda(-1547570883, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$4
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i4) {
                                                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                        composer2.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1547570883, i4, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:259)");
                                                    }
                                                    String title = advisoryInsight.getContentViewModel().getDashboardHighlight().getTitle();
                                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                    int i5 = BentoTheme.$stable;
                                                    TextStyle textM = bentoTheme.getTypography(composer2, i5).getTextM();
                                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                                                    BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM, composer2, 817889280, 0, 7546);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer, 54), null, null, true, false, true, null, composer, 817917318, 0, 1378);
                                            composer.endNode();
                                            composer.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54), composer3, 3072, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryInsightsHubScreen.AdvisoryInsightsHubScreen$lambda$0(viewState, onBackClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final ImageLoader imageLoaderRememberImageLoader2 = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-850505307, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850505307, i5, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous> (AdvisoryInsightsHubScreen.kt:72)");
                    }
                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                    Function2<Composer, Integer, Unit> lambda$316549400$feature_advisory_insights_externalDebug = AdvisoryInsightsHubScreen7.INSTANCE.getLambda$316549400$feature_advisory_insights_externalDebug();
                    final Function0<Unit> function0 = onBackClick;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$316549400$feature_advisory_insights_externalDebug, null, ComposableLambda3.rememberComposableLambda(2040582980, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2040582980, i6, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:74)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), ComposableLambda3.rememberComposableLambda(-512462653, true, new AnonymousClass2(viewState, navigator2, context2), composer3, 54), null, false, false, appBarType, null, 0L, null, composer3, 12586374, 0, 1906);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AdvisoryInsightsHubScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ AdvisoryInsightsHubViewState $viewState;

                    AnonymousClass2(AdvisoryInsightsHubViewState advisoryInsightsHubViewState, Navigator navigator, Context context) {
                        this.$viewState = advisoryInsightsHubViewState;
                        this.$navigator = navigator;
                        this.$context = context;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                        invoke(row5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-512462653, i, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:87)");
                        }
                        AdvisoryInsightsHubViewState advisoryInsightsHubViewState = this.$viewState;
                        AdvisoryInsightsHubViewState.Loaded loaded = advisoryInsightsHubViewState instanceof AdvisoryInsightsHubViewState.Loaded ? (AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState : null;
                        final PortfolioDigest.HasOnboarded cortexDigest = loaded != null ? loaded.getCortexDigest() : null;
                        if (cortexDigest != null) {
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                            Modifier modifierClip = Clip.clip(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()));
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(cortexDigest);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisoryInsightsHubScreen.C88131.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(navigator, context, cortexDigest);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CORTEX_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8770R.string.insights_hub_cortex_cta, composer, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16366);
                            composer.endNode();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$1$lambda$0(Navigator navigator, Context context, PortfolioDigest.HasOnboarded hasOnboarded) {
                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new PortfolioDigestFragmentKey.WithDigest(hasOnboarded, "strategies-insights-hub", false, 4, null), false, false, false, false, null, false, null, null, 1020, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1383569670, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final PaddingValues paddingValues, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i5 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1383569670, i5, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous> (AdvisoryInsightsHubScreen.kt:126)");
                    }
                    boolean z = viewState instanceof AdvisoryInsightsHubViewState.Loading;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                    final AdvisoryInsightsHubViewState advisoryInsightsHubViewState = viewState;
                    final Navigator navigator22 = navigator2;
                    final Context context22 = context2;
                    final ImageLoader imageLoader = imageLoaderRememberImageLoader2;
                    LocalShowPlaceholder.Loadable(z, modifierPadding, null, ComposableLambda3.rememberComposableLambda(-1290559350, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt.AdvisoryInsightsHubScreen.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1290559350, i6, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:132)");
                            }
                            AdvisoryInsightsHubViewState advisoryInsightsHubViewState2 = advisoryInsightsHubViewState;
                            if (advisoryInsightsHubViewState2 instanceof AdvisoryInsightsHubViewState.Loaded) {
                                composer4.startReplaceGroup(1494012114);
                                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_INSIGHTS_HUB, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(1361334701, true, new C495771(paddingValues, advisoryInsightsHubViewState, navigator22, context22, imageLoader), composer4, 54), composer4, 48);
                                composer4.endReplaceGroup();
                            } else {
                                if (!(advisoryInsightsHubViewState2 instanceof AdvisoryInsightsHubViewState.Loading)) {
                                    composer4.startReplaceGroup(1018023154);
                                    composer4.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4.startReplaceGroup(1502879726);
                                LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, AdvisoryInsightsHubScreen.TAG_LOADING), true, false, 0, composer4, 54, 12);
                                composer4.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AdvisoryInsightsHubScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C495771 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ ImageLoader $imageLoader;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ PaddingValues $paddingValues;
                            final /* synthetic */ AdvisoryInsightsHubViewState $viewState;

                            C495771(PaddingValues paddingValues, AdvisoryInsightsHubViewState advisoryInsightsHubViewState, Navigator navigator, Context context, ImageLoader imageLoader) {
                                this.$paddingValues = paddingValues;
                                this.$viewState = advisoryInsightsHubViewState;
                                this.$navigator = navigator;
                                this.$context = context;
                                this.$imageLoader = imageLoader;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1361334701, i, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:141)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), 0.0f, 1, null), this.$paddingValues);
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$imageLoader);
                                final AdvisoryInsightsHubViewState advisoryInsightsHubViewState = this.$viewState;
                                final Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                final ImageLoader imageLoader = this.$imageLoader;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AdvisoryInsightsHubScreen.C88142.AnonymousClass1.C495771.invoke$lambda$5$lambda$4(advisoryInsightsHubViewState, navigator, context, imageLoader, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4(final AdvisoryInsightsHubViewState advisoryInsightsHubViewState, final Navigator navigator, final Context context, final ImageLoader imageLoader, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final List insights = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState).getInsights();
                                final Function1 c8809x3c716dd = new Function1() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$invoke$lambda$5$lambda$4$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(AdvisoryInsight advisoryInsight) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((AdvisoryInsight) obj);
                                    }
                                };
                                LazyColumn.items(insights.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$invoke$lambda$5$lambda$4$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c8809x3c716dd.invoke(insights.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$invoke$lambda$5$lambda$4$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        final AdvisoryInsight advisoryInsight = (AdvisoryInsight) insights.get(i);
                                        composer.startReplaceGroup(-363449004);
                                        final RemoteIcon remoteIcon = advisoryInsight.getContentViewModel().getDashboardHighlight().getRemoteIcon();
                                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(advisoryInsight.getContentViewModel().getIconName());
                                        if (serverToBentoAssetMapper2FromServerValue == null || serverToBentoAssetMapper2FromServerValue == ServerToBentoAssetMapper2.UNKNOWN) {
                                            serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.SPARKLE_DOUBLE_24;
                                        }
                                        final ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = serverToBentoAssetMapper2FromServerValue;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(advisoryInsightsHubViewState) | composer.changedInstance(advisoryInsight);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            final Navigator navigator2 = navigator;
                                            final Context context2 = context;
                                            final AdvisoryInsightsHubViewState advisoryInsightsHubViewState2 = advisoryInsightsHubViewState;
                                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    Navigator navigator3 = navigator2;
                                                    Context context3 = context2;
                                                    String accountNumber = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState2).getAccountNumber();
                                                    InsightNavArg insightNavArg = new InsightNavArg(advisoryInsight.getId(), advisoryInsight.getPageType());
                                                    ImmutableList<AdvisoryInsight> insights2 = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState2).getInsights();
                                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(insights2, 10));
                                                    for (AdvisoryInsight advisoryInsight2 : insights2) {
                                                        arrayList.add(new InsightNavArg(advisoryInsight2.getId(), advisoryInsight2.getPageType()));
                                                    }
                                                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator3, context3, new AdvisoryInsightDetailKey(accountNumber, insightNavArg, arrayList), false, false, false, false, null, true, null, null, 892, null);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, advisoryInsight.getContentViewModel().getContentfulId(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                                        float f = 4;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierAutoLogEvents$default, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(24), 0.0f, 10, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.DOT_16);
                                        long jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer.changedInstance(advisoryInsight);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<ContentDrawScope, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                                    invoke2(contentDrawScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(ContentDrawScope drawWithContent) {
                                                    Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                                                    if (advisoryInsight.isSeen()) {
                                                        return;
                                                    }
                                                    drawWithContent.drawContent();
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size16, "", jM21456getPositive0d7_KjU, DrawModifierKt.drawWithContent(companion, (Function1) objRememberedValue2), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
                                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                                        final AdvisoryInsightsHubViewState advisoryInsightsHubViewState3 = advisoryInsightsHubViewState;
                                        final ImageLoader imageLoader2 = imageLoader;
                                        BentoBaseRowLayout.BentoBaseRowLayout(modifierM5146paddingqDBjuR0$default2, null, ComposableLambda3.rememberComposableLambda(1000325119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$2
                                            public final void invoke(Composer composer2, int i4) {
                                                long jM21425getFg0d7_KjU;
                                                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1000325119, i4, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:208)");
                                                }
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                Modifier modifierClip = Clip.clip(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(48)), RoundedCornerShape2.getCircleShape());
                                                composer2.startReplaceGroup(-760222566);
                                                Brush insightIconGradientBackgroundBrush = ((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState3).getUseGradientStyling() ? InsightIconGradientBackground.getInsightIconGradientBackgroundBrush() : new SolidColor(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21372getBg20d7_KjU(), null);
                                                composer2.endReplaceGroup();
                                                Modifier modifierBackground$default = Background3.background$default(modifierClip, insightIconGradientBackgroundBrush, null, 0.0f, 6, null);
                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                RemoteIcon remoteIcon2 = remoteIcon;
                                                ImageLoader imageLoader3 = imageLoader2;
                                                ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                                                AdvisoryInsightsHubViewState advisoryInsightsHubViewState4 = advisoryInsightsHubViewState3;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierBackground$default);
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor2);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                if (remoteIcon2 != null) {
                                                    composer2.startReplaceGroup(713137743);
                                                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getIsDay() ? remoteIcon2.getLightUrl() : remoteIcon2.getDarkUrl(), imageLoader3, null, null, ContentScale.INSTANCE.getFit(), 0, null, composer2, 24576, 108), (String) null, Clip.clip(companion3, RoundedCornerShape2.getCircleShape()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer2.startReplaceGroup(714206003);
                                                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper22);
                                                    if (((AdvisoryInsightsHubViewState.Loaded) advisoryInsightsHubViewState4).getUseGradientStyling()) {
                                                        composer2.startReplaceGroup(714518235);
                                                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getNova();
                                                        composer2.endReplaceGroup();
                                                    } else {
                                                        composer2.startReplaceGroup(714664989);
                                                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                        composer2.endReplaceGroup();
                                                    }
                                                    BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                                                    composer2.endReplaceGroup();
                                                }
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }
                                        }, composer, 54), ComposableLambda3.rememberComposableLambda(1873860766, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i4) {
                                                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1873860766, i4, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:249)");
                                                }
                                                String topLineText = advisoryInsight.getContentViewModel().getDashboardHighlight().getTopLineText();
                                                if (topLineText == null) {
                                                    topLineText = LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(advisoryInsight.getCreateAt(), null, 1, null));
                                                }
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i5 = BentoTheme.$stable;
                                                BentoText2.m20747BentoText38GnDrw(topLineText, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 0, 0, 8186);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), ComposableLambda3.rememberComposableLambda(-1547570883, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreenKt$AdvisoryInsightsHubScreen$2$1$1$1$1$1$2$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i4) {
                                                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1547570883, i4, -1, "com.robinhood.android.advisory.insights.hub.AdvisoryInsightsHubScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightsHubScreen.kt:259)");
                                                }
                                                String title = advisoryInsight.getContentViewModel().getDashboardHighlight().getTitle();
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i5 = BentoTheme.$stable;
                                                TextStyle textM = bentoTheme.getTypography(composer2, i5).getTextM();
                                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                                                BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM, composer2, 817889280, 0, 7546);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), null, null, true, false, true, null, composer, 817917318, 0, 1378);
                                        composer.endNode();
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54), composer3, 3072, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
