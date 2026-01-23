package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoFeeTierIntentKey;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusDuxo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: CryptoFeeTierStatusComposable.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001aI\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a1\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%H\u0003¢\u0006\u0002\u0010&\u001a\r\u0010'\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(\"\u000e\u0010)\u001a\u00020\u0019X\u0082T¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"CryptoFeeTierStatusComposable", "", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "", "finishPostOrderFlow", "Lkotlin/Function0;", "onContinueToNotificationPrimer", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoFeeTierStatus", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState;", "onTryAgainClick", "(Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigateToFeeTierScreen", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "FeeRate", "feeRateTitle", "", "feeRateText", "textColor", "Landroidx/compose/ui/graphics/Color;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "FeeRate-FNF3uiM", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)V", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "(Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "SCREEN_IDENTIFIER", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoFeeTierStatusComposableKt {
    private static final String SCREEN_IDENTIFIER = "POST_TRADE_FEE_TIER_STATUS";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierStatus$lambda$6(CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierStatus(cryptoFeeTierStatusViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierStatusComposable$lambda$1(CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, Function0 function0, Function0 function02, Modifier modifier, CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierStatusComposable(cryptoFeeTierInfo, bool, function0, function02, modifier, cryptoFeeTierStatusDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeeRate_FNF3uiM$lambda$8(String str, String str2, long j, Alignment.Horizontal horizontal, int i, Composer composer, int i2) {
        m25881FeeRateFNF3uiM(str, str2, j, horizontal, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$10(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierStatusComposable(final CryptoFeeTierInfo cryptoFeeTierInfo, final Boolean bool, final Function0<Unit> finishPostOrderFlow, final Function0<Unit> onContinueToNotificationPrimer, Modifier modifier, CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo2;
        int i4;
        Modifier modifier3;
        int i5;
        Composer composer2;
        CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(finishPostOrderFlow, "finishPostOrderFlow");
        Intrinsics.checkNotNullParameter(onContinueToNotificationPrimer, "onContinueToNotificationPrimer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1569315207);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoFeeTierInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bool) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(finishPostOrderFlow) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueToNotificationPrimer) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    cryptoFeeTierStatusDuxo2 = cryptoFeeTierStatusDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoFeeTierStatusDuxo2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    cryptoFeeTierStatusDuxo2 = cryptoFeeTierStatusDuxo;
                }
                i3 |= i7;
            } else {
                cryptoFeeTierStatusDuxo2 = cryptoFeeTierStatusDuxo;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        CryptoFeeTierStatusDuxo.Args args = new CryptoFeeTierStatusDuxo.Args(cryptoFeeTierInfo, bool);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoFeeTierStatusDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatusComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatusComposable$$inlined$duxo$1.1
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
                        i4 &= -458753;
                        cryptoFeeTierStatusDuxo3 = (CryptoFeeTierStatusDuxo) baseDuxo;
                    } else {
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                        cryptoFeeTierStatusDuxo3 = cryptoFeeTierStatusDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    modifier3 = modifier2;
                    cryptoFeeTierStatusDuxo3 = cryptoFeeTierStatusDuxo2;
                    i5 = 0;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1569315207, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposable (CryptoFeeTierStatusComposable.kt:69)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierStatusDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                cryptoFeeTierStatusDuxo4 = cryptoFeeTierStatusDuxo3;
                final Modifier modifier5 = modifier3;
                CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(eventDescriptor(CryptoFeeTierStatusComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEventContext(), composer3, i5)), ComposableLambda3.rememberComposableLambda(650754489, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt.CryptoFeeTierStatusComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650754489, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposable.<anonymous> (CryptoFeeTierStatusComposable.kt:75)");
                        }
                        CryptoFeeTierStatusViewState cryptoFeeTierStatusViewStateCryptoFeeTierStatusComposable$lambda$0 = CryptoFeeTierStatusComposableKt.CryptoFeeTierStatusComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        Function0<Unit> function0 = finishPostOrderFlow;
                        Function0<Unit> function02 = onContinueToNotificationPrimer;
                        CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo5 = cryptoFeeTierStatusDuxo4;
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer5.changedInstance(cryptoFeeTierStatusDuxo5);
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C40380xd11f3398(cryptoFeeTierStatusDuxo5);
                            composer5.updateRememberedValue(objRememberedValue2);
                        }
                        composer5.endReplaceGroup();
                        CryptoFeeTierStatusComposableKt.CryptoFeeTierStatus(cryptoFeeTierStatusViewStateCryptoFeeTierStatusComposable$lambda$0, function0, function02, (Function0) ((KFunction) objRememberedValue2), modifier5, composer5, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoFeeTierStatusDuxo4 = cryptoFeeTierStatusDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeTierStatusComposableKt.CryptoFeeTierStatusComposable$lambda$1(cryptoFeeTierInfo, bool, finishPostOrderFlow, onContinueToNotificationPrimer, modifier4, cryptoFeeTierStatusDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i3;
        if ((74899 & i4) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<CryptoFeeTierStatusViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierStatusDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                cryptoFeeTierStatusDuxo4 = cryptoFeeTierStatusDuxo3;
                final Modifier modifier52 = modifier3;
                CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(eventDescriptor(CryptoFeeTierStatusComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getEventContext(), composer3, i5)), ComposableLambda3.rememberComposableLambda(650754489, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt.CryptoFeeTierStatusComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650754489, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposable.<anonymous> (CryptoFeeTierStatusComposable.kt:75)");
                        }
                        CryptoFeeTierStatusViewState cryptoFeeTierStatusViewStateCryptoFeeTierStatusComposable$lambda$0 = CryptoFeeTierStatusComposableKt.CryptoFeeTierStatusComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        Function0<Unit> function0 = finishPostOrderFlow;
                        Function0<Unit> function02 = onContinueToNotificationPrimer;
                        CryptoFeeTierStatusDuxo cryptoFeeTierStatusDuxo5 = cryptoFeeTierStatusDuxo4;
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer5.changedInstance(cryptoFeeTierStatusDuxo5);
                        Object objRememberedValue2 = composer5.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C40380xd11f3398(cryptoFeeTierStatusDuxo5);
                            composer5.updateRememberedValue(objRememberedValue2);
                        }
                        composer5.endReplaceGroup();
                        CryptoFeeTierStatusComposableKt.CryptoFeeTierStatus(cryptoFeeTierStatusViewStateCryptoFeeTierStatusComposable$lambda$0, function0, function02, (Function0) ((KFunction) objRememberedValue2), modifier52, composer5, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoFeeTierStatusViewState CryptoFeeTierStatusComposable$lambda$0(SnapshotState4<CryptoFeeTierStatusViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierStatus(final CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState, final Function0<Unit> function0, final Function0<Unit> function02, Function0<Unit> function03, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1067147575);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cryptoFeeTierStatusViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1067147575, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus (CryptoFeeTierStatusComposable.kt:92)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5199getHorizontalJoeWqyM())), (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier4 = modifier3;
                LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.isContentLoading(), null, null, ComposableLambda3.rememberComposableLambda(262434127, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(262434127, i6, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:110)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_status, composer2, 0);
                        if (cryptoFeeTierStatusViewState.isContentLoading()) {
                            strStringResource = null;
                        }
                        if (strStringResource == null) {
                            strStringResource = "-----------";
                        }
                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                m25881FeeRateFNF3uiM(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_fee_tier_status_current_fee_tier, composerStartRestartGroup, 0), cryptoFeeTierStatusViewState.getCurrentTierFee(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), companion.getStart(), composerStartRestartGroup, 3072);
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                m25881FeeRateFNF3uiM(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_fee_tier_status_next_fee_tier, composerStartRestartGroup, 0), cryptoFeeTierStatusViewState.getNextTierFee(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), companion.getEnd(), composerStartRestartGroup, 3072);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.getFeeTierProgress() != null, null, null, ComposableLambda3.rememberComposableLambda(1196463430, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1196463430, i6, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:135)");
                        }
                        Float feeTierProgress = cryptoFeeTierStatusViewState.getFeeTierProgress();
                        FeeTierProgressBar3.FeeTierProgressBar(feeTierProgress != null ? feeTierProgress.floatValue() : 0.0f, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), composer2, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.getCurrentProgressText() != null, null, null, ComposableLambda3.rememberComposableLambda(-34829113, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-34829113, i6, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:141)");
                        }
                        StringResource currentProgressText = cryptoFeeTierStatusViewState.getCurrentProgressText();
                        composer2.startReplaceGroup(888963314);
                        String string2 = currentProgressText == null ? null : StringResource2.getString(currentProgressText, composer2, StringResource.$stable);
                        composer2.endReplaceGroup();
                        if (string2 == null) {
                            string2 = StringsKt.repeat("---------", 3);
                        }
                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.getPrimaryButton() != null, null, null, ComposableLambda3.rememberComposableLambda(-1266121656, true, new CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$5(cryptoFeeTierStatusViewState, function0, function02), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.isContentLoading(), null, null, ComposableLambda3.rememberComposableLambda(1797553097, true, new CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$6(cryptoFeeTierStatusViewState, navigator, context), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.endNode();
                if (cryptoFeeTierStatusViewState.getShowError()) {
                    function04 = function03;
                } else {
                    String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_status_error_title, composerStartRestartGroup, 0);
                    BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_status_error_description, composerStartRestartGroup, 0));
                    function04 = function03;
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.f6284x82472c7c, composerStartRestartGroup, 0), function04);
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_status_error_cta_exit, composerStartRestartGroup, 0), function0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function05 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    int i6 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
                    int i7 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function05, composerStartRestartGroup, i6 | (i7 << 6) | (i7 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function04 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function06 = function04;
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeTierStatusComposableKt.CryptoFeeTierStatus$lambda$6(cryptoFeeTierStatusViewState, function0, function02, function06, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4871backgroundbw27NRU(modifier3, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM())), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5199getHorizontalJoeWqyM())), (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier42 = modifier3;
                LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.isContentLoading(), null, null, ComposableLambda3.rememberComposableLambda(262434127, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i62) {
                        if ((i62 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(262434127, i62, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:110)");
                        }
                        String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_your_fee_tier_status, composer2, 0);
                        if (cryptoFeeTierStatusViewState.isContentLoading()) {
                            strStringResource2 = null;
                        }
                        if (strStringResource2 == null) {
                            strStringResource2 = "-----------";
                        }
                        BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    m25881FeeRateFNF3uiM(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_fee_tier_status_current_fee_tier, composerStartRestartGroup, 0), cryptoFeeTierStatusViewState.getCurrentTierFee(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), companion4.getStart(), composerStartRestartGroup, 3072);
                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    m25881FeeRateFNF3uiM(StringResources_androidKt.stringResource(C40095R.string.crypto_order_confirmation_fee_tier_status_next_fee_tier, composerStartRestartGroup, 0), cryptoFeeTierStatusViewState.getNextTierFee(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), companion4.getEnd(), composerStartRestartGroup, 3072);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.getFeeTierProgress() != null, null, null, ComposableLambda3.rememberComposableLambda(1196463430, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i62) {
                            if ((i62 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1196463430, i62, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:135)");
                            }
                            Float feeTierProgress = cryptoFeeTierStatusViewState.getFeeTierProgress();
                            FeeTierProgressBar3.FeeTierProgressBar(feeTierProgress != null ? feeTierProgress.floatValue() : 0.0f, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), composer2, 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.getCurrentProgressText() != null, null, null, ComposableLambda3.rememberComposableLambda(-34829113, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i62) {
                            if ((i62 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-34829113, i62, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatus.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:141)");
                            }
                            StringResource currentProgressText = cryptoFeeTierStatusViewState.getCurrentProgressText();
                            composer2.startReplaceGroup(888963314);
                            String string2 = currentProgressText == null ? null : StringResource2.getString(currentProgressText, composer2, StringResource.$stable);
                            composer2.endReplaceGroup();
                            if (string2 == null) {
                                string2 = StringsKt.repeat("---------", 3);
                            }
                            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.getPrimaryButton() != null, null, null, ComposableLambda3.rememberComposableLambda(-1266121656, true, new CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$5(cryptoFeeTierStatusViewState, function0, function02), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    LocalShowPlaceholder.Loadable(cryptoFeeTierStatusViewState.isContentLoading(), null, null, ComposableLambda3.rememberComposableLambda(1797553097, true, new CryptoFeeTierStatusComposableKt$CryptoFeeTierStatus$1$6(cryptoFeeTierStatusViewState, navigator2, context2), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.endNode();
                    if (cryptoFeeTierStatusViewState.getShowError()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateToFeeTierScreen(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoFeeTierIntentKey(CryptoFeeTierIntentKey.LaunchType.MODAL, null, 2, null), null, false, null, null, 60, null);
    }

    /* renamed from: FeeRate-FNF3uiM, reason: not valid java name */
    private static final void m25881FeeRateFNF3uiM(final String str, final String str2, final long j, final Alignment.Horizontal horizontal, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-687241065);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(horizontal) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-687241065, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.FeeRate (CryptoFeeTierStatusComposable.kt:239)");
            }
            int i3 = (i2 >> 3) & 896;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i3 >> 3) & 112);
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
            LocalShowPlaceholder.Loadable(str2 == null, null, null, ComposableLambda3.rememberComposableLambda(617672017, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$FeeRate$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(617672017, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.FeeRate.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:242)");
                    }
                    String strRepeat = str;
                    if (str2 == null) {
                        strRepeat = null;
                    }
                    if (strRepeat == null) {
                        strRepeat = StringsKt.repeat(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, 2);
                    }
                    BentoText2.m20747BentoText38GnDrw(strRepeat, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            LocalShowPlaceholder.Loadable(str2 == null, null, null, ComposableLambda3.rememberComposableLambda(-1868775302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$FeeRate$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1868775302, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.FeeRate.<anonymous>.<anonymous> (CryptoFeeTierStatusComposable.kt:248)");
                    }
                    String str3 = str2;
                    if (str3 == null) {
                        str3 = "----";
                    }
                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierStatusComposableKt.FeeRate_FNF3uiM$lambda$8(str, str2, j, horizontal, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final UserInteractionEventDescriptor eventDescriptor(com.robinhood.rosetta.eventlogging.Context context, Composer composer, int i) {
        composer.startReplaceGroup(1627216894);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1627216894, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.eventDescriptor (CryptoFeeTierStatusComposable.kt:258)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        Screen screen = userInteractionEventDescriptor.getScreen();
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen != null ? Screen.copy$default(screen, null, null, SCREEN_IDENTIFIER, null, 11, null) : null, null, context, null, null, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorCopy$default;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(361315880);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(361315880, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.Preview (CryptoFeeTierStatusComposable.kt:269)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null))}, ComposableSingletons$CryptoFeeTierStatusComposableKt.INSTANCE.getLambda$1241477480$feature_trade_crypto_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoFeeTierStatusComposableKt.Preview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
