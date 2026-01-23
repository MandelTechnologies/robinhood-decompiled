package com.robinhood.android.mcw.currencyconverter;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable3;
import com.robinhood.android.mcw.currencyconverter.components.ConversionHelperButtonBar;
import com.robinhood.android.mcw.currencyconverter.components.CurrencyConverterInput3;
import com.robinhood.android.mcw.currencyconverter.components.CurrencySwitcherSheet;
import com.robinhood.android.mcw.currencyconverter.components.CustomLoadingScreen4;
import com.robinhood.android.mcw.currencyconverter.components.ErrorDialogs2;
import com.robinhood.android.mcw.currencyconverter.components.FxRateInfoLink;
import com.robinhood.android.mcw.currencyconverter.models.ConversionField;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterEvent;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterInternalError;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterViewState;
import com.robinhood.android.mcw.currencyconverter.models.DisplayCurrency;
import com.robinhood.android.mcw.currencyconverter.util.Animations2;
import com.robinhood.android.mcw.currencyconverter.util.FieldAnimationValues;
import com.robinhood.android.mcw.currencyconverter.util.IconFlipAnimationValues;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.BentoCurrency;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CurrencyConverterComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aQ\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a5\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u0018\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020!X\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u008e\u0002"}, m3636d2 = {"TAG_LOADING_SCREEN", "", "TAG_MAIN_CONTENT", "TAG_SCROLL_CONTENT", "LOG_ID_FROM_CURRENCY_INPUT", "LOG_ID_TO_CURRENCY_INPUT", "LOG_ID_SWAP_INPUTS", "LOG_ID_FX_RATE_INFO", "LOG_ID_SUBMIT", "LOG_ID_CURRENCY_SELECT_SHEET", "CurrencyConverterComposable", "", "onCloseClick", "Lkotlin/Function0;", "onFxRateClick", "onConversionComplete", "Lkotlin/Function1;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent$ConversionCompleted;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "viewState", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterViewState$Loaded;", "(Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterViewState$Loaded;Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-mcw-currency-converter_externalDebug", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterViewState;", "eventFlow", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent;", "finishedInitialAnimation", "", "numpadIsVisible", "selectedSwitcherField", "Lcom/robinhood/android/mcw/currencyconverter/models/ConversionField;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CurrencyConverterComposable3 {
    private static final String LOG_ID_CURRENCY_SELECT_SHEET = "mcw_conversion_currency_selection_sheet";
    private static final String LOG_ID_FROM_CURRENCY_INPUT = "currency_conversion_select_from_currency";
    private static final String LOG_ID_FX_RATE_INFO = "currency_conversion_fx_rate_info_button";
    private static final String LOG_ID_SUBMIT = "conversion_submit_button";
    private static final String LOG_ID_SWAP_INPUTS = "currency_conversion_swap_button";
    private static final String LOG_ID_TO_CURRENCY_INPUT = "currency_conversion_select_to_currency";
    public static final String TAG_LOADING_SCREEN = "loading_screen";
    public static final String TAG_MAIN_CONTENT = "main_content";
    public static final String TAG_SCROLL_CONTENT = "scroll_content";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterComposable$lambda$10(Function0 function0, Function0 function02, Function1 function1, Modifier modifier, CurrencyConverterDuxo currencyConverterDuxo, int i, int i2, Composer composer, int i3) {
        CurrencyConverterComposable(function0, function02, function1, modifier, currencyConverterDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$21(CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(loaded, currencyConverterDuxo, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencyConverterComposable(final Function0<Unit> onCloseClick, final Function0<Unit> onFxRateClick, final Function1<? super CurrencyConverterEvent.ConversionCompleted, Unit> onConversionComplete, Modifier modifier, CurrencyConverterDuxo currencyConverterDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final CurrencyConverterDuxo currencyConverterDuxo2;
        int i4;
        int i5;
        final CurrencyConverterDuxo currencyConverterDuxo3;
        final Modifier modifier3;
        final Event<CurrencyConverterEvent> eventCurrencyConverterComposable$lambda$1;
        CurrencyConverterInternalError internalError;
        EventConsumer<CurrencyConverterEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onFxRateClick, "onFxRateClick");
        Intrinsics.checkNotNullParameter(onConversionComplete, "onConversionComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(537283601);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFxRateClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConversionComplete) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    currencyConverterDuxo2 = currencyConverterDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(currencyConverterDuxo2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    currencyConverterDuxo2 = currencyConverterDuxo;
                }
                i3 |= i7;
            } else {
                currencyConverterDuxo2 = currencyConverterDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CurrencyConverterDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$CurrencyConverterComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$CurrencyConverterComposable$$inlined$duxo$1.1
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
                        i5 = i3 & (-57345);
                        currencyConverterDuxo3 = (CurrencyConverterDuxo) baseDuxo;
                    } else {
                        i4 = -1633490746;
                        i5 = i3;
                        currencyConverterDuxo3 = currencyConverterDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    currencyConverterDuxo3 = currencyConverterDuxo2;
                    i4 = -1633490746;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(537283601, i5, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable (CurrencyConverterComposable.kt:80)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(currencyConverterDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventCurrencyConverterComposable$lambda$1 = CurrencyConverterComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(currencyConverterDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventCurrencyConverterComposable$lambda$1 != null && (eventCurrencyConverterComposable$lambda$1.getData() instanceof CurrencyConverterEvent.ConversionCompleted) && (eventConsumerInvoke = eventCurrencyConverterComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCurrencyConverterComposable$lambda$1, new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$CurrencyConverterComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16494invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16494invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onConversionComplete.invoke((CurrencyConverterEvent.ConversionCompleted) eventCurrencyConverterComposable$lambda$1.getData());
                        }
                    });
                }
                Composer composer2 = composerStartRestartGroup;
                CurrencyConverterDuxo currencyConverterDuxo4 = currencyConverterDuxo3;
                int i8 = i5;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(559843029, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt.CurrencyConverterComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(559843029, i9, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable.<anonymous> (CurrencyConverterComposable.kt:91)");
                        }
                        Function2<Composer, Integer, Unit> function2M2175xcfbe42d3 = CurrencyConverterComposable.INSTANCE.m2175xcfbe42d3();
                        final Function0<Unit> function0 = onCloseClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2175xcfbe42d3, null, ComposableLambda3.rememberComposableLambda(-52848874, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt.CurrencyConverterComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i10) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i10 & 6) == 0) {
                                    i10 |= (i10 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-52848874, i10, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable.<anonymous>.<anonymous> (CurrencyConverterComposable.kt:94)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1201592800, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt.CurrencyConverterComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i9 & 6) == 0) {
                            i9 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1201592800, i9, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable.<anonymous> (CurrencyConverterComposable.kt:100)");
                        }
                        CurrencyConverterViewState currencyConverterViewStateCurrencyConverterComposable$lambda$0 = CurrencyConverterComposable3.CurrencyConverterComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (currencyConverterViewStateCurrencyConverterComposable$lambda$0 instanceof CurrencyConverterViewState.Loading) {
                            composer3.startReplaceGroup(1901424046);
                            CustomLoadingScreen4.CustomLoadingScreen(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), "loading_screen"), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(currencyConverterViewStateCurrencyConverterComposable$lambda$0 instanceof CurrencyConverterViewState.Loaded)) {
                                composer3.startReplaceGroup(615523372);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(1901690429);
                            CurrencyConverterComposable3.MainContent((CurrencyConverterViewState.Loaded) currencyConverterViewStateCurrencyConverterComposable$lambda$0, currencyConverterDuxo3, onFxRateClick, TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), CurrencyConverterComposable3.TAG_MAIN_CONTENT), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 380);
                composerStartRestartGroup = composer2;
                internalError = CurrencyConverterComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInternalError();
                if (internalError != null) {
                    currencyConverterDuxo2 = currencyConverterDuxo4;
                } else if (Intrinsics.areEqual(internalError, CurrencyConverterInternalError.Fatal.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-106352138);
                    composerStartRestartGroup.startReplaceGroup(i4);
                    currencyConverterDuxo2 = currencyConverterDuxo4;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(currencyConverterDuxo2) | ((i8 & 14) == 4);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CurrencyConverterComposable3.CurrencyConverterComposable$lambda$9$lambda$4$lambda$3(currencyConverterDuxo2, onCloseClick);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ErrorDialogs2.FatalErrorDialog((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    currencyConverterDuxo2 = currencyConverterDuxo4;
                    if (Intrinsics.areEqual(internalError, CurrencyConverterInternalError.NonFatal.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(-106146794);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(currencyConverterDuxo2);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CurrencyConverterComposable3.CurrencyConverterComposable$lambda$9$lambda$6$lambda$5(currencyConverterDuxo2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ErrorDialogs2.NonFatalErrorDialog((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(internalError instanceof CurrencyConverterInternalError.MarketsClosed)) {
                            composerStartRestartGroup.startReplaceGroup(-1943095016);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-105962561);
                        String nextOpenTime = ((CurrencyConverterInternalError.MarketsClosed) internalError).getNextOpenTime();
                        composerStartRestartGroup.startReplaceGroup(i4);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(currencyConverterDuxo2) | ((i8 & 14) == 4);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CurrencyConverterComposable3.CurrencyConverterComposable$lambda$9$lambda$8$lambda$7(currencyConverterDuxo2, onCloseClick);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ErrorDialogs2.MarketsClosedDialog(nextOpenTime, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            final CurrencyConverterDuxo currencyConverterDuxo5 = currencyConverterDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CurrencyConverterComposable3.CurrencyConverterComposable$lambda$10(onCloseClick, onFxRateClick, onConversionComplete, modifier3, currencyConverterDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends CurrencyConverterViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(currencyConverterDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventCurrencyConverterComposable$lambda$1 = CurrencyConverterComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(currencyConverterDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventCurrencyConverterComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCurrencyConverterComposable$lambda$1, new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$CurrencyConverterComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16494invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16494invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onConversionComplete.invoke((CurrencyConverterEvent.ConversionCompleted) eventCurrencyConverterComposable$lambda$1.getData());
                        }
                    });
                }
                Composer composer22 = composerStartRestartGroup;
                CurrencyConverterDuxo currencyConverterDuxo42 = currencyConverterDuxo3;
                int i82 = i5;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.systemBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(559843029, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt.CurrencyConverterComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(559843029, i9, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable.<anonymous> (CurrencyConverterComposable.kt:91)");
                        }
                        Function2<Composer, Integer, Unit> function2M2175xcfbe42d3 = CurrencyConverterComposable.INSTANCE.m2175xcfbe42d3();
                        final Function0<Unit> function0 = onCloseClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2175xcfbe42d3, null, ComposableLambda3.rememberComposableLambda(-52848874, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt.CurrencyConverterComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i10) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i10 & 6) == 0) {
                                    i10 |= (i10 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i10 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-52848874, i10, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable.<anonymous>.<anonymous> (CurrencyConverterComposable.kt:94)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i10 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1201592800, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt.CurrencyConverterComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i9 & 6) == 0) {
                            i9 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1201592800, i9, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposable.<anonymous> (CurrencyConverterComposable.kt:100)");
                        }
                        CurrencyConverterViewState currencyConverterViewStateCurrencyConverterComposable$lambda$0 = CurrencyConverterComposable3.CurrencyConverterComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (currencyConverterViewStateCurrencyConverterComposable$lambda$0 instanceof CurrencyConverterViewState.Loading) {
                            composer3.startReplaceGroup(1901424046);
                            CustomLoadingScreen4.CustomLoadingScreen(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), "loading_screen"), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(currencyConverterViewStateCurrencyConverterComposable$lambda$0 instanceof CurrencyConverterViewState.Loaded)) {
                                composer3.startReplaceGroup(615523372);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(1901690429);
                            CurrencyConverterComposable3.MainContent((CurrencyConverterViewState.Loaded) currencyConverterViewStateCurrencyConverterComposable$lambda$0, currencyConverterDuxo3, onFxRateClick, TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), CurrencyConverterComposable3.TAG_MAIN_CONTENT), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, 805306416, 380);
                composerStartRestartGroup = composer22;
                internalError = CurrencyConverterComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getInternalError();
                if (internalError != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final CurrencyConverterDuxo currencyConverterDuxo52 = currencyConverterDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurrencyConverterViewState CurrencyConverterComposable$lambda$0(SnapshotState4<? extends CurrencyConverterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CurrencyConverterEvent> CurrencyConverterComposable$lambda$1(SnapshotState4<Event<CurrencyConverterEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainContent$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MainContent$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversionField MainContent$lambda$18(SnapshotState<ConversionField> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: CurrencyConverterComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$3 */
    static final class C216903 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
        final /* synthetic */ CurrencyConverterDuxo $duxo;
        final /* synthetic */ SnapshotState<Boolean> $numpadIsVisible$delegate;
        final /* synthetic */ Function0<Unit> $onFxRateClick;
        final /* synthetic */ CurrencyConverterViewState.Loaded $viewState;

        C216903(CurrencyConverterViewState.Loaded loaded, Function0<Unit> function0, CurrencyConverterDuxo currencyConverterDuxo, SnapshotState<Boolean> snapshotState) {
            this.$viewState = loaded;
            this.$onFxRateClick = function0;
            this.$duxo = currencyConverterDuxo;
            this.$numpadIsVisible$delegate = snapshotState;
        }

        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
            int i2;
            final CurrencyConverterDuxo currencyConverterDuxo;
            Modifier.Companion companion;
            SnapshotState<Boolean> snapshotState;
            CurrencyConverterViewState.Loaded loaded;
            Composer composer2;
            CurrencyConverterViewState.Loaded loaded2;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-357181590, i2, -1, "com.robinhood.android.mcw.currencyconverter.MainContent.<anonymous> (CurrencyConverterComposable.kt:334)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            CurrencyConverterViewState.Loaded loaded3 = this.$viewState;
            Function0<Unit> function0 = this.$onFxRateClick;
            CurrencyConverterDuxo currencyConverterDuxo2 = this.$duxo;
            SnapshotState<Boolean> snapshotState2 = this.$numpadIsVisible$delegate;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (loaded3.getForwardRate() == null || loaded3.getFxRateFeePercent() == null) {
                composer.startReplaceGroup(-85446488);
                String strStringResource = StringResources_androidKt.stringResource(C21706R.string.fx_rate_error, composer, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer, 6, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                currencyConverterDuxo = currencyConverterDuxo2;
                companion = companion2;
                snapshotState = snapshotState2;
                loaded = loaded3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21452getNegative0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextS(), composer, 0, 0, 8120);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-85029259);
                FxRateInfoLink.FxRateInfoLink(loaded3.getFromCurrency().getCurrency().getCurrencyCode(), loaded3.getToCurrency().getCurrency().getCurrencyCode(), loaded3.getForwardRate(), loaded3.getShowFxRateFee(), loaded3.getFxRateFeePercent(), ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, CurrencyConverterComposable3.LOG_ID_FX_RATE_INFO, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), function0, composer, 0, 0);
                composer2 = composer;
                composer2.endReplaceGroup();
                companion = companion2;
                currencyConverterDuxo = currencyConverterDuxo2;
                loaded = loaded3;
                snapshotState = snapshotState2;
            }
            if (loaded.getShowConvenienceActions()) {
                composer2.startReplaceGroup(-83820197);
                composer2.startReplaceGroup(-1633490746);
                final CurrencyConverterViewState.Loaded loaded4 = loaded;
                boolean zChangedInstance = composer2.changedInstance(loaded4) | composer2.changedInstance(currencyConverterDuxo);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216903.invoke$lambda$6$lambda$1$lambda$0(loaded4, currencyConverterDuxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer2.changedInstance(loaded4) | composer2.changedInstance(currencyConverterDuxo);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216903.invoke$lambda$6$lambda$3$lambda$2(loaded4, currencyConverterDuxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Function0 function03 = (Function0) objRememberedValue2;
                composer2.endReplaceGroup();
                ConversionHelperButtonBar.ConversionHelperButtonBar(function02, function03, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), loaded4.getForwardRate() != null, composer2, 0, 0);
                composer2.endReplaceGroup();
                loaded2 = loaded4;
            } else {
                final CurrencyConverterViewState.Loaded loaded5 = loaded;
                composer2.startReplaceGroup(-83075763);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SUBMIT, null, new Component(Component.ComponentType.BUTTON, CurrencyConverterComposable3.LOG_ID_SUBMIT, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C21706R.string.convert_currency_cta_text, composer2, 0);
                boolean conversionInProgress = loaded5.getConversionInProgress();
                boolean z = loaded5.getForwardRate() != null;
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer2.changedInstance(loaded5) | composer2.changedInstance(currencyConverterDuxo);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216903.invoke$lambda$6$lambda$5$lambda$4(loaded5, currencyConverterDuxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                loaded2 = loaded5;
                BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, null, null, false, null, null, (Function0) objRememberedValue3, strStringResource2, conversionInProgress, null, z, null, null, false, null, false, composer, 0, 0, 64062);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            AnimatedVisibilityKt.AnimatedVisibility(column6, CurrencyConverterComposable3.MainContent$lambda$15(snapshotState), (Modifier) null, Animations2.getNumpadEnterTransition(), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-306559780, true, new CurrencyConverterComposable5(BentoNumpadScreenLayout, loaded2, currencyConverterDuxo), composer2, 54), composer, 1575942, 26);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
            invoke(bentoNumpad4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo) {
            if (loaded.getUserInteractionEnabled()) {
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                currencyConverterDuxo.setFractionOfBalance(ONE);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2(CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo) {
            if (loaded.getUserInteractionEnabled()) {
                currencyConverterDuxo.setFractionOfBalance(new BigDecimal("0.5"));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo) {
            if (loaded.getUserInteractionEnabled()) {
                currencyConverterDuxo.convertCurrency(loaded.getFromAmount(), loaded.getToAmount());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$19(SnapshotState<ConversionField> snapshotState, ConversionField conversionField) {
        snapshotState.setValue(conversionField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterComposable$lambda$9$lambda$4$lambda$3(CurrencyConverterDuxo currencyConverterDuxo, Function0 function0) {
        currencyConverterDuxo.dismissInternalError();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterComposable$lambda$9$lambda$6$lambda$5(CurrencyConverterDuxo currencyConverterDuxo) {
        currencyConverterDuxo.dismissInternalError();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterComposable$lambda$9$lambda$8$lambda$7(CurrencyConverterDuxo currencyConverterDuxo, Function0 function0) {
        currencyConverterDuxo.dismissInternalError();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final CurrencyConverterViewState.Loaded loaded, CurrencyConverterDuxo currencyConverterDuxo, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        SnapshotState snapshotState2;
        Object objRememberedValue3;
        FieldAnimationValues fieldAnimationValuesRememberFieldAnimationValues;
        boolean zChangedInstance;
        Object objRememberedValue4;
        CurrencyConverterDuxo currencyConverterDuxo2;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1353232343);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(currencyConverterDuxo) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1353232343, i4, -1, "com.robinhood.android.mcw.currencyconverter.MainContent (CurrencyConverterComposable.kt:152)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                fieldAnimationValuesRememberFieldAnimationValues = Animations2.rememberFieldAnimationValues(composerStartRestartGroup, 0);
                IconFlipAnimationValues iconFlipAnimationValuesRememberIconFlipAnimationValues = Animations2.rememberIconFlipAnimationValues(composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(fieldAnimationValuesRememberFieldAnimationValues);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new CurrencyConverterComposable4(fieldAnimationValuesRememberFieldAnimationValues, snapshotState2, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                currencyConverterDuxo2 = currencyConverterDuxo;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifier3, ComposableLambda3.rememberComposableLambda(-1918665606, true, new C216892(loaded, fieldAnimationValuesRememberFieldAnimationValues, currencyConverterDuxo, snapshotState, snapshotState3, iconFlipAnimationValuesRememberIconFlipAnimationValues), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-357181590, true, new C216903(loaded, function0, currencyConverterDuxo2, snapshotState2), composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                currencyConverterDuxo2 = currencyConverterDuxo;
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                final CurrencyConverterDuxo currencyConverterDuxo3 = currencyConverterDuxo2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CurrencyConverterComposable3.MainContent$lambda$21(loaded, currencyConverterDuxo3, function0, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState snapshotState32 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            fieldAnimationValuesRememberFieldAnimationValues = Animations2.rememberFieldAnimationValues(composerStartRestartGroup, 0);
            IconFlipAnimationValues iconFlipAnimationValuesRememberIconFlipAnimationValues2 = Animations2.rememberIconFlipAnimationValues(composerStartRestartGroup, 0);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(fieldAnimationValuesRememberFieldAnimationValues);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue4 = new CurrencyConverterComposable4(fieldAnimationValuesRememberFieldAnimationValues, snapshotState2, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                currencyConverterDuxo2 = currencyConverterDuxo;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifier3, ComposableLambda3.rememberComposableLambda(-1918665606, true, new C216892(loaded, fieldAnimationValuesRememberFieldAnimationValues, currencyConverterDuxo, snapshotState, snapshotState32, iconFlipAnimationValuesRememberIconFlipAnimationValues2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-357181590, true, new C216903(loaded, function0, currencyConverterDuxo2, snapshotState2), composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MainContent$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CurrencyConverterComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2 */
    static final class C216892 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CurrencyConverterDuxo $duxo;
        final /* synthetic */ FieldAnimationValues $fieldAnimatables;
        final /* synthetic */ SnapshotState<Boolean> $finishedInitialAnimation$delegate;
        final /* synthetic */ IconFlipAnimationValues $iconFlipValues;
        final /* synthetic */ SnapshotState<ConversionField> $selectedSwitcherField$delegate;
        final /* synthetic */ CurrencyConverterViewState.Loaded $viewState;

        /* compiled from: CurrencyConverterComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConversionField.values().length];
                try {
                    iArr[ConversionField.FROM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConversionField.f4551TO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C216892(CurrencyConverterViewState.Loaded loaded, FieldAnimationValues fieldAnimationValues, CurrencyConverterDuxo currencyConverterDuxo, SnapshotState<Boolean> snapshotState, SnapshotState<ConversionField> snapshotState2, IconFlipAnimationValues iconFlipAnimationValues) {
            this.$viewState = loaded;
            this.$fieldAnimatables = fieldAnimationValues;
            this.$duxo = currencyConverterDuxo;
            this.$finishedInitialAnimation$delegate = snapshotState;
            this.$selectedSwitcherField$delegate = snapshotState2;
            this.$iconFlipValues = iconFlipAnimationValues;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$1$lambda$0(FieldAnimationValues fieldAnimationValues, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(fieldAnimationValues.getFromAlpha().getValue().floatValue());
            graphicsLayer.setTranslationY(fieldAnimationValues.getFromYOffsetPx().getValue().floatValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$3$lambda$2(CurrencyConverterDuxo currencyConverterDuxo, CurrencyConverterViewState.Loaded loaded) {
            currencyConverterDuxo.focusOn(ConversionField.FROM, loaded.getTargetAmount());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$5$lambda$4(SnapshotState snapshotState) {
            CurrencyConverterComposable3.MainContent$lambda$19(snapshotState, ConversionField.FROM);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$12$lambda$9$lambda$8(CurrencyConverterViewState.Loaded loaded, IconFlipAnimationValues iconFlipAnimationValues, CurrencyConverterDuxo currencyConverterDuxo) {
            if (loaded.getUserInteractionEnabled()) {
                iconFlipAnimationValues.isFlipped().setValue(Boolean.valueOf(!iconFlipAnimationValues.isFlipped().getValue().booleanValue()));
                currencyConverterDuxo.swapCurrencies();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$12$lambda$11$lambda$10(IconFlipAnimationValues iconFlipAnimationValues, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setRotationZ(90.0f);
            graphicsLayer.setRotationX(iconFlipAnimationValues.getRotationX().getValue().floatValue());
            graphicsLayer.setCameraDistance(8 * graphicsLayer.getDensity());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$14$lambda$13(FieldAnimationValues fieldAnimationValues, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(fieldAnimationValues.getToAlpha().getValue().floatValue());
            graphicsLayer.setTranslationY(fieldAnimationValues.getToYOffsetPx().getValue().floatValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$16$lambda$15(CurrencyConverterDuxo currencyConverterDuxo, CurrencyConverterViewState.Loaded loaded) {
            currencyConverterDuxo.focusOn(ConversionField.f4551TO, loaded.getTargetAmount());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$18$lambda$17(SnapshotState snapshotState) {
            CurrencyConverterComposable3.MainContent$lambda$19(snapshotState, ConversionField.f4551TO);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x0446  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x046f  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x049f  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x050e  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0525  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0527  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0546  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0548  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0553  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x055a  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x05ad  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0679  */
        /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x026e  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0294  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02ac  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0366  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0437  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) {
            BentoCurrency bentoCurrency;
            boolean zChangedInstance;
            Object objRememberedValue;
            Object objRememberedValue2;
            Composer.Companion companion;
            int currentCompositeKeyHash;
            Composer composerM6388constructorimpl;
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
            StringResource fieldError;
            boolean zChangedInstance2;
            Object objRememberedValue3;
            boolean zChanged;
            Object objRememberedValue4;
            boolean zChangedInstance3;
            Object objRememberedValue5;
            boolean zChangedInstance4;
            Object objRememberedValue6;
            Object objRememberedValue7;
            StringResource fieldError2;
            final ConversionField conversionFieldMainContent$lambda$18;
            DisplayCurrency fromCurrency;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1918665606, i, -1, "com.robinhood.android.mcw.currencyconverter.MainContent.<anonymous> (CurrencyConverterComposable.kt:168)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(ScrollKt.verticalScroll$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), "scroll_content");
            final CurrencyConverterViewState.Loaded loaded = this.$viewState;
            final FieldAnimationValues fieldAnimationValues = this.$fieldAnimatables;
            final CurrencyConverterDuxo currencyConverterDuxo = this.$duxo;
            SnapshotState<Boolean> snapshotState = this.$finishedInitialAnimation$delegate;
            final SnapshotState<ConversionField> snapshotState2 = this.$selectedSwitcherField$delegate;
            final IconFlipAnimationValues iconFlipAnimationValues = this.$iconFlipValues;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoCurrency currency = loaded.getFromCurrency().getCurrency();
            String fromAmount = loaded.getFromAmount();
            String balance = loaded.getFromCurrency().getBalance();
            ConversionField targetField = loaded.getTargetField();
            ConversionField conversionField = ConversionField.FROM;
            boolean z = targetField == conversionField;
            boolean z2 = loaded.getTargetField() == conversionField && loaded.getFieldError() != null;
            boolean z3 = CurrencyConverterComposable3.MainContent$lambda$12(snapshotState) && loaded.getTargetField() == conversionField;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(fieldAnimationValues);
            Object objRememberedValue8 = composer.rememberedValue();
            if (!zChangedInstance5) {
                bentoCurrency = currency;
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                composer.endReplaceGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue8);
                composer.startReplaceGroup(-1633490746);
                zChangedInstance = composer.changedInstance(currencyConverterDuxo) | composer.changedInstance(loaded);
                objRememberedValue = composer.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$3$lambda$2(currencyConverterDuxo, loaded);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierGraphicsLayer, false, null, null, (Function0) objRememberedValue, 7, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT_CURRENCY;
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, action, null, new Component(componentType, CurrencyConverterComposable3.LOG_ID_FROM_CURRENCY_INPUT, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                composer.startReplaceGroup(5004770);
                objRememberedValue2 = composer.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$5$lambda$4(snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                if (!loaded.getEnableCurrencyPicker()) {
                    function0 = null;
                }
                CurrencyConverterInput3.CurrencyConverterInput(bentoCurrency, fromAmount, balance, true, z, z2, z3, modifierAutoLogEvents$default, function0, composer, 3072, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.useNode();
                } else {
                    composer.createNode(constructor2);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                fieldError = loaded.getFieldError();
                if (fieldError != null || loaded.getTargetField() != conversionField) {
                    fieldError = null;
                }
                composer.startReplaceGroup(-1228860763);
                String textAsString = fieldError != null ? null : StringResources6.getTextAsString(fieldError, composer, StringResource.$stable);
                composer.endReplaceGroup();
                String str = textAsString != null ? "" : textAsString;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(str, Row5.weight$default(row6, PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 1, null), 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                composer.startReplaceGroup(-1746271574);
                zChangedInstance2 = composer.changedInstance(loaded) | composer.changed(iconFlipAnimationValues) | composer.changedInstance(currencyConverterDuxo);
                objRememberedValue3 = composer.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$12$lambda$9$lambda$8(loaded, iconFlipAnimationValues, currencyConverterDuxo);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function02 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.TRANSFERS_24);
                String strStringResource = StringResources_androidKt.stringResource(C21706R.string.swap_currencies_content_description, composer, 0);
                composer.startReplaceGroup(5004770);
                zChanged = composer.changed(iconFlipAnimationValues);
                objRememberedValue4 = composer.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$12$lambda$11$lambda$10(iconFlipAnimationValues, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(function02, heroSize24, strStringResource, ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue4), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SWAP_INPUTS, null, new Component(componentType, CurrencyConverterComposable3.LOG_ID_SWAP_INPUTS, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, false, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU()), null, null, false, composer, BentoIconButton4.Icon.HeroSize24.$stable << 3, 0, 1840);
                composer.endNode();
                BentoCurrency currency2 = loaded.getToCurrency().getCurrency();
                String toAmount = loaded.getToAmount();
                String balance2 = loaded.getToCurrency().getBalance();
                ConversionField targetField2 = loaded.getTargetField();
                ConversionField conversionField2 = ConversionField.f4551TO;
                boolean z4 = targetField2 != conversionField2;
                boolean z5 = (loaded.getTargetField() == conversionField2 || loaded.getFieldError() == null) ? false : true;
                boolean z6 = !CurrencyConverterComposable3.MainContent$lambda$12(snapshotState) && loaded.getTargetField() == conversionField2;
                composer.startReplaceGroup(5004770);
                zChangedInstance3 = composer.changedInstance(fieldAnimationValues);
                objRememberedValue5 = composer.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$14$lambda$13(fieldAnimationValues, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue5);
                composer.startReplaceGroup(-1633490746);
                zChangedInstance4 = composer.changedInstance(currencyConverterDuxo) | composer.changedInstance(loaded);
                objRememberedValue6 = composer.rememberedValue();
                if (!zChangedInstance4 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$16$lambda$15(currencyConverterDuxo, loaded);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierGraphicsLayer2, false, null, null, (Function0) objRememberedValue6, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, action, null, new Component(componentType, CurrencyConverterComposable3.LOG_ID_TO_CURRENCY_INPUT, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                composer.startReplaceGroup(5004770);
                objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$18$lambda$17(snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                Function0 function03 = (Function0) objRememberedValue7;
                composer.endReplaceGroup();
                CurrencyConverterInput3.CurrencyConverterInput(currency2, toAmount, balance2, false, z4, z5, z6, modifierAutoLogEvents$default2, !loaded.getEnableCurrencyPicker() ? function03 : null, composer, 3072, 0);
                fieldError2 = loaded.getFieldError();
                if (fieldError2 != null || loaded.getTargetField() != conversionField2) {
                    fieldError2 = null;
                }
                composer.startReplaceGroup(-1040479231);
                String textAsString2 = fieldError2 != null ? null : StringResources6.getTextAsString(fieldError2, composer, StringResource.$stable);
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(textAsString2 != null ? "" : textAsString2, PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                composer.endNode();
                conversionFieldMainContent$lambda$18 = CurrencyConverterComposable3.MainContent$lambda$18(this.$selectedSwitcherField$delegate);
                if (conversionFieldMainContent$lambda$18 != null) {
                    CurrencyConverterViewState.Loaded loaded2 = this.$viewState;
                    final CurrencyConverterDuxo currencyConverterDuxo2 = this.$duxo;
                    final SnapshotState<ConversionField> snapshotState3 = this.$selectedSwitcherField$delegate;
                    ImmutableList immutableList = extensions2.toImmutableList(loaded2.getDisplayCurrencies());
                    int i3 = WhenMappings.$EnumSwitchMapping$0[conversionFieldMainContent$lambda$18.ordinal()];
                    if (i3 == 1) {
                        fromCurrency = loaded2.getFromCurrency();
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fromCurrency = loaded2.getToCurrency();
                    }
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance6 = composer.changedInstance(currencyConverterDuxo2) | composer.changed(conversionFieldMainContent$lambda$18.ordinal());
                    Object objRememberedValue9 = composer.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CurrencyConverterComposable3.C216892.invoke$lambda$26$lambda$23$lambda$22(currencyConverterDuxo2, conversionFieldMainContent$lambda$18, (DisplayCurrency) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue9);
                    }
                    Function1 function1 = (Function1) objRememberedValue9;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue10 = composer.rememberedValue();
                    if (objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CurrencyConverterComposable3.C216892.invoke$lambda$26$lambda$25$lambda$24(snapshotState3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue10);
                    }
                    composer.endReplaceGroup();
                    CurrencySwitcherSheet.CurrencySwitcherSheet(immutableList, fromCurrency, conversionFieldMainContent$lambda$18, function1, (Function0) objRememberedValue10, ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, CurrencyConverterComposable3.LOG_ID_CURRENCY_SELECT_SHEET, null, 4, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), composer, 24576, 0);
                    Unit unit = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            bentoCurrency = currency;
            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$1$lambda$0(fieldAnimationValues, (GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer3 = GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue8);
            composer.startReplaceGroup(-1633490746);
            zChangedInstance = composer.changedInstance(currencyConverterDuxo) | composer.changedInstance(loaded);
            objRememberedValue = composer.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$3$lambda$2(currencyConverterDuxo, loaded);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierGraphicsLayer3, false, null, null, (Function0) objRememberedValue, 7, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.SELECT_CURRENCY;
            Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, action2, null, new Component(componentType2, CurrencyConverterComposable3.LOG_ID_FROM_CURRENCY_INPUT, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
            composer.startReplaceGroup(5004770);
            objRememberedValue2 = composer.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            Function0 function04 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            if (!loaded.getEnableCurrencyPicker()) {
            }
            CurrencyConverterInput3.CurrencyConverterInput(bentoCurrency, fromAmount, balance, true, z, z2, z3, modifierAutoLogEvents$default3, function04, composer, 3072, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
            if (composer.getApplier() == null) {
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier22, companion4.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            fieldError = loaded.getFieldError();
            if (fieldError != null) {
                fieldError = null;
            }
            composer.startReplaceGroup(-1228860763);
            if (fieldError != null) {
            }
            composer.endReplaceGroup();
            if (textAsString != null) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i22 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, Row5.weight$default(row62, PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme2.getSpacing(composer, i22).m21595getXsmallD9Ej5fM(), 1, null), 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i22).m21452getNegative0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i22).getTextS(), composer, 0, 0, 8184);
            composer.startReplaceGroup(-1746271574);
            zChangedInstance2 = composer.changedInstance(loaded) | composer.changed(iconFlipAnimationValues) | composer.changedInstance(currencyConverterDuxo);
            objRememberedValue3 = composer.rememberedValue();
            if (!zChangedInstance2) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$12$lambda$9$lambda$8(loaded, iconFlipAnimationValues, currencyConverterDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function022 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            BentoIconButton4.Icon.HeroSize24 heroSize242 = new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.TRANSFERS_24);
            String strStringResource2 = StringResources_androidKt.stringResource(C21706R.string.swap_currencies_content_description, composer, 0);
            composer.startReplaceGroup(5004770);
            zChanged = composer.changed(iconFlipAnimationValues);
            objRememberedValue4 = composer.rememberedValue();
            if (!zChanged) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$12$lambda$11$lambda$10(iconFlipAnimationValues, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoIconButton2.m20641BentoIconButtoncqYvz4g(function022, heroSize242, strStringResource2, ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue4), 0.0f, bentoTheme2.getSpacing(composer, i22).m21593getSmallD9Ej5fM(), 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SWAP_INPUTS, null, new Component(componentType2, CurrencyConverterComposable3.LOG_ID_SWAP_INPUTS, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, false, Color.m6701boximpl(bentoTheme2.getColors(composer, i22).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composer, i22).m21371getBg0d7_KjU()), null, null, false, composer, BentoIconButton4.Icon.HeroSize24.$stable << 3, 0, 1840);
            composer.endNode();
            BentoCurrency currency22 = loaded.getToCurrency().getCurrency();
            String toAmount2 = loaded.getToAmount();
            String balance22 = loaded.getToCurrency().getBalance();
            ConversionField targetField22 = loaded.getTargetField();
            ConversionField conversionField22 = ConversionField.f4551TO;
            if (targetField22 != conversionField22) {
            }
            if (loaded.getTargetField() == conversionField22) {
            }
            if (CurrencyConverterComposable3.MainContent$lambda$12(snapshotState)) {
            }
            composer.startReplaceGroup(5004770);
            zChangedInstance3 = composer.changedInstance(fieldAnimationValues);
            objRememberedValue5 = composer.rememberedValue();
            if (!zChangedInstance3) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$14$lambda$13(fieldAnimationValues, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer22 = GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue5);
            composer.startReplaceGroup(-1633490746);
            zChangedInstance4 = composer.changedInstance(currencyConverterDuxo) | composer.changedInstance(loaded);
            objRememberedValue6 = composer.rememberedValue();
            if (!zChangedInstance4) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$2$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CurrencyConverterComposable3.C216892.invoke$lambda$21$lambda$16$lambda$15(currencyConverterDuxo, loaded);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierGraphicsLayer22, false, null, null, (Function0) objRememberedValue6, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, action2, null, new Component(componentType2, CurrencyConverterComposable3.LOG_ID_TO_CURRENCY_INPUT, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
            composer.startReplaceGroup(5004770);
            objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
            }
            Function0 function032 = (Function0) objRememberedValue7;
            composer.endReplaceGroup();
            CurrencyConverterInput3.CurrencyConverterInput(currency22, toAmount2, balance22, false, z4, z5, z6, modifierAutoLogEvents$default22, !loaded.getEnableCurrencyPicker() ? function032 : null, composer, 3072, 0);
            fieldError2 = loaded.getFieldError();
            if (fieldError2 != null) {
                fieldError2 = null;
            }
            composer.startReplaceGroup(-1040479231);
            if (fieldError2 != null) {
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(textAsString2 != null ? "" : textAsString2, PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme2.getSpacing(composer, i22).m21595getXsmallD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i22).m21452getNegative0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i22).getTextS(), composer, 0, 0, 8184);
            composer.endNode();
            conversionFieldMainContent$lambda$18 = CurrencyConverterComposable3.MainContent$lambda$18(this.$selectedSwitcherField$delegate);
            if (conversionFieldMainContent$lambda$18 != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$23$lambda$22(CurrencyConverterDuxo currencyConverterDuxo, ConversionField conversionField, DisplayCurrency selected) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            currencyConverterDuxo.updateCurrency(selected.getCurrency(), conversionField);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$25$lambda$24(SnapshotState snapshotState) {
            CurrencyConverterComposable3.MainContent$lambda$19(snapshotState, null);
            return Unit.INSTANCE;
        }
    }
}
