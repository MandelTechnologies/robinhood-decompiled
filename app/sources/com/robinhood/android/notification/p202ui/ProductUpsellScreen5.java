package com.robinhood.android.notification.p202ui;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import coil.request.ImageRequest;
import coil.size.Size;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.notification.data.ProductUpsellActionType;
import com.robinhood.android.notification.data.ProductUpsellDuxo;
import com.robinhood.android.notification.data.ProductUpsellViewData;
import com.robinhood.android.notification.data.ProductUpsellViewState;
import com.robinhood.android.notification.p202ui.ProductUpsellScreen5;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProductUpsellScreen.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001au\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010 \u001a-\u0010!\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0002\u0010%\u001a9\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010*\u001a\r\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,¨\u0006-²\u0006\n\u0010\u0014\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"ProductUpsellScreen", "", "duxo", "Lcom/robinhood/android/notification/data/ProductUpsellDuxo;", "onCtaClick", "Lkotlin/Function1;", "Lcom/robinhood/android/notification/data/ProductUpsellActionType;", "Lkotlin/ParameterName;", "name", "actionType", "onExitRequested", "Lkotlin/Function0;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "(Lcom/robinhood/android/notification/data/ProductUpsellDuxo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/runtime/Composer;II)V", "MainContent", "systemUiController", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "colorScheme", "Lcom/robinhood/android/notification/ui/ColorScheme;", "viewState", "Lcom/robinhood/android/notification/data/ProductUpsellViewState$ContentReady;", "onPrimaryClick", "Lcom/robinhood/android/notification/data/ProductUpsellViewData;", ProductUpsellResource.CONTENT_TYPE_ID, "onSecondaryClick", "(Lcom/google/accompanist/systemuicontroller/SystemUiController;Lcom/robinhood/android/notification/ui/ColorScheme;Lcom/robinhood/android/notification/data/ProductUpsellViewState$ContentReady;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/runtime/Composer;II)V", "determineColorScheme", "isDay", "", "(ZLandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/notification/ui/ColorScheme;", "LoadingContent", "(Lcom/google/accompanist/systemuicontroller/SystemUiController;Lcom/robinhood/android/notification/ui/ColorScheme;Landroidx/compose/runtime/Composer;I)V", "HeaderContent", "url", "", "imageContentDescription", "(Lcom/google/accompanist/systemuicontroller/SystemUiController;Lcom/robinhood/android/notification/ui/ColorScheme;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CallToActionContent", "screen", "onPrimaryCtaClick", "onSecondaryCtaClick", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/notification/data/ProductUpsellViewData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NotificationUpsellPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-product-upsell_externalDebug", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.notification.ui.ProductUpsellScreenKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ProductUpsellScreen5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CallToActionContent$lambda$16(Screen screen, ProductUpsellViewData productUpsellViewData, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        CallToActionContent(screen, productUpsellViewData, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderContent$lambda$14(SystemUiController systemUiController, ColorScheme colorScheme, String str, String str2, int i, Composer composer, int i2) {
        HeaderContent(systemUiController, colorScheme, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$10(SystemUiController systemUiController, ColorScheme colorScheme, int i, Composer composer, int i2) {
        LoadingContent(systemUiController, colorScheme, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$9(SystemUiController systemUiController, ColorScheme colorScheme, ProductUpsellViewState.ContentReady contentReady, Function1 function1, Function1 function12, Screen screen, int i, int i2, Composer composer, int i3) {
        MainContent(systemUiController, colorScheme, contentReady, function1, function12, screen, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationUpsellPreview$lambda$17(int i, Composer composer, int i2) {
        NotificationUpsellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductUpsellScreen$lambda$5(ProductUpsellDuxo productUpsellDuxo, Function1 function1, Function0 function0, Screen screen, int i, int i2, Composer composer, int i3) {
        ProductUpsellScreen(productUpsellDuxo, function1, function0, screen, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductUpsellScreen(ProductUpsellDuxo productUpsellDuxo, final Function1<? super ProductUpsellActionType, Unit> onCtaClick, final Function0<Unit> onExitRequested, final Screen eventScreen, Composer composer, final int i, final int i2) {
        ProductUpsellDuxo productUpsellDuxo2;
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        ProductUpsellViewState productUpsellViewStateProductUpsellScreen$lambda$0;
        final ProductUpsellDuxo productUpsellDuxo3;
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Intrinsics.checkNotNullParameter(onExitRequested, "onExitRequested");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1103323912);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                productUpsellDuxo2 = productUpsellDuxo;
                int i4 = composerStartRestartGroup.changedInstance(productUpsellDuxo2) ? 4 : 2;
                i3 = i4 | i;
            } else {
                productUpsellDuxo2 = productUpsellDuxo;
            }
            i3 = i4 | i;
        } else {
            productUpsellDuxo2 = productUpsellDuxo;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExitRequested) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ProductUpsellDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$ProductUpsellScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$ProductUpsellScreen$$inlined$duxo$1.1
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
                    productUpsellDuxo2 = (ProductUpsellDuxo) baseDuxo;
                    i3 &= -15;
                }
                ProductUpsellDuxo productUpsellDuxo4 = productUpsellDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1103323912, i3, -1, "com.robinhood.android.notification.ui.ProductUpsellScreen (ProductUpsellScreen.kt:66)");
                }
                Composer composer2 = composerStartRestartGroup;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(productUpsellDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                composerStartRestartGroup = composer2;
                SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                ColorScheme colorSchemeDetermineColorScheme = determineColorScheme(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay(), composerStartRestartGroup, 0, 0);
                productUpsellViewStateProductUpsellScreen$lambda$0 = ProductUpsellScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (!(productUpsellViewStateProductUpsellScreen$lambda$0 instanceof ProductUpsellViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-261564621);
                    LoadingContent(systemUiControllerRememberSystemUiController, colorSchemeDetermineColorScheme, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (productUpsellViewStateProductUpsellScreen$lambda$0 instanceof ProductUpsellViewState.Error) {
                    composerStartRestartGroup.startReplaceGroup(-261450479);
                    composerStartRestartGroup.endReplaceGroup();
                    onExitRequested.invoke();
                } else if (productUpsellViewStateProductUpsellScreen$lambda$0 instanceof ProductUpsellViewState.Exit) {
                    composerStartRestartGroup.startReplaceGroup(-261366159);
                    composerStartRestartGroup.endReplaceGroup();
                    onExitRequested.invoke();
                } else {
                    if (!(productUpsellViewStateProductUpsellScreen$lambda$0 instanceof ProductUpsellViewState.ContentReady)) {
                        composerStartRestartGroup.startReplaceGroup(-562628638);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-261263208);
                    ProductUpsellViewState.ContentReady contentReady = (ProductUpsellViewState.ContentReady) productUpsellViewStateProductUpsellScreen$lambda$0;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i5 = i3 & 112;
                    boolean z = i5 == 32;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProductUpsellScreen5.ProductUpsellScreen$lambda$2$lambda$1(onCtaClick, (ProductUpsellViewData) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = i5 == 32;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ProductUpsellScreen5.ProductUpsellScreen$lambda$4$lambda$3(onCtaClick, (ProductUpsellViewData) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MainContent(systemUiControllerRememberSystemUiController, colorSchemeDetermineColorScheme, contentReady, function1, (Function1) objRememberedValue3, eventScreen, composerStartRestartGroup, (i3 << 6) & 458752, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                productUpsellDuxo3 = productUpsellDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                ProductUpsellDuxo productUpsellDuxo42 = productUpsellDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer22 = composerStartRestartGroup;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(productUpsellDuxo42.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                composerStartRestartGroup = composer22;
                SystemUiController systemUiControllerRememberSystemUiController2 = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                ColorScheme colorSchemeDetermineColorScheme2 = determineColorScheme(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay(), composerStartRestartGroup, 0, 0);
                productUpsellViewStateProductUpsellScreen$lambda$0 = ProductUpsellScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (!(productUpsellViewStateProductUpsellScreen$lambda$0 instanceof ProductUpsellViewState.Loading)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                productUpsellDuxo3 = productUpsellDuxo42;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            productUpsellDuxo3 = productUpsellDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellScreen5.ProductUpsellScreen$lambda$5(productUpsellDuxo3, onCtaClick, onExitRequested, eventScreen, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ProductUpsellScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.notification.ui.ProductUpsellScreenKt$MainContent$1 */
    static final class C226181 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ ColorScheme $colorScheme;
        final /* synthetic */ Screen $eventScreen;
        final /* synthetic */ Function1<ProductUpsellViewData, Unit> $onPrimaryClick;
        final /* synthetic */ Function1<ProductUpsellViewData, Unit> $onSecondaryClick;
        final /* synthetic */ SnapshotState<ProductUpsellViewData> $productUpsell$delegate;
        final /* synthetic */ SystemUiController $systemUiController;

        /* JADX WARN: Multi-variable type inference failed */
        C226181(SystemUiController systemUiController, ColorScheme colorScheme, SnapshotState<ProductUpsellViewData> snapshotState, Screen screen, Function1<? super ProductUpsellViewData, Unit> function1, Function1<? super ProductUpsellViewData, Unit> function12) {
            this.$systemUiController = systemUiController;
            this.$colorScheme = colorScheme;
            this.$productUpsell$delegate = snapshotState;
            this.$eventScreen = screen;
            this.$onPrimaryClick = function1;
            this.$onSecondaryClick = function12;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1819773582, i2, -1, "com.robinhood.android.notification.ui.MainContent.<anonymous> (ProductUpsellScreen.kt:119)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 2;
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5102getMaxHeightD9Ej5fM() / f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = BoxWithConstraints.align(modifierM5156height3ABfNKs, companion2.getTopCenter());
            SystemUiController systemUiController = this.$systemUiController;
            ColorScheme colorScheme = this.$colorScheme;
            SnapshotState<ProductUpsellViewData> snapshotState = this.$productUpsell$delegate;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAlign);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProductUpsellScreen5.HeaderContent(systemUiController, colorScheme, ProductUpsellScreen5.MainContent$lambda$8(snapshotState).getHeaderImageUrl(), ProductUpsellScreen5.MainContent$lambda$8(snapshotState).getTitle(), composer, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(companion, companion2.getBottomCenter()), colorScheme.m16762getDividerColor0d7_KjU(), C2002Dp.m7995constructorimpl(f), composer, 384, 0);
            composer.endNode();
            Modifier modifierAlign2 = BoxWithConstraints.align(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5102getMaxHeightD9Ej5fM() / f)), companion2.getBottomCenter());
            Screen screen = this.$eventScreen;
            final Function1<ProductUpsellViewData, Unit> function1 = this.$onPrimaryClick;
            final SnapshotState<ProductUpsellViewData> snapshotState2 = this.$productUpsell$delegate;
            final Function1<ProductUpsellViewData, Unit> function12 = this.$onSecondaryClick;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAlign2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ProductUpsellViewData productUpsellViewDataMainContent$lambda$8 = ProductUpsellScreen5.MainContent$lambda$8(snapshotState2);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changed(snapshotState2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$MainContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductUpsellScreen5.C226181.invoke$lambda$5$lambda$2$lambda$1(function1, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(function12) | composer.changed(snapshotState2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$MainContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProductUpsellScreen5.C226181.invoke$lambda$5$lambda$4$lambda$3(function12, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ProductUpsellScreen5.CallToActionContent(screen, productUpsellViewDataMainContent$lambda$8, function0, (Function0) objRememberedValue2, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1(Function1 function1, SnapshotState snapshotState) {
            function1.invoke(ProductUpsellScreen5.MainContent$lambda$8(snapshotState));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function1 function1, SnapshotState snapshotState) {
            function1.invoke(ProductUpsellScreen5.MainContent$lambda$8(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductUpsellViewData MainContent$lambda$8(SnapshotState<ProductUpsellViewData> snapshotState) {
        return snapshotState.getValue();
    }

    private static final ProductUpsellViewState ProductUpsellScreen$lambda$0(SnapshotState4<? extends ProductUpsellViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductUpsellScreen$lambda$2$lambda$1(Function1 function1, ProductUpsellViewData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it.getPrimaryActionType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductUpsellScreen$lambda$4$lambda$3(Function1 function1, ProductUpsellViewData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it.getSecondaryActionType());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(SystemUiController systemUiController, final ColorScheme colorScheme, final ProductUpsellViewState.ContentReady viewState, final Function1<? super ProductUpsellViewData, Unit> onPrimaryClick, final Function1<? super ProductUpsellViewData, Unit> onSecondaryClick, final Screen eventScreen, Composer composer, final int i, final int i2) {
        final SystemUiController systemUiControllerRememberSystemUiController;
        int i3;
        boolean z;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onPrimaryClick, "onPrimaryClick");
        Intrinsics.checkNotNullParameter(onSecondaryClick, "onSecondaryClick");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1054122296);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                systemUiControllerRememberSystemUiController = systemUiController;
                int i4 = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) ? 4 : 2;
                i3 = i4 | i;
            } else {
                systemUiControllerRememberSystemUiController = systemUiController;
            }
            i3 = i4 | i;
        } else {
            systemUiControllerRememberSystemUiController = systemUiController;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(colorScheme) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(viewState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr = {viewState.getProductUpsell()};
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 896) == 256) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductUpsellScreen5.MainContent$lambda$7$lambda$6(viewState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BoxWithConstraints.BoxWithConstraints(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), colorScheme.m16761getBackgroundColor0d7_KjU(), null, 2, null), null, false, ComposableLambda3.rememberComposableLambda(1819773582, true, new C226181(systemUiControllerRememberSystemUiController, colorScheme, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6), eventScreen, onPrimaryClick, onSecondaryClick), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                if ((i2 & 1) != 0) {
                    systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1054122296, i3, -1, "com.robinhood.android.notification.ui.MainContent (ProductUpsellScreen.kt:111)");
                }
                Object[] objArr2 = {viewState.getProductUpsell()};
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 896) == 256;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductUpsellScreen5.MainContent$lambda$7$lambda$6(viewState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxWithConstraints.BoxWithConstraints(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), colorScheme.m16761getBackgroundColor0d7_KjU(), null, 2, null), null, false, ComposableLambda3.rememberComposableLambda(1819773582, true, new C226181(systemUiControllerRememberSystemUiController, colorScheme, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6), eventScreen, onPrimaryClick, onSecondaryClick), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellScreen5.MainContent$lambda$9(systemUiControllerRememberSystemUiController, colorScheme, viewState, onPrimaryClick, onSecondaryClick, eventScreen, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MainContent$lambda$7$lambda$6(ProductUpsellViewState.ContentReady contentReady) {
        return SnapshotState3.mutableStateOf$default(contentReady.getProductUpsell(), null, 2, null);
    }

    public static final ColorScheme determineColorScheme(boolean z, Composer composer, int i, int i2) {
        ColorScheme colorScheme;
        composer.startReplaceGroup(-239775514);
        if ((i2 & 1) != 0) {
            z = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-239775514, i, -1, "com.robinhood.android.notification.ui.determineColorScheme (ProductUpsellScreen.kt:161)");
        }
        if (z) {
            composer.startReplaceGroup(1503970034);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            colorScheme = new ColorScheme(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), BentoColor.INSTANCE.m21220getDayJet0d7_KjU(), true, null);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1503979188);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            colorScheme = new ColorScheme(bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU(), bentoTheme2.getColors(composer, i4).m21456getPositive0d7_KjU(), bentoTheme2.getColors(composer, i4).m21371getBg0d7_KjU(), BentoColor.INSTANCE.m21235getDayNova0d7_KjU(), false, null);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colorScheme;
    }

    public static final void LoadingContent(SystemUiController systemUiController, final ColorScheme colorScheme, Composer composer, final int i) {
        int i2;
        final SystemUiController systemUiController2;
        Intrinsics.checkNotNullParameter(systemUiController, "systemUiController");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Composer composerStartRestartGroup = composer.startRestartGroup(2025762713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(systemUiController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(colorScheme) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025762713, i2, -1, "com.robinhood.android.notification.ui.LoadingContent (ProductUpsellScreen.kt:181)");
            }
            systemUiController2 = systemUiController;
            SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController2, colorScheme.m16763getLoadingStatusBarColor0d7_KjU(), colorScheme.getUseDarkIcons(), null, 4, null);
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), true, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            systemUiController2 = systemUiController;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellScreen5.LoadingContent$lambda$10(systemUiController2, colorScheme, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HeaderContent(final SystemUiController systemUiController, final ColorScheme colorScheme, final String url, final String imageContentDescription, Composer composer, final int i) {
        int i2;
        SnapshotState snapshotState;
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(systemUiController, "systemUiController");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageContentDescription, "imageContentDescription");
        Composer composerStartRestartGroup = composer.startRestartGroup(248253100);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(systemUiController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(colorScheme) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(url) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(imageContentDescription) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248253100, i2, -1, "com.robinhood.android.notification.ui.HeaderContent (ProductUpsellScreen.kt:197)");
            }
            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(url).crossfade(true).size(Size.ORIGINAL).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg.getState() instanceof AsyncImagePainter.State.Success) {
                i3 = i2;
                i4 = 1;
                snapshotState = snapshotState2;
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, colorScheme.m16764getStatusBarColor0d7_KjU(), colorScheme.getUseDarkIcons(), null, 4, null);
                snapshotState.setValue(Boolean.TRUE);
            } else {
                snapshotState = snapshotState2;
                i3 = i2;
                i4 = 1;
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, colorScheme.m16763getLoadingStatusBarColor0d7_KjU(), colorScheme.getUseDarkIcons(), null, 4, null);
                snapshotState.setValue(Boolean.FALSE);
            }
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i4, null), (((Boolean) snapshotState.getValue()).booleanValue() ? 1 : 0) ^ i4, null, 2, null), colorScheme.m16764getStatusBarColor0d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProductUpsellScreen5.HeaderContent$lambda$13$lambda$12((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM4872backgroundbw27NRU$default, false, (Function1) objRememberedValue2, i4, null);
            int i5 = ((i3 >> 6) & 112) | 24576;
            composer2 = composerStartRestartGroup;
            ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, imageContentDescription, modifierSemantics$default, (Alignment) null, crop, 0.0f, (ColorFilter) null, composer2, i5, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellScreen5.HeaderContent$lambda$14(systemUiController, colorScheme, url, imageContentDescription, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderContent$lambda$13$lambda$12(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, "ProductUpsellHeaderImage");
        return Unit.INSTANCE;
    }

    public static final void CallToActionContent(final Screen screen, final ProductUpsellViewData productUpsell, final Function0<Unit> onPrimaryCtaClick, final Function0<Unit> onSecondaryCtaClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(productUpsell, "productUpsell");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClick, "onPrimaryCtaClick");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClick, "onSecondaryCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1823347650);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(productUpsell) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryCtaClick) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1823347650, i2, -1, "com.robinhood.android.notification.ui.CallToActionContent (ProductUpsellScreen.kt:241)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ProductUpsellScreen6(current, screen, productUpsell, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, ProductUpsellScreen2.INSTANCE.m16765getLambda$2052431872$feature_product_upsell_externalDebug(), ComposableLambda3.rememberComposableLambda(69945940, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt.CallToActionContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(69945940, i3, -1, "com.robinhood.android.notification.ui.CallToActionContent.<anonymous> (ProductUpsellScreen.kt:268)");
                    }
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, onPrimaryCtaClick, productUpsell.getPrimaryCtaText(), false, null, false, onSecondaryCtaClick, productUpsell.getSecondaryCtaText(), false, null, false, composer2, 0, 0, 59198);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(894401854, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt.CallToActionContent.3
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(894401854, i3, -1, "com.robinhood.android.notification.ui.CallToActionContent.<anonymous> (ProductUpsellScreen.kt:278)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxHeight$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    ProductUpsellViewData productUpsellViewData = productUpsell;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, start, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 5, null), "ProductUpsellTitle");
                    String title = productUpsellViewData.getTitle();
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleLarge();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(productUpsellViewData.getBody(), TestTag3.testTag(companion, "ProductUpsellBody"), null, null, null, null, TextAlign.m7912boximpl(companion3.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16316);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellScreen5.CallToActionContent$lambda$16(screen, productUpsell, onPrimaryCtaClick, onSecondaryCtaClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void NotificationUpsellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(145142731);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(145142731, i, -1, "com.robinhood.android.notification.ui.NotificationUpsellPreview (ProductUpsellScreen.kt:318)");
            }
            ScarletManager scarletManager = ScarletManager2.getScarletManager(new ScarletContextWrapper((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), null, null, 6, null));
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), ScarletComposeInterop.themesForCompose(scarletManager), ProductUpsellScreen2.INSTANCE.getLambda$1596150525$feature_product_upsell_externalDebug(), composerStartRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.notification.ui.ProductUpsellScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductUpsellScreen5.NotificationUpsellPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
