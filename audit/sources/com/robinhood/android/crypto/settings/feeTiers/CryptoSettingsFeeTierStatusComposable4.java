package com.robinhood.android.crypto.settings.feeTiers;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.settings.C13000R;
import com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusViewState;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.contracts.CryptoFeeTierIntentKey;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummaryComposable3;
import com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBanner;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: CryptoSettingsFeeTierStatusComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001aN\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011¢\u0006\u0002\b\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0019\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001d\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c¨\u0006 ²\u0006\f\u0010\b\u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDuxo;", "duxo", "", "CryptoSettingsFeeTierStatusComposable", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDuxo;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Enabled;", "viewState", "EnabledState", "(Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState$Enabled;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisabledState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "subtitleText", "ctaText", "ctaIdentifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", CarResultComposable2.BODY, "BaseLayout", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DisabledStatePreview", "(Landroidx/compose/runtime/Composer;I)V", CryptoSettingsFeeTierStatusComposable4.SER_ENABLED_FEE_TIER_STATUS_TAG, "Ljava/lang/String;", "getSER_ENABLED_FEE_TIER_STATUS_TAG$annotations", "()V", CryptoSettingsFeeTierStatusComposable4.SER_DISABLED_FEE_TIER_STATUS_TAG, "getSER_DISABLED_FEE_TIER_STATUS_TAG$annotations", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "feature-crypto-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoSettingsFeeTierStatusComposable4 {
    public static final String SER_DISABLED_FEE_TIER_STATUS_TAG = "SER_DISABLED_FEE_TIER_STATUS_TAG";
    public static final String SER_ENABLED_FEE_TIER_STATUS_TAG = "SER_ENABLED_FEE_TIER_STATUS_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLayout$lambda$7(String str, String str2, String str3, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        BaseLayout(str, str2, str3, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoSettingsFeeTierStatusComposable$lambda$1(Modifier modifier, CryptoSettingsFeeTierStatusDuxo cryptoSettingsFeeTierStatusDuxo, int i, int i2, Composer composer, int i3) {
        CryptoSettingsFeeTierStatusComposable(modifier, cryptoSettingsFeeTierStatusDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledState$lambda$3(Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisabledState(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisabledStatePreview$lambda$8(int i, Composer composer, int i2) {
        DisabledStatePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnabledState$lambda$2(CryptoSettingsFeeTierStatusViewState.Enabled enabled, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EnabledState(enabled, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSER_DISABLED_FEE_TIER_STATUS_TAG$annotations() {
    }

    public static /* synthetic */ void getSER_ENABLED_FEE_TIER_STATUS_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoSettingsFeeTierStatusComposable(final Modifier modifier, final CryptoSettingsFeeTierStatusDuxo cryptoSettingsFeeTierStatusDuxo, Composer composer, final int i, final int i2) {
        int i3;
        CryptoSettingsFeeTierStatusViewState cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127730286);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changedInstance(cryptoSettingsFeeTierStatusDuxo)) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoSettingsFeeTierStatusDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$CryptoSettingsFeeTierStatusComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$CryptoSettingsFeeTierStatusComposable$$inlined$duxo$1.1
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
                    cryptoSettingsFeeTierStatusDuxo = (CryptoSettingsFeeTierStatusDuxo) baseDuxo;
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1127730286, i5, -1, "com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposable (CryptoSettingsFeeTierStatusComposable.kt:38)");
                }
                cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0 = CryptoSettingsFeeTierStatusComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoSettingsFeeTierStatusDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0 instanceof CryptoSettingsFeeTierStatusViewState.Hide)) {
                    composerStartRestartGroup.startReplaceGroup(-978441426);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0 instanceof CryptoSettingsFeeTierStatusViewState.Enabled) {
                    composerStartRestartGroup.startReplaceGroup(-1417033797);
                    EnabledState((CryptoSettingsFeeTierStatusViewState.Enabled) cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0, TestTag3.testTag(modifier, SER_ENABLED_FEE_TIER_STATUS_TAG), composerStartRestartGroup, CryptoFeeTierSummary.$stable | StringResource.$stable, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0 instanceof CryptoSettingsFeeTierStatusViewState.Disabled)) {
                        composerStartRestartGroup.startReplaceGroup(-1417038559);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1417027467);
                    DisabledState(TestTag3.testTag(modifier, SER_DISABLED_FEE_TIER_STATUS_TAG), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0 = CryptoSettingsFeeTierStatusComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(cryptoSettingsFeeTierStatusDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(cryptoSettingsFeeTierStatusViewStateCryptoSettingsFeeTierStatusComposable$lambda$0 instanceof CryptoSettingsFeeTierStatusViewState.Hide)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSettingsFeeTierStatusComposable4.CryptoSettingsFeeTierStatusComposable$lambda$1(modifier, cryptoSettingsFeeTierStatusDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EnabledState(final CryptoSettingsFeeTierStatusViewState.Enabled enabled, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(408865666);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(enabled) : composerStartRestartGroup.changedInstance(enabled) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408865666, i3, -1, "com.robinhood.android.crypto.settings.feeTiers.EnabledState (CryptoSettingsFeeTierStatusComposable.kt:59)");
            }
            BaseLayout(StringResources_androidKt.stringResource(C13000R.string.crypto_setting_fee_tier_status_enabled_subtitle, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C13000R.string.crypto_setting_fee_tier_status_enabled_cta, composerStartRestartGroup, 0), "manage_fee_tiers", modifier2, ComposableLambda3.rememberComposableLambda(-1039968002, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt.EnabledState.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                    invoke(column5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 BaseLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BaseLayout, "$this$BaseLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1039968002, i5, -1, "com.robinhood.android.crypto.settings.feeTiers.EnabledState.<anonymous> (CryptoSettingsFeeTierStatusComposable.kt:66)");
                    }
                    StringResource expirationWarningBannerText = enabled.getExpirationWarningBannerText();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    CryptoFeeTierExpirationWarningBanner.CryptoFeeTierExpirationWarningBanner(expirationWarningBannerText, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 7, null), null, composer2, StringResource.$stable, 4);
                    CryptoFeeTierSummaryComposable3.CryptoFeeTierSummaryComposable(enabled.getFeeTierSummary(), composer2, CryptoFeeTierSummary.$stable);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 6) & 7168) | 24960, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSettingsFeeTierStatusComposable4.EnabledState$lambda$2(enabled, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisabledState(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1171388306);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1171388306, i3, -1, "com.robinhood.android.crypto.settings.feeTiers.DisabledState (CryptoSettingsFeeTierStatusComposable.kt:77)");
            }
            BaseLayout(StringResources_androidKt.stringResource(C13000R.string.crypto_setting_fee_tier_status_disabled_subtitle, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C13000R.string.crypto_setting_fee_tier_status_disabled_cta, composerStartRestartGroup, 0), "fee_tier_learn_more", modifier2, null, composerStartRestartGroup, ((i3 << 9) & 7168) | 384, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSettingsFeeTierStatusComposable4.DisabledState$lambda$3(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final CryptoSettingsFeeTierStatusViewState CryptoSettingsFeeTierStatusComposable$lambda$0(SnapshotState4<? extends CryptoSettingsFeeTierStatusViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BaseLayout(final String str, final String str2, String str3, Modifier modifier, Function3<? super Column5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function32;
        final Context context;
        final Navigator navigator;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function3<? super Column5, ? super Composer, ? super Integer, Unit> function33;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        final Function3<? super Column5, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String str4 = str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024250807);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            function32 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2024250807, i3, -1, "com.robinhood.android.crypto.settings.feeTiers.BaseLayout (CryptoSettingsFeeTierStatusComposable.kt:93)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        int i6 = i3 >> 9;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(companion2, "fee_tier_status_section_title");
                        String strStringResource = StringResources_androidKt.stringResource(C13000R.string.crypto_setting_fee_tier_status_title, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        function33 = function32;
                        Modifier modifier5 = modifier4;
                        int i8 = i3;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAutomationTestTag, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, i8 & 14, 0, 8186);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-336492673);
                        if (function33 != null) {
                            function33.invoke(column6, composerStartRestartGroup, Integer.valueOf((i6 & 112) | 6));
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        str4 = str3;
                        Modifier modifierAutomationTestTag2 = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, str4, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), str4);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoSettingsFeeTierStatusComposable4.BaseLayout$lambda$6$lambda$5$lambda$4(navigator, context);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str2, modifierAutomationTestTag2, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i8 & 112) | 24576, 0, 8168);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        function34 = function33;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        function34 = function32;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final String str5 = str4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoSettingsFeeTierStatusComposable4.BaseLayout$lambda$7(str, str2, str5, modifier3, function34, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function32 = function3;
                if ((i3 & 9363) == 9362) {
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    int i62 = i3 >> 9;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierAutomationTestTag3 = AutomationTestTagModifierExt.automationTestTag(companion22, "fee_tier_status_section_title");
                        String strStringResource2 = StringResources_androidKt.stringResource(C13000R.string.crypto_setting_fee_tier_status_title, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i72 = BentoTheme.$stable;
                        function33 = function32;
                        Modifier modifier52 = modifier4;
                        int i82 = i3;
                        BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierAutomationTestTag3, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextS(), composerStartRestartGroup, i82 & 14, 0, 8186);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-336492673);
                        if (function33 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                        str4 = str3;
                        Modifier modifierAutomationTestTag22 = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, str4, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), str4);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoSettingsFeeTierStatusComposable4.BaseLayout$lambda$6$lambda$5$lambda$4(navigator, context);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str2, modifierAutomationTestTag22, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i82 & 112) | 24576, 0, 8168);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            function34 = function33;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function32 = function3;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseLayout$lambda$6$lambda$5$lambda$4(Navigator navigator, Context context) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoFeeTierIntentKey(CryptoFeeTierIntentKey.LaunchType.PUSH, null, 2, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private static final void DisabledStatePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(229195709);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(229195709, i, -1, "com.robinhood.android.crypto.settings.feeTiers.DisabledStatePreview (CryptoSettingsFeeTierStatusComposable.kt:141)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), CryptoSettingsFeeTierStatusComposable.INSTANCE.m12980getLambda$1543527299$feature_crypto_settings_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoSettingsFeeTierStatusComposable4.DisabledStatePreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
