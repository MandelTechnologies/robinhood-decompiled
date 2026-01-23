package com.robinhood.android.equities.equityscreener.crud.create;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.equities.equityscreener.C14668R;
import com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: CreateScreenerComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u008a\u0084\u0002"}, m3636d2 = {"CreateScreenerComposable", "", "screenOrder", "Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "onPresetSelected", "Lkotlin/Function1;", "Lcom/robinhood/equityscreener/models/db/Screener;", "Lkotlin/ParameterName;", "name", "preset", "onCreateScreener", "onBack", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDuxo;", "(Lcom/robinhood/equityscreener/models/api/ScreenerOrder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDuxo;Landroidx/compose/runtime/Composer;II)V", "NUM_PLACEHOLDER_CARDS", "", "rowItemPadding", "Landroidx/compose/ui/Modifier;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "size", "outerPadding", "Landroidx/compose/ui/unit/Dp;", "innerPadding", "rowItemPadding-oZzcvok", "(Landroidx/compose/ui/Modifier;IIFF)Landroidx/compose/ui/Modifier;", "lib-equity-screener_externalDebug", "viewState", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerViewState;", "selectedPreset", "validatedSelectedPresetOrFirst"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CreateScreenerComposable3 {
    private static final int NUM_PLACEHOLDER_CARDS = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreenerComposable$lambda$20(ScreenerOrder screenerOrder, Function1 function1, Function1 function12, Function0 function0, CreateScreenerDuxo createScreenerDuxo, int i, int i2, Composer composer, int i3) {
        CreateScreenerComposable(screenerOrder, function1, function12, function0, createScreenerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateScreenerComposable(final ScreenerOrder screenOrder, final Function1<? super Screener, Unit> onPresetSelected, Function1<? super Screener, Unit> onCreateScreener, final Function0<Unit> onBack, CreateScreenerDuxo createScreenerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final CreateScreenerDuxo createScreenerDuxo2;
        boolean z;
        int i4;
        int i5;
        final CreateScreenerDuxo createScreenerDuxo3;
        char c;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        final SnapshotState4 snapshotState4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged3;
        Object objRememberedValue5;
        boolean zChanged4;
        Object objRememberedValue6;
        final Function1<? super Screener, Unit> function1;
        Composer composer3;
        Intrinsics.checkNotNullParameter(screenOrder, "screenOrder");
        Intrinsics.checkNotNullParameter(onPresetSelected, "onPresetSelected");
        Intrinsics.checkNotNullParameter(onCreateScreener, "onCreateScreener");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(1166092201);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(screenOrder.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPresetSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCreateScreener) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                createScreenerDuxo2 = createScreenerDuxo;
                int i6 = composerStartRestartGroup.changedInstance(createScreenerDuxo2) ? 16384 : 8192;
                i3 |= i6;
            } else {
                createScreenerDuxo2 = createScreenerDuxo;
            }
            i3 |= i6;
        } else {
            createScreenerDuxo2 = createScreenerDuxo;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function1 = onCreateScreener;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    String str = "CreateScreenerComposable: " + screenOrder.name();
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    z = false;
                    CreationExtras creationExtras = defaultViewModelCreationExtras;
                    i4 = -1633490746;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CreateScreenerDuxo.class), current, str, factoryCreateViewModelFactory, creationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = i3 & (-57345);
                    createScreenerDuxo3 = (CreateScreenerDuxo) baseDuxo;
                    c = 256;
                } else {
                    c = 256;
                    i4 = -1633490746;
                    z = false;
                    createScreenerDuxo3 = createScreenerDuxo;
                    i5 = i3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1166092201, i5, -1, "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposable (CreateScreenerComposable.kt:48)");
                }
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(i4);
                int i7 = i5 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(createScreenerDuxo3) | (i7 != 4 ? true : z);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateScreenerComposable3.CreateScreenerComposable$lambda$2$lambda$1(createScreenerDuxo3, screenOrder, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i8 = i4;
                composer2 = composerStartRestartGroup;
                LifecycleEffectKt.LifecycleResumeEffect(screenOrder, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) function12, composer2, i7, 0);
                CreateScreenerDuxo createScreenerDuxo4 = createScreenerDuxo3;
                int i9 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(createScreenerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composer2.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(CreateScreenerComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle) instanceof CreateScreenerViewState.Ready);
                composer2.startReplaceGroup(i8);
                int i10 = i9 & 112;
                zChanged = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | (i10 != 32);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new CreateScreenerComposable4(onPresetSelected, snapshotState4CollectAsStateWithLifecycle, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                Screener screenerCreateScreenerComposable$lambda$5 = CreateScreenerComposable$lambda$5(snapshotState);
                CreateScreenerViewState createScreenerViewStateCreateScreenerComposable$lambda$3 = CreateScreenerComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                composer2.startReplaceGroup(i8);
                zChanged2 = composer2.changed(screenerCreateScreenerComposable$lambda$5) | composer2.changed(createScreenerViewStateCreateScreenerComposable$lambda$3);
                objRememberedValue4 = composer2.rememberedValue();
                if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateScreenerComposable3.CreateScreenerComposable$lambda$10$lambda$9(snapshotState4CollectAsStateWithLifecycle, snapshotState);
                        }
                    });
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue4;
                composer2.endReplaceGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14668R.string.screener_create_title, composer2, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i11).m21592getMediumD9Ej5fM(), 1, null), 0.0f, composer2, 0, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i11).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, TestTags.PresetCarousel), 0.0f, 1, null);
                boolean z2 = CreateScreenerComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle) instanceof CreateScreenerViewState.Ready;
                composer2.startReplaceGroup(-1224400529);
                zChanged3 = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | composer2.changed(snapshotState4) | (i10 != 32);
                objRememberedValue5 = composer2.rememberedValue();
                if (!zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateScreenerComposable3.CreateScreenerComposable$lambda$19$lambda$15$lambda$14(snapshotState4CollectAsStateWithLifecycle, onPresetSelected, snapshotState4, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, null, false, null, null, null, z2, null, (Function1) objRememberedValue5, composer2, 6, 382);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer2, 0, 1);
                String strStringResource = StringResources_androidKt.stringResource(C14668R.string.screener_create_continue, composer2, 0);
                boolean z3 = CreateScreenerComposable$lambda$11(snapshotState4) == null;
                String strStringResource2 = StringResources_androidKt.stringResource(C14668R.string.screener_create_back, composer2, 0);
                composer2.startReplaceGroup(-1633490746);
                zChanged4 = composer2.changed(snapshotState4) | ((i9 & 896) == 256);
                objRememberedValue6 = composer2.rememberedValue();
                if (!zChanged4 || objRememberedValue6 == companion.getEmpty()) {
                    function1 = onCreateScreener;
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateScreenerComposable3.CreateScreenerComposable$lambda$19$lambda$18$lambda$17(snapshotState4, function1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                } else {
                    function1 = onCreateScreener;
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue6, strStringResource, false, null, z3, onBack, strStringResource2, false, null, false, composer3, 0, (i9 >> 6) & 112, 58174);
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                createScreenerDuxo2 = createScreenerDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i5 = i3 & (-57345);
                    c = 256;
                    z = false;
                    createScreenerDuxo3 = createScreenerDuxo2;
                    i4 = -1633490746;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(i4);
                int i72 = i5 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(createScreenerDuxo3) | (i72 != 4 ? true : z);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateScreenerComposable3.CreateScreenerComposable$lambda$2$lambda$1(createScreenerDuxo3, screenOrder, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function122 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    int i82 = i4;
                    composer2 = composerStartRestartGroup;
                    LifecycleEffectKt.LifecycleResumeEffect(screenOrder, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) function122, composer2, i72, 0);
                    CreateScreenerDuxo createScreenerDuxo42 = createScreenerDuxo3;
                    int i92 = i5;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(createScreenerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composer2.endReplaceGroup();
                    Boolean boolValueOf2 = Boolean.valueOf(CreateScreenerComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle) instanceof CreateScreenerViewState.Ready);
                    composer2.startReplaceGroup(i82);
                    int i102 = i92 & 112;
                    zChanged = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | (i102 != 32);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new CreateScreenerComposable4(onPresetSelected, snapshotState4CollectAsStateWithLifecycle, null);
                        composer2.updateRememberedValue(objRememberedValue3);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                        Screener screenerCreateScreenerComposable$lambda$52 = CreateScreenerComposable$lambda$5(snapshotState);
                        CreateScreenerViewState createScreenerViewStateCreateScreenerComposable$lambda$32 = CreateScreenerComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                        composer2.startReplaceGroup(i82);
                        zChanged2 = composer2.changed(screenerCreateScreenerComposable$lambda$52) | composer2.changed(createScreenerViewStateCreateScreenerComposable$lambda$32);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreateScreenerComposable3.CreateScreenerComposable$lambda$10$lambda$9(snapshotState4CollectAsStateWithLifecycle, snapshotState);
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue4);
                            snapshotState4 = (SnapshotState4) objRememberedValue4;
                            composer2.endReplaceGroup();
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i112 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14668R.string.screener_create_title, composer2, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion22, 0.0f, bentoTheme2.getSpacing(composer2, i112).m21592getMediumD9Ej5fM(), 1, null), 0.0f, composer2, 0, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i112).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion22, TestTags.PresetCarousel), 0.0f, 1, null);
                                boolean z22 = CreateScreenerComposable$lambda$3(snapshotState4CollectAsStateWithLifecycle) instanceof CreateScreenerViewState.Ready;
                                composer2.startReplaceGroup(-1224400529);
                                zChanged3 = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | composer2.changed(snapshotState4) | (i102 != 32);
                                objRememberedValue5 = composer2.rememberedValue();
                                if (!zChanged3) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CreateScreenerComposable3.CreateScreenerComposable$lambda$19$lambda$15$lambda$14(snapshotState4CollectAsStateWithLifecycle, onPresetSelected, snapshotState4, snapshotState, (LazyListScope) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue5);
                                    composer2.endReplaceGroup();
                                    LazyDslKt.LazyRow(modifierFillMaxWidth$default2, null, null, false, null, null, null, z22, null, (Function1) objRememberedValue5, composer2, 6, 382);
                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composer2, i112).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer2, 0, 1);
                                    String strStringResource3 = StringResources_androidKt.stringResource(C14668R.string.screener_create_continue, composer2, 0);
                                    if (CreateScreenerComposable$lambda$11(snapshotState4) == null) {
                                    }
                                    String strStringResource22 = StringResources_androidKt.stringResource(C14668R.string.screener_create_back, composer2, 0);
                                    composer2.startReplaceGroup(-1633490746);
                                    zChanged4 = composer2.changed(snapshotState4) | ((i92 & 896) == 256);
                                    objRememberedValue6 = composer2.rememberedValue();
                                    if (zChanged4) {
                                        function1 = onCreateScreener;
                                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateScreenerComposable3.CreateScreenerComposable$lambda$19$lambda$18$lambda$17(snapshotState4, function1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue6);
                                        composer2.endReplaceGroup();
                                        composer3 = composer2;
                                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, false, null, null, (Function0) objRememberedValue6, strStringResource3, false, null, z3, onBack, strStringResource22, false, null, false, composer3, 0, (i92 >> 6) & 112, 58174);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        createScreenerDuxo2 = createScreenerDuxo42;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateScreenerComposable3.CreateScreenerComposable$lambda$20(screenOrder, onPresetSelected, function1, onBack, createScreenerDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult CreateScreenerComposable$lambda$2$lambda$1(CreateScreenerDuxo createScreenerDuxo, ScreenerOrder screenerOrder, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobOnBind = createScreenerDuxo.onBind(screenerOrder);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobOnBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screener CreateScreenerComposable$lambda$10$lambda$9(SnapshotState4 snapshotState4, SnapshotState snapshotState) {
        CreateScreenerViewState createScreenerViewStateCreateScreenerComposable$lambda$3 = CreateScreenerComposable$lambda$3(snapshotState4);
        Object obj = null;
        if (Intrinsics.areEqual(createScreenerViewStateCreateScreenerComposable$lambda$3, CreateScreenerViewState.Loading.INSTANCE)) {
            return null;
        }
        if (!(createScreenerViewStateCreateScreenerComposable$lambda$3 instanceof CreateScreenerViewState.Ready)) {
            throw new NoWhenBranchMatchedException();
        }
        Screener screenerCreateScreenerComposable$lambda$5 = CreateScreenerComposable$lambda$5(snapshotState);
        String id = screenerCreateScreenerComposable$lambda$5 != null ? screenerCreateScreenerComposable$lambda$5.getId() : null;
        if (id != null) {
            CreateScreenerViewState.Ready ready = (CreateScreenerViewState.Ready) createScreenerViewStateCreateScreenerComposable$lambda$3;
            Iterator<T> it = ready.getPresets().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(id, ((Screener) next).getId())) {
                    obj = next;
                    break;
                }
            }
            Screener screener = (Screener) obj;
            return screener == null ? (Screener) CollectionsKt.firstOrNull((List) ready.getPresets()) : screener;
        }
        return (Screener) CollectionsKt.firstOrNull((List) ((CreateScreenerViewState.Ready) createScreenerViewStateCreateScreenerComposable$lambda$3).getPresets());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screener CreateScreenerComposable$lambda$11(SnapshotState4<Screener> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateScreenerViewState CreateScreenerComposable$lambda$3(SnapshotState4<? extends CreateScreenerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Screener CreateScreenerComposable$lambda$5(SnapshotState<Screener> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreenerComposable$lambda$19$lambda$15$lambda$14(SnapshotState4 snapshotState4, final Function1 function1, final SnapshotState4 snapshotState42, final SnapshotState snapshotState, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        CreateScreenerViewState createScreenerViewStateCreateScreenerComposable$lambda$3 = CreateScreenerComposable$lambda$3(snapshotState4);
        if (Intrinsics.areEqual(createScreenerViewStateCreateScreenerComposable$lambda$3, CreateScreenerViewState.Loading.INSTANCE)) {
            LazyListScope.items$default(LazyRow, 3, null, null, CreateScreenerComposable.INSTANCE.getLambda$457073403$lib_equity_screener_externalDebug(), 6, null);
        } else {
            if (!(createScreenerViewStateCreateScreenerComposable$lambda$3 instanceof CreateScreenerViewState.Ready)) {
                throw new NoWhenBranchMatchedException();
            }
            final List<Screener> presets = ((CreateScreenerViewState.Ready) createScreenerViewStateCreateScreenerComposable$lambda$3).getPresets();
            LazyRow.items(presets.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$lambda$19$lambda$15$lambda$14$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    presets.get(i);
                    return null;
                }
            }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$lambda$19$lambda$15$lambda$14$$inlined$itemsIndexed$default$3
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
                    final Screener screener = (Screener) presets.get(i);
                    composer.startReplaceGroup(1921509988);
                    Modifier modifierM13542rowItemPaddingoZzcvok = CreateScreenerComposable3.m13542rowItemPaddingoZzcvok(Modifier.INSTANCE, i, presets.size(), ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                    String displayName = screener.getDisplayName();
                    String displayDescription = screener.getDisplayDescription();
                    String cardAssetUrl = PresetScreenerCard4.getCardAssetUrl(screener);
                    String id = screener.getId();
                    Screener screenerCreateScreenerComposable$lambda$11 = CreateScreenerComposable3.CreateScreenerComposable$lambda$11(snapshotState42);
                    boolean zAreEqual = Intrinsics.areEqual(id, screenerCreateScreenerComposable$lambda$11 != null ? screenerCreateScreenerComposable$lambda$11.getId() : null);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(screener) | composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        final SnapshotState snapshotState2 = snapshotState;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposableKt$CreateScreenerComposable$3$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState2.setValue(screener);
                                function12.invoke(screener);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    PresetScreenerCard4.PresetScreenerCard(modifierM13542rowItemPaddingoZzcvok, displayName, displayDescription, cardAssetUrl, zAreEqual, false, (Function0) objRememberedValue, composer, 0, 32);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreenerComposable$lambda$19$lambda$18$lambda$17(SnapshotState4 snapshotState4, Function1 function1) {
        Screener screenerCreateScreenerComposable$lambda$11 = CreateScreenerComposable$lambda$11(snapshotState4);
        if (screenerCreateScreenerComposable$lambda$11 != null) {
            function1.invoke(screenerCreateScreenerComposable$lambda$11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rowItemPadding-oZzcvok, reason: not valid java name */
    public static final Modifier m13542rowItemPaddingoZzcvok(Modifier modifier, int i, int i2, float f, float f2) {
        if (i == 0) {
            modifier = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier, f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        Modifier modifierM5146paddingqDBjuR0$default = modifier;
        int i3 = i2 - 1;
        if (i < i3) {
            modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, 0.0f, 0.0f, f2, 0.0f, 11, null);
        }
        return i == i3 ? androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, 0.0f, 0.0f, f, 0.0f, 11, null) : modifierM5146paddingqDBjuR0$default;
    }
}
