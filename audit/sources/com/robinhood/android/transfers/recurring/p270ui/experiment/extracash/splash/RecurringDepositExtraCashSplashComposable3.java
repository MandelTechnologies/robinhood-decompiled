package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: RecurringDepositExtraCashSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"RecurringDepositExtraCashSplashComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug", "viewState", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashViewState;", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashSplashComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDepositExtraCashSplashComposable$lambda$1(Modifier modifier, RecurringDepositExtraCashSplashDuxo recurringDepositExtraCashSplashDuxo, int i, int i2, Composer composer, int i3) {
        RecurringDepositExtraCashSplashComposable(modifier, recurringDepositExtraCashSplashDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RecurringDepositExtraCashSplashComposable(Modifier modifier, RecurringDepositExtraCashSplashDuxo recurringDepositExtraCashSplashDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final RecurringDepositExtraCashSplashDuxo recurringDepositExtraCashSplashDuxo2;
        final Modifier modifier3;
        Composer composer2;
        RecurringDepositExtraCashSplashDuxo recurringDepositExtraCashSplashDuxo3;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1071160982);
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
                recurringDepositExtraCashSplashDuxo2 = recurringDepositExtraCashSplashDuxo;
                int i5 = composerStartRestartGroup.changedInstance(recurringDepositExtraCashSplashDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                recurringDepositExtraCashSplashDuxo2 = recurringDepositExtraCashSplashDuxo;
            }
            i3 |= i5;
        } else {
            recurringDepositExtraCashSplashDuxo2 = recurringDepositExtraCashSplashDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RecurringDepositExtraCashSplashDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt$RecurringDepositExtraCashSplashComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt$RecurringDepositExtraCashSplashComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    i6 &= -113;
                    recurringDepositExtraCashSplashDuxo3 = (RecurringDepositExtraCashSplashDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    recurringDepositExtraCashSplashDuxo3 = recurringDepositExtraCashSplashDuxo2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                recurringDepositExtraCashSplashDuxo3 = recurringDepositExtraCashSplashDuxo2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1071160982, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposable (RecurringDepositExtraCashSplashComposable.kt:43)");
            }
            Composer composer4 = composer2;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(recurringDepositExtraCashSplashDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
            composer3 = composer4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_EXTRA_CASH_SPLASH, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-859295029, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt.RecurringDepositExtraCashSplashComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i7) {
                    if ((i7 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-859295029, i7, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposable.<anonymous> (RecurringDepositExtraCashSplashComposable.kt:53)");
                    }
                    boolean zIsLoading = RecurringDepositExtraCashSplashComposable3.RecurringDepositExtraCashSplashComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading();
                    Modifier modifier4 = modifier3;
                    final SnapshotState4<RecurringDepositExtraCashSplashViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    LocalShowPlaceholder.Loadable(zIsLoading, modifier4, null, ComposableLambda3.rememberComposableLambda(-1317803941, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt.RecurringDepositExtraCashSplashComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer6, int i8) {
                            if ((i8 & 3) == 2 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1317803941, i8, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposable.<anonymous>.<anonymous> (RecurringDepositExtraCashSplashComposable.kt:57)");
                            }
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), 0.0f, C2002Dp.m7995constructorimpl(36), 0.0f, BentoTheme.INSTANCE.getSpacing(composer6, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 5, null);
                            Function3<BentoButtonBar3, Composer, Integer, Unit> function3M19719getLambda$1762420410$feature_recurring_deposits_externalDebug = RecurringDepositExtraCashSplashComposable.INSTANCE.m19719getLambda$1762420410$feature_recurring_deposits_externalDebug();
                            final SnapshotState4<RecurringDepositExtraCashSplashViewState> snapshotState42 = snapshotState4;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierM5146paddingqDBjuR0$default, false, function3M19719getLambda$1762420410$feature_recurring_deposits_externalDebug, ComposableLambda3.rememberComposableLambda(1601784435, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt.RecurringDepositExtraCashSplashComposable.1.1.1
                                private static final LottieComposition invoke$lambda$2$lambda$1(LottieCompositionResult lottieCompositionResult) {
                                    return lottieCompositionResult.getValue();
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer7, int i9) {
                                    Modifier.Companion companion;
                                    BentoTheme bentoTheme;
                                    int i10;
                                    SnapshotState4<RecurringDepositExtraCashSplashViewState> snapshotState43;
                                    Composer composer8 = composer7;
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i9 & 17) == 16 && composer8.getSkipping()) {
                                        composer8.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1601784435, i9, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposable.<anonymous>.<anonymous>.<anonymous> (RecurringDepositExtraCashSplashComposable.kt:97)");
                                    }
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(36);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, fM7995constructorimpl, 0.0f, bentoTheme2.getSpacing(composer8, i11).m21590getDefaultD9Ej5fM(), 5, null);
                                    SnapshotState4<RecurringDepositExtraCashSplashViewState> snapshotState44 = snapshotState42;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer8, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer8, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer8.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer8, modifierM5146paddingqDBjuR0$default2);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer8.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer8.startReusableNode();
                                    if (composer8.getInserting()) {
                                        composer8.createNode(constructor);
                                    } else {
                                        composer8.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer8);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Tuples2<LottieUrl, LottieUrl> dayNightLottieAssets = RecurringDepositExtraCashSplashComposable3.RecurringDepositExtraCashSplashComposable$lambda$0(snapshotState44).getDayNightLottieAssets();
                                    if (dayNightLottieAssets == null) {
                                        composer8.startReplaceGroup(212274511);
                                        BoxKt.Box(LocalShowPlaceholder.withBentoPlaceholder$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer8, i11).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer8, i11).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer8, i11).m21590getDefaultD9Ej5fM(), 2, null), 0.0f, 1, null), 1.0f, false, 2, null), false, null, 3, null), composer8, 0);
                                        composer8.endReplaceGroup();
                                        companion = companion2;
                                        bentoTheme = bentoTheme2;
                                        i10 = i11;
                                        snapshotState43 = snapshotState44;
                                    } else {
                                        composer8.startReplaceGroup(212854056);
                                        composer8.startReplaceGroup(-1932790097);
                                        LottieUrl first = bentoTheme2.getColors(composer8, i11).getIsDay() ? dayNightLottieAssets.getFirst() : dayNightLottieAssets.getSecond();
                                        composer8.endReplaceGroup();
                                        companion = companion2;
                                        bentoTheme = bentoTheme2;
                                        i10 = i11;
                                        snapshotState43 = snapshotState44;
                                        LottieAnimation2.LottieAnimation(invoke$lambda$2$lambda$1(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(first.getUrl().getUrl())), null, null, null, null, null, composer8, 0, 62)), Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer7, 0, 0, 0, 2097148);
                                        composer8 = composer7;
                                        composer8.endReplaceGroup();
                                    }
                                    AnnotatedString title = RecurringDepositExtraCashSplashComposable3.RecurringDepositExtraCashSplashComposable$lambda$0(snapshotState43).getTitle();
                                    BentoTheme bentoTheme3 = bentoTheme;
                                    int i12 = i10;
                                    TextStyle displayCapsuleMedium = bentoTheme3.getTypography(composer8, i12).getDisplayCapsuleMedium();
                                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                    BentoTheme bentoTheme4 = bentoTheme;
                                    int i13 = i10;
                                    BentoText2.m20748BentoTextQnj7Zds(title, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme3.getSpacing(composer8, i12).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer8, i12).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer8, i12).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, displayCapsuleMedium, composer8, 0, 0, 8124);
                                    BentoText2.m20748BentoTextQnj7Zds(RecurringDepositExtraCashSplashComposable3.RecurringDepositExtraCashSplashComposable$lambda$0(snapshotState43).getDescription(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme4.getSpacing(composer8, i13).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer8, i13).m21593getSmallD9Ej5fM(), bentoTheme4.getSpacing(composer8, i13).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme4.getTypography(composer8, i13).getTextM(), composer8, 0, 0, 8124);
                                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(C30439R.string.recurring_deposit_extra_cash_footer, bentoTheme4.getColors(composer8, i13).m21426getFg20d7_KjU(), bentoTheme4.getColors(composer8, i13).m21426getFg20d7_KjU(), (LinkInteractionListener) null, composer8, 0, 8), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme4.getSpacing(composer8, i13).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(71), bentoTheme4.getSpacing(composer8, i13).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, bentoTheme4.getTypography(composer8, i13).getTextS(), composer8, 0, 0, 8124);
                                    composer7.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer7, Integer num) {
                                    invoke(boxScope, composer7, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer6, 54), composer6, 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer5, 54), composer5, 3072, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            recurringDepositExtraCashSplashDuxo2 = recurringDepositExtraCashSplashDuxo3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringDepositExtraCashSplashComposable3.RecurringDepositExtraCashSplashComposable$lambda$1(modifier3, recurringDepositExtraCashSplashDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringDepositExtraCashSplashViewState RecurringDepositExtraCashSplashComposable$lambda$0(SnapshotState4<RecurringDepositExtraCashSplashViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
