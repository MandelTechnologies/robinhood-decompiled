package com.robinhood.shared.order.type.selection;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey3;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import com.robinhood.shared.order.type.selection.OrderTypeSelectionEvent;
import com.robinhood.shared.order.type.selection.OrderTypeSelectionViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OrderTypeSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001au\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\\\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u0084\u0002"}, m3636d2 = {"OrderTypeSelectionComposable", "", "onActivityBackPress", "Lkotlin/Function0;", "onOrderPricesSelected", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "Lkotlin/ParameterName;", "name", "orderPrices", "onEducationItemSelected", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "action", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$SectionState;", "onOrderTypeSelected", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderTypeRow", "state", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$OrderTypeRowState;", "onClick", "(Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$OrderTypeRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EducationTypeRow", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$EducationTypeRowState;", "(Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState$EducationTypeRowState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "lib-order-type_externalDebug", "viewState", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeSelectionComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EducationTypeRow$lambda$14(OrderTypeSelectionViewState.EducationTypeRowState educationTypeRowState, Function0 function0, int i, Composer composer, int i2) {
        EducationTypeRow(educationTypeRowState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$12(ImmutableList immutableList, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(immutableList, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeRow$lambda$13(OrderTypeSelectionViewState.OrderTypeRowState orderTypeRowState, Function0 function0, int i, Composer composer, int i2) {
        OrderTypeRow(orderTypeRowState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeSelectionComposable$lambda$4(Function0 function0, Function1 function1, Function1 function12, Modifier modifier, OrderTypeSelectionDuxo orderTypeSelectionDuxo, int i, int i2, Composer composer, int i3) {
        OrderTypeSelectionComposable(function0, function1, function12, modifier, orderTypeSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$15(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderTypeSelectionComposable(final Function0<Unit> onActivityBackPress, final Function1<? super CryptoOrderTypeFragmentKey5, Unit> onOrderPricesSelected, final Function1<? super CryptoOrderTypeFragmentKey3, Unit> onEducationItemSelected, Modifier modifier, OrderTypeSelectionDuxo orderTypeSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        OrderTypeSelectionDuxo orderTypeSelectionDuxo2;
        Modifier modifier3;
        int i4;
        CreationExtras defaultViewModelCreationExtras;
        final OrderTypeSelectionDuxo orderTypeSelectionDuxo3;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        final Event<OrderTypeSelectionEvent> eventOrderTypeSelectionComposable$lambda$1;
        final Event<OrderTypeSelectionEvent> eventOrderTypeSelectionComposable$lambda$12;
        final OrderTypeSelectionDuxo orderTypeSelectionDuxo4;
        EventConsumer<OrderTypeSelectionEvent> eventConsumerInvoke;
        EventConsumer<OrderTypeSelectionEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onActivityBackPress, "onActivityBackPress");
        Intrinsics.checkNotNullParameter(onOrderPricesSelected, "onOrderPricesSelected");
        Intrinsics.checkNotNullParameter(onEducationItemSelected, "onEducationItemSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2131360231);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onActivityBackPress) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderPricesSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEducationItemSelected) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    orderTypeSelectionDuxo2 = orderTypeSelectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(orderTypeSelectionDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    orderTypeSelectionDuxo2 = orderTypeSelectionDuxo;
                }
                i3 |= i6;
            } else {
                orderTypeSelectionDuxo2 = orderTypeSelectionDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OrderTypeSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-57345);
                        orderTypeSelectionDuxo3 = (OrderTypeSelectionDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2131360231, i4, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable (OrderTypeSelectionComposable.kt:47)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(orderTypeSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(orderTypeSelectionDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                        eventOrderTypeSelectionComposable$lambda$1 = OrderTypeSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventOrderTypeSelectionComposable$lambda$1 != null && (eventOrderTypeSelectionComposable$lambda$1.getData() instanceof OrderTypeSelectionEvent.Navigate) && (eventConsumerInvoke2 = eventOrderTypeSelectionComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventOrderTypeSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                                    m25582invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25582invoke(Object it) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, ((OrderTypeSelectionEvent.Navigate) eventOrderTypeSelectionComposable$lambda$1.getData()).getComposeNav(), false, (Function1) null, 6, (Object) null);
                                }
                            });
                        }
                        eventOrderTypeSelectionComposable$lambda$12 = OrderTypeSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventOrderTypeSelectionComposable$lambda$12 != null && (eventOrderTypeSelectionComposable$lambda$12.getData() instanceof OrderTypeSelectionEvent.OrderPriceSelected) && (eventConsumerInvoke = eventOrderTypeSelectionComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventOrderTypeSelectionComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25583invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25583invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onOrderPricesSelected.invoke(((OrderTypeSelectionEvent.OrderPriceSelected) eventOrderTypeSelectionComposable$lambda$12.getData()).getOrderPrice());
                                }
                            });
                        }
                        Composer composer2 = composerStartRestartGroup;
                        modifier2 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-1432017963, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeSelectionComposable.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1432017963, i7, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable.<anonymous> (OrderTypeSelectionComposable.kt:63)");
                                }
                                Function2<Composer, Integer, Unit> function2M25578getLambda$971561848$lib_order_type_externalDebug = OrderTypeSelectionComposable.INSTANCE.m25578getLambda$971561848$lib_order_type_externalDebug();
                                final Function0<Unit> function0 = onActivityBackPress;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25578getLambda$971561848$lib_order_type_externalDebug, null, ComposableLambda3.rememberComposableLambda(1049369524, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeSelectionComposable.3.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i8 & 6) == 0) {
                                            i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1049369524, i8, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable.<anonymous>.<anonymous> (OrderTypeSelectionComposable.kt:66)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU(), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-201953814, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeSelectionComposable.4
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues it, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((i7 & 6) == 0) {
                                    i7 |= composer3.changed(it) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-201953814, i7, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable.<anonymous> (OrderTypeSelectionComposable.kt:74)");
                                }
                                ImmutableList<OrderTypeSelectionViewState.SectionState> sections = OrderTypeSelectionComposable5.OrderTypeSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSections();
                                OrderTypeSelectionDuxo orderTypeSelectionDuxo5 = orderTypeSelectionDuxo3;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(orderTypeSelectionDuxo5);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new OrderTypeSelectionComposable9(orderTypeSelectionDuxo5);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                OrderTypeSelectionComposable5.MainContent(sections, (Function1) ((KFunction) objRememberedValue2), onEducationItemSelected, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, it), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 508);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        orderTypeSelectionDuxo4 = orderTypeSelectionDuxo3;
                    } else {
                        i4 = i3;
                    }
                }
                orderTypeSelectionDuxo3 = orderTypeSelectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<OrderTypeSelectionViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(orderTypeSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(orderTypeSelectionDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventOrderTypeSelectionComposable$lambda$1 = OrderTypeSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventOrderTypeSelectionComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventOrderTypeSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                            m25582invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25582invoke(Object it) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, ((OrderTypeSelectionEvent.Navigate) eventOrderTypeSelectionComposable$lambda$1.getData()).getComposeNav(), false, (Function1) null, 6, (Object) null);
                        }
                    });
                }
                eventOrderTypeSelectionComposable$lambda$12 = OrderTypeSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventOrderTypeSelectionComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventOrderTypeSelectionComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25583invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25583invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onOrderPricesSelected.invoke(((OrderTypeSelectionEvent.OrderPriceSelected) eventOrderTypeSelectionComposable$lambda$12.getData()).getOrderPrice());
                        }
                    });
                }
                Composer composer22 = composerStartRestartGroup;
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-1432017963, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeSelectionComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1432017963, i7, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable.<anonymous> (OrderTypeSelectionComposable.kt:63)");
                        }
                        Function2<Composer, Integer, Unit> function2M25578getLambda$971561848$lib_order_type_externalDebug = OrderTypeSelectionComposable.INSTANCE.m25578getLambda$971561848$lib_order_type_externalDebug();
                        final Function0<Unit> function0 = onActivityBackPress;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25578getLambda$971561848$lib_order_type_externalDebug, null, ComposableLambda3.rememberComposableLambda(1049369524, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeSelectionComposable.3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1049369524, i8, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable.<anonymous>.<anonymous> (OrderTypeSelectionComposable.kt:66)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21368getAccent0d7_KjU(), function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-201953814, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeSelectionComposable.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(it) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-201953814, i7, -1, "com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable.<anonymous> (OrderTypeSelectionComposable.kt:74)");
                        }
                        ImmutableList<OrderTypeSelectionViewState.SectionState> sections = OrderTypeSelectionComposable5.OrderTypeSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getSections();
                        OrderTypeSelectionDuxo orderTypeSelectionDuxo5 = orderTypeSelectionDuxo3;
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer3.changedInstance(orderTypeSelectionDuxo5);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new OrderTypeSelectionComposable9(orderTypeSelectionDuxo5);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        OrderTypeSelectionComposable5.MainContent(sections, (Function1) ((KFunction) objRememberedValue2), onEducationItemSelected, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, it), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer3, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, ((i4 >> 9) & 14) | 805306416, 508);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                orderTypeSelectionDuxo4 = orderTypeSelectionDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                orderTypeSelectionDuxo4 = orderTypeSelectionDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderTypeSelectionComposable5.OrderTypeSelectionComposable$lambda$4(onActivityBackPress, onOrderPricesSelected, onEducationItemSelected, modifier4, orderTypeSelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTypeSelectionViewState OrderTypeSelectionComposable$lambda$0(SnapshotState4<OrderTypeSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<OrderTypeSelectionEvent> OrderTypeSelectionComposable$lambda$1(SnapshotState4<Event<OrderTypeSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final ImmutableList<? extends OrderTypeSelectionViewState.SectionState> immutableList, final Function1<? super CryptoOrderTypeFragmentKey6, Unit> function1, final Function1<? super CryptoOrderTypeFragmentKey3, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-855709414);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-855709414, i3, -1, "com.robinhood.shared.order.type.selection.MainContent (OrderTypeSelectionComposable.kt:91)");
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = ((i3 & 14) != 4) | ((i3 & 896) != 256) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OrderTypeSelectionComposable5.MainContent$lambda$11$lambda$10(immutableList, function12, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderTypeSelectionComposable5.MainContent$lambda$12(immutableList, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            z = ((i3 & 14) != 4) | ((i3 & 896) != 256) | ((i3 & 112) == 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderTypeSelectionComposable5.MainContent$lambda$11$lambda$10(immutableList, function12, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OrderTypeRow(final OrderTypeSelectionViewState.OrderTypeRowState orderTypeRowState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1021478590);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(orderTypeRowState) : composerStartRestartGroup.changedInstance(orderTypeRowState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1021478590, i2, -1, "com.robinhood.shared.order.type.selection.OrderTypeRow (OrderTypeSelectionComposable.kt:130)");
            }
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function0, 7, null), null, ComposableLambda3.rememberComposableLambda(-1399459198, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1399459198, i3, -1, "com.robinhood.shared.order.type.selection.OrderTypeRow.<anonymous> (OrderTypeSelectionComposable.kt:134)");
                    }
                    int pogRes = orderTypeRowState.getPogRes();
                    composer3.startReplaceGroup(-555516833);
                    Color colorM6701boximpl = orderTypeRowState.getForegroundColorOverrideToAccent() ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU()) : null;
                    composer3.endReplaceGroup();
                    BentoPogKt.BentoPog(new BentoPogState(new BentoPogContent.Pictogram(pogRes, null, colorM6701boximpl, null), BentoPogDefaults.INSTANCE.getDefaultColors(composer3, BentoPogDefaults.$stable), null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer3, BentoPogState.$stable, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-349589983, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-349589983, i3, -1, "com.robinhood.shared.order.type.selection.OrderTypeRow.<anonymous> (OrderTypeSelectionComposable.kt:150)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(orderTypeRowState.getTitle(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(700279232, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.OrderTypeRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(700279232, i3, -1, "com.robinhood.shared.order.type.selection.OrderTypeRow.<anonymous> (OrderTypeSelectionComposable.kt:156)");
                    }
                    String string2 = StringResource2.getString(orderTypeRowState.getDescription(), composer3, StringResource.$stable);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextM(), composer3, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, true, null, composer2, 805334400, 0, 1506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypeSelectionComposable5.OrderTypeRow$lambda$13(orderTypeRowState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EducationTypeRow(final OrderTypeSelectionViewState.EducationTypeRowState educationTypeRowState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-422685954);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(educationTypeRowState) : composerStartRestartGroup.changedInstance(educationTypeRowState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-422685954, i2, -1, "com.robinhood.shared.order.type.selection.EducationTypeRow (OrderTypeSelectionComposable.kt:170)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1901806522, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.EducationTypeRow.1
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
                        ComposerKt.traceEventStart(-1901806522, i3, -1, "com.robinhood.shared.order.type.selection.EducationTypeRow.<anonymous> (OrderTypeSelectionComposable.kt:172)");
                    }
                    final OrderTypeSelectionViewState.EducationTypeRowState educationTypeRowState2 = educationTypeRowState;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(103352361, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.EducationTypeRow.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(103352361, i4, -1, "com.robinhood.shared.order.type.selection.EducationTypeRow.<anonymous>.<anonymous> (OrderTypeSelectionComposable.kt:174)");
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(educationTypeRowState2.getTitle(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer3, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final OrderTypeSelectionViewState.EducationTypeRowState educationTypeRowState3 = educationTypeRowState;
                    final Function0<Unit> function02 = function0;
                    BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(-1970668441, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt.EducationTypeRow.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1970668441, i4, -1, "com.robinhood.shared.order.type.selection.EducationTypeRow.<anonymous>.<anonymous> (OrderTypeSelectionComposable.kt:180)");
                            }
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function02, StringResource2.getString(educationTypeRowState3.getMeta(), composer3, StringResource.$stable), null, null, null, false, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, false, false, true, null, composer2, 805506048, 0, 1495);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypeSelectionComposable5.EducationTypeRow$lambda$14(educationTypeRowState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2015002089);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2015002089, i, -1, "com.robinhood.shared.order.type.selection.Preview (OrderTypeSelectionComposable.kt:192)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, OrderTypeSelectionComposable.INSTANCE.getLambda$4837169$lib_order_type_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypeSelectionComposable5.Preview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$11$lambda$10(ImmutableList immutableList, final Function1 function1, final Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            final OrderTypeSelectionViewState.SectionState sectionState = (OrderTypeSelectionViewState.SectionState) it.next();
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(883828988, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$1$1$1$1
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
                        ComposerKt.traceEventStart(883828988, i, -1, "com.robinhood.shared.order.type.selection.MainContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderTypeSelectionComposable.kt:95)");
                    }
                    String string2 = StringResource2.getString(sectionState.getTitle(), composer, StringResource.$stable);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            if (sectionState instanceof OrderTypeSelectionViewState.SectionState.EducationSectionState) {
                final ImmutableList<OrderTypeSelectionViewState.EducationTypeRowState> rows = ((OrderTypeSelectionViewState.SectionState.EducationSectionState) sectionState).getRows();
                final C39316xcd19e5b8 c39316xcd19e5b8 = new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$lambda$11$lambda$10$lambda$9$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(OrderTypeSelectionViewState.EducationTypeRowState educationTypeRowState) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((OrderTypeSelectionViewState.EducationTypeRowState) obj);
                    }
                };
                LazyColumn.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$lambda$11$lambda$10$lambda$9$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c39316xcd19e5b8.invoke(rows.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$lambda$11$lambda$10$lambda$9$$inlined$items$default$4
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
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final OrderTypeSelectionViewState.EducationTypeRowState educationTypeRowState = (OrderTypeSelectionViewState.EducationTypeRowState) rows.get(i);
                        composer.startReplaceGroup(24620123);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(function1) | composer.changedInstance(educationTypeRowState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function13 = function1;
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$1$1$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function13.invoke(educationTypeRowState.getAction());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        OrderTypeSelectionComposable5.EducationTypeRow(educationTypeRowState, (Function0) objRememberedValue, composer, StringResource.$stable);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            } else {
                if (!(sectionState instanceof OrderTypeSelectionViewState.SectionState.OrderSectionState)) {
                    throw new NoWhenBranchMatchedException();
                }
                final ImmutableList<OrderTypeSelectionViewState.OrderTypeRowState> rows2 = ((OrderTypeSelectionViewState.SectionState.OrderSectionState) sectionState).getRows();
                final C39320xcd19e5bc c39320xcd19e5bc = new Function1() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$lambda$11$lambda$10$lambda$9$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(OrderTypeSelectionViewState.OrderTypeRowState orderTypeRowState) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((OrderTypeSelectionViewState.OrderTypeRowState) obj);
                    }
                };
                LazyColumn.items(rows2.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$lambda$11$lambda$10$lambda$9$$inlined$items$default$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c39320xcd19e5bc.invoke(rows2.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$lambda$11$lambda$10$lambda$9$$inlined$items$default$8
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
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final OrderTypeSelectionViewState.OrderTypeRowState orderTypeRowState = (OrderTypeSelectionViewState.OrderTypeRowState) rows2.get(i);
                        composer.startReplaceGroup(-1211383599);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(function12) | composer.changedInstance(orderTypeRowState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function13 = function12;
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$MainContent$1$1$1$3$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function13.invoke(orderTypeRowState.getOrderType());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        OrderTypeSelectionComposable5.OrderTypeRow(orderTypeRowState, (Function0) objRememberedValue, composer, StringResource.$stable);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            LazyListScope.item$default(LazyColumn, null, null, OrderTypeSelectionComposable.INSTANCE.getLambda$922219123$lib_order_type_externalDebug(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
