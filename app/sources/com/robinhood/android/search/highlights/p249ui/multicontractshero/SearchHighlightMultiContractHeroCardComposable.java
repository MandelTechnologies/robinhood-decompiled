package com.robinhood.android.search.highlights.p249ui.multicontractshero;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.android.search.highlights.p249ui.multicontractshero.SearchHighlightMultiContractHeroCardDuxo;
import com.robinhood.android.search.highlights.util.SearchHighlightsAnalytics;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: SearchHighlightMultiContractHeroCardComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a.\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"SearchHighlightMultiContractHeroCardComposable", "", "carouselId", "", "eventId", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardDuxo;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardDuxo;Landroidx/compose/runtime/Composer;II)V", "openTradeView", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "lib-search-highlights_externalDebug", "viewState", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightMultiContractHeroCardComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMultiContractHeroCardComposable$lambda$10(String str, String str2, Modifier modifier, SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo, int i, int i2, Composer composer, int i3) {
        SearchHighlightMultiContractHeroCardComposable(str, str2, modifier, searchHighlightMultiContractHeroCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightMultiContractHeroCardComposable(final String carouselId, final String eventId, Modifier modifier, SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo2;
        boolean z;
        int i4;
        Modifier modifier3;
        final SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Navigator navigator;
        final Context context;
        EventLogger current;
        boolean z2;
        Object obj;
        Modifier modifier4;
        final EventLogger eventLogger;
        final Navigator navigator2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1632455653);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(carouselId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(eventId) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    searchHighlightMultiContractHeroCardDuxo2 = searchHighlightMultiContractHeroCardDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(searchHighlightMultiContractHeroCardDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    searchHighlightMultiContractHeroCardDuxo2 = searchHighlightMultiContractHeroCardDuxo;
                }
                i3 |= i6;
            } else {
                searchHighlightMultiContractHeroCardDuxo2 = searchHighlightMultiContractHeroCardDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) == 0) {
                        SearchHighlightMultiContractHeroCardDuxo.InitialArgs initialArgs = new SearchHighlightMultiContractHeroCardDuxo.InitialArgs(eventId, carouselId);
                        String str = "SearchHighlightMultiContractHeroCard_" + carouselId + "_" + eventId;
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initialArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SearchHighlightMultiContractHeroCardDuxo.class), current2, str, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$SearchHighlightMultiContractHeroCardComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$SearchHighlightMultiContractHeroCardComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-7169);
                        searchHighlightMultiContractHeroCardDuxo3 = (SearchHighlightMultiContractHeroCardDuxo) baseDuxo;
                    } else {
                        z = false;
                        i4 = i3;
                        modifier3 = modifier2;
                        searchHighlightMultiContractHeroCardDuxo3 = searchHighlightMultiContractHeroCardDuxo2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1632455653, i4, -1, "com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposable (SearchHighlightMultiContractHeroCardComposable.kt:45)");
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(searchHighlightMultiContractHeroCardDuxo3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SearchHighlightMultiContractHeroCardComposable.SearchHighlightMultiContractHeroCardComposable$lambda$2$lambda$1(searchHighlightMultiContractHeroCardDuxo3, (LifecycleResumePauseEffectScope) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z3 = z;
                        LifecycleEffectKt.LifecycleResumeEffect(eventId, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, (i4 >> 3) & 14, 2);
                        searchHighlightMultiContractHeroCardDuxo2 = searchHighlightMultiContractHeroCardDuxo3;
                        int i7 = i4;
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(searchHighlightMultiContractHeroCardDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(14));
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        composerStartRestartGroup.startReplaceGroup(1126846326);
                        float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierBackground$default = Background3.background$default(BorderKt.m4876borderxT4_qwU(Clip.clip(SizeKt.m5174width3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM - C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM() * 2))), roundedCornerShapeM5327RoundedCornerShape0680j_4), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), UtilsKt.backgroundGradient(composerStartRestartGroup, z3 ? 1 : 0), roundedCornerShapeM5327RoundedCornerShape0680j_4, 0.0f, 4, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        int i9 = i7 & 14;
                        int i10 = i7 & 112;
                        z2 = zChangedInstance3 | (i9 != 4 ? true : z3 ? 1 : 0) | (i10 != 32 ? true : z3 ? 1 : 0);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            modifier4 = modifier3;
                            eventLogger = current;
                            navigator2 = navigator;
                            obj = new Function0() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchHighlightMultiContractHeroCardComposable.SearchHighlightMultiContractHeroCardComposable$lambda$6$lambda$5(eventLogger, navigator2, context, carouselId, eventId);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(obj);
                        } else {
                            obj = objRememberedValue3;
                            modifier4 = modifier3;
                            eventLogger = current;
                            navigator2 = navigator;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierBackground$default, false, null, null, (Function0) obj, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z3);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, z3 ? 1 : 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (SearchHighlightMultiContractHeroCardComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getLoading()) {
                            composerStartRestartGroup.startReplaceGroup(-1293349047);
                            SearchHighlightMultiContractHeroCardViewState searchHighlightMultiContractHeroCardViewStateSearchHighlightMultiContractHeroCardComposable$lambda$3 = SearchHighlightMultiContractHeroCardComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(navigator2) | composerStartRestartGroup.changedInstance(context) | (i9 == 4) | (i10 == 32);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                Object obj2 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SearchHighlightMultiContractHeroCardComposable.m2465x68190da9(eventLogger, navigator2, context, carouselId, eventId);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(obj2);
                                objRememberedValue4 = obj2;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SearchHighlightsMultiContractHeroCardContent.SearchHighlightsMultiContractHeroCardContent(searchHighlightMultiContractHeroCardViewStateSearchHighlightMultiContractHeroCardComposable$lambda$3, (Function0) objRememberedValue4, null, composerStartRestartGroup, 0, 4);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1293436746);
                            SearchHighlightsMultiContractHeroCardLoadingContent.SearchHighlightsMultiContractHeroCardLoadingContent(null, composerStartRestartGroup, 0, 1);
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup = composerStartRestartGroup;
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    searchHighlightMultiContractHeroCardDuxo3 = searchHighlightMultiContractHeroCardDuxo2;
                    z = false;
                    i4 = i3;
                }
                modifier3 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(searchHighlightMultiContractHeroCardDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            return SearchHighlightMultiContractHeroCardComposable.SearchHighlightMultiContractHeroCardComposable$lambda$2$lambda$1(searchHighlightMultiContractHeroCardDuxo3, (LifecycleResumePauseEffectScope) obj22);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z32 = z;
                    LifecycleEffectKt.LifecycleResumeEffect(eventId, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, (i4 >> 3) & 14, 2);
                    searchHighlightMultiContractHeroCardDuxo2 = searchHighlightMultiContractHeroCardDuxo3;
                    int i72 = i4;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(searchHighlightMultiContractHeroCardDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(14));
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    composerStartRestartGroup.startReplaceGroup(1126846326);
                    float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i82 = BentoTheme.$stable;
                    Modifier modifierBackground$default2 = Background3.background$default(BorderKt.m4876borderxT4_qwU(Clip.clip(SizeKt.m5174width3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM2 - C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM() * 2))), roundedCornerShapeM5327RoundedCornerShape0680j_42), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i82).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_42), UtilsKt.backgroundGradient(composerStartRestartGroup, z32 ? 1 : 0), roundedCornerShapeM5327RoundedCornerShape0680j_42, 0.0f, 4, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance32 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    int i92 = i72 & 14;
                    int i102 = i72 & 112;
                    z2 = zChangedInstance32 | (i92 != 4 ? true : z32 ? 1 : 0) | (i102 != 32 ? true : z32 ? 1 : 0);
                    Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                        modifier4 = modifier3;
                        eventLogger = current;
                        navigator2 = navigator;
                        obj = new Function0() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchHighlightMultiContractHeroCardComposable.SearchHighlightMultiContractHeroCardComposable$lambda$6$lambda$5(eventLogger, navigator2, context, carouselId, eventId);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierBackground$default2, false, null, null, (Function0) obj, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z32);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, z32 ? 1 : 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            if (SearchHighlightMultiContractHeroCardComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getLoading()) {
                            }
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier5 = modifier4;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            final SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo4 = searchHighlightMultiContractHeroCardDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return SearchHighlightMultiContractHeroCardComposable.SearchHighlightMultiContractHeroCardComposable$lambda$10(carouselId, eventId, modifier5, searchHighlightMultiContractHeroCardDuxo4, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        final SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo42 = searchHighlightMultiContractHeroCardDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult SearchHighlightMultiContractHeroCardComposable$lambda$2$lambda$1(SearchHighlightMultiContractHeroCardDuxo searchHighlightMultiContractHeroCardDuxo, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = searchHighlightMultiContractHeroCardDuxo.bind();
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.search.highlights.ui.multicontractshero.SearchHighlightMultiContractHeroCardComposableKt$SearchHighlightMultiContractHeroCardComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightMultiContractHeroCardComposable$lambda$6$lambda$5(EventLogger eventLogger, Navigator navigator, Context context, String str, String str2) {
        openTradeView(eventLogger, navigator, context, str, str2);
        return Unit.INSTANCE;
    }

    private static final SearchHighlightMultiContractHeroCardViewState SearchHighlightMultiContractHeroCardComposable$lambda$3(SnapshotState4<SearchHighlightMultiContractHeroCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SearchHighlightMultiContractHeroCardComposable$lambda$9$lambda$8$lambda$7 */
    public static final Unit m2465x68190da9(EventLogger eventLogger, Navigator navigator, Context context, String str, String str2) {
        openTradeView(eventLogger, navigator, context, str, str2);
        return Unit.INSTANCE;
    }

    public static final void openTradeView(EventLogger eventLogger, Navigator navigator, Context context, String carouselId, String eventId) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), new Component(null, "RD_SEARCH_MULTI_CONTRACTS_CAROUSEL_" + carouselId + "_" + eventId, null, 5, null), null, null, false, 57, null);
        try {
            uuid = StringsKt.toUuid(eventId);
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        UUID uuid2 = uuid;
        if (uuid2 != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new EventDetailRoutingFragmentKey(uuid2, EcUuidType.EVENT_ID, SearchHighlightsAnalytics.SEARCH_HIGHLIGHTS_ENTRYPOINT, false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
    }
}
