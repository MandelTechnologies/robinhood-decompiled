package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import search_coprocessor.p542v1.SportsHeroCarouselDto;

/* compiled from: SearchHighlightSportsHeroSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"SearchHighlightSportsHeroSection", "", "sportsHeroCarousel", "Lsearch_coprocessor/v1/SportsHeroCarouselDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lsearch_coprocessor/v1/SportsHeroCarouselDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightSportsHeroSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightSportsHeroSection$lambda$3(SportsHeroCarouselDto sportsHeroCarouselDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchHighlightSportsHeroSection(sportsHeroCarouselDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightSportsHeroSection(final SportsHeroCarouselDto sportsHeroCarousel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(sportsHeroCarousel, "sportsHeroCarousel");
        Composer composerStartRestartGroup = composer.startRestartGroup(520887690);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sportsHeroCarousel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(520887690, i3, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSection (SearchHighlightSportsHeroSection.kt:25)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(sportsHeroCarousel);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(SearchHighlightSportsHeroSection.SearchHighlightSportsHeroSection$lambda$1$lambda$0(sportsHeroCarousel));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                String id = sportsHeroCarousel.getId();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(id);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), null, null, new Component(null, "RD_SEARCH_SPORT_HERO_CAROUSEL_" + sportsHeroCarousel.getId(), null, 5, null), null, 45, null);
                    composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor);
                    objRememberedValue2 = userInteractionEventDescriptor;
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                CompositionLocal3.CompositionLocalProvider(LiveStatusIcon5.getLocalLiveStatusIconAnimation().provides(LiveStatusIcon5.rememberLiveStatusIconAnimation(composerStartRestartGroup, 0)), ComposableLambda3.rememberComposableLambda(-1548287798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt.SearchHighlightSportsHeroSection.1
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
                            ComposerKt.traceEventStart(-1548287798, i5, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSection.<anonymous> (SearchHighlightSportsHeroSection.kt:41)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), userInteractionEventDescriptor2, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        PagerState pagerState = pagerStateRememberPagerState;
                        Modifier modifier4 = modifier3;
                        final SportsHeroCarouselDto sportsHeroCarouselDto = sportsHeroCarousel;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifier4, PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, 0, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1359847923, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt$SearchHighlightSportsHeroSection$1$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PagerScope HorizontalPager, int i7, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1359847923, i8, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSection.<anonymous>.<anonymous>.<anonymous> (SearchHighlightSportsHeroSection.kt:54)");
                                }
                                String str = (String) CollectionsKt.getOrNull(sportsHeroCarouselDto.getEvent_ids(), i7);
                                if (str == null) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable(sportsHeroCarouselDto.getId(), str, null, null, composer3, 0, 12);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }, composer2, 54), composer2, 24576, 24576, 16328);
                        UtilsKt.SpacerAfterCarousel(composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchHighlightSportsHeroSection.SearchHighlightSportsHeroSection$lambda$3(sportsHeroCarousel, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(sportsHeroCarousel);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(SearchHighlightSportsHeroSection.SearchHighlightSportsHeroSection$lambda$1$lambda$0(sportsHeroCarousel));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                final PagerState pagerStateRememberPagerState2 = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                String id2 = sportsHeroCarousel.getId();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(id2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor3 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), null, null, new Component(null, "RD_SEARCH_SPORT_HERO_CAROUSEL_" + sportsHeroCarousel.getId(), null, 5, null), null, 45, null);
                    composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor3);
                    objRememberedValue2 = userInteractionEventDescriptor3;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    CompositionLocal3.CompositionLocalProvider(LiveStatusIcon5.getLocalLiveStatusIconAnimation().provides(LiveStatusIcon5.rememberLiveStatusIconAnimation(composerStartRestartGroup, 0)), ComposableLambda3.rememberComposableLambda(-1548287798, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt.SearchHighlightSportsHeroSection.1
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
                                ComposerKt.traceEventStart(-1548287798, i5, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSection.<anonymous> (SearchHighlightSportsHeroSection.kt:41)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), userInteractionEventDescriptor22, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            PagerState pagerState = pagerStateRememberPagerState2;
                            Modifier modifier4 = modifier3;
                            final SportsHeroCarouselDto sportsHeroCarouselDto = sportsHeroCarousel;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifier4, PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, 0, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1359847923, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSectionKt$SearchHighlightSportsHeroSection$1$1$1
                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PagerScope HorizontalPager, int i7, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1359847923, i8, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroSection.<anonymous>.<anonymous>.<anonymous> (SearchHighlightSportsHeroSection.kt:54)");
                                    }
                                    String str = (String) CollectionsKt.getOrNull(sportsHeroCarouselDto.getEvent_ids(), i7);
                                    if (str == null) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable(sportsHeroCarouselDto.getId(), str, null, null, composer3, 0, 12);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }
                            }, composer2, 54), composer2, 24576, 24576, 16328);
                            UtilsKt.SpacerAfterCarousel(composer2, 0);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SearchHighlightSportsHeroSection$lambda$1$lambda$0(SportsHeroCarouselDto sportsHeroCarouselDto) {
        return sportsHeroCarouselDto.getEvent_ids().size();
    }
}
