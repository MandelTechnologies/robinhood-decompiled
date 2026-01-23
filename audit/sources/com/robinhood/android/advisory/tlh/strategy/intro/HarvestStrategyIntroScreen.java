package com.robinhood.android.advisory.tlh.strategy.intro;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
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
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.advisory.tlh.DestinationsKt;
import com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreen;
import com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesLoading;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.HttpUrl;

/* compiled from: HarvestStrategyIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a!\u0010\u001c\u001a\u00020\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u001f\u001aX\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010$\"\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b\"\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002"}, m3636d2 = {"HarvestStrategyIntroScreen", "", "accountNumbers", "Lkotlinx/collections/immutable/ImmutableList;", "", "onContinueClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "showStrategySelectionScreenAfter", "paddings", "Landroidx/compose/foundation/layout/PaddingValues;", "modifier", "Landroidx/compose/ui/Modifier;", "onLoadingChanged", "isLoading", "onInternalNavigate", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "duxo", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDuxo;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDuxo;Landroidx/compose/runtime/Composer;II)V", "AssetsRoute", "DarkAsset", "LightAsset", "LottieSize", "Landroidx/compose/ui/unit/Dp;", "F", "HarvestStrategyIntroLoadingScreen", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesLoading;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "REMOTE_IMAGE_URL", "HarvestStrategyIntroLoadedScreen", "loadedState", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState$Loaded;", "(Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug", "viewState", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState;", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "titleIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestStrategyIntroScreen {
    private static final String AssetsRoute = "advisory/tax_loss_harvesting";
    private static final String DarkAsset = "advisory/tax_loss_harvesting/dark/harvest_strategies_loading_dark.json";
    private static final String LightAsset = "advisory/tax_loss_harvesting/light/harvest_strategies_loading_light.json";
    private static final float LottieSize = C2002Dp.m7995constructorimpl(280);
    private static final String REMOTE_IMAGE_URL = "advisory/tax_loss_harvesting/harvest_strategy_intro.png";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyIntroLoadedScreen$lambda$15(HarvestStrategyIntroViewState.Loaded loaded, Function1 function1, Modifier modifier, Function1 function12, int i, int i2, Composer composer, int i3) {
        HarvestStrategyIntroLoadedScreen(loaded, function1, modifier, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyIntroLoadingScreen$lambda$12(TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HarvestStrategyIntroLoadingScreen(taxLossHarvestStrategiesLoading, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyIntroScreen$lambda$5(ImmutableList immutableList, Function1 function1, PaddingValues paddingValues, Modifier modifier, Function1 function12, Function1 function13, HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, int i, int i2, Composer composer, int i3) {
        HarvestStrategyIntroScreen(immutableList, function1, paddingValues, modifier, function12, function13, harvestStrategyIntroDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyIntroScreen$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyIntroScreen$lambda$3$lambda$2(ComposableDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestStrategyIntroScreen(final ImmutableList<String> accountNumbers, final Function1<? super Boolean, Unit> onContinueClicked, final PaddingValues paddings, Modifier modifier, Function1<? super Boolean, Unit> function1, Function1<? super ComposableDestination, Unit> function12, HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super Boolean, Unit> function13;
        int i5;
        Function1<? super ComposableDestination, Unit> function14;
        HarvestStrategyIntroDuxo harvestStrategyIntroDuxo2;
        Function1<? super Boolean, Unit> function15;
        Function1<? super ComposableDestination, Unit> function16;
        Composer composer2;
        int i6;
        int i7;
        Function1<? super Boolean, Unit> function17;
        HarvestStrategyIntroDuxo harvestStrategyIntroDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        HarvestStrategyIntroViewState harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4;
        Modifier modifier3;
        Function1<? super Boolean, Unit> function18;
        Composer composer3;
        final Function1<? super ComposableDestination, Unit> function19;
        final Modifier modifier4;
        final Function1<? super Boolean, Unit> function110;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Composer composerStartRestartGroup = composer.startRestartGroup(1617659497);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumbers) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(paddings) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            harvestStrategyIntroDuxo2 = harvestStrategyIntroDuxo;
                            int i9 = composerStartRestartGroup.changedInstance(harvestStrategyIntroDuxo2) ? 1048576 : 524288;
                            i3 |= i9;
                        } else {
                            harvestStrategyIntroDuxo2 = harvestStrategyIntroDuxo;
                        }
                        i3 |= i9;
                    } else {
                        harvestStrategyIntroDuxo2 = harvestStrategyIntroDuxo;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HarvestStrategyIntroScreen.HarvestStrategyIntroScreen$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function15 = (Function1) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function15 = function13;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HarvestStrategyIntroScreen.HarvestStrategyIntroScreen$lambda$3$lambda$2((ComposableDestination) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                function16 = (Function1) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function16 = function14;
                            }
                            if ((i2 & 64) == 0) {
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                i6 = 0;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HarvestStrategyIntroDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroScreen$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroScreen$$inlined$duxo$1.1
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
                                HarvestStrategyIntroDuxo harvestStrategyIntroDuxo4 = (HarvestStrategyIntroDuxo) baseDuxo;
                                i7 = i3 & (-3670017);
                                function17 = function15;
                                harvestStrategyIntroDuxo3 = harvestStrategyIntroDuxo4;
                            } else {
                                composer2 = composerStartRestartGroup;
                                i6 = 0;
                                i7 = i3;
                                function17 = function15;
                                harvestStrategyIntroDuxo3 = harvestStrategyIntroDuxo2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            Function1<? super Boolean, Unit> function111 = function13;
                            i7 = i3;
                            function17 = function111;
                            composer2 = composerStartRestartGroup;
                            function16 = function14;
                            harvestStrategyIntroDuxo3 = harvestStrategyIntroDuxo2;
                            i6 = 0;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1617659497, i7, -1, "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreen (HarvestStrategyIntroScreen.kt:69)");
                        }
                        int i10 = i7;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(harvestStrategyIntroDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                        Composer composer4 = composer2;
                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        harvestStrategyIntroDuxo3.setAccountNumbers(accountNumbers);
                        harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4 = HarvestStrategyIntroScreen$lambda$4(snapshotState4CollectAsStateWithLifecycle);
                        if (!(harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4 instanceof HarvestStrategyIntroViewState.Loading)) {
                            composer4.startReplaceGroup(-2133313912);
                            function17.invoke(Boolean.TRUE);
                            HarvestStrategyIntroLoadingScreen(((HarvestStrategyIntroViewState.Loading) harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4).getData(), PaddingKt.padding(modifier2, paddings), composer4, i6, i6);
                            composer4.endReplaceGroup();
                            modifier3 = modifier2;
                            harvestStrategyIntroDuxo2 = harvestStrategyIntroDuxo3;
                            composer3 = composer4;
                            function18 = function17;
                        } else {
                            if (!(harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4 instanceof HarvestStrategyIntroViewState.Loaded)) {
                                composer4.startReplaceGroup(-207365812);
                                composer4.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer4.startReplaceGroup(-2133075150);
                            function17.invoke(Boolean.FALSE);
                            HarvestStrategyIntroViewState.Loaded loaded = (HarvestStrategyIntroViewState.Loaded) harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4;
                            modifier3 = modifier2;
                            harvestStrategyIntroDuxo2 = harvestStrategyIntroDuxo3;
                            function18 = function17;
                            HarvestStrategyIntroLoadedScreen(loaded, onContinueClicked, PaddingKt.m5146paddingqDBjuR0$default(modifier3, PaddingKt.calculateStartPadding(paddings, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddings, layoutDirection), paddings.getBottom(), 2, null), function16, composer4, ((i10 >> 6) & 7168) | (i10 & 112), 0);
                            composer3 = composer4;
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function19 = function16;
                        modifier4 = modifier3;
                        function110 = function18;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer3 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        function110 = function13;
                        function19 = function14;
                    }
                    final HarvestStrategyIntroDuxo harvestStrategyIntroDuxo5 = harvestStrategyIntroDuxo2;
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return HarvestStrategyIntroScreen.HarvestStrategyIntroScreen$lambda$5(accountNumbers, onContinueClicked, paddings, modifier4, function110, function19, harvestStrategyIntroDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function14 = function12;
                if ((1572864 & i) != 0) {
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i7;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(harvestStrategyIntroDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                        Composer composer42 = composer2;
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer42.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        harvestStrategyIntroDuxo3.setAccountNumbers(accountNumbers);
                        harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4 = HarvestStrategyIntroScreen$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
                        if (!(harvestStrategyIntroViewStateHarvestStrategyIntroScreen$lambda$4 instanceof HarvestStrategyIntroViewState.Loading)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function19 = function16;
                        modifier4 = modifier3;
                        function110 = function18;
                    }
                }
                final HarvestStrategyIntroDuxo harvestStrategyIntroDuxo52 = harvestStrategyIntroDuxo2;
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function14 = function12;
            if ((1572864 & i) != 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            final HarvestStrategyIntroDuxo harvestStrategyIntroDuxo522 = harvestStrategyIntroDuxo2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function14 = function12;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        final HarvestStrategyIntroDuxo harvestStrategyIntroDuxo5222 = harvestStrategyIntroDuxo2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HarvestStrategyIntroLoadingScreen$lambda$9(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition HarvestStrategyIntroLoadingScreen$lambda$6(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final HarvestStrategyIntroViewState HarvestStrategyIntroScreen$lambda$4(SnapshotState4<? extends HarvestStrategyIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: HarvestStrategyIntroScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroLoadedScreen$2 */
    static final class C94452 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ HttpUrl $defaultImageUrl;
        final /* synthetic */ HarvestStrategyIntroViewState.Loaded $loadedState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onContinueClicked;
        final /* synthetic */ Function1<ComposableDestination, Unit> $onInternalNavigate;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ UriHandler $uriHandler;

        /* JADX WARN: Multi-variable type inference failed */
        C94452(Modifier modifier, ScrollState scrollState, HarvestStrategyIntroViewState.Loaded loaded, Function1<? super Boolean, Unit> function1, HttpUrl httpUrl, Function1<? super ComposableDestination, Unit> function12, UriHandler uriHandler) {
            this.$modifier = modifier;
            this.$scrollState = scrollState;
            this.$loadedState = loaded;
            this.$onContinueClicked = function1;
            this.$defaultImageUrl = httpUrl;
            this.$onInternalNavigate = function12;
            this.$uriHandler = uriHandler;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834349594, i, -1, "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroLoadedScreen.<anonymous> (HarvestStrategyIntroScreen.kt:206)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null), 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            ScrollState scrollState = this.$scrollState;
            final HarvestStrategyIntroViewState.Loaded loaded = this.$loadedState;
            final Function1<Boolean, Unit> function1 = this.$onContinueClicked;
            Object obj = this.$defaultImageUrl;
            final Function1<ComposableDestination, Unit> function12 = this.$onInternalNavigate;
            final UriHandler uriHandler = this.$uriHandler;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.5f, false, 2, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String imageUrl = loaded.getImageUrl();
            if (imageUrl != null) {
                obj = imageUrl;
            }
            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(obj, null, null, null, 0, null, composer, 0, 62);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(20), 5, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            composer.endNode();
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(loaded.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayMartinaLarge(), composer, 0, 0, 8186);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String description = loaded.getDescription();
            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            int i3 = BentoMarkdownText.$stable;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, 0, jM21425getFg0d7_KjU, 0L, false, composer, i3 << 15, 26);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function12) | composer.changedInstance(uriHandler);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroLoadedScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HarvestStrategyIntroScreen.C94452.invoke$lambda$6$lambda$3$lambda$2$lambda$1(function12, uriHandler, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i4 = MarkdownStyle.$stable;
            BentoMarkdownText2.BentoMarkdownText(description, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, i4 << 6, 8);
            composer.endNode();
            BentoMarkdownText2.BentoMarkdownText(loaded.getDisclosure(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer, 6, 1), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, i3 << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, i4 << 6, 24);
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            String cta = loaded.getCta();
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(function1) | composer.changed(loaded);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroLoadedScreen$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HarvestStrategyIntroScreen.C94452.invoke$lambda$6$lambda$5$lambda$4(function1, loaded);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, cta, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2$lambda$1(Function1 function1, UriHandler uriHandler, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            ComposableDestination taxLossHarvestDestinationFromRoute = DestinationsKt.getTaxLossHarvestDestinationFromRoute(uri);
            if (taxLossHarvestDestinationFromRoute != null) {
                function1.invoke(taxLossHarvestDestinationFromRoute);
            } else {
                uriHandler.openUri(uri);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function1 function1, HarvestStrategyIntroViewState.Loaded loaded) {
            function1.invoke(Boolean.valueOf(loaded.getShowStrategySelectionScreenAfter()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestStrategyIntroLoadingScreen(final TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        BentoTheme bentoTheme;
        int i4;
        boolean z;
        boolean z2;
        String lottieUrlDark;
        boolean zChanged;
        Object objRememberedValue;
        final List list;
        boolean zChanged2;
        Object objRememberedValue2;
        final SnapshotIntState2 snapshotIntState2;
        long jCoerceAtLeast;
        boolean zChangedInstance;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(846023069);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(taxLossHarvestStrategiesLoading) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(846023069, i3, -1, "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroLoadingScreen (HarvestStrategyIntroScreen.kt:108)");
                }
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                HttpUrl httpUrlBuild = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay() ? LightAsset : DarkAsset).build();
                composerStartRestartGroup.startReplaceGroup(1279365666);
                composerStartRestartGroup.startReplaceGroup(1279366196);
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    z = false;
                    composerStartRestartGroup.endReplaceGroup();
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(1279369236);
                        if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                            z2 = false;
                            composerStartRestartGroup.endReplaceGroup();
                            lottieUrlDark = !z2 ? taxLossHarvestStrategiesLoading.getLottieUrlDark() : httpUrlBuild.getUrl();
                        } else {
                            if ((taxLossHarvestStrategiesLoading != null ? taxLossHarvestStrategiesLoading.getLottieUrlDark() : null) != null) {
                                z2 = true;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (!z2) {
                            }
                        }
                    } else {
                        lottieUrlDark = taxLossHarvestStrategiesLoading.getLottieUrlLight();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrlDark)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    List<String> loadingTitles = taxLossHarvestStrategiesLoading == null ? taxLossHarvestStrategiesLoading.getLoadingTitles() : null;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(loadingTitles);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        List<String> loadingTitles2 = taxLossHarvestStrategiesLoading != null ? taxLossHarvestStrategiesLoading.getLoadingTitles() : null;
                        objRememberedValue = loadingTitles2 != null ? CollectionsKt.emptyList() : loadingTitles2;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    list = (List) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(list);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    jCoerceAtLeast = RangesKt.coerceAtLeast(taxLossHarvestStrategiesLoading == null ? taxLossHarvestStrategiesLoading.getMinLoadingTimeMs() : 0L, 0L);
                    Long lValueOf = Long.valueOf(jCoerceAtLeast);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(jCoerceAtLeast);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        HarvestStrategyIntroScreen2 harvestStrategyIntroScreen2 = new HarvestStrategyIntroScreen2(list, jCoerceAtLeast, snapshotIntState2, null);
                        composerStartRestartGroup.updateRememberedValue(harvestStrategyIntroScreen2);
                        objRememberedValue3 = harvestStrategyIntroScreen2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(list, lValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_LOADING_OPTIONS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(2009924882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt.HarvestStrategyIntroLoadingScreen.2
                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2009924882, i6, -1, "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroLoadingScreen.<anonymous> (HarvestStrategyIntroScreen.kt:148)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            List<String> list2 = list;
                            LottieCompositionResult lottieCompositionResult = lottieCompositionResultRememberLottieComposition;
                            SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            LottieAnimation2.LottieAnimation(HarvestStrategyIntroScreen.HarvestStrategyIntroLoadingScreen$lambda$6(lottieCompositionResult), SizeKt.m5173sizeInqDBjuR0$default(companion2, 0.0f, 0.0f, HarvestStrategyIntroScreen.LottieSize, HarvestStrategyIntroScreen.LottieSize, 3, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer2, 1572912, 0, 0, 2097084);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), composer2, 0);
                            String str = (String) CollectionsKt.getOrNull(list2, HarvestStrategyIntroScreen.HarvestStrategyIntroLoadingScreen$lambda$9(snapshotIntState22));
                            composer2.startReplaceGroup(-264061626);
                            if (str != null) {
                                BentoText2.m20747BentoText38GnDrw(str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8120);
                            }
                            composer2.endReplaceGroup();
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
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if ((taxLossHarvestStrategiesLoading != null ? taxLossHarvestStrategiesLoading.getLottieUrlLight() : null) != null) {
                        z = true;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(lottieUrlDark)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    if (taxLossHarvestStrategiesLoading == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(loadingTitles);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        if (taxLossHarvestStrategiesLoading != null) {
                        }
                        if (loadingTitles2 != null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        list = (List) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(list);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            jCoerceAtLeast = RangesKt.coerceAtLeast(taxLossHarvestStrategiesLoading == null ? taxLossHarvestStrategiesLoading.getMinLoadingTimeMs() : 0L, 0L);
                            Long lValueOf2 = Long.valueOf(jCoerceAtLeast);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(jCoerceAtLeast);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                HarvestStrategyIntroScreen2 harvestStrategyIntroScreen22 = new HarvestStrategyIntroScreen2(list, jCoerceAtLeast, snapshotIntState2, null);
                                composerStartRestartGroup.updateRememberedValue(harvestStrategyIntroScreen22);
                                objRememberedValue3 = harvestStrategyIntroScreen22;
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(list, lValueOf2, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_LOADING_OPTIONS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(2009924882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt.HarvestStrategyIntroLoadingScreen.2
                                    public final void invoke(Composer composer2, int i6) {
                                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2009924882, i6, -1, "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroLoadingScreen.<anonymous> (HarvestStrategyIntroScreen.kt:148)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), 0.0f, 1, null);
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        List<String> list2 = list;
                                        LottieCompositionResult lottieCompositionResult = lottieCompositionResultRememberLottieComposition2;
                                        SnapshotIntState2 snapshotIntState22 = snapshotIntState2;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        LottieAnimation2.LottieAnimation(HarvestStrategyIntroScreen.HarvestStrategyIntroLoadingScreen$lambda$6(lottieCompositionResult), SizeKt.m5173sizeInqDBjuR0$default(companion2, 0.0f, 0.0f, HarvestStrategyIntroScreen.LottieSize, HarvestStrategyIntroScreen.LottieSize, 3, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer2, 1572912, 0, 0, 2097084);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i7 = BentoTheme.$stable;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM()), composer2, 0);
                                        String str = (String) CollectionsKt.getOrNull(list2, HarvestStrategyIntroScreen.HarvestStrategyIntroLoadingScreen$lambda$9(snapshotIntState22));
                                        composer2.startReplaceGroup(-264061626);
                                        if (str != null) {
                                            BentoText2.m20747BentoText38GnDrw(str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8120);
                                        }
                                        composer2.endReplaceGroup();
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
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HarvestStrategyIntroScreen.HarvestStrategyIntroLoadingScreen$lambda$12(taxLossHarvestStrategiesLoading, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            HttpUrl httpUrlBuild2 = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay() ? LightAsset : DarkAsset).build();
            composerStartRestartGroup.startReplaceGroup(1279365666);
            composerStartRestartGroup.startReplaceGroup(1279366196);
            if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategyIntroLoadedScreen$lambda$14$lambda$13(ComposableDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestStrategyIntroLoadedScreen(final HarvestStrategyIntroViewState.Loaded loadedState, final Function1<? super Boolean, Unit> onContinueClicked, Modifier modifier, Function1<? super ComposableDestination, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super ComposableDestination, Unit> function12;
        Function1<? super ComposableDestination, Unit> function13;
        final Modifier modifier3;
        final Function1<? super ComposableDestination, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(loadedState, "loadedState");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2056642895);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(loadedState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HarvestStrategyIntroScreen.HarvestStrategyIntroLoadedScreen$lambda$14$lambda$13((ComposableDestination) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function13 = (Function1) objRememberedValue;
                    } else {
                        function13 = function12;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2056642895, i3, -1, "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroLoadedScreen (HarvestStrategyIntroScreen.kt:188)");
                    }
                    Modifier modifier5 = modifier4;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_OPTIONS_INTRO, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-834349594, true, new C94452(modifier5, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), loadedState, onContinueClicked, Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(REMOTE_IMAGE_URL).build(), function13, (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler())), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function14 = function13;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function14 = function12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HarvestStrategyIntroScreen.HarvestStrategyIntroLoadedScreen$lambda$15(loadedState, onContinueClicked, modifier3, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_OPTIONS_INTRO, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-834349594, true, new C94452(modifier52, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), loadedState, onContinueClicked, Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(REMOTE_IMAGE_URL).build(), function13, (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler())), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                function14 = function13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
