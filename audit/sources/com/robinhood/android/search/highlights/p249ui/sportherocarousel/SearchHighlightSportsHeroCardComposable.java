package com.robinhood.android.search.highlights.p249ui.sportherocarousel;

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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.SearchHighlightSportsHeroCardDuxo;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.content.SearchHighlightsSportsHeroCardDefaultContent;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.content.SearchHighlightsSportsHeroCardLoadingContent;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.content.SearchHighlightsSportsHeroCardUpcomingContent;
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
import kotlin.NoWhenBranchMatchedException;
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
import search_coprocessor.p542v1.SportEventHeroDetailsDto;

/* compiled from: SearchHighlightSportsHeroCardComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m3636d2 = {"SearchHighlightSportsHeroCardComposable", "", "carouselId", "", "eventId", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardDuxo;Landroidx/compose/runtime/Composer;II)V", "HeroCardLoadedContent", "viewState", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;", "(Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;Landroidx/compose/runtime/Composer;I)V", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightSportsHeroCardComposable {

    /* compiled from: SearchHighlightSportsHeroCardComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportEventHeroDetailsDto.EventStatusDto.values().length];
            try {
                iArr[SportEventHeroDetailsDto.EventStatusDto.UPCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportEventHeroDetailsDto.EventStatusDto.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportEventHeroDetailsDto.EventStatusDto.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportEventHeroDetailsDto.EventStatusDto.EVENT_STATUS_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroCardLoadedContent$lambda$12(SearchHighlightSportsHeroCardViewState searchHighlightSportsHeroCardViewState, int i, Composer composer, int i2) {
        HeroCardLoadedContent(searchHighlightSportsHeroCardViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightSportsHeroCardComposable$lambda$9(String str, String str2, Modifier modifier, SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo, int i, int i2, Composer composer, int i3) {
        SearchHighlightSportsHeroCardComposable(str, str2, modifier, searchHighlightSportsHeroCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightSportsHeroCardComposable$lambda$7$lambda$6(String str, EventLogger eventLogger, String str2, Navigator navigator, Context context) {
        UUID uuid;
        try {
            uuid = StringsKt.toUuid(str);
        } catch (IllegalArgumentException unused) {
            uuid = null;
        }
        UUID uuid2 = uuid;
        if (uuid2 != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), new Component(null, "RD_SEARCH_SPORT_HERO_CAROUSEL_" + str2 + "_" + str, null, 5, null), null, null, false, 57, null);
            Navigator.DefaultImpls.showFragment$default(navigator, context, new EventDetailRoutingFragmentKey(uuid2, EcUuidType.EVENT_ID, SearchHighlightsAnalytics.SEARCH_HIGHLIGHTS_ENTRYPOINT, false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0296  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightSportsHeroCardComposable(final String carouselId, final String eventId, Modifier modifier, SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo2;
        int i4;
        Composer composer2;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i6;
        Modifier modifier3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer3;
        final EventLogger current;
        final Navigator navigator;
        final Context context;
        int i7;
        Object objRememberedValue2;
        ?? r13;
        Modifier modifier4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo3;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Composer composerStartRestartGroup = composer.startRestartGroup(812924263);
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
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    searchHighlightSportsHeroCardDuxo2 = searchHighlightSportsHeroCardDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(searchHighlightSportsHeroCardDuxo2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    searchHighlightSportsHeroCardDuxo2 = searchHighlightSportsHeroCardDuxo;
                }
                i3 |= i9;
            } else {
                searchHighlightSportsHeroCardDuxo2 = searchHighlightSportsHeroCardDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        SearchHighlightSportsHeroCardDuxo.InitialArgs initialArgs = new SearchHighlightSportsHeroCardDuxo.InitialArgs(eventId, carouselId);
                        String str = "SearchHighlightSportsHeroCard_" + carouselId + "_" + eventId;
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initialArgs)));
                        i4 = 0;
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SearchHighlightSportsHeroCardDuxo.class), current2, str, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$SearchHighlightSportsHeroCardComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$SearchHighlightSportsHeroCardComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        i5 = i3 & (-7169);
                        searchHighlightSportsHeroCardDuxo2 = (SearchHighlightSportsHeroCardDuxo) baseDuxo;
                    } else {
                        i4 = 0;
                        composer2 = composerStartRestartGroup;
                        i5 = i3;
                    }
                    modifier2 = modifier6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    i4 = 0;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812924263, i5, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposable (SearchHighlightSportsHeroCardComposable.kt:46)");
                }
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(searchHighlightSportsHeroCardDuxo2);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable$lambda$2$lambda$1(searchHighlightSportsHeroCardDuxo2, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                i6 = i4;
                Composer composer4 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(eventId, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer4, (i5 >> 3) & 14, 2);
                modifier3 = modifier2;
                SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo4 = searchHighlightSportsHeroCardDuxo2;
                int i10 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(searchHighlightSportsHeroCardDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(14));
                navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer3.startReplaceGroup(-463805192);
                float fMo5013toDpu2uoSUM = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                composer3.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                Modifier modifierBackground$default = Background3.background$default(BorderKt.m4876borderxT4_qwU(Clip.clip(SizeKt.m5174width3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM - C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer3, i11).m21592getMediumD9Ej5fM() * 2))), roundedCornerShapeM5327RoundedCornerShape0680j_4), C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer3, i11).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), UtilsKt.backgroundGradient(composer3, i6), roundedCornerShapeM5327RoundedCornerShape0680j_4, 0.0f, 4, null);
                composer3.startReplaceGroup(-1224400529);
                i7 = ((i10 & 112) != 32 ? 1 : i6) | (composer3.changedInstance(current) ? 1 : 0) | ((i10 & 14) != 4 ? 1 : i6) | (composer3.changedInstance(navigator) ? 1 : 0) | (composer3.changedInstance(context) ? 1 : 0);
                objRememberedValue2 = composer3.rememberedValue();
                if (i7 == 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    r13 = i6;
                    modifier4 = modifier3;
                    Object obj = new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable$lambda$7$lambda$6(eventId, current, carouselId, navigator, context);
                        }
                    };
                    composer3.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                } else {
                    modifier4 = modifier3;
                    r13 = i6;
                }
                composer3.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierBackground$default, false, null, null, (Function0) objRememberedValue2, 7, null), null, false, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r13);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, r13);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (SearchHighlightSportsHeroCardComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getLoading()) {
                    composer3.startReplaceGroup(2147306973);
                    HeroCardLoadedContent(SearchHighlightSportsHeroCardComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle), composer3, r13);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(2147231643);
                    SearchHighlightsSportsHeroCardLoadingContent.SearchHighlightsSportsHeroCardLoadingContent(null, composer3, r13, 1);
                    composer3.endReplaceGroup();
                }
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                searchHighlightSportsHeroCardDuxo3 = searchHighlightSportsHeroCardDuxo4;
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                searchHighlightSportsHeroCardDuxo3 = searchHighlightSportsHeroCardDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable$lambda$9(carouselId, eventId, modifier5, searchHighlightSportsHeroCardDuxo3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
                if (i8 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                modifier2 = modifier6;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(searchHighlightSportsHeroCardDuxo2);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable$lambda$2$lambda$1(searchHighlightSportsHeroCardDuxo2, (LifecycleResumePauseEffectScope) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    i6 = i4;
                    Composer composer42 = composer2;
                    LifecycleEffectKt.LifecycleResumeEffect(eventId, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer42, (i5 >> 3) & 14, 2);
                    modifier3 = modifier2;
                    SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo42 = searchHighlightSportsHeroCardDuxo2;
                    int i102 = i5;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(searchHighlightSportsHeroCardDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(14));
                    navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composer3.startReplaceGroup(-463805192);
                    float fMo5013toDpu2uoSUM2 = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                    composer3.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i112 = BentoTheme.$stable;
                    Modifier modifierBackground$default2 = Background3.background$default(BorderKt.m4876borderxT4_qwU(Clip.clip(SizeKt.m5174width3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM2 - C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer3, i112).m21592getMediumD9Ej5fM() * 2))), roundedCornerShapeM5327RoundedCornerShape0680j_42), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer3, i112).m21373getBg30d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_42), UtilsKt.backgroundGradient(composer3, i6), roundedCornerShapeM5327RoundedCornerShape0680j_42, 0.0f, 4, null);
                    composer3.startReplaceGroup(-1224400529);
                    i7 = ((i102 & 112) != 32 ? 1 : i6) | (composer3.changedInstance(current) ? 1 : 0) | ((i102 & 14) != 4 ? 1 : i6) | (composer3.changedInstance(navigator) ? 1 : 0) | (composer3.changedInstance(context) ? 1 : 0);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (i7 == 0) {
                        r13 = i6;
                        modifier4 = modifier3;
                        Object obj2 = new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SearchHighlightSportsHeroCardComposable.SearchHighlightSportsHeroCardComposable$lambda$7$lambda$6(eventId, current, carouselId, navigator, context);
                            }
                        };
                        composer3.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                        composer3.endReplaceGroup();
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierBackground$default2, false, null, null, (Function0) objRememberedValue2, 7, null), null, false, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r13);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, r13);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            if (SearchHighlightSportsHeroCardComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getLoading()) {
                            }
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            searchHighlightSportsHeroCardDuxo3 = searchHighlightSportsHeroCardDuxo42;
                            modifier5 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult SearchHighlightSportsHeroCardComposable$lambda$2$lambda$1(SearchHighlightSportsHeroCardDuxo searchHighlightSportsHeroCardDuxo, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = searchHighlightSportsHeroCardDuxo.bind();
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$SearchHighlightSportsHeroCardComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final SearchHighlightSportsHeroCardViewState SearchHighlightSportsHeroCardComposable$lambda$3(SnapshotState4<SearchHighlightSportsHeroCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final void HeroCardLoadedContent(final SearchHighlightSportsHeroCardViewState searchHighlightSportsHeroCardViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1906522706);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(searchHighlightSportsHeroCardViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1906522706, i2, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.HeroCardLoadedContent (SearchHighlightSportsHeroCardComposable.kt:108)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[searchHighlightSportsHeroCardViewState.getEventStatus().ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-570209493);
                SearchHighlightsSportsHeroCardUpcomingContent.SearchHighlightsSportsHeroCardUpcoming(searchHighlightSportsHeroCardViewState, null, composerStartRestartGroup, i2 & 14, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2 || i3 == 3) {
                composerStartRestartGroup.startReplaceGroup(-570008923);
                SearchHighlightsSportsHeroCardDefaultContent.SearchHighlightsSportsHeroCardDefaultContent(searchHighlightSportsHeroCardViewState, null, composerStartRestartGroup, i2 & 14, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 4) {
                    composerStartRestartGroup.startReplaceGroup(1782718981);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-569854171);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.SearchHighlightSportsHeroCardComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchHighlightSportsHeroCardComposable.HeroCardLoadedContent$lambda$12(searchHighlightSportsHeroCardViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
