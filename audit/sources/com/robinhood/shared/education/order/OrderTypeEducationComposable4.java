package com.robinhood.shared.education.order;

import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.content.res.ResourcesCompat;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.airbnb.lottie.model.KeyPath;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.PerpetualContractContext;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducation;
import com.robinhood.shared.education.order.OrderTypeEducationComposable4;
import com.robinhood.shared.education.order.OrderTypeEducationDuxo;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import rosetta.order.Side;

/* compiled from: OrderTypeEducationComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\"\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"OrderTypeEducationComposable", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "onClose", "Lkotlin/Function0;", "onPrimaryCtaClick", "modifier", "Landroidx/compose/ui/Modifier;", "onLearnMoreClicked", "duxo", "Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo;", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo;Landroidx/compose/runtime/Composer;II)V", "OrderTypeEducationLottie", "orderTypeEducation", "Lcom/robinhood/shared/education/order/OrderTypeEducation;", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;Lcom/robinhood/shared/education/order/OrderTypeEducation;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "animationColorOverrides", "Lcom/robinhood/shared/education/order/AnimationColorOverrides;", "getAnimationColorOverrides", "(Lcom/robinhood/shared/education/order/OrderTypeEducation;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/education/order/AnimationColorOverrides;", "convertDimensionRatioToFloat", "", "ratio", "", "lib-order-education_externalDebug", "viewState", "Lcom/robinhood/shared/education/order/OrderTypeEducationViewState;", "lottie", "Lcom/airbnb/lottie/LottieComposition;", "shouldRepeat", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.education.order.OrderTypeEducationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeEducationComposable4 {

    /* compiled from: OrderTypeEducationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderType.values().length];
            try {
                iArr2[OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Order.Configuration.values().length];
            try {
                iArr3[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Order.Configuration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Order.Configuration.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Order.Configuration.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeEducationComposable$lambda$6(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, Function0 function0, Function0 function02, Modifier modifier, Function0 function03, OrderTypeEducationDuxo orderTypeEducationDuxo, int i, int i2, Composer composer, int i3) {
        OrderTypeEducationComposable(orderTypeEducationConfiguration, function0, function02, modifier, function03, orderTypeEducationDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeEducationLottie$lambda$22(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, OrderTypeEducation orderTypeEducation, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        OrderTypeEducationLottie(orderTypeEducationConfiguration, orderTypeEducation, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderTypeEducationComposable(final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration, final Function0<Unit> onClose, final Function0<Unit> onPrimaryCtaClick, Modifier modifier, Function0<Unit> function0, OrderTypeEducationDuxo orderTypeEducationDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        OrderTypeEducationDuxo orderTypeEducationDuxo2;
        Modifier modifier3;
        Function0<Unit> function03;
        int i5;
        OrderTypeEducationDuxo orderTypeEducationDuxo3;
        Function0<Unit> function04;
        boolean z;
        Screen screen;
        Screen.Name name;
        Screen.Name name2;
        Context context;
        CryptoOrderContext.CryptoOrderType cryptoOrderType;
        Side side;
        PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType;
        PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide;
        Object objRememberedValue;
        final Function0<Unit> function05;
        final OrderTypeEducationDuxo orderTypeEducationDuxo4;
        final Modifier modifier4;
        CryptoOrderContext.CryptoOrderType cryptoOrderType2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClick, "onPrimaryCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1491173781);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(configuration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClick) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        orderTypeEducationDuxo2 = orderTypeEducationDuxo;
                        int i7 = composerStartRestartGroup.changedInstance(orderTypeEducationDuxo2) ? 131072 : 65536;
                        i3 |= i7;
                    } else {
                        orderTypeEducationDuxo2 = orderTypeEducationDuxo;
                    }
                    i3 |= i7;
                } else {
                    orderTypeEducationDuxo2 = orderTypeEducationDuxo;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    function05 = function02;
                    orderTypeEducationDuxo4 = orderTypeEducationDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue2;
                        } else {
                            function03 = function02;
                        }
                        if ((i2 & 32) == 0) {
                            OrderTypeEducationDuxo.InitArgs initArgs = new OrderTypeEducationDuxo.InitArgs(configuration);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OrderTypeEducationDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$$inlined$duxo$1.1
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
                            orderTypeEducationDuxo3 = (OrderTypeEducationDuxo) baseDuxo;
                            i5 = i3 & (-458753);
                        } else {
                            i5 = i3;
                            orderTypeEducationDuxo3 = orderTypeEducationDuxo2;
                        }
                        function04 = function03;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier3 = modifier2;
                        orderTypeEducationDuxo3 = orderTypeEducationDuxo2;
                        i5 = i3;
                        function04 = function02;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1491173781, i5, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable (OrderTypeEducationComposable.kt:74)");
                    }
                    z = configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder;
                    if (!z) {
                        screen = new Screen(Screen.Name.CRYPTO_ORDER_INFORMATION, null, null, null, 14, null);
                    } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
                        int i8 = WhenMappings.$EnumSwitchMapping$1[perpetualContract.getOrderConfiguration().getType().ordinal()];
                        if (i8 == 1) {
                            name2 = Screen.Name.NAME_UNSPECIFIED;
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i9 = WhenMappings.$EnumSwitchMapping$0[perpetualContract.getSide().ordinal()];
                            if (i9 == 1) {
                                name2 = Screen.Name.PERPETUALS_LIMIT_BUY_INTRO;
                            } else {
                                if (i9 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                name2 = Screen.Name.PERPETUALS_LIMIT_SELL_INTRO;
                            }
                        }
                        screen = new Screen(name2, null, null, null, 14, null);
                    } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) {
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) configuration;
                        int i10 = WhenMappings.$EnumSwitchMapping$1[tokenizedStocks.getOrderConfiguration().getType().ordinal()];
                        if (i10 == 1) {
                            name = Screen.Name.NAME_UNSPECIFIED;
                        } else {
                            if (i10 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i11 = WhenMappings.$EnumSwitchMapping$0[tokenizedStocks.getSide().ordinal()];
                            if (i11 == 1) {
                                name = Screen.Name.TOKENIZED_LIMIT_BUY_INTRO;
                            } else {
                                if (i11 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                name = Screen.Name.TOKENIZED_LIMIT_SELL_INTRO;
                            }
                        }
                        screen = new Screen(name, null, null, null, 14, null);
                    } else {
                        if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        screen = new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null);
                    }
                    Screen screen2 = screen;
                    if (!z) {
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
                        switch (WhenMappings.$EnumSwitchMapping$2[cryptoOrder.getOrderConfiguration().ordinal()]) {
                            case 1:
                                cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.MARKET;
                                break;
                            case 2:
                                cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.LIMIT;
                                break;
                            case 3:
                                cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.STOP_LOSS;
                                break;
                            case 4:
                                cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.STOP_LIMIT;
                                break;
                            case 5:
                                throw new IllegalStateException("Simple limit not supported");
                            case 6:
                                throw new IllegalStateException("Trailing stop not supported");
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        CryptoOrderContext.CryptoOrderType cryptoOrderType3 = cryptoOrderType2;
                        Side protobuf = Orders2.toProtobuf(cryptoOrder.getSide());
                        String strValueOf = String.valueOf(cryptoOrder.getInstrumentId());
                        String string2 = cryptoOrder.getOrderUuid().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoOrderContext(cryptoOrderType3, protobuf, strValueOf, string2, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048560, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null);
                    } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract2 = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
                        PerpetualContractContext perpetualContractContext = new PerpetualContractContext(String.valueOf(perpetualContract2.getInstrumentId()), null, null, null, null, 0.0d, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                        switch (WhenMappings.$EnumSwitchMapping$2[perpetualContract2.getOrderConfiguration().ordinal()]) {
                            case 1:
                                perpetualsOrderType = PerpetualsOrderContext.PerpetualsOrderType.MARKET;
                                break;
                            case 2:
                                perpetualsOrderType = PerpetualsOrderContext.PerpetualsOrderType.LIMIT;
                                break;
                            case 3:
                                throw new IllegalStateException("Stop loss not supported");
                            case 4:
                                throw new IllegalStateException("Stop limit not supported");
                            case 5:
                                throw new IllegalStateException("Simple limit not supported");
                            case 6:
                                throw new IllegalStateException("Trailing stop not supported");
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType2 = perpetualsOrderType;
                        int i12 = WhenMappings.$EnumSwitchMapping$0[perpetualContract2.getSide().ordinal()];
                        if (i12 == 1) {
                            perpetualsOrderSide = PerpetualsOrderContext.PerpetualsOrderSide.LONG;
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            perpetualsOrderSide = PerpetualsOrderContext.PerpetualsOrderSide.SHORT;
                        }
                        PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide2 = perpetualsOrderSide;
                        String strValueOf2 = String.valueOf(perpetualContract2.getInstrumentId());
                        String string3 = perpetualContract2.getOrderUuid().toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                        context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PerpetualsOrderContext(string3, strValueOf2, perpetualsOrderType2, perpetualsOrderSide2, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, null, 67108848, null), null, perpetualContractContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1342177281, 16383, null);
                    } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) {
                        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks2 = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) configuration;
                        switch (WhenMappings.$EnumSwitchMapping$2[tokenizedStocks2.getOrderConfiguration().ordinal()]) {
                            case 1:
                                cryptoOrderType = CryptoOrderContext.CryptoOrderType.MARKET;
                                break;
                            case 2:
                                cryptoOrderType = CryptoOrderContext.CryptoOrderType.LIMIT;
                                break;
                            case 3:
                                throw new IllegalStateException("Stop loss not supported");
                            case 4:
                                throw new IllegalStateException("Stop limit not supported");
                            case 5:
                                throw new IllegalStateException("Simple limit not supported");
                            case 6:
                                throw new IllegalStateException("Trailing stop not supported");
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        CryptoOrderContext.CryptoOrderType cryptoOrderType4 = cryptoOrderType;
                        int i13 = WhenMappings.$EnumSwitchMapping$0[tokenizedStocks2.getSide().ordinal()];
                        if (i13 == 1) {
                            side = Side.BUY;
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            side = Side.SELL;
                        }
                        context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoOrderContext(cryptoOrderType4, side, String.valueOf(tokenizedStocks2.getInstrumentId()), null, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048568, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null);
                    } else {
                        context = null;
                        if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    Context context2 = context;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderTypeEducationConfiguration2.toOrderTypeEducation(configuration);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(orderTypeEducationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Composer composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier3;
                    final Function0<Unit> function06 = function04;
                    OrderTypeEducationDuxo orderTypeEducationDuxo5 = orderTypeEducationDuxo3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(modifier5, new UserInteractionEventDescriptor(null, screen2, null, context2, null, null, 53, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(1868999471, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt.OrderTypeEducationComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1868999471, i14, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous> (OrderTypeEducationComposable.kt:181)");
                            }
                            Function2<Composer, Integer, Unit> lambda$517788316$lib_order_education_externalDebug = OrderTypeEducationComposable2.INSTANCE.getLambda$517788316$lib_order_education_externalDebug();
                            final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = configuration;
                            final Function0<Unit> function07 = onClose;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$517788316$lib_order_education_externalDebug, null, ComposableLambda3.rememberComposableLambda(267567088, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt.OrderTypeEducationComposable.2.1

                                /* compiled from: OrderTypeEducationComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$2$1$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[OrderTypeEducationFragmentKey.NavIconType.values().length];
                                        try {
                                            iArr[OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[OrderTypeEducationFragmentKey.NavIconType.CLOSE_BUTTON.ordinal()] = 2;
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

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i15) {
                                    int i16;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i15 & 6) == 0) {
                                        i16 = ((i15 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i15;
                                    } else {
                                        i16 = i15;
                                    }
                                    if ((i16 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(267567088, i16, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous>.<anonymous> (OrderTypeEducationComposable.kt:184)");
                                    }
                                    int i17 = WhenMappings.$EnumSwitchMapping$0[orderTypeEducationConfiguration.getToolbarNavIconType().ordinal()];
                                    if (i17 == 1) {
                                        composer4.startReplaceGroup(-368036012);
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function07, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (i17 != 2) {
                                            composer4.startReplaceGroup(-566065069);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(-367859374);
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function07, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), ComposableLambda3.rememberComposableLambda(-610480336, true, new C388013(configuration, orderTypeEducationDuxo5, onPrimaryCtaClick, onClose, snapshotState4CollectAsStateWithLifecycle), composer2, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(146586618, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt.OrderTypeEducationComposable.4
                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i14) throws Resources.NotFoundException {
                            int i15;
                            BentoTheme bentoTheme;
                            int i16;
                            float f;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i14 & 6) == 0) {
                                i15 = i14 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i15 = i14;
                            }
                            if ((i15 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(146586618, i15, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous> (OrderTypeEducationComposable.kt:224)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues);
                            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = configuration;
                            SnapshotState4<OrderTypeEducation> snapshotState42 = snapshotState4;
                            SnapshotState4<OrderTypeEducationViewState> snapshotState43 = snapshotState4CollectAsStateWithLifecycle;
                            Function0<Unit> function07 = function06;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i17 = BentoTheme.$stable;
                            Modifier.Companion companion3 = companion;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$4(snapshotState42).getTitleRes(), composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i17).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i17).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            StringResource prompt = OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$5(snapshotState43).getPrompt();
                            composer3.startReplaceGroup(-387229457);
                            if (prompt == null) {
                                bentoTheme = bentoTheme2;
                                i16 = i17;
                                f = 0.0f;
                            } else {
                                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer3, i17).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                companion3 = companion3;
                                bentoTheme = bentoTheme2;
                                i16 = i17;
                                f = 0.0f;
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(prompt, composer3, StringResource.$stable), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i17).getTextM(), composer3, 0, 0, 8188);
                            }
                            composer3.endReplaceGroup();
                            Modifier.Companion companion4 = companion3;
                            Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer3, 0);
                            BentoTheme bentoTheme3 = bentoTheme;
                            int i18 = i16;
                            OrderTypeEducationComposable4.OrderTypeEducationLottie(orderTypeEducationConfiguration, OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$4(snapshotState42), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, f, 1, null), bentoTheme3.getSpacing(composer3, i18).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer3, i18).m21593getSmallD9Ej5fM()), composer3, 0, 0);
                            BentoTheme bentoTheme4 = bentoTheme;
                            Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer3, 0);
                            Integer disclaimerRes = OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$4(snapshotState42).getDisclaimerRes();
                            composer3.startReplaceGroup(-387199062);
                            if (disclaimerRes != null) {
                                BentoTextWithLink.m20751BentoTextWithLinkIgVrAbQ(new AnnotatedString(StringResources_androidKt.stringResource(disclaimerRes.intValue(), composer3, 0), null, 2, null), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer3, 0), function07, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, f, bentoTheme4.getSpacing(composer3, i18).m21593getSmallD9Ej5fM(), 1, null), bentoTheme4.getColors(composer3, i18).m21425getFg0d7_KjU(), bentoTheme4.getTypography(composer3, i18).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer3, 0, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 805306800, 440);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function05 = function06;
                    orderTypeEducationDuxo4 = orderTypeEducationDuxo5;
                    modifier4 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$6(configuration, onClose, onPrimaryCtaClick, modifier4, function05, orderTypeEducationDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    function04 = function03;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z = configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder;
                    if (!z) {
                    }
                    Screen screen22 = screen;
                    if (!z) {
                    }
                    Context context22 = context;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final SnapshotState4<? extends OrderTypeEducation> snapshotState42 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState4<OrderTypeEducationViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(orderTypeEducationDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Composer composer22 = composerStartRestartGroup;
                    Modifier modifier52 = modifier3;
                    final Function0<Unit> function062 = function04;
                    OrderTypeEducationDuxo orderTypeEducationDuxo52 = orderTypeEducationDuxo3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.autoLogEvents$default(modifier52, new UserInteractionEventDescriptor(null, screen22, null, context22, null, null, 53, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), ComposableLambda3.rememberComposableLambda(1868999471, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt.OrderTypeEducationComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1868999471, i14, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous> (OrderTypeEducationComposable.kt:181)");
                            }
                            Function2<Composer, Integer, Unit> lambda$517788316$lib_order_education_externalDebug = OrderTypeEducationComposable2.INSTANCE.getLambda$517788316$lib_order_education_externalDebug();
                            final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = configuration;
                            final Function0<Unit> function07 = onClose;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$517788316$lib_order_education_externalDebug, null, ComposableLambda3.rememberComposableLambda(267567088, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt.OrderTypeEducationComposable.2.1

                                /* compiled from: OrderTypeEducationComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$2$1$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[OrderTypeEducationFragmentKey.NavIconType.values().length];
                                        try {
                                            iArr[OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[OrderTypeEducationFragmentKey.NavIconType.CLOSE_BUTTON.ordinal()] = 2;
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

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i15) {
                                    int i16;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i15 & 6) == 0) {
                                        i16 = ((i15 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i15;
                                    } else {
                                        i16 = i15;
                                    }
                                    if ((i16 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(267567088, i16, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous>.<anonymous> (OrderTypeEducationComposable.kt:184)");
                                    }
                                    int i17 = WhenMappings.$EnumSwitchMapping$0[orderTypeEducationConfiguration.getToolbarNavIconType().ordinal()];
                                    if (i17 == 1) {
                                        composer4.startReplaceGroup(-368036012);
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function07, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                        composer4.endReplaceGroup();
                                    } else {
                                        if (i17 != 2) {
                                            composer4.startReplaceGroup(-566065069);
                                            composer4.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer4.startReplaceGroup(-367859374);
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function07, composer4, (BentoAppBarScope.$stable << 12) | ((i16 << 12) & 57344), 7);
                                        composer4.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer22, 54), ComposableLambda3.rememberComposableLambda(-610480336, true, new C388013(configuration, orderTypeEducationDuxo52, onPrimaryCtaClick, onClose, snapshotState4CollectAsStateWithLifecycle2), composer22, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composer22, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(146586618, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt.OrderTypeEducationComposable.4
                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i14) throws Resources.NotFoundException {
                            int i15;
                            BentoTheme bentoTheme;
                            int i16;
                            float f;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i14 & 6) == 0) {
                                i15 = i14 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i15 = i14;
                            }
                            if ((i15 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(146586618, i15, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous> (OrderTypeEducationComposable.kt:224)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues);
                            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = configuration;
                            SnapshotState4<OrderTypeEducation> snapshotState422 = snapshotState42;
                            SnapshotState4<OrderTypeEducationViewState> snapshotState43 = snapshotState4CollectAsStateWithLifecycle2;
                            Function0<Unit> function07 = function062;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i17 = BentoTheme.$stable;
                            Modifier.Companion companion3 = companion;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$4(snapshotState422).getTitleRes(), composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i17).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i17).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            StringResource prompt = OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$5(snapshotState43).getPrompt();
                            composer3.startReplaceGroup(-387229457);
                            if (prompt == null) {
                                bentoTheme = bentoTheme2;
                                i16 = i17;
                                f = 0.0f;
                            } else {
                                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, bentoTheme2.getSpacing(composer3, i17).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                companion3 = companion3;
                                bentoTheme = bentoTheme2;
                                i16 = i17;
                                f = 0.0f;
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(prompt, composer3, StringResource.$stable), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i17).getTextM(), composer3, 0, 0, 8188);
                            }
                            composer3.endReplaceGroup();
                            Modifier.Companion companion4 = companion3;
                            Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer3, 0);
                            BentoTheme bentoTheme3 = bentoTheme;
                            int i18 = i16;
                            OrderTypeEducationComposable4.OrderTypeEducationLottie(orderTypeEducationConfiguration, OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$4(snapshotState422), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, f, 1, null), bentoTheme3.getSpacing(composer3, i18).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer3, i18).m21593getSmallD9Ej5fM()), composer3, 0, 0);
                            BentoTheme bentoTheme4 = bentoTheme;
                            Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer3, 0);
                            Integer disclaimerRes = OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$4(snapshotState422).getDisclaimerRes();
                            composer3.startReplaceGroup(-387199062);
                            if (disclaimerRes != null) {
                                BentoTextWithLink.m20751BentoTextWithLinkIgVrAbQ(new AnnotatedString(StringResources_androidKt.stringResource(disclaimerRes.intValue(), composer3, 0), null, 2, null), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer3, 0), function07, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, f, bentoTheme4.getSpacing(composer3, i18).m21593getSmallD9Ej5fM(), 1, null), bentoTheme4.getColors(composer3, i18).m21425getFg0d7_KjU(), bentoTheme4.getTypography(composer3, i18).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), composer3, 0, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer22, 54), composer22, 805306800, 440);
                    composerStartRestartGroup = composer22;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function05 = function062;
                    orderTypeEducationDuxo4 = orderTypeEducationDuxo52;
                    modifier4 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTypeEducation OrderTypeEducationComposable$lambda$4(SnapshotState4<? extends OrderTypeEducation> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderTypeEducationViewState OrderTypeEducationComposable$lambda$5(SnapshotState4<OrderTypeEducationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean OrderTypeEducationLottie$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition OrderTypeEducationLottie$lambda$7(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* compiled from: OrderTypeEducationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$3 */
    static final class C388013 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration $configuration;
        final /* synthetic */ OrderTypeEducationDuxo $duxo;
        final /* synthetic */ Function0<Unit> $onClose;
        final /* synthetic */ Function0<Unit> $onPrimaryCtaClick;
        final /* synthetic */ SnapshotState4<OrderTypeEducationViewState> $viewState$delegate;

        C388013(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, OrderTypeEducationDuxo orderTypeEducationDuxo, Function0<Unit> function0, Function0<Unit> function02, SnapshotState4<OrderTypeEducationViewState> snapshotState4) {
            this.$configuration = orderTypeEducationConfiguration;
            this.$duxo = orderTypeEducationDuxo;
            this.$onPrimaryCtaClick = function0;
            this.$onClose = function02;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Function0 function0;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-610480336, i, -1, "com.robinhood.shared.education.order.OrderTypeEducationComposable.<anonymous> (OrderTypeEducationComposable.kt:197)");
            }
            if (this.$configuration.getShowContinueBtn() || OrderTypeEducationComposable4.OrderTypeEducationComposable$lambda$5(this.$viewState$delegate).getShowDismissButton()) {
                Function0 function02 = null;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                composer.startReplaceGroup(1738927229);
                if (this.$configuration.getShowContinueBtn()) {
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$onPrimaryCtaClick);
                    final OrderTypeEducationDuxo orderTypeEducationDuxo = this.$duxo;
                    final Function0<Unit> function03 = this.$onPrimaryCtaClick;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderTypeEducationComposable4.C388013.invoke$lambda$1$lambda$0(orderTypeEducationDuxo, function03);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    function0 = (Function0) objRememberedValue;
                } else {
                    function0 = null;
                }
                composer.endReplaceGroup();
                boolean showContinueBtn = this.$configuration.getShowContinueBtn();
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dont_show_this_again, composer, 0);
                composer.startReplaceGroup(1738943185);
                if (this.$configuration.getShowDismissBtn()) {
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changed(this.$onClose);
                    final OrderTypeEducationDuxo orderTypeEducationDuxo2 = this.$duxo;
                    final Function0<Unit> function04 = this.$onClose;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$OrderTypeEducationComposable$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderTypeEducationComposable4.C388013.invoke$lambda$3$lambda$2(orderTypeEducationDuxo2, function04);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    function02 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function0, strStringResource, false, null, showContinueBtn, function02, strStringResource2, false, null, this.$configuration.getShowDismissBtn(), composer, 0, 0, 25406);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OrderTypeEducationDuxo orderTypeEducationDuxo, Function0 function0) {
            orderTypeEducationDuxo.onContinueClicked();
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(OrderTypeEducationDuxo orderTypeEducationDuxo, Function0 function0) {
            orderTypeEducationDuxo.onDismissClicked();
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031a A[LOOP:5: B:106:0x0314->B:108:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[LOOP:0: B:47:0x00d4->B:49:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130 A[LOOP:1: B:51:0x012a->B:53:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181 A[LOOP:2: B:55:0x017b->B:57:0x0181, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderTypeEducationLottie(final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, final OrderTypeEducation orderTypeEducation, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        List<KeyPath> paths;
        List<KeyPath> paths2;
        Iterator it;
        List<Tuples2<String, Integer>> animationCopy;
        Iterator it2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        LottieClipSpec.Markers markers;
        SnapshotState snapshotState;
        ?? r16;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        final Modifier modifier3;
        String repeatMarker;
        List list;
        int i4;
        Object[] array2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1761002111);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(orderTypeEducationConfiguration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(orderTypeEducation.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1761002111, i3, -1, "com.robinhood.shared.education.order.OrderTypeEducationLottie (OrderTypeEducationComposable.kt:277)");
                }
                Modifier modifier5 = modifier4;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(orderTypeEducation.getAnimationRes().getLottieCompositionSpec(composerStartRestartGroup, 0), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Typeface font = ResourcesCompat.getFont((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), C16915R.font.capsule_sans_text_book);
                AnimationColorOverrides animationColorOverrides = getAnimationColorOverrides(orderTypeEducation, composerStartRestartGroup, (i3 >> 3) & 14);
                OrderTypeEducation.KeyPaths keyPaths = orderTypeEducation.getKeyPaths();
                List<KeyPath> foregroundColor = keyPaths.getForegroundColor();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(foregroundColor, 10));
                for (KeyPath keyPath : foregroundColor) {
                    arrayList.add(CollectionsKt.listOf((Object[]) new LottieDynamicProperties3[]{new LottieDynamicProperties3(LottieProperty.COLOR, keyPath, Integer.valueOf(animationColorOverrides.getForegroundColor())), new LottieDynamicProperties3(LottieProperty.STROKE_COLOR, keyPath, Integer.valueOf(animationColorOverrides.getForegroundColor()))}));
                }
                List listFlatten = CollectionsKt.flatten(arrayList);
                List<KeyPath> primaryColor = keyPaths.getPrimaryColor();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primaryColor, 10));
                for (KeyPath keyPath2 : primaryColor) {
                    arrayList2.add(CollectionsKt.listOf((Object[]) new LottieDynamicProperties3[]{new LottieDynamicProperties3(LottieProperty.COLOR, keyPath2, Integer.valueOf(animationColorOverrides.getPrimaryColor())), new LottieDynamicProperties3(LottieProperty.STROKE_COLOR, keyPath2, Integer.valueOf(animationColorOverrides.getPrimaryColor()))}));
                }
                List listFlatten2 = CollectionsKt.flatten(arrayList2);
                List<KeyPath> primaryColorLight = keyPaths.getPrimaryColorLight();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primaryColorLight, 10));
                for (KeyPath keyPath3 : primaryColorLight) {
                    arrayList3.add(CollectionsKt.listOf((Object[]) new LottieDynamicProperties3[]{new LottieDynamicProperties3(LottieProperty.COLOR, keyPath3, Integer.valueOf(animationColorOverrides.getPrimaryColorLight())), new LottieDynamicProperties3(LottieProperty.STROKE_COLOR, keyPath3, Integer.valueOf(animationColorOverrides.getPrimaryColorLight()))}));
                    listFlatten = listFlatten;
                }
                List list2 = listFlatten;
                List listFlatten3 = CollectionsKt.flatten(arrayList3);
                OrderTypeEducation.Gradient primaryGradient = keyPaths.getPrimaryGradient();
                paths = primaryGradient == null ? primaryGradient.getPaths() : null;
                if (paths == null) {
                    paths = CollectionsKt.emptyList();
                }
                List<KeyPath> list3 = paths;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (KeyPath keyPath4 : list3) {
                    Integer[] numArr = LottieProperty.GRADIENT_COLOR;
                    if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) {
                        list = listFlatten3;
                        if (((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) orderTypeEducationConfiguration).getDirectOrder().getOrderConfiguration() == Order.Configuration.STOP_LIMIT) {
                            i4 = i3;
                            array2 = animationColorOverrides.getPrimaryGradientStopLimit().toArray(new Integer[0]);
                        }
                        arrayList4.add(CollectionsKt.listOf(new LottieDynamicProperties3(numArr, keyPath4, (Integer[]) array2)));
                        listFlatten3 = list;
                        i3 = i4;
                    } else {
                        list = listFlatten3;
                    }
                    i4 = i3;
                    array2 = ((orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getOrderConfiguration() == Order.Configuration.STOP_LIMIT) ? animationColorOverrides.getPrimaryGradientStopLimit().toArray(new Integer[0]) : animationColorOverrides.getPrimaryGradient().toArray(new Integer[0]);
                    arrayList4.add(CollectionsKt.listOf(new LottieDynamicProperties3(numArr, keyPath4, (Integer[]) array2)));
                    listFlatten3 = list;
                    i3 = i4;
                }
                List list4 = listFlatten3;
                int i6 = i3;
                List listFlatten4 = CollectionsKt.flatten(arrayList4);
                OrderTypeEducation.Gradient foregroundGradient = keyPaths.getForegroundGradient();
                paths2 = foregroundGradient == null ? foregroundGradient.getPaths() : null;
                if (paths2 == null) {
                    paths2 = CollectionsKt.emptyList();
                }
                List<KeyPath> list5 = paths2;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList5.add(CollectionsKt.listOf(new LottieDynamicProperties3(LottieProperty.GRADIENT_COLOR, (KeyPath) it.next(), (Integer[]) (((orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) orderTypeEducationConfiguration).getDirectOrder().getOrderConfiguration() == Order.Configuration.STOP_LIMIT) ? animationColorOverrides.getForegroundGradientStopLimit().toArray(new Integer[0]) : ((orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) && ((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration).getOrderConfiguration() == Order.Configuration.STOP_LIMIT) ? animationColorOverrides.getForegroundGradientStopLimit().toArray(new Integer[0]) : animationColorOverrides.getForegroundGradient().toArray(new Integer[0])))));
                }
                List listFlatten5 = CollectionsKt.flatten(arrayList5);
                composerStartRestartGroup.startReplaceGroup(106062694);
                animationCopy = orderTypeEducation.getAnimationCopy();
                if (animationCopy == null) {
                    animationCopy = CollectionsKt.emptyList();
                }
                List<Tuples2<String, Integer>> list6 = animationCopy;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                it2 = list6.iterator();
                while (it2.hasNext()) {
                    Tuples2 tuples2 = (Tuples2) it2.next();
                    arrayList6.add(new LottieDynamicProperties3((String) LottieProperty.TEXT, new KeyPath((String) tuples2.component1()), StringResources_androidKt.stringResource(((Number) tuples2.component2()).intValue(), composerStartRestartGroup, 0)));
                }
                composerStartRestartGroup.endReplaceGroup();
                List listFlatten6 = CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{list2, listFlatten2, list4, listFlatten4, listFlatten5, arrayList6}));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    z = 2;
                    markers = null;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    z = 2;
                    markers = null;
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                r16 = markers;
                lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(OrderTypeEducationLottie$lambda$7(lottieCompositionResultRememberLottieComposition), false, false, false, (OrderTypeEducationLottie$lambda$15(snapshotState) || (repeatMarker = orderTypeEducation.getRepeatMarker()) == null) ? markers : new LottieClipSpec.Markers(repeatMarker, null, false, 6, null), 0.0f, (orderTypeEducation.getRepeatMarker() == null && OrderTypeEducationLottie$lambda$15(snapshotState)) ? Integer.MAX_VALUE : 1, null, false, false, composerStartRestartGroup, (LottieClipSpec.Markers.$stable << 12) | 384, 938);
                Float value = lottieAnimationStateAnimateLottieCompositionAsState.getValue();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | ((i6 & 112) == 32);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new OrderTypeEducationComposable5(lottieAnimationStateAnimateLottieCompositionAsState, orderTypeEducation, snapshotState, r16);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(modifier5, convertDimensionRatioToFloat(orderTypeEducation.getDimensionRatio()), false, 2, r16);
                LottieDynamicProperties3[] lottieDynamicProperties3Arr = (LottieDynamicProperties3[]) listFlatten6.toArray(new LottieDynamicProperties3[0]);
                LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties((LottieDynamicProperties3[]) Arrays.copyOf(lottieDynamicProperties3Arr, lottieDynamicProperties3Arr.length), composerStartRestartGroup, LottieDynamicProperties3.$stable);
                LottieComposition lottieCompositionOrderTypeEducationLottie$lambda$7 = OrderTypeEducationLottie$lambda$7(lottieCompositionResultRememberLottieComposition);
                Map mapMapOf = font == null ? MapsKt.mapOf(Tuples4.m3642to(OrderTypeEducationFragment.FONT_REGULAR, font)) : r16;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(OrderTypeEducationComposable4.OrderTypeEducationLottie$lambda$21$lambda$20(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionOrderTypeEducationLottie$lambda$7, (Function0) objRememberedValue3, modifierAspectRatio$default, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, null, false, false, mapMapOf, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 0, 57080);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderTypeEducationComposable4.OrderTypeEducationLottie$lambda$22(orderTypeEducationConfiguration, orderTypeEducation, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(orderTypeEducation.getAnimationRes().getLottieCompositionSpec(composerStartRestartGroup, 0), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Typeface font2 = ResourcesCompat.getFont((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), C16915R.font.capsule_sans_text_book);
            AnimationColorOverrides animationColorOverrides2 = getAnimationColorOverrides(orderTypeEducation, composerStartRestartGroup, (i3 >> 3) & 14);
            OrderTypeEducation.KeyPaths keyPaths2 = orderTypeEducation.getKeyPaths();
            List<KeyPath> foregroundColor2 = keyPaths2.getForegroundColor();
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(foregroundColor2, 10));
            while (r8.hasNext()) {
            }
            List listFlatten7 = CollectionsKt.flatten(arrayList7);
            List<KeyPath> primaryColor2 = keyPaths2.getPrimaryColor();
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primaryColor2, 10));
            while (r8.hasNext()) {
            }
            List listFlatten22 = CollectionsKt.flatten(arrayList22);
            List<KeyPath> primaryColorLight2 = keyPaths2.getPrimaryColorLight();
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primaryColorLight2, 10));
            while (r9.hasNext()) {
            }
            List list22 = listFlatten7;
            List listFlatten32 = CollectionsKt.flatten(arrayList32);
            OrderTypeEducation.Gradient primaryGradient2 = keyPaths2.getPrimaryGradient();
            if (primaryGradient2 == null) {
            }
            if (paths == null) {
            }
            List<KeyPath> list32 = paths;
            ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
            while (r9.hasNext()) {
            }
            List list42 = listFlatten32;
            int i62 = i3;
            List listFlatten42 = CollectionsKt.flatten(arrayList42);
            OrderTypeEducation.Gradient foregroundGradient2 = keyPaths2.getForegroundGradient();
            if (foregroundGradient2 == null) {
            }
            if (paths2 == null) {
            }
            List<KeyPath> list52 = paths2;
            ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52, 10));
            it = list52.iterator();
            while (it.hasNext()) {
            }
            List listFlatten52 = CollectionsKt.flatten(arrayList52);
            composerStartRestartGroup.startReplaceGroup(106062694);
            animationCopy = orderTypeEducation.getAnimationCopy();
            if (animationCopy == null) {
            }
            List<Tuples2<String, Integer>> list62 = animationCopy;
            ArrayList arrayList62 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list62, 10));
            it2 = list62.iterator();
            while (it2.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            List listFlatten62 = CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{list22, listFlatten22, list42, listFlatten42, listFlatten52, arrayList62}));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (orderTypeEducation.getRepeatMarker() == null) {
                if (OrderTypeEducationLottie$lambda$15(snapshotState)) {
                    r16 = markers;
                    lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(OrderTypeEducationLottie$lambda$7(lottieCompositionResultRememberLottieComposition2), false, false, false, (OrderTypeEducationLottie$lambda$15(snapshotState) || (repeatMarker = orderTypeEducation.getRepeatMarker()) == null) ? markers : new LottieClipSpec.Markers(repeatMarker, null, false, 6, null), 0.0f, (orderTypeEducation.getRepeatMarker() == null && OrderTypeEducationLottie$lambda$15(snapshotState)) ? Integer.MAX_VALUE : 1, null, false, false, composerStartRestartGroup, (LottieClipSpec.Markers.$stable << 12) | 384, 938);
                    Float value2 = lottieAnimationStateAnimateLottieCompositionAsState.getValue();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | ((i62 & 112) == 32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new OrderTypeEducationComposable5(lottieAnimationStateAnimateLottieCompositionAsState, orderTypeEducation, snapshotState, r16);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(value2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        Modifier modifierAspectRatio$default2 = AspectRatio3.aspectRatio$default(modifier52, convertDimensionRatioToFloat(orderTypeEducation.getDimensionRatio()), false, 2, r16);
                        LottieDynamicProperties3[] lottieDynamicProperties3Arr2 = (LottieDynamicProperties3[]) listFlatten62.toArray(new LottieDynamicProperties3[0]);
                        LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties2 = LottieDynamicProperties2.rememberLottieDynamicProperties((LottieDynamicProperties3[]) Arrays.copyOf(lottieDynamicProperties3Arr2, lottieDynamicProperties3Arr2.length), composerStartRestartGroup, LottieDynamicProperties3.$stable);
                        LottieComposition lottieCompositionOrderTypeEducationLottie$lambda$72 = OrderTypeEducationLottie$lambda$7(lottieCompositionResultRememberLottieComposition2);
                        if (font2 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.education.order.OrderTypeEducationComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(OrderTypeEducationComposable4.OrderTypeEducationLottie$lambda$21$lambda$20(lottieAnimationStateAnimateLottieCompositionAsState));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            LottieAnimation2.LottieAnimation(lottieCompositionOrderTypeEducationLottie$lambda$72, (Function0) objRememberedValue3, modifierAspectRatio$default2, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties2, null, null, false, false, mapMapOf, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 0, 57080);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OrderTypeEducationLottie$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OrderTypeEducationLottie$lambda$21$lambda$20(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    @JvmName
    public static final AnimationColorOverrides getAnimationColorOverrides(OrderTypeEducation orderTypeEducation, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(orderTypeEducation, "<this>");
        composer.startReplaceGroup(2055339976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2055339976, i, -1, "com.robinhood.shared.education.order.<get-animationColorOverrides> (OrderTypeEducationComposable.kt:428)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        int iM6735toArgb8_81llA = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU());
        int iM6735toArgb8_81llA2 = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU());
        int iM6735toArgb8_81llA3 = Color2.m6735toArgb8_81llA(bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU());
        OrderTypeEducation.Gradient primaryGradient = orderTypeEducation.getKeyPaths().getPrimaryGradient();
        float alpha = primaryGradient != null ? primaryGradient.getAlpha() : 1.0f;
        OrderTypeEducation.Gradient foregroundGradient = orderTypeEducation.getKeyPaths().getForegroundGradient();
        float alpha2 = foregroundGradient != null ? foregroundGradient.getAlpha() : 1.0f;
        int i3 = iM6735toArgb8_81llA3 & 16777215;
        float f = 255;
        int iCoerceIn = (RangesKt.coerceIn(MathKt.roundToInt(0.4f * f), 0, 255) << 24) | i3;
        int i4 = iM6735toArgb8_81llA2 & 16777215;
        float f2 = 0.0f * f;
        Integer numValueOf = Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i4);
        GammaEvaluator gammaEvaluator = GammaEvaluator.INSTANCE;
        float f3 = alpha * f;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{numValueOf, Integer.valueOf((gammaEvaluator.evaluate(0.5f, iM6735toArgb8_81llA3, iM6735toArgb8_81llA2).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((alpha / 2.0f) * f), 0, 255) << 24)), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f3), 0, 255) << 24) | i3)});
        int i5 = iM6735toArgb8_81llA & 16777215;
        float f4 = alpha2 * f;
        float f5 = alpha;
        List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i4), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt((alpha2 / 2.0f) * f), 0, 255) << 24) | (gammaEvaluator.evaluate(0.5f, iM6735toArgb8_81llA, iM6735toArgb8_81llA2).intValue() & 16777215)), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f4), 0, 255) << 24) | i5)});
        Integer numValueOf2 = Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i4);
        Integer numValueOf3 = Integer.valueOf((gammaEvaluator.evaluate(0.5f, iM6735toArgb8_81llA3, iM6735toArgb8_81llA2).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((f5 / 3.0f) * f), 0, 255) << 24));
        float f6 = 2;
        int iIntValue = gammaEvaluator.evaluate(0.5f, iM6735toArgb8_81llA3, iM6735toArgb8_81llA2).intValue() & 16777215;
        int iRoundToInt = MathKt.roundToInt(((f5 * f6) / 3.0f) * f);
        float f7 = alpha2;
        AnimationColorOverrides animationColorOverrides = new AnimationColorOverrides(iM6735toArgb8_81llA, iM6735toArgb8_81llA3, iCoerceIn, listListOf, listListOf2, CollectionsKt.listOf((Object[]) new Integer[]{numValueOf2, numValueOf3, Integer.valueOf((RangesKt.coerceIn(iRoundToInt, 0, 255) << 24) | iIntValue), Integer.valueOf(i3 | (RangesKt.coerceIn(MathKt.roundToInt(f3), 0, 255) << 24))}), CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f2), 0, 255) << 24) | i4), Integer.valueOf((gammaEvaluator.evaluate(0.5f, iM6735toArgb8_81llA, iM6735toArgb8_81llA2).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt((f7 / 3.0f) * f), 0, 255) << 24)), Integer.valueOf((gammaEvaluator.evaluate(0.5f, iM6735toArgb8_81llA, iM6735toArgb8_81llA2).intValue() & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(((f6 * f7) / 3.0f) * f), 0, 255) << 24)), Integer.valueOf((RangesKt.coerceIn(MathKt.roundToInt(f4), 0, 255) << 24) | i5)}));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return animationColorOverrides;
    }

    private static final float convertDimensionRatioToFloat(String str) {
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2) {
            throw new IllegalArgumentException("Invalid ratio format. Expected format is 'width:height'.");
        }
        Float floatOrNull = StringsKt.toFloatOrNull((String) listSplit$default.get(0));
        if (floatOrNull == null) {
            throw new IllegalStateException("Invalid width value.");
        }
        float fFloatValue = floatOrNull.floatValue();
        Float floatOrNull2 = StringsKt.toFloatOrNull((String) listSplit$default.get(1));
        if (floatOrNull2 != null) {
            return fFloatValue / floatOrNull2.floatValue();
        }
        throw new IllegalStateException("Invalid height value.");
    }
}
