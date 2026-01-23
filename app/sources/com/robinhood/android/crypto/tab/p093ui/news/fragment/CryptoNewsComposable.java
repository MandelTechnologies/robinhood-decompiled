package com.robinhood.android.crypto.tab.p093ui.news.fragment;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.crypto.tab.util.CryptoNewsArticle;
import com.robinhood.android.crypto.tab.view.CryptoNewsArticleComposable;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.extensions.LoggedCustomTabs2;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.EducationLessonPreviews;
import com.robinhood.shared.education.p377ui.EducationSeriesLessonsCarousel5;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoNewsComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u008a\u0084\u0002"}, m3636d2 = {"ANALYTICS_PREFIX", "", "CryptoNewsComposable", "", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo;", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoEducationCarouselComposable", "educationCarousel", "Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;", "(Lcom/robinhood/android/newsfeed/model/Element$EducationCarousel;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsViewState;", "articles", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoNewsComposable {
    private static final String ANALYTICS_PREFIX = "crypto_news";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoEducationCarouselComposable$lambda$16(Element.EducationCarousel educationCarousel, int i, Composer composer, int i2) {
        CryptoEducationCarouselComposable(educationCarousel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoNewsComposable$lambda$11(LoggedCustomTabs loggedCustomTabs, Modifier modifier, CryptoNewsDuxo cryptoNewsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoNewsComposable(loggedCustomTabs, modifier, cryptoNewsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoNewsComposable(final LoggedCustomTabs loggedCustomTabs, Modifier modifier, CryptoNewsDuxo cryptoNewsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoNewsDuxo cryptoNewsDuxo2;
        int i4;
        Composer composer2;
        Modifier modifier3;
        int i5;
        final CryptoNewsDuxo cryptoNewsDuxo3;
        Composer composer3;
        boolean zChanged;
        int i6;
        Composer composer4;
        final CryptoNewsDuxo cryptoNewsDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(1903715299);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(loggedCustomTabs) : composerStartRestartGroup.changedInstance(loggedCustomTabs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoNewsDuxo2 = cryptoNewsDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(cryptoNewsDuxo2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    cryptoNewsDuxo2 = cryptoNewsDuxo;
                }
                i3 |= i8;
            } else {
                cryptoNewsDuxo2 = cryptoNewsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoNewsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        Composer composer5 = composerStartRestartGroup;
                        composer5.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer5.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer5.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer5.changedInstance(baseDuxo) | composer5.changedInstance(lifecycle);
                        Object objRememberedValue = composer5.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue);
                        }
                        composer5.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer5, 0);
                        composer5.endReplaceGroup();
                        cryptoNewsDuxo2 = (CryptoNewsDuxo) baseDuxo;
                        i3 &= -897;
                        composer2 = composer5;
                    } else {
                        i4 = 0;
                        composer2 = composerStartRestartGroup;
                    }
                    modifier3 = modifier5;
                    i5 = i3;
                    cryptoNewsDuxo3 = cryptoNewsDuxo2;
                    composer3 = composer2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    cryptoNewsDuxo3 = cryptoNewsDuxo2;
                    i4 = 0;
                    composer3 = composerStartRestartGroup;
                }
                composer3.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1903715299, i5, -1, "com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposable (CryptoNewsComposable.kt:53)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoNewsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                final Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i4, i4, composer3, i4, 3);
                ImmutableList<CryptoNewsArticle> cryptoArticles = CryptoNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCryptoArticles();
                composer3.startReplaceGroup(5004770);
                zChanged = composer3.changed(cryptoArticles);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChanged) {
                    Object obj = objRememberedValue2;
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(CryptoNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCryptoArticles(), null, 2, null);
                        composer3.updateRememberedValue(snapshotStateMutableStateOf$default);
                        obj = snapshotStateMutableStateOf$default;
                    }
                    final SnapshotState snapshotState = (SnapshotState) obj;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1224400529);
                    int i9 = (((i5 & 14) == 4 || ((i5 & 8) != 0 && composer3.changedInstance(loggedCustomTabs))) ? 1 : i4) | (composer3.changed(snapshotState4CollectAsStateWithLifecycle) ? 1 : 0) | (composer3.changedInstance(cryptoNewsDuxo3) ? 1 : 0) | (composer3.changed(snapshotState) ? 1 : 0) | (composer3.changedInstance(context) ? 1 : 0) | (composer3.changedInstance(current2) ? 1 : 0) | (composer3.changedInstance(navigator) ? 1 : 0);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (i9 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        i6 = i5;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CryptoNewsComposable.CryptoNewsComposable$lambda$10$lambda$9(snapshotState4CollectAsStateWithLifecycle, cryptoNewsDuxo3, snapshotState, loggedCustomTabs, context, current2, navigator, (LazyListScope) obj2);
                            }
                        };
                        composer3.updateRememberedValue(function1);
                        objRememberedValue3 = function1;
                    } else {
                        i6 = i5;
                    }
                    composer3.endReplaceGroup();
                    int i10 = (i6 >> 3) & 14;
                    Composer composer6 = composer3;
                    Modifier modifier6 = modifier3;
                    LazyDslKt.LazyColumn(modifier6, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composer6, i10, 508);
                    composer4 = composer6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoNewsDuxo4 = cryptoNewsDuxo3;
                    modifier4 = modifier6;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoNewsDuxo4 = cryptoNewsDuxo2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoNewsComposable.CryptoNewsComposable$lambda$11(loggedCustomTabs, modifier4, cryptoNewsDuxo4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier3 = modifier5;
                i5 = i3;
                cryptoNewsDuxo3 = cryptoNewsDuxo2;
                composer3 = composer2;
                composer3.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoNewsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                final Navigator navigator2 = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(i4, i4, composer3, i4, 3);
                ImmutableList<CryptoNewsArticle> cryptoArticles2 = CryptoNewsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getCryptoArticles();
                composer3.startReplaceGroup(5004770);
                zChanged = composer3.changed(cryptoArticles2);
                Object objRememberedValue22 = composer3.rememberedValue();
                if (zChanged) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoNewsComposable$lambda$10$lambda$9(SnapshotState4 snapshotState4, final CryptoNewsDuxo cryptoNewsDuxo, SnapshotState snapshotState, final LoggedCustomTabs loggedCustomTabs, final Context context, final EventLogger eventLogger, final Navigator navigator, LazyListScope LazyColumn) {
        LazyListScope lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Element.EducationCarousel educationCarousel = CryptoNewsComposable$lambda$0(snapshotState4).getEducationCarousel();
        if (educationCarousel != null) {
            lazyListScope = LazyColumn;
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1953899195, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1953899195, i, -1, "com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoNewsComposable.kt:68)");
                    }
                    CryptoNewsComposable.CryptoEducationCarouselComposable(educationCarousel, composer, Element.EducationCarousel.$stable);
                    cryptoNewsDuxo.markEducationLessonsAppeared(educationCarousel.getLessons());
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else {
            lazyListScope = LazyColumn;
        }
        final ImmutableList<CryptoNewsArticle> immutableListCryptoNewsComposable$lambda$2 = CryptoNewsComposable$lambda$2(snapshotState);
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CryptoNewsComposable.CryptoNewsComposable$lambda$10$lambda$9$lambda$4(((Integer) obj).intValue(), (CryptoNewsArticle) obj2);
            }
        };
        lazyListScope.items(immutableListCryptoNewsComposable$lambda$2.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$lambda$10$lambda$9$$inlined$itemsIndexed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), immutableListCryptoNewsComposable$lambda$2.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$lambda$10$lambda$9$$inlined$itemsIndexed$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Contents.getContentType(((CryptoNewsArticle) immutableListCryptoNewsComposable$lambda$2.get(i)).getArticle());
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$lambda$10$lambda$9$$inlined$itemsIndexed$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i, Composer composer, int i2) {
                int i3;
                final CryptoNewsArticle cryptoNewsArticle;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                CryptoNewsArticle cryptoNewsArticle2 = (CryptoNewsArticle) immutableListCryptoNewsComposable$lambda$2.get(i);
                composer.startReplaceGroup(-1385406916);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(loggedCustomTabs) | composer.changedInstance(context) | composer.changedInstance(cryptoNewsArticle2) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32) | composer.changedInstance(eventLogger);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    cryptoNewsArticle = cryptoNewsArticle2;
                    final LoggedCustomTabs loggedCustomTabs2 = loggedCustomTabs;
                    final Context context2 = context;
                    final EventLogger eventLogger2 = eventLogger;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$1$1$4$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            LoggedCustomTabs2.showNewsFeedArticle(loggedCustomTabs2, context2, cryptoNewsArticle.getArticle(), "crypto_news", "CRYPTO_NEWSFEED");
                            Screen screen = new Screen(Screen.Name.CRYPTO_MAIN_NEWSFEED, null, null, null, 14, null);
                            Component component = new Component(Component.ComponentType.NEWS_ROW, null, null, 6, null);
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_NEWS_ARTICLE;
                            String string2 = cryptoNewsArticle.getArticle().getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            EventLogger.DefaultImpls.logTap$default(eventLogger2, action, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(i + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, new NewsFeedItem(string2, Contents.getContentType(cryptoNewsArticle.getArticle()), Contents.getMediaType(cryptoNewsArticle.getArticle()), cryptoNewsArticle.getArticle().getSource(), 0, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65538, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
                        }
                    };
                    composer.updateRememberedValue(function0);
                    objRememberedValue = function0;
                } else {
                    cryptoNewsArticle = cryptoNewsArticle2;
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(navigator) | composer.changedInstance(context);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Navigator navigator2 = navigator;
                    final Context context3 = context;
                    objRememberedValue2 = new Function1<RelatedInstrument, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$CryptoNewsComposable$1$1$4$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(RelatedInstrument relatedInstrument) {
                            invoke2(relatedInstrument);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(RelatedInstrument instrument) {
                            Intrinsics.checkNotNullParameter(instrument, "instrument");
                            Navigator.DefaultImpls.showFragment$default(navigator2, context3, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.CRYPTO_NEWS, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoNewsArticleComposable.CryptoNewsArticleComposable(cryptoNewsArticle, function02, (Function1) objRememberedValue2, null, composer, 0, 8);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object CryptoNewsComposable$lambda$10$lambda$9$lambda$4(int i, CryptoNewsArticle cryptoArticle) {
        Intrinsics.checkNotNullParameter(cryptoArticle, "cryptoArticle");
        return cryptoArticle.getArticle().getId();
    }

    private static final CryptoNewsViewState CryptoNewsComposable$lambda$0(SnapshotState4<CryptoNewsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final ImmutableList<CryptoNewsArticle> CryptoNewsComposable$lambda$2(SnapshotState<ImmutableList<CryptoNewsArticle>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoEducationCarouselComposable(final Element.EducationCarousel educationCarousel, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2045895162);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(educationCarousel) : composerStartRestartGroup.changedInstance(educationCarousel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2045895162, i2, -1, "com.robinhood.android.crypto.tab.ui.news.fragment.CryptoEducationCarouselComposable (CryptoNewsComposable.kt:125)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1483323653, true, new CryptoNewsComposable2(educationCarousel, navigator, context), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            ImmutableList<EducationLessonPreview> lessons = educationCarousel.getLessons();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoNewsComposable.CryptoEducationCarouselComposable$lambda$15$lambda$14$lambda$13(navigator, context, (EducationLessonPreview) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EducationSeriesLessonsCarousel5.EducationSeriesLessonsCarousel(lessons, false, modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue, composerStartRestartGroup, 48, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoNewsComposable.CryptoEducationCarouselComposable$lambda$16(educationCarousel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoEducationCarouselComposable$lambda$15$lambda$14$lambda$13(Navigator navigator, Context context, EducationLessonPreview lesson) {
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        FragmentKey fragmentKeyOrNull = EducationLessonPreviews.toFragmentKeyOrNull(lesson, EducationSource.EDUCATION_SOURCE_CRYPTO_NEWS);
        if (fragmentKeyOrNull != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKeyOrNull, false, false, false, null, false, null, false, false, null, null, 4084, null);
        }
        return Unit.INSTANCE;
    }
}
