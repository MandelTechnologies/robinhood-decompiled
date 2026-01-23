package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentComposableKt;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentDuxo;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentViewState;
import com.robinhood.android.crypto.tab.p093ui.discover.leaf.CryptoExploreComposableKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoExploreComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aa\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0017\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010 \u001a\u00020\u0004*\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!¨\u0006(²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\"8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreDuxo;", "duxo", "", "CryptoExploreComposable", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreDuxo;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;", "viewState", "Lkotlin/Function0;", "onFakeSearchTapped", "Lkotlin/Function1;", "", "onQueryChanged", "onCancelClicked", "Landroidx/compose/foundation/lazy/LazyListState;", "columnLazyListState", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo;", "homeDiscoverExperimentDuxo", "Content", "(Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onClick", "content", "ClickWrapper", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "query", "SearchTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "text", "logSearchQueryType", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "", "showSearchAction", "Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverExperimentViewState;", "homeDiscoverExperimentViewState", "forceVisibilityAnimation", "doneShowingClosedAnimation", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoExploreComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickWrapper$lambda$22(Function0 function0, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        ClickWrapper(function0, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$17(CryptoExploreViewState cryptoExploreViewState, Function0 function0, Function1 function1, Function0 function02, LazyListState lazyListState, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(cryptoExploreViewState, function0, function1, function02, lazyListState, cryptoHomeDiscoverExperimentDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoExploreComposable$lambda$4(Modifier modifier, CryptoExploreDuxo cryptoExploreDuxo, int i, int i2, Composer composer, int i3) {
        CryptoExploreComposable(modifier, cryptoExploreDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchTextField$lambda$27(String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchTextField(str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean Content$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final CryptoHomeDiscoverExperimentViewState Content$lambda$7(SnapshotState4<CryptoHomeDiscoverExperimentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Content$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoExploreViewState CryptoExploreComposable$lambda$0(SnapshotState4<CryptoExploreViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoExploreComposable$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    public static final void CryptoExploreComposable(Modifier modifier, CryptoExploreDuxo cryptoExploreDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final CryptoExploreDuxo cryptoExploreDuxo2;
        CryptoExploreDuxo cryptoExploreDuxo3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2020112566);
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
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cryptoExploreDuxo2 = cryptoExploreDuxo;
                int i5 = composerStartRestartGroup.changedInstance(cryptoExploreDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                cryptoExploreDuxo2 = cryptoExploreDuxo;
            }
            i3 |= i5;
        } else {
            cryptoExploreDuxo2 = cryptoExploreDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoExploreDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 &= -113;
                    cryptoExploreDuxo3 = (CryptoExploreDuxo) baseDuxo;
                } else {
                    cryptoExploreDuxo3 = cryptoExploreDuxo2;
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                cryptoExploreDuxo3 = cryptoExploreDuxo2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020112566, i6, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable (CryptoExploreComposable.kt:87)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoExploreDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current2 != null ? current2.getOnBackPressedDispatcher() : null;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(CryptoExploreComposableKt.CryptoExploreComposable$lambda$2$lambda$1(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            CryptoHomeDiscoverExperimentDuxo.InitArgs initArgs = new CryptoHomeDiscoverExperimentDuxo.InitArgs(false, CryptoExploreComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInitialCategoryIndex(), CryptoExploreComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCategoryResponse());
            composerStartRestartGroup.startReplaceGroup(2050738472);
            ViewModelStoreOwner current3 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            CreationExtras2 creationExtras2 = new CreationExtras2(current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
            ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeDiscoverExperimentDuxo.class), current3, "experiment_duxo", factoryCreateViewModelFactory2, creationExtras2, composerStartRestartGroup, 384, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
            final Lifecycle lifecycle2 = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo2) | composerStartRestartGroup.changedInstance(lifecycle2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$$inlined$duxo$2
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                        lifecycle2.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle3 = lifecycle2;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$$inlined$duxo$2.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle3.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            final CryptoExploreDuxo cryptoExploreDuxo4 = cryptoExploreDuxo3;
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.statusBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(1652082042, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt.CryptoExploreComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1652082042, i7, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous> (CryptoExploreComposable.kt:107)");
                    }
                    boolean z = !CryptoExploreComposableKt.CryptoExploreComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isSearchVisible();
                    EnterTransition enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                    ExitTransition exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
                    final SnapshotState4<CryptoExploreViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                    final OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                    final SnapshotState4<Boolean> snapshotState43 = snapshotState4;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final CryptoExploreDuxo cryptoExploreDuxo5 = cryptoExploreDuxo4;
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, enterTransitionPlus, exitTransitionPlus, (String) null, ComposableLambda3.rememberComposableLambda(-756700078, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt.CryptoExploreComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                            invoke(animatedVisibilityScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: CryptoExploreComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $onBack;

                            AnonymousClass2(OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$onBack = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(247179155, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:121)");
                                }
                                NavigationType navigationType = NavigationType.PUSH;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$onBack);
                                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoExploreComposableKt.C131251.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                NavIconButton.m21673NavIconButtonww6aTOc(navigationType, (Function0) objRememberedValue, AutomationTestTagModifierExt.automationTestTag(Modifier.INSTANCE, ExploreTestTags.CANCEL_SEARCH), 0L, composer, 6, 8);
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

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i8) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-756700078, i8, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous>.<anonymous> (CryptoExploreComposable.kt:112)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                            final SnapshotState4<CryptoExploreViewState> snapshotState44 = snapshotState42;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2061297601, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt.CryptoExploreComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2061297601, i9, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:114)");
                                    }
                                    BentoText2.m20747BentoText38GnDrw(CryptoExploreComposableKt.CryptoExploreComposable$lambda$0(snapshotState44).getTitle(), AutomationTestTagModifierExt.automationTestTag(Modifier.INSTANCE, ExploreTestTags.EXPLORE_LEAF_PAGE_TITLE), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8188);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(247179155, true, new AnonymousClass2(onBackPressedDispatcher2), composer3, 54);
                            final SnapshotState4<Boolean> snapshotState45 = snapshotState43;
                            final CoroutineScope coroutineScope3 = coroutineScope2;
                            final LazyListState lazyListState2 = lazyListState;
                            final CryptoExploreDuxo cryptoExploreDuxo6 = cryptoExploreDuxo5;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, modifierFillMaxWidth$default, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-418045196, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt.CryptoExploreComposable.1.1.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                    invoke(row5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i9 & 6) == 0) {
                                        i9 |= composer4.changed(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-418045196, i9, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:132)");
                                    }
                                    AnimatedVisibilityKt.AnimatedVisibility(BentoAppBar, CryptoExploreComposableKt.CryptoExploreComposable$lambda$3(snapshotState45), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-1610730548, true, new C497521(coroutineScope3, lazyListState2, cryptoExploreDuxo6), composer4, 54), composer4, (i9 & 14) | 1600512, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: CryptoExploreComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$1$1$3$1, reason: invalid class name and collision with other inner class name */
                                static final class C497521 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                    final /* synthetic */ LazyListState $columnState;
                                    final /* synthetic */ CoroutineScope $coroutineScope;
                                    final /* synthetic */ CryptoExploreDuxo $duxo;

                                    C497521(CoroutineScope coroutineScope, LazyListState lazyListState, CryptoExploreDuxo cryptoExploreDuxo) {
                                        this.$coroutineScope = coroutineScope;
                                        this.$columnState = lazyListState;
                                        this.$duxo = cryptoExploreDuxo;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                        invoke(animatedVisibilityScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1610730548, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:137)");
                                        }
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.SEARCH_24);
                                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AutomationTestTagModifierExt.automationTestTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), ExploreTestTags.SEARCH_ICON_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.FOCUS_SEARCH_BAR, null, new Component(Component.ComponentType.EXPLORE_SECTION, "explore_search_icon", null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                                        composer.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$columnState) | composer.changedInstance(this.$duxo);
                                        final CoroutineScope coroutineScope = this.$coroutineScope;
                                        final CryptoExploreDuxo cryptoExploreDuxo = this.$duxo;
                                        final LazyListState lazyListState = this.$columnState;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$1$1$3$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoExploreComposableKt.C131251.AnonymousClass1.AnonymousClass3.C497521.invoke$lambda$1$lambda$0(coroutineScope, cryptoExploreDuxo, lazyListState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, CryptoExploreDuxo cryptoExploreDuxo, LazyListState lazyListState) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoExploreComposableKt$CryptoExploreComposable$1$1$3$1$1$1$1(lazyListState, null), 3, null);
                                        cryptoExploreDuxo.onFakeSearchTapped();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), null, false, false, appBarType, null, 0L, null, composer3, 12586422, 0, 1904);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 200064, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1480240709, true, new C131262(cryptoExploreDuxo4, coroutineScope, lazyListStateRememberLazyListState, (CryptoHomeDiscoverExperimentDuxo) baseDuxo2, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            cryptoExploreDuxo2 = cryptoExploreDuxo4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoExploreComposableKt.CryptoExploreComposable$lambda$4(modifier2, cryptoExploreDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoExploreComposable$lambda$2$lambda$1(LazyListState lazyListState) {
        return lazyListState.getFirstVisibleItemIndex() > 0;
    }

    /* compiled from: CryptoExploreComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$2 */
    static final class C131262 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ LazyListState $columnState;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ CryptoExploreDuxo $duxo;
        final /* synthetic */ CryptoHomeDiscoverExperimentDuxo $homeDiscoverExperimentDuxo;
        final /* synthetic */ SnapshotState4<CryptoExploreViewState> $viewState$delegate;

        C131262(CryptoExploreDuxo cryptoExploreDuxo, CoroutineScope coroutineScope, LazyListState lazyListState, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, SnapshotState4<CryptoExploreViewState> snapshotState4) {
            this.$duxo = cryptoExploreDuxo;
            this.$coroutineScope = coroutineScope;
            this.$columnState = lazyListState;
            this.$homeDiscoverExperimentDuxo = cryptoHomeDiscoverExperimentDuxo;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues scaffoldPadding, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(scaffoldPadding, "scaffoldPadding");
            if ((i & 6) == 0) {
                i |= composer.changed(scaffoldPadding) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480240709, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposable.<anonymous> (CryptoExploreComposable.kt:167)");
            }
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, scaffoldPadding);
            CryptoExploreDuxo cryptoExploreDuxo = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(cryptoExploreDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CryptoExploreComposableKt$CryptoExploreComposable$2$1$1(cryptoExploreDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            CryptoExploreViewState cryptoExploreViewStateCryptoExploreComposable$lambda$0 = CryptoExploreComposableKt.CryptoExploreComposable$lambda$0(this.$viewState$delegate);
            CryptoExploreDuxo cryptoExploreDuxo2 = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(cryptoExploreDuxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CryptoExploreComposableKt$CryptoExploreComposable$2$2$1(cryptoExploreDuxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) kFunction;
            Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$columnState) | composer.changedInstance(this.$duxo);
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final CryptoExploreDuxo cryptoExploreDuxo3 = this.$duxo;
            final LazyListState lazyListState = this.$columnState;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$CryptoExploreComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoExploreComposableKt.C131262.invoke$lambda$3$lambda$2(coroutineScope, cryptoExploreDuxo3, lazyListState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            CryptoExploreComposableKt.Content(cryptoExploreViewStateCryptoExploreComposable$lambda$0, function0, function1, (Function0) objRememberedValue3, this.$columnState, this.$homeDiscoverExperimentDuxo, modifierPadding, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, CryptoExploreDuxo cryptoExploreDuxo, LazyListState lazyListState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoExploreComposableKt$CryptoExploreComposable$2$3$1$1(lazyListState, null), 3, null);
            cryptoExploreDuxo.onCancelTapped();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final CryptoExploreViewState cryptoExploreViewState, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function0<Unit> function02, final LazyListState lazyListState, final CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        final Navigator navigator;
        final Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final SnapshotState snapshotState;
        int i5;
        final ComposableLambda composableLambdaRememberComposableLambda;
        final BentoColors colors;
        Object objRememberedValue5;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue6;
        int i6;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1998085978);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoExploreViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function03 = function02;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(lazyListState) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 == 0) {
                    if ((1572864 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1998085978, i3, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.Content (CryptoExploreComposable.kt:193)");
                        }
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new NestedScrollModifier() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$nestedScrollConnection$1$1
                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPostFling-RZ2iAVY */
                                public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                                    return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                                }

                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPostScroll-DzOQY0M */
                                public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i7) {
                                    return super.mo5024onPostScrollDzOQY0M(j, j2, i7);
                                }

                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPreFling-QWom1Mo */
                                public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                                    return super.mo5609onPreFlingQWom1Mo(j, continuation);
                                }

                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPreScroll-OzD1aCk */
                                public long mo5298onPreScrollOzD1aCk(long available, int source) {
                                    FocusManager.clearFocus$default(focusManager, false, 1, null);
                                    SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                                    if (softwareKeyboardController2 != null) {
                                        softwareKeyboardController2.hide();
                                    }
                                    return Offset.INSTANCE.m6553getZeroF1C5BW0();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        CryptoExploreComposableKt$Content$nestedScrollConnection$1$1 cryptoExploreComposableKt$Content$nestedScrollConnection$1$1 = (CryptoExploreComposableKt$Content$nestedScrollConnection$1$1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDiscoverExperimentDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                            objRememberedValue3 = snapshotStateMutableStateOf$default;
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        snapshotState = (SnapshotState) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = i3;
                        composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1466386391, true, new CryptoExploreComposableKt$Content$searchHeader$1(function03, cryptoExploreViewState, focusManager, focusRequester, snapshotState2, snapshotState, function12), composerStartRestartGroup, 54);
                        colors = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        coroutineScope = (CoroutineScope) objRememberedValue5;
                        Modifier modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(modifier3, cryptoExploreComposableKt$Content$nestedScrollConnection$1$1, null, 2, null);
                        boolean zIsSearchScrollable = cryptoExploreViewState.isSearchScrollable();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i5 & 112) != 32) | composerStartRestartGroup.changedInstance(cryptoExploreViewState) | ((i5 & 896) != 256) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo) | composerStartRestartGroup.changedInstance(coroutineScope) | ((57344 & i5) != 16384) | composerStartRestartGroup.changed(colors);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                            i6 = i5;
                            modifier4 = modifier3;
                            Function1 function13 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoExploreComposableKt.Content$lambda$16$lambda$15(cryptoExploreViewState, context, navigator, cryptoHomeDiscoverExperimentDuxo, colors, snapshotState, function0, function1, composableLambdaRememberComposableLambda, snapshotState4CollectAsStateWithLifecycle, coroutineScope, lazyListState, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function13);
                            objRememberedValue6 = function13;
                        } else {
                            i6 = i5;
                            modifier4 = modifier3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifierNestedScroll$default, lazyListState, null, false, null, null, null, zIsSearchScrollable, null, (Function1) objRememberedValue6, composer2, (i6 >> 9) & 112, 380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier5 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoExploreComposableKt.Content$lambda$17(cryptoExploreViewState, function0, function1, function02, lazyListState, cryptoHomeDiscoverExperimentDuxo, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                modifier2 = modifier;
                if ((i3 & 599187) == 599186) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    CryptoExploreComposableKt$Content$nestedScrollConnection$1$1 cryptoExploreComposableKt$Content$nestedScrollConnection$1$12 = (CryptoExploreComposableKt$Content$nestedScrollConnection$1$1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDiscoverExperimentDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = i3;
                    composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1466386391, true, new CryptoExploreComposableKt$Content$searchHeader$1(function03, cryptoExploreViewState, focusManager2, focusRequester2, snapshotState22, snapshotState, function12), composerStartRestartGroup, 54);
                    colors = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue5;
                    Modifier modifierNestedScroll$default2 = NestedScrollModifier7.nestedScroll$default(modifier3, cryptoExploreComposableKt$Content$nestedScrollConnection$1$12, null, 2, null);
                    boolean zIsSearchScrollable2 = cryptoExploreViewState.isSearchScrollable();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i5 & 112) != 32) | composerStartRestartGroup.changedInstance(cryptoExploreViewState) | ((i5 & 896) != 256) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(cryptoHomeDiscoverExperimentDuxo) | composerStartRestartGroup.changedInstance(coroutineScope) | ((57344 & i5) != 16384) | composerStartRestartGroup.changed(colors);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        i6 = i5;
                        modifier4 = modifier3;
                        Function1 function132 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoExploreComposableKt.Content$lambda$16$lambda$15(cryptoExploreViewState, context, navigator, cryptoHomeDiscoverExperimentDuxo, colors, snapshotState, function0, function1, composableLambdaRememberComposableLambda, snapshotState4CollectAsStateWithLifecycle, coroutineScope, lazyListState, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function132);
                        objRememberedValue6 = function132;
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifierNestedScroll$default2, lazyListState, null, false, null, null, null, zIsSearchScrollable2, null, (Function1) objRememberedValue6, composer2, (i6 >> 9) & 112, 380);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 32) != 0) {
            }
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function03 = function02;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$16$lambda$15(CryptoExploreViewState cryptoExploreViewState, Context context, Navigator navigator, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, BentoColors bentoColors, SnapshotState snapshotState, final Function0 function0, final Function1 function1, final Function2 function2, SnapshotState4 snapshotState4, final CoroutineScope coroutineScope, final LazyListState lazyListState, LazyListScope LazyColumn) {
        LazyListScope lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!cryptoExploreViewState.isSearchVisible() && Content$lambda$12(snapshotState)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(973622410, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$1$1$1
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
                        ComposerKt.traceEventStart(973622410, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.Content.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:297)");
                    }
                    Function0<Unit> function02 = function0;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AutomationTestTagModifierExt.automationTestTag(Modifier.INSTANCE, ExploreTestTags.SEARCH_TEXT_BOX), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.FOCUS_SEARCH_BAR, null, new Component(Component.ComponentType.EXPLORE_SECTION, "explore_search_bar", null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
                    final Function1<String, Unit> function12 = function1;
                    CryptoExploreComposableKt.ClickWrapper(function02, modifierAutoLogEvents$default, ComposableLambda3.rememberComposableLambda(1862972548, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$1$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1862972548, i2, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:312)");
                            }
                            Function1<String, Unit> function13 = function12;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            CryptoExploreComposableKt.SearchTextField("", function13, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 5, null), composer2, 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else {
            LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1538286879, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$1$1$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                    if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1538286879, i2, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.Content.<anonymous>.<anonymous>.<anonymous> (CryptoExploreComposable.kt:323)");
                    }
                    function2.invoke(composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (!cryptoExploreViewState.isSearchVisible()) {
            CryptoHomeDiscoverExperimentComposableKt.cryptoHomeDiscoverExperimentItems(LazyColumn, Content$lambda$7(snapshotState4), context, navigator, false, cryptoHomeDiscoverExperimentDuxo, new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoExploreComposableKt.Content$lambda$16$lambda$15$lambda$14(coroutineScope, lazyListState, ((Integer) obj).intValue());
                }
            });
            lazyListScope = LazyColumn;
        } else {
            lazyListScope = LazyColumn;
            CryptoExploreSearchItems.searchItems(lazyListScope, context, navigator, cryptoExploreViewState, bentoColors);
        }
        if (cryptoExploreViewState.isSearchEmpty()) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$CryptoExploreComposableKt.INSTANCE.getLambda$125029122$feature_crypto_tab_externalDebug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$16$lambda$15$lambda$14(CoroutineScope coroutineScope, LazyListState lazyListState, int i) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoExploreComposableKt$Content$1$1$3$1(lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ClickWrapper(final Function0<Unit> function0, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1031352359);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1031352359, i3, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.ClickWrapper (CryptoExploreComposable.kt:374)");
                }
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoExploreComposableKt.ClickWrapper$lambda$21$lambda$20$lambda$19(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(modifierMatchParentSize, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoExploreComposableKt.ClickWrapper$lambda$22(function0, modifier4, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                Modifier modifierMatchParentSize2 = boxScopeInstance2.matchParentSize(Modifier.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 14) != 4) {
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoExploreComposableKt.ClickWrapper$lambda$21$lambda$20$lambda$19(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(modifierMatchParentSize2, interactionSource32, null, false, null, null, (Function0) objRememberedValue2, 28, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickWrapper$lambda$21$lambda$20$lambda$19(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(684221886);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(684221886, i3, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.SearchTextField (CryptoExploreComposable.kt:395)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier2, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                Modifier modifier4 = modifier2;
                String strStringResource = StringResources_androidKt.stringResource(C13013R.string.explore_search_hint, composerStartRestartGroup, 0);
                BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
                BentoTextInput8.Icon.Size24 size242 = str2.length() <= 0 ? new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_24, null, null, 6, null) : null;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i5 = i3 & 112;
                zChangedInstance = (i5 != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoExploreComposableKt.SearchTextField$lambda$24$lambda$23(function1, current, userInteractionEventDescriptor, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = (i5 != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoExploreComposableKt.SearchTextField$lambda$26$lambda$25(function1, current, userInteractionEventDescriptor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3 & 14;
                int i7 = BentoTextInput8.Icon.Size24.$stable;
                composer2 = composerStartRestartGroup;
                BentoTextInput4.BentoTextInput(str2, function12, modifierM4872backgroundbw27NRU$default, null, strStringResource, null, null, size24, size242, (Function0) objRememberedValue2, null, null, null, false, false, composer2, i6 | (i7 << 21) | (i7 << 24), 0, 31848);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoExploreComposableKt.SearchTextField$lambda$27(str, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier2, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            Modifier modifier42 = modifier2;
            String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.explore_search_hint, composerStartRestartGroup, 0);
            BentoTextInput8.Icon.Size24 size243 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
            if (str2.length() <= 0) {
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i52 = i3 & 112;
            zChangedInstance = (i52 != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoExploreComposableKt.SearchTextField$lambda$24$lambda$23(function1, current, userInteractionEventDescriptor, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function1 function122 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = (i52 != 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoExploreComposableKt.SearchTextField$lambda$26$lambda$25(function1, current, userInteractionEventDescriptor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    int i62 = i3 & 14;
                    int i72 = BentoTextInput8.Icon.Size24.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoTextInput4.BentoTextInput(str2, function122, modifierM4872backgroundbw27NRU$default2, null, strStringResource2, null, null, size243, size242, (Function0) objRememberedValue2, null, null, null, false, false, composer2, i62 | (i72 << 21) | (i72 << 24), 0, 31848);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchTextField$lambda$24$lambda$23(Function1 function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        function1.invoke(text);
        logSearchQueryType(eventLogger, userInteractionEventDescriptor.getScreen(), text);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchTextField$lambda$26$lambda$25(Function1 function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        function1.invoke("");
        logSearchQueryType(eventLogger, userInteractionEventDescriptor.getScreen(), "");
        return Unit.INSTANCE;
    }

    private static final void logSearchQueryType(EventLogger eventLogger, Screen screen, String str) {
        EventLogger.DefaultImpls.logType$default(eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, screen, new Component(Component.ComponentType.SEARCH_BAR, CryptoDetailSource.EXPLORE_SEARCH, null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, str, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), 8, null);
    }
}
