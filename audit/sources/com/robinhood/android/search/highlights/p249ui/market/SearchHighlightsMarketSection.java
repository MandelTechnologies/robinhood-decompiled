package com.robinhood.android.search.highlights.p249ui.market;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onedaycharts.OneDayMiniChart;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.android.search.highlights.p249ui.market.SearchHighlightMarketCardDuxo;
import com.robinhood.android.search.highlights.util.SearchHighlightNavigation;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import search_coprocessor.p542v1.AssetDto;
import search_coprocessor.p542v1.CompactIndiciesDto;

/* compiled from: SearchHighlightsMarketSection.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aA\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"SearchHighlightsMarketSection", "", "marketIndices", "Lsearch_coprocessor/v1/CompactIndiciesDto;", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lsearch_coprocessor/v1/CompactIndiciesDto;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SearchHighlightMarketCard", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lsearch_coprocessor/v1/AssetDto;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "marketSectionId", "duxo", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo;", "(Lsearch_coprocessor/v1/AssetDto;Ljava/lang/String;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Ljava/lang/String;Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-search-highlights_externalDebug", "viewState", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightsMarketSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMarketCard$lambda$10(AssetDto assetDto, String str, Navigator navigator, Context context, String str2, SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, int i, int i2, Composer composer, int i3) {
        SearchHighlightMarketCard(assetDto, str, navigator, context, str2, searchHighlightMarketCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMarketCard$lambda$14(AssetDto assetDto, String str, Navigator navigator, Context context, String str2, SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, int i, int i2, Composer composer, int i3) {
        SearchHighlightMarketCard(assetDto, str, navigator, context, str2, searchHighlightMarketCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsMarketSection$lambda$5(CompactIndiciesDto compactIndiciesDto, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchHighlightsMarketSection(compactIndiciesDto, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028c A[LOOP:0: B:81:0x0286->B:83:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightsMarketSection(final CompactIndiciesDto marketIndices, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        final Modifier modifier3;
        ScrollState scrollStateRememberScrollState;
        EventLogger current;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Iterator<T> it;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(marketIndices, "marketIndices");
        Composer composerStartRestartGroup = composer.startRestartGroup(1369065077);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(marketIndices) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
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
                    ComposerKt.traceEventStart(1369065077, i3, -1, "com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSection (SearchHighlightsMarketSection.kt:60)");
                }
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                String id = marketIndices.getId();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(id);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), null, null, new Component(null, "RD_SEARCH_MARKET_V2_" + marketIndices.getId(), null, 5, null), null, 45, null);
                    composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor);
                    objRememberedValue = userInteractionEventDescriptor;
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(marketIndices);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SearchHighlightsMarketSection3(scrollStateRememberScrollState, current, marketIndices, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierHeight = Intrinsic3.height(ScrollKt.horizontalScroll$default(ModifiersKt.autoLogEvents$default(companion3, userInteractionEventDescriptor2, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), scrollStateRememberScrollState, false, null, false, 14, null), Intrinsic4.Min);
                float f = 12;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f)), companion.getTop(), composerStartRestartGroup, 6);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-287581421);
                it = marketIndices.getAssets().iterator();
                while (it.hasNext()) {
                    SearchHighlightMarketCard((AssetDto) it.next(), str2, navigator, context, marketIndices.getId(), null, composerStartRestartGroup, i3 & 112, 32);
                    str2 = str;
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                UtilsKt.m18633SpacerRowkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchHighlightsMarketSection.SearchHighlightsMarketSection$lambda$5(marketIndices, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            String id2 = marketIndices.getId();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(id2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                UserInteractionEventDescriptor userInteractionEventDescriptor3 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), null, null, new Component(null, "RD_SEARCH_MARKET_V2_" + marketIndices.getId(), null, 5, null), null, 45, null);
                composerStartRestartGroup.updateRememberedValue(userInteractionEventDescriptor3);
                objRememberedValue = userInteractionEventDescriptor3;
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(marketIndices);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new SearchHighlightsMarketSection3(scrollStateRememberScrollState, current, marketIndices, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierHeight2 = Intrinsic3.height(ScrollKt.horizontalScroll$default(ModifiersKt.autoLogEvents$default(companion32, userInteractionEventDescriptor22, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), scrollStateRememberScrollState, false, null, false, 14, null), Intrinsic4.Min);
                        float f2 = 12;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f2)), companion4.getTop(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(-287581421);
                            it = marketIndices.getAssets().iterator();
                            while (it.hasNext()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endNode();
                            UtilsKt.m18633SpacerRowkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchHighlightMarketCardViewState SearchHighlightMarketCard$lambda$9(SnapshotState4<SearchHighlightMarketCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SearchHighlightMarketCard(AssetDto assetDto, final String str, final Navigator navigator, final Context context, final String str2, SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo2;
        Composer composer2;
        int i4;
        final SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        UUID uuid;
        ?? r15;
        boolean z;
        final SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final AssetDto assetDto2 = assetDto;
        Composer composerStartRestartGroup = composer.startRestartGroup(-610078086);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(assetDto2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(navigator) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(context) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        searchHighlightMarketCardDuxo2 = searchHighlightMarketCardDuxo;
                        int i5 = composerStartRestartGroup.changedInstance(searchHighlightMarketCardDuxo2) ? 131072 : 65536;
                        i3 |= i5;
                    } else {
                        searchHighlightMarketCardDuxo2 = searchHighlightMarketCardDuxo;
                    }
                    i3 |= i5;
                } else {
                    searchHighlightMarketCardDuxo2 = searchHighlightMarketCardDuxo;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    searchHighlightMarketCardDuxo4 = searchHighlightMarketCardDuxo2;
                    composer3 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 32) == 0) {
                            SearchHighlightMarketCardDuxo.InitialArgs initialArgs = new SearchHighlightMarketCardDuxo.InitialArgs(assetDto2.getId(), assetDto2.getAsset_type());
                            String str4 = "SearchHighlightMarketCard_" + assetDto2.getId();
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initialArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            composer2 = composerStartRestartGroup;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SearchHighlightMarketCardDuxo.class), current, str4, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                            composer2.endReplaceGroup();
                            i4 = i3 & (-458753);
                            searchHighlightMarketCardDuxo3 = (SearchHighlightMarketCardDuxo) baseDuxo;
                        } else {
                            composer2 = composerStartRestartGroup;
                            i4 = i3;
                            searchHighlightMarketCardDuxo3 = searchHighlightMarketCardDuxo2;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-610078086, i4, -1, "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCard (SearchHighlightsMarketSection.kt:123)");
                        }
                        String id = assetDto2.getId();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(searchHighlightMarketCardDuxo3);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SearchHighlightsMarketSection.SearchHighlightMarketCard$lambda$8$lambda$7(searchHighlightMarketCardDuxo3, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Composer composer4 = composer2;
                        LifecycleEffectKt.LifecycleResumeEffect(id, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer4, 0, 2);
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(searchHighlightMarketCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        composer3 = composer4;
                        try {
                            uuid = StringsKt.toUuid(assetDto2.getId());
                        } catch (IllegalArgumentException unused) {
                            uuid = null;
                        }
                        if (uuid != null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                final SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo5 = searchHighlightMarketCardDuxo3;
                                final String str5 = str3;
                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return SearchHighlightsMarketSection.SearchHighlightMarketCard$lambda$10(assetDto2, str5, navigator, context, str2, searchHighlightMarketCardDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo6 = searchHighlightMarketCardDuxo3;
                        final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                        final String strName = assetDto2.getAsset_type().name();
                        final String id2 = assetDto2.getId();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM());
                        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(Clip.clip(Modifier.INSTANCE, roundedCornerShapeM5327RoundedCornerShape0680j_4), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer3, i6).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), UtilsKt.backgroundForDayAndNight(composer3, 0), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChangedInstance3 = composer3.changedInstance(current2) | ((57344 & i4) == 16384) | composer3.changed(strName) | composer3.changed(id2) | composer3.changedInstance(assetDto2) | composer3.changedInstance(uuid) | ((i4 & 112) == 32) | composer3.changedInstance(navigator) | composer3.changedInstance(context);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final UUID uuid2 = uuid;
                            r15 = 0;
                            z = true;
                            Function0 function0 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchHighlightsMarketSection.SearchHighlightMarketCard$lambda$12$lambda$11(current2, str2, strName, id2, assetDto2, uuid2, str, navigator, context);
                                }
                            };
                            assetDto2 = assetDto2;
                            composer3.updateRememberedValue(function0);
                            objRememberedValue3 = function0;
                        } else {
                            r15 = 0;
                            z = true;
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4871backgroundbw27NRU, false, null, null, (Function0) objRememberedValue3, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r15);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, r15);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4893clickableXHw0xAI$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoThemeOverlays.DirectionThemeOverlay(SearchHighlightMarketCard$lambda$9(snapshotState4CollectAsStateWithLifecycle).getChartData().getColorDirection(), ComposableLambda3.rememberComposableLambda(-416792038, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$3$1
                            public final void invoke(Composer composer5, int i7) {
                                Modifier.Companion companion2;
                                float f;
                                Composer composer6 = composer5;
                                if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-416792038, i7, -1, "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCard.<anonymous>.<anonymous> (SearchHighlightsMarketSection.kt:164)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer6, i8).m21590getDefaultD9Ej5fM());
                                AssetDto assetDto3 = assetDto2;
                                SnapshotState4<SearchHighlightMarketCardViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer6, modifierM5142padding3ABfNKs);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composer6.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor2);
                                } else {
                                    composer6.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer6);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                SearchHighlightChartData chartData = SearchHighlightsMarketSection.SearchHighlightMarketCard$lambda$9(snapshotState4).getChartData();
                                String display_title = assetDto3.getDisplay_title();
                                if (display_title == null && (display_title = chartData.getDisplayName()) == null) {
                                    display_title = "";
                                }
                                BentoText2.m20747BentoText38GnDrw(display_title, com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion3, chartData.getLoading(), null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i8).getTextM(), composer6, 24576, 0, 8172);
                                composer6.startReplaceGroup(949162233);
                                if (chartData.getSubtitle() != null) {
                                    companion2 = companion3;
                                    BentoText2.m20747BentoText38GnDrw(chartData.getSubtitle(), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion3, chartData.getLoading(), null, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer6, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i8).getTextS(), composer6, 0, 0, 8184);
                                } else {
                                    companion2 = companion3;
                                }
                                composer6.endReplaceGroup();
                                float f2 = 12;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f2)), composer6, 6);
                                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(Clip.clipToBounds(companion2), chartData.getSubtitle() != null ? C2002Dp.m7995constructorimpl(44) : C2002Dp.m7995constructorimpl(64)), C2002Dp.m7995constructorimpl(108));
                                if (chartData.getOneDayMiniChartDetails() != null) {
                                    composer6.startReplaceGroup(-639741880);
                                    OneDayMiniChart.OneDayMiniChart(chartData.getOneDayMiniChartDetails(), modifierM5174width3ABfNKs, "SearchHighlightMarketCard", null, false, composer6, OneDayMiniChartDetails.$stable | 24960, 8);
                                    composer6.endReplaceGroup();
                                    f = f2;
                                } else {
                                    composer6.startReplaceGroup(-639422301);
                                    ImmutableList<ChartFill> fills = chartData.getFills();
                                    ImmutableList<Line> lines = chartData.getLines();
                                    ImmutableList<UIComponent<GenericAction>> overlays = chartData.getOverlays();
                                    SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer6, 0);
                                    boolean loading = chartData.getLoading();
                                    composer6.startReplaceGroup(977840936);
                                    composer6.startReplaceGroup(1849434622);
                                    Object objRememberedValue4 = composer6.rememberedValue();
                                    Composer.Companion companion5 = Composer.INSTANCE;
                                    if (objRememberedValue4 == companion5.getEmpty()) {
                                        objRememberedValue4 = new Function1<Point, Unit>() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$3$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Point it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Point point) {
                                                invoke2(point);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue4;
                                    composer6.endReplaceGroup();
                                    composer6.startReplaceGroup(1849434622);
                                    Object objRememberedValue5 = composer6.rememberedValue();
                                    if (objRememberedValue5 == companion5.getEmpty()) {
                                        objRememberedValue5 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$3$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$2
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list) {
                                                invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue5);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue5;
                                    composer6.endReplaceGroup();
                                    composer6.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composer6.rememberedValue();
                                    if (objRememberedValue6 == companion5.getEmpty()) {
                                        objRememberedValue6 = new Function0<Unit>() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$3$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$3
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue6);
                                    }
                                    composer6.endReplaceGroup();
                                    f = f2;
                                    SduiChartMappersKt.SduiSegmentedLineChart(modifierM5174width3ABfNKs, fills, lines, overlays, sduiActionHandlerCurrentActionHandler, function1, function12, (Function0) objRememberedValue6, loading, false, null, 0.01f, GenericAction.class, composer5, 805306368, 48, 0);
                                    composer6 = composer5;
                                    composer6.endReplaceGroup();
                                    composer6.endReplaceGroup();
                                }
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composer6, 6);
                                if (chartData.getLoading() || chartData.getAssetQuote() == null) {
                                    composer6.startReplaceGroup(-638738751);
                                    SearchHighlightMarketPerformance.SearchHighlightMarketPerformancePlaceHolder(null, composer6, 0, 1);
                                    composer6.endReplaceGroup();
                                } else {
                                    composer6.startReplaceGroup(-638612643);
                                    SearchHighlightMarketPerformance.SearchHighlightMarketPerformanceByQuote(chartData.getAssetQuote(), companion2, composer6, 48, 0);
                                    composer6.endReplaceGroup();
                                }
                                composer6.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 48);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        searchHighlightMarketCardDuxo4 = searchHighlightMarketCardDuxo6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i4 = i3 & (-458753);
                            searchHighlightMarketCardDuxo3 = searchHighlightMarketCardDuxo2;
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String id3 = assetDto2.getId();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(searchHighlightMarketCardDuxo3);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SearchHighlightsMarketSection.SearchHighlightMarketCard$lambda$8$lambda$7(searchHighlightMarketCardDuxo3, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceGroup();
                            Composer composer42 = composer2;
                            LifecycleEffectKt.LifecycleResumeEffect(id3, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer42, 0, 2);
                            final SnapshotState4<SearchHighlightMarketCardViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(searchHighlightMarketCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                            composer3 = composer42;
                            uuid = StringsKt.toUuid(assetDto2.getId());
                            if (uuid != null) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SearchHighlightsMarketSection.SearchHighlightMarketCard$lambda$14(assetDto2, str, navigator, context, str2, searchHighlightMarketCardDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 32) == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    String id32 = assetDto2.getId();
                    composer2.startReplaceGroup(5004770);
                    zChangedInstance = composer2.changedInstance(searchHighlightMarketCardDuxo3);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult SearchHighlightMarketCard$lambda$8$lambda$7(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = searchHighlightMarketCardDuxo.bind();
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightsMarketSectionKt$SearchHighlightMarketCard$lambda$8$lambda$7$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMarketCard$lambda$12$lambda$11(EventLogger eventLogger, String str, String str2, String str3, AssetDto assetDto, UUID uuid, String str4, Navigator navigator, Context context) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), new Component(null, "RD_SEARCH_MARKET_V2_" + str + "_" + str2 + "_" + str3, null, 5, null), null, null, false, 57, null);
        SearchHighlightNavigation.navigateToDetailPage(assetDto, uuid, str4, navigator, context);
        return Unit.INSTANCE;
    }
}
