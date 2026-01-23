package com.robinhood.android.redesigninvesting.highlights.p231ui;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.android.redesigninvesting.highlights.p231ui.HighlightsCarouselDuxo;
import com.robinhood.android.redesigninvesting.highlights.p231ui.card.HighlightsCardComposable;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollInteraction;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: HighlightsCarouselComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u008e\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u008e\u0002"}, m3636d2 = {"HighlightsCarouselComposable", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo;Landroidx/compose/runtime/Composer;II)V", "AUTO_SCROLL_DELAY_MS", "", "lib-highlights-ui_externalDebug", "viewState", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselViewState;", "userInteractedOnce", "", "isUserInteracting", "carouselItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;", "pendingItems"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class HighlightsCarouselComposable {
    public static final long AUTO_SCROLL_DELAY_MS = 5000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HighlightsCarouselComposable$lambda$29(String str, Modifier modifier, HighlightsCarouselDuxo highlightsCarouselDuxo, int i, int i2, Composer composer, int i3) {
        HighlightsCarouselComposable(str, modifier, highlightsCarouselDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HighlightsCarouselComposable$lambda$4(String str, Modifier modifier, HighlightsCarouselDuxo highlightsCarouselDuxo, int i, int i2, Composer composer, int i3) {
        HighlightsCarouselComposable(str, modifier, highlightsCarouselDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HighlightsCarouselComposable(final String accountNumber, Modifier modifier, HighlightsCarouselDuxo highlightsCarouselDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        HighlightsCarouselDuxo highlightsCarouselDuxo2;
        int i4;
        Modifier modifier3;
        final HighlightsCarouselDuxo highlightsCarouselDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final Modifier modifier4;
        SnapshotState snapshotState;
        int i5;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        Object obj;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2014560002);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    highlightsCarouselDuxo2 = highlightsCarouselDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(highlightsCarouselDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    highlightsCarouselDuxo2 = highlightsCarouselDuxo;
                }
                i3 |= i7;
            } else {
                highlightsCarouselDuxo2 = highlightsCarouselDuxo;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        HighlightsCarouselDuxo.InitArgs initArgs = new HighlightsCarouselDuxo.InitArgs(accountNumber);
                        int i8 = i4 << 3;
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HighlightsCarouselDuxo.class), current, accountNumber, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, ((i8 & 112) << 3) & 896, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$$inlined$duxo$1.1
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
                        i4 &= -897;
                        highlightsCarouselDuxo3 = (HighlightsCarouselDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2014560002, i4, -1, "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposable (HighlightsCarouselComposable.kt:54)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(highlightsCarouselDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$2$lambda$1(highlightsCarouselDuxo3, (LifecycleResumePauseEffectScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i4 & 14, 2);
                    Composer composer2 = composerStartRestartGroup;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(highlightsCarouselDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                    composerStartRestartGroup = composer2;
                    if (!HighlightsCarouselComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getCarouselItems().isEmpty()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            final HighlightsCarouselDuxo highlightsCarouselDuxo4 = highlightsCarouselDuxo3;
                            final Modifier modifier5 = modifier3;
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$4(accountNumber, modifier5, highlightsCarouselDuxo4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    highlightsCarouselDuxo2 = highlightsCarouselDuxo3;
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(1038106095);
                    float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    float f = 2;
                    final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM - C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM() * f) + bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM())) / f);
                    LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    InteractionSource interactionSource = lazyListStateRememberLazyListState.getInteractionSource();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new HighlightsCarouselComposable2(lazyListStateRememberLazyListState, coroutineScope, snapshotState5, snapshotState4, null);
                        snapshotState = snapshotState5;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        snapshotState = snapshotState5;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                    Boolean boolValueOf = Boolean.valueOf(HighlightsCarouselComposable$lambda$7(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(coroutineScope);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new HighlightsCarouselComposable3(lazyListStateRememberLazyListState, coroutineScope, snapshotState4, snapshotState4CollectAsStateWithLifecycle, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, boolValueOf, (Function2) objRememberedValue7, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        i5 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue8 = SnapshotState3.mutableStateOf$default(HighlightsCarouselComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getCarouselItems(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        i5 = 2;
                        snapshotMutationPolicy = null;
                    }
                    SnapshotState snapshotState6 = (SnapshotState) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i5, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    SnapshotState snapshotState7 = (SnapshotState) objRememberedValue9;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<HighlightCard> carouselItems = HighlightsCarouselComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getCarouselItems();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged3 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new HighlightsCarouselComposable4(snapshotState, snapshotState4CollectAsStateWithLifecycle, snapshotState7, snapshotState6, null);
                        snapshotState2 = snapshotState7;
                        snapshotState3 = snapshotState6;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        snapshotState2 = snapshotState7;
                        snapshotState3 = snapshotState6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(carouselItems, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                    Boolean boolValueOf2 = Boolean.valueOf(HighlightsCarouselComposable$lambda$10(snapshotState));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new HighlightsCarouselComposable5(snapshotState2, snapshotState, snapshotState3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 0);
                    EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChanged4 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(current2);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue12 == companion.getEmpty()) {
                        obj = null;
                        objRememberedValue12 = new HighlightsCarouselComposable6(lazyListStateRememberLazyListState, current2, snapshotState3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 6);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 1, obj);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                    Modifier modifierAccountTabScrollInteraction = AccountTabScrollInteractions2.accountTabScrollInteraction(Modifier.INSTANCE, (AccountTabScrollInteractions) composerStartRestartGroup.consume(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction()));
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged5 = composerStartRestartGroup.changed(fM7995constructorimpl);
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5 || objRememberedValue13 == companion.getEmpty()) {
                        objRememberedValue13 = new Function1() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$28$lambda$27$lambda$26(snapshotState3, fM7995constructorimpl, (LazyListScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyRow(modifierAccountTabScrollInteraction, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5092spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue13, composerStartRestartGroup, 0, 488);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier3 = modifier2;
                }
                highlightsCarouselDuxo3 = highlightsCarouselDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(highlightsCarouselDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$2$lambda$1(highlightsCarouselDuxo3, (LifecycleResumePauseEffectScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(accountNumber, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i4 & 14, 2);
                    Composer composer22 = composerStartRestartGroup;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(highlightsCarouselDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                    composerStartRestartGroup = composer22;
                    if (!HighlightsCarouselComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle).getCarouselItems().isEmpty()) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            Composer composer3 = composerStartRestartGroup;
            final HighlightsCarouselDuxo highlightsCarouselDuxo5 = highlightsCarouselDuxo2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$29(accountNumber, modifier4, highlightsCarouselDuxo5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
        i4 = i3;
        if ((i4 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                    highlightsCarouselDuxo3 = highlightsCarouselDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(highlightsCarouselDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        Composer composer32 = composerStartRestartGroup;
        final HighlightsCarouselDuxo highlightsCarouselDuxo52 = highlightsCarouselDuxo2;
        scopeUpdateScopeEndRestartGroup = composer32.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult HighlightsCarouselComposable$lambda$2$lambda$1(HighlightsCarouselDuxo highlightsCarouselDuxo, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = highlightsCarouselDuxo.bind();
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HighlightsCarouselComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HighlightsCarouselComposable$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HighlightsCarouselComposable$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList<HighlightCard> HighlightsCarouselComposable$lambda$15(SnapshotState<ImmutableList<HighlightCard>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList<HighlightCard> HighlightsCarouselComposable$lambda$18(SnapshotState<ImmutableList<HighlightCard>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HighlightsCarouselViewState HighlightsCarouselComposable$lambda$3(SnapshotState4<HighlightsCarouselViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HighlightsCarouselComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HighlightsCarouselComposable$lambda$28$lambda$27$lambda$26(final SnapshotState snapshotState, final float f, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final ImmutableList<HighlightCard> immutableListHighlightsCarouselComposable$lambda$15 = HighlightsCarouselComposable$lambda$15(snapshotState);
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HighlightsCarouselComposable.m2413x7f899240(((Integer) obj).intValue(), (HighlightCard) obj2);
            }
        };
        LazyRow.items(immutableListHighlightsCarouselComposable$lambda$15.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$lambda$28$lambda$27$lambda$26$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), immutableListHighlightsCarouselComposable$lambda$15.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$lambda$28$lambda$27$lambda$26$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableListHighlightsCarouselComposable$lambda$15.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselComposableKt$HighlightsCarouselComposable$lambda$28$lambda$27$lambda$26$$inlined$itemsIndexed$default$3
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                HighlightCard highlightCard = (HighlightCard) immutableListHighlightsCarouselComposable$lambda$15.get(i);
                composer.startReplaceGroup(489530557);
                Modifier modifierAnimateItem$default = LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null);
                if (highlightCard instanceof HighlightCard.RealHighlightCard) {
                    Component.ComponentType componentType = Component.ComponentType.CARD;
                    Intrinsics.checkNotNull(highlightCard, "null cannot be cast to non-null type com.robinhood.android.redesigninvesting.highlights.models.HighlightCard.RealHighlightCard");
                    HighlightCard.RealHighlightCard realHighlightCard = (HighlightCard.RealHighlightCard) highlightCard;
                    modifierAnimateItem$default = ModifiersKt.autoLogEvents$default(modifierAnimateItem$default, new UserInteractionEventDescriptor(null, null, null, new Context(i + 1, HighlightsCarouselComposable.HighlightsCarouselComposable$lambda$15(snapshotState).size(), 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(realHighlightCard.getId(), null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16388, -1, -1, -1, -1, -1, 16383, null), new Component(componentType, realHighlightCard.getAnalyticsName(), null, 4, null), null, 39, null), true, false, false, true, false, null, 108, null);
                }
                HighlightsCardComposable.m17966HighlightsCardComposableTN_CM5M(highlightCard, i, f, modifierAnimateItem$default, null, composer, i3 & 112, 16);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HighlightsCarouselComposable$lambda$28$lambda$27$lambda$26$lambda$23 */
    public static final Object m2413x7f899240(int i, HighlightCard item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getKey();
    }
}
