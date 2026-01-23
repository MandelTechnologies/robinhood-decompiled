package com.robinhood.shared.trade.crypto.p397ui.fee.preference.toggle;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoMonetizationModelPreferenceToggleComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\"\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001c\u0010\u0011\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"CryptoMonetizationModelPreferenceToggleComposable", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onShowFeeTierScreen", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/fee/preference/toggle/CryptoMonetizationModelPreferenceToggleDuxo;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/fee/preference/toggle/CryptoMonetizationModelPreferenceToggleDuxo;Landroidx/compose/runtime/Composer;II)V", "volumeTierTestTag", "", "getVolumeTierTestTag$annotations", "()V", "getVolumeTierTestTag", "()Ljava/lang/String;", "feeVolumeTierEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getFeeVolumeTierEventComponent$annotations", "getFeeVolumeTierEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/fee/preference/toggle/CryptoMonetizationModelPreferenceToggleViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.preference.toggle.CryptoMonetizationModelPreferenceToggleComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoMonetizationModelPreferenceToggleComposable {
    private static final Component feeVolumeTierEventComponent = new Component(Component.ComponentType.ROW, "crypto_fees", null, 4, null);
    private static final String volumeTierTestTag = "crypto_monetization_model_preference_volume_tier_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoMonetizationModelPreferenceToggleComposable$lambda$1(Screen screen, Function0 function0, Modifier modifier, CryptoMonetizationModelPreferenceToggleDuxo cryptoMonetizationModelPreferenceToggleDuxo, int i, int i2, Composer composer, int i3) {
        CryptoMonetizationModelPreferenceToggleComposable(screen, function0, modifier, cryptoMonetizationModelPreferenceToggleDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getFeeVolumeTierEventComponent$annotations() {
    }

    public static /* synthetic */ void getVolumeTierTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoMonetizationModelPreferenceToggleComposable(final Screen eventScreen, final Function0<Unit> onShowFeeTierScreen, Modifier modifier, CryptoMonetizationModelPreferenceToggleDuxo cryptoMonetizationModelPreferenceToggleDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoMonetizationModelPreferenceToggleDuxo cryptoMonetizationModelPreferenceToggleDuxo2;
        int i4;
        Modifier modifier3;
        CryptoMonetizationModelPreferenceToggleDuxo cryptoMonetizationModelPreferenceToggleDuxo3;
        final CryptoMonetizationModelPreferenceToggleDuxo cryptoMonetizationModelPreferenceToggleDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(onShowFeeTierScreen, "onShowFeeTierScreen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1061200431);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventScreen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowFeeTierScreen) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoMonetizationModelPreferenceToggleDuxo2 = cryptoMonetizationModelPreferenceToggleDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoMonetizationModelPreferenceToggleDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoMonetizationModelPreferenceToggleDuxo2 = cryptoMonetizationModelPreferenceToggleDuxo;
                }
                i3 |= i6;
            } else {
                cryptoMonetizationModelPreferenceToggleDuxo2 = cryptoMonetizationModelPreferenceToggleDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoMonetizationModelPreferenceToggleDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.toggle.CryptoMonetizationModelPreferenceToggleComposableKt$CryptoMonetizationModelPreferenceToggleComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.toggle.CryptoMonetizationModelPreferenceToggleComposableKt$CryptoMonetizationModelPreferenceToggleComposable$$inlined$duxo$1.1
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
                        Modifier modifier6 = modifier5;
                        i4 = i3 & (-7169);
                        modifier3 = modifier6;
                        cryptoMonetizationModelPreferenceToggleDuxo3 = (CryptoMonetizationModelPreferenceToggleDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1061200431, i4, -1, "com.robinhood.shared.trade.crypto.ui.fee.preference.toggle.CryptoMonetizationModelPreferenceToggleComposable (CryptoMonetizationModelPreferenceToggleComposable.kt:29)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoMonetizationModelPreferenceToggleDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), volumeTierTestTag);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierTestTag, bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()));
                        Modifier modifier7 = modifier3;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM4871backgroundbw27NRU, false, null, null, onShowFeeTierScreen, 7, null), new UserInteractionEventDescriptor(null, eventScreen, null, null, feeVolumeTierEventComponent, null, 45, null), true, false, false, true, false, null, 108, null);
                        StringResource volumeTierPrimaryText = CryptoMonetizationModelPreferenceToggleComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getVolumeTierPrimaryText();
                        int i8 = StringResource.$stable;
                        Composer composer2 = composerStartRestartGroup;
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, StringResource2.getString(volumeTierPrimaryText, composerStartRestartGroup, i8), StringResource2.getString(CryptoMonetizationModelPreferenceToggleComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getVolumeTierSecondaryText(), composerStartRestartGroup, i8), null, new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.ARROW_RIGHT_24, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), null, false, false, false, 0L, null, composer2, (BentoBaseRowState.Meta.Icon.$stable << 15) | 12582912, 0, 3922);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoMonetizationModelPreferenceToggleDuxo4 = cryptoMonetizationModelPreferenceToggleDuxo3;
                        modifier4 = modifier7;
                    } else {
                        Modifier modifier8 = modifier5;
                        i4 = i3;
                        modifier3 = modifier8;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                cryptoMonetizationModelPreferenceToggleDuxo3 = cryptoMonetizationModelPreferenceToggleDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoMonetizationModelPreferenceToggleDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), volumeTierTestTag);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierTestTag2, bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()));
                Modifier modifier72 = modifier3;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM4871backgroundbw27NRU2, false, null, null, onShowFeeTierScreen, 7, null), new UserInteractionEventDescriptor(null, eventScreen, null, null, feeVolumeTierEventComponent, null, 45, null), true, false, false, true, false, null, 108, null);
                StringResource volumeTierPrimaryText2 = CryptoMonetizationModelPreferenceToggleComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getVolumeTierPrimaryText();
                int i82 = StringResource.$stable;
                Composer composer22 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, StringResource2.getString(volumeTierPrimaryText2, composerStartRestartGroup, i82), StringResource2.getString(CryptoMonetizationModelPreferenceToggleComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getVolumeTierSecondaryText(), composerStartRestartGroup, i82), null, new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.ARROW_RIGHT_24, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null), null, false, false, false, 0L, null, composer22, (BentoBaseRowState.Meta.Icon.$stable << 15) | 12582912, 0, 3922);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoMonetizationModelPreferenceToggleDuxo4 = cryptoMonetizationModelPreferenceToggleDuxo3;
                modifier4 = modifier72;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoMonetizationModelPreferenceToggleDuxo4 = cryptoMonetizationModelPreferenceToggleDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.toggle.CryptoMonetizationModelPreferenceToggleComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoMonetizationModelPreferenceToggleComposable.CryptoMonetizationModelPreferenceToggleComposable$lambda$1(eventScreen, onShowFeeTierScreen, modifier4, cryptoMonetizationModelPreferenceToggleDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final String getVolumeTierTestTag() {
        return volumeTierTestTag;
    }

    public static final Component getFeeVolumeTierEventComponent() {
        return feeVolumeTierEventComponent;
    }

    private static final CryptoMonetizationModelPreferenceToggleViewState CryptoMonetizationModelPreferenceToggleComposable$lambda$0(SnapshotState4<CryptoMonetizationModelPreferenceToggleViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
