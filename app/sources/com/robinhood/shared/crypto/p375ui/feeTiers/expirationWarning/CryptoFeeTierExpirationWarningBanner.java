package com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBanner;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
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

/* compiled from: CryptoFeeTierExpirationWarningBanner.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\b\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"CryptoFeeTierExpirationWarningBanner", "", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDuxo;", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerDuxo;Landroidx/compose/runtime/Composer;II)V", "bannerComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "lib-crypto-ui_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/ui/feeTiers/expirationWarning/CryptoFeeTierExpirationWarningBannerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoFeeTierExpirationWarningBanner {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeTierExpirationWarningBanner$lambda$1(StringResource stringResource, Modifier modifier, CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo, int i, int i2, Composer composer, int i3) {
        CryptoFeeTierExpirationWarningBanner(stringResource, modifier, cryptoFeeTierExpirationWarningBannerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeTierExpirationWarningBanner(final StringResource stringResource, Modifier modifier, CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo2;
        Composer composer2;
        int i4;
        final Modifier modifier3;
        CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo3;
        EventLogger current;
        CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo4;
        EventLogger eventLogger;
        boolean z;
        Composer composer3;
        final CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1902244421);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoFeeTierExpirationWarningBannerDuxo2 = cryptoFeeTierExpirationWarningBannerDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoFeeTierExpirationWarningBannerDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoFeeTierExpirationWarningBannerDuxo2 = cryptoFeeTierExpirationWarningBannerDuxo;
                }
                i3 |= i6;
            } else {
                cryptoFeeTierExpirationWarningBannerDuxo2 = cryptoFeeTierExpirationWarningBannerDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoFeeTierExpirationWarningBannerDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerKt$CryptoFeeTierExpirationWarningBanner$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerKt$CryptoFeeTierExpirationWarningBanner$$inlined$duxo$1.1
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
                        CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo6 = (CryptoFeeTierExpirationWarningBannerDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        modifier3 = modifier4;
                        cryptoFeeTierExpirationWarningBannerDuxo3 = cryptoFeeTierExpirationWarningBannerDuxo6;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        modifier3 = modifier4;
                        cryptoFeeTierExpirationWarningBannerDuxo3 = cryptoFeeTierExpirationWarningBannerDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    Modifier modifier5 = modifier2;
                    i4 = i3;
                    modifier3 = modifier5;
                    cryptoFeeTierExpirationWarningBannerDuxo3 = cryptoFeeTierExpirationWarningBannerDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1902244421, i4, -1, "com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBanner (CryptoFeeTierExpirationWarningBanner.kt:29)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierExpirationWarningBannerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer4, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                if (stringResource == null && CryptoFeeTierExpirationWarningBanner$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShouldShowBanner()) {
                    cryptoFeeTierExpirationWarningBannerDuxo4 = cryptoFeeTierExpirationWarningBannerDuxo3;
                    eventLogger = current;
                    z = true;
                } else {
                    cryptoFeeTierExpirationWarningBannerDuxo4 = cryptoFeeTierExpirationWarningBannerDuxo3;
                    eventLogger = current;
                    z = false;
                }
                CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo7 = cryptoFeeTierExpirationWarningBannerDuxo4;
                AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null)), (String) null, ComposableLambda3.rememberComposableLambda(622939933, true, new C385971(userInteractionEventDescriptor, modifier3, stringResource, cryptoFeeTierExpirationWarningBannerDuxo7, eventLogger), composer4, 54), composer4, 200064, 18);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoFeeTierExpirationWarningBannerDuxo5 = cryptoFeeTierExpirationWarningBannerDuxo7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cryptoFeeTierExpirationWarningBannerDuxo5 = cryptoFeeTierExpirationWarningBannerDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeTierExpirationWarningBanner.CryptoFeeTierExpirationWarningBanner$lambda$1(stringResource, modifier3, cryptoFeeTierExpirationWarningBannerDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoFeeTierExpirationWarningBannerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer42, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer42.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                if (stringResource == null) {
                    cryptoFeeTierExpirationWarningBannerDuxo4 = cryptoFeeTierExpirationWarningBannerDuxo3;
                    eventLogger = current;
                    z = false;
                    CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo72 = cryptoFeeTierExpirationWarningBannerDuxo4;
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(200, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null)), (String) null, ComposableLambda3.rememberComposableLambda(622939933, true, new C385971(userInteractionEventDescriptor2, modifier3, stringResource, cryptoFeeTierExpirationWarningBannerDuxo72, eventLogger), composer42, 54), composer42, 200064, 18);
                    composer3 = composer42;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoFeeTierExpirationWarningBannerDuxo5 = cryptoFeeTierExpirationWarningBannerDuxo72;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoFeeTierExpirationWarningBanner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerKt$CryptoFeeTierExpirationWarningBanner$1 */
    static final class C385971 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ StringResource $bannerText;
        final /* synthetic */ CryptoFeeTierExpirationWarningBannerDuxo $duxo;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Modifier $modifier;

        C385971(UserInteractionEventDescriptor userInteractionEventDescriptor, Modifier modifier, StringResource stringResource, CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo, EventLogger eventLogger) {
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$modifier = modifier;
            this.$bannerText = stringResource;
            this.$duxo = cryptoFeeTierExpirationWarningBannerDuxo;
            this.$eventLogger = eventLogger;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(622939933, i, -1, "com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBanner.<anonymous> (CryptoFeeTierExpirationWarningBanner.kt:42)");
            }
            Modifier modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(ModifiersKt.autoLogEvents$default(this.$modifier, UserInteractionEventDescriptor.copy$default(this.$eventDescriptor, null, null, null, null, CryptoFeeTierExpirationWarningBanner.bannerComponent(), null, 47, null), true, false, false, false, false, null, 108, null), "fee_increase_warning");
            StringResource stringResource = this.$bannerText;
            composer.startReplaceGroup(1644833358);
            String textAsString = stringResource == null ? null : StringResources6.getTextAsString(stringResource, composer, StringResource.$stable);
            composer.endReplaceGroup();
            if (textAsString == null) {
                textAsString = "";
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            long jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger);
            final CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo = this.$duxo;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final EventLogger eventLogger = this.$eventLogger;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerKt$CryptoFeeTierExpirationWarningBanner$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeTierExpirationWarningBanner.C385971.invoke$lambda$1$lambda$0(cryptoFeeTierExpirationWarningBannerDuxo, userInteractionEventDescriptor, eventLogger);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutomationTestTag, textAsString, null, null, null, (Function0) objRememberedValue, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, composer, 3072, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoFeeTierExpirationWarningBannerDuxo cryptoFeeTierExpirationWarningBannerDuxo, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
            cryptoFeeTierExpirationWarningBannerDuxo.onBannerDismissed();
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, userInteractionEventDescriptor.getScreen(), CryptoFeeTierExpirationWarningBanner.bannerComponent(), null, userInteractionEventDescriptor.getContext(), false, 40, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component bannerComponent() {
        return new Component(Component.ComponentType.INFO_BANNER, "fee_increase_warning", null, 4, null);
    }

    private static final CryptoFeeTierExpirationWarningBannerViewState CryptoFeeTierExpirationWarningBanner$lambda$0(SnapshotState4<CryptoFeeTierExpirationWarningBannerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
