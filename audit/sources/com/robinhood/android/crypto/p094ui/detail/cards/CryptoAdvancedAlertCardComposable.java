package com.robinhood.android.crypto.p094ui.detail.cards;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoAdvancedAlertCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"CryptoAdvancedAlertCardComposable", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoAdvancedAlertCardDuxo;", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/cards/CryptoAdvancedAlertCardDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoAdvancedAlertCardComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAdvancedAlertCardComposable$lambda$2(UiCurrencyPair uiCurrencyPair, Function0 function0, Modifier modifier, CryptoAdvancedAlertCardComposable2 cryptoAdvancedAlertCardComposable2, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        CryptoAdvancedAlertCardComposable(uiCurrencyPair, function0, modifier, cryptoAdvancedAlertCardComposable2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoAdvancedAlertCardComposable(final UiCurrencyPair uiCurrencyPair, final Function0<Unit> onDismiss, Modifier modifier, CryptoAdvancedAlertCardComposable2 cryptoAdvancedAlertCardComposable2, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        CryptoAdvancedAlertCardComposable2 cryptoAdvancedAlertCardComposable22;
        int i5;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        final CryptoAdvancedAlertCardComposable2 cryptoAdvancedAlertCardComposable23;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1689700138);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uiCurrencyPair) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoAdvancedAlertCardComposable2.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposableKt$CryptoAdvancedAlertCardComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposableKt$CryptoAdvancedAlertCardComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = i4 & (-7169);
                        cryptoAdvancedAlertCardComposable22 = (CryptoAdvancedAlertCardComposable2) baseDuxo;
                        i5 = i7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1689700138, i5, -1, "com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposable (CryptoAdvancedAlertCardComposable.kt:32)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    int i8 = i5;
                    AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C8387R.string.cdp_hero_entry_card_message, composerStartRestartGroup, 0), null, 2, null);
                    String strStringResource = StringResources_androidKt.stringResource(C8387R.string.cdp_hero_entry_card_action, new Object[]{uiCurrencyPair.getAssetCurrency().getCode()}, composerStartRestartGroup, 0);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(C11048R.drawable.svg_alert_communication_card, composerStartRestartGroup, 0);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i8 >> 6) & 14, 1);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(uiCurrencyPair);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoAdvancedAlertCardComposable.CryptoAdvancedAlertCardComposable$lambda$1$lambda$0(navigator, context, uiCurrencyPair);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoCommunicationCard.BentoCommunicationCard(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, annotatedString, strStringResource, painterPainterResource, (Function0) objRememberedValue, onDismiss, null, composerStartRestartGroup, (i8 << 15) & 3670016, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoAdvancedAlertCardComposable23 = cryptoAdvancedAlertCardComposable22;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i5 = i4;
                cryptoAdvancedAlertCardComposable22 = cryptoAdvancedAlertCardComposable2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                int i82 = i5;
                AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C8387R.string.cdp_hero_entry_card_message, composerStartRestartGroup, 0), null, 2, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C8387R.string.cdp_hero_entry_card_action, new Object[]{uiCurrencyPair.getAssetCurrency().getCode()}, composerStartRestartGroup, 0);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(C11048R.drawable.svg_alert_communication_card, composerStartRestartGroup, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i82 >> 6) & 14, 1);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(uiCurrencyPair);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoAdvancedAlertCardComposable.CryptoAdvancedAlertCardComposable$lambda$1$lambda$0(navigator, context, uiCurrencyPair);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoCommunicationCard.BentoCommunicationCard(modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, annotatedString2, strStringResource2, painterPainterResource2, (Function0) objRememberedValue, onDismiss, null, composerStartRestartGroup, (i82 << 15) & 3670016, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoAdvancedAlertCardComposable23 = cryptoAdvancedAlertCardComposable22;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                cryptoAdvancedAlertCardComposable23 = cryptoAdvancedAlertCardComposable2;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoAdvancedAlertCardComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAdvancedAlertCardComposable.CryptoAdvancedAlertCardComposable$lambda$2(uiCurrencyPair, onDismiss, modifier4, cryptoAdvancedAlertCardComposable23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i5 = i4;
                    cryptoAdvancedAlertCardComposable22 = cryptoAdvancedAlertCardComposable2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                int i822 = i5;
                AnnotatedString annotatedString22 = new AnnotatedString(StringResources_androidKt.stringResource(C8387R.string.cdp_hero_entry_card_message, composerStartRestartGroup, 0), null, 2, null);
                String strStringResource22 = StringResources_androidKt.stringResource(C8387R.string.cdp_hero_entry_card_action, new Object[]{uiCurrencyPair.getAssetCurrency().getCode()}, composerStartRestartGroup, 0);
                Painter painterPainterResource22 = PainterResources_androidKt.painterResource(C11048R.drawable.svg_alert_communication_card, composerStartRestartGroup, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ22 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i822 >> 6) & 14, 1);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(uiCurrencyPair);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAdvancedAlertCardComposable$lambda$1$lambda$0(Navigator navigator, Context context, UiCurrencyPair uiCurrencyPair) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new AdvancedAlert(Either2.asRight(uiCurrencyPair), true, null, AdvancedAlertEntryPoint.CDP_HERO_CARD, 4, null), false, false, false, null, false, null, false, false, null, NavigationType.PRESENT, 2036, null);
        return Unit.INSTANCE;
    }
}
