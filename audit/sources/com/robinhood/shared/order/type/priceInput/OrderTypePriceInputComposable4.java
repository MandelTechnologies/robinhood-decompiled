package com.robinhood.shared.order.type.priceInput;

import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.AnimateShake;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.crypto.models.perpetuals.p289ui.PerpetualErrorDetails;
import com.robinhood.crypto.perpetuals.p290ui.PerpetualErrorDialog;
import com.robinhood.shared.crypto.p375ui.content.CryptoContentSheet;
import com.robinhood.shared.crypto.p375ui.content.CryptoContentState;
import com.robinhood.shared.crypto.perpetuals.api.PerpetualsErrorParser;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable4;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputEvent;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.order.type.priceInput.sheets.OrderTypePriceInputBottomSheet;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrderTypePriceInputComposable.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001aE\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010*X\u008a\u008e\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010,X\u008a\u008e\u0002"}, m3636d2 = {"OrderTypePriceInputComposable", "", "onActivityBackPress", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo;Landroidx/compose/runtime/Composer;II)V", "NumpadContent", "state", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onCtaClick", "(Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$NumpadState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MainContent", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "priceInputRowState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;", "priceForOrderState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;", "onPriceForOrderInfoClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PriceInputRow", "(Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceInputRowState;Landroidx/compose/runtime/Composer;I)V", "PriceForOrderRow", "onInfoClick", "(Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$PriceForOrderRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-order-type_externalDebug", "viewState", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent;", "bottomSheetContent", "Lcom/robinhood/shared/order/type/priceInput/sheets/OrderTypePriceInputBottomSheet;", "errorDetails", "Lcom/robinhood/crypto/models/perpetuals/ui/PerpetualErrorDetails;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypePriceInputComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$14(StringResource stringResource, StringResource stringResource2, OrderTypePriceInputViewState.PriceInputRowState priceInputRowState, OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(stringResource, stringResource2, priceInputRowState, priceForOrderRowState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumpadContent$lambda$12(OrderTypePriceInputViewState.NumpadState numpadState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        NumpadContent(numpadState, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypePriceInputComposable$lambda$10(Function0 function0, OrderTypePriceInputDuxo orderTypePriceInputDuxo, int i, int i2, Composer composer, int i3) {
        OrderTypePriceInputComposable(function0, orderTypePriceInputDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$17(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceForOrderRow$lambda$16(OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState, Function0 function0, int i, Composer composer, int i2) {
        PriceForOrderRow(priceForOrderRowState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceInputRow$lambda$15(OrderTypePriceInputViewState.PriceInputRowState priceInputRowState, int i, Composer composer, int i2) {
        PriceInputRow(priceInputRowState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderTypePriceInputComposable(final Function0<Unit> onActivityBackPress, OrderTypePriceInputDuxo orderTypePriceInputDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final OrderTypePriceInputDuxo orderTypePriceInputDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        final OrderTypePriceInputDuxo orderTypePriceInputDuxo3;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        final Event<OrderTypePriceInputEvent> eventOrderTypePriceInputComposable$lambda$1;
        final Event<OrderTypePriceInputEvent> eventOrderTypePriceInputComposable$lambda$12;
        EventConsumer<OrderTypePriceInputEvent> eventConsumerInvoke;
        EventConsumer<OrderTypePriceInputEvent> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(onActivityBackPress, "onActivityBackPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145168572);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(onActivityBackPress) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                orderTypePriceInputDuxo2 = orderTypePriceInputDuxo;
                int i4 = composerStartRestartGroup.changedInstance(orderTypePriceInputDuxo2) ? 32 : 16;
                i3 |= i4;
            } else {
                orderTypePriceInputDuxo2 = orderTypePriceInputDuxo;
            }
            i3 |= i4;
        } else {
            orderTypePriceInputDuxo2 = orderTypePriceInputDuxo;
        }
        int i5 = i3;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
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
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OrderTypePriceInputDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 &= -113;
                    orderTypePriceInputDuxo3 = (OrderTypePriceInputDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1145168572, i5, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable (OrderTypePriceInputComposable.kt:69)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(orderTypePriceInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(orderTypePriceInputDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                eventOrderTypePriceInputComposable$lambda$1 = OrderTypePriceInputComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventOrderTypePriceInputComposable$lambda$1 != null && (eventOrderTypePriceInputComposable$lambda$1.getData() instanceof OrderTypePriceInputEvent.Navigate) && (eventConsumerInvoke2 = eventOrderTypePriceInputComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventOrderTypePriceInputComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                            m25575invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25575invoke(Object it) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, ((OrderTypePriceInputEvent.Navigate) eventOrderTypePriceInputComposable$lambda$1.getData()).getComposeNav(), false, (Function1) null, 6, (Object) null);
                        }
                    });
                }
                eventOrderTypePriceInputComposable$lambda$12 = OrderTypePriceInputComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventOrderTypePriceInputComposable$lambda$12 != null && (eventOrderTypePriceInputComposable$lambda$12.getData() instanceof OrderTypePriceInputEvent.HandlePerpetualsError) && (eventConsumerInvoke = eventOrderTypePriceInputComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventOrderTypePriceInputComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25576invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25576invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$7(snapshotState, PerpetualsErrorParser.INSTANCE.parseError(((OrderTypePriceInputEvent.HandlePerpetualsError) eventOrderTypePriceInputComposable$lambda$12.getData()).getThrowable()));
                        }
                    });
                }
                Composer composer2 = composerStartRestartGroup;
                OrderTypePriceInputDuxo orderTypePriceInputDuxo4 = orderTypePriceInputDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-1878170616, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1878170616, i6, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous> (OrderTypePriceInputComposable.kt:88)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1277212661$lib_order_type_externalDebug = OrderTypePriceInputComposable.INSTANCE.getLambda$1277212661$lib_order_type_externalDebug();
                        final Function0<Unit> function0 = onActivityBackPress;
                        final SnapshotState4<OrderTypePriceInputViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1814173879, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.3.1

                            /* compiled from: OrderTypePriceInputComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$3$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[OrderTypePriceInputViewState.NavIcon.values().length];
                                    try {
                                        iArr[OrderTypePriceInputViewState.NavIcon.BACK.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[OrderTypePriceInputViewState.NavIcon.CLOSE.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                int i8;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i8 = ((i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i7;
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1814173879, i8, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:91)");
                                }
                                int i9 = WhenMappings.$EnumSwitchMapping$0[OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(snapshotState4).getNavIcon().ordinal()];
                                if (i9 == 1) {
                                    composer4.startReplaceGroup(1814545159);
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU()), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                    composer4.endReplaceGroup();
                                } else {
                                    if (i9 != 2) {
                                        composer4.startReplaceGroup(335625707);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(1814792229);
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU(), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final OrderTypePriceInputDuxo orderTypePriceInputDuxo5 = orderTypePriceInputDuxo3;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1277212661$lib_order_type_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1614998186, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.3.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                invoke(row5, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1614998186, i7, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:106)");
                                }
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                String strStringResource = StringResources_androidKt.stringResource(C39278R.string.crypto_order_types_input_action_content_desc, composer4, 0);
                                long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU();
                                OrderTypePriceInputDuxo orderTypePriceInputDuxo6 = orderTypePriceInputDuxo5;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer4.changedInstance(orderTypePriceInputDuxo6);
                                Object objRememberedValue4 = composer4.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new OrderTypePriceInputComposable5(orderTypePriceInputDuxo6);
                                    composer4.updateRememberedValue(objRememberedValue4);
                                }
                                composer4.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21368getAccent0d7_KjU, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer4, 6, 1), (Function0) ((KFunction) objRememberedValue4), false, composer4, BentoIcon4.Size24.$stable, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-870747053, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-870747053, i6, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous> (OrderTypePriceInputComposable.kt:117)");
                        }
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), ComposableLambda3.rememberComposableLambda(987722358, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, snapshotState2), composer3, 54), ComposableLambda3.rememberComposableLambda(-1985657498, true, new AnonymousClass2(orderTypePriceInputDuxo3, snapshotState4CollectAsStateWithLifecycle), composer3, 54), composer3, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: OrderTypePriceInputComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<OrderTypePriceInputBottomSheet> $bottomSheetContent$delegate;
                        final /* synthetic */ SnapshotState4<OrderTypePriceInputViewState> $viewState$delegate;

                        AnonymousClass1(SnapshotState4<OrderTypePriceInputViewState> snapshotState4, SnapshotState<OrderTypePriceInputBottomSheet> snapshotState) {
                            this.$viewState$delegate = snapshotState4;
                            this.$bottomSheetContent$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(987722358, i, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:120)");
                            }
                            StringResource title = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getTitle();
                            StringResource description = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getDescription();
                            OrderTypePriceInputViewState.PriceInputRowState priceInputRowState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getPriceInputRowState();
                            OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getPriceForOrderRowState();
                            composer.startReplaceGroup(5004770);
                            final SnapshotState<OrderTypePriceInputBottomSheet> snapshotState = this.$bottomSheetContent$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OrderTypePriceInputComposable4.C393004.AnonymousClass1.invoke$lambda$1$lambda$0(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            int i2 = StringResource.$stable;
                            OrderTypePriceInputComposable4.MainContent(title, description, priceInputRowState, priceForOrderRowState, (Function0) objRememberedValue, null, composer, i2 | 24576 | (i2 << 3) | (i2 << 6) | (i2 << 9), 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$4(snapshotState, OrderTypePriceInputBottomSheet.BID_ASK_PRICE_INFO_SHEET);
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: OrderTypePriceInputComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
                        final /* synthetic */ OrderTypePriceInputDuxo $duxo;
                        final /* synthetic */ SnapshotState4<OrderTypePriceInputViewState> $viewState$delegate;

                        AnonymousClass2(OrderTypePriceInputDuxo orderTypePriceInputDuxo, SnapshotState4<OrderTypePriceInputViewState> snapshotState4) {
                            this.$duxo = orderTypePriceInputDuxo;
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                            invoke(bentoNumpad4, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1985657498, i, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:131)");
                            }
                            OrderTypePriceInputViewState.NumpadState numpadState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getNumpadState();
                            OrderTypePriceInputDuxo orderTypePriceInputDuxo = this.$duxo;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(orderTypePriceInputDuxo);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new OrderTypePriceInputComposable6(orderTypePriceInputDuxo);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changed(this.$viewState$delegate);
                            final OrderTypePriceInputDuxo orderTypePriceInputDuxo2 = this.$duxo;
                            final SnapshotState4<OrderTypePriceInputViewState> snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OrderTypePriceInputComposable4.C393004.AnonymousClass2.invoke$lambda$2$lambda$1(orderTypePriceInputDuxo2, snapshotState4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            OrderTypePriceInputComposable4.NumpadContent(numpadState, function1, (Function0) objRememberedValue2, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(OrderTypePriceInputDuxo orderTypePriceInputDuxo, SnapshotState4 snapshotState4) {
                            OrderTypePriceInputViewState.ContinueArgs continueArgs = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(snapshotState4).getContinueArgs();
                            if (continueArgs == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            orderTypePriceInputDuxo.onContinue(continueArgs);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 509);
                composerStartRestartGroup = composer2;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(894827919, true, new C393025(snapshotState2, snapshotState4CollectAsStateWithLifecycle, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                orderTypePriceInputDuxo2 = orderTypePriceInputDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            }
            orderTypePriceInputDuxo3 = orderTypePriceInputDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<OrderTypePriceInputViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(orderTypePriceInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(orderTypePriceInputDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState<OrderTypePriceInputBottomSheet> snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            eventOrderTypePriceInputComposable$lambda$1 = OrderTypePriceInputComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventOrderTypePriceInputComposable$lambda$1 != null) {
                eventConsumerInvoke2.consume(eventOrderTypePriceInputComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                        m25575invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25575invoke(Object it) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(it, "it");
                        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, ((OrderTypePriceInputEvent.Navigate) eventOrderTypePriceInputComposable$lambda$1.getData()).getComposeNav(), false, (Function1) null, 6, (Object) null);
                    }
                });
            }
            eventOrderTypePriceInputComposable$lambda$12 = OrderTypePriceInputComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventOrderTypePriceInputComposable$lambda$12 != null) {
                eventConsumerInvoke.consume(eventOrderTypePriceInputComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25576invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25576invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$7(snapshotState, PerpetualsErrorParser.INSTANCE.parseError(((OrderTypePriceInputEvent.HandlePerpetualsError) eventOrderTypePriceInputComposable$lambda$12.getData()).getThrowable()));
                    }
                });
            }
            Composer composer22 = composerStartRestartGroup;
            OrderTypePriceInputDuxo orderTypePriceInputDuxo42 = orderTypePriceInputDuxo3;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-1878170616, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1878170616, i6, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous> (OrderTypePriceInputComposable.kt:88)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1277212661$lib_order_type_externalDebug = OrderTypePriceInputComposable.INSTANCE.getLambda$1277212661$lib_order_type_externalDebug();
                    final Function0<Unit> function0 = onActivityBackPress;
                    final SnapshotState4<OrderTypePriceInputViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1814173879, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.3.1

                        /* compiled from: OrderTypePriceInputComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$3$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[OrderTypePriceInputViewState.NavIcon.values().length];
                                try {
                                    iArr[OrderTypePriceInputViewState.NavIcon.BACK.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[OrderTypePriceInputViewState.NavIcon.CLOSE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            int i8;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i8 = ((i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i7;
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1814173879, i8, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:91)");
                            }
                            int i9 = WhenMappings.$EnumSwitchMapping$0[OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(snapshotState4).getNavIcon().ordinal()];
                            if (i9 == 1) {
                                composer4.startReplaceGroup(1814545159);
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU()), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                composer4.endReplaceGroup();
                            } else {
                                if (i9 != 2) {
                                    composer4.startReplaceGroup(335625707);
                                    composer4.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4.startReplaceGroup(1814792229);
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU(), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                composer4.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final OrderTypePriceInputDuxo orderTypePriceInputDuxo5 = orderTypePriceInputDuxo3;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1277212661$lib_order_type_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1614998186, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.3.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                            invoke(row5, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1614998186, i7, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:106)");
                            }
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                            String strStringResource = StringResources_androidKt.stringResource(C39278R.string.crypto_order_types_input_action_content_desc, composer4, 0);
                            long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU();
                            OrderTypePriceInputDuxo orderTypePriceInputDuxo6 = orderTypePriceInputDuxo5;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer4.changedInstance(orderTypePriceInputDuxo6);
                            Object objRememberedValue4 = composer4.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new OrderTypePriceInputComposable5(orderTypePriceInputDuxo6);
                                composer4.updateRememberedValue(objRememberedValue4);
                            }
                            composer4.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21368getAccent0d7_KjU, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer4, 6, 1), (Function0) ((KFunction) objRememberedValue4), false, composer4, BentoIcon4.Size24.$stable, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-870747053, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.OrderTypePriceInputComposable.4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-870747053, i6, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous> (OrderTypePriceInputComposable.kt:117)");
                    }
                    BentoNumpadScreenLayout.BentoNumpadScreenLayout(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), ComposableLambda3.rememberComposableLambda(987722358, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle3, snapshotState22), composer3, 54), ComposableLambda3.rememberComposableLambda(-1985657498, true, new AnonymousClass2(orderTypePriceInputDuxo3, snapshotState4CollectAsStateWithLifecycle3), composer3, 54), composer3, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: OrderTypePriceInputComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<OrderTypePriceInputBottomSheet> $bottomSheetContent$delegate;
                    final /* synthetic */ SnapshotState4<OrderTypePriceInputViewState> $viewState$delegate;

                    AnonymousClass1(SnapshotState4<OrderTypePriceInputViewState> snapshotState4, SnapshotState<OrderTypePriceInputBottomSheet> snapshotState) {
                        this.$viewState$delegate = snapshotState4;
                        this.$bottomSheetContent$delegate = snapshotState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(987722358, i, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:120)");
                        }
                        StringResource title = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getTitle();
                        StringResource description = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getDescription();
                        OrderTypePriceInputViewState.PriceInputRowState priceInputRowState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getPriceInputRowState();
                        OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getPriceForOrderRowState();
                        composer.startReplaceGroup(5004770);
                        final SnapshotState snapshotState = this.$bottomSheetContent$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderTypePriceInputComposable4.C393004.AnonymousClass1.invoke$lambda$1$lambda$0(snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        int i2 = StringResource.$stable;
                        OrderTypePriceInputComposable4.MainContent(title, description, priceInputRowState, priceForOrderRowState, (Function0) objRememberedValue, null, composer, i2 | 24576 | (i2 << 3) | (i2 << 6) | (i2 << 9), 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                        OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$4(snapshotState, OrderTypePriceInputBottomSheet.BID_ASK_PRICE_INFO_SHEET);
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: OrderTypePriceInputComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
                    final /* synthetic */ OrderTypePriceInputDuxo $duxo;
                    final /* synthetic */ SnapshotState4<OrderTypePriceInputViewState> $viewState$delegate;

                    AnonymousClass2(OrderTypePriceInputDuxo orderTypePriceInputDuxo, SnapshotState4<OrderTypePriceInputViewState> snapshotState4) {
                        this.$duxo = orderTypePriceInputDuxo;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                        invoke(bentoNumpad4, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1985657498, i, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:131)");
                        }
                        OrderTypePriceInputViewState.NumpadState numpadState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getNumpadState();
                        OrderTypePriceInputDuxo orderTypePriceInputDuxo = this.$duxo;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(orderTypePriceInputDuxo);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new OrderTypePriceInputComposable6(orderTypePriceInputDuxo);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changed(this.$viewState$delegate);
                        final OrderTypePriceInputDuxo orderTypePriceInputDuxo2 = this.$duxo;
                        final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderTypePriceInputComposable4.C393004.AnonymousClass2.invoke$lambda$2$lambda$1(orderTypePriceInputDuxo2, snapshotState4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        OrderTypePriceInputComposable4.NumpadContent(numpadState, function1, (Function0) objRememberedValue2, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(OrderTypePriceInputDuxo orderTypePriceInputDuxo, SnapshotState4 snapshotState4) {
                        OrderTypePriceInputViewState.ContinueArgs continueArgs = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(snapshotState4).getContinueArgs();
                        if (continueArgs == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        orderTypePriceInputDuxo.onContinue(continueArgs);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composer22, 805306416, 509);
            composerStartRestartGroup = composer22;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(894827919, true, new C393025(snapshotState22, snapshotState4CollectAsStateWithLifecycle3, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            orderTypePriceInputDuxo2 = orderTypePriceInputDuxo42;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$10(onActivityBackPress, orderTypePriceInputDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTypePriceInputViewState OrderTypePriceInputComposable$lambda$0(SnapshotState4<OrderTypePriceInputViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<OrderTypePriceInputEvent> OrderTypePriceInputComposable$lambda$1(SnapshotState4<Event<OrderTypePriceInputEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTypePriceInputBottomSheet OrderTypePriceInputComposable$lambda$3(SnapshotState<OrderTypePriceInputBottomSheet> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerpetualErrorDetails OrderTypePriceInputComposable$lambda$6(SnapshotState<PerpetualErrorDetails> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OrderTypePriceInputComposable$lambda$4(SnapshotState<OrderTypePriceInputBottomSheet> snapshotState, OrderTypePriceInputBottomSheet orderTypePriceInputBottomSheet) {
        snapshotState.setValue(orderTypePriceInputBottomSheet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OrderTypePriceInputComposable$lambda$7(SnapshotState<PerpetualErrorDetails> snapshotState, PerpetualErrorDetails perpetualErrorDetails) {
        snapshotState.setValue(perpetualErrorDetails);
    }

    /* compiled from: OrderTypePriceInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$5 */
    static final class C393025 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<OrderTypePriceInputBottomSheet> $bottomSheetContent$delegate;
        final /* synthetic */ SnapshotState<PerpetualErrorDetails> $errorDetails$delegate;
        final /* synthetic */ SnapshotState4<OrderTypePriceInputViewState> $viewState$delegate;

        C393025(SnapshotState<OrderTypePriceInputBottomSheet> snapshotState, SnapshotState4<OrderTypePriceInputViewState> snapshotState4, SnapshotState<PerpetualErrorDetails> snapshotState2) {
            this.$bottomSheetContent$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
            this.$errorDetails$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$4(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 CryptoContentSheet) {
            Intrinsics.checkNotNullParameter(CryptoContentSheet, "$this$CryptoContentSheet");
            RhModalBottomSheet5.hideBottomSheet$default(CryptoContentSheet, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CryptoContentState.TapAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(894827919, i, -1, "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable.<anonymous> (OrderTypePriceInputComposable.kt:140)");
            }
            composer.startReplaceGroup(5004770);
            final SnapshotState<OrderTypePriceInputBottomSheet> snapshotState = this.$bottomSheetContent$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTypePriceInputComposable4.C393025.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            OrderTypePriceInputBottomSheet orderTypePriceInputBottomSheetOrderTypePriceInputComposable$lambda$3 = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$3(this.$bottomSheetContent$delegate);
            composer.startReplaceGroup(936173730);
            if (orderTypePriceInputBottomSheetOrderTypePriceInputComposable$lambda$3 == OrderTypePriceInputBottomSheet.BID_ASK_PRICE_INFO_SHEET) {
                CryptoContentState bidAskPriceInfoSheetState = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$0(this.$viewState$delegate).getBidAskPriceInfoSheetState();
                if (bidAskPriceInfoSheetState == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OrderTypePriceInputComposable4.C393025.invoke$lambda$3$lambda$2((RhModalBottomSheet5) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$5$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OrderTypePriceInputComposable4.C393025.invoke$lambda$5$lambda$4((CryptoContentState.TapAction) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                composer2 = composer;
                CryptoContentSheet.CryptoContentSheet(bidAskPriceInfoSheetState, function1, null, function0, (Function1) objRememberedValue3, null, composer2, CryptoContentState.$stable | 28080, 32);
            } else {
                composer2 = composer;
                if (orderTypePriceInputBottomSheetOrderTypePriceInputComposable$lambda$3 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            composer2.endReplaceGroup();
            PerpetualErrorDetails perpetualErrorDetailsOrderTypePriceInputComposable$lambda$6 = OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$6(this.$errorDetails$delegate);
            if (perpetualErrorDetailsOrderTypePriceInputComposable$lambda$6 != null) {
                final SnapshotState<PerpetualErrorDetails> snapshotState2 = this.$errorDetails$delegate;
                composer2.startReplaceGroup(5004770);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$5$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderTypePriceInputComposable4.C393025.invoke$lambda$8$lambda$7$lambda$6(snapshotState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                PerpetualErrorDialog.PerpetualErrorDialog(perpetualErrorDetailsOrderTypePriceInputComposable$lambda$6, (Function0) objRememberedValue4, composer2, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState) {
            OrderTypePriceInputComposable4.OrderTypePriceInputComposable$lambda$7(snapshotState, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NumpadContent(final OrderTypePriceInputViewState.NumpadState numpadState, final Function1<? super KeyEvent, Unit> function1, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        final Function0<Unit> function02;
        final int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1159562330);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(numpadState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            i3 = i;
            function02 = function0;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1159562330, i2, -1, "com.robinhood.shared.order.type.priceInput.NumpadContent (OrderTypePriceInputComposable.kt:172)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C39278R.string.crypto_order_types_input_continue_cta, composerStartRestartGroup, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), null, null, numpadState.isCtaEnabled(), numpadState.isCtaLoading(), null, null, null, null, false, null, composer2, (i2 >> 6) & 14, 0, 8088);
            function02 = function0;
            i3 = i;
            BentoNumpad3.BentoNumpad(null, function1, true, null, true, numpadState.isNumpadEnabled(), composer2, (i2 & 112) | 28032, 1);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypePriceInputComposable4.NumpadContent$lambda$12(numpadState, function1, function02, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final StringResource stringResource, final StringResource stringResource2, final OrderTypePriceInputViewState.PriceInputRowState priceInputRowState, final OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-408740457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(priceInputRowState) : composerStartRestartGroup.changedInstance(priceInputRowState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(priceForOrderRowState) : composerStartRestartGroup.changedInstance(priceForOrderRowState) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-408740457, i3, -1, "com.robinhood.shared.order.type.priceInput.MainContent (OrderTypePriceInputComposable.kt:199)");
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i5 = StringResource.$stable;
                String string2 = StringResource2.getString(stringResource, composerStartRestartGroup, (i3 & 14) | i5);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                int i7 = i3;
                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(stringResource2, composerStartRestartGroup, i5 | ((i7 >> 3) & 14)), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                PriceInputRow(priceInputRowState, composer2, i5 | ((i7 >> 6) & 14));
                int i8 = i7 >> 9;
                PriceForOrderRow(priceForOrderRowState, function0, composer2, (i8 & 112) | i5 | (i8 & 14));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderTypePriceInputComposable4.MainContent$lambda$14(stringResource, stringResource2, priceInputRowState, priceForOrderRowState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                int i52 = StringResource.$stable;
                String string22 = StringResource2.getString(stringResource, composerStartRestartGroup, (i3 & 14) | i52);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                int i72 = i3;
                BentoText2.m20747BentoText38GnDrw(string22, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(stringResource2, composerStartRestartGroup, i52 | ((i72 >> 3) & 14)), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composer2, i62).m21592getMediumD9Ej5fM()), composer2, 0);
                PriceInputRow(priceInputRowState, composer2, i52 | ((i72 >> 6) & 14));
                int i82 = i72 >> 9;
                PriceForOrderRow(priceForOrderRowState, function0, composer2, (i82 & 112) | i52 | (i82 & 14));
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PriceInputRow(final OrderTypePriceInputViewState.PriceInputRowState priceInputRowState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1954299204);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(priceInputRowState) : composerStartRestartGroup.changedInstance(priceInputRowState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1954299204, i2, -1, "com.robinhood.shared.order.type.priceInput.PriceInputRow (OrderTypePriceInputComposable.kt:226)");
            }
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(713617503, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.PriceInputRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713617503, i3, -1, "com.robinhood.shared.order.type.priceInput.PriceInputRow.<anonymous> (OrderTypePriceInputComposable.kt:229)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(priceInputRowState.getLabel(), composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1687015907, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.PriceInputRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: OrderTypePriceInputComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$PriceInputRow$2$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ FocusRequester $focusRequester;
                    final /* synthetic */ OrderTypePriceInputViewState.PriceInputRowState $state;

                    AnonymousClass2(OrderTypePriceInputViewState.PriceInputRowState priceInputRowState, FocusRequester focusRequester) {
                        this.$state = priceInputRowState;
                        this.$focusRequester = focusRequester;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        long jM21425getFg0d7_KjU;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1572206569, i, -1, "com.robinhood.shared.order.type.priceInput.PriceInputRow.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:242)");
                        }
                        TextFieldValue inputTextFieldValue = this.$state.getInputTextFieldValue();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
                        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                        if (this.$state.getUseSecondaryTextColor()) {
                            composer.startReplaceGroup(987900652);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(987982957);
                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.endReplaceGroup();
                        }
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744442, null);
                        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.m5155defaultMinSizeVpY3zN4$default(ModifiersKt.bentoPillPlaceholder(Modifier.INSTANCE, this.$state.isLoading()), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 2, null), this.$focusRequester);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$PriceInputRow$2$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OrderTypePriceInputComposable4.C393052.AnonymousClass2.invoke$lambda$1$lambda$0((TextFieldValue) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BasicTextFieldKt.BasicTextField(inputTextFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue, modifierFocusRequester, false, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer, 100663344, 0, 48856);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(TextFieldValue it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1687015907, i3, -1, "com.robinhood.shared.order.type.priceInput.PriceInputRow.<anonymous> (OrderTypePriceInputComposable.kt:235)");
                    }
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                    composer2.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new OrderTypePriceInputComposable8(focusRequester, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 6);
                    AnimateShake.AnimateShake(null, priceInputRowState.getShakeAnimationKey(), ComposableLambda3.rememberComposableLambda(1572206569, true, new AnonymousClass2(priceInputRowState, focusRequester), composer2, 54), composer2, 384, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, true, false, true, null, composerStartRestartGroup, 818088960, 0, 1367);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypePriceInputComposable4.PriceInputRow$lambda$15(priceInputRowState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PriceForOrderRow(final OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1868405930);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(priceForOrderRowState) : composerStartRestartGroup.changedInstance(priceForOrderRowState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1868405930, i2, -1, "com.robinhood.shared.order.type.priceInput.PriceForOrderRow (OrderTypePriceInputComposable.kt:272)");
            }
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1592010474, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt.PriceForOrderRow.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1592010474, i3, -1, "com.robinhood.shared.order.type.priceInput.PriceForOrderRow.<anonymous> (OrderTypePriceInputComposable.kt:275)");
                    }
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i4).m21595getXsmallD9Ej5fM());
                    final OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState2 = priceForOrderRowState;
                    Function0<Unit> function02 = function0;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    LocalShowPlaceholder.Loadable(priceForOrderRowState2.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(1112039286, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$PriceForOrderRow$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1112039286, i5, -1, "com.robinhood.shared.order.type.priceInput.PriceForOrderRow.<anonymous>.<anonymous>.<anonymous> (OrderTypePriceInputComposable.kt:280)");
                            }
                            composer3.startReplaceGroup(-777100283);
                            OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState3 = priceForOrderRowState2;
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            builder.append(StringResource2.getString(priceForOrderRowState3.getLabel(), composer3, StringResource.$stable));
                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme2.getColors(composer3, i6).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                            try {
                                builder.append(priceForOrderRowState3.getPriceForOrder());
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composer3.endReplaceGroup();
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } catch (Throwable th) {
                                builder.pop(iPushStyle);
                                throw th;
                            }
                        }
                    }, composer2, 54), composer2, 3072, 6);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), ClickableKt.m4893clickableXHw0xAI$default(companion, !priceForOrderRowState2.isLoading(), null, null, function02, 6, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
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
            }, composerStartRestartGroup, 54), false, false, true, null, composerStartRestartGroup, 819462144, 0, 1343);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypePriceInputComposable4.PriceForOrderRow$lambda$16(priceForOrderRowState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1779626837);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1779626837, i, -1, "com.robinhood.shared.order.type.priceInput.Preview (OrderTypePriceInputComposable.kt:315)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, OrderTypePriceInputComposable.INSTANCE.m25572getLambda$1548545379$lib_order_type_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypePriceInputComposable4.Preview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
