package com.robinhood.shared.trade.crypto.p397ui.timeInForce.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceDisplayRowState;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceDuxo;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceEvent;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceViewState;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.views.CryptoOrderTimeInForceScreenComposable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: CryptoOrderTimeInForceScreenComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u008a\u0084\u0002"}, m3636d2 = {"CryptoOrderTimeInForceScreenComposable", "", "onTimeInForceConfirmed", "Lkotlin/Function2;", "Lcom/robinhood/models/db/OrderTimeInForce;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderTimeInForceScreenComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTimeInForceScreenComposable$lambda$3(Function2 function2, Screen screen, Modifier modifier, CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo, int i, int i2, Composer composer, int i3) {
        CryptoOrderTimeInForceScreenComposable(function2, screen, modifier, cryptoOrderTimeInForceDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderTimeInForceScreenComposable(final Function2<? super OrderTimeInForce, ? super CryptoOrderPrices, Unit> onTimeInForceConfirmed, final Screen screen, Modifier modifier, CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo2;
        Modifier modifier3;
        int i4;
        final CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo3;
        final Event<CryptoOrderTimeInForceEvent> eventCryptoOrderTimeInForceScreenComposable$lambda$1;
        final CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoOrderTimeInForceEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onTimeInForceConfirmed, "onTimeInForceConfirmed");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1244440111);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onTimeInForceConfirmed) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoOrderTimeInForceDuxo2 = cryptoOrderTimeInForceDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoOrderTimeInForceDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoOrderTimeInForceDuxo2 = cryptoOrderTimeInForceDuxo;
                }
                i3 |= i6;
            } else {
                cryptoOrderTimeInForceDuxo2 = cryptoOrderTimeInForceDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoOrderTimeInForceDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$$inlined$duxo$1.1
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
                        CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo5 = (CryptoOrderTimeInForceDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        cryptoOrderTimeInForceDuxo3 = cryptoOrderTimeInForceDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1244440111, i4, -1, "com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposable (CryptoOrderTimeInForceScreenComposable.kt:36)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    eventCryptoOrderTimeInForceScreenComposable$lambda$1 = CryptoOrderTimeInForceScreenComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTimeInForceDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                    if (eventCryptoOrderTimeInForceScreenComposable$lambda$1 != null && (eventCryptoOrderTimeInForceScreenComposable$lambda$1.getData() instanceof CryptoOrderTimeInForceEvent.ConfirmTimeInForce) && (eventConsumerInvoke = eventCryptoOrderTimeInForceScreenComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoOrderTimeInForceScreenComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m26047invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m26047invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoOrderTimeInForceEvent.ConfirmTimeInForce confirmTimeInForce = (CryptoOrderTimeInForceEvent.ConfirmTimeInForce) eventCryptoOrderTimeInForceScreenComposable$lambda$1.getData();
                                onTimeInForceConfirmed.invoke(confirmTimeInForce.getTimeInForce(), confirmTimeInForce.getOrderPrices());
                            }
                        });
                    }
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-640324380, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt.CryptoOrderTimeInForceScreenComposable.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                            invoke(bentoButtonBar3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-640324380, i7, -1, "com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposable.<anonymous> (CryptoOrderTimeInForceScreenComposable.kt:44)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                            CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo6 = cryptoOrderTimeInForceDuxo3;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(cryptoOrderTimeInForceDuxo6);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new CryptoOrderTimeInForceScreenComposable2(cryptoOrderTimeInForceDuxo6);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), StringResources_androidKt.stringResource(C40095R.string.crypto_trade_label_continue, composer2, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1066079977, true, new C408323(modifier3, snapshotState4CollectAsStateWithLifecycle, screen, cryptoOrderTimeInForceDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoOrderTimeInForceDuxo4 = cryptoOrderTimeInForceDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                cryptoOrderTimeInForceDuxo3 = cryptoOrderTimeInForceDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventCryptoOrderTimeInForceScreenComposable$lambda$1 = CryptoOrderTimeInForceScreenComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTimeInForceDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventCryptoOrderTimeInForceScreenComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoOrderTimeInForceScreenComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m26047invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m26047invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderTimeInForceEvent.ConfirmTimeInForce confirmTimeInForce = (CryptoOrderTimeInForceEvent.ConfirmTimeInForce) eventCryptoOrderTimeInForceScreenComposable$lambda$1.getData();
                            onTimeInForceConfirmed.invoke(confirmTimeInForce.getTimeInForce(), confirmTimeInForce.getOrderPrices());
                        }
                    });
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-640324380, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt.CryptoOrderTimeInForceScreenComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-640324380, i7, -1, "com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposable.<anonymous> (CryptoOrderTimeInForceScreenComposable.kt:44)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                        CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo6 = cryptoOrderTimeInForceDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(cryptoOrderTimeInForceDuxo6);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new CryptoOrderTimeInForceScreenComposable2(cryptoOrderTimeInForceDuxo6);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), StringResources_androidKt.stringResource(C40095R.string.crypto_trade_label_continue, composer2, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1066079977, true, new C408323(modifier3, snapshotState4CollectAsStateWithLifecycle2, screen, cryptoOrderTimeInForceDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoOrderTimeInForceDuxo4 = cryptoOrderTimeInForceDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoOrderTimeInForceDuxo4 = cryptoOrderTimeInForceDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderTimeInForceScreenComposable.CryptoOrderTimeInForceScreenComposable$lambda$3(onTimeInForceConfirmed, screen, modifier4, cryptoOrderTimeInForceDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    cryptoOrderTimeInForceDuxo3 = cryptoOrderTimeInForceDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTimeInForceDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventCryptoOrderTimeInForceScreenComposable$lambda$1 = CryptoOrderTimeInForceScreenComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTimeInForceDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventCryptoOrderTimeInForceScreenComposable$lambda$1 != null) {
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-640324380, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt.CryptoOrderTimeInForceScreenComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-640324380, i7, -1, "com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposable.<anonymous> (CryptoOrderTimeInForceScreenComposable.kt:44)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                        CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo6 = cryptoOrderTimeInForceDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(cryptoOrderTimeInForceDuxo6);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new CryptoOrderTimeInForceScreenComposable2(cryptoOrderTimeInForceDuxo6);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), StringResources_androidKt.stringResource(C40095R.string.crypto_trade_label_continue, composer2, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1066079977, true, new C408323(modifier3, snapshotState4CollectAsStateWithLifecycle22, screen, cryptoOrderTimeInForceDuxo3), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoOrderTimeInForceDuxo4 = cryptoOrderTimeInForceDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoOrderTimeInForceScreenComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$3 */
    static final class C408323 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ CryptoOrderTimeInForceDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ SnapshotState4<CryptoOrderTimeInForceViewState> $viewState$delegate;

        C408323(Modifier modifier, SnapshotState4<CryptoOrderTimeInForceViewState> snapshotState4, Screen screen, CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo) {
            this.$modifier = modifier;
            this.$viewState$delegate = snapshotState4;
            this.$screen = screen;
            this.$duxo = cryptoOrderTimeInForceDuxo;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo, CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceDisplayRowState) {
            cryptoOrderTimeInForceDuxo.onTimeInForceSelected(cryptoOrderTimeInForceDisplayRowState.getTimeInForce());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1066079977, i, -1, "com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposable.<anonymous> (CryptoOrderTimeInForceScreenComposable.kt:64)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer2, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 1, null);
            SnapshotState4<CryptoOrderTimeInForceViewState> snapshotState4 = this.$viewState$delegate;
            Screen screen = this.$screen;
            final CryptoOrderTimeInForceDuxo cryptoOrderTimeInForceDuxo = this.$duxo;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
            CryptoOrderTimeInForceHeaderComposable.CryptoOrderTimeInForceHeaderComposable(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer2, 0, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM()), composer2, 0);
            composer2.startReplaceGroup(-1892956942);
            int i3 = 0;
            for (CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceDisplayRowState : CryptoOrderTimeInForceScreenComposable.CryptoOrderTimeInForceScreenComposable$lambda$0(snapshotState4).getDisplayRowStates()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceDisplayRowState2 = cryptoOrderTimeInForceDisplayRowState;
                Screen screen2 = screen;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.RADIO_BUTTON, cryptoOrderTimeInForceDisplayRowState2.getTimeInForce().getServerValue(), null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                StringResource primaryText = cryptoOrderTimeInForceDisplayRowState2.getPrimaryText();
                int i5 = StringResource.$stable;
                String string2 = StringResource2.getString(primaryText, composer2, i5);
                boolean zIsSelected = cryptoOrderTimeInForceDisplayRowState2.isSelected();
                String string3 = StringResource2.getString(cryptoOrderTimeInForceDisplayRowState2.getSecondaryText(), composer2, i5);
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer2.changedInstance(cryptoOrderTimeInForceDuxo) | composer2.changedInstance(cryptoOrderTimeInForceDisplayRowState2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderTimeInForceScreenComposable.C408323.invoke$lambda$3$lambda$2$lambda$1$lambda$0(cryptoOrderTimeInForceDuxo, cryptoOrderTimeInForceDisplayRowState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, type2, string2, zIsSelected, string3, false, null, false, false, false, (Function0) objRememberedValue, composer2, 48, 0, 992);
                composer2 = composer;
                screen = screen2;
                cryptoOrderTimeInForceDuxo = cryptoOrderTimeInForceDuxo;
                i3 = i4;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderTimeInForceViewState CryptoOrderTimeInForceScreenComposable$lambda$0(SnapshotState4<CryptoOrderTimeInForceViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoOrderTimeInForceEvent> CryptoOrderTimeInForceScreenComposable$lambda$1(SnapshotState4<Event<CryptoOrderTimeInForceEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
